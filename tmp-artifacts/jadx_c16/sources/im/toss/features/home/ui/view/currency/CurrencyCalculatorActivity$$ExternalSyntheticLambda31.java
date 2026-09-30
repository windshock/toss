package im.toss.features.home.ui.view.currency;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CurrencyCalculatorActivity$$ExternalSyntheticLambda31 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CurrencyCalculatorActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ CurrencyCalculatorActivity$$ExternalSyntheticLambda31(CurrencyCalculatorActivity currencyCalculatorActivity, int i) {
        this.f$0 = currencyCalculatorActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            CurrencyCalculatorActivity.onNavigationEvent(this.f$0, this.f$1, ((Float) obj).floatValue());
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = CurrencyCalculatorActivity.onNavigationEvent(this.f$0, this.f$1, ((Float) obj).floatValue());
        int i3 = onExtraCallbackWithResult + 3;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
