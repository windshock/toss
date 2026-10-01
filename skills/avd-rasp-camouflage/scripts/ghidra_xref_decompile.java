import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.*;
import ghidra.program.model.listing.*;
import ghidra.program.model.address.*;
import ghidra.program.model.symbol.*;
import ghidra.util.task.ConsoleTaskMonitor;
import java.io.*;
import java.util.*;

// args: <symbolName> <outDir>
// finds all references to the named symbol (import/thunk/func) and decompiles each caller
public class ghidra_xref_decompile extends GhidraScript {
    long base;
    String hoff(Address a){ return Long.toHexString(a.getOffset()-base); }

    void dec(Function f, String outPath) throws Exception {
        DecompInterface di = new DecompInterface();
        di.setOptions(new DecompileOptions());
        di.openProgram(currentProgram);
        DecompileResults res = di.decompileFunction(f, 600, new ConsoleTaskMonitor());
        PrintWriter pw = new PrintWriter(new FileWriter(outPath));
        pw.println("// entry_off=" + hoff(f.getEntryPoint()) + " name=" + f.getName() + " body=" + f.getBody());
        if (res != null && res.getDecompiledFunction() != null) pw.println(res.getDecompiledFunction().getC());
        else pw.println("// DECOMPILE FAILED: " + (res==null?"null":res.getErrorMessage()));
        pw.close();
    }

    public void run() throws Exception {
        String[] args = getScriptArgs();
        String sym = args[0];
        String outDir = args[1];
        base = currentProgram.getImageBase().getOffset();
        new File(outDir).mkdirs();

        SymbolTable st = currentProgram.getSymbolTable();
        Set<Address> targets = new HashSet<>();
        SymbolIterator it = st.getSymbols(sym);
        while (it.hasNext()) {
            Symbol s = it.next();
            targets.add(s.getAddress());
            println("SYM " + s.getName() + " @ " + hoff(s.getAddress()) + " type=" + s.getSymbolType() + " src=" + s.getSource());
        }
        if (targets.isEmpty()) { println("NO SYMBOL " + sym); return; }

        // gather referencing addresses -> containing functions
        Set<Function> callers = new LinkedHashSet<>();
        ReferenceManager rm = currentProgram.getReferenceManager();
        for (Address t : targets) {
            ReferenceIterator ri = rm.getReferencesTo(t);
            while (ri.hasNext()) {
                Reference r = ri.next();
                Address from = r.getFromAddress();
                Function cf = getFunctionContaining(from);
                println("XREF from " + hoff(from) + " -> " + hoff(t) + " (" + r.getReferenceType() + ") caller=" + (cf==null?"null":hoff(cf.getEntryPoint())));
                if (cf != null) callers.add(cf);
                else {
                    // thunk indirection: the target may be a thunk pointed to by another thunk; follow refs to 'from's function too
                    Function tf = getFunctionAt(from);
                    if (tf!=null) callers.add(tf);
                }
            }
        }
        // Also: if target is a thunk function, find callers of the thunk function
        for (Address t : targets) {
            Function tf = getFunctionAt(t);
            if (tf != null && tf.isThunk()) {
                for (Function c : tf.getCallingFunctions(new ConsoleTaskMonitor())) callers.add(c);
            }
        }
        println("TOTAL callers=" + callers.size());
        int i=0;
        for (Function c : callers) {
            String out = outDir + "/caller_" + hoff(c.getEntryPoint()) + ".c";
            dec(c, out);
            println("WROTE " + out);
            i++;
        }
        println("DONE " + i);
    }
}
