package o;

import im.toss.components.tuba.trigger.internal.TubaTriggerModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LifecycleRequestDelegate implements captureStartValues<OkHttpNetworkFetcherExternalSyntheticLambda5> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final createAnimators<OkHttpNetworkFetcherExternalSyntheticLambda3> onExtraCallbackWithResult;
    private final createAnimators<UtilsKtExternalSyntheticLambda9> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        OkHttpNetworkFetcherExternalSyntheticLambda5 okHttpNetworkFetcherExternalSyntheticLambda5OnExtraCallback = onExtraCallback();
        int i4 = onExtraCallback + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return okHttpNetworkFetcherExternalSyntheticLambda5OnExtraCallback;
    }

    public OkHttpNetworkFetcherExternalSyntheticLambda5 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.onExtraCallbackWithResult.get();
        if (i3 != 0) {
            return onExtraCallbackWithResult((OkHttpNetworkFetcherExternalSyntheticLambda3) obj, (UtilsKtExternalSyntheticLambda9) this.onWarmupCompleted.get());
        }
        int i4 = 65 / 0;
        return onExtraCallbackWithResult((OkHttpNetworkFetcherExternalSyntheticLambda3) obj, (UtilsKtExternalSyntheticLambda9) this.onWarmupCompleted.get());
    }

    public static OkHttpNetworkFetcherExternalSyntheticLambda5 onExtraCallbackWithResult(OkHttpNetworkFetcherExternalSyntheticLambda3 okHttpNetworkFetcherExternalSyntheticLambda3, UtilsKtExternalSyntheticLambda9 utilsKtExternalSyntheticLambda9) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        OkHttpNetworkFetcherExternalSyntheticLambda5 okHttpNetworkFetcherExternalSyntheticLambda5 = (OkHttpNetworkFetcherExternalSyntheticLambda5) createAnimator.onNavigationEvent(TubaTriggerModule.onNavigationEvent.IAuthTabCallback(okHttpNetworkFetcherExternalSyntheticLambda3, utilsKtExternalSyntheticLambda9));
        if (i3 == 0) {
            return okHttpNetworkFetcherExternalSyntheticLambda5;
        }
        throw null;
    }
}
