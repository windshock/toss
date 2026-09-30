#!/usr/bin/env python3
"""Read-only AArch64 triage for result=191 and direct syscall candidates."""

import argparse
import re
import struct
from pathlib import Path

from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM


def text_section(blob):
    if blob[:6] != b"\x7fELF\x02\x01":
        raise ValueError("expected little-endian ELF64")
    shoff = struct.unpack_from("<Q", blob, 0x28)[0]
    shentsize, shnum, shstrndx = struct.unpack_from("<HHH", blob, 0x3A)
    headers = [struct.unpack_from("<IIQQQQIIQQ", blob, shoff + i * shentsize)
               for i in range(shnum)]
    strings_header = headers[shstrndx]
    string_table = blob[strings_header[4]:strings_header[4] + strings_header[5]]
    for header in headers:
        name_end = string_table.find(b"\0", header[0])
        if string_table[header[0]:name_end] == b".text":
            return header[3], header[4], header[5]  # vaddr, offset, size
    raise ValueError(".text section missing")


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("elf", type=Path)
    parser.add_argument("--refs", nargs=2, metavar=("START_HEX", "END_HEX"))
    args = parser.parse_args()
    blob = args.elf.read_bytes()
    text_vaddr, text_offset, text_size = text_section(blob)
    md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
    insns = list(md.disasm(blob[text_offset:text_offset + text_size], text_vaddr))
    print(f"file={args.elf} text=0x{text_vaddr:x}+0x{text_size:x} decoded={len(insns)}")

    svc_sites = [i for i, insn in enumerate(insns) if insn.mnemonic == "svc"]
    print(f"svc_word_count={len(svc_sites)} (linear sweep; some words may be data or unreachable)")
    simple_write_sites = []
    for i in svc_sites:
        insn = insns[i]
        previous = insns[max(0, i - 18):i]
        x8_writes = [p for p in previous if p.op_str.startswith(("x8,", "w8,"))]
        nearest = x8_writes[-1] if x8_writes else None
        if nearest and nearest.mnemonic == "mov" and nearest.op_str in ("x8, #0x40", "w8, #0x40"):
            simple_write_sites.append((insn, nearest))

    print(f"simple_write_syscall_sites={len(simple_write_sites)}")
    for insn, nearest in simple_write_sites:
        print(f"SVC 0x{insn.address:x} nearest_x8=0x{nearest.address:x} {nearest.mnemonic} {nearest.op_str}")

    print("immediate_0xbf_sites:")
    for insn in insns:
        if insn.mnemonic in ("mov", "movz", "movn", "cmp", "cmn", "add", "sub", "orr", "and"):
            if re.search(r"(?:^|, )#(?:0xbf|191)(?:$|,)", insn.op_str):
                print(f"0x{insn.address:x} {insn.mnemonic} {insn.op_str}")

    if args.refs:
        start, end = (int(value, 16) for value in args.refs)
        print(f"adrp_add_refs_in_0x{start:x}..0x{end:x}:")
        pages = {}
        for insn in insns:
            if insn.mnemonic == "adrp":
                match = re.fullmatch(r"(x\d+), #0x([0-9a-f]+)", insn.op_str)
                if match:
                    pages[match.group(1)] = (int(match.group(2), 16), insn.address)
            elif insn.mnemonic == "add":
                match = re.fullmatch(r"(x\d+), (x\d+), #0x([0-9a-f]+)", insn.op_str)
                if match and match.group(2) in pages:
                    page, adrp_site = pages[match.group(2)]
                    target = page + int(match.group(3), 16)
                    if start <= target < end and insn.address - adrp_site <= 0x80:
                        print(f"target=0x{target:x} adrp=0x{adrp_site:x} add=0x{insn.address:x}")


if __name__ == "__main__":
    main()
