package o;

import android.view.ViewGroup;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class SearchBarKtExternalSyntheticLambda14$onNavigationEvent {
    static void onExtraCallback(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }

    static int onNavigationEvent(ViewGroup viewGroup, int i2) {
        return viewGroup.getChildDrawingOrder(i2);
    }
}
