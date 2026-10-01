package o;

import android.widget.RemoteViews;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PagerMeasureKtExternalSyntheticLambda0 {
    public static final PagerMeasureKtExternalSyntheticLambda0 onWarmupCompleted = new PagerMeasureKtExternalSyntheticLambda0();

    private PagerMeasureKtExternalSyntheticLambda0() {
    }

    public final void onNavigationEvent(@NotNull RemoteViews remoteViews, int i2, boolean z) {
        remoteViews.setCompoundButtonChecked(i2, z);
    }
}
