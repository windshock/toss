package o;

import android.content.Context;
import im.toss.di.TossApiServiceModule;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class waitResourceReady implements captureStartValues<extraData> {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final createAnimators<access1002> IAuthTabCallback;
    private final createAnimators<HttpLoggingInterceptor.Level> onNavigationEvent;
    private final createAnimators<Context> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        extraData extradataIAuthTabCallback = IAuthTabCallback();
        int i4 = onExtraCallback + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return extradataIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public extraData IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted((Context) this.onWarmupCompleted.get(), (access1002) this.IAuthTabCallback.get(), (HttpLoggingInterceptor.Level) this.onNavigationEvent.get());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        extraData extradataOnWarmupCompleted = onWarmupCompleted((Context) this.onWarmupCompleted.get(), (access1002) this.IAuthTabCallback.get(), (HttpLoggingInterceptor.Level) this.onNavigationEvent.get());
        int i3 = onExtraCallbackWithResult + 43;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return extradataOnWarmupCompleted;
    }

    public static extraData onWarmupCompleted(Context context, access1002 access1002Var, HttpLoggingInterceptor.Level level) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        extraData extradataOnNavigationEvent = TossApiServiceModule.IAuthTabCallback.onNavigationEvent(context, access1002Var, level);
        if (i3 != 0) {
            return (extraData) createAnimator.onNavigationEvent(extradataOnNavigationEvent);
        }
        throw null;
    }
}
