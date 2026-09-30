package im.toss.features.home.feature.cashflow;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getJSONArray;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowAnalysisViewModel$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ getJSONArray.onNavigationEvent f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ CashflowAnalysisViewModel$$ExternalSyntheticLambda2(String str, getJSONArray.onNavigationEvent onnavigationevent, String str2, String str3) {
        this.f$0 = str;
        this.f$1 = onnavigationevent;
        this.f$2 = str2;
        this.f$3 = str3;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f$0;
        if (i3 == 0) {
            return CashflowAnalysisViewModel.onExtraCallback(str, this.f$1, this.f$2, this.f$3, (SetDetectableSize) obj);
        }
        CashflowAnalysisViewModel.onExtraCallback(str, this.f$1, this.f$2, this.f$3, (SetDetectableSize) obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
