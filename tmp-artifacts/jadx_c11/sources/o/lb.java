package o;

import kotlin.ranges.RangesKt;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class lb {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ long onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object obj) {
        int i6 = 2 % 2;
        if ((i5 & 1) != 0) {
            int i7 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            int i9 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            int i11 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            i4 = Integer.MAX_VALUE;
        }
        return onExtraCallback(i, i2, i3, i4);
    }

    public static final long onExtraCallback(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i, 0);
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(i3, 0);
        long jOnWarmupCompleted = r8lambdatyuhtkV3Gk4Y8iHVLxxtDWO5vzE.onWarmupCompleted(iCoerceAtLeast, RangesKt.coerceAtLeast(i2, iCoerceAtLeast), iCoerceAtLeast2, RangesKt.coerceAtLeast(i4, iCoerceAtLeast2));
        int i8 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 8 / 0;
        }
        return jOnWarmupCompleted;
    }
}
