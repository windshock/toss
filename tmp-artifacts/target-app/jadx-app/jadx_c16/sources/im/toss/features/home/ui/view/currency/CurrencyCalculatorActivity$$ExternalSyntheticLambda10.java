package im.toss.features.home.ui.view.currency;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CurrencyCalculatorActivity$$ExternalSyntheticLambda10 implements View.OnClickListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ CurrencyCalculatorActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            CurrencyCalculatorActivity.onExtraCallback(this.f$0, view);
            throw null;
        }
        CurrencyCalculatorActivity.onExtraCallback(this.f$0, view);
        int i3 = onExtraCallback + 37;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 86 / 0;
        }
    }
}
