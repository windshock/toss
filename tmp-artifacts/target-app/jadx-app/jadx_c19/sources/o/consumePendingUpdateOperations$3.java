package o;

import android.graphics.PointF;
import android.hardware.Camera;
import com.bytedance.sdk.openadsdk.wwx.lt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o.dispatchChildDetached;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class consumePendingUpdateOperations$3 implements Runnable {
    final /* synthetic */ consumePendingUpdateOperations IAuthTabCallback;
    final /* synthetic */ offsetChildrenVertical onExtraCallback;
    final /* synthetic */ hasNestedScrollingParent onExtraCallbackWithResult;
    final /* synthetic */ PointF onWarmupCompleted;

    consumePendingUpdateOperations$3(consumePendingUpdateOperations consumependingupdateoperations, offsetChildrenVertical offsetchildrenvertical, hasNestedScrollingParent hasnestedscrollingparent, PointF pointF) {
        this.IAuthTabCallback = consumependingupdateoperations;
        this.onExtraCallback = offsetchildrenvertical;
        this.onExtraCallbackWithResult = hasnestedscrollingparent;
        this.onWarmupCompleted = pointF;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (((dispatchChildAttached) this.IAuthTabCallback).IAuthTabCallback.access000()) {
            Object[] objArr = {this.IAuthTabCallback};
            getChildItemId getchilditemid = new getChildItemId((getChildPosition) dispatchChildAttached.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 532520487, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr, -532520477, lt.40.onExtraCallbackWithResult()), this.IAuthTabCallback.newSessionWithExtras().an_());
            offsetChildrenVertical offsetchildrenverticalOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult(getchilditemid);
            Camera.Parameters parameters = consumePendingUpdateOperations.onExtraCallback(this.IAuthTabCallback).getParameters();
            int maxNumFocusAreas = parameters.getMaxNumFocusAreas();
            int maxNumMeteringAreas = parameters.getMaxNumMeteringAreas();
            if (maxNumFocusAreas > 0) {
                parameters.setFocusAreas(offsetchildrenverticalOnExtraCallbackWithResult.onNavigationEvent(maxNumFocusAreas, getchilditemid));
            }
            if (maxNumMeteringAreas > 0) {
                parameters.setMeteringAreas(offsetchildrenverticalOnExtraCallbackWithResult.onNavigationEvent(maxNumMeteringAreas, getchilditemid));
            }
            parameters.setFocusMode(TtmlNode.TEXT_EMPHASIS_AUTO);
            consumePendingUpdateOperations.onExtraCallback(this.IAuthTabCallback).setParameters(parameters);
            this.IAuthTabCallback.ICustomTabsService_Parcel().IAuthTabCallback(this.onExtraCallbackWithResult, this.onWarmupCompleted);
            this.IAuthTabCallback.onSessionEnded().onWarmupCompleted("focus end");
            this.IAuthTabCallback.onSessionEnded().onNavigationEvent("focus end", true, 2500L, new Runnable() { // from class: o.consumePendingUpdateOperations$3.2
                @Override // java.lang.Runnable
                public void run() {
                    dispatchChildDetached.onExtraCallbackWithResult onextracallbackwithresultICustomTabsService_Parcel = consumePendingUpdateOperations$3.this.IAuthTabCallback.ICustomTabsService_Parcel();
                    consumePendingUpdateOperations$3 consumependingupdateoperations_3 = consumePendingUpdateOperations$3.this;
                    onextracallbackwithresultICustomTabsService_Parcel.IAuthTabCallback(consumependingupdateoperations_3.onExtraCallbackWithResult, false, consumependingupdateoperations_3.onWarmupCompleted);
                }
            });
            try {
                consumePendingUpdateOperations.onExtraCallback(this.IAuthTabCallback).autoFocus(new Camera.AutoFocusCallback() { // from class: o.consumePendingUpdateOperations$3.5
                    @Override // android.hardware.Camera.AutoFocusCallback
                    public void onAutoFocus(boolean z, Camera camera) {
                        consumePendingUpdateOperations$3.this.IAuthTabCallback.onSessionEnded().onWarmupCompleted("focus end");
                        consumePendingUpdateOperations$3.this.IAuthTabCallback.onSessionEnded().onWarmupCompleted("focus reset");
                        dispatchChildDetached.onExtraCallbackWithResult onextracallbackwithresultICustomTabsService_Parcel = consumePendingUpdateOperations$3.this.IAuthTabCallback.ICustomTabsService_Parcel();
                        consumePendingUpdateOperations$3 consumependingupdateoperations_3 = consumePendingUpdateOperations$3.this;
                        onextracallbackwithresultICustomTabsService_Parcel.IAuthTabCallback(consumependingupdateoperations_3.onExtraCallbackWithResult, z, consumependingupdateoperations_3.onWarmupCompleted);
                        Object[] objArr2 = {consumePendingUpdateOperations$3.this.IAuthTabCallback};
                        if (((Boolean) dispatchChildAttached.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 1249804881, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr2, -1249804873, lt.40.onExtraCallbackWithResult())).booleanValue()) {
                            consumePendingUpdateOperations$3.this.IAuthTabCallback.onSessionEnded().onWarmupCompleted("focus reset", getItemDecorationCount.ENGINE, consumePendingUpdateOperations$3.this.IAuthTabCallback.onMinimized(), new Runnable() { // from class: o.consumePendingUpdateOperations.3.5.3
                                @Override // java.lang.Runnable
                                public void run() {
                                    consumePendingUpdateOperations.onExtraCallback(consumePendingUpdateOperations$3.this.IAuthTabCallback).cancelAutoFocus();
                                    Camera.Parameters parameters2 = consumePendingUpdateOperations.onExtraCallback(consumePendingUpdateOperations$3.this.IAuthTabCallback).getParameters();
                                    int maxNumFocusAreas2 = parameters2.getMaxNumFocusAreas();
                                    int maxNumMeteringAreas2 = parameters2.getMaxNumMeteringAreas();
                                    if (maxNumFocusAreas2 > 0) {
                                        parameters2.setFocusAreas(null);
                                    }
                                    if (maxNumMeteringAreas2 > 0) {
                                        parameters2.setMeteringAreas(null);
                                    }
                                    consumePendingUpdateOperations.onWarmupCompleted(consumePendingUpdateOperations$3.this.IAuthTabCallback, parameters2);
                                    consumePendingUpdateOperations.onExtraCallback(consumePendingUpdateOperations$3.this.IAuthTabCallback).setParameters(parameters2);
                                }
                            });
                        }
                    }
                });
            } catch (RuntimeException e) {
                dispatchChildDetached.extraCommand.onNavigationEvent(new Object[]{"startAutoFocus:", "Error calling autoFocus", e});
            }
        }
    }
}
