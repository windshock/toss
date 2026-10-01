package im.toss.features.home.core.ui.widget;

import im.toss.features.home.core.ui.recyclerview.HomeRecyclerView;
import kotlin.Pair;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstView$$ExternalSyntheticLambda0 implements HomeRecyclerView.onNavigationEvent {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ HomeDstView f$0;

    public final Pair getExtraSpace() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Pair pairOnExtraCallback = HomeDstView.onExtraCallback(this.f$0);
        int i4 = onExtraCallback + 95;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return pairOnExtraCallback;
    }
}
