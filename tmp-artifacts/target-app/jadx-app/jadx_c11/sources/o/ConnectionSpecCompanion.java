package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.setCipherSuitesokhttp;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ConnectionSpecCompanion {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[setCipherSuitesokhttp.onExtraCallback.values().length];
            try {
                iArr[setCipherSuitesokhttp.onExtraCallback.TEXTURE_2D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setCipherSuitesokhttp.onExtraCallback.TEXTURE_EXTERNAL_OES.ordinal()] = 2;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[setCipherSuitesokhttp.IAuthTabCallback.values().length];
            try {
                iArr2[setCipherSuitesokhttp.IAuthTabCallback.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[setCipherSuitesokhttp.IAuthTabCallback.A8.ordinal()] = 2;
                int i2 = onWarmupCompleted + 57;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[setCipherSuitesokhttp.IAuthTabCallback.R8.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[setCipherSuitesokhttp.IAuthTabCallback.R16F.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[setCipherSuitesokhttp.IAuthTabCallback.RGB8.ordinal()] = 5;
                int i5 = onWarmupCompleted + 89;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[setCipherSuitesokhttp.IAuthTabCallback.RGBA8.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[setCipherSuitesokhttp.IAuthTabCallback.RGB10_A2.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[setCipherSuitesokhttp.IAuthTabCallback.DEPTH24STENCIL8.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            onExtraCallback = iArr2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final int onNavigationEvent(@NotNull setCipherSuitesokhttp.onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            i = IAuthTabCallback.onNavigationEvent[onextracallback.ordinal()];
            if (i == 1) {
                return 3553;
            }
        } else {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            i = IAuthTabCallback.onNavigationEvent[onextracallback.ordinal()];
            if (i == 1) {
                return 3553;
            }
        }
        int i4 = onExtraCallbackWithResult;
        int i5 = i4 + 9;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0 ? i != 2 : i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = i4 + 101;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return 36197;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final int onWarmupCompleted(@NotNull setCipherSuitesokhttp.IAuthTabCallback iAuthTabCallback) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        switch (IAuthTabCallback.onExtraCallback[iAuthTabCallback.ordinal()]) {
            case 1:
                return 0;
            case 2:
            case 3:
                return 33321;
            case 4:
                int i4 = onWarmupCompleted + 89;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return 33325;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 5:
                return 32849;
            case 6:
                return 35907;
            case 7:
                return 32857;
            case 8:
                return 35056;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
