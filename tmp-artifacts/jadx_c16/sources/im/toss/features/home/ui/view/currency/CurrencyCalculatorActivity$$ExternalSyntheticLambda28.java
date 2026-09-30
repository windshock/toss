package im.toss.features.home.ui.view.currency;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.setAutoCaptured;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CurrencyCalculatorActivity$$ExternalSyntheticLambda28 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CurrencyCalculatorActivity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ CurrencyCalculatorActivity$$ExternalSyntheticLambda28(CurrencyCalculatorActivity currencyCalculatorActivity, String str, String str2) {
        this.f$0 = currencyCalculatorActivity;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        Unit unit = (Unit) CurrencyCalculatorActivity.onNavigationEvent(1245300970, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, setAutoCaptured.onExtraCallbackWithResult(), -1245300966);
        int i4 = onNavigationEvent + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
