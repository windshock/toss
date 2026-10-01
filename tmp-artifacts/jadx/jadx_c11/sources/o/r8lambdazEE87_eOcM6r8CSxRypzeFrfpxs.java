package o;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdazEE87_eOcM6r8CSxRypzeFrfpxs {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final AtomicBoolean onWarmupCompleted = new AtomicBoolean(false);

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onWarmupCompleted.get();
        }
        int i3 = 2 / 0;
        return this.onWarmupCompleted.get();
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.set(false);
        int i4 = onExtraCallbackWithResult + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        boolean zCompareAndSet = i2 % 2 == 0 ? this.onWarmupCompleted.compareAndSet(false, false) : this.onWarmupCompleted.compareAndSet(false, true);
        int i3 = onExtraCallback + 9;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return zCompareAndSet;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
