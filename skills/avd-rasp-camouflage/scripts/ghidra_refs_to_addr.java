import ghidra.app.script.GhidraScript;
import ghidra.program.model.listing.*;
import ghidra.program.model.address.*;
import ghidra.program.model.symbol.*;
import java.util.*;

// args: off1[,off2,...] (hex, image-relative) -- list references to those data addrs + containing funcs
public class ghidra_refs_to_addr extends GhidraScript {
    long base;
    String h(Address a){ return Long.toHexString(a.getOffset()-base); }
    public void run() throws Exception {
        base = currentProgram.getImageBase().getOffset();
        AddressSpace as = currentProgram.getAddressFactory().getDefaultAddressSpace();
        ReferenceManager rm = currentProgram.getReferenceManager();
        for (String o : getScriptArgs()[0].split(",")) {
            long off = Long.parseLong(o.trim(), 16);
            Address t = as.getAddress(base+off);
            println("=== TARGET "+o+" ("+t+") ===");
            LinkedHashSet<String> callers = new LinkedHashSet<>();
            int n=0;
            for (ReferenceIterator ri = rm.getReferencesTo(t); ri.hasNext();){
                Reference r = ri.next(); n++;
                Function cf = getFunctionContaining(r.getFromAddress());
                String co = cf==null?"?":h(cf.getEntryPoint());
                println("  REF site="+h(r.getFromAddress())+" caller="+co+" ("+r.getReferenceType()+")");
                if(cf!=null) callers.add(co);
            }
            println("  nrefs="+n+" CALLERS="+callers);
        }
        println("RDONE");
    }
}
