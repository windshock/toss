package im.toss.feature.credit.ui.main.home.raise_edge_case;

import android.view.View;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPerfectScoreActivity$$ExternalSyntheticLambda3 implements View.OnClickListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ CreditPerfectScoreActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, view};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        CreditPerfectScoreActivity.onExtraCallbackWithResult(984190934, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), -984190931, iOnWarmupCompleted, objArr);
        int i4 = onExtraCallback + 77;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
