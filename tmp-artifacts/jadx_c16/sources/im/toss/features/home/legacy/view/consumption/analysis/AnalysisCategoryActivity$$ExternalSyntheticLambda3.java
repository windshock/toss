package im.toss.features.home.legacy.view.consumption.analysis;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.deserializeUriNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AnalysisCategoryActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ AnalysisCategoryActivity f$1;

    public /* synthetic */ AnalysisCategoryActivity$$ExternalSyntheticLambda3(boolean z, AnalysisCategoryActivity analysisCategoryActivity) {
        this.f$0 = z;
        this.f$1 = analysisCategoryActivity;
    }

    public final Object invoke(Object obj) {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnNavigationEvent = AnalysisCategoryActivity.onNavigationEvent(this.f$0, this.f$1, (deserializeUriNullableCollection) obj);
            int i3 = 55 / 0;
        } else {
            unitOnNavigationEvent = AnalysisCategoryActivity.onNavigationEvent(this.f$0, this.f$1, (deserializeUriNullableCollection) obj);
        }
        int i4 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
