package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CipherSuiteCompanionORDER_BY_NAME1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static final putokhttp<Integer> onExtraCallbackWithResult = getWriteAbortCountokhttp.onNavigationEvent(getWrite.IAuthTabCallback(30, 42), getWrite.IAuthTabCallback(29, 42), getWrite.IAuthTabCallback(28, 41), getWrite.IAuthTabCallback(27, 41), getWrite.IAuthTabCallback(26, 41), getWrite.IAuthTabCallback(25, 41), getWrite.IAuthTabCallback(24, 40), getWrite.IAuthTabCallback(23, 40), getWrite.IAuthTabCallback(22, 40), getWrite.IAuthTabCallback(21, 40), getWrite.IAuthTabCallback(20, 40), getWrite.IAuthTabCallback(19, 40), getWrite.IAuthTabCallback(18, 39), getWrite.IAuthTabCallback(17, 39), getWrite.IAuthTabCallback(16, 39), getWrite.IAuthTabCallback(15, 37), getWrite.IAuthTabCallback(14, 36), getWrite.IAuthTabCallback(13, 34), getWrite.IAuthTabCallback(12, 32), getWrite.IAuthTabCallback(11, 31));
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[pin.values().length];
            try {
                iArr[pin.Narrow.ordinal()] = 1;
                int i = IAuthTabCallback + 89;
                onExtraCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pin.Normal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pin.FoldableExpanded.ordinal()] = 3;
                int i3 = IAuthTabCallback + 75;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 3 % 2;
                } else {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            onNavigationEvent = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final float onNavigationEvent(@NotNull pin pinVar) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pinVar, "");
        int i2 = onExtraCallback.onNavigationEvent[pinVar.ordinal()];
        if (i2 == 1) {
            return 1.35f;
        }
        int i3 = onNavigationEvent;
        int i4 = i3 + 59;
        int i5 = i4 % 128;
        onExtraCallback = i5;
        int i6 = i4 % 2;
        if (i2 == 2) {
            int i7 = i5 + 111;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return 1.6f;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i9 = i3 + 119;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        return Float.MAX_VALUE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final float onWarmupCompleted(@NotNull pin pinVar) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pinVar, "");
        int i2 = onExtraCallback.onNavigationEvent[pinVar.ordinal()];
        if (i2 == 1) {
            return 1.5f;
        }
        if (i2 == 2) {
            return 2.5f;
        }
        int i3 = onExtraCallback;
        int i4 = i3 + 65;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0 ? i2 != 3 : i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = i3 + 109;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return Float.MAX_VALUE;
    }

    public static final boolean onNavigationEvent(float f, @NotNull pin pinVar) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(pinVar, "");
            onNavigationEvent(pinVar);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(pinVar, "");
        if (f < onNavigationEvent(pinVar)) {
            return false;
        }
        int i3 = onNavigationEvent;
        int i4 = i3 + 119;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 69;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public static final boolean onExtraCallback(float f, @NotNull pin pinVar) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(pinVar, "");
            onWarmupCompleted(pinVar);
            throw null;
        }
        Intrinsics.checkNotNullParameter(pinVar, "");
        if (f < onWarmupCompleted(pinVar)) {
            return false;
        }
        int i3 = onNavigationEvent + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public static final putokhttp<Integer> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        putokhttp<Integer> putokhttpVar = onExtraCallbackWithResult;
        int i5 = i3 + 95;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return putokhttpVar;
    }

    static {
        int i = IAuthTabCallback + 121;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 17 / 0;
        }
    }
}
