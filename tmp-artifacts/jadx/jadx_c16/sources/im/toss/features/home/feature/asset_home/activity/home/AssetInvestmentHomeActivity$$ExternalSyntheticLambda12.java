package im.toss.features.home.feature.asset_home.activity.home;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import o.SessionProcessorCaptureCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetInvestmentHomeActivity$$ExternalSyntheticLambda12 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Pair[] f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Pair[] pairArr = this.f$0;
        SessionProcessorCaptureCallback sessionProcessorCaptureCallback = (SessionProcessorCaptureCallback) obj;
        if (i3 != 0) {
            return AssetInvestmentHomeActivity.onWarmupCompleted(pairArr, sessionProcessorCaptureCallback);
        }
        AssetInvestmentHomeActivity.onWarmupCompleted(pairArr, sessionProcessorCaptureCallback);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
