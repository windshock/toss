package im.toss.features.home.ui.view.currency;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CurrencyCalculatorActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CurrencyCalculatorActivity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ CurrencyCalculatorActivity$$ExternalSyntheticLambda2(CurrencyCalculatorActivity currencyCalculatorActivity, String str, String str2) {
        this.f$0 = currencyCalculatorActivity;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = CurrencyCalculatorActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = onExtraCallback + 41;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
