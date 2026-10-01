package o;

import im.toss.di.TossApiServiceModule;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PageNode2 implements captureStartValues<getLongValue> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final createAnimators<access1002> IAuthTabCallback;
    private final createAnimators<HttpLoggingInterceptor.Level> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getLongValue getlongvalueOnNavigationEvent = onNavigationEvent();
        int i4 = onNavigationEvent + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return getlongvalueOnNavigationEvent;
        }
        throw null;
    }

    public getLongValue onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        access1002 access1002Var = (access1002) this.IAuthTabCallback.get();
        if (i3 == 0) {
            return onExtraCallbackWithResult(access1002Var, (HttpLoggingInterceptor.Level) this.onWarmupCompleted.get());
        }
        int i4 = 50 / 0;
        return onExtraCallbackWithResult(access1002Var, (HttpLoggingInterceptor.Level) this.onWarmupCompleted.get());
    }

    public static getLongValue onExtraCallbackWithResult(access1002 access1002Var, HttpLoggingInterceptor.Level level) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {TossApiServiceModule.IAuthTabCallback, access1002Var, level};
        if (i3 == 0) {
            return (getLongValue) createAnimator.onNavigationEvent((getLongValue) TossApiServiceModule.onExtraCallbackWithResult(TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 515021508, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), -515021503, objArr));
        }
        throw null;
    }
}
