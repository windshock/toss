//@category Analysis
import ghidra.app.script.GhidraScript;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.FunctionIterator;
import ghidra.program.model.listing.Parameter;
import java.io.PrintWriter;

public class DumpFunctions extends GhidraScript {
    @Override
    public void run() throws Exception {
        PrintWriter pw = new PrintWriter("/tmp/functions.csv");
        FunctionIterator it = currentProgram.getFunctionManager().getFunctions(true);
        int n = 0;
        while (it.hasNext()) {
            Function f = it.next();
            Parameter[] ps = f.getParameters();
            StringBuilder sig = new StringBuilder();
            for (Parameter p : ps) sig.append(p.getDataType().getName()).append(";");
            pw.println(f.getEntryPoint() + "," + f.getName() + "," + ps.length + "," + sig);
            n++;
        }
        pw.close();
        println("functions=" + n);
    }
}
