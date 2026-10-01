package androidx.glance.appwidget.translators;

import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.appwidget.R;
import androidx.glance.appwidget.unit.ResourceCheckableColorProvider;
import o.BringIntoViewRequesterImplExternalSyntheticLambda0;
import o.LazyDslKtExternalSyntheticLambda0;
import o.LazyGridDslKtExternalSyntheticLambda0;
import o.LazyGridItemProviderImplExternalSyntheticLambda0;
import o.LazyGridKtrememberLazyGridMeasurePolicy11ExternalSyntheticLambda0;
import o.LazyListScopeExternalSyntheticLambda1;
import o.LazyListStateCompanionExternalSyntheticLambda0;
import o.LazyListStateKtExternalSyntheticLambda1;
import o.PagerMeasureKtExternalSyntheticLambda0;
import o.PagerMeasureKtExternalSyntheticLambda1;
import o.PagerStateExternalSyntheticLambda2;
import o.PagerStateExternalSyntheticLambda3;
import o.PagerWrapperFlingBehaviorExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RadioButtonTranslatorKt {
    public static final void onNavigationEvent(@NotNull RemoteViews remoteViews, @NotNull LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0, @NotNull LazyListScopeExternalSyntheticLambda1 lazyListScopeExternalSyntheticLambda1) {
        LazyGridDslKtExternalSyntheticLambda0 lazyGridDslKtExternalSyntheticLambda0;
        int iOnWarmupCompleted;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            lazyGridDslKtExternalSyntheticLambda0 = LazyGridDslKtExternalSyntheticLambda0.RadioButton;
        } else {
            lazyGridDslKtExternalSyntheticLambda0 = LazyGridDslKtExternalSyntheticLambda0.RadioButtonBackport;
        }
        Context contextAsBinder = lazyGridItemProviderImplExternalSyntheticLambda0.asBinder();
        LazyListStateCompanionExternalSyntheticLambda0 lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent = LazyListStateKtExternalSyntheticLambda1.onNavigationEvent(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, lazyGridDslKtExternalSyntheticLambda0, lazyListScopeExternalSyntheticLambda1.onExtraCallbackWithResult());
        if (i2 >= 31) {
            iOnWarmupCompleted = lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback();
            PagerMeasureKtExternalSyntheticLambda0.onWarmupCompleted.onNavigationEvent(remoteViews, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), lazyListScopeExternalSyntheticLambda1.onExtraCallback());
            BringIntoViewRequesterImplExternalSyntheticLambda0 bringIntoViewRequesterImplExternalSyntheticLambda0OnWarmupCompleted = lazyListScopeExternalSyntheticLambda1.onTransact().onWarmupCompleted();
            if (bringIntoViewRequesterImplExternalSyntheticLambda0OnWarmupCompleted instanceof PagerWrapperFlingBehaviorExternalSyntheticLambda0) {
                PagerStateExternalSyntheticLambda2 pagerStateExternalSyntheticLambda2OnWarmupCompleted = PagerMeasureKtExternalSyntheticLambda1.onWarmupCompleted((PagerWrapperFlingBehaviorExternalSyntheticLambda0) bringIntoViewRequesterImplExternalSyntheticLambda0OnWarmupCompleted, contextAsBinder);
                RemoteViewsCompat.onExtraCallbackWithResult(remoteViews, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), pagerStateExternalSyntheticLambda2OnWarmupCompleted.onWarmupCompleted(), pagerStateExternalSyntheticLambda2OnWarmupCompleted.IAuthTabCallback());
            } else if (bringIntoViewRequesterImplExternalSyntheticLambda0OnWarmupCompleted instanceof ResourceCheckableColorProvider) {
                RemoteViewsCompat.onExtraCallback(remoteViews, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), ((ResourceCheckableColorProvider) bringIntoViewRequesterImplExternalSyntheticLambda0OnWarmupCompleted).IAuthTabCallback());
            }
        } else {
            iOnWarmupCompleted = LazyGridKtrememberLazyGridMeasurePolicy11ExternalSyntheticLambda0.onWarmupCompleted(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, R.id.radioText, 0, (Integer) null, 12, (Object) null);
            int iOnWarmupCompleted2 = LazyGridKtrememberLazyGridMeasurePolicy11ExternalSyntheticLambda0.onWarmupCompleted(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, R.id.radioIcon, 0, (Integer) null, 12, (Object) null);
            LazyGridKtrememberLazyGridMeasurePolicy11ExternalSyntheticLambda0.onWarmupCompleted(remoteViews, iOnWarmupCompleted2, lazyListScopeExternalSyntheticLambda1.onExtraCallback());
            PagerMeasureKtExternalSyntheticLambda1.onExtraCallbackWithResult(remoteViews, iOnWarmupCompleted2, PagerMeasureKtExternalSyntheticLambda1.onExtraCallback(lazyListScopeExternalSyntheticLambda1.onTransact().onWarmupCompleted(), contextAsBinder, lazyListScopeExternalSyntheticLambda1.onExtraCallback()));
        }
        PagerStateExternalSyntheticLambda3.onNavigationEvent(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, iOnWarmupCompleted, lazyListScopeExternalSyntheticLambda1.IAuthTabCallbackStub(), lazyListScopeExternalSyntheticLambda1.onWarmupCompleted(), lazyListScopeExternalSyntheticLambda1.IAuthTabCallback(), 16);
        remoteViews.setBoolean(lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), "setEnabled", lazyListScopeExternalSyntheticLambda1.IAuthTabCallbackDefault());
        LazyDslKtExternalSyntheticLambda0.IAuthTabCallback(lazyGridItemProviderImplExternalSyntheticLambda0, remoteViews, lazyListScopeExternalSyntheticLambda1.onExtraCallbackWithResult(), lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent);
    }
}
