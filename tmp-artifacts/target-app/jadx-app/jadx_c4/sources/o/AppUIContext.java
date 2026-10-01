package o;

import im.toss.di.WebSocketModule;
import okhttp3.OkHttpClient;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AppUIContext implements captureStartValues<clearFeatureFlags> {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final createAnimators<OkHttpClient> IAuthTabCallback;
    private final createAnimators<parseTraceId> onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        clearFeatureFlags clearfeatureflagsOnWarmupCompleted = onWarmupCompleted();
        int i4 = onWarmupCompleted + 75;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return clearfeatureflagsOnWarmupCompleted;
    }

    public clearFeatureFlags onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        clearFeatureFlags clearfeatureflagsOnNavigationEvent = onNavigationEvent((OkHttpClient) this.IAuthTabCallback.get(), (parseTraceId) this.onExtraCallback.get());
        int i4 = onWarmupCompleted + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return clearfeatureflagsOnNavigationEvent;
    }

    public static clearFeatureFlags onNavigationEvent(OkHttpClient okHttpClient, parseTraceId parsetraceid) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        clearFeatureFlags clearfeatureflagsIAuthTabCallback = WebSocketModule.onWarmupCompleted.IAuthTabCallback(okHttpClient, parsetraceid);
        if (i3 != 0) {
            return (clearFeatureFlags) createAnimator.onNavigationEvent(clearfeatureflagsIAuthTabCallback);
        }
        int i4 = 64 / 0;
        return (clearFeatureFlags) createAnimator.onNavigationEvent(clearfeatureflagsIAuthTabCallback);
    }
}
