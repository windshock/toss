package im.toss.features.alltab.feature.total_service.feature.total_service;

import kotlin.jvm.functions.Function1;
import o.TabBarModel;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceViewModel$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ TotalServiceViewModel f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ TotalServiceViewModel$$ExternalSyntheticLambda0(TotalServiceViewModel totalServiceViewModel, String str, int i) {
        this.f$0 = totalServiceViewModel;
        this.f$1 = str;
        this.f$2 = i;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TotalServiceViewModel totalServiceViewModel = this.f$0;
        if (i3 != 0) {
            return TotalServiceViewModel.onExtraCallbackWithResult(totalServiceViewModel, this.f$1, this.f$2, (TabBarModel) obj);
        }
        TotalServiceViewModel.onExtraCallbackWithResult(totalServiceViewModel, this.f$1, this.f$2, (TabBarModel) obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
