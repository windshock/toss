package im.toss.feature.credit.ui.main.home;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHomeActivity$$ExternalSyntheticLambda67 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditHomeActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CreditHomeActivity.onExtraCallback(this.f$0, view);
        int i4 = onWarmupCompleted + 69;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
