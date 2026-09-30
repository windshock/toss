package im.toss.features.home.ui.view.currency;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CurrencyCalculatorActivity$$ExternalSyntheticLambda5 implements View.OnClickListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CurrencyCalculatorActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            CurrencyCalculatorActivity.onWarmupCompleted(this.f$0, view);
            obj.hashCode();
            throw null;
        }
        CurrencyCalculatorActivity.onWarmupCompleted(this.f$0, view);
        int i3 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
