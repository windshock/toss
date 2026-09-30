package im.toss.features.home.ui.view.currency;

import android.view.View;
import o.AccessControlException;
import o.setPluginsInfo;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CurrencyCalculatorActivity$$ExternalSyntheticLambda29 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CurrencyCalculatorActivity f$0;
    public final /* synthetic */ setPluginsInfo f$1;
    public final /* synthetic */ AccessControlException f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ CurrencyCalculatorActivity$$ExternalSyntheticLambda29(CurrencyCalculatorActivity currencyCalculatorActivity, setPluginsInfo setpluginsinfo, AccessControlException accessControlException, String str) {
        this.f$0 = currencyCalculatorActivity;
        this.f$1 = setpluginsinfo;
        this.f$2 = accessControlException;
        this.f$3 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CurrencyCalculatorActivity currencyCalculatorActivity = this.f$0;
        if (i3 == 0) {
            CurrencyCalculatorActivity.onWarmupCompleted(currencyCalculatorActivity, this.f$1, this.f$2, this.f$3, view);
            return;
        }
        CurrencyCalculatorActivity.onWarmupCompleted(currencyCalculatorActivity, this.f$1, this.f$2, this.f$3, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
