package o;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import o.TTFullScreenVideoActivity3;
import okio.FileSystem;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class TTCeilingLandingPageActivity7 extends FileSystem {
    @Override // okio.FileSystem
    public TTFullScreenVideoActivity3 canonicalize(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        File canonicalFile = tTFullScreenVideoActivity3.asBinder().getCanonicalFile();
        if (!canonicalFile.exists()) {
            throw new FileNotFoundException("no such file");
        }
        TTFullScreenVideoActivity3.onExtraCallback onextracallback = TTFullScreenVideoActivity3.Companion;
        Intrinsics.checkNotNull(canonicalFile);
        return TTFullScreenVideoActivity3.onExtraCallback.onNavigationEvent(onextracallback, canonicalFile, false, 1, null);
    }

    @Override // okio.FileSystem
    public TTBaseVideoActivity metadataOrNull(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        File fileAsBinder = tTFullScreenVideoActivity3.asBinder();
        boolean zIsFile = fileAsBinder.isFile();
        boolean zIsDirectory = fileAsBinder.isDirectory();
        long jLastModified = fileAsBinder.lastModified();
        long length = fileAsBinder.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || fileAsBinder.exists()) {
            return new TTBaseVideoActivity(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // okio.FileSystem
    public List<TTFullScreenVideoActivity3> list(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        List<TTFullScreenVideoActivity3> listOnWarmupCompleted = onWarmupCompleted(tTFullScreenVideoActivity3, true);
        Intrinsics.checkNotNull(listOnWarmupCompleted);
        return listOnWarmupCompleted;
    }

    @Override // okio.FileSystem
    public List<TTFullScreenVideoActivity3> listOrNull(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return onWarmupCompleted(tTFullScreenVideoActivity3, false);
    }

    private final List<TTFullScreenVideoActivity3> onWarmupCompleted(TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        File fileAsBinder = tTFullScreenVideoActivity3.asBinder();
        String[] list = fileAsBinder.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                Intrinsics.checkNotNull(str);
                arrayList.add(tTFullScreenVideoActivity3.onWarmupCompleted(str));
            }
            CollectionsKt__MutableCollectionsJVMKt.sort(arrayList);
            return arrayList;
        }
        if (!z) {
            return null;
        }
        if (fileAsBinder.exists()) {
            throw new IOException("failed to list " + tTFullScreenVideoActivity3);
        }
        throw new FileNotFoundException("no such file: " + tTFullScreenVideoActivity3);
    }

    @Override // okio.FileSystem
    public TTBaseVideoActivity3 openReadOnly(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return new TTCeilingLandingPageActivity3(false, new RandomAccessFile(tTFullScreenVideoActivity3.asBinder(), "r"));
    }

    @Override // okio.FileSystem
    public TTBaseVideoActivity3 openReadWrite(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        if (z && z2) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        if (z) {
            onWarmupCompleted(tTFullScreenVideoActivity3);
        }
        if (z2) {
            onExtraCallbackWithResult(tTFullScreenVideoActivity3);
        }
        return new TTCeilingLandingPageActivity3(true, new RandomAccessFile(tTFullScreenVideoActivity3.asBinder(), "rw"));
    }

    @Override // okio.FileSystem
    public TTHistoryActivity42 source(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return TTCeilingLandingPageActivity5.onWarmupCompleted(tTFullScreenVideoActivity3.asBinder());
    }

    @Override // okio.FileSystem
    public TTHistoryActivity41 sink(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        if (z) {
            onWarmupCompleted(tTFullScreenVideoActivity3);
        }
        return TTFullScreenExpressVideoActivity.onExtraCallbackWithResult(tTFullScreenVideoActivity3.asBinder(), false, 1, null);
    }

    @Override // okio.FileSystem
    public TTHistoryActivity41 appendingSink(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        if (z) {
            onExtraCallbackWithResult(tTFullScreenVideoActivity3);
        }
        return TTCeilingLandingPageActivity5.onWarmupCompleted(tTFullScreenVideoActivity3.asBinder(), true);
    }

    @Override // okio.FileSystem
    public void createDirectory(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        if (tTFullScreenVideoActivity3.asBinder().mkdir()) {
            return;
        }
        TTBaseVideoActivity tTBaseVideoActivityMetadataOrNull = metadataOrNull(tTFullScreenVideoActivity3);
        if (tTBaseVideoActivityMetadataOrNull == null || !tTBaseVideoActivityMetadataOrNull.onNavigationEvent()) {
            throw new IOException("failed to create directory: " + tTFullScreenVideoActivity3);
        }
        if (z) {
            throw new IOException(tTFullScreenVideoActivity3 + " already exists.");
        }
    }

    @Override // okio.FileSystem
    public void atomicMove(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity32) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity32, "");
        if (tTFullScreenVideoActivity3.asBinder().renameTo(tTFullScreenVideoActivity32.asBinder())) {
            return;
        }
        throw new IOException("failed to move " + tTFullScreenVideoActivity3 + " to " + tTFullScreenVideoActivity32);
    }

    @Override // okio.FileSystem
    public void delete(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileAsBinder = tTFullScreenVideoActivity3.asBinder();
        if (fileAsBinder.delete()) {
            return;
        }
        if (fileAsBinder.exists()) {
            throw new IOException("failed to delete " + tTFullScreenVideoActivity3);
        }
        if (z) {
            throw new FileNotFoundException("no such file: " + tTFullScreenVideoActivity3);
        }
    }

    @Override // okio.FileSystem
    public void createSymlink(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity32) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity32, "");
        throw new IOException("unsupported");
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    private final void onExtraCallbackWithResult(TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        if (exists(tTFullScreenVideoActivity3)) {
            return;
        }
        throw new IOException(tTFullScreenVideoActivity3 + " doesn't exist.");
    }

    private final void onWarmupCompleted(TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        if (exists(tTFullScreenVideoActivity3)) {
            throw new IOException(tTFullScreenVideoActivity3 + " already exists.");
        }
    }
}
