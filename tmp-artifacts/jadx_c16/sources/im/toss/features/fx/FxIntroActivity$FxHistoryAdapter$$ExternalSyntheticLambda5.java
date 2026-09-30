package im.toss.features.fx;

import android.view.View;
import im.toss.features.fx.FxIntroActivity;
import o.registerCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxIntroActivity$FxHistoryAdapter$$ExternalSyntheticLambda5 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ FxIntroActivity f$0;
    public final /* synthetic */ registerCallback f$1;

    public /* synthetic */ FxIntroActivity$FxHistoryAdapter$$ExternalSyntheticLambda5(FxIntroActivity fxIntroActivity, registerCallback registercallback) {
        this.f$0 = fxIntroActivity;
        this.f$1 = registercallback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        FxIntroActivity.onNavigationEvent.onNavigationEvent(this.f$0, this.f$1, view);
        int i4 = onWarmupCompleted + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
    }
}
