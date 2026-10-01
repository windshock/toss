package o;

import im.toss.di.TossApiServiceModule;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class finish implements captureStartValues<getVolume> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final createAnimators<access1002> IAuthTabCallback;
    private final createAnimators<doCheckNativeCrash> onExtraCallbackWithResult;
    private final createAnimators<HttpLoggingInterceptor.Level> onWarmupCompleted;

    public /* synthetic */ Object get() {
        getVolume getvolumeIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            getvolumeIAuthTabCallback = IAuthTabCallback();
            int i3 = 68 / 0;
        } else {
            getvolumeIAuthTabCallback = IAuthTabCallback();
        }
        int i4 = onExtraCallback + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return getvolumeIAuthTabCallback;
    }

    public getVolume IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getVolume getvolumeOnWarmupCompleted = onWarmupCompleted((access1002) this.IAuthTabCallback.get(), (HttpLoggingInterceptor.Level) this.onWarmupCompleted.get(), (doCheckNativeCrash) this.onExtraCallbackWithResult.get());
        int i4 = onExtraCallback + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return getvolumeOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getVolume onWarmupCompleted(access1002 access1002Var, HttpLoggingInterceptor.Level level, doCheckNativeCrash dochecknativecrash) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        getVolume getvolume = (getVolume) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.IAuthTabCallback(access1002Var, level, dochecknativecrash));
        int i3 = onNavigationEvent + 25;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return getvolume;
        }
        throw null;
    }
}
