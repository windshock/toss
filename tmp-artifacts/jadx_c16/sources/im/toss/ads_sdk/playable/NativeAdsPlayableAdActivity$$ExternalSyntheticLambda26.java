package im.toss.ads_sdk.playable;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda26 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnWarmupCompleted = NativeAdsPlayableAdActivity.onWarmupCompleted(this.f$0, (JSONObject) obj);
            int i3 = 46 / 0;
        } else {
            unitOnWarmupCompleted = NativeAdsPlayableAdActivity.onWarmupCompleted(this.f$0, (JSONObject) obj);
        }
        int i4 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
