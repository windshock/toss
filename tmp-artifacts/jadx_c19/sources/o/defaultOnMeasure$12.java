package o;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.wwx.lt;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class defaultOnMeasure$12 implements Runnable {
    final /* synthetic */ hasNestedScrollingParent IAuthTabCallback;
    final /* synthetic */ PointF onExtraCallback;
    final /* synthetic */ offsetChildrenVertical onNavigationEvent;
    final /* synthetic */ defaultOnMeasure onWarmupCompleted;

    defaultOnMeasure$12(defaultOnMeasure defaultonmeasure, hasNestedScrollingParent hasnestedscrollingparent, PointF pointF, offsetChildrenVertical offsetchildrenvertical) {
        this.onWarmupCompleted = defaultonmeasure;
        this.IAuthTabCallback = hasnestedscrollingparent;
        this.onExtraCallback = pointF;
        this.onNavigationEvent = offsetchildrenvertical;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (((dispatchChildAttached) this.onWarmupCompleted).IAuthTabCallback.access000()) {
            this.onWarmupCompleted.ICustomTabsService_Parcel().IAuthTabCallback(this.IAuthTabCallback, this.onExtraCallback);
            final getAccessibilityClassName getaccessibilityclassnameOnExtraCallbackWithResult = defaultOnMeasure.onExtraCallbackWithResult(this.onWarmupCompleted, this.onNavigationEvent);
            ensureRightGlow ensurerightglowOnExtraCallbackWithResult = dispatchNestedScroll.onExtraCallbackWithResult(5000L, getaccessibilityclassnameOnExtraCallbackWithResult);
            ensurerightglowOnExtraCallbackWithResult.onExtraCallbackWithResult(this.onWarmupCompleted);
            ensurerightglowOnExtraCallbackWithResult.onWarmupCompleted(new ensureBottomGlow() { // from class: o.defaultOnMeasure$12.4
                @Override // o.ensureBottomGlow
                public void onNavigationEvent(@NonNull dispatchNestedFling dispatchnestedfling) {
                    defaultOnMeasure$12.this.onWarmupCompleted.ICustomTabsService_Parcel().IAuthTabCallback(defaultOnMeasure$12.this.IAuthTabCallback, getaccessibilityclassnameOnExtraCallbackWithResult.onWarmupCompleted(), defaultOnMeasure$12.this.onExtraCallback);
                    defaultOnMeasure$12.this.onWarmupCompleted.onSessionEnded().onWarmupCompleted("reset metering");
                    Object[] objArr = {defaultOnMeasure$12.this.onWarmupCompleted};
                    if (((Boolean) dispatchChildAttached.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 1249804881, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr, -1249804873, lt.40.onExtraCallbackWithResult())).booleanValue()) {
                        defaultOnMeasure$12.this.onWarmupCompleted.onSessionEnded().onWarmupCompleted("reset metering", getItemDecorationCount.PREVIEW, defaultOnMeasure$12.this.onWarmupCompleted.onMinimized(), new Runnable() { // from class: o.defaultOnMeasure.12.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                defaultOnMeasure.onNavigationEvent(defaultOnMeasure$12.this.onWarmupCompleted);
                            }
                        });
                    }
                }
            });
        }
    }
}
