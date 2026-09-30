package o;

import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.location.Location;
import android.view.SurfaceHolder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.wwx.lt;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.otaliastudios.cameraview.engine.offset.Reference;
import com.otaliastudios.cameraview.preview.RendererCameraPreview;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o.addRecyclerListener;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class consumePendingUpdateOperations extends dispatchChildAttached implements Camera.PreviewCallback, Camera.ErrorCallback, getMinFlingVelocity$onNavigationEvent {
    private Camera ICustomTabsCallback_Parcel;
    private final findViewHolderForLayoutPosition mayLaunchUrl;
    int onWarmupCompleted;

    public consumePendingUpdateOperations(@NonNull dispatchChildDetached$onExtraCallbackWithResult dispatchchilddetached_onextracallbackwithresult) {
        super(dispatchchilddetached_onextracallbackwithresult);
        this.mayLaunchUrl = findViewHolderForLayoutPosition.onExtraCallbackWithResult();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.stopScrollersInternal */
    @Override // android.hardware.Camera.ErrorCallback
    public void onError(int i, Camera camera) throws stopScrollersInternal {
        RuntimeException runtimeException = new RuntimeException(dispatchChildDetached.extraCommand.onNavigationEvent(new Object[]{"Internal Camera1 error.", Integer.valueOf(i)}));
        int i2 = 3;
        if (i != 1 && i != 2 && i != 100) {
            i2 = 0;
        }
        throw new stopScrollersInternal(runtimeException, i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.stopScrollersInternal */
    @Override // o.dispatchChildAttached
    protected List<removeOnChildAttachStateChangeListener> onExtraCallbackWithResult() throws stopScrollersInternal {
        try {
            List<Camera.Size> supportedPreviewSizes = this.ICustomTabsCallback_Parcel.getParameters().getSupportedPreviewSizes();
            ArrayList arrayList = new ArrayList(supportedPreviewSizes.size());
            for (Camera.Size size : supportedPreviewSizes) {
                removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener = new removeOnChildAttachStateChangeListener(size.width, size.height);
                if (!arrayList.contains(removeonchildattachstatechangelistener)) {
                    arrayList.add(removeonchildattachstatechangelistener);
                }
            }
            dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"getPreviewStreamAvailableSizes:", arrayList});
            return arrayList;
        } catch (Exception e) {
            dispatchChildDetached.extraCommand.onNavigationEvent(new Object[]{"getPreviewStreamAvailableSizes:", "Failed to compute preview size. Camera params is empty"});
            throw new stopScrollersInternal(e, 2);
        }
    }

    @Override // o.dispatchChildAttached
    protected List<removeOnChildAttachStateChangeListener> onWarmupCompleted() {
        return Collections.singletonList(this.onActivityLayout);
    }

    @Override // o.dispatchChildAttached
    protected void IAuthTabCallback() {
        IPostMessageServiceDefault();
    }

    protected boolean onWarmupCompleted(@NonNull clearOldPositions clearoldpositions) {
        int iIAuthTabCallback = this.mayLaunchUrl.IAuthTabCallback(clearoldpositions);
        dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"collectCameraInfo", "Facing:", clearoldpositions, "Internal:", Integer.valueOf(iIAuthTabCallback), "Cameras:", Integer.valueOf(Camera.getNumberOfCameras())});
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == iIAuthTabCallback) {
                ((getChildPosition) dispatchChildAttached.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 532520487, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{this}, -532520477, lt.40.onExtraCallbackWithResult())).onWarmupCompleted(clearoldpositions, cameraInfo.orientation);
                this.onWarmupCompleted = i;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.stopScrollersInternal */
    protected Task<stopGlowAnimations> IAuthTabCallbackStub() throws stopScrollersInternal {
        try {
            Camera cameraOpen = Camera.open(this.onWarmupCompleted);
            this.ICustomTabsCallback_Parcel = cameraOpen;
            if (cameraOpen == null) {
                dispatchChildDetached.extraCommand.onNavigationEvent(new Object[]{"onStartEngine:", "Failed to connect. Camera is null, maybe in use by another app or already released?"});
                throw new stopScrollersInternal(1);
            }
            cameraOpen.setErrorCallback(this);
            addFocusables addfocusables = dispatchChildDetached.extraCommand;
            addfocusables.onExtraCallbackWithResult(new Object[]{"onStartEngine:", "Applying default parameters."});
            try {
                Camera.Parameters parameters = this.ICustomTabsCallback_Parcel.getParameters();
                int i = this.onWarmupCompleted;
                int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
                getChildPosition getchildposition = (getChildPosition) dispatchChildAttached.onWarmupCompleted(iOnExtraCallbackWithResult, 532520487, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, -532520477, iOnExtraCallbackWithResult3);
                Reference reference = Reference.SENSOR;
                Reference reference2 = Reference.VIEW;
                this.IAuthTabCallback = new getDecoratedBoundsWithMargins(parameters, i, getchildposition.IAuthTabCallback(reference, reference2));
                IAuthTabCallback(parameters);
                this.ICustomTabsCallback_Parcel.setParameters(parameters);
                try {
                    Camera camera = this.ICustomTabsCallback_Parcel;
                    int iOnExtraCallbackWithResult4 = lt.40.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult5 = lt.40.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult6 = lt.40.onExtraCallbackWithResult();
                    camera.setDisplayOrientation(((getChildPosition) dispatchChildAttached.onWarmupCompleted(iOnExtraCallbackWithResult4, 532520487, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, new Object[]{this}, -532520477, iOnExtraCallbackWithResult6)).onWarmupCompleted(reference, reference2, getChildViewHolder.ABSOLUTE));
                    addfocusables.onExtraCallbackWithResult(new Object[]{"onStartEngine:", "Ended"});
                    return Tasks.forResult(this.IAuthTabCallback);
                } catch (Exception unused) {
                    dispatchChildDetached.extraCommand.onNavigationEvent(new Object[]{"onStartEngine:", "Failed to connect. Can't set display orientation, maybe preview already exists?"});
                    throw new stopScrollersInternal(1);
                }
            } catch (Exception e) {
                dispatchChildDetached.extraCommand.onNavigationEvent(new Object[]{"onStartEngine:", "Failed to connect. Problem with camera params"});
                throw new stopScrollersInternal(e, 1);
            }
        } catch (Exception e2) {
            dispatchChildDetached.extraCommand.onNavigationEvent(new Object[]{"onStartEngine:", "Failed to connect. Maybe in use by another app?"});
            throw new stopScrollersInternal(e2, 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.stopScrollersInternal */
    protected Task<Void> IAuthTabCallbackDefault() throws stopScrollersInternal, IOException {
        addFocusables addfocusables = dispatchChildDetached.extraCommand;
        addfocusables.onExtraCallbackWithResult(new Object[]{"onStartBind:", "Started"});
        try {
            if (this.onPostMessage.onWarmupCompleted() == SurfaceHolder.class) {
                this.ICustomTabsCallback_Parcel.setPreviewDisplay((SurfaceHolder) this.onPostMessage.onExtraCallback());
            } else if (this.onPostMessage.onWarmupCompleted() == SurfaceTexture.class) {
                this.ICustomTabsCallback_Parcel.setPreviewTexture((SurfaceTexture) this.onPostMessage.onExtraCallback());
            } else {
                throw new RuntimeException("Unknown CameraPreview output class.");
            }
            this.onNavigationEvent = IAuthTabCallback_Parcel();
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
            this.onActivityLayout = (removeOnChildAttachStateChangeListener) dispatchChildAttached.onWarmupCompleted(iOnExtraCallbackWithResult, 742035432, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, -742035420, iOnExtraCallbackWithResult3);
            addfocusables.onExtraCallbackWithResult(new Object[]{"onStartBind:", "Returning"});
            return Tasks.forResult((Object) null);
        } catch (IOException e) {
            dispatchChildDetached.extraCommand.onNavigationEvent(new Object[]{"onStartBind:", "Failed to bind.", e});
            throw new stopScrollersInternal(e, 2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.stopScrollersInternal */
    protected Task<Void> asBinder() throws stopScrollersInternal {
        addFocusables addfocusables = dispatchChildDetached.extraCommand;
        addfocusables.onExtraCallbackWithResult(new Object[]{"onStartPreview", "Dispatching onCameraPreviewStreamSizeChanged."});
        ICustomTabsService_Parcel().IAuthTabCallbackStub();
        removeOnChildAttachStateChangeListener removeonchildattachstatechangelistenerOnWarmupCompleted = onWarmupCompleted(Reference.VIEW);
        if (removeonchildattachstatechangelistenerOnWarmupCompleted == null) {
            throw new IllegalStateException("previewStreamSize should not be null at this point.");
        }
        this.onPostMessage.IAuthTabCallback(removeonchildattachstatechangelistenerOnWarmupCompleted.onExtraCallback(), removeonchildattachstatechangelistenerOnWarmupCompleted.onExtraCallbackWithResult());
        this.onPostMessage.onExtraCallback(0);
        try {
            Camera.Parameters parameters = this.ICustomTabsCallback_Parcel.getParameters();
            parameters.setPreviewFormat(17);
            parameters.setPreviewSize(this.onActivityLayout.onExtraCallback(), this.onActivityLayout.onExtraCallbackWithResult());
            clearOnScrollListeners clearonscrolllistenersMayLaunchUrl = mayLaunchUrl();
            clearOnScrollListeners clearonscrolllisteners = clearOnScrollListeners.PICTURE;
            if (clearonscrolllistenersMayLaunchUrl == clearonscrolllisteners) {
                parameters.setPictureSize(this.onNavigationEvent.onExtraCallback(), this.onNavigationEvent.onExtraCallbackWithResult());
            } else {
                int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
                removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener = (removeOnChildAttachStateChangeListener) dispatchChildAttached.onWarmupCompleted(iOnExtraCallbackWithResult, -1157751068, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this, clearonscrolllisteners}, 1157751070, iOnExtraCallbackWithResult3);
                parameters.setPictureSize(removeonchildattachstatechangelistener.onExtraCallback(), removeonchildattachstatechangelistener.onExtraCallbackWithResult());
            }
            try {
                this.ICustomTabsCallback_Parcel.setParameters(parameters);
                this.ICustomTabsCallback_Parcel.setPreviewCallbackWithBuffer(null);
                this.ICustomTabsCallback_Parcel.setPreviewCallbackWithBuffer(this);
                getMinFlingVelocity getminflingvelocityOnNavigationEvent = onNavigationEvent();
                removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener2 = this.onActivityLayout;
                int iOnExtraCallbackWithResult4 = lt.40.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult5 = lt.40.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult6 = lt.40.onExtraCallbackWithResult();
                getminflingvelocityOnNavigationEvent.onExtraCallbackWithResult(17, removeonchildattachstatechangelistener2, (getChildPosition) dispatchChildAttached.onWarmupCompleted(iOnExtraCallbackWithResult4, 532520487, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, new Object[]{this}, -532520477, iOnExtraCallbackWithResult6));
                addfocusables.onExtraCallbackWithResult(new Object[]{"onStartPreview", "Starting preview with startPreview()."});
                try {
                    this.ICustomTabsCallback_Parcel.startPreview();
                    addfocusables.onExtraCallbackWithResult(new Object[]{"onStartPreview", "Started preview."});
                    return Tasks.forResult((Object) null);
                } catch (Exception e) {
                    dispatchChildDetached.extraCommand.onNavigationEvent(new Object[]{"onStartPreview", "Failed to start preview.", e});
                    throw new stopScrollersInternal(e, 2);
                }
            } catch (Exception e2) {
                dispatchChildDetached.extraCommand.onNavigationEvent(new Object[]{"onStartPreview:", "Failed to set params for camera. Maybe incorrect parameter put in params?"});
                throw new stopScrollersInternal(e2, 2);
            }
        } catch (Exception e3) {
            dispatchChildDetached.extraCommand.onNavigationEvent(new Object[]{"onStartPreview:", "Failed to get params from camera. Maybe low level problem with camera or camera has already released?"});
            throw new stopScrollersInternal(e3, 2);
        }
    }

    protected Task<Void> access100() {
        addFocusables addfocusables = dispatchChildDetached.extraCommand;
        addfocusables.onExtraCallbackWithResult(new Object[]{"onStopPreview:", "Started."});
        removeOnScrollListener removeonscrolllistener = this.onRelationshipValidationResult;
        if (removeonscrolllistener != null) {
            removeonscrolllistener.onExtraCallbackWithResult(true);
            this.onRelationshipValidationResult = null;
        }
        this.extraCallbackWithResult = null;
        onNavigationEvent().onWarmupCompleted();
        addfocusables.onExtraCallbackWithResult(new Object[]{"onStopPreview:", "Releasing preview buffers."});
        this.ICustomTabsCallback_Parcel.setPreviewCallbackWithBuffer(null);
        try {
            addfocusables.onExtraCallbackWithResult(new Object[]{"onStopPreview:", "Stopping preview."});
            this.ICustomTabsCallback_Parcel.stopPreview();
            addfocusables.onExtraCallbackWithResult(new Object[]{"onStopPreview:", "Stopped preview."});
        } catch (Exception e) {
            dispatchChildDetached.extraCommand.onNavigationEvent(new Object[]{"stopPreview", "Could not stop preview", e});
        }
        return Tasks.forResult((Object) null);
    }

    protected Task<Void> asInterface() throws IOException {
        this.onActivityLayout = null;
        this.onNavigationEvent = null;
        try {
            if (this.onPostMessage.onWarmupCompleted() == SurfaceHolder.class) {
                this.ICustomTabsCallback_Parcel.setPreviewDisplay(null);
            } else if (this.onPostMessage.onWarmupCompleted() == SurfaceTexture.class) {
                this.ICustomTabsCallback_Parcel.setPreviewTexture(null);
            } else {
                throw new RuntimeException("Unknown CameraPreview output class.");
            }
        } catch (IOException e) {
            dispatchChildDetached.extraCommand.onNavigationEvent(new Object[]{"onStopBind", "Could not release surface", e});
        }
        return Tasks.forResult((Object) null);
    }

    protected Task<Void> onTransact() {
        addFocusables addfocusables = dispatchChildDetached.extraCommand;
        addfocusables.onExtraCallbackWithResult(new Object[]{"onStopEngine:", "About to clean up."});
        onSessionEnded().onWarmupCompleted("focus reset");
        onSessionEnded().onWarmupCompleted("focus end");
        if (this.ICustomTabsCallback_Parcel != null) {
            try {
                addfocusables.onExtraCallbackWithResult(new Object[]{"onStopEngine:", "Clean up.", "Releasing camera."});
                this.ICustomTabsCallback_Parcel.release();
                addfocusables.onExtraCallbackWithResult(new Object[]{"onStopEngine:", "Clean up.", "Released camera."});
            } catch (Exception e) {
                dispatchChildDetached.extraCommand.onWarmupCompleted(new Object[]{"onStopEngine:", "Clean up.", "Exception while releasing camera.", e});
            }
            this.ICustomTabsCallback_Parcel = null;
            this.IAuthTabCallback = null;
        }
        this.onRelationshipValidationResult = null;
        this.IAuthTabCallback = null;
        this.ICustomTabsCallback_Parcel = null;
        dispatchChildDetached.extraCommand.onWarmupCompleted(new Object[]{"onStopEngine:", "Clean up.", "Returning."});
        return Tasks.forResult((Object) null);
    }

    @Override // o.dispatchChildAttached
    protected void onExtraCallbackWithResult(@NonNull addRecyclerListener.IAuthTabCallback iAuthTabCallback, boolean z) {
        addFocusables addfocusables = dispatchChildDetached.extraCommand;
        addfocusables.onExtraCallbackWithResult(new Object[]{"onTakePicture:", "executing."});
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        getChildPosition getchildposition = (getChildPosition) dispatchChildAttached.onWarmupCompleted(iOnExtraCallbackWithResult, 532520487, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, -532520477, iOnExtraCallbackWithResult3);
        Reference reference = Reference.SENSOR;
        Reference reference2 = Reference.OUTPUT;
        iAuthTabCallback.asInterface = getchildposition.onWarmupCompleted(reference, reference2, getChildViewHolder.RELATIVE_TO_SENSOR);
        iAuthTabCallback.asBinder = onExtraCallback(reference2);
        onEnterLayoutOrScroll onenterlayoutorscroll = new onEnterLayoutOrScroll(iAuthTabCallback, this, this.ICustomTabsCallback_Parcel);
        this.extraCallbackWithResult = onenterlayoutorscroll;
        onenterlayoutorscroll.onExtraCallbackWithResult();
        addfocusables.onExtraCallbackWithResult(new Object[]{"onTakePicture:", "executed."});
    }

    @Override // o.dispatchChildAttached
    protected void onExtraCallbackWithResult(@NonNull addRecyclerListener.IAuthTabCallback iAuthTabCallback, @NonNull removeItemDecoration removeitemdecoration, boolean z) {
        addFocusables addfocusables = dispatchChildDetached.extraCommand;
        addfocusables.onExtraCallbackWithResult(new Object[]{"onTakePictureSnapshot:", "executing."});
        Reference reference = Reference.OUTPUT;
        iAuthTabCallback.asBinder = onExtraCallbackWithResult(reference);
        if (this.onPostMessage instanceof RendererCameraPreview) {
            int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
            iAuthTabCallback.asInterface = ((getChildPosition) dispatchChildAttached.onWarmupCompleted(iOnExtraCallbackWithResult, 532520487, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, -532520477, iOnExtraCallbackWithResult3)).onWarmupCompleted(Reference.VIEW, reference, getChildViewHolder.ABSOLUTE);
            RendererCameraPreview rendererCameraPreview = this.onPostMessage;
            int iOnExtraCallbackWithResult4 = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = lt.40.onExtraCallbackWithResult();
            this.extraCallbackWithResult = new onScrolled(iAuthTabCallback, this, rendererCameraPreview, removeitemdecoration, (onChildAttachedToWindow) dispatchChildAttached.onWarmupCompleted(iOnExtraCallbackWithResult4, -629237862, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, new Object[]{this}, 629237875, iOnExtraCallbackWithResult6));
        } else {
            int iOnExtraCallbackWithResult7 = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult8 = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult9 = lt.40.onExtraCallbackWithResult();
            iAuthTabCallback.asInterface = ((getChildPosition) dispatchChildAttached.onWarmupCompleted(iOnExtraCallbackWithResult7, 532520487, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult8, new Object[]{this}, -532520477, iOnExtraCallbackWithResult9)).onWarmupCompleted(Reference.SENSOR, reference, getChildViewHolder.RELATIVE_TO_SENSOR);
            this.extraCallbackWithResult = new onGenericMotionEvent(iAuthTabCallback, this, this.ICustomTabsCallback_Parcel, removeitemdecoration);
        }
        this.extraCallbackWithResult.onExtraCallbackWithResult();
        addfocusables.onExtraCallbackWithResult(new Object[]{"onTakePictureSnapshot:", "executed."});
    }

    @Override // o.dispatchChildAttached
    public void IAuthTabCallback(@Nullable addOnChildAttachStateChangeListener$onWarmupCompleted addonchildattachstatechangelistener_onwarmupcompleted, @Nullable Exception exc) {
        super.IAuthTabCallback(addonchildattachstatechangelistener_onwarmupcompleted, exc);
        if (addonchildattachstatechangelistener_onwarmupcompleted == null) {
            this.ICustomTabsCallback_Parcel.lock();
        }
    }

    private void IAuthTabCallback(@NonNull Camera.Parameters parameters) {
        parameters.setRecordingHint(mayLaunchUrl() == clearOnScrollListeners.VIDEO);
        onNavigationEvent(parameters);
        onNavigationEvent(parameters, animateAppearance.OFF);
        onWarmupCompleted(parameters, (Location) null);
        onWarmupCompleted(parameters, dispatchLayout.AUTO);
        IAuthTabCallback(parameters, clearOnChildAttachStateChangeListeners.OFF);
        onExtraCallbackWithResult(parameters, 0.0f);
        IAuthTabCallback(parameters, 0.0f);
        asInterface(this.readTypedObject);
        onNavigationEvent(parameters, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNavigationEvent(@NonNull Camera.Parameters parameters) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (mayLaunchUrl() == clearOnScrollListeners.VIDEO && supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
            return;
        }
        if (supportedFocusModes.contains("continuous-picture")) {
            parameters.setFocusMode("continuous-picture");
        } else if (supportedFocusModes.contains("infinity")) {
            parameters.setFocusMode("infinity");
        } else if (supportedFocusModes.contains("fixed")) {
            parameters.setFocusMode("fixed");
        }
    }

    public void onWarmupCompleted(@NonNull animateAppearance animateappearance) {
        final animateAppearance animateappearance2 = this.IAuthTabCallbackStub;
        this.IAuthTabCallbackStub = animateappearance;
        this.asInterface = onSessionEnded().IAuthTabCallback("flash (" + animateappearance + ")", getItemDecorationCount.ENGINE, new Runnable() { // from class: o.consumePendingUpdateOperations.4
            @Override // java.lang.Runnable
            public void run() {
                Camera.Parameters parameters = consumePendingUpdateOperations.this.ICustomTabsCallback_Parcel.getParameters();
                if (consumePendingUpdateOperations.this.onNavigationEvent(parameters, animateappearance2)) {
                    consumePendingUpdateOperations.this.ICustomTabsCallback_Parcel.setParameters(parameters);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onNavigationEvent(@NonNull Camera.Parameters parameters, @NonNull animateAppearance animateappearance) {
        if (this.IAuthTabCallback.IAuthTabCallback(this.IAuthTabCallbackStub)) {
            parameters.setFlashMode(this.mayLaunchUrl.onNavigationEvent(this.IAuthTabCallbackStub));
            return true;
        }
        this.IAuthTabCallbackStub = animateappearance;
        return false;
    }

    public void IAuthTabCallback(@Nullable Location location) {
        final Location location2 = this.IAuthTabCallbackStubProxy;
        this.IAuthTabCallbackStubProxy = location;
        this.access100 = onSessionEnded().IAuthTabCallback("location", getItemDecorationCount.ENGINE, new Runnable() { // from class: o.consumePendingUpdateOperations.5
            @Override // java.lang.Runnable
            public void run() {
                Camera.Parameters parameters = consumePendingUpdateOperations.this.ICustomTabsCallback_Parcel.getParameters();
                if (consumePendingUpdateOperations.this.onWarmupCompleted(parameters, location2)) {
                    consumePendingUpdateOperations.this.ICustomTabsCallback_Parcel.setParameters(parameters);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onWarmupCompleted(@NonNull Camera.Parameters parameters, @Nullable Location location) {
        Location location2 = this.IAuthTabCallbackStubProxy;
        if (location2 == null) {
            return true;
        }
        parameters.setGpsLatitude(location2.getLatitude());
        parameters.setGpsLongitude(this.IAuthTabCallbackStubProxy.getLongitude());
        parameters.setGpsAltitude(this.IAuthTabCallbackStubProxy.getAltitude());
        parameters.setGpsTimestamp(this.IAuthTabCallbackStubProxy.getTime());
        parameters.setGpsProcessingMethod(this.IAuthTabCallbackStubProxy.getProvider());
        return true;
    }

    public void onExtraCallback(@NonNull dispatchLayout dispatchlayout) {
        final dispatchLayout dispatchlayout2 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = dispatchlayout;
        this.onUnminimized = onSessionEnded().IAuthTabCallback("white balance (" + dispatchlayout + ")", getItemDecorationCount.ENGINE, new Runnable() { // from class: o.consumePendingUpdateOperations.1
            @Override // java.lang.Runnable
            public void run() {
                Camera.Parameters parameters = consumePendingUpdateOperations.this.ICustomTabsCallback_Parcel.getParameters();
                if (consumePendingUpdateOperations.this.onWarmupCompleted(parameters, dispatchlayout2)) {
                    consumePendingUpdateOperations.this.ICustomTabsCallback_Parcel.setParameters(parameters);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onWarmupCompleted(@NonNull Camera.Parameters parameters, @NonNull dispatchLayout dispatchlayout) {
        if (this.IAuthTabCallback.IAuthTabCallback(this.ICustomTabsCallbackDefault)) {
            parameters.setWhiteBalance(this.mayLaunchUrl.onExtraCallback(this.ICustomTabsCallbackDefault));
            parameters.remove("auto-whitebalance-lock");
            return true;
        }
        this.ICustomTabsCallbackDefault = dispatchlayout;
        return false;
    }

    public void IAuthTabCallback(@NonNull clearOnChildAttachStateChangeListeners clearonchildattachstatechangelisteners) {
        final clearOnChildAttachStateChangeListeners clearonchildattachstatechangelisteners2 = this.IAuthTabCallback_Parcel;
        this.IAuthTabCallback_Parcel = clearonchildattachstatechangelisteners;
        this.getInterfaceDescriptor = onSessionEnded().IAuthTabCallback("hdr (" + clearonchildattachstatechangelisteners + ")", getItemDecorationCount.ENGINE, new Runnable() { // from class: o.consumePendingUpdateOperations.7
            @Override // java.lang.Runnable
            public void run() {
                Camera.Parameters parameters = consumePendingUpdateOperations.this.ICustomTabsCallback_Parcel.getParameters();
                if (consumePendingUpdateOperations.this.IAuthTabCallback(parameters, clearonchildattachstatechangelisteners2)) {
                    consumePendingUpdateOperations.this.ICustomTabsCallback_Parcel.setParameters(parameters);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean IAuthTabCallback(@NonNull Camera.Parameters parameters, @NonNull clearOnChildAttachStateChangeListeners clearonchildattachstatechangelisteners) {
        if (this.IAuthTabCallback.IAuthTabCallback(this.IAuthTabCallback_Parcel)) {
            parameters.setSceneMode(this.mayLaunchUrl.onNavigationEvent(this.IAuthTabCallback_Parcel));
            return true;
        }
        this.IAuthTabCallback_Parcel = clearonchildattachstatechangelisteners;
        return false;
    }

    public void onWarmupCompleted(float f, @Nullable final PointF[] pointFArr, final boolean z) {
        final float f2 = this.isEngagementSignalsApiAvailable;
        this.isEngagementSignalsApiAvailable = f;
        onSessionEnded().onNavigationEvent("zoom", 20);
        this.ICustomTabsCallbackStub = onSessionEnded().IAuthTabCallback("zoom", getItemDecorationCount.ENGINE, new Runnable() { // from class: o.consumePendingUpdateOperations.10
            @Override // java.lang.Runnable
            public void run() {
                Camera.Parameters parameters = consumePendingUpdateOperations.this.ICustomTabsCallback_Parcel.getParameters();
                if (consumePendingUpdateOperations.this.onExtraCallbackWithResult(parameters, f2)) {
                    consumePendingUpdateOperations.this.ICustomTabsCallback_Parcel.setParameters(parameters);
                    if (z) {
                        consumePendingUpdateOperations.this.ICustomTabsService_Parcel().onNavigationEvent(consumePendingUpdateOperations.this.isEngagementSignalsApiAvailable, pointFArr);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onExtraCallbackWithResult(@NonNull Camera.Parameters parameters, float f) {
        if (this.IAuthTabCallback.IAuthTabCallback_Parcel()) {
            parameters.setZoom((int) (this.isEngagementSignalsApiAvailable * parameters.getMaxZoom()));
            this.ICustomTabsCallback_Parcel.setParameters(parameters);
            return true;
        }
        this.isEngagementSignalsApiAvailable = f;
        return false;
    }

    public void onNavigationEvent(float f, @NonNull final float[] fArr, @Nullable final PointF[] pointFArr, final boolean z) {
        final float f2 = this.IAuthTabCallbackDefault;
        this.IAuthTabCallbackDefault = f;
        onSessionEnded().onNavigationEvent("exposure correction", 20);
        this.onExtraCallback = onSessionEnded().IAuthTabCallback("exposure correction", getItemDecorationCount.ENGINE, new Runnable() { // from class: o.consumePendingUpdateOperations.9
            @Override // java.lang.Runnable
            public void run() {
                Camera.Parameters parameters = consumePendingUpdateOperations.this.ICustomTabsCallback_Parcel.getParameters();
                if (consumePendingUpdateOperations.this.IAuthTabCallback(parameters, f2)) {
                    consumePendingUpdateOperations.this.ICustomTabsCallback_Parcel.setParameters(parameters);
                    if (z) {
                        consumePendingUpdateOperations.this.ICustomTabsService_Parcel().IAuthTabCallback(consumePendingUpdateOperations.this.IAuthTabCallbackDefault, fArr, pointFArr);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean IAuthTabCallback(@NonNull Camera.Parameters parameters, float f) {
        if (this.IAuthTabCallback.IAuthTabCallbackStubProxy()) {
            float fOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult();
            float fOnExtraCallback = this.IAuthTabCallback.onExtraCallback();
            float f2 = this.IAuthTabCallbackDefault;
            if (f2 < fOnExtraCallback) {
                fOnExtraCallbackWithResult = fOnExtraCallback;
            } else if (f2 <= fOnExtraCallbackWithResult) {
                fOnExtraCallbackWithResult = f2;
            }
            this.IAuthTabCallbackDefault = fOnExtraCallbackWithResult;
            parameters.setExposureCompensation((int) (fOnExtraCallbackWithResult / parameters.getExposureCompensationStep()));
            return true;
        }
        this.IAuthTabCallbackDefault = f;
        return false;
    }

    public void onWarmupCompleted(boolean z) {
        final boolean z2 = this.readTypedObject;
        this.readTypedObject = z;
        this.onMinimized = onSessionEnded().IAuthTabCallback("play sounds (" + z + ")", getItemDecorationCount.ENGINE, new Runnable() { // from class: o.consumePendingUpdateOperations.6
            @Override // java.lang.Runnable
            public void run() {
                consumePendingUpdateOperations.this.asInterface(z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean asInterface(boolean z) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.onWarmupCompleted, cameraInfo);
        if (cameraInfo.canDisableShutterSound) {
            try {
                return this.ICustomTabsCallback_Parcel.enableShutterSound(this.readTypedObject);
            } catch (RuntimeException unused) {
                return false;
            }
        }
        if (this.readTypedObject) {
            return true;
        }
        this.readTypedObject = z;
        return false;
    }

    public void onNavigationEvent(final float f) {
        this.onMessageChannelReady = f;
        this.onActivityResized = onSessionEnded().IAuthTabCallback("preview fps (" + f + ")", getItemDecorationCount.ENGINE, new Runnable() { // from class: o.consumePendingUpdateOperations.8
            @Override // java.lang.Runnable
            public void run() {
                Camera.Parameters parameters = consumePendingUpdateOperations.this.ICustomTabsCallback_Parcel.getParameters();
                if (consumePendingUpdateOperations.this.onNavigationEvent(parameters, f)) {
                    consumePendingUpdateOperations.this.ICustomTabsCallback_Parcel.setParameters(parameters);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onNavigationEvent(@NonNull Camera.Parameters parameters, float f) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        onExtraCallbackWithResult(supportedPreviewFpsRange);
        float f2 = this.onMessageChannelReady;
        if (f2 == 0.0f) {
            for (int[] iArr : supportedPreviewFpsRange) {
                int i = iArr[0];
                float f3 = i / 1000.0f;
                int i2 = iArr[1];
                float f4 = i2 / 1000.0f;
                if ((f3 <= 30.0f && 30.0f <= f4) || (f3 <= 24.0f && 24.0f <= f4)) {
                    parameters.setPreviewFpsRange(i, i2);
                    return true;
                }
            }
        } else {
            float fMin = Math.min(f2, this.IAuthTabCallback.onNavigationEvent());
            this.onMessageChannelReady = fMin;
            this.onMessageChannelReady = Math.max(fMin, this.IAuthTabCallback.onWarmupCompleted());
            for (int[] iArr2 : supportedPreviewFpsRange) {
                float f5 = iArr2[0] / 1000.0f;
                float f6 = iArr2[1] / 1000.0f;
                float fRound = Math.round(this.onMessageChannelReady);
                if (f5 <= fRound && fRound <= f6) {
                    parameters.setPreviewFpsRange(iArr2[0], iArr2[1]);
                    return true;
                }
            }
        }
        this.onMessageChannelReady = f;
        return false;
    }

    private void onExtraCallbackWithResult(List<int[]> list) {
        if (prefetch() && this.onMessageChannelReady != 0.0f) {
            Collections.sort(list, new Comparator<int[]>() { // from class: o.consumePendingUpdateOperations.12
                @Override // java.util.Comparator
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public int compare(int[] iArr, int[] iArr2) {
                    return (iArr[1] - iArr[0]) - (iArr2[1] - iArr2[0]);
                }
            });
        } else {
            Collections.sort(list, new Comparator<int[]>() { // from class: o.consumePendingUpdateOperations.2
                @Override // java.util.Comparator
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public int compare(int[] iArr, int[] iArr2) {
                    return (iArr2[1] - iArr2[0]) - (iArr[1] - iArr[0]);
                }
            });
        }
    }

    public void onNavigationEvent(@NonNull consumeFlingInHorizontalStretch consumeflinginhorizontalstretch) {
        if (consumeflinginhorizontalstretch != consumeFlingInHorizontalStretch.JPEG) {
            throw new UnsupportedOperationException("Unsupported picture format: " + consumeflinginhorizontalstretch);
        }
        this.writeTypedObject = consumeflinginhorizontalstretch;
    }

    @Override // o.dispatchChildAttached
    protected hasFixedSize onExtraCallbackWithResult(int i) {
        return new getMinFlingVelocity(i, this);
    }

    @Override // o.dispatchChildAttached
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public getMinFlingVelocity onNavigationEvent() {
        return super.onNavigationEvent();
    }

    public void onExtraCallbackWithResult(boolean z) {
        this.access000 = z;
    }

    public void onExtraCallback(int i) {
        this.onTransact = 17;
    }

    @Override // o.getMinFlingVelocity$onNavigationEvent
    public void onWarmupCompleted(@NonNull byte[] bArr) {
        getItemDecorationCount getitemdecorationcountIEngagementSignalsCallbackDefault = IEngagementSignalsCallbackDefault();
        getItemDecorationCount getitemdecorationcount = getItemDecorationCount.ENGINE;
        if (getitemdecorationcountIEngagementSignalsCallbackDefault.isAtLeast(getitemdecorationcount) && onGreatestScrollPercentageIncreased().isAtLeast(getitemdecorationcount)) {
            this.ICustomTabsCallback_Parcel.addCallbackBuffer(bArr);
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        getOnFlingListener getonflinglistenerOnExtraCallbackWithResult;
        if (bArr == null || (getonflinglistenerOnExtraCallbackWithResult = onNavigationEvent().onExtraCallbackWithResult(bArr, System.currentTimeMillis())) == null) {
            return;
        }
        ICustomTabsService_Parcel().IAuthTabCallback(getonflinglistenerOnExtraCallbackWithResult);
    }

    public void onNavigationEvent(@Nullable hasNestedScrollingParent hasnestedscrollingparent, @NonNull offsetChildrenVertical offsetchildrenvertical, @NonNull PointF pointF) {
        onSessionEnded().IAuthTabCallback("auto focus", getItemDecorationCount.BIND, new 3(this, offsetchildrenvertical, hasnestedscrollingparent, pointF));
    }
}
