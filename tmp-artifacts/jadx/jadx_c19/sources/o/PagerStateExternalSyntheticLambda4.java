package o;

import android.content.res.ColorStateList;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.unit.ResourceColorProvider;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PagerStateExternalSyntheticLambda4 {
    public static final void onExtraCallback(@NotNull RemoteViews remoteViews, @NotNull LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0, @NotNull LazyListItemProviderKtExternalSyntheticLambda1 lazyListItemProviderKtExternalSyntheticLambda1) {
        LazyListStateCompanionExternalSyntheticLambda0 lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent = LazyListStateKtExternalSyntheticLambda1.onNavigationEvent(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, LazyGridDslKtExternalSyntheticLambda0.LinearProgressIndicator, lazyListItemProviderKtExternalSyntheticLambda1.onExtraCallbackWithResult());
        remoteViews.setProgressBar(lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), 100, (int) (lazyListItemProviderKtExternalSyntheticLambda1.IAuthTabCallbackDefault() * 100.0f), lazyListItemProviderKtExternalSyntheticLambda1.onWarmupCompleted());
        if (Build.VERSION.SDK_INT >= 31) {
            BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda11IAuthTabCallback = lazyListItemProviderKtExternalSyntheticLambda1.IAuthTabCallback();
            if (basicTextKtExternalSyntheticLambda11IAuthTabCallback instanceof BasicTextKtExternalSyntheticLambda14) {
                RemoteViewsCompat.IAuthTabCallback(remoteViews, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), ColorStateList.valueOf(ByteOrderedDataOutputStream.onNavigationEvent(((BasicTextKtExternalSyntheticLambda14) basicTextKtExternalSyntheticLambda11IAuthTabCallback).IAuthTabCallback())));
            } else if (basicTextKtExternalSyntheticLambda11IAuthTabCallback instanceof ResourceColorProvider) {
                RemoteViewsCompat.IAuthTabCallbackDefault(remoteViews, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), ((ResourceColorProvider) basicTextKtExternalSyntheticLambda11IAuthTabCallback).onNavigationEvent());
            } else if (basicTextKtExternalSyntheticLambda11IAuthTabCallback instanceof SelectableGroupKtExternalSyntheticLambda0) {
                SelectableGroupKtExternalSyntheticLambda0 selectableGroupKtExternalSyntheticLambda0 = (SelectableGroupKtExternalSyntheticLambda0) basicTextKtExternalSyntheticLambda11IAuthTabCallback;
                RemoteViewsCompat.onNavigationEvent(remoteViews, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), ColorStateList.valueOf(ByteOrderedDataOutputStream.onNavigationEvent(selectableGroupKtExternalSyntheticLambda0.onExtraCallback())), ColorStateList.valueOf(ByteOrderedDataOutputStream.onNavigationEvent(selectableGroupKtExternalSyntheticLambda0.onWarmupCompleted())));
            } else {
                Objects.toString(basicTextKtExternalSyntheticLambda11IAuthTabCallback);
            }
            BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda11OnExtraCallback = lazyListItemProviderKtExternalSyntheticLambda1.onExtraCallback();
            if (basicTextKtExternalSyntheticLambda11OnExtraCallback instanceof BasicTextKtExternalSyntheticLambda14) {
                RemoteViewsCompat.onExtraCallback(remoteViews, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), ColorStateList.valueOf(ByteOrderedDataOutputStream.onNavigationEvent(((BasicTextKtExternalSyntheticLambda14) basicTextKtExternalSyntheticLambda11OnExtraCallback).IAuthTabCallback())));
            } else if (basicTextKtExternalSyntheticLambda11OnExtraCallback instanceof ResourceColorProvider) {
                RemoteViewsCompat.asBinder(remoteViews, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), ((ResourceColorProvider) basicTextKtExternalSyntheticLambda11OnExtraCallback).onNavigationEvent());
            } else if (basicTextKtExternalSyntheticLambda11OnExtraCallback instanceof SelectableGroupKtExternalSyntheticLambda0) {
                SelectableGroupKtExternalSyntheticLambda0 selectableGroupKtExternalSyntheticLambda02 = (SelectableGroupKtExternalSyntheticLambda0) basicTextKtExternalSyntheticLambda11OnExtraCallback;
                RemoteViewsCompat.onExtraCallback(remoteViews, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), ColorStateList.valueOf(ByteOrderedDataOutputStream.onNavigationEvent(selectableGroupKtExternalSyntheticLambda02.onExtraCallback())), ColorStateList.valueOf(ByteOrderedDataOutputStream.onNavigationEvent(selectableGroupKtExternalSyntheticLambda02.onWarmupCompleted())));
            } else {
                Objects.toString(basicTextKtExternalSyntheticLambda11OnExtraCallback);
            }
        }
        LazyDslKtExternalSyntheticLambda0.IAuthTabCallback(lazyGridItemProviderImplExternalSyntheticLambda0, remoteViews, lazyListItemProviderKtExternalSyntheticLambda1.onExtraCallbackWithResult(), lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent);
    }
}
