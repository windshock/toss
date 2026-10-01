package o;

import android.widget.RemoteViews;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.unit.ResourceColorProvider;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class PagerMeasurePolicyKtrememberPagerMeasurePolicy11ExternalSyntheticLambda0 {
    public static final PagerMeasurePolicyKtrememberPagerMeasurePolicy11ExternalSyntheticLambda0 onWarmupCompleted = new PagerMeasurePolicyKtrememberPagerMeasurePolicy11ExternalSyntheticLambda0();

    private PagerMeasurePolicyKtrememberPagerMeasurePolicy11ExternalSyntheticLambda0() {
    }

    public final void onExtraCallback(@NotNull LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0, @NotNull RemoteViews remoteViews, @NotNull BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda11, int i2) {
        if (basicTextKtExternalSyntheticLambda11 instanceof SelectableGroupKtExternalSyntheticLambda0) {
            SelectableGroupKtExternalSyntheticLambda0 selectableGroupKtExternalSyntheticLambda0 = (SelectableGroupKtExternalSyntheticLambda0) basicTextKtExternalSyntheticLambda11;
            PagerMeasureKtExternalSyntheticLambda4.onExtraCallback(remoteViews, i2, selectableGroupKtExternalSyntheticLambda0.onExtraCallback(), selectableGroupKtExternalSyntheticLambda0.onWarmupCompleted());
        } else if (basicTextKtExternalSyntheticLambda11 instanceof ResourceColorProvider) {
            RemoteViewsCompat.onExtraCallbackWithResult(remoteViews, i2, ((ResourceColorProvider) basicTextKtExternalSyntheticLambda11).onNavigationEvent());
        } else {
            RemoteViewsCompat.onWarmupCompleted(remoteViews, i2, ByteOrderedDataOutputStream.onNavigationEvent(basicTextKtExternalSyntheticLambda11.IAuthTabCallback(lazyGridItemProviderImplExternalSyntheticLambda0.asBinder())));
        }
    }
}
