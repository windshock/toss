package o;

import im.toss.di.TossApiServiceModule;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class handleStartClientBundleNull implements captureStartValues<setNativeAd> {
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private final createAnimators<access1002> IAuthTabCallback;
    private final createAnimators<HttpLoggingInterceptor.Level> onExtraCallback;
    private final createAnimators<doCheckNativeCrash> onExtraCallbackWithResult;
    private final createAnimators<OkHttpClient> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setNativeAd setnativeadOnNavigationEvent = onNavigationEvent();
        int i4 = onTransact + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return setnativeadOnNavigationEvent;
    }

    public setNativeAd onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setNativeAd setnativeadOnExtraCallback = onExtraCallback((OkHttpClient) this.onWarmupCompleted.get(), (access1002) this.IAuthTabCallback.get(), (HttpLoggingInterceptor.Level) this.onExtraCallback.get(), (doCheckNativeCrash) this.onExtraCallbackWithResult.get());
        int i4 = onTransact + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return setnativeadOnExtraCallback;
    }

    public static setNativeAd onExtraCallback(OkHttpClient okHttpClient, access1002 access1002Var, HttpLoggingInterceptor.Level level, doCheckNativeCrash dochecknativecrash) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        setNativeAd setnativead = (setNativeAd) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.onWarmupCompleted(okHttpClient, access1002Var, level, dochecknativecrash));
        int i4 = onNavigationEvent + 37;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return setnativead;
        }
        throw null;
    }
}
