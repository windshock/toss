package o;

import android.content.Context;
import im.toss.di.TossApiServiceModule;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setRender implements captureStartValues<contentUrl> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final createAnimators<Context> onExtraCallback;
    private final createAnimators<HttpLoggingInterceptor.Level> onNavigationEvent;
    private final createAnimators<access1002> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        contentUrl contenturlOnNavigationEvent = onNavigationEvent();
        int i4 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return contenturlOnNavigationEvent;
    }

    public contentUrl onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        contentUrl contenturlOnNavigationEvent = onNavigationEvent((Context) this.onExtraCallback.get(), (access1002) this.onWarmupCompleted.get(), (HttpLoggingInterceptor.Level) this.onNavigationEvent.get());
        int i4 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return contenturlOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static contentUrl onNavigationEvent(Context context, access1002 access1002Var, HttpLoggingInterceptor.Level level) {
        contentUrl contenturl;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            contenturl = (contentUrl) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.onExtraCallbackWithResult(context, access1002Var, level));
            int i3 = 26 / 0;
        } else {
            contenturl = (contentUrl) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.onExtraCallbackWithResult(context, access1002Var, level));
        }
        int i4 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return contenturl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
