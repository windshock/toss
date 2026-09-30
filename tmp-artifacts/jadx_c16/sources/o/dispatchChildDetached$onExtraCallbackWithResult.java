package o;

import android.content.Context;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.addRecyclerListener;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface dispatchChildDetached$onExtraCallbackWithResult {
    void IAuthTabCallback();

    void IAuthTabCallback(float f, @NonNull float[] fArr, @Nullable PointF[] pointFArr);

    void IAuthTabCallback(@NonNull getOnFlingListener getonflinglistener);

    void IAuthTabCallback(@Nullable hasNestedScrollingParent hasnestedscrollingparent, @NonNull PointF pointF);

    void IAuthTabCallback(@Nullable hasNestedScrollingParent hasnestedscrollingparent, boolean z, @NonNull PointF pointF);

    void IAuthTabCallback(stopScrollersInternal stopscrollersinternal);

    void IAuthTabCallbackStub();

    Context onExtraCallback();

    void onExtraCallback(@NonNull stopGlowAnimations stopglowanimations);

    void onExtraCallbackWithResult();

    void onExtraCallbackWithResult(@NonNull addOnChildAttachStateChangeListener$onWarmupCompleted addonchildattachstatechangelistener_onwarmupcompleted);

    void onNavigationEvent(float f, @Nullable PointF[] pointFArr);

    void onNavigationEvent(@NonNull addRecyclerListener.IAuthTabCallback iAuthTabCallback);

    void onNavigationEvent(boolean z);

    void onWarmupCompleted();
}
