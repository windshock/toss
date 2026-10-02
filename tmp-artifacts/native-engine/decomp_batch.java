import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.*;
import ghidra.program.model.listing.*;
import ghidra.program.model.address.*;
import ghidra.util.task.ConsoleTaskMonitor;
import java.io.*;
import java.util.*;

public class decomp_batch extends GhidraScript {
    public void run() throws Exception {
        String[] args = getScriptArgs();
        String listPath = args[0];   // 16진수 오프셋 목록(줄바꿈)
        String outDir = args[1];
        new File(outDir).mkdirs();
        long base = currentProgram.getImageBase().getOffset();
        AddressSpace as = currentProgram.getAddressFactory().getDefaultAddressSpace();
        FunctionManager fm = currentProgram.getFunctionManager();
        DecompInterface di = new DecompInterface();
        DecompileOptions opts = new DecompileOptions();
        di.setOptions(opts);
        di.openProgram(currentProgram);
        BufferedReader br = new BufferedReader(new FileReader(listPath));
        String line;
        int n=0, ok=0, tramp=0, fail=0;
        PrintWriter summary = new PrintWriter(new FileWriter(outDir + "/_summary.txt"));
        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;
            long off = Long.parseLong(line, 16);
            n++;
            Address addr = as.getAddress(base + off);
            String out = String.format("%s/h_%06x.c", outDir, off);
            try {
                if (!currentProgram.getMemory().contains(addr)) { summary.println(off + " BADADDR"); fail++; continue; }
                disassemble(addr);
                Function f = fm.getFunctionContaining(addr);
                if (f == null) f = createFunction(addr, "H" + Long.toHexString(off));
                if (f == null) { summary.println(off + " CREATEFAIL"); fail++; continue; }
                DecompileResults res = di.decompileFunction(f, 120, new ConsoleTaskMonitor());
                String c = (res != null && res.getDecompiledFunction() != null) ? res.getDecompiledFunction().getC() : null;
                PrintWriter pw = new PrintWriter(new FileWriter(out));
                pw.println("// entry=0x" + Long.toHexString(off));
                if (c != null) {
                    pw.println(c);
                    if (c.length() < 400) tramp++; else ok++;
                } else { pw.println("// FAIL"); fail++; }
                pw.close();
                summary.println(Long.toHexString(off) + " " + (c==null?"FAIL":(c.length()<400?"TRAMP":"OK"+" len="+c.length())));
            } catch (Exception e) { summary.println(off + " EXC " + e.getMessage()); fail++; }
            if (n % 200 == 0) println("progress " + n);
        }
        summary.close();
        br.close();
        println("BATCH DONE n=" + n + " ok=" + ok + " tramp=" + tramp + " fail=" + fail);
    }
}
