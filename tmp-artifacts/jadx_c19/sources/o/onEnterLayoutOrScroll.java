package o;

import android.hardware.Camera;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.wwx.lt;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import o.addRecyclerListener;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class onEnterLayoutOrScroll extends onRequestFocusInDescendants {
    private final Camera IAuthTabCallback;
    private final consumePendingUpdateOperations IAuthTabCallbackStub;

    public onEnterLayoutOrScroll(@NonNull addRecyclerListener.IAuthTabCallback iAuthTabCallback, @NonNull consumePendingUpdateOperations consumependingupdateoperations, @NonNull Camera camera) {
        super(iAuthTabCallback, consumependingupdateoperations);
        this.IAuthTabCallbackStub = consumependingupdateoperations;
        this.IAuthTabCallback = camera;
        Camera.Parameters parameters = camera.getParameters();
        parameters.setRotation(((onSizeChanged) this).onNavigationEvent.asInterface);
        camera.setParameters(parameters);
    }

    public void onExtraCallbackWithResult() {
        addFocusables addfocusables = onRequestFocusInDescendants.onExtraCallback;
        addfocusables.onExtraCallbackWithResult(new Object[]{"take() called."});
        this.IAuthTabCallback.setPreviewCallbackWithBuffer(null);
        this.IAuthTabCallbackStub.onExtraCallback().onWarmupCompleted();
        try {
            this.IAuthTabCallback.takePicture(new Camera.ShutterCallback() { // from class: o.onEnterLayoutOrScroll.3
                @Override // android.hardware.Camera.ShutterCallback
                public void onShutter() {
                    onRequestFocusInDescendants.onExtraCallback.onExtraCallbackWithResult(new Object[]{"take(): got onShutter callback."});
                    onEnterLayoutOrScroll.this.onWarmupCompleted(true);
                }
            }, null, null, new Camera.PictureCallback() { // from class: o.onEnterLayoutOrScroll.4
                @Override // android.hardware.Camera.PictureCallback
                public void onPictureTaken(byte[] bArr, Camera camera) {
                    int iOnExtraCallbackWithResult;
                    onRequestFocusInDescendants.onExtraCallback.onExtraCallbackWithResult(new Object[]{"take(): got picture callback."});
                    try {
                        iOnExtraCallbackWithResult = isAnimating.onExtraCallbackWithResult(new FlowColumnOverflowScopeImplExternalSyntheticLambda0(new ByteArrayInputStream(bArr)).onWarmupCompleted("Orientation", 1));
                    } catch (IOException unused) {
                        iOnExtraCallbackWithResult = 0;
                    }
                    addRecyclerListener.IAuthTabCallback iAuthTabCallback = ((onSizeChanged) onEnterLayoutOrScroll.this).onNavigationEvent;
                    iAuthTabCallback.onNavigationEvent = bArr;
                    iAuthTabCallback.asInterface = iOnExtraCallbackWithResult;
                    onRequestFocusInDescendants.onExtraCallback.onExtraCallbackWithResult(new Object[]{"take(): starting preview again. ", Thread.currentThread()});
                    if (onEnterLayoutOrScroll.this.IAuthTabCallbackStub.IEngagementSignalsCallbackDefault().isAtLeast(getItemDecorationCount.PREVIEW)) {
                        camera.setPreviewCallbackWithBuffer(onEnterLayoutOrScroll.this.IAuthTabCallbackStub);
                        removeOnChildAttachStateChangeListener removeonchildattachstatechangelistenerOnWarmupCompleted = onEnterLayoutOrScroll.this.IAuthTabCallbackStub.onWarmupCompleted(com.otaliastudios.cameraview.engine.offset.Reference.SENSOR);
                        if (removeonchildattachstatechangelistenerOnWarmupCompleted != null) {
                            getMinFlingVelocity getminflingvelocityOnExtraCallback = onEnterLayoutOrScroll.this.IAuthTabCallbackStub.onExtraCallback();
                            int iICustomTabsCallbackDefault = onEnterLayoutOrScroll.this.IAuthTabCallbackStub.ICustomTabsCallbackDefault();
                            Object[] objArr = {onEnterLayoutOrScroll.this.IAuthTabCallbackStub};
                            getminflingvelocityOnExtraCallback.onExtraCallbackWithResult(iICustomTabsCallbackDefault, removeonchildattachstatechangelistenerOnWarmupCompleted, (getChildPosition) dispatchChildAttached.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 532520487, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), objArr, -532520477, lt.40.onExtraCallbackWithResult()));
                            camera.startPreview();
                        } else {
                            throw new IllegalStateException("Preview stream size should never be null here.");
                        }
                    }
                    onEnterLayoutOrScroll.this.onWarmupCompleted();
                }
            });
            addfocusables.onExtraCallbackWithResult(new Object[]{"take() returned."});
        } catch (Exception e) {
            ((onSizeChanged) this).onExtraCallbackWithResult = e;
            onWarmupCompleted();
        }
    }

    protected void onWarmupCompleted() {
        onRequestFocusInDescendants.onExtraCallback.onExtraCallbackWithResult(new Object[]{"dispatching result. Thread:", Thread.currentThread()});
        super.onWarmupCompleted();
    }
}
