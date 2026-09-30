package im.toss.features.home.core.ui.recyclerview;

import im.toss.features.home.core.ui.recyclerview.HomeRecyclerView;
import kotlin.Pair;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeRecyclerView$$ExternalSyntheticLambda6 implements HomeRecyclerView.onNavigationEvent {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final Pair getExtraSpace() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return HomeRecyclerView.onExtraCallback();
        }
        HomeRecyclerView.onExtraCallback();
        throw null;
    }
}
