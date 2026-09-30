package o;

import im.toss.di.TossBankModule;
import okhttp3.OkHttpClient;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class doCommonDestroy implements captureStartValues<SensorValues> {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final createAnimators<OkHttpClient> IAuthTabCallback;
    private final createAnimators<doCheckNativeCrash> onExtraCallbackWithResult;
    private final createAnimators<zzad> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SensorValues sensorValuesOnWarmupCompleted = onWarmupCompleted();
        int i4 = onNavigationEvent + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return sensorValuesOnWarmupCompleted;
    }

    public SensorValues onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        OkHttpClient okHttpClient = (OkHttpClient) this.IAuthTabCallback.get();
        if (i3 != 0) {
            return IAuthTabCallback(okHttpClient, (zzad) this.onWarmupCompleted.get(), (doCheckNativeCrash) this.onExtraCallbackWithResult.get());
        }
        IAuthTabCallback(okHttpClient, (zzad) this.onWarmupCompleted.get(), (doCheckNativeCrash) this.onExtraCallbackWithResult.get());
        throw null;
    }

    public static SensorValues IAuthTabCallback(OkHttpClient okHttpClient, zzad zzadVar, doCheckNativeCrash dochecknativecrash) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SensorValues sensorValues = (SensorValues) createAnimator.onNavigationEvent(TossBankModule.onExtraCallbackWithResult.onWarmupCompleted(okHttpClient, zzadVar, dochecknativecrash));
        if (i3 == 0) {
            return sensorValues;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
