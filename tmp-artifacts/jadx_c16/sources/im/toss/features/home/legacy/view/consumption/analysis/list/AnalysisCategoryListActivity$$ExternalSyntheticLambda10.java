package im.toss.features.home.legacy.view.consumption.analysis.list;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AnalysisCategoryListActivity$$ExternalSyntheticLambda10 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AnalysisCategoryListActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AnalysisCategoryListActivity analysisCategoryListActivity = this.f$0;
        Throwable th = (Throwable) obj;
        if (i3 == 0) {
            return AnalysisCategoryListActivity.onExtraCallback(analysisCategoryListActivity, th);
        }
        Unit unitOnExtraCallback = AnalysisCategoryListActivity.onExtraCallback(analysisCategoryListActivity, th);
        int i4 = 56 / 0;
        return unitOnExtraCallback;
    }
}
