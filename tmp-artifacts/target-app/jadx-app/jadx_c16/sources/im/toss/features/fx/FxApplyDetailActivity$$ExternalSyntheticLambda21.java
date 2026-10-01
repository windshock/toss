package im.toss.features.fx;

import com.facebook.react.uimanager.LayoutShadowNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.registerCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxApplyDetailActivity$$ExternalSyntheticLambda21 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ FxApplyDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Unit unit = (Unit) FxApplyDetailActivity.onNavigationEvent(-2096990127, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{this.f$0, (registerCallback) obj}, 2096990133, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i3 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 5 / 0;
        }
        return unit;
    }
}
