//@category Analysis
// 30차: libea56 IndirectBranch edge(412)를 xref/코멘트로 주입 + 함수별 밀도 출력
import ghidra.app.script.GhidraScript;
import ghidra.program.model.address.Address;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.CodeUnit;
import ghidra.program.model.symbol.RefType;
import ghidra.program.model.symbol.SourceType;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class InjectIndirectEdges extends GhidraScript {
    @Override
    public void run() throws Exception {
        String csv = getScriptArgs().length > 0 ? getScriptArgs()[0] : "/tmp/edges.csv";
        BufferedReader br = new BufferedReader(new FileReader(csv));
        String line; int n = 0, fail = 0;
        Map<String, Integer> density = new TreeMap<>();
        while ((line = br.readLine()) != null) {
            String[] p = line.split(",");
            if (p.length < 3) continue;
            try {
                Address from = toAddr(Long.parseLong(p[0], 16));
                Address ent  = toAddr(Long.parseLong(p[1], 16));
                Address to   = toAddr(Long.parseLong(p[2], 16));
                currentProgram.getReferenceManager().addMemoryReference(
                    from, to, RefType.COMPUTED_JUMP, SourceType.IMPORTED, 0);
                // 데이터 테이블 엔트리에도 reference (ent → to)
                currentProgram.getReferenceManager().addMemoryReference(
                    ent, to, RefType.DATA, SourceType.IMPORTED, 0);
                CodeUnit cu = currentProgram.getListing().getCodeUnitAt(from);
                if (cu != null) {
                    String prev = cu.getComment(CodeUnit.EOL_COMMENT);
                    cu.setComment(CodeUnit.EOL_COMMENT,
                        (prev == null ? "" : prev + " ") + "IB->" + p[2]);
                }
                Function f = getFunctionContaining(from);
                if (f != null)
                    density.merge(f.getName() + "@" + f.getEntryPoint(), 1, Integer::sum);
                n++;
            } catch (Exception e) { fail++; }
        }
        br.close();
        println("injected=" + n + " fail=" + fail);
        println("== 함수별 IB 타깃 밀도 (상위 30) ==");
        density.entrySet().stream()
            .sorted((a,b) -> b.getValue() - a.getValue())
            .limit(30)
            .forEach(en -> println(String.format("%4d  %s", en.getValue(), en.getKey())));
    }
}
