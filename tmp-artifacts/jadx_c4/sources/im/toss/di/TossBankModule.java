package im.toss.di;

import kotlin.jvm.internal.Intrinsics;
import o.SensorValues;
import o.doCheckNativeCrash;
import o.getMediaWidth;
import o.setDeltaValues;
import o.setValues;
import o.zzad;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TossBankModule {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final TossBankModule onExtraCallbackWithResult = new TossBankModule();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = IAuthTabCallback + 77;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private TossBankModule() {
    }

    public final setDeltaValues IAuthTabCallback(@NotNull OkHttpClient okHttpClient, @NotNull zzad zzadVar, @NotNull doCheckNativeCrash dochecknativecrash) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(dochecknativecrash, "");
        setDeltaValues setdeltavalues = (setDeltaValues) new Retrofit.Builder().IAuthTabCallback(zzadVar.IPostMessageServiceDefault()).onExtraCallback(dochecknativecrash).onNavigationEvent(RxJava2CallAdapterFactory.IAuthTabCallback()).onExtraCallbackWithResult(okHttpClient).IAuthTabCallback().onNavigationEvent(setDeltaValues.class);
        int i2 = onNavigationEvent + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return setdeltavalues;
    }

    public final setValues onNavigationEvent(@NotNull OkHttpClient okHttpClient, @NotNull zzad zzadVar, @NotNull doCheckNativeCrash dochecknativecrash) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(dochecknativecrash, "");
        setValues setvalues = (setValues) new Retrofit.Builder().IAuthTabCallback(zzadVar.IPostMessageServiceDefault()).onExtraCallback(dochecknativecrash).onNavigationEvent(RxJava2CallAdapterFactory.IAuthTabCallback()).onExtraCallbackWithResult(okHttpClient).IAuthTabCallback().onNavigationEvent(setValues.class);
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 53 / 0;
        }
        return setvalues;
    }

    public final SensorValues onWarmupCompleted(@NotNull OkHttpClient okHttpClient, @NotNull zzad zzadVar, @NotNull doCheckNativeCrash dochecknativecrash) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(dochecknativecrash, "");
        SensorValues sensorValues = (SensorValues) new Retrofit.Builder().IAuthTabCallback(zzadVar.IPostMessageServiceStub()).onExtraCallback(dochecknativecrash).onNavigationEvent(RxJava2CallAdapterFactory.IAuthTabCallback()).onExtraCallbackWithResult(okHttpClient).IAuthTabCallback().onNavigationEvent(SensorValues.class);
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return sensorValues;
    }

    public final getMediaWidth onExtraCallback(@NotNull OkHttpClient okHttpClient, @NotNull zzad zzadVar, @NotNull doCheckNativeCrash dochecknativecrash) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(dochecknativecrash, "");
        getMediaWidth getmediawidth = (getMediaWidth) new Retrofit.Builder().IAuthTabCallback(zzadVar.IPostMessageServiceDefault()).onExtraCallback(dochecknativecrash).onNavigationEvent(RxJava2CallAdapterFactory.IAuthTabCallback()).onExtraCallbackWithResult(okHttpClient).IAuthTabCallback().onNavigationEvent(getMediaWidth.class);
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return getmediawidth;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
