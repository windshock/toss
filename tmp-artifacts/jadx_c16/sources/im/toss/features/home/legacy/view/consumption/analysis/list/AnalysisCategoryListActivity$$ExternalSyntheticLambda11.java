package im.toss.features.home.legacy.view.consumption.analysis.list;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AnalysisCategoryListActivity$$ExternalSyntheticLambda11 implements deserializeFloat {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AnalysisCategoryListActivity.asBinder(this.f$0, obj);
        int i4 = onWarmupCompleted + 99;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
