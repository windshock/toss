package o;

import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.appwidget.R;
import androidx.glance.appwidget.unit.ResourceCheckableColorProvider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PagerStateKtExternalSyntheticLambda0 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void IAuthTabCallback(@NotNull RemoteViews remoteViews, @NotNull LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0, @NotNull LazyListMeasureKtExternalSyntheticLambda2 lazyListMeasureKtExternalSyntheticLambda2) throws NoWhenBranchMatchedException {
        LazyGridDslKtExternalSyntheticLambda0 lazyGridDslKtExternalSyntheticLambda0;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            lazyGridDslKtExternalSyntheticLambda0 = LazyGridDslKtExternalSyntheticLambda0.Swtch;
        } else {
            lazyGridDslKtExternalSyntheticLambda0 = LazyGridDslKtExternalSyntheticLambda0.SwtchBackport;
        }
        Context contextAsBinder = lazyGridItemProviderImplExternalSyntheticLambda0.asBinder();
        LazyListStateCompanionExternalSyntheticLambda0 lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent = LazyListStateKtExternalSyntheticLambda1.onNavigationEvent(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, lazyGridDslKtExternalSyntheticLambda0, lazyListMeasureKtExternalSyntheticLambda2.onExtraCallbackWithResult());
        if (i3 >= 31) {
            int iIAuthTabCallback = lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback();
            PagerMeasureKtExternalSyntheticLambda0.onWarmupCompleted.onNavigationEvent(remoteViews, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), lazyListMeasureKtExternalSyntheticLambda2.onExtraCallback());
            BringIntoViewRequesterImplExternalSyntheticLambda0 bringIntoViewRequesterImplExternalSyntheticLambda0OnExtraCallbackWithResult = lazyListMeasureKtExternalSyntheticLambda2.onTransact().onExtraCallbackWithResult();
            if (bringIntoViewRequesterImplExternalSyntheticLambda0OnExtraCallbackWithResult instanceof PagerWrapperFlingBehaviorExternalSyntheticLambda0) {
                PagerStateExternalSyntheticLambda2 pagerStateExternalSyntheticLambda2OnWarmupCompleted = PagerMeasureKtExternalSyntheticLambda1.onWarmupCompleted((PagerWrapperFlingBehaviorExternalSyntheticLambda0) bringIntoViewRequesterImplExternalSyntheticLambda0OnExtraCallbackWithResult, contextAsBinder);
                RemoteViewsCompat.onWarmupCompleted(remoteViews, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), pagerStateExternalSyntheticLambda2OnWarmupCompleted.onWarmupCompleted(), pagerStateExternalSyntheticLambda2OnWarmupCompleted.IAuthTabCallback());
            } else if (bringIntoViewRequesterImplExternalSyntheticLambda0OnExtraCallbackWithResult instanceof ResourceCheckableColorProvider) {
                RemoteViewsCompat.IAuthTabCallbackStub(remoteViews, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), ((ResourceCheckableColorProvider) bringIntoViewRequesterImplExternalSyntheticLambda0OnExtraCallbackWithResult).IAuthTabCallback());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            Unit unit = Unit.INSTANCE;
            BringIntoViewRequesterImplExternalSyntheticLambda0 bringIntoViewRequesterImplExternalSyntheticLambda0OnWarmupCompleted = lazyListMeasureKtExternalSyntheticLambda2.onTransact().onWarmupCompleted();
            if (bringIntoViewRequesterImplExternalSyntheticLambda0OnWarmupCompleted instanceof PagerWrapperFlingBehaviorExternalSyntheticLambda0) {
                PagerStateExternalSyntheticLambda2 pagerStateExternalSyntheticLambda2OnWarmupCompleted2 = PagerMeasureKtExternalSyntheticLambda1.onWarmupCompleted((PagerWrapperFlingBehaviorExternalSyntheticLambda0) bringIntoViewRequesterImplExternalSyntheticLambda0OnWarmupCompleted, contextAsBinder);
                RemoteViewsCompat.asBinder(remoteViews, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), pagerStateExternalSyntheticLambda2OnWarmupCompleted2.onWarmupCompleted(), pagerStateExternalSyntheticLambda2OnWarmupCompleted2.IAuthTabCallback());
            } else {
                if (!(bringIntoViewRequesterImplExternalSyntheticLambda0OnWarmupCompleted instanceof ResourceCheckableColorProvider)) {
                    throw new NoWhenBranchMatchedException();
                }
                RemoteViewsCompat.onTransact(remoteViews, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), ((ResourceCheckableColorProvider) bringIntoViewRequesterImplExternalSyntheticLambda0OnWarmupCompleted).IAuthTabCallback());
            }
            i2 = iIAuthTabCallback;
        } else {
            int iOnWarmupCompleted = LazyGridKtrememberLazyGridMeasurePolicy11ExternalSyntheticLambda0.onWarmupCompleted(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, R.id.switchText, 0, (Integer) null, 12, (Object) null);
            int iOnWarmupCompleted2 = LazyGridKtrememberLazyGridMeasurePolicy11ExternalSyntheticLambda0.onWarmupCompleted(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, R.id.switchThumb, 0, (Integer) null, 12, (Object) null);
            int iOnWarmupCompleted3 = LazyGridKtrememberLazyGridMeasurePolicy11ExternalSyntheticLambda0.onWarmupCompleted(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, R.id.switchTrack, 0, (Integer) null, 12, (Object) null);
            LazyGridKtrememberLazyGridMeasurePolicy11ExternalSyntheticLambda0.onWarmupCompleted(remoteViews, iOnWarmupCompleted2, lazyListMeasureKtExternalSyntheticLambda2.onExtraCallback());
            LazyGridKtrememberLazyGridMeasurePolicy11ExternalSyntheticLambda0.onWarmupCompleted(remoteViews, iOnWarmupCompleted3, lazyListMeasureKtExternalSyntheticLambda2.onExtraCallback());
            PagerMeasureKtExternalSyntheticLambda1.onExtraCallbackWithResult(remoteViews, iOnWarmupCompleted2, PagerMeasureKtExternalSyntheticLambda1.onExtraCallback(lazyListMeasureKtExternalSyntheticLambda2.onTransact().onExtraCallbackWithResult(), contextAsBinder, lazyListMeasureKtExternalSyntheticLambda2.onExtraCallback()));
            PagerMeasureKtExternalSyntheticLambda1.onExtraCallbackWithResult(remoteViews, iOnWarmupCompleted3, PagerMeasureKtExternalSyntheticLambda1.onExtraCallback(lazyListMeasureKtExternalSyntheticLambda2.onTransact().onWarmupCompleted(), contextAsBinder, lazyListMeasureKtExternalSyntheticLambda2.onExtraCallback()));
            i2 = iOnWarmupCompleted;
        }
        PagerStateExternalSyntheticLambda3.onNavigationEvent(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, i2, lazyListMeasureKtExternalSyntheticLambda2.IAuthTabCallbackStub(), lazyListMeasureKtExternalSyntheticLambda2.onWarmupCompleted(), lazyListMeasureKtExternalSyntheticLambda2.IAuthTabCallback(), 16);
        LazyDslKtExternalSyntheticLambda0.IAuthTabCallback(lazyGridItemProviderImplExternalSyntheticLambda0, remoteViews, lazyListMeasureKtExternalSyntheticLambda2.onExtraCallbackWithResult(), lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent);
    }
}
