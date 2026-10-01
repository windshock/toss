package im.toss.feature.credit.ui.history.list;

import androidx.lifecycle.ViewModel;
import im.toss.feature.credit.ui.history.CreditHistoryViewModel;
import kotlin.jvm.functions.Function1;
import o.enableNebulaServiceInitOpt;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHistoryActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ enableNebulaServiceInitOpt f$0;
    public final /* synthetic */ CreditHistoryActivity f$1;

    public /* synthetic */ CreditHistoryActivity$$ExternalSyntheticLambda0(enableNebulaServiceInitOpt enablenebulaserviceinitopt, CreditHistoryActivity creditHistoryActivity) {
        this.f$0 = enablenebulaserviceinitopt;
        this.f$1 = creditHistoryActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ViewModel viewModelOnWarmupCompleted = CreditHistoryActivity.onWarmupCompleted(this.f$0, this.f$1, (CreditHistoryViewModel.onExtraCallback) obj);
        int i4 = onNavigationEvent + 71;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return viewModelOnWarmupCompleted;
    }
}
