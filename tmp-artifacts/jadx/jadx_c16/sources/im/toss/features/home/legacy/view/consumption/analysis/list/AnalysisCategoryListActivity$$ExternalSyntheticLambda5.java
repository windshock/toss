package im.toss.features.home.legacy.view.consumption.analysis.list;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.deserializeUriNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AnalysisCategoryListActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ AnalysisCategoryListActivity f$1;

    public /* synthetic */ AnalysisCategoryListActivity$$ExternalSyntheticLambda5(boolean z, AnalysisCategoryListActivity analysisCategoryListActivity) {
        this.f$0 = z;
        this.f$1 = analysisCategoryListActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = AnalysisCategoryListActivity.onWarmupCompleted(this.f$0, this.f$1, (deserializeUriNullableCollection) obj);
        int i4 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
