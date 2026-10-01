package kotlin.io.path;

import java.nio.file.Path;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import o.addUnreadableElfFiles;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class PathsKt__PathRecursiveFunctionsKt$$ExternalSyntheticLambda13 implements Function1 {
    public final /* synthetic */ ArrayList f$0;
    public final /* synthetic */ getBacktraceNote f$1;
    public final /* synthetic */ Path f$2;
    public final /* synthetic */ Path f$3;
    public final /* synthetic */ Path f$4;
    public final /* synthetic */ getBacktraceNote f$5;

    public /* synthetic */ PathsKt__PathRecursiveFunctionsKt$$ExternalSyntheticLambda13(ArrayList arrayList, getBacktraceNote getbacktracenote, Path path, Path path2, Path path3, getBacktraceNote getbacktracenote2) {
        this.f$0 = arrayList;
        this.f$1 = getbacktracenote;
        this.f$2 = path;
        this.f$3 = path2;
        this.f$4 = path3;
        this.f$5 = getbacktracenote2;
    }

    public final Object invoke(Object obj) {
        return addUnreadableElfFiles.ss_(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (FileVisitorBuilder) obj);
    }
}
