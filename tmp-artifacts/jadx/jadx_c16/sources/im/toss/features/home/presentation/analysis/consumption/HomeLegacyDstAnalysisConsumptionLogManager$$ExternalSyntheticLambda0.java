package im.toss.features.home.presentation.analysis.consumption;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getExtendScope;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeLegacyDstAnalysisConsumptionLogManager$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Map f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ HomeLegacyDstAnalysisConsumptionLogManager$$ExternalSyntheticLambda0(Map map, String str) {
        this.f$0 = map;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Map map = this.f$0;
        if (i3 != 0) {
            return getExtendScope.onWarmupCompleted(map, this.f$1, (SetDetectableSize) obj);
        }
        getExtendScope.onWarmupCompleted(map, this.f$1, (SetDetectableSize) obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
