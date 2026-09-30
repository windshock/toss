package im.toss.features.home.ui.view.currency;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import o.RenderInTransitionOverlayNodeElement;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CurrencyCalculatorActivity$$ExternalSyntheticLambda27 implements RenderInTransitionOverlayNodeElement {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ CurrencyCalculatorActivity f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ CurrencyCalculatorActivity$$ExternalSyntheticLambda27(CurrencyCalculatorActivity currencyCalculatorActivity, int i, int i2) {
        this.f$0 = currencyCalculatorActivity;
        this.f$1 = i;
        this.f$2 = i2;
    }

    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CurrencyCalculatorActivity currencyCalculatorActivity = this.f$0;
        if (i3 != 0) {
            return CurrencyCalculatorActivity.onExtraCallback(currencyCalculatorActivity, this.f$1, this.f$2, view, windowInsetsCompat);
        }
        CurrencyCalculatorActivity.onExtraCallback(currencyCalculatorActivity, this.f$1, this.f$2, view, windowInsetsCompat);
        throw null;
    }
}
