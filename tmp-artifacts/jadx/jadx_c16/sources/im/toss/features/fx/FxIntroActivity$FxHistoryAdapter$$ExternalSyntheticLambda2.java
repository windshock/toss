package im.toss.features.fx;

import im.toss.features.fx.FxIntroActivity;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.AppMsgReceiver2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxIntroActivity$FxHistoryAdapter$$ExternalSyntheticLambda2 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ FxIntroActivity.onNavigationEvent f$0;
    public final /* synthetic */ FxIntroActivity f$1;

    public /* synthetic */ FxIntroActivity$FxHistoryAdapter$$ExternalSyntheticLambda2(FxIntroActivity.onNavigationEvent onnavigationevent, FxIntroActivity fxIntroActivity) {
        this.f$0 = onnavigationevent;
        this.f$1 = fxIntroActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unit = (Unit) FxIntroActivity.onNavigationEvent.onExtraCallback(new Object[]{this.f$0, this.f$1, (AppMsgReceiver2) obj, (FxIntroActivity.onExtraCallback) obj2}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -700128776, 700128777);
            int i3 = 30 / 0;
        } else {
            unit = (Unit) FxIntroActivity.onNavigationEvent.onExtraCallback(new Object[]{this.f$0, this.f$1, (AppMsgReceiver2) obj, (FxIntroActivity.onExtraCallback) obj2}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -700128776, 700128777);
        }
        int i4 = onExtraCallbackWithResult + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
