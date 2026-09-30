package o;

import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.appwidget.R;
import androidx.glance.appwidget.unit.ResourceCheckableColorProvider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PagerMeasureKtExternalSyntheticLambda2 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void onWarmupCompleted(@NotNull RemoteViews remoteViews, @NotNull LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0, @NotNull LazyListKtrememberLazyListMeasurePolicy11ExternalSyntheticLambda0 lazyListKtrememberLazyListMeasurePolicy11ExternalSyntheticLambda0) throws NoWhenBranchMatchedException {
        LazyGridDslKtExternalSyntheticLambda0 lazyGridDslKtExternalSyntheticLambda0;
        int i2;
        int iOnWarmupCompleted;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            lazyGridDslKtExternalSyntheticLambda0 = LazyGridDslKtExternalSyntheticLambda0.CheckBox;
        } else {
            lazyGridDslKtExternalSyntheticLambda0 = LazyGridDslKtExternalSyntheticLambda0.CheckBoxBackport;
        }
        LazyListStateCompanionExternalSyntheticLambda0 lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent = LazyListStateKtExternalSyntheticLambda1.onNavigationEvent(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, lazyGridDslKtExternalSyntheticLambda0, lazyListKtrememberLazyListMeasurePolicy11ExternalSyntheticLambda0.onExtraCallbackWithResult());
        if (i3 >= 31) {
            iOnWarmupCompleted = LazyGridKtrememberLazyGridMeasurePolicy11ExternalSyntheticLambda0.onWarmupCompleted(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, R.id.checkBox, 0, (Integer) null, 12, (Object) null);
            PagerMeasureKtExternalSyntheticLambda0.onWarmupCompleted.onNavigationEvent(remoteViews, iOnWarmupCompleted, lazyListKtrememberLazyListMeasurePolicy11ExternalSyntheticLambda0.onExtraCallback());
            BringIntoViewRequesterImplExternalSyntheticLambda0 bringIntoViewRequesterImplExternalSyntheticLambda0OnWarmupCompleted = lazyListKtrememberLazyListMeasurePolicy11ExternalSyntheticLambda0.asBinder().onWarmupCompleted();
            if (bringIntoViewRequesterImplExternalSyntheticLambda0OnWarmupCompleted instanceof PagerWrapperFlingBehaviorExternalSyntheticLambda0) {
                PagerStateExternalSyntheticLambda2 pagerStateExternalSyntheticLambda2OnWarmupCompleted = PagerMeasureKtExternalSyntheticLambda1.onWarmupCompleted((PagerWrapperFlingBehaviorExternalSyntheticLambda0) bringIntoViewRequesterImplExternalSyntheticLambda0OnWarmupCompleted, lazyGridItemProviderImplExternalSyntheticLambda0.asBinder());
                RemoteViewsCompat.onExtraCallbackWithResult(remoteViews, iOnWarmupCompleted, pagerStateExternalSyntheticLambda2OnWarmupCompleted.onWarmupCompleted(), pagerStateExternalSyntheticLambda2OnWarmupCompleted.IAuthTabCallback());
            } else {
                if (!(bringIntoViewRequesterImplExternalSyntheticLambda0OnWarmupCompleted instanceof ResourceCheckableColorProvider)) {
                    throw new NoWhenBranchMatchedException();
                }
                RemoteViewsCompat.onExtraCallback(remoteViews, iOnWarmupCompleted, ((ResourceCheckableColorProvider) bringIntoViewRequesterImplExternalSyntheticLambda0OnWarmupCompleted).IAuthTabCallback());
            }
            Unit unit = Unit.INSTANCE;
            i2 = iOnWarmupCompleted;
        } else {
            int iOnWarmupCompleted2 = LazyGridKtrememberLazyGridMeasurePolicy11ExternalSyntheticLambda0.onWarmupCompleted(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, R.id.checkBoxIcon, 0, (Integer) null, 12, (Object) null);
            int iOnWarmupCompleted3 = LazyGridKtrememberLazyGridMeasurePolicy11ExternalSyntheticLambda0.onWarmupCompleted(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, R.id.checkBoxText, 0, (Integer) null, 12, (Object) null);
            int iIAuthTabCallback = lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback();
            LazyGridKtrememberLazyGridMeasurePolicy11ExternalSyntheticLambda0.onWarmupCompleted(remoteViews, iOnWarmupCompleted2, lazyListKtrememberLazyListMeasurePolicy11ExternalSyntheticLambda0.onExtraCallback());
            PagerMeasureKtExternalSyntheticLambda1.onExtraCallbackWithResult(remoteViews, iOnWarmupCompleted2, PagerMeasureKtExternalSyntheticLambda1.onExtraCallback(lazyListKtrememberLazyListMeasurePolicy11ExternalSyntheticLambda0.asBinder().onWarmupCompleted(), lazyGridItemProviderImplExternalSyntheticLambda0.asBinder(), lazyListKtrememberLazyListMeasurePolicy11ExternalSyntheticLambda0.onExtraCallback()));
            i2 = iOnWarmupCompleted3;
            iOnWarmupCompleted = iIAuthTabCallback;
        }
        PagerStateExternalSyntheticLambda3.onNavigationEvent(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, i2, lazyListKtrememberLazyListMeasurePolicy11ExternalSyntheticLambda0.IAuthTabCallbackStub(), lazyListKtrememberLazyListMeasurePolicy11ExternalSyntheticLambda0.onWarmupCompleted(), lazyListKtrememberLazyListMeasurePolicy11ExternalSyntheticLambda0.IAuthTabCallback(), 16);
        LazyDslKtExternalSyntheticLambda0.IAuthTabCallback(lazyGridItemProviderImplExternalSyntheticLambda0.onNavigationEvent(iOnWarmupCompleted), remoteViews, lazyListKtrememberLazyListMeasurePolicy11ExternalSyntheticLambda0.onExtraCallbackWithResult(), lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent);
    }
}
