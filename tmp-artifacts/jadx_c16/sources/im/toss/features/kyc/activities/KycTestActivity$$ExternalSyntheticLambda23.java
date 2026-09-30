package im.toss.features.kyc.activities;

import android.view.View;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycTestActivity$$ExternalSyntheticLambda23 implements View.OnClickListener {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ KycTestActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, view};
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        KycTestActivity.onExtraCallbackWithResult(objArr, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback, 1950797746, iOnExtraCallback2, -1950797732);
        int i4 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
    }
}
