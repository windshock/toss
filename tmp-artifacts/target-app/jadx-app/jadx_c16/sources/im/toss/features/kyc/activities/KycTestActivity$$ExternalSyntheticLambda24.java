package im.toss.features.kyc.activities;

import android.view.View;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycTestActivity$$ExternalSyntheticLambda24 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ KycTestActivity f$0;

    public final Object invoke(Object obj) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0, (View) obj};
            int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            unit = (Unit) KycTestActivity.onExtraCallbackWithResult(objArr, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback, -1530128625, iOnExtraCallback2, 1530128631);
            int i3 = 8 / 0;
        } else {
            Object[] objArr2 = {this.f$0, (View) obj};
            int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            int iOnExtraCallback4 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
            unit = (Unit) KycTestActivity.onExtraCallbackWithResult(objArr2, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback3, -1530128625, iOnExtraCallback4, 1530128631);
        }
        int i4 = IAuthTabCallback + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
