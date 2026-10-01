package im.toss.features.fx;

import im.toss.features.fx.FxIntroActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.registerCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxIntroActivity$FxHistoryAdapter$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ FxIntroActivity f$0;
    public final /* synthetic */ registerCallback f$1;

    public /* synthetic */ FxIntroActivity$FxHistoryAdapter$$ExternalSyntheticLambda1(FxIntroActivity fxIntroActivity, registerCallback registercallback) {
        this.f$0 = fxIntroActivity;
        this.f$1 = registercallback;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        FxIntroActivity fxIntroActivity = this.f$0;
        if (i3 != 0) {
            return FxIntroActivity.onNavigationEvent.IAuthTabCallback(fxIntroActivity, this.f$1, (SetDetectableSize) obj);
        }
        Unit unitIAuthTabCallback = FxIntroActivity.onNavigationEvent.IAuthTabCallback(fxIntroActivity, this.f$1, (SetDetectableSize) obj);
        int i4 = 58 / 0;
        return unitIAuthTabCallback;
    }
}
