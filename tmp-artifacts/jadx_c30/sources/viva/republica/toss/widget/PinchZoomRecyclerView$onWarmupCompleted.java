package viva.republica.toss.widget;

import android.view.ScaleGestureDetector;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class PinchZoomRecyclerView$onWarmupCompleted extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    final /* synthetic */ PinchZoomRecyclerView onExtraCallback;

    public PinchZoomRecyclerView$onWarmupCompleted(PinchZoomRecyclerView pinchZoomRecyclerView) {
        this.onExtraCallback = pinchZoomRecyclerView;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(@NotNull ScaleGestureDetector scaleGestureDetector) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(scaleGestureDetector, BuildConfig.FLAVOR);
        PinchZoomRecyclerView pinchZoomRecyclerView = this.onExtraCallback;
        PinchZoomRecyclerView.onWarmupCompleted(pinchZoomRecyclerView, PinchZoomRecyclerView.onExtraCallback(pinchZoomRecyclerView) * scaleGestureDetector.getScaleFactor());
        PinchZoomRecyclerView pinchZoomRecyclerView2 = this.onExtraCallback;
        PinchZoomRecyclerView.onWarmupCompleted(pinchZoomRecyclerView2, RangesKt.coerceAtLeast(1.0f, RangesKt.coerceAtMost(PinchZoomRecyclerView.onExtraCallback(pinchZoomRecyclerView2), 3.0f)));
        PinchZoomRecyclerView pinchZoomRecyclerView3 = this.onExtraCallback;
        PinchZoomRecyclerView.onNavigationEvent(pinchZoomRecyclerView3, PinchZoomRecyclerView.onExtraCallbackWithResult(pinchZoomRecyclerView3) - (PinchZoomRecyclerView.onExtraCallbackWithResult(this.onExtraCallback) * PinchZoomRecyclerView.onExtraCallback(this.onExtraCallback)));
        PinchZoomRecyclerView pinchZoomRecyclerView4 = this.onExtraCallback;
        PinchZoomRecyclerView.onExtraCallback(pinchZoomRecyclerView4, PinchZoomRecyclerView.onWarmupCompleted(pinchZoomRecyclerView4) - (PinchZoomRecyclerView.onWarmupCompleted(this.onExtraCallback) * PinchZoomRecyclerView.onExtraCallback(this.onExtraCallback)));
        this.onExtraCallback.invalidate();
        int i4 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }
}
