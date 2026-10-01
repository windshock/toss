package o;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.appwidget.RemoteCollectionItems;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.LazyLayoutItemAnimationExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PagerStateKtExternalSyntheticLambda1 {
    public static final void onWarmupCompleted(@NotNull RemoteViews remoteViews, @NotNull LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0, @NotNull AwaitFirstLayoutModifierNodeExternalSyntheticLambda0 awaitFirstLayoutModifierNodeExternalSyntheticLambda0) {
        onNavigationEvent(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, awaitFirstLayoutModifierNodeExternalSyntheticLambda0, LazyListStateKtExternalSyntheticLambda1.onNavigationEvent(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, onExtraCallbackWithResult(awaitFirstLayoutModifierNodeExternalSyntheticLambda0.IAuthTabCallbackDefault()), awaitFirstLayoutModifierNodeExternalSyntheticLambda0.onExtraCallbackWithResult()));
    }

    private static final void onNavigationEvent(RemoteViews remoteViews, LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0, AwaitFirstLayoutModifierNodeExternalSyntheticLambda0 awaitFirstLayoutModifierNodeExternalSyntheticLambda0, LazyListStateCompanionExternalSyntheticLambda0 lazyListStateCompanionExternalSyntheticLambda0) {
        int iOnExtraCallbackWithResult;
        if (lazyGridItemProviderImplExternalSyntheticLambda0.IAuthTabCallbackStubProxy()) {
            throw new IllegalStateException("Glance does not support nested list views.");
        }
        LazyLayoutItemAnimationExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallbackDefault = awaitFirstLayoutModifierNodeExternalSyntheticLambda0.IAuthTabCallbackDefault();
        if ((onextracallbackwithresultIAuthTabCallbackDefault instanceof LazyLayoutItemAnimationExternalSyntheticLambda0.onExtraCallbackWithResult) && ((iOnExtraCallbackWithResult = onextracallbackwithresultIAuthTabCallbackDefault.onExtraCallbackWithResult()) <= 0 || iOnExtraCallbackWithResult >= 6)) {
            throw new IllegalArgumentException("Only counts from 1 to 5 are supported.");
        }
        remoteViews.setPendingIntentTemplate(lazyListStateCompanionExternalSyntheticLambda0.IAuthTabCallback(), PendingIntent.getActivity(lazyGridItemProviderImplExternalSyntheticLambda0.asBinder(), 0, new Intent(), 184549384, awaitFirstLayoutModifierNodeExternalSyntheticLambda0.onExtraCallback()));
        RemoteCollectionItems.Builder builder = new RemoteCollectionItems.Builder();
        LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0IAuthTabCallback = lazyGridItemProviderImplExternalSyntheticLambda0.IAuthTabCallback(lazyListStateCompanionExternalSyntheticLambda0.IAuthTabCallback());
        boolean z = false;
        int i2 = 0;
        for (Object obj : awaitFirstLayoutModifierNodeExternalSyntheticLambda0.IAuthTabCallback()) {
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            LazyLayoutItemAnimatorItemInfoExternalSyntheticLambda0 lazyLayoutItemAnimatorItemInfoExternalSyntheticLambda0 = (RulerAlignmentKtExternalSyntheticLambda1) obj;
            Intrinsics.checkNotNull(lazyLayoutItemAnimatorItemInfoExternalSyntheticLambda0, "");
            long jAsInterface = lazyLayoutItemAnimatorItemInfoExternalSyntheticLambda0.asInterface();
            LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0OnExtraCallbackWithResult = lazyGridItemProviderImplExternalSyntheticLambda0IAuthTabCallback.onExtraCallbackWithResult(i2, 1048576);
            List listListOf = CollectionsKt.listOf(lazyLayoutItemAnimatorItemInfoExternalSyntheticLambda0);
            LazyListStateCompanionExternalSyntheticLambda3 lazyListStateCompanionExternalSyntheticLambda3IAuthTabCallbackStub = lazyGridItemProviderImplExternalSyntheticLambda0.IAuthTabCallbackStub();
            builder.onNavigationEvent(jAsInterface, androidx.glance.appwidget.RemoteViewsTranslatorKt.onWarmupCompleted(lazyGridItemProviderImplExternalSyntheticLambda0OnExtraCallbackWithResult, listListOf, lazyListStateCompanionExternalSyntheticLambda3IAuthTabCallbackStub != null ? lazyListStateCompanionExternalSyntheticLambda3IAuthTabCallbackStub.onNavigationEvent(lazyLayoutItemAnimatorItemInfoExternalSyntheticLambda0) : -1));
            z = z || jAsInterface > -4611686018427387904L;
            i2++;
        }
        builder.onExtraCallbackWithResult(z);
        builder.onExtraCallbackWithResult(LazyListStateKtExternalSyntheticLambda1.IAuthTabCallback());
        LazyListStateCompanionExternalSyntheticLambda1.onNavigationEvent(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0.asBinder(), lazyGridItemProviderImplExternalSyntheticLambda0.onExtraCallback(), lazyListStateCompanionExternalSyntheticLambda0.IAuthTabCallback(), androidx.glance.appwidget.RemoteViewsTranslatorKt.onExtraCallbackWithResult(lazyGridItemProviderImplExternalSyntheticLambda0.getInterfaceDescriptor()), builder.onWarmupCompleted());
        if (Build.VERSION.SDK_INT >= 31 && (onextracallbackwithresultIAuthTabCallbackDefault instanceof LazyLayoutItemAnimationExternalSyntheticLambda0.onNavigationEvent)) {
            RemoteViewsCompat.onWarmupCompleted(remoteViews, lazyListStateCompanionExternalSyntheticLambda0.IAuthTabCallback(), ((LazyLayoutItemAnimationExternalSyntheticLambda0.onNavigationEvent) onextracallbackwithresultIAuthTabCallbackDefault).onExtraCallbackWithResult(), 1);
        }
        LazyDslKtExternalSyntheticLambda0.IAuthTabCallback(lazyGridItemProviderImplExternalSyntheticLambda0, remoteViews, awaitFirstLayoutModifierNodeExternalSyntheticLambda0.onExtraCallbackWithResult(), lazyListStateCompanionExternalSyntheticLambda0);
    }

    public static final void onWarmupCompleted(@NotNull RemoteViews remoteViews, @NotNull LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0, @NotNull LazyLayoutItemAnimatorItemInfoExternalSyntheticLambda0 lazyLayoutItemAnimatorItemInfoExternalSyntheticLambda0) {
        if (lazyLayoutItemAnimatorItemInfoExternalSyntheticLambda0.IAuthTabCallback().size() != 1 || !Intrinsics.areEqual(lazyLayoutItemAnimatorItemInfoExternalSyntheticLambda0.onExtraCallback(), ToggleableNodeExternalSyntheticLambda1.Companion.onExtraCallback())) {
            throw new IllegalArgumentException("Lazy vertical grid items can only have a single child align at the center start of the view. The normalization of the composition tree failed.");
        }
        androidx.glance.appwidget.RemoteViewsTranslatorKt.onNavigationEvent(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, (RulerAlignmentKtExternalSyntheticLambda1) CollectionsKt.first(lazyLayoutItemAnimatorItemInfoExternalSyntheticLambda0.IAuthTabCallback()));
    }

    private static final LazyGridDslKtExternalSyntheticLambda0 onExtraCallbackWithResult(LazyLayoutItemAnimationExternalSyntheticLambda0 lazyLayoutItemAnimationExternalSyntheticLambda0) {
        return Intrinsics.areEqual(lazyLayoutItemAnimationExternalSyntheticLambda0, new LazyLayoutItemAnimationExternalSyntheticLambda0.onExtraCallbackWithResult(1)) ? LazyGridDslKtExternalSyntheticLambda0.VerticalGridOneColumn : Intrinsics.areEqual(lazyLayoutItemAnimationExternalSyntheticLambda0, new LazyLayoutItemAnimationExternalSyntheticLambda0.onExtraCallbackWithResult(2)) ? LazyGridDslKtExternalSyntheticLambda0.VerticalGridTwoColumns : Intrinsics.areEqual(lazyLayoutItemAnimationExternalSyntheticLambda0, new LazyLayoutItemAnimationExternalSyntheticLambda0.onExtraCallbackWithResult(3)) ? LazyGridDslKtExternalSyntheticLambda0.VerticalGridThreeColumns : Intrinsics.areEqual(lazyLayoutItemAnimationExternalSyntheticLambda0, new LazyLayoutItemAnimationExternalSyntheticLambda0.onExtraCallbackWithResult(4)) ? LazyGridDslKtExternalSyntheticLambda0.VerticalGridFourColumns : Intrinsics.areEqual(lazyLayoutItemAnimationExternalSyntheticLambda0, new LazyLayoutItemAnimationExternalSyntheticLambda0.onExtraCallbackWithResult(5)) ? LazyGridDslKtExternalSyntheticLambda0.VerticalGridFiveColumns : LazyGridDslKtExternalSyntheticLambda0.VerticalGridAutoFit;
    }
}
