package o;

import android.app.PendingIntent;
import android.content.Intent;
import android.widget.RemoteViews;
import androidx.glance.appwidget.RemoteCollectionItems;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PagerStateExternalSyntheticLambda1 {
    public static final void onExtraCallback(@NotNull RemoteViews remoteViews, @NotNull LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0, @NotNull AndroidPrefetchSchedulerExternalSyntheticLambda0 androidPrefetchSchedulerExternalSyntheticLambda0) {
        onExtraCallback(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, androidPrefetchSchedulerExternalSyntheticLambda0, LazyListStateKtExternalSyntheticLambda1.onNavigationEvent(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, LazyGridDslKtExternalSyntheticLambda0.List, androidPrefetchSchedulerExternalSyntheticLambda0.onExtraCallbackWithResult()));
    }

    private static final void onExtraCallback(RemoteViews remoteViews, LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0, LazyLayoutBeyondBoundsProviderModifierNodeExternalSyntheticLambda0 lazyLayoutBeyondBoundsProviderModifierNodeExternalSyntheticLambda0, LazyListStateCompanionExternalSyntheticLambda0 lazyListStateCompanionExternalSyntheticLambda0) {
        if (lazyGridItemProviderImplExternalSyntheticLambda0.IAuthTabCallbackStubProxy()) {
            throw new IllegalStateException("Glance does not support nested list views.");
        }
        remoteViews.setPendingIntentTemplate(lazyListStateCompanionExternalSyntheticLambda0.IAuthTabCallback(), PendingIntent.getActivity(lazyGridItemProviderImplExternalSyntheticLambda0.asBinder(), 0, new Intent(), 184549384, lazyLayoutBeyondBoundsProviderModifierNodeExternalSyntheticLambda0.onExtraCallback()));
        RemoteCollectionItems.Builder builder = new RemoteCollectionItems.Builder();
        LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0IAuthTabCallback = lazyGridItemProviderImplExternalSyntheticLambda0.IAuthTabCallback(lazyListStateCompanionExternalSyntheticLambda0.IAuthTabCallback());
        boolean z = false;
        int i2 = 0;
        for (Object obj : lazyLayoutBeyondBoundsProviderModifierNodeExternalSyntheticLambda0.IAuthTabCallback()) {
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            CacheWindowLogicExternalSyntheticLambda1 cacheWindowLogicExternalSyntheticLambda1 = (RulerAlignmentKtExternalSyntheticLambda1) obj;
            Intrinsics.checkNotNull(cacheWindowLogicExternalSyntheticLambda1, "");
            long jIAuthTabCallbackDefault = cacheWindowLogicExternalSyntheticLambda1.IAuthTabCallbackDefault();
            LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0OnExtraCallbackWithResult = lazyGridItemProviderImplExternalSyntheticLambda0IAuthTabCallback.onExtraCallbackWithResult(i2, 1048576);
            List listListOf = CollectionsKt.listOf(cacheWindowLogicExternalSyntheticLambda1);
            LazyListStateCompanionExternalSyntheticLambda3 lazyListStateCompanionExternalSyntheticLambda3IAuthTabCallbackStub = lazyGridItemProviderImplExternalSyntheticLambda0.IAuthTabCallbackStub();
            builder.onNavigationEvent(jIAuthTabCallbackDefault, androidx.glance.appwidget.RemoteViewsTranslatorKt.onWarmupCompleted(lazyGridItemProviderImplExternalSyntheticLambda0OnExtraCallbackWithResult, listListOf, lazyListStateCompanionExternalSyntheticLambda3IAuthTabCallbackStub != null ? lazyListStateCompanionExternalSyntheticLambda3IAuthTabCallbackStub.onNavigationEvent(cacheWindowLogicExternalSyntheticLambda1) : -1));
            z = z || jIAuthTabCallbackDefault > -4611686018427387904L;
            i2++;
        }
        builder.onExtraCallbackWithResult(z);
        builder.onExtraCallbackWithResult(LazyListStateKtExternalSyntheticLambda1.IAuthTabCallback());
        LazyListStateCompanionExternalSyntheticLambda1.onNavigationEvent(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0.asBinder(), lazyGridItemProviderImplExternalSyntheticLambda0.onExtraCallback(), lazyListStateCompanionExternalSyntheticLambda0.IAuthTabCallback(), androidx.glance.appwidget.RemoteViewsTranslatorKt.onExtraCallbackWithResult(lazyGridItemProviderImplExternalSyntheticLambda0.getInterfaceDescriptor()), builder.onWarmupCompleted());
        LazyDslKtExternalSyntheticLambda0.IAuthTabCallback(lazyGridItemProviderImplExternalSyntheticLambda0, remoteViews, lazyLayoutBeyondBoundsProviderModifierNodeExternalSyntheticLambda0.onExtraCallbackWithResult(), lazyListStateCompanionExternalSyntheticLambda0);
    }

    public static final void IAuthTabCallback(@NotNull RemoteViews remoteViews, @NotNull LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0, @NotNull CacheWindowLogicExternalSyntheticLambda1 cacheWindowLogicExternalSyntheticLambda1) {
        if (cacheWindowLogicExternalSyntheticLambda1.IAuthTabCallback().size() != 1 || !Intrinsics.areEqual(cacheWindowLogicExternalSyntheticLambda1.onExtraCallback(), ToggleableNodeExternalSyntheticLambda1.Companion.onExtraCallback())) {
            throw new IllegalArgumentException("Lazy list items can only have a single child align at the center start of the view. The normalization of the composition tree failed.");
        }
        androidx.glance.appwidget.RemoteViewsTranslatorKt.onNavigationEvent(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, (RulerAlignmentKtExternalSyntheticLambda1) CollectionsKt.first(cacheWindowLogicExternalSyntheticLambda1.IAuthTabCallback()));
    }
}
