import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.*;
import ghidra.program.model.listing.*;
import ghidra.program.model.address.*;
import ghidra.util.task.ConsoleTaskMonitor;
import java.io.*;
import java.util.*;

// 37차 — 주소(ELF vaddr hex) 목록을 인자로 받아 포함 함수 전수 디컴파일.
// 인자: <addr1> <addr2> ... <outdir>   → outdir/F_<entryoff>.c
// toss5 이미지 베이스는 0x100000(ELF vaddr + 0x100000 = Ghidra 주소, C8 확정).
public class DecAtExact extends GhidraScript {
    void dec(Function f, String outPath) throws Exception {
        DecompInterface di = new DecompInterface();
        di.setOptions(new DecompileOptions());
        di.openProgram(currentProgram);
        DecompileResults res = di.decompileFunction(f, 600, new ConsoleTaskMonitor());
        PrintWriter pw = new PrintWriter(new FileWriter(outPath));
        long base = currentProgram.getImageBase().getOffset();
        pw.println("// entry_off=0x" + Long.toHexString(f.getEntryPoint().getOffset()-base) + " name=" + f.getName());
        if (res != null && res.getDecompiledFunction() != null) pw.println(res.getDecompiledFunction().getC());
        else pw.println("// DECOMPILE FAILED: " + (res==null?"null":res.getErrorMessage()));
        pw.close();
        println("WROTE " + outPath + " entry_off=0x" + Long.toHexString(f.getEntryPoint().getOffset()-base));
    }
    public void run() throws Exception {
        String[] args = getScriptArgs();
        String outdir = args[args.length-1];
        new File(outdir).mkdirs();
        long base = currentProgram.getImageBase().getOffset();
        AddressSpace as = currentProgram.getAddressFactory().getDefaultAddressSpace();
        for (int k = 0; k < args.length-1; k++) {
            long off = Long.parseLong(args[k], 16);
            Address addr = as.getAddress(base + off);
            Function f = getFunctionContaining(addr);
            if (f != null) { dec(f, outdir + "/F_" + Long.toHexString(f.getEntryPoint().getOffset()-base) + ".c"); continue; }
            println("NOFUNC at 0x" + Long.toHexString(off));
        }
    }
}
