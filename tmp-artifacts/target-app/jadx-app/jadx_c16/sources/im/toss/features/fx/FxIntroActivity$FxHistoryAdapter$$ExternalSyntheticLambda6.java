package im.toss.features.fx;

import android.view.View;
import im.toss.features.fx.FxIntroActivity;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import o.registerCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxIntroActivity$FxHistoryAdapter$$ExternalSyntheticLambda6 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ FxIntroActivity.onNavigationEvent f$0;
    public final /* synthetic */ registerCallback f$1;
    public final /* synthetic */ FxIntroActivity f$2;

    public /* synthetic */ FxIntroActivity$FxHistoryAdapter$$ExternalSyntheticLambda6(FxIntroActivity.onNavigationEvent onnavigationevent, registerCallback registercallback, FxIntroActivity fxIntroActivity) {
        this.f$0 = onnavigationevent;
        this.f$1 = registercallback;
        this.f$2 = fxIntroActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        FxIntroActivity.onNavigationEvent.onExtraCallback(new Object[]{this.f$0, this.f$1, this.f$2, view}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -1646488054, 1646488054);
        int i4 = IAuthTabCallback + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
    }
}
