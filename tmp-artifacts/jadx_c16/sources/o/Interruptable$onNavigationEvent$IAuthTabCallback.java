package o;

import o.Interruptable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class Interruptable$onNavigationEvent$IAuthTabCallback {
    public static final /* synthetic */ int[] IAuthTabCallback;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    static {
        int[] iArr = new int[Interruptable.onNavigationEvent.values().length];
        try {
            iArr[Interruptable.onNavigationEvent.AUTOMATIC.ordinal()] = 1;
            int i = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Interruptable.onNavigationEvent.MANUAL.ordinal()] = 2;
            int i4 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        IAuthTabCallback = iArr;
    }
}
