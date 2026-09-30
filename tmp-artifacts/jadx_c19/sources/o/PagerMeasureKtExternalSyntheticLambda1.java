package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.RemoteViews;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.appwidget.unit.ResourceCheckableColorProvider;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PagerMeasureKtExternalSyntheticLambda1 {
    private static final long onExtraCallbackWithResult = setByteOrder.Companion.onNavigationEvent();

    private static final ColorStateList onWarmupCompleted(PagerWrapperFlingBehaviorExternalSyntheticLambda0 pagerWrapperFlingBehaviorExternalSyntheticLambda0, Context context, boolean z) {
        return IAuthTabCallback(pagerWrapperFlingBehaviorExternalSyntheticLambda0.onExtraCallbackWithResult(context, z, true), pagerWrapperFlingBehaviorExternalSyntheticLambda0.onExtraCallbackWithResult(context, z, false));
    }

    public static final PagerStateExternalSyntheticLambda2 onWarmupCompleted(@NotNull PagerWrapperFlingBehaviorExternalSyntheticLambda0 pagerWrapperFlingBehaviorExternalSyntheticLambda0, @NotNull Context context) {
        return new PagerStateExternalSyntheticLambda2(onWarmupCompleted(pagerWrapperFlingBehaviorExternalSyntheticLambda0, context, false), onWarmupCompleted(pagerWrapperFlingBehaviorExternalSyntheticLambda0, context, true));
    }

    private static final ColorStateList IAuthTabCallback(long j, long j2) {
        return new ColorStateList(new int[][]{SelectableKtExternalSyntheticLambda0.onExtraCallback(), new int[0]}, new int[]{ByteOrderedDataOutputStream.onNavigationEvent(j), ByteOrderedDataOutputStream.onNavigationEvent(j2)});
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final long onExtraCallback(@NotNull BringIntoViewRequesterImplExternalSyntheticLambda0 bringIntoViewRequesterImplExternalSyntheticLambda0, @NotNull Context context, boolean z) throws NoWhenBranchMatchedException {
        setByteOrder setbyteorderIAuthTabCallback;
        if (bringIntoViewRequesterImplExternalSyntheticLambda0 instanceof PagerWrapperFlingBehaviorExternalSyntheticLambda0) {
            setbyteorderIAuthTabCallback = setByteOrder.onNavigationEvent(((PagerWrapperFlingBehaviorExternalSyntheticLambda0) bringIntoViewRequesterImplExternalSyntheticLambda0).onExtraCallbackWithResult(context, ToggleableKtExternalSyntheticLambda0.onWarmupCompleted(context), z));
        } else if (bringIntoViewRequesterImplExternalSyntheticLambda0 instanceof ResourceCheckableColorProvider) {
            setbyteorderIAuthTabCallback = SelectableKtExternalSyntheticLambda0.IAuthTabCallback(context, ((ResourceCheckableColorProvider) bringIntoViewRequesterImplExternalSyntheticLambda0).IAuthTabCallback(), z, null, 8, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (setbyteorderIAuthTabCallback != null) {
            return setbyteorderIAuthTabCallback.access100();
        }
        return onExtraCallbackWithResult;
    }

    public static final void onExtraCallbackWithResult(@NotNull RemoteViews remoteViews, int i2, long j) {
        RemoteViewsCompat.onWarmupCompleted(remoteViews, i2, ByteOrderedDataOutputStream.onNavigationEvent(j));
    }
}
