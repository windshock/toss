package im.toss.features.fx;

import android.view.View;
import im.toss.features.fx.FxIntroActivity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxIntroActivity$FxHistoryAdapter$$ExternalSyntheticLambda7 implements View.OnClickListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ FxIntroActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        FxIntroActivity.onNavigationEvent.IAuthTabCallback(this.f$0, view);
        int i4 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
