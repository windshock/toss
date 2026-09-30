package im.toss.features.home.ui.view.currency;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CurrencyCalculatorActivity$$ExternalSyntheticLambda11 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CurrencyCalculatorActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CurrencyCalculatorActivity.IAuthTabCallbackDefault(this.f$0, view);
        int i4 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
