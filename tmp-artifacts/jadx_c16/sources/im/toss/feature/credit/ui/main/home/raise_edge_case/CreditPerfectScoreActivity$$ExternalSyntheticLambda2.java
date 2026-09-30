package im.toss.feature.credit.ui.main.home.raise_edge_case;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPerfectScoreActivity$$ExternalSyntheticLambda2 implements View.OnClickListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditPerfectScoreActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CreditPerfectScoreActivity.onExtraCallbackWithResult(this.f$0, view);
        int i4 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
