package im.toss.features.kyc.activities;

import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setExtraJsT2MapStr;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycTestActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ KycTestActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (setExtraJsT2MapStr) obj};
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        Unit unit = (Unit) KycTestActivity.onExtraCallbackWithResult(objArr, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback, -811583352, iOnExtraCallback2, 811583357);
        int i4 = IAuthTabCallback + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
