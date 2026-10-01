import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.*;
import ghidra.program.model.listing.*;
import ghidra.program.model.address.*;
import ghidra.util.task.ConsoleTaskMonitor;
import java.io.*;
import java.util.*;

public class ghidra_decompile_at extends GhidraScript {
    Function dec(Function f, String outPath) throws Exception {
        DecompInterface di = new DecompInterface();
        di.setOptions(new DecompileOptions());
        di.openProgram(currentProgram);
        DecompileResults res = di.decompileFunction(f, 600, new ConsoleTaskMonitor());
        PrintWriter pw = new PrintWriter(new FileWriter(outPath));
        pw.println("// entry_off=" + Long.toHexString(f.getEntryPoint().getOffset()-currentProgram.getImageBase().getOffset()) + " name=" + f.getName() + " body=" + f.getBody());
        if (res != null && res.getDecompiledFunction() != null) pw.println(res.getDecompiledFunction().getC());
        else pw.println("// DECOMPILE FAILED: " + (res==null?"null":res.getErrorMessage()));
        pw.close();
        println("WROTE " + outPath + " entry_off=" + Long.toHexString(f.getEntryPoint().getOffset()-currentProgram.getImageBase().getOffset()));
        return f;
    }

    public void run() throws Exception {
        String[] args = getScriptArgs();
        long off = Long.parseLong(args[0], 16);
        String outPath = args[1];
        long base = currentProgram.getImageBase().getOffset();
        AddressSpace as = currentProgram.getAddressFactory().getDefaultAddressSpace();
        Address addr = as.getAddress(base + off);
        Function f = getFunctionContaining(addr);
        if (f != null) { dec(f, outPath); return; }
        Function fb = getFunctionBefore(addr);
        println("containing=null; before=" + (fb==null?"null":Long.toHexString(fb.getEntryPoint().getOffset()-base)));
        // 여전히 식별 실패면 0xb02c4 이전의 가장 가까운 함수 시작을 직접 만든다:
        // 앞쪽 4KB 내 prologue(stp x29,x30 / sub sp) 탐색은 생략하고 before 함수 사용
        if (fb != null) dec(fb, outPath);
    }
}
