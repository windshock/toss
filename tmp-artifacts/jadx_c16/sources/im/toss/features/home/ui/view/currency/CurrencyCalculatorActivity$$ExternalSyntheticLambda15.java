package im.toss.features.home.ui.view.currency;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CurrencyCalculatorActivity$$ExternalSyntheticLambda15 implements View.OnClickListener {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CurrencyCalculatorActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CurrencyCalculatorActivity.asBinder(this.f$0, view);
        int i4 = onNavigationEvent + 5;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
