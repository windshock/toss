package o;

import android.graphics.drawable.Icon;
import android.widget.RemoteViews;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class PagerStateExternalSyntheticLambda0 {
    public static final PagerStateExternalSyntheticLambda0 onWarmupCompleted = new PagerStateExternalSyntheticLambda0();

    private PagerStateExternalSyntheticLambda0() {
    }

    public final void onWarmupCompleted(@NotNull RemoteViews remoteViews, int i2, @NotNull Icon icon) {
        remoteViews.setImageViewIcon(i2, icon);
    }
}
