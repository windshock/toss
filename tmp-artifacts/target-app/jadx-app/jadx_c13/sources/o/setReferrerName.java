package o;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setReferrerName {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    public static final setReferrerName onWarmupCompleted = new setReferrerName();
    private static final AtomicInteger onExtraCallback = new AtomicInteger(Integer.MIN_VALUE);

    private setReferrerName() {
    }

    static {
        int i = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final AtomicInteger IAuthTabCallback() {
        AtomicInteger atomicInteger;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 27;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            atomicInteger = onExtraCallback;
            int i4 = 36 / 0;
        } else {
            atomicInteger = onExtraCallback;
        }
        int i5 = i2 + 73;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return atomicInteger;
    }
}
