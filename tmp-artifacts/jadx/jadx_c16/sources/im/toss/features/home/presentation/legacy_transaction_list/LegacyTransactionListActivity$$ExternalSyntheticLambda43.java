package im.toss.features.home.presentation.legacy_transaction_list;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda43 implements View.OnTouchListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = LegacyTransactionListActivity.onWarmupCompleted(view, motionEvent);
        int i4 = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return zOnWarmupCompleted;
    }
}
