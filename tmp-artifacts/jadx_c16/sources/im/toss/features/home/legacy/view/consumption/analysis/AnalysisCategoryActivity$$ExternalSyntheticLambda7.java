package im.toss.features.home.legacy.view.consumption.analysis;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AnalysisCategoryActivity$$ExternalSyntheticLambda7 implements deserializeFloat {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AnalysisCategoryActivity.onWarmupCompleted(this.f$0, obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
