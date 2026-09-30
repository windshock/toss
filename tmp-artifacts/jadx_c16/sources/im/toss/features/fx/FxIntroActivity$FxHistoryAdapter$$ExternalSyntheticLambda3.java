package im.toss.features.fx;

import im.toss.features.fx.FxIntroActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.AppMsgReceiver2;
import o.registerCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxIntroActivity$FxHistoryAdapter$$ExternalSyntheticLambda3 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ FxIntroActivity.onNavigationEvent f$0;
    public final /* synthetic */ FxIntroActivity f$1;

    public /* synthetic */ FxIntroActivity$FxHistoryAdapter$$ExternalSyntheticLambda3(FxIntroActivity.onNavigationEvent onnavigationevent, FxIntroActivity fxIntroActivity) {
        this.f$0 = onnavigationevent;
        this.f$1 = fxIntroActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        FxIntroActivity.onNavigationEvent onnavigationevent = this.f$0;
        if (i3 != 0) {
            return FxIntroActivity.onNavigationEvent.onNavigationEvent(onnavigationevent, this.f$1, (AppMsgReceiver2) obj, (registerCallback) obj2);
        }
        Unit unitOnNavigationEvent = FxIntroActivity.onNavigationEvent.onNavigationEvent(onnavigationevent, this.f$1, (AppMsgReceiver2) obj, (registerCallback) obj2);
        int i4 = 78 / 0;
        return unitOnNavigationEvent;
    }
}
