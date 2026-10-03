package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.DiagnosticsWorker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class buildLoadAdConfig {

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[DiagnosticsWorker.IAuthTabCallback.values().length];
            try {
                iArr[DiagnosticsWorker.IAuthTabCallback.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiagnosticsWorker.IAuthTabCallback.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DiagnosticsWorker.IAuthTabCallback.ZSTD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallback = iArr;
            int[] iArr2 = new int[h1.values().length];
            try {
                iArr2[h1.TSS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[h1.TSS_GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[h1.TSS_ZSTD.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            onNavigationEvent = iArr2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final h1 onNavigationEvent(@NotNull DiagnosticsWorker.IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        int i = onExtraCallback.onExtraCallback[iAuthTabCallback.ordinal()];
        if (i == 1) {
            return h1.TSS;
        }
        if (i == 2) {
            return h1.TSS_GZIP;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return h1.TSS_ZSTD;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final DiagnosticsWorker.IAuthTabCallback onExtraCallbackWithResult(@NotNull h1 h1Var) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(h1Var, "");
        int i = onExtraCallback.onNavigationEvent[h1Var.ordinal()];
        if (i == 1) {
            return DiagnosticsWorker.IAuthTabCallback.NONE;
        }
        if (i == 2) {
            return DiagnosticsWorker.IAuthTabCallback.GZIP;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return DiagnosticsWorker.IAuthTabCallback.ZSTD;
    }
}
