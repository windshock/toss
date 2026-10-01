package okio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.Sequence;
import o.TTBaseVideoActivity;
import o.TTBaseVideoActivity3;
import o.TTFullScreenVideoActivity3;
import o.TTHistoryActivity41;
import o.TTHistoryActivity42;
import o.ensureCausesIsMutable;
import okio.ForwardingFileSystem$;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ForwardingFileSystem extends FileSystem {
    private final FileSystem onExtraCallback;

    public TTFullScreenVideoActivity3 onPathParameter(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return tTFullScreenVideoActivity3;
    }

    public TTFullScreenVideoActivity3 onPathResult(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull String str) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(str, "");
        return tTFullScreenVideoActivity3;
    }

    public ForwardingFileSystem(@NotNull FileSystem fileSystem) {
        Intrinsics.checkNotNullParameter(fileSystem, "");
        this.onExtraCallback = fileSystem;
    }

    public final FileSystem delegate() {
        return this.onExtraCallback;
    }

    @Override // okio.FileSystem
    public TTFullScreenVideoActivity3 canonicalize(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return onPathResult(this.onExtraCallback.canonicalize(onPathParameter(tTFullScreenVideoActivity3, "canonicalize", "path")), "canonicalize");
    }

    @Override // okio.FileSystem
    public TTBaseVideoActivity metadataOrNull(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        TTBaseVideoActivity tTBaseVideoActivityMetadataOrNull = this.onExtraCallback.metadataOrNull(onPathParameter(tTFullScreenVideoActivity3, "metadataOrNull", "path"));
        if (tTBaseVideoActivityMetadataOrNull == null) {
            return null;
        }
        if (tTBaseVideoActivityMetadataOrNull.onExtraCallbackWithResult() == null) {
            return tTBaseVideoActivityMetadataOrNull;
        }
        return tTBaseVideoActivityMetadataOrNull.onExtraCallbackWithResult((251 & 1) != 0 ? tTBaseVideoActivityMetadataOrNull.IAuthTabCallback : false, (251 & 2) != 0 ? tTBaseVideoActivityMetadataOrNull.onExtraCallback : false, (251 & 4) != 0 ? tTBaseVideoActivityMetadataOrNull.IAuthTabCallbackStub : onPathResult(tTBaseVideoActivityMetadataOrNull.onExtraCallbackWithResult(), "metadataOrNull"), (251 & 8) != 0 ? tTBaseVideoActivityMetadataOrNull.onTransact : null, (251 & 16) != 0 ? tTBaseVideoActivityMetadataOrNull.onNavigationEvent : null, (251 & 32) != 0 ? tTBaseVideoActivityMetadataOrNull.asInterface : null, (251 & 64) != 0 ? tTBaseVideoActivityMetadataOrNull.onWarmupCompleted : null, (251 & 128) != 0 ? tTBaseVideoActivityMetadataOrNull.onExtraCallbackWithResult : null);
    }

    @Override // okio.FileSystem
    public List<TTFullScreenVideoActivity3> list(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        List<TTFullScreenVideoActivity3> list = this.onExtraCallback.list(onPathParameter(tTFullScreenVideoActivity3, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((TTFullScreenVideoActivity3) it.next(), "list"));
        }
        CollectionsKt__MutableCollectionsJVMKt.sort(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    public List<TTFullScreenVideoActivity3> listOrNull(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        List<TTFullScreenVideoActivity3> listListOrNull = this.onExtraCallback.listOrNull(onPathParameter(tTFullScreenVideoActivity3, "listOrNull", "dir"));
        if (listListOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listListOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((TTFullScreenVideoActivity3) it.next(), "listOrNull"));
        }
        CollectionsKt__MutableCollectionsJVMKt.sort(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    public Sequence<TTFullScreenVideoActivity3> listRecursively(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return ensureCausesIsMutable.extraCallback(this.onExtraCallback.listRecursively(onPathParameter(tTFullScreenVideoActivity3, "listRecursively", "dir"), z), new ForwardingFileSystem$.ExternalSyntheticLambda0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TTFullScreenVideoActivity3 listRecursively$lambda$0(ForwardingFileSystem forwardingFileSystem, TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return forwardingFileSystem.onPathResult(tTFullScreenVideoActivity3, "listRecursively");
    }

    @Override // okio.FileSystem
    public TTBaseVideoActivity3 openReadOnly(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return this.onExtraCallback.openReadOnly(onPathParameter(tTFullScreenVideoActivity3, "openReadOnly", "file"));
    }

    @Override // okio.FileSystem
    public TTBaseVideoActivity3 openReadWrite(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return this.onExtraCallback.openReadWrite(onPathParameter(tTFullScreenVideoActivity3, "openReadWrite", "file"), z, z2);
    }

    @Override // okio.FileSystem
    public TTHistoryActivity42 source(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return this.onExtraCallback.source(onPathParameter(tTFullScreenVideoActivity3, "source", "file"));
    }

    @Override // okio.FileSystem
    public TTHistoryActivity41 sink(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return this.onExtraCallback.sink(onPathParameter(tTFullScreenVideoActivity3, "sink", "file"), z);
    }

    @Override // okio.FileSystem
    public TTHistoryActivity41 appendingSink(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return this.onExtraCallback.appendingSink(onPathParameter(tTFullScreenVideoActivity3, "appendingSink", "file"), z);
    }

    @Override // okio.FileSystem
    public void createDirectory(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        this.onExtraCallback.createDirectory(onPathParameter(tTFullScreenVideoActivity3, "createDirectory", "dir"), z);
    }

    @Override // okio.FileSystem
    public void atomicMove(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity32) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity32, "");
        this.onExtraCallback.atomicMove(onPathParameter(tTFullScreenVideoActivity3, "atomicMove", "source"), onPathParameter(tTFullScreenVideoActivity32, "atomicMove", "target"));
    }

    @Override // okio.FileSystem
    public void delete(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        this.onExtraCallback.delete(onPathParameter(tTFullScreenVideoActivity3, "delete", "path"), z);
    }

    @Override // okio.FileSystem
    public void createSymlink(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity32) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity32, "");
        this.onExtraCallback.createSymlink(onPathParameter(tTFullScreenVideoActivity3, "createSymlink", "source"), onPathParameter(tTFullScreenVideoActivity32, "createSymlink", "target"));
    }

    @Override // okio.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.onExtraCallback.close();
    }

    public String toString() {
        return Reflection.getOrCreateKotlinClass(getClass()).getSimpleName() + '(' + this.onExtraCallback + ')';
    }
}
