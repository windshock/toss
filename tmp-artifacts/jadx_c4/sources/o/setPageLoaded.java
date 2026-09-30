package o;

import im.toss.di.TossApiServiceModule;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setPageLoaded implements captureStartValues<setH5OptionMenuTextFlag> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final createAnimators<HttpLoggingInterceptor.Level> IAuthTabCallback;
    private final createAnimators<access1002> onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setH5OptionMenuTextFlag seth5optionmenutextflagOnWarmupCompleted = onWarmupCompleted();
        int i4 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return seth5optionmenutextflagOnWarmupCompleted;
    }

    public setH5OptionMenuTextFlag onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        access1002 access1002Var = (access1002) this.onExtraCallback.get();
        if (i3 == 0) {
            return onWarmupCompleted(access1002Var, (HttpLoggingInterceptor.Level) this.IAuthTabCallback.get());
        }
        int i4 = 90 / 0;
        return onWarmupCompleted(access1002Var, (HttpLoggingInterceptor.Level) this.IAuthTabCallback.get());
    }

    public static setH5OptionMenuTextFlag onWarmupCompleted(access1002 access1002Var, HttpLoggingInterceptor.Level level) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setH5OptionMenuTextFlag seth5optionmenutextflag = (setH5OptionMenuTextFlag) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.IAuthTabCallback(access1002Var, level));
        int i4 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return seth5optionmenutextflag;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
