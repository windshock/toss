package im.toss.features.home.legacy.view.consumption.analysis.list;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AnalysisCategoryListActivity$$ExternalSyntheticLambda8 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ AnalysisCategoryListActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            AnalysisCategoryListActivity.onExtraCallbackWithResult(this.f$0, (List) obj);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = AnalysisCategoryListActivity.onExtraCallbackWithResult(this.f$0, (List) obj);
        int i3 = onNavigationEvent + 93;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 86 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
