package im.toss.features.home.legacy.view.consumption.analysis.list;

import java.util.List;
import kotlin.jvm.functions.Function1;
import o.NativeToastAndroidSpec;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AnalysisCategoryListActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AnalysisCategoryListActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        List listOnWarmupCompleted = AnalysisCategoryListActivity.onWarmupCompleted(this.f$0, (NativeToastAndroidSpec) obj);
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return listOnWarmupCompleted;
    }
}
