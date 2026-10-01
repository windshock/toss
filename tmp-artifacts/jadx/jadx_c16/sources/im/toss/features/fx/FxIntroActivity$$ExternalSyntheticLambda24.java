package im.toss.features.fx;

import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxIntroActivity$$ExternalSyntheticLambda24 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ FxIntroActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        FxIntroActivity fxIntroActivity = this.f$0;
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) obj;
        if (i3 != 0) {
            return FxIntroActivity.onExtraCallbackWithResult(fxIntroActivity, commonModule_setLeftEdgeTouchEnabled);
        }
        FxIntroActivity.onExtraCallbackWithResult(fxIntroActivity, commonModule_setLeftEdgeTouchEnabled);
        throw null;
    }
}
