import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.*;
import ghidra.program.model.listing.*;
import ghidra.program.model.address.*;
import ghidra.program.model.symbol.*;
import ghidra.util.task.ConsoleTaskMonitor;
import java.io.*;

public class decomp_containing extends GhidraScript {
    public void run() throws Exception {
        String[] args = getScriptArgs();
        long off = Long.parseLong(args[0], 16);
        String outPath = args[1];
        long base = currentProgram.getImageBase().getOffset();
        Address addr = currentProgram.getAddressFactory().getDefaultAddressSpace().getAddress(base + off);
        FunctionManager fm = currentProgram.getFunctionManager();
        Function f = fm.getFunctionContaining(addr);
        PrintWriter pw = new PrintWriter(new FileWriter(outPath));
        if (f == null) { pw.println("// no containing function for off=" + Long.toHexString(off)); pw.close(); println("NOFUNC"); return; }
        long entryOff = f.getEntryPoint().getOffset() - base;
        pw.println("// query_off=" + Long.toHexString(off) + " entry_off=" + Long.toHexString(entryOff) + " body=" + f.getBody());
        DecompInterface di = new DecompInterface();
        di.setOptions(new DecompileOptions());
        di.openProgram(currentProgram);
        DecompileResults res = di.decompileFunction(f, 900, new ConsoleTaskMonitor());
        if (res != null && res.getDecompiledFunction() != null) pw.println(res.getDecompiledFunction().getC());
        else pw.println("// DECOMPILE FAILED: " + (res==null?"null":res.getErrorMessage()));
        pw.close();
        println("WROTE " + outPath + " entry_off=" + Long.toHexString(entryOff));
    }
}
