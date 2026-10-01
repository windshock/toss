package o;

import o.onRequestEventBeat;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class onRequestEventBeat$onExtraCallback$IAuthTabCallback {
    public static final /* synthetic */ int[] IAuthTabCallback;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int[] iArr = new int[onRequestEventBeat.onWarmupCompleted.values().length];
        try {
            iArr[onRequestEventBeat.onWarmupCompleted.accountClosed.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[onRequestEventBeat.onWarmupCompleted.accountOpened.ordinal()] = 2;
            int i = onWarmupCompleted + 123;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        IAuthTabCallback = iArr;
        int i3 = onWarmupCompleted + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }
}
