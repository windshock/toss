package o;

import im.toss.di.TossApiServiceModule;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PageNode1 implements captureStartValues<HttpLoggingInterceptor.Level> {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        HttpLoggingInterceptor.Level levelOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i3 = onNavigationEvent + 117;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return levelOnExtraCallbackWithResult;
    }

    public HttpLoggingInterceptor.Level onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        HttpLoggingInterceptor.Level levelOnExtraCallback = onExtraCallback();
        int i4 = onNavigationEvent + 41;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return levelOnExtraCallback;
    }

    public static HttpLoggingInterceptor.Level onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        HttpLoggingInterceptor.Level level = (HttpLoggingInterceptor.Level) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.onExtraCallback());
        int i3 = onNavigationEvent + 21;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return level;
        }
        obj.hashCode();
        throw null;
    }
}
