package o;

import android.graphics.Color;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.widget.RemoteViewsCompat;
import java.util.Objects;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.BasicTextKtExternalSyntheticLambda17;
import o.RoundedCornerShapeKtlerp1;
import o.RulerAlignmentKtExternalSyntheticLambda5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PagerMeasureKtExternalSyntheticLambda4 {

    public static final class onExtraCallbackWithResult extends Lambda implements Function2<AndroidCursorHandle_androidKtExternalSyntheticLambda6, RulerAlignmentKtExternalSyntheticLambda5.onNavigationEvent, AndroidCursorHandle_androidKtExternalSyntheticLambda6> {
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();

        public onExtraCallbackWithResult() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final AndroidCursorHandle_androidKtExternalSyntheticLambda6 invoke(@Nullable AndroidCursorHandle_androidKtExternalSyntheticLambda6 androidCursorHandle_androidKtExternalSyntheticLambda6, @NotNull RulerAlignmentKtExternalSyntheticLambda5.onNavigationEvent onnavigationevent) {
            return onnavigationevent instanceof AndroidCursorHandle_androidKtExternalSyntheticLambda6 ? onnavigationevent : androidCursorHandle_androidKtExternalSyntheticLambda6;
        }
    }

    public static final class onNavigationEvent extends Lambda implements Function2<AndroidCursorHandle_androidKtExternalSyntheticLambda3, RulerAlignmentKtExternalSyntheticLambda5.onNavigationEvent, AndroidCursorHandle_androidKtExternalSyntheticLambda3> {
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();

        public onNavigationEvent() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidCursorHandle_androidKtExternalSyntheticLambda3 invoke(@Nullable AndroidCursorHandle_androidKtExternalSyntheticLambda3 androidCursorHandle_androidKtExternalSyntheticLambda3, @NotNull RulerAlignmentKtExternalSyntheticLambda5.onNavigationEvent onnavigationevent) {
            return onnavigationevent instanceof AndroidCursorHandle_androidKtExternalSyntheticLambda3 ? onnavigationevent : androidCursorHandle_androidKtExternalSyntheticLambda3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull RemoteViews remoteViews, @NotNull LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0, @NotNull RulerAlignmentKtExternalSyntheticLambda0 rulerAlignmentKtExternalSyntheticLambda0) {
        boolean z;
        LazyListStateCompanionExternalSyntheticLambda0 lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent = LazyListStateKtExternalSyntheticLambda1.onNavigationEvent(remoteViews, lazyGridItemProviderImplExternalSyntheticLambda0, onWarmupCompleted(rulerAlignmentKtExternalSyntheticLambda0), rulerAlignmentKtExternalSyntheticLambda0.onExtraCallbackWithResult());
        RecalculateWindowInsetsModifierElement recalculateWindowInsetsModifierElementOnWarmupCompleted = rulerAlignmentKtExternalSyntheticLambda0.onWarmupCompleted();
        if (recalculateWindowInsetsModifierElementOnWarmupCompleted instanceof RecalculateWindowInsetsModifierElement) {
            remoteViews.setImageViewResource(lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), recalculateWindowInsetsModifierElementOnWarmupCompleted.onExtraCallback());
        } else if (recalculateWindowInsetsModifierElementOnWarmupCompleted instanceof RowColumnMeasurePolicyKt) {
            remoteViews.setImageViewBitmap(lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), ((RowColumnMeasurePolicyKt) recalculateWindowInsetsModifierElementOnWarmupCompleted).onNavigationEvent());
        } else if (recalculateWindowInsetsModifierElementOnWarmupCompleted instanceof LazyGridIntervalContentExternalSyntheticLambda5) {
            remoteViews.setImageViewUri(lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), ((LazyGridIntervalContentExternalSyntheticLambda5) recalculateWindowInsetsModifierElementOnWarmupCompleted).onNavigationEvent());
        } else {
            if (!(recalculateWindowInsetsModifierElementOnWarmupCompleted instanceof WindowInsetsNestedScrollConnectionfling21ExternalSyntheticLambda0)) {
                throw new IllegalArgumentException("An unsupported ImageProvider type was used.");
            }
            onExtraCallback(remoteViews, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), (WindowInsetsNestedScrollConnectionfling21ExternalSyntheticLambda0) recalculateWindowInsetsModifierElementOnWarmupCompleted);
        }
        RowScopeInstance rowScopeInstanceOnExtraCallback = rulerAlignmentKtExternalSyntheticLambda0.onExtraCallback();
        if (rowScopeInstanceOnExtraCallback != null) {
            onWarmupCompleted(lazyGridItemProviderImplExternalSyntheticLambda0, remoteViews, rowScopeInstanceOnExtraCallback, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent);
        }
        LazyDslKtExternalSyntheticLambda0.IAuthTabCallback(lazyGridItemProviderImplExternalSyntheticLambda0, remoteViews, rulerAlignmentKtExternalSyntheticLambda0.onExtraCallbackWithResult(), lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent);
        if (RoundedCornerShapeKtlerp1.onNavigationEvent(rulerAlignmentKtExternalSyntheticLambda0.IAuthTabCallback(), RoundedCornerShapeKtlerp1.Companion.onNavigationEvent())) {
            AndroidCursorHandle_androidKtExternalSyntheticLambda6 androidCursorHandle_androidKtExternalSyntheticLambda6 = (AndroidCursorHandle_androidKtExternalSyntheticLambda6) rulerAlignmentKtExternalSyntheticLambda0.onExtraCallbackWithResult().onNavigationEvent((Object) null, onExtraCallbackWithResult.IAuthTabCallback);
            BasicTextKtExternalSyntheticLambda17 basicTextKtExternalSyntheticLambda17IAuthTabCallback = androidCursorHandle_androidKtExternalSyntheticLambda6 != null ? androidCursorHandle_androidKtExternalSyntheticLambda6.IAuthTabCallback() : null;
            BasicTextKtExternalSyntheticLambda17.onExtraCallback onextracallback = BasicTextKtExternalSyntheticLambda17.onExtraCallback.IAuthTabCallback;
            if (!Intrinsics.areEqual(basicTextKtExternalSyntheticLambda17IAuthTabCallback, onextracallback)) {
                AndroidCursorHandle_androidKtExternalSyntheticLambda3 androidCursorHandle_androidKtExternalSyntheticLambda3 = (AndroidCursorHandle_androidKtExternalSyntheticLambda3) rulerAlignmentKtExternalSyntheticLambda0.onExtraCallbackWithResult().onNavigationEvent((Object) null, onNavigationEvent.onExtraCallback);
                if (!Intrinsics.areEqual(androidCursorHandle_androidKtExternalSyntheticLambda3 != null ? androidCursorHandle_androidKtExternalSyntheticLambda3.onWarmupCompleted() : null, onextracallback)) {
                    z = false;
                }
            }
            z = true;
        }
        RemoteViewsCompat.onWarmupCompleted(remoteViews, lazyListStateCompanionExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(), z);
    }

    private static final LazyGridDslKtExternalSyntheticLambda0 onWarmupCompleted(RulerAlignmentKtExternalSyntheticLambda0 rulerAlignmentKtExternalSyntheticLambda0) {
        boolean zOnExtraCallback = WindowInsetsHolderCompanionExternalSyntheticLambda0.onExtraCallback(rulerAlignmentKtExternalSyntheticLambda0);
        int iIAuthTabCallback = rulerAlignmentKtExternalSyntheticLambda0.IAuthTabCallback();
        RoundedCornerShapeKtlerp1.onExtraCallbackWithResult onextracallbackwithresult = RoundedCornerShapeKtlerp1.Companion;
        if (RoundedCornerShapeKtlerp1.onNavigationEvent(iIAuthTabCallback, onextracallbackwithresult.onExtraCallback())) {
            if (zOnExtraCallback) {
                return LazyGridDslKtExternalSyntheticLambda0.ImageCropDecorative;
            }
            return LazyGridDslKtExternalSyntheticLambda0.ImageCrop;
        }
        if (RoundedCornerShapeKtlerp1.onNavigationEvent(iIAuthTabCallback, onextracallbackwithresult.onNavigationEvent())) {
            if (zOnExtraCallback) {
                return LazyGridDslKtExternalSyntheticLambda0.ImageFitDecorative;
            }
            return LazyGridDslKtExternalSyntheticLambda0.ImageFit;
        }
        if (!RoundedCornerShapeKtlerp1.onNavigationEvent(iIAuthTabCallback, onextracallbackwithresult.onWarmupCompleted())) {
            Objects.toString(RoundedCornerShapeKtlerp1.onExtraCallbackWithResult(rulerAlignmentKtExternalSyntheticLambda0.IAuthTabCallback()));
            return LazyGridDslKtExternalSyntheticLambda0.ImageFit;
        }
        if (zOnExtraCallback) {
            return LazyGridDslKtExternalSyntheticLambda0.ImageFillBoundsDecorative;
        }
        return LazyGridDslKtExternalSyntheticLambda0.ImageFillBounds;
    }

    private static final void onWarmupCompleted(LazyGridItemProviderImplExternalSyntheticLambda0 lazyGridItemProviderImplExternalSyntheticLambda0, RemoteViews remoteViews, RowScopeInstance rowScopeInstance, LazyListStateCompanionExternalSyntheticLambda0 lazyListStateCompanionExternalSyntheticLambda0) {
        if (rowScopeInstance instanceof WindowInsetsPadding_androidKtExternalSyntheticLambda11) {
            BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda11OnNavigationEvent = ((WindowInsetsPadding_androidKtExternalSyntheticLambda11) rowScopeInstance).onNavigationEvent();
            if (Build.VERSION.SDK_INT >= 31) {
                PagerMeasurePolicyKtrememberPagerMeasurePolicy11ExternalSyntheticLambda0.onWarmupCompleted.onExtraCallback(lazyGridItemProviderImplExternalSyntheticLambda0, remoteViews, basicTextKtExternalSyntheticLambda11OnNavigationEvent, lazyListStateCompanionExternalSyntheticLambda0.IAuthTabCallback());
                return;
            } else {
                RemoteViewsCompat.onWarmupCompleted(remoteViews, lazyListStateCompanionExternalSyntheticLambda0.IAuthTabCallback(), ByteOrderedDataOutputStream.onNavigationEvent(basicTextKtExternalSyntheticLambda11OnNavigationEvent.IAuthTabCallback(lazyGridItemProviderImplExternalSyntheticLambda0.asBinder())));
                return;
            }
        }
        if (rowScopeInstance instanceof LazyGridIntervalContentExternalSyntheticLambda1) {
            if (Build.VERSION.SDK_INT <= 30) {
                int iOnNavigationEvent = ByteOrderedDataOutputStream.onNavigationEvent(((LazyGridIntervalContentExternalSyntheticLambda1) rowScopeInstance).onExtraCallbackWithResult().IAuthTabCallback(lazyGridItemProviderImplExternalSyntheticLambda0.asBinder()));
                RemoteViewsCompat.onWarmupCompleted(remoteViews, lazyListStateCompanionExternalSyntheticLambda0.IAuthTabCallback(), iOnNavigationEvent);
                RemoteViewsCompat.IAuthTabCallback(remoteViews, lazyListStateCompanionExternalSyntheticLambda0.IAuthTabCallback(), Color.alpha(iOnNavigationEvent));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("An unsupported ColorFilter was used.");
    }

    private static final void onExtraCallback(RemoteViews remoteViews, int i2, WindowInsetsNestedScrollConnectionfling21ExternalSyntheticLambda0 windowInsetsNestedScrollConnectionfling21ExternalSyntheticLambda0) {
        PagerStateExternalSyntheticLambda0.onWarmupCompleted.onWarmupCompleted(remoteViews, i2, windowInsetsNestedScrollConnectionfling21ExternalSyntheticLambda0.onExtraCallbackWithResult());
    }

    public static final void onExtraCallback(@NotNull RemoteViews remoteViews, int i2, long j, long j2) {
        RemoteViewsCompat.onExtraCallback(remoteViews, i2, ByteOrderedDataOutputStream.onNavigationEvent(j), ByteOrderedDataOutputStream.onNavigationEvent(j2));
    }
}
