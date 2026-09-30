package im.toss.features.home.ui.view.currency;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CurrencyCalculatorActivity$$ExternalSyntheticLambda20 implements View.OnTouchListener {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CurrencyCalculatorActivity f$0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = CurrencyCalculatorActivity.IAuthTabCallback(this.f$0, view, motionEvent);
        int i4 = IAuthTabCallback + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return zIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
