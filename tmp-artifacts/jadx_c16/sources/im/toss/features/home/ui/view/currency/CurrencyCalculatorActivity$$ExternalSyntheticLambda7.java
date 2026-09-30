package im.toss.features.home.ui.view.currency;

import android.view.MotionEvent;
import android.view.View;
import o.setAutoCaptured;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CurrencyCalculatorActivity$$ExternalSyntheticLambda7 implements View.OnTouchListener {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CurrencyCalculatorActivity f$0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0, view, motionEvent};
            int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
            ((Boolean) CurrencyCalculatorActivity.onNavigationEvent(78367305, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, setAutoCaptured.onExtraCallbackWithResult(), -78367297)).booleanValue();
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.f$0, view, motionEvent};
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) CurrencyCalculatorActivity.onNavigationEvent(78367305, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr2, setAutoCaptured.onExtraCallbackWithResult(), -78367297)).booleanValue();
        int i3 = onWarmupCompleted + 1;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }
}
