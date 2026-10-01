package viva.republica.toss.widget;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class PinchZoomRecyclerView$onExtraCallback extends GestureDetector.SimpleOnGestureListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    final /* synthetic */ PinchZoomRecyclerView onExtraCallbackWithResult;

    public PinchZoomRecyclerView$onExtraCallback(PinchZoomRecyclerView pinchZoomRecyclerView) {
        this.onExtraCallbackWithResult = pinchZoomRecyclerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(@NotNull MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(motionEvent, BuildConfig.FLAVOR);
        PinchZoomRecyclerView pinchZoomRecyclerView = this.onExtraCallbackWithResult;
        float f = 3.0f;
        if (PinchZoomRecyclerView.onExtraCallback(pinchZoomRecyclerView) == 3.0f) {
            int i4 = IAuthTabCallback + 63;
            onExtraCallback = i4 % 128;
            f = i4 % 2 == 0 ? 0.0f : 1.0f;
        }
        PinchZoomRecyclerView.onWarmupCompleted(pinchZoomRecyclerView, f);
        this.onExtraCallbackWithResult.invalidate();
        return false;
    }
}
