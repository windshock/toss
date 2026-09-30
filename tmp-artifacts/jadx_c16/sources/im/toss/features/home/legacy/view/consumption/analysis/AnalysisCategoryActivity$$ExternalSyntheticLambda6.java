package im.toss.features.home.legacy.view.consumption.analysis;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AnalysisCategoryActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ AnalysisCategoryActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = AnalysisCategoryActivity.onExtraCallback(this.f$0, (ArrayList) obj);
        int i4 = onExtraCallback + 65;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
