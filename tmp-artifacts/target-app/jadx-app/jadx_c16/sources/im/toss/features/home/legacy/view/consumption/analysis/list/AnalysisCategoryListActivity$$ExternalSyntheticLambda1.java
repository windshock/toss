package im.toss.features.home.legacy.view.consumption.analysis.list;

import com.facebook.react.uimanager.LayoutShadowNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.removePlugin;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AnalysisCategoryListActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ removePlugin f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ AnalysisCategoryListActivity$$ExternalSyntheticLambda1(removePlugin removeplugin, String str) {
        this.f$0 = removeplugin;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) AnalysisCategoryListActivity.onNavigationEvent(-1533646514, new Object[]{this.f$0, this.f$1, (SetDetectableSize) obj}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1533646518, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
        int i4 = onNavigationEvent + 9;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }
}
