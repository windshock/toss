package im.toss.features.home.presentation.consumption_home;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeConsumptionHomeListFragment$$ExternalSyntheticLambda25 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ RecyclerView.ViewHolder f$0;
    public final /* synthetic */ float f$1;

    public /* synthetic */ HomeConsumptionHomeListFragment$$ExternalSyntheticLambda25(RecyclerView.ViewHolder viewHolder, float f) {
        this.f$0 = viewHolder;
        this.f$1 = f;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(HomeConsumptionHomeListFragment.onExtraCallback(this.f$0, this.f$1));
        int i4 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
