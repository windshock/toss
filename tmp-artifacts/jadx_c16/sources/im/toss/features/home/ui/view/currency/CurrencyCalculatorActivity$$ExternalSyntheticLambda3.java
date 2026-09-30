package im.toss.features.home.ui.view.currency;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CurrencyCalculatorActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CurrencyCalculatorActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = CurrencyCalculatorActivity.onExtraCallback(this.f$0, (SetDetectableSize) obj);
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return unitOnExtraCallback;
    }
}
