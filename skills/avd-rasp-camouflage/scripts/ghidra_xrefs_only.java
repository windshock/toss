import ghidra.app.script.GhidraScript;
import ghidra.program.model.listing.*;
import ghidra.program.model.address.*;
import ghidra.program.model.symbol.*;
import ghidra.util.task.ConsoleTaskMonitor;
import java.util.*;

// args: sym1[,sym2,...]   -- prints xref sites and containing function entry offsets, NO decompile
public class ghidra_xrefs_only extends GhidraScript {
    long base;
    String h(Address a){ return Long.toHexString(a.getOffset()-base); }
    public void run() throws Exception {
        base = currentProgram.getImageBase().getOffset();
        String[] syms = getScriptArgs()[0].split(",");
        SymbolTable st = currentProgram.getSymbolTable();
        ReferenceManager rm = currentProgram.getReferenceManager();
        for (String sym : syms) {
            List<Address> targets = new ArrayList<>();
            for (SymbolIterator it = st.getSymbols(sym); it.hasNext();) {
                Symbol s = it.next(); targets.add(s.getAddress());
                println("SYM "+sym+" @ "+h(s.getAddress())+" type="+s.getSymbolType());
            }
            // also thunk functions named sym
            LinkedHashSet<String> callerOffs = new LinkedHashSet<>();
            for (Address t : targets) {
                for (ReferenceIterator ri = rm.getReferencesTo(t); ri.hasNext();) {
                    Reference r = ri.next();
                    Function cf = getFunctionContaining(r.getFromAddress());
                    String co = cf==null?"?":h(cf.getEntryPoint());
                    println("XREF "+sym+" site="+h(r.getFromAddress())+" caller="+co+" ("+r.getReferenceType()+")");
                    if(cf!=null) callerOffs.add(co);
                }
                Function tf = getFunctionAt(t);
                if (tf!=null && tf.isThunk()) for (Function c: tf.getCallingFunctions(new ConsoleTaskMonitor())) callerOffs.add(h(c.getEntryPoint()));
            }
            println("CALLERS "+sym+" = "+callerOffs);
        }
        println("XDONE");
    }
}
