package o;

import android.content.Context;
import im.toss.rn.toss.core.common.di.NetworkModule;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getTestModeNetwork implements captureStartValues<okhttp3.Cache> {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final createAnimators<Context> onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        okhttp3.Cache cacheOnWarmupCompleted = onWarmupCompleted();
        int i4 = onExtraCallback + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return cacheOnWarmupCompleted;
    }

    public okhttp3.Cache onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        okhttp3.Cache cacheOnExtraCallback = onExtraCallback((Context) this.onNavigationEvent.get());
        int i4 = onExtraCallback + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return cacheOnExtraCallback;
    }

    public static okhttp3.Cache onExtraCallback(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        okhttp3.Cache cache = (okhttp3.Cache) createAnimator.onNavigationEvent(NetworkModule.IAuthTabCallback.IAuthTabCallback(context));
        int i4 = onExtraCallback + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return cache;
    }
}
