package o;

import android.content.Context;
import im.toss.tosssecurities.tuba.variable.v2.impl.di.NetworkModule;
import okhttp3.CookieJar;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1uSDK implements captureStartValues<AFe1oSDK> {
    private static int IAuthTabCallback = 0;
    private static int onTransact = 1;
    private final createAnimators<g1> onExtraCallback;
    private final createAnimators<Context> onExtraCallbackWithResult;
    private final createAnimators<CookieJar> onNavigationEvent;
    private final createAnimators<accessgetStatep> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AFe1oSDK onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AFe1oSDK aFe1oSDKOnNavigationEvent = onNavigationEvent((Context) this.onExtraCallbackWithResult.get(), (accessgetStatep) this.onWarmupCompleted.get(), (g1) this.onExtraCallback.get(), (CookieJar) this.onNavigationEvent.get());
        int i4 = onTransact + 47;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return aFe1oSDKOnNavigationEvent;
    }

    public static AFe1oSDK onNavigationEvent(Context context, accessgetStatep accessgetstatep, g1 g1Var, CookieJar cookieJar) {
        AFe1oSDK aFe1oSDK;
        int i = 2 % 2;
        int i2 = onTransact + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            aFe1oSDK = (AFe1oSDK) createAnimator.onNavigationEvent(NetworkModule.IAuthTabCallback.onExtraCallbackWithResult(context, accessgetstatep, g1Var, cookieJar));
            int i3 = 91 / 0;
        } else {
            aFe1oSDK = (AFe1oSDK) createAnimator.onNavigationEvent(NetworkModule.IAuthTabCallback.onExtraCallbackWithResult(context, accessgetstatep, g1Var, cookieJar));
        }
        int i4 = IAuthTabCallback + 61;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return aFe1oSDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
