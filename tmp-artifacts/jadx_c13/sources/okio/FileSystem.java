package okio;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.TTAppOpenAdActivity9;
import o.TTAppOpenAdTransActivity;
import o.TTBaseVideoActivity;
import o.TTBaseVideoActivity3;
import o.TTCeilingLandingPageActivity5;
import o.TTCeilingLandingPageActivity6;
import o.TTCeilingLandingPageActivity7;
import o.TTDelegateActivity;
import o.TTFullScreenVideoActivity3;
import o.TTHistoryActivity41;
import o.TTHistoryActivity42;
import o.TTHistoryLandingPageActivity101;
import o.setExecute;
import okio.internal.ResourceFileSystem;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class FileSystem implements Closeable {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final FileSystem RESOURCES;
    public static final FileSystem SYSTEM;
    public static final TTFullScreenVideoActivity3 SYSTEM_TEMPORARY_DIRECTORY;

    @JvmStatic
    public static final FileSystem get(@NotNull java.nio.file.FileSystem fileSystem) {
        return Companion.sO_(fileSystem);
    }

    public abstract TTHistoryActivity41 appendingSink(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException;

    public abstract void atomicMove(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity32) throws IOException;

    public abstract TTFullScreenVideoActivity3 canonicalize(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public abstract void createDirectory(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException;

    public abstract void createSymlink(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity32) throws IOException;

    public abstract void delete(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException;

    public abstract List<TTFullScreenVideoActivity3> list(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException;

    public abstract List<TTFullScreenVideoActivity3> listOrNull(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3);

    public abstract TTBaseVideoActivity metadataOrNull(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException;

    public abstract TTBaseVideoActivity3 openReadOnly(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException;

    public abstract TTBaseVideoActivity3 openReadWrite(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z, boolean z2) throws IOException;

    public abstract TTHistoryActivity41 sink(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException;

    public abstract TTHistoryActivity42 source(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException;

    public final TTBaseVideoActivity metadata(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return TTHistoryLandingPageActivity101.IAuthTabCallback(this, tTFullScreenVideoActivity3);
    }

    public final boolean exists(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return TTHistoryLandingPageActivity101.onNavigationEvent(this, tTFullScreenVideoActivity3);
    }

    public static /* synthetic */ Sequence listRecursively$default(FileSystem fileSystem, TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileSystem.listRecursively(tTFullScreenVideoActivity3, z);
    }

    public Sequence<TTFullScreenVideoActivity3> listRecursively(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return TTHistoryLandingPageActivity101.onExtraCallback(this, tTFullScreenVideoActivity3, z);
    }

    public final Sequence<TTFullScreenVideoActivity3> listRecursively(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return listRecursively(tTFullScreenVideoActivity3, false);
    }

    public static /* synthetic */ TTBaseVideoActivity3 openReadWrite$default(FileSystem fileSystem, TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z, boolean z2, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return fileSystem.openReadWrite(tTFullScreenVideoActivity3, z, z2);
    }

    public final TTBaseVideoActivity3 openReadWrite(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return openReadWrite(tTFullScreenVideoActivity3, false, false);
    }

    public static /* synthetic */ TTHistoryActivity41 sink$default(FileSystem fileSystem, TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileSystem.sink(tTFullScreenVideoActivity3, z);
    }

    public final TTHistoryActivity41 sink(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return sink(tTFullScreenVideoActivity3, false);
    }

    /* renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m320write$default(FileSystem fileSystem, TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z, Function1 function1, int i, Object obj) throws Throwable {
        Object objInvoke;
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
            Intrinsics.checkNotNullParameter(function1, "");
            TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(fileSystem.sink(tTFullScreenVideoActivity3, z));
            Throwable th = null;
            try {
                objInvoke = function1.invoke(tTAppOpenAdActivity9OnExtraCallbackWithResult);
                InlineMarker.finallyStart(1);
                if (tTAppOpenAdActivity9OnExtraCallbackWithResult != null) {
                    try {
                        tTAppOpenAdActivity9OnExtraCallbackWithResult.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                InlineMarker.finallyEnd(1);
            } catch (Throwable th3) {
                InlineMarker.finallyStart(1);
                if (tTAppOpenAdActivity9OnExtraCallbackWithResult != null) {
                    try {
                        tTAppOpenAdActivity9OnExtraCallbackWithResult.close();
                    } catch (Throwable th4) {
                        setExecute.onNavigationEvent(th3, th4);
                    }
                }
                InlineMarker.finallyEnd(1);
                objInvoke = null;
                th = th3;
            }
            if (th == null) {
                return objInvoke;
            }
            throw th;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
    }

    public static /* synthetic */ TTHistoryActivity41 appendingSink$default(FileSystem fileSystem, TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileSystem.appendingSink(tTFullScreenVideoActivity3, z);
    }

    public final TTHistoryActivity41 appendingSink(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return appendingSink(tTFullScreenVideoActivity3, false);
    }

    public static /* synthetic */ void createDirectory$default(FileSystem fileSystem, TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.createDirectory(tTFullScreenVideoActivity3, z);
    }

    public final void createDirectory(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        createDirectory(tTFullScreenVideoActivity3, false);
    }

    public static /* synthetic */ void createDirectories$default(FileSystem fileSystem, TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.createDirectories(tTFullScreenVideoActivity3, z);
    }

    public final void createDirectories(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        TTHistoryLandingPageActivity101.onNavigationEvent(this, tTFullScreenVideoActivity3, z);
    }

    public final void createDirectories(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        createDirectories(tTFullScreenVideoActivity3, false);
    }

    public void copy(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity32) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity32, "");
        TTHistoryLandingPageActivity101.onWarmupCompleted(this, tTFullScreenVideoActivity3, tTFullScreenVideoActivity32);
    }

    public static /* synthetic */ void delete$default(FileSystem fileSystem, TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.delete(tTFullScreenVideoActivity3, z);
    }

    public final void delete(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        delete(tTFullScreenVideoActivity3, false);
    }

    public static /* synthetic */ void deleteRecursively$default(FileSystem fileSystem, TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.deleteRecursively(tTFullScreenVideoActivity3, z);
    }

    public void deleteRecursively(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        TTHistoryLandingPageActivity101.IAuthTabCallback(this, tTFullScreenVideoActivity3, z);
    }

    public final void deleteRecursively(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        deleteRecursively(tTFullScreenVideoActivity3, false);
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        @JvmStatic
        public final FileSystem sO_(@NotNull java.nio.file.FileSystem fileSystem) {
            Intrinsics.checkNotNullParameter(fileSystem, "");
            return new TTCeilingLandingPageActivity6(fileSystem);
        }
    }

    static {
        FileSystem tTCeilingLandingPageActivity7;
        try {
            Class.forName("java.nio.file.Files");
            tTCeilingLandingPageActivity7 = new TTDelegateActivity();
        } catch (ClassNotFoundException unused) {
            tTCeilingLandingPageActivity7 = new TTCeilingLandingPageActivity7();
        }
        SYSTEM = tTCeilingLandingPageActivity7;
        TTFullScreenVideoActivity3.onExtraCallback onextracallback = TTFullScreenVideoActivity3.Companion;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "");
        SYSTEM_TEMPORARY_DIRECTORY = TTFullScreenVideoActivity3.onExtraCallback.IAuthTabCallback(onextracallback, property, false, 1, null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "");
        RESOURCES = new ResourceFileSystem(classLoader, false, null, 4, null);
    }

    /* renamed from: -read, reason: not valid java name */
    public final <T> T m321read(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull Function1<? super TTAppOpenAdTransActivity, ? extends T> function1) throws Throwable {
        T tInvoke;
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(source(tTFullScreenVideoActivity3));
        Throwable th = null;
        try {
            tInvoke = function1.invoke(tTAppOpenAdTransActivityOnExtraCallback);
            InlineMarker.finallyStart(1);
            if (tTAppOpenAdTransActivityOnExtraCallback != null) {
                try {
                    tTAppOpenAdTransActivityOnExtraCallback.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            InlineMarker.finallyEnd(1);
        } catch (Throwable th3) {
            InlineMarker.finallyStart(1);
            if (tTAppOpenAdTransActivityOnExtraCallback != null) {
                try {
                    tTAppOpenAdTransActivityOnExtraCallback.close();
                } catch (Throwable th4) {
                    setExecute.onNavigationEvent(th3, th4);
                }
            }
            InlineMarker.finallyEnd(1);
            th = th3;
            tInvoke = null;
        }
        if (th == null) {
            return tInvoke;
        }
        throw th;
    }

    /* renamed from: -write, reason: not valid java name */
    public final <T> T m322write(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z, @NotNull Function1<? super TTAppOpenAdActivity9, ? extends T> function1) throws Throwable {
        T tInvoke;
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(sink(tTFullScreenVideoActivity3, z));
        Throwable th = null;
        try {
            tInvoke = function1.invoke(tTAppOpenAdActivity9OnExtraCallbackWithResult);
            InlineMarker.finallyStart(1);
            if (tTAppOpenAdActivity9OnExtraCallbackWithResult != null) {
                try {
                    tTAppOpenAdActivity9OnExtraCallbackWithResult.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            InlineMarker.finallyEnd(1);
        } catch (Throwable th3) {
            InlineMarker.finallyStart(1);
            if (tTAppOpenAdActivity9OnExtraCallbackWithResult != null) {
                try {
                    tTAppOpenAdActivity9OnExtraCallbackWithResult.close();
                } catch (Throwable th4) {
                    setExecute.onNavigationEvent(th3, th4);
                }
            }
            InlineMarker.finallyEnd(1);
            tInvoke = null;
            th = th3;
        }
        if (th == null) {
            return tInvoke;
        }
        throw th;
    }
}
