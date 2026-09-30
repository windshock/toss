package im.toss.ads_sdk.playable;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.nSetPosition;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda27 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            return (Unit) NativeAdsPlayableAdActivity.onNavigationEvent(iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -120247755, 120247774, new Object[0]);
        }
        int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = nSetPosition.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
