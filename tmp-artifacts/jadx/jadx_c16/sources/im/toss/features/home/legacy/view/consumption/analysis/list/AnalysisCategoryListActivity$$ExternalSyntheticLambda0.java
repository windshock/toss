package im.toss.features.home.legacy.view.consumption.analysis.list;

import kotlin.jvm.functions.Function1;
import o.FlipperPlugin;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AnalysisCategoryListActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ FlipperPlugin f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        FlipperPlugin flipperPlugin = this.f$0;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i3 == 0) {
            return AnalysisCategoryListActivity.IAuthTabCallback(flipperPlugin, setDetectableSize);
        }
        AnalysisCategoryListActivity.IAuthTabCallback(flipperPlugin, setDetectableSize);
        throw null;
    }
}
