package im.toss.features.home.ui.view.currency;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CurrencyCalculatorActivity$$ExternalSyntheticLambda6 implements View.OnTouchListener {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CurrencyCalculatorActivity f$0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CurrencyCalculatorActivity currencyCalculatorActivity = this.f$0;
        if (i3 == 0) {
            return CurrencyCalculatorActivity.IAuthTabCallbackStubProxy(currencyCalculatorActivity, view, motionEvent);
        }
        CurrencyCalculatorActivity.IAuthTabCallbackStubProxy(currencyCalculatorActivity, view, motionEvent);
        throw null;
    }
}
