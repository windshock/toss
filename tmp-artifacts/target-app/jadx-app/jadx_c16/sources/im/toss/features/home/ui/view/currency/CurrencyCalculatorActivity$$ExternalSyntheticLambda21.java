package im.toss.features.home.ui.view.currency;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CurrencyCalculatorActivity$$ExternalSyntheticLambda21 implements View.OnTouchListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CurrencyCalculatorActivity f$0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = CurrencyCalculatorActivity.onExtraCallbackWithResult(this.f$0, view, motionEvent);
        int i4 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }
}
