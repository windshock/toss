package o;

import android.view.animation.Interpolator;
import kotlin.collections.CollectionsKt;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_dns implements Interpolator {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final deprecated_proxyAuthenticator IAuthTabCallback;

    public deprecated_dns(double d, double d2) {
        this.IAuthTabCallback = new deprecated_proxyAuthenticator(d, d2);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int lastIndex = (int) (CollectionsKt.getLastIndex(this.IAuthTabCallback.IAuthTabCallback()) * f);
        if (lastIndex >= 0) {
            if (lastIndex > CollectionsKt.getLastIndex(this.IAuthTabCallback.IAuthTabCallback())) {
                lastIndex = CollectionsKt.getLastIndex(this.IAuthTabCallback.IAuthTabCallback());
            }
        } else {
            int i4 = onNavigationEvent + 63;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            lastIndex = 0;
        }
        return (float) this.IAuthTabCallback.IAuthTabCallback().get(lastIndex).doubleValue();
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = (int) (this.IAuthTabCallback.onExtraCallbackWithResult() * 1000.0d);
        int i4 = onWarmupCompleted + 15;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iOnExtraCallbackWithResult;
    }
}
