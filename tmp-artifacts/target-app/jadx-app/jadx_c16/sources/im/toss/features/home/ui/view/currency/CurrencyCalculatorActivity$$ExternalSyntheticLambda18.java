package im.toss.features.home.ui.view.currency;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CurrencyCalculatorActivity$$ExternalSyntheticLambda18 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CurrencyCalculatorActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CurrencyCalculatorActivity.IAuthTabCallback(this.f$0, view);
        int i4 = onExtraCallback + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
    }
}
