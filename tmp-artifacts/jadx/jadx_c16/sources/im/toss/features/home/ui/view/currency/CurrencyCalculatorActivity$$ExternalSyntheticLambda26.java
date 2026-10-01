package im.toss.features.home.ui.view.currency;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CurrencyCalculatorActivity$$ExternalSyntheticLambda26 implements View.OnTouchListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CurrencyCalculatorActivity f$0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            CurrencyCalculatorActivity.onExtraCallback(this.f$0, view, motionEvent);
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallback = CurrencyCalculatorActivity.onExtraCallback(this.f$0, view, motionEvent);
        int i3 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return zOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }
}
