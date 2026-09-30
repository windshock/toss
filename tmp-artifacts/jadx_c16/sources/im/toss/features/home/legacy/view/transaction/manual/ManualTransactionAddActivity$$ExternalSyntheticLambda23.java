package im.toss.features.home.legacy.view.transaction.manual;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionAddActivity$$ExternalSyntheticLambda23 implements View.OnTouchListener {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ ManualTransactionAddActivity f$0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            ManualTransactionAddActivity.onExtraCallbackWithResult(this.f$0, view, motionEvent);
            throw null;
        }
        boolean zOnExtraCallbackWithResult = ManualTransactionAddActivity.onExtraCallbackWithResult(this.f$0, view, motionEvent);
        int i3 = onWarmupCompleted + 29;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallbackWithResult;
    }
}
