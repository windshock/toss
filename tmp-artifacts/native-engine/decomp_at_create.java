import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.*;
import ghidra.program.model.listing.*;
import ghidra.program.model.address.*;
import ghidra.util.task.ConsoleTaskMonitor;
import java.io.*;

public class decomp_at_create extends GhidraScript {
    public void run() throws Exception {
        String[] args = getScriptArgs();
        long off = Long.parseLong(args[0], 16);
        String outPath = args[1];
        long base = currentProgram.getImageBase().getOffset();
        Address addr = currentProgram.getAddressFactory().getDefaultAddressSpace().getAddress(base + off);
        if (!currentProgram.getMemory().contains(addr)) { println("BADADDR"); return; }
        disassemble(addr);
        FunctionManager fm = currentProgram.getFunctionManager();
        Function f = fm.getFunctionContaining(addr);
        if (f == null) {
            f = createFunction(addr, "HND_" + Long.toHexString(off));
        }
        PrintWriter pw = new PrintWriter(new FileWriter(outPath));
        if (f == null) { pw.println("// create failed at " + Long.toHexString(off)); pw.close(); println("CREATEFAIL"); return; }
        long entryOff = f.getEntryPoint().getOffset() - base;
        pw.println("// req=0x" + Long.toHexString(off) + " entry=0x" + Long.toHexString(entryOff));
        DecompInterface di = new DecompInterface();
        di.setOptions(new DecompileOptions());
        di.openProgram(currentProgram);
        DecompileResults res = di.decompileFunction(f, 900, new ConsoleTaskMonitor());
        if (res != null && res.getDecompiledFunction() != null) pw.println(res.getDecompiledFunction().getC());
        else pw.println("// DECOMP FAIL: " + (res==null?"null":res.getErrorMessage()));
        pw.close();
        println("WROTE " + outPath + " entry=0x" + Long.toHexString(entryOff));
    }
}
