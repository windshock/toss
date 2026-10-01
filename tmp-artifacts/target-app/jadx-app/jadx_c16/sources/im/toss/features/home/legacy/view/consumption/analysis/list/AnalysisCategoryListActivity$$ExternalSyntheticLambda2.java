package im.toss.features.home.legacy.view.consumption.analysis.list;

import com.facebook.react.uimanager.LayoutShadowNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.FlipperPlugin;
import o.NativeVibrationSpec;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AnalysisCategoryListActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ FlipperPlugin f$0;
    public final /* synthetic */ NativeVibrationSpec f$1;

    public /* synthetic */ AnalysisCategoryListActivity$$ExternalSyntheticLambda2(FlipperPlugin flipperPlugin, NativeVibrationSpec nativeVibrationSpec) {
        this.f$0 = flipperPlugin;
        this.f$1 = nativeVibrationSpec;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        FlipperPlugin flipperPlugin = this.f$0;
        if (i3 == 0) {
            return (Unit) AnalysisCategoryListActivity.onNavigationEvent(168580884, new Object[]{flipperPlugin, this.f$1, (SetDetectableSize) obj}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -168580879, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        }
        throw null;
    }
}
