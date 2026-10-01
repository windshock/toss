package o;

import android.content.res.ColorStateList;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.unit.ResourceColorProvider;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PagerLazyLayoutItemProviderExternalSyntheticLambda1 {
    public static final void IAuthTabCallback(@NotNull RemoteViews remoteViews, @NotNull LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0, @NotNull LazyListMeasureKtExternalSyntheticLambda0 lazyListMeasureKtExternalSyntheticLambda0) {
        LazyListStateCompanionExternalSyntheticLambda0 lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent = LazyListStateKtExternalSyntheticLambda1.onNavigationEvent(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, LazyGridDslKtExternalSyntheticLambda0.CircularProgressIndicator, lazyListMeasureKtExternalSyntheticLambda0.onExtraCallbackWithResult());
        remoteViews.setProgressBar(lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), 0, 0, true);
        if (Build.VERSION.SDK_INT >= 31) {
            BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda11OnWarmupCompleted = lazyListMeasureKtExternalSyntheticLambda0.onWarmupCompleted();
            if (basicTextKtExternalSyntheticLambda11OnWarmupCompleted instanceof BasicTextKtExternalSyntheticLambda14) {
                RemoteViewsCompat.onExtraCallbackWithResult(remoteViews, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), ColorStateList.valueOf(ByteOrderedDataOutputStream.onNavigationEvent(((BasicTextKtExternalSyntheticLambda14) basicTextKtExternalSyntheticLambda11OnWarmupCompleted).IAuthTabCallback())));
            } else if (basicTextKtExternalSyntheticLambda11OnWarmupCompleted instanceof ResourceColorProvider) {
                RemoteViewsCompat.asInterface(remoteViews, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), ((ResourceColorProvider) basicTextKtExternalSyntheticLambda11OnWarmupCompleted).onNavigationEvent());
            } else if (basicTextKtExternalSyntheticLambda11OnWarmupCompleted instanceof SelectableGroupKtExternalSyntheticLambda0) {
                SelectableGroupKtExternalSyntheticLambda0 selectableGroupKtExternalSyntheticLambda0 = (SelectableGroupKtExternalSyntheticLambda0) basicTextKtExternalSyntheticLambda11OnWarmupCompleted;
                RemoteViewsCompat.IAuthTabCallback(remoteViews, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), ColorStateList.valueOf(ByteOrderedDataOutputStream.onNavigationEvent(selectableGroupKtExternalSyntheticLambda0.onExtraCallback())), ColorStateList.valueOf(ByteOrderedDataOutputStream.onNavigationEvent(selectableGroupKtExternalSyntheticLambda0.onWarmupCompleted())));
            } else {
                Objects.toString(basicTextKtExternalSyntheticLambda11OnWarmupCompleted);
            }
        }
        LazyDslKtExternalSyntheticLambda0.IAuthTabCallback(lazyGridItemProviderImplExternalSyntheticLambda0, remoteViews, lazyListMeasureKtExternalSyntheticLambda0.onExtraCallbackWithResult(), lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent);
    }
}
