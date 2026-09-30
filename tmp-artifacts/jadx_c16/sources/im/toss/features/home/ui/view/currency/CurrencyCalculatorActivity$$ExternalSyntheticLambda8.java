package im.toss.features.home.ui.view.currency;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CurrencyCalculatorActivity$$ExternalSyntheticLambda8 implements View.OnTouchListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CurrencyCalculatorActivity f$0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsInterface = CurrencyCalculatorActivity.asInterface(this.f$0, view, motionEvent);
        int i4 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return zAsInterface;
        }
        throw null;
    }
}
