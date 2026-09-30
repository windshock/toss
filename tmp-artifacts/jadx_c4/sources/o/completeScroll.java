package o;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class completeScroll {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static volatile onExtraCallbackWithResult onExtraCallback = null;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public static final completeScroll onNavigationEvent = new completeScroll();
    public static final int IAuthTabCallback = 8;

    public interface onExtraCallbackWithResult {
    }

    static {
        int i = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private completeScroll() {
    }

    public final onExtraCallbackWithResult onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = onExtraCallback;
        int i4 = asBinder + 83;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return onextracallbackwithresult;
    }
}
