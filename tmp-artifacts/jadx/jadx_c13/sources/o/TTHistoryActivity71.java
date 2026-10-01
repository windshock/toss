package o;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TTFullScreenVideoActivity3;
import okio.FileSystem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryActivity71 extends FileSystem {
    private static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final TTFullScreenVideoActivity3 onExtraCallbackWithResult = TTFullScreenVideoActivity3.onExtraCallback.IAuthTabCallback(TTFullScreenVideoActivity3.Companion, "/", false, 1, null);
    private final String IAuthTabCallback;
    private final TTFullScreenVideoActivity3 onExtraCallback;
    private final Map<TTFullScreenVideoActivity3, TTHistoryLandingPageActivity2> onNavigationEvent;
    private final FileSystem onWarmupCompleted;

    public TTHistoryActivity71(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull FileSystem fileSystem, @NotNull Map<TTFullScreenVideoActivity3, TTHistoryLandingPageActivity2> map, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(fileSystem, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.onExtraCallback = tTFullScreenVideoActivity3;
        this.onWarmupCompleted = fileSystem;
        this.onNavigationEvent = map;
        this.IAuthTabCallback = str;
    }

    @Override // okio.FileSystem
    public TTFullScreenVideoActivity3 canonicalize(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        TTFullScreenVideoActivity3 tTFullScreenVideoActivity3OnNavigationEvent = onNavigationEvent(tTFullScreenVideoActivity3);
        if (this.onNavigationEvent.containsKey(tTFullScreenVideoActivity3OnNavigationEvent)) {
            return tTFullScreenVideoActivity3OnNavigationEvent;
        }
        throw new FileNotFoundException(String.valueOf(tTFullScreenVideoActivity3));
    }

    private final TTFullScreenVideoActivity3 onNavigationEvent(TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        return onExtraCallbackWithResult.onExtraCallback(tTFullScreenVideoActivity3, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a A[Catch: all -> 0x005b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x005b, blocks: (B:8:0x0027, B:30:0x005a, B:21:0x0049, B:9:0x0033, B:18:0x0044), top: B:55:0x0027, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    @Override // okio.FileSystem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TTBaseVideoActivity metadataOrNull(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws Throwable {
        Throwable th;
        TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback;
        Throwable th2;
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        TTHistoryLandingPageActivity2 tTHistoryLandingPageActivity2OnWarmupCompleted = this.onNavigationEvent.get(onNavigationEvent(tTFullScreenVideoActivity3));
        if (tTHistoryLandingPageActivity2OnWarmupCompleted == null) {
            return null;
        }
        if (tTHistoryLandingPageActivity2OnWarmupCompleted.asBinder() != -1) {
            TTBaseVideoActivity3 tTBaseVideoActivity3OpenReadOnly = this.onWarmupCompleted.openReadOnly(this.onExtraCallback);
            try {
                tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(tTBaseVideoActivity3OpenReadOnly.onExtraCallback(tTHistoryLandingPageActivity2OnWarmupCompleted.asBinder()));
                try {
                    tTHistoryLandingPageActivity2OnWarmupCompleted = TTHistoryLandingPageActivity13.onWarmupCompleted(tTAppOpenAdTransActivityOnExtraCallback, tTHistoryLandingPageActivity2OnWarmupCompleted);
                } catch (Throwable th3) {
                    if (tTAppOpenAdTransActivityOnExtraCallback != null) {
                        try {
                            tTAppOpenAdTransActivityOnExtraCallback.close();
                        } catch (Throwable th4) {
                            setExecute.onNavigationEvent(th3, th4);
                        }
                    }
                    th2 = th3;
                    tTHistoryLandingPageActivity2OnWarmupCompleted = null;
                }
            } catch (Throwable th5) {
                if (tTBaseVideoActivity3OpenReadOnly != null) {
                    try {
                        tTBaseVideoActivity3OpenReadOnly.close();
                    } catch (Throwable th6) {
                        setExecute.onNavigationEvent(th5, th6);
                    }
                }
                th = th5;
                tTHistoryLandingPageActivity2OnWarmupCompleted = null;
            }
            if (tTAppOpenAdTransActivityOnExtraCallback != null) {
                try {
                    tTAppOpenAdTransActivityOnExtraCallback.close();
                    th2 = null;
                } catch (Throwable th7) {
                    th2 = th7;
                }
                if (th2 == null) {
                    throw th2;
                }
                if (tTBaseVideoActivity3OpenReadOnly != null) {
                    try {
                        tTBaseVideoActivity3OpenReadOnly.close();
                        th = null;
                    } catch (Throwable th8) {
                        th = th8;
                    }
                    if (th != null) {
                        throw th;
                    }
                } else {
                    th = null;
                    if (th != null) {
                    }
                }
            } else {
                th2 = null;
                if (th2 == null) {
                }
            }
        }
        return new TTBaseVideoActivity(!tTHistoryLandingPageActivity2OnWarmupCompleted.asInterface(), tTHistoryLandingPageActivity2OnWarmupCompleted.asInterface(), null, tTHistoryLandingPageActivity2OnWarmupCompleted.asInterface() ? null : Long.valueOf(tTHistoryLandingPageActivity2OnWarmupCompleted.onTransact()), tTHistoryLandingPageActivity2OnWarmupCompleted.onExtraCallback(), tTHistoryLandingPageActivity2OnWarmupCompleted.IAuthTabCallbackDefault(), tTHistoryLandingPageActivity2OnWarmupCompleted.IAuthTabCallbackStub(), null, 128, null);
    }

    @Override // okio.FileSystem
    public TTBaseVideoActivity3 openReadOnly(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.FileSystem
    public TTBaseVideoActivity3 openReadWrite(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        throw new IOException("zip entries are not writable");
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
        TTHistoryLandingPageActivity2 tTHistoryLandingPageActivity2 = this.onNavigationEvent.get(onNavigationEvent(tTFullScreenVideoActivity3));
        if (tTHistoryLandingPageActivity2 != null) {
            return CollectionsKt___CollectionsKt.toList(tTHistoryLandingPageActivity2.onNavigationEvent());
        }
        if (!z) {
            return null;
        }
        throw new IOException("not a directory: " + tTFullScreenVideoActivity3);
    }

    @Override // okio.FileSystem
    public TTHistoryActivity42 source(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws Throwable {
        TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback;
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        TTHistoryLandingPageActivity2 tTHistoryLandingPageActivity2 = this.onNavigationEvent.get(onNavigationEvent(tTFullScreenVideoActivity3));
        if (tTHistoryLandingPageActivity2 == null) {
            throw new FileNotFoundException("no such file: " + tTFullScreenVideoActivity3);
        }
        TTBaseVideoActivity3 tTBaseVideoActivity3OpenReadOnly = this.onWarmupCompleted.openReadOnly(this.onExtraCallback);
        Throwable th = null;
        try {
            tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(tTBaseVideoActivity3OpenReadOnly.onExtraCallback(tTHistoryLandingPageActivity2.asBinder()));
            if (tTBaseVideoActivity3OpenReadOnly != null) {
                try {
                    tTBaseVideoActivity3OpenReadOnly.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (tTBaseVideoActivity3OpenReadOnly != null) {
                try {
                    tTBaseVideoActivity3OpenReadOnly.close();
                } catch (Throwable th4) {
                    setExecute.onNavigationEvent(th3, th4);
                }
            }
            tTAppOpenAdTransActivityOnExtraCallback = null;
            th = th3;
        }
        if (th == null) {
            TTHistoryLandingPageActivity13.onExtraCallback(tTAppOpenAdTransActivityOnExtraCallback);
            if (tTHistoryLandingPageActivity2.IAuthTabCallback() == 0) {
                return new TTHistoryLandingPageActivity3(tTAppOpenAdTransActivityOnExtraCallback, tTHistoryLandingPageActivity2.onTransact(), true);
            }
            return new TTHistoryLandingPageActivity3(new TTCeilingLandingPageActivity4(new TTHistoryLandingPageActivity3(tTAppOpenAdTransActivityOnExtraCallback, tTHistoryLandingPageActivity2.onExtraCallbackWithResult(), true), new Inflater(true)), tTHistoryLandingPageActivity2.onTransact(), false);
        }
        throw th;
    }

    @Override // okio.FileSystem
    public TTHistoryActivity41 sink(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public TTHistoryActivity41 appendingSink(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void createDirectory(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void atomicMove(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity32) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity32, "");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void delete(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void createSymlink(@NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity32) throws IOException {
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity32, "");
        throw new IOException("zip file systems are read-only");
    }

    static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
