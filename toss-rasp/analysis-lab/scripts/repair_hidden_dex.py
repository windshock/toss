#!/usr/bin/env python3
"""Repair the DexGuard-scrubbed hidden DEX header captured in §98/§108.

The in-memory image has valid id tables from +0x38 onward, but the standard
DEX header prefix and map_list size are scrubbed.  This reconstructs a normal
DEX file suitable for jadx/baksmali without modifying the original dump.
"""
from __future__ import annotations

import hashlib
import json
import struct
import zlib
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
SRC = ROOT / "artifacts/android/toss_hidden_dex.bin"
OUT = ROOT / "artifacts/android/toss_hidden_fixed.dex"
META = ROOT / "artifacts/android/toss_hidden_fixed.json"


def u32(buf: bytes | bytearray, off: int) -> int:
    return struct.unpack_from("<I", buf, off)[0]


def main() -> None:
    src = SRC.read_bytes()
    fields = {
        name: u32(src, 0x38 + i * 4)
        for i, name in enumerate(
            [
                "string_ids_size",
                "string_ids_off",
                "type_ids_size",
                "type_ids_off",
                "proto_ids_size",
                "proto_ids_off",
                "field_ids_size",
                "field_ids_off",
                "method_ids_size",
                "method_ids_off",
                "class_defs_size",
                "class_defs_off",
                "data_size",
                "data_off",
            ]
        )
    }
    file_size = fields["data_off"] + fields["data_size"]

    # The map_list itself is intact at the very end.  Only its size field is
    # zeroed.  Locate it by the first map item (TYPE_STRING_ID_ITEM).
    first_item = (
        b"\x01\x00\x00\x00"
        + struct.pack("<I", fields["string_ids_size"])
        + struct.pack("<I", fields["string_ids_off"])
    )
    hit = src.find(first_item, fields["data_off"])
    if hit < 4:
        raise SystemExit("map_list not found")
    map_off = hit - 4

    # Count plausible map entries until TYPE_HEADER_ITEM (0x1000), which is
    # the final entry in this image.
    map_count = 0
    while True:
        e = map_off + 4 + map_count * 12
        typ, _unused, size, off = struct.unpack_from("<HHII", src, e)
        map_count += 1
        if typ == 0x1000:
            break
        if map_count > 64 or size == 0 or off >= len(src):
            raise SystemExit("bad map_list while counting")

    out = bytearray(src[:file_size])
    out[0:8] = b"dex\n035\0"
    struct.pack_into("<I", out, 0x20, file_size)
    struct.pack_into("<I", out, 0x24, 0x70)
    struct.pack_into("<I", out, 0x28, 0x12345678)
    struct.pack_into("<I", out, 0x2C, 0)
    struct.pack_into("<I", out, 0x30, 0)
    struct.pack_into("<I", out, 0x34, map_off)
    struct.pack_into("<I", out, map_off, map_count)

    sig = hashlib.sha1(out[32:]).digest()
    out[12:32] = sig
    checksum = zlib.adler32(out[12:]) & 0xFFFFFFFF
    struct.pack_into("<I", out, 8, checksum)

    OUT.write_bytes(out)
    meta = {
        "source": str(SRC),
        "output": str(OUT),
        "file_size": file_size,
        "file_size_hex": hex(file_size),
        "map_off": map_off,
        "map_off_hex": hex(map_off),
        "map_count": map_count,
        "sha1_signature": sig.hex(),
        "adler32": hex(checksum),
        "sha256": hashlib.sha256(out).hexdigest(),
        "fields": fields,
        "note": "Recovered DEX header for local decompilation; original dump unchanged.",
    }
    META.write_text(json.dumps(meta, indent=2) + "\n")
    print(json.dumps(meta, indent=2))


if __name__ == "__main__":
    main()
