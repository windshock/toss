package o;

import im.toss.tosssecurities.tuba.internal.di.SecuritiesVarsModule;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setAdvertisingId implements captureStartValues<AFe1cSDK> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final createAnimators<AFe1qSDK> IAuthTabCallback;
    private final createAnimators<AFe1mSDK> onExtraCallbackWithResult;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AFe1cSDK aFe1cSDKIAuthTabCallback = IAuthTabCallback();
        int i4 = onExtraCallback + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return aFe1cSDKIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AFe1cSDK IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.onExtraCallbackWithResult.get();
        if (i3 == 0) {
            return onExtraCallbackWithResult((AFe1mSDK) obj, (AFe1qSDK) this.IAuthTabCallback.get());
        }
        int i4 = 66 / 0;
        return onExtraCallbackWithResult((AFe1mSDK) obj, (AFe1qSDK) this.IAuthTabCallback.get());
    }

    public static AFe1cSDK onExtraCallbackWithResult(AFe1mSDK aFe1mSDK, AFe1qSDK aFe1qSDK) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AFe1cSDK aFe1cSDK = (AFe1cSDK) createAnimator.onNavigationEvent(SecuritiesVarsModule.onNavigationEvent.onWarmupCompleted(aFe1mSDK, aFe1qSDK));
        int i4 = onExtraCallback + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return aFe1cSDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
