package o;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RVPerformanceTracker {
    private static int IAuthTabCallback = 1;
    private static final performanceLog onExtraCallback;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final performanceLog onWarmupCompleted() {
        performanceLog performancelog;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            performancelog = onExtraCallback;
            int i4 = 22 / 0;
        } else {
            performancelog = onExtraCallback;
        }
        int i5 = i3 + 99;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return performancelog;
        }
        throw null;
    }

    static {
        isH5 ish5 = isH5.IAuthTabCallback;
        onExtraCallback = new performanceLog(ish5.onWarmupCompleted().getWidth(), ish5.onWarmupCompleted().getHeight());
        int i = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
