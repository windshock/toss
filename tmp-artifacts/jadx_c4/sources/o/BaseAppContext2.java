package o;

import im.toss.di.ApiCreatorModule;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BaseAppContext2 implements captureStartValues<a2> {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub;
    private final createAnimators<Object> IAuthTabCallback;
    private final createAnimators<doCheckNativeCrash> asBinder;
    private final createAnimators<OkHttpClient> asInterface;
    private final createAnimators<access1002> onExtraCallback;
    private final createAnimators<Object> onExtraCallbackWithResult;
    private final createAnimators<HttpLoggingInterceptor.Level> onNavigationEvent;
    private final createAnimators<isExceptionHandlerEnabled> onTransact;
    private final createAnimators<zzad> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        a2 a2VarOnExtraCallback = onExtraCallback();
        int i4 = IAuthTabCallbackStub + 99;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return a2VarOnExtraCallback;
    }

    public a2 onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        a2 a2VarOnNavigationEvent$7ceaa0fd = onNavigationEvent$7ceaa0fd((isExceptionHandlerEnabled) this.onTransact.get(), (access1002) this.onExtraCallback.get(), this.IAuthTabCallback.get(), this.onExtraCallbackWithResult.get(), (HttpLoggingInterceptor.Level) this.onNavigationEvent.get(), (doCheckNativeCrash) this.asBinder.get(), (zzad) this.onWarmupCompleted.get(), (OkHttpClient) this.asInterface.get());
        int i4 = IAuthTabCallbackStub + 103;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return a2VarOnNavigationEvent$7ceaa0fd;
    }

    public static a2 onNavigationEvent$7ceaa0fd(isExceptionHandlerEnabled isexceptionhandlerenabled, access1002 access1002Var, Object obj, Object obj2, HttpLoggingInterceptor.Level level, doCheckNativeCrash dochecknativecrash, zzad zzadVar, OkHttpClient okHttpClient) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        a2 a2Var = (a2) createAnimator.onNavigationEvent(ApiCreatorModule.onNavigationEvent.onWarmupCompleted$7ceaa0fd(isexceptionhandlerenabled, access1002Var, obj, obj2, level, dochecknativecrash, zzadVar, okHttpClient));
        int i4 = IAuthTabCallbackStub + 41;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return a2Var;
    }
}
