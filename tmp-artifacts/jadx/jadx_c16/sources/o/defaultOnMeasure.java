package o;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.location.Location;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.wwx.lt;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.otaliastudios.cameraview.engine.offset.Reference;
import com.otaliastudios.cameraview.preview.RendererCameraPreview;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import o.addRecyclerListener;
import o.requestChildFocus;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class defaultOnMeasure extends dispatchChildAttached implements ImageReader.OnImageAvailableListener, dispatchOnScrollStateChanged {
    private CameraDevice ICustomTabsCallback_Parcel;
    private CaptureRequest.Builder ICustomTabsServiceDefault;
    private CameraCaptureSession ICustomTabsServiceStub;
    private CameraCharacteristics mayLaunchUrl;
    private ImageReader newAuthTabSession;
    private String newSession;
    private Surface newSessionWithExtras;
    private final List<dispatchNestedFling> onWarmupCompleted;
    private addOnChildAttachStateChangeListener$onWarmupCompleted postMessage;
    private TotalCaptureResult prefetch;
    private getAccessibilityClassName prefetchWithMultipleUrls;
    private final CameraManager receiveFile;
    private final findContainingViewHolder requestPostMessageChannel;
    private ImageReader requestPostMessageChannelWithExtras;
    private final boolean setEngagementSignalsCallback;
    private Surface validateRelationship;
    private final CameraCaptureSession.CaptureCallback warmup;

    protected int getInterfaceDescriptor() {
        return 1;
    }

    public defaultOnMeasure(dispatchChildDetached$onExtraCallbackWithResult dispatchchilddetached_onextracallbackwithresult) {
        super(dispatchchilddetached_onextracallbackwithresult);
        this.requestPostMessageChannel = findContainingViewHolder.IAuthTabCallback();
        this.setEngagementSignalsCallback = false;
        this.onWarmupCompleted = new CopyOnWriteArrayList();
        this.warmup = new CameraCaptureSession.CaptureCallback() { // from class: o.defaultOnMeasure.4
            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j, long j2) {
                Iterator it = defaultOnMeasure.this.onWarmupCompleted.iterator();
                while (it.hasNext()) {
                    ((dispatchNestedFling) it.next()).onWarmupCompleted(defaultOnMeasure.this, captureRequest);
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
                Iterator it = defaultOnMeasure.this.onWarmupCompleted.iterator();
                while (it.hasNext()) {
                    ((dispatchNestedFling) it.next()).onExtraCallback(defaultOnMeasure.this, captureRequest, captureResult);
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
                defaultOnMeasure.this.prefetch = totalCaptureResult;
                Iterator it = defaultOnMeasure.this.onWarmupCompleted.iterator();
                while (it.hasNext()) {
                    ((dispatchNestedFling) it.next()).IAuthTabCallback(defaultOnMeasure.this, captureRequest, totalCaptureResult);
                }
            }
        };
        this.receiveFile = (CameraManager) ICustomTabsService_Parcel().onExtraCallback().getSystemService("camera");
        new dispatchOnScrolled().onExtraCallbackWithResult(this);
    }

    <T> T onExtraCallbackWithResult(@NonNull CameraCharacteristics.Key<T> key, @NonNull T t) {
        return (T) onNavigationEvent(this.mayLaunchUrl, (CameraCharacteristics.Key<CameraCharacteristics.Key<T>>) key, (CameraCharacteristics.Key<T>) t);
    }

    private <T> T onNavigationEvent(@NonNull CameraCharacteristics cameraCharacteristics, @NonNull CameraCharacteristics.Key<T> key, @NonNull T t) {
        T t2 = (T) cameraCharacteristics.get(key);
        return t2 == null ? t : t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public stopScrollersInternal onExtraCallbackWithResult(@NonNull CameraAccessException cameraAccessException) {
        int reason = cameraAccessException.getReason();
        int i = 1;
        if (reason != 1) {
            if (reason == 2 || reason == 3) {
                i = 3;
            } else if (reason != 4 && reason != 5) {
                i = 0;
            }
        }
        return new stopScrollersInternal(cameraAccessException, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public stopScrollersInternal IAuthTabCallbackStubProxy(int i) {
        int i2 = 1;
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
            i2 = 0;
        }
        return new stopScrollersInternal(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CaptureRequest.Builder IAuthTabCallback_Parcel(int i) throws CameraAccessException {
        CaptureRequest.Builder builder = this.ICustomTabsServiceDefault;
        CaptureRequest.Builder builderCreateCaptureRequest = this.ICustomTabsCallback_Parcel.createCaptureRequest(i);
        this.ICustomTabsServiceDefault = builderCreateCaptureRequest;
        builderCreateCaptureRequest.setTag(Integer.valueOf(i));
        onNavigationEvent(this.ICustomTabsServiceDefault, builder);
        return this.ICustomTabsServiceDefault;
    }

    private void onExtraCallbackWithResult(@NonNull Surface... surfaceArr) {
        this.ICustomTabsServiceDefault.addTarget(this.validateRelationship);
        Surface surface = this.newSessionWithExtras;
        if (surface != null) {
            this.ICustomTabsServiceDefault.addTarget(surface);
        }
        for (Surface surface2 : surfaceArr) {
            if (surface2 == null) {
                throw new IllegalArgumentException("Should not add a null surface.");
            }
            this.ICustomTabsServiceDefault.addTarget(surface2);
        }
    }

    private void ITrustedWebActivityCallback() {
        this.ICustomTabsServiceDefault.removeTarget(this.validateRelationship);
        Surface surface = this.newSessionWithExtras;
        if (surface != null) {
            this.ICustomTabsServiceDefault.removeTarget(surface);
        }
    }

    protected void onExtraCallback() throws stopScrollersInternal, CameraAccessException {
        onWarmupCompleted(true, 3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.stopScrollersInternal */
    private void onWarmupCompleted(boolean z, int i) throws stopScrollersInternal, CameraAccessException {
        if ((IEngagementSignalsCallbackDefault() != getItemDecorationCount.PREVIEW || onVerticalScrollEvent()) && z) {
            return;
        }
        try {
            this.ICustomTabsServiceStub.setRepeatingRequest(this.ICustomTabsServiceDefault.build(), this.warmup, null);
        } catch (CameraAccessException e) {
            throw new stopScrollersInternal(e, i);
        } catch (IllegalStateException e2) {
            dispatchChildDetached.extraCommand.onNavigationEvent(new Object[]{"applyRepeatingRequestBuilder: session is invalid!", e2, "checkStarted:", Boolean.valueOf(z), "currentThread:", Thread.currentThread().getName(), "state:", IEngagementSignalsCallbackDefault(), "targetState:", onGreatestScrollPercentageIncreased()});
            throw new stopScrollersInternal(3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.stopScrollersInternal */
    @Override // o.dispatchChildAttached
    protected List<removeOnChildAttachStateChangeListener> onExtraCallbackWithResult() throws stopScrollersInternal {
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.receiveFile.getCameraCharacteristics(this.newSession).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap == null) {
                throw new RuntimeException("StreamConfigurationMap is null. Should not happen.");
            }
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(this.onPostMessage.onWarmupCompleted());
            ArrayList arrayList = new ArrayList(outputSizes.length);
            for (Size size : outputSizes) {
                removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener = new removeOnChildAttachStateChangeListener(size.getWidth(), size.getHeight());
                if (!arrayList.contains(removeonchildattachstatechangelistener)) {
                    arrayList.add(removeonchildattachstatechangelistener);
                }
            }
            return arrayList;
        } catch (CameraAccessException e) {
            throw onExtraCallbackWithResult(e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.stopScrollersInternal */
    @Override // o.dispatchChildAttached
    protected List<removeOnChildAttachStateChangeListener> onWarmupCompleted() throws stopScrollersInternal {
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.receiveFile.getCameraCharacteristics(this.newSession).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap == null) {
                throw new RuntimeException("StreamConfigurationMap is null. Should not happen.");
            }
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(this.onTransact);
            ArrayList arrayList = new ArrayList(outputSizes.length);
            for (Size size : outputSizes) {
                removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener = new removeOnChildAttachStateChangeListener(size.getWidth(), size.getHeight());
                if (!arrayList.contains(removeonchildattachstatechangelistener)) {
                    arrayList.add(removeonchildattachstatechangelistener);
                }
            }
            return arrayList;
        } catch (CameraAccessException e) {
            throw onExtraCallbackWithResult(e);
        }
    }

    @Override // o.dispatchChildAttached
    protected void IAuthTabCallback() {
        dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"onPreviewStreamSizeChanged:", "Calling restartBind()."});
        IEngagementSignalsCallback_Parcel();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.stopScrollersInternal */
    protected final boolean onWarmupCompleted(@NonNull clearOldPositions clearoldpositions) throws stopScrollersInternal, CameraAccessException {
        CameraCharacteristics cameraCharacteristics;
        int iOnNavigationEvent = this.requestPostMessageChannel.onNavigationEvent(clearoldpositions);
        try {
            String[] cameraIdList = this.receiveFile.getCameraIdList();
            dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"collectCameraInfo", "Facing:", clearoldpositions, "Internal:", Integer.valueOf(iOnNavigationEvent), "Cameras:", Integer.valueOf(cameraIdList.length)});
            for (String str : cameraIdList) {
                try {
                    cameraCharacteristics = this.receiveFile.getCameraCharacteristics(str);
                } catch (CameraAccessException unused) {
                }
                if (iOnNavigationEvent == ((Integer) onNavigationEvent(cameraCharacteristics, (CameraCharacteristics.Key<CameraCharacteristics.Key>) CameraCharacteristics.LENS_FACING, (CameraCharacteristics.Key) (-99))).intValue()) {
                    this.newSession = str;
                    ((getChildPosition) dispatchChildAttached.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 532520487, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{this}, -532520477, lt.40.onExtraCallbackWithResult())).onWarmupCompleted(clearoldpositions, ((Integer) onNavigationEvent(cameraCharacteristics, (CameraCharacteristics.Key<CameraCharacteristics.Key>) CameraCharacteristics.SENSOR_ORIENTATION, (CameraCharacteristics.Key) 0)).intValue());
                    return true;
                }
                continue;
            }
            return false;
        } catch (CameraAccessException e) {
            throw onExtraCallbackWithResult(e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.stopScrollersInternal */
    protected Task<stopGlowAnimations> IAuthTabCallbackStub() throws stopScrollersInternal, CameraAccessException {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            this.receiveFile.openCamera(this.newSession, new CameraDevice.StateCallback() { // from class: o.defaultOnMeasure.14
                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onOpened(@NonNull CameraDevice cameraDevice) {
                    int i;
                    defaultOnMeasure.this.ICustomTabsCallback_Parcel = cameraDevice;
                    try {
                        dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"onStartEngine:", "Opened camera device."});
                        defaultOnMeasure defaultonmeasure = defaultOnMeasure.this;
                        defaultonmeasure.mayLaunchUrl = defaultonmeasure.receiveFile.getCameraCharacteristics(defaultOnMeasure.this.newSession);
                        boolean zIAuthTabCallback = ((getChildPosition) dispatchChildAttached.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 532520487, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{defaultOnMeasure.this}, -532520477, lt.40.onExtraCallbackWithResult())).IAuthTabCallback(Reference.SENSOR, Reference.VIEW);
                        int i2 = AnonymousClass20.onNavigationEvent[defaultOnMeasure.this.writeTypedObject.ordinal()];
                        if (i2 == 1) {
                            i = 256;
                        } else {
                            if (i2 != 2) {
                                throw new IllegalArgumentException("Unknown format:" + defaultOnMeasure.this.writeTypedObject);
                            }
                            i = 32;
                        }
                        defaultOnMeasure defaultonmeasure2 = defaultOnMeasure.this;
                        defaultonmeasure2.IAuthTabCallback = new getCompatAccessibilityDelegate(defaultonmeasure2.receiveFile, defaultOnMeasure.this.newSession, zIAuthTabCallback, i);
                        defaultOnMeasure defaultonmeasure3 = defaultOnMeasure.this;
                        defaultonmeasure3.IAuthTabCallback_Parcel(defaultonmeasure3.getInterfaceDescriptor());
                        taskCompletionSource.trySetResult(defaultOnMeasure.this.IAuthTabCallback);
                    } catch (CameraAccessException e) {
                        taskCompletionSource.trySetException(defaultOnMeasure.this.onExtraCallbackWithResult(e));
                    }
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: o.stopScrollersInternal */
                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onDisconnected(@NonNull CameraDevice cameraDevice) throws stopScrollersInternal {
                    stopScrollersInternal stopscrollersinternal = new stopScrollersInternal(3);
                    if (!taskCompletionSource.getTask().isComplete()) {
                        taskCompletionSource.trySetException(stopscrollersinternal);
                    } else {
                        dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"CameraDevice.StateCallback reported disconnection."});
                        throw stopscrollersinternal;
                    }
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: o.stopScrollersInternal */
                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onError(@NonNull CameraDevice cameraDevice, int i) throws stopScrollersInternal {
                    if (!taskCompletionSource.getTask().isComplete()) {
                        taskCompletionSource.trySetException(defaultOnMeasure.this.IAuthTabCallbackStubProxy(i));
                    } else {
                        dispatchChildDetached.extraCommand.onNavigationEvent(new Object[]{"CameraDevice.StateCallback reported an error:", Integer.valueOf(i)});
                        throw new stopScrollersInternal(3);
                    }
                }
            }, (Handler) null);
            return taskCompletionSource.getTask();
        } catch (CameraAccessException e) {
            throw onExtraCallbackWithResult(e);
        }
    }

    /* renamed from: o.defaultOnMeasure$20, reason: invalid class name */
    static /* synthetic */ class AnonymousClass20 {
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[consumeFlingInHorizontalStretch.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[consumeFlingInHorizontalStretch.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[consumeFlingInHorizontalStretch.DNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.stopScrollersInternal */
    protected Task<Void> IAuthTabCallbackDefault() throws stopScrollersInternal, CameraAccessException {
        int i;
        addFocusables addfocusables = dispatchChildDetached.extraCommand;
        addfocusables.onExtraCallbackWithResult(new Object[]{"onStartBind:", "Started"});
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.onNavigationEvent = IAuthTabCallback_Parcel();
        this.onActivityLayout = (removeOnChildAttachStateChangeListener) dispatchChildAttached.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), 742035432, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{this}, -742035420, lt.40.onExtraCallbackWithResult());
        ArrayList arrayList = new ArrayList();
        Class clsOnWarmupCompleted = this.onPostMessage.onWarmupCompleted();
        final Object objOnExtraCallback = this.onPostMessage.onExtraCallback();
        if (clsOnWarmupCompleted == SurfaceHolder.class) {
            try {
                addfocusables.onExtraCallbackWithResult(new Object[]{"onStartBind:", "Waiting on UI thread..."});
                Tasks.await(Tasks.call(new Callable<Void>() { // from class: o.defaultOnMeasure.17
                    @Override // java.util.concurrent.Callable
                    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                    public Void call() {
                        ((SurfaceHolder) objOnExtraCallback).setFixedSize(defaultOnMeasure.this.onActivityLayout.onExtraCallback(), defaultOnMeasure.this.onActivityLayout.onExtraCallbackWithResult());
                        return null;
                    }
                }));
                this.validateRelationship = ((SurfaceHolder) objOnExtraCallback).getSurface();
            } catch (InterruptedException | ExecutionException e) {
                throw new stopScrollersInternal(e, 1);
            }
        } else if (clsOnWarmupCompleted == SurfaceTexture.class) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) objOnExtraCallback;
            surfaceTexture.setDefaultBufferSize(this.onActivityLayout.onExtraCallback(), this.onActivityLayout.onExtraCallbackWithResult());
            this.validateRelationship = new Surface(surfaceTexture);
        } else {
            throw new RuntimeException("Unknown CameraPreview output class.");
        }
        arrayList.add(this.validateRelationship);
        if (mayLaunchUrl() == clearOnScrollListeners.VIDEO && this.postMessage != null) {
            requestChildFocus requestchildfocus = new requestChildFocus(this, this.newSession);
            try {
                arrayList.add(requestchildfocus.onWarmupCompleted(this.postMessage));
                this.onRelationshipValidationResult = requestchildfocus;
            } catch (requestChildFocus.onExtraCallback e2) {
                throw new stopScrollersInternal(e2, 1);
            }
        }
        if (mayLaunchUrl() == clearOnScrollListeners.PICTURE) {
            int i2 = AnonymousClass20.onNavigationEvent[this.writeTypedObject.ordinal()];
            if (i2 == 1) {
                i = 256;
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException("Unknown format:" + this.writeTypedObject);
                }
                i = 32;
            }
            ImageReader imageReaderNewInstance = ImageReader.newInstance(this.onNavigationEvent.onExtraCallback(), this.onNavigationEvent.onExtraCallbackWithResult(), i, 2);
            this.requestPostMessageChannelWithExtras = imageReaderNewInstance;
            arrayList.add(imageReaderNewInstance.getSurface());
        }
        if (updateVisuals()) {
            removeOnChildAttachStateChangeListener removeonchildattachstatechangelistenerAccess000 = access000();
            this.asBinder = removeonchildattachstatechangelistenerAccess000;
            ImageReader imageReaderNewInstance2 = ImageReader.newInstance(removeonchildattachstatechangelistenerAccess000.onExtraCallback(), this.asBinder.onExtraCallbackWithResult(), this.onTransact, ((Integer) dispatchChildAttached.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), -879347596, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{this}, 879347599, lt.40.onExtraCallbackWithResult())).intValue() + 1);
            this.newAuthTabSession = imageReaderNewInstance2;
            imageReaderNewInstance2.setOnImageAvailableListener(this, null);
            Surface surface = this.newAuthTabSession.getSurface();
            this.newSessionWithExtras = surface;
            arrayList.add(surface);
        } else {
            this.newAuthTabSession = null;
            this.asBinder = null;
            this.newSessionWithExtras = null;
        }
        try {
            this.ICustomTabsCallback_Parcel.createCaptureSession(arrayList, new CameraCaptureSession.StateCallback() { // from class: o.defaultOnMeasure.16
                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
                    defaultOnMeasure.this.ICustomTabsServiceStub = cameraCaptureSession;
                    dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"onStartBind:", "Completed"});
                    taskCompletionSource.trySetResult((Object) null);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: o.stopScrollersInternal */
                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) throws stopScrollersInternal {
                    RuntimeException runtimeException = new RuntimeException(dispatchChildDetached.extraCommand.onNavigationEvent(new Object[]{"onConfigureFailed! Session", cameraCaptureSession}));
                    if (!taskCompletionSource.getTask().isComplete()) {
                        taskCompletionSource.trySetException(new stopScrollersInternal(runtimeException, 2));
                        return;
                    }
                    throw new stopScrollersInternal(3);
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onReady(@NonNull CameraCaptureSession cameraCaptureSession) {
                    super.onReady(cameraCaptureSession);
                    dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"CameraCaptureSession.StateCallback reported onReady."});
                }
            }, null);
            return taskCompletionSource.getTask();
        } catch (CameraAccessException e3) {
            throw onExtraCallbackWithResult(e3);
        }
    }

    protected Task<Void> asBinder() throws stopScrollersInternal, CameraAccessException {
        addFocusables addfocusables = dispatchChildDetached.extraCommand;
        addfocusables.onExtraCallbackWithResult(new Object[]{"onStartPreview:", "Dispatching onCameraPreviewStreamSizeChanged."});
        ICustomTabsService_Parcel().IAuthTabCallbackStub();
        Reference reference = Reference.VIEW;
        removeOnChildAttachStateChangeListener removeonchildattachstatechangelistenerOnWarmupCompleted = onWarmupCompleted(reference);
        if (removeonchildattachstatechangelistenerOnWarmupCompleted == null) {
            throw new IllegalStateException("previewStreamSize should not be null at this point.");
        }
        this.onPostMessage.IAuthTabCallback(removeonchildattachstatechangelistenerOnWarmupCompleted.onExtraCallback(), removeonchildattachstatechangelistenerOnWarmupCompleted.onExtraCallbackWithResult());
        removeAnimatingView removeanimatingview = this.onPostMessage;
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        removeanimatingview.onExtraCallback(((getChildPosition) dispatchChildAttached.onWarmupCompleted(iOnExtraCallbackWithResult, 532520487, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, -532520477, iOnExtraCallbackWithResult3)).onWarmupCompleted(Reference.BASE, reference, getChildViewHolder.ABSOLUTE));
        if (updateVisuals()) {
            hasFixedSize hasfixedsizeOnNavigationEvent = onNavigationEvent();
            int i = this.onTransact;
            removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener = this.asBinder;
            int iOnExtraCallbackWithResult4 = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = lt.40.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = lt.40.onExtraCallbackWithResult();
            hasfixedsizeOnNavigationEvent.onExtraCallbackWithResult(i, removeonchildattachstatechangelistener, (getChildPosition) dispatchChildAttached.onWarmupCompleted(iOnExtraCallbackWithResult4, 532520487, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, new Object[]{this}, -532520477, iOnExtraCallbackWithResult6));
        }
        addfocusables.onExtraCallbackWithResult(new Object[]{"onStartPreview:", "Starting preview."});
        onExtraCallbackWithResult(new Surface[0]);
        onWarmupCompleted(false, 2);
        addfocusables.onExtraCallbackWithResult(new Object[]{"onStartPreview:", "Started preview."});
        final addOnChildAttachStateChangeListener$onWarmupCompleted addonchildattachstatechangelistener_onwarmupcompleted = this.postMessage;
        if (addonchildattachstatechangelistener_onwarmupcompleted != null) {
            this.postMessage = null;
            onSessionEnded().IAuthTabCallback("do take video", getItemDecorationCount.PREVIEW, new Runnable() { // from class: o.defaultOnMeasure.19
                @Override // java.lang.Runnable
                public void run() throws Exception {
                    defaultOnMeasure.this.onWarmupCompleted(addonchildattachstatechangelistener_onwarmupcompleted);
                }
            });
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        new ensureRightGlow() { // from class: o.defaultOnMeasure.21
            public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
                super.IAuthTabCallback(dispatchonscrollstatechanged, captureRequest, totalCaptureResult);
                onNavigationEvent(Integer.MAX_VALUE);
                taskCompletionSource.trySetResult((Object) null);
            }
        }.onExtraCallbackWithResult(this);
        return taskCompletionSource.getTask();
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
        if (updateVisuals()) {
            onNavigationEvent().onWarmupCompleted();
        }
        ITrustedWebActivityCallback();
        this.prefetch = null;
        addfocusables.onExtraCallbackWithResult(new Object[]{"onStopPreview:", "Returning."});
        return Tasks.forResult((Object) null);
    }

    protected Task<Void> asInterface() {
        addFocusables addfocusables = dispatchChildDetached.extraCommand;
        addfocusables.onExtraCallbackWithResult(new Object[]{"onStopBind:", "About to clean up."});
        this.newSessionWithExtras = null;
        this.validateRelationship = null;
        this.onActivityLayout = null;
        this.onNavigationEvent = null;
        this.asBinder = null;
        ImageReader imageReader = this.newAuthTabSession;
        if (imageReader != null) {
            imageReader.close();
            this.newAuthTabSession = null;
        }
        ImageReader imageReader2 = this.requestPostMessageChannelWithExtras;
        if (imageReader2 != null) {
            imageReader2.close();
            this.requestPostMessageChannelWithExtras = null;
        }
        this.ICustomTabsServiceStub.close();
        this.ICustomTabsServiceStub = null;
        addfocusables.onExtraCallbackWithResult(new Object[]{"onStopBind:", "Returning."});
        return Tasks.forResult((Object) null);
    }

    protected Task<Void> onTransact() {
        try {
            addFocusables addfocusables = dispatchChildDetached.extraCommand;
            addfocusables.onExtraCallbackWithResult(new Object[]{"onStopEngine:", "Clean up.", "Releasing camera."});
            this.ICustomTabsCallback_Parcel.close();
            addfocusables.onExtraCallbackWithResult(new Object[]{"onStopEngine:", "Clean up.", "Released camera."});
        } catch (Exception e) {
            dispatchChildDetached.extraCommand.onWarmupCompleted(new Object[]{"onStopEngine:", "Clean up.", "Exception while releasing camera.", e});
        }
        this.ICustomTabsCallback_Parcel = null;
        dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"onStopEngine:", "Aborting actions."});
        Iterator<dispatchNestedFling> it = this.onWarmupCompleted.iterator();
        while (it.hasNext()) {
            it.next().onWarmupCompleted(this);
        }
        this.mayLaunchUrl = null;
        this.IAuthTabCallback = null;
        this.onRelationshipValidationResult = null;
        this.ICustomTabsServiceDefault = null;
        dispatchChildDetached.extraCommand.onWarmupCompleted(new Object[]{"onStopEngine:", "Returning."});
        return Tasks.forResult((Object) null);
    }

    @Override // o.dispatchChildAttached
    protected void onExtraCallbackWithResult(@NonNull final addRecyclerListener.IAuthTabCallback iAuthTabCallback, @NonNull removeItemDecoration removeitemdecoration, boolean z) {
        if (z) {
            dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"onTakePictureSnapshot:", "doMetering is true. Delaying."});
            ensureRightGlow ensurerightglowOnExtraCallbackWithResult = dispatchNestedScroll.onExtraCallbackWithResult(2500L, onExtraCallback((offsetChildrenVertical) null));
            ensurerightglowOnExtraCallbackWithResult.onWarmupCompleted(new ensureBottomGlow() { // from class: o.defaultOnMeasure.24
                public void onNavigationEvent(@NonNull dispatchNestedFling dispatchnestedfling) {
                    defaultOnMeasure.this.onNavigationEvent(false);
                    defaultOnMeasure.this.IAuthTabCallback(iAuthTabCallback);
                    defaultOnMeasure.this.onNavigationEvent(true);
                }
            });
            ensurerightglowOnExtraCallbackWithResult.onExtraCallbackWithResult(this);
            return;
        }
        dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"onTakePictureSnapshot:", "doMetering is false. Performing."});
        if (!(this.onPostMessage instanceof RendererCameraPreview)) {
            throw new RuntimeException("takePictureSnapshot with Camera2 is only supported with Preview.GL_SURFACE");
        }
        Reference reference = Reference.OUTPUT;
        iAuthTabCallback.asBinder = onExtraCallbackWithResult(reference);
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        iAuthTabCallback.asInterface = ((getChildPosition) dispatchChildAttached.onWarmupCompleted(iOnExtraCallbackWithResult, 532520487, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, -532520477, iOnExtraCallbackWithResult3)).onWarmupCompleted(Reference.VIEW, reference, getChildViewHolder.ABSOLUTE);
        onScrollStateChanged onscrollstatechanged = new onScrollStateChanged(iAuthTabCallback, this, this.onPostMessage, removeitemdecoration);
        this.extraCallbackWithResult = onscrollstatechanged;
        onscrollstatechanged.onExtraCallbackWithResult();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.stopScrollersInternal */
    @Override // o.dispatchChildAttached
    protected void onExtraCallbackWithResult(@NonNull final addRecyclerListener.IAuthTabCallback iAuthTabCallback, boolean z) throws stopScrollersInternal, CameraAccessException {
        if (z) {
            dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"onTakePicture:", "doMetering is true. Delaying."});
            ensureRightGlow ensurerightglowOnExtraCallbackWithResult = dispatchNestedScroll.onExtraCallbackWithResult(2500L, onExtraCallback((offsetChildrenVertical) null));
            ensurerightglowOnExtraCallbackWithResult.onWarmupCompleted(new ensureBottomGlow() { // from class: o.defaultOnMeasure.25
                public void onNavigationEvent(@NonNull dispatchNestedFling dispatchnestedfling) {
                    defaultOnMeasure.this.onExtraCallback(false);
                    defaultOnMeasure.this.onExtraCallback(iAuthTabCallback);
                    defaultOnMeasure.this.onExtraCallback(true);
                }
            });
            ensurerightglowOnExtraCallbackWithResult.onExtraCallbackWithResult(this);
            return;
        }
        dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"onTakePicture:", "doMetering is false. Performing."});
        int iOnExtraCallbackWithResult = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = lt.40.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = lt.40.onExtraCallbackWithResult();
        getChildPosition getchildposition = (getChildPosition) dispatchChildAttached.onWarmupCompleted(iOnExtraCallbackWithResult, 532520487, lt.40.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, -532520477, iOnExtraCallbackWithResult3);
        Reference reference = Reference.SENSOR;
        Reference reference2 = Reference.OUTPUT;
        iAuthTabCallback.asInterface = getchildposition.onWarmupCompleted(reference, reference2, getChildViewHolder.RELATIVE_TO_SENSOR);
        iAuthTabCallback.asBinder = onExtraCallback(reference2);
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = this.ICustomTabsCallback_Parcel.createCaptureRequest(2);
            onNavigationEvent(builderCreateCaptureRequest, this.ICustomTabsServiceDefault);
            onChildDetachedFromWindow onchilddetachedfromwindow = new onChildDetachedFromWindow(iAuthTabCallback, this, builderCreateCaptureRequest, this.requestPostMessageChannelWithExtras);
            this.extraCallbackWithResult = onchilddetachedfromwindow;
            onchilddetachedfromwindow.onExtraCallbackWithResult();
        } catch (CameraAccessException e) {
            throw onExtraCallbackWithResult(e);
        }
    }

    @Override // o.dispatchChildAttached
    public void IAuthTabCallback(@Nullable addRecyclerListener.IAuthTabCallback iAuthTabCallback, @Nullable Exception exc) {
        boolean z = this.extraCallbackWithResult instanceof onChildDetachedFromWindow;
        super.IAuthTabCallback(iAuthTabCallback, exc);
        if (!(z && isEngagementSignalsApiAvailable()) && (z || !newAuthTabSession())) {
            return;
        }
        onSessionEnded().IAuthTabCallback("reset metering after picture", getItemDecorationCount.PREVIEW, new Runnable() { // from class: o.defaultOnMeasure.23
            @Override // java.lang.Runnable
            public void run() {
                defaultOnMeasure.this.IPostMessageServiceStubProxy();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: o.stopScrollersInternal */
    public void onWarmupCompleted(@NonNull addOnChildAttachStateChangeListener$onWarmupCompleted addonchildattachstatechangelistener_onwarmupcompleted) throws Exception {
        requestChildFocus requestchildfocus = this.onRelationshipValidationResult;
        if (!(requestchildfocus instanceof requestChildFocus)) {
            throw new IllegalStateException("doTakeVideo called, but video recorder is not a Full2VideoRecorder! " + this.onRelationshipValidationResult);
        }
        requestChildFocus requestchildfocus2 = requestchildfocus;
        try {
            IAuthTabCallback_Parcel(3);
            onExtraCallbackWithResult(requestchildfocus2.onExtraCallbackWithResult());
            onWarmupCompleted(true, 3);
            this.onRelationshipValidationResult.onExtraCallbackWithResult(addonchildattachstatechangelistener_onwarmupcompleted);
        } catch (stopScrollersInternal e) {
            IAuthTabCallback((addOnChildAttachStateChangeListener$onWarmupCompleted) null, e);
            throw e;
        } catch (CameraAccessException e2) {
            IAuthTabCallback((addOnChildAttachStateChangeListener$onWarmupCompleted) null, e2);
            throw onExtraCallbackWithResult(e2);
        }
    }

    @Override // o.dispatchChildAttached
    public void IAuthTabCallbackStubProxy() throws InterruptedException, stopScrollersInternal {
        super.IAuthTabCallbackStubProxy();
        if ((this.onRelationshipValidationResult instanceof requestChildFocus) && ((Integer) onExtraCallbackWithResult((CameraCharacteristics.Key<CameraCharacteristics.Key>) CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, (CameraCharacteristics.Key) (-1))).intValue() == 2) {
            addFocusables addfocusables = dispatchChildDetached.extraCommand;
            addfocusables.onWarmupCompleted(new Object[]{"Applying the Issue549 workaround.", Thread.currentThread()});
            IPostMessageService_Parcel();
            addfocusables.onWarmupCompleted(new Object[]{"Applied the Issue549 workaround. Sleeping..."});
            try {
                Thread.sleep(600L);
            } catch (InterruptedException unused) {
            }
            dispatchChildDetached.extraCommand.onWarmupCompleted(new Object[]{"Applied the Issue549 workaround. Slept!"});
        }
    }

    @Override // o.dispatchChildAttached
    public void IAuthTabCallback(@Nullable addOnChildAttachStateChangeListener$onWarmupCompleted addonchildattachstatechangelistener_onwarmupcompleted, @Nullable Exception exc) {
        super.IAuthTabCallback(addonchildattachstatechangelistener_onwarmupcompleted, exc);
        onSessionEnded().IAuthTabCallback("restore preview template", getItemDecorationCount.BIND, new Runnable() { // from class: o.defaultOnMeasure.2
            @Override // java.lang.Runnable
            public void run() throws stopScrollersInternal {
                defaultOnMeasure.this.IPostMessageService_Parcel();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: o.stopScrollersInternal */
    public void IPostMessageService_Parcel() throws stopScrollersInternal {
        if (((Integer) this.ICustomTabsServiceDefault.build().getTag()).intValue() != getInterfaceDescriptor()) {
            try {
                IAuthTabCallback_Parcel(getInterfaceDescriptor());
                onExtraCallbackWithResult(new Surface[0]);
                onExtraCallback();
            } catch (CameraAccessException e) {
                throw onExtraCallbackWithResult(e);
            }
        }
    }

    private void onNavigationEvent(@NonNull CaptureRequest.Builder builder, @Nullable CaptureRequest.Builder builder2) {
        dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"applyAllParameters:", "called for tag", builder.build().getTag()});
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        onNavigationEvent(builder);
        onExtraCallbackWithResult(builder, animateAppearance.OFF);
        IAuthTabCallback(builder, (Location) null);
        onNavigationEvent(builder, dispatchLayout.AUTO);
        onExtraCallback(builder, clearOnChildAttachStateChangeListeners.OFF);
        onExtraCallbackWithResult(builder, 0.0f);
        onWarmupCompleted(builder, 0.0f);
        onExtraCallback(builder, 0.0f);
        if (builder2 != null) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_REGIONS;
            builder.set(key, (MeteringRectangle[]) builder2.get(key));
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_REGIONS;
            builder.set(key2, (MeteringRectangle[]) builder2.get(key2));
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_REGIONS;
            builder.set(key3, (MeteringRectangle[]) builder2.get(key3));
            CaptureRequest.Key key4 = CaptureRequest.CONTROL_AF_MODE;
            builder.set(key4, (Integer) builder2.get(key4));
        }
    }

    protected void onNavigationEvent(@NonNull CaptureRequest.Builder builder) {
        int[] iArr = (int[]) onExtraCallbackWithResult((CameraCharacteristics.Key<CameraCharacteristics.Key>) CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, (CameraCharacteristics.Key) new int[0]);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        if (mayLaunchUrl() == clearOnScrollListeners.VIDEO && arrayList.contains(3)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
            return;
        }
        if (arrayList.contains(4)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
            return;
        }
        if (arrayList.contains(1)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        } else if (arrayList.contains(0)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 0);
            builder.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(0.0f));
        }
    }

    protected void onExtraCallbackWithResult(@NonNull CaptureRequest.Builder builder) {
        int[] iArr = (int[]) onExtraCallbackWithResult((CameraCharacteristics.Key<CameraCharacteristics.Key>) CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, (CameraCharacteristics.Key) new int[0]);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        if (arrayList.contains(1)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
            return;
        }
        if (mayLaunchUrl() == clearOnScrollListeners.VIDEO && arrayList.contains(3)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
        } else if (arrayList.contains(4)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
        }
    }

    public void onWarmupCompleted(@NonNull final animateAppearance animateappearance) {
        final animateAppearance animateappearance2 = this.IAuthTabCallbackStub;
        this.IAuthTabCallbackStub = animateappearance;
        this.asInterface = onSessionEnded().IAuthTabCallback("flash (" + animateappearance + ")", getItemDecorationCount.ENGINE, new Runnable() { // from class: o.defaultOnMeasure.5
            /* JADX INFO: Thrown type has an unknown type hierarchy: o.stopScrollersInternal */
            @Override // java.lang.Runnable
            public void run() throws stopScrollersInternal, CameraAccessException {
                defaultOnMeasure defaultonmeasure = defaultOnMeasure.this;
                boolean zOnExtraCallbackWithResult = defaultonmeasure.onExtraCallbackWithResult(defaultonmeasure.ICustomTabsServiceDefault, animateappearance2);
                if (defaultOnMeasure.this.IEngagementSignalsCallbackDefault() != getItemDecorationCount.PREVIEW) {
                    if (zOnExtraCallbackWithResult) {
                        defaultOnMeasure.this.onExtraCallback();
                        return;
                    }
                    return;
                }
                defaultOnMeasure defaultonmeasure2 = defaultOnMeasure.this;
                defaultonmeasure2.IAuthTabCallbackStub = animateAppearance.OFF;
                defaultonmeasure2.onExtraCallbackWithResult(defaultonmeasure2.ICustomTabsServiceDefault, animateappearance2);
                try {
                    defaultOnMeasure.this.ICustomTabsServiceStub.capture(defaultOnMeasure.this.ICustomTabsServiceDefault.build(), null, null);
                    defaultOnMeasure defaultonmeasure3 = defaultOnMeasure.this;
                    defaultonmeasure3.IAuthTabCallbackStub = animateappearance;
                    defaultonmeasure3.onExtraCallbackWithResult(defaultonmeasure3.ICustomTabsServiceDefault, animateappearance2);
                    defaultOnMeasure.this.onExtraCallback();
                } catch (CameraAccessException e) {
                    throw defaultOnMeasure.this.onExtraCallbackWithResult(e);
                }
            }
        });
    }

    protected boolean onExtraCallbackWithResult(@NonNull CaptureRequest.Builder builder, @NonNull animateAppearance animateappearance) {
        if (this.IAuthTabCallback.IAuthTabCallback(this.IAuthTabCallbackStub)) {
            int[] iArr = (int[]) onExtraCallbackWithResult((CameraCharacteristics.Key<CameraCharacteristics.Key>) CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES, (CameraCharacteristics.Key) new int[0]);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                arrayList.add(Integer.valueOf(i));
            }
            for (Pair pair : this.requestPostMessageChannel.onNavigationEvent(this.IAuthTabCallbackStub)) {
                if (arrayList.contains(pair.first)) {
                    addFocusables addfocusables = dispatchChildDetached.extraCommand;
                    addfocusables.onExtraCallbackWithResult(new Object[]{"applyFlash: setting CONTROL_AE_MODE to", pair.first});
                    addfocusables.onExtraCallbackWithResult(new Object[]{"applyFlash: setting FLASH_MODE to", pair.second});
                    builder.set(CaptureRequest.CONTROL_AE_MODE, (Integer) pair.first);
                    builder.set(CaptureRequest.FLASH_MODE, (Integer) pair.second);
                    return true;
                }
            }
        }
        this.IAuthTabCallbackStub = animateappearance;
        return false;
    }

    public void IAuthTabCallback(@Nullable Location location) {
        final Location location2 = this.IAuthTabCallbackStubProxy;
        this.IAuthTabCallbackStubProxy = location;
        this.access100 = onSessionEnded().IAuthTabCallback("location", getItemDecorationCount.ENGINE, new Runnable() { // from class: o.defaultOnMeasure.3
            @Override // java.lang.Runnable
            public void run() throws stopScrollersInternal, CameraAccessException {
                defaultOnMeasure defaultonmeasure = defaultOnMeasure.this;
                if (defaultonmeasure.IAuthTabCallback(defaultonmeasure.ICustomTabsServiceDefault, location2)) {
                    defaultOnMeasure.this.onExtraCallback();
                }
            }
        });
    }

    protected boolean IAuthTabCallback(@NonNull CaptureRequest.Builder builder, @Nullable Location location) {
        Location location2 = this.IAuthTabCallbackStubProxy;
        if (location2 == null) {
            return true;
        }
        builder.set(CaptureRequest.JPEG_GPS_LOCATION, location2);
        return true;
    }

    public void onExtraCallback(@NonNull dispatchLayout dispatchlayout) {
        final dispatchLayout dispatchlayout2 = this.ICustomTabsCallbackDefault;
        this.ICustomTabsCallbackDefault = dispatchlayout;
        this.onUnminimized = onSessionEnded().IAuthTabCallback("white balance (" + dispatchlayout + ")", getItemDecorationCount.ENGINE, new Runnable() { // from class: o.defaultOnMeasure.1
            @Override // java.lang.Runnable
            public void run() throws stopScrollersInternal, CameraAccessException {
                defaultOnMeasure defaultonmeasure = defaultOnMeasure.this;
                if (defaultonmeasure.onNavigationEvent(defaultonmeasure.ICustomTabsServiceDefault, dispatchlayout2)) {
                    defaultOnMeasure.this.onExtraCallback();
                }
            }
        });
    }

    protected boolean onNavigationEvent(@NonNull CaptureRequest.Builder builder, @NonNull dispatchLayout dispatchlayout) {
        if (this.IAuthTabCallback.IAuthTabCallback(this.ICustomTabsCallbackDefault)) {
            builder.set(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(this.requestPostMessageChannel.IAuthTabCallback(this.ICustomTabsCallbackDefault)));
            return true;
        }
        this.ICustomTabsCallbackDefault = dispatchlayout;
        return false;
    }

    public void IAuthTabCallback(@NonNull clearOnChildAttachStateChangeListeners clearonchildattachstatechangelisteners) {
        final clearOnChildAttachStateChangeListeners clearonchildattachstatechangelisteners2 = this.IAuthTabCallback_Parcel;
        this.IAuthTabCallback_Parcel = clearonchildattachstatechangelisteners;
        this.getInterfaceDescriptor = onSessionEnded().IAuthTabCallback("hdr (" + clearonchildattachstatechangelisteners + ")", getItemDecorationCount.ENGINE, new Runnable() { // from class: o.defaultOnMeasure.6
            @Override // java.lang.Runnable
            public void run() throws stopScrollersInternal, CameraAccessException {
                defaultOnMeasure defaultonmeasure = defaultOnMeasure.this;
                if (defaultonmeasure.onExtraCallback(defaultonmeasure.ICustomTabsServiceDefault, clearonchildattachstatechangelisteners2)) {
                    defaultOnMeasure.this.onExtraCallback();
                }
            }
        });
    }

    protected boolean onExtraCallback(@NonNull CaptureRequest.Builder builder, @NonNull clearOnChildAttachStateChangeListeners clearonchildattachstatechangelisteners) {
        if (this.IAuthTabCallback.IAuthTabCallback(this.IAuthTabCallback_Parcel)) {
            builder.set(CaptureRequest.CONTROL_SCENE_MODE, Integer.valueOf(this.requestPostMessageChannel.onExtraCallbackWithResult(this.IAuthTabCallback_Parcel)));
            return true;
        }
        this.IAuthTabCallback_Parcel = clearonchildattachstatechangelisteners;
        return false;
    }

    public void onWarmupCompleted(final float f, @Nullable final PointF[] pointFArr, final boolean z) {
        final float f2 = this.isEngagementSignalsApiAvailable;
        this.isEngagementSignalsApiAvailable = f;
        onSessionEnded().onNavigationEvent("zoom", 20);
        this.ICustomTabsCallbackStub = onSessionEnded().IAuthTabCallback("zoom", getItemDecorationCount.ENGINE, new Runnable() { // from class: o.defaultOnMeasure.10
            @Override // java.lang.Runnable
            public void run() throws stopScrollersInternal, CameraAccessException {
                defaultOnMeasure defaultonmeasure = defaultOnMeasure.this;
                if (defaultonmeasure.onExtraCallbackWithResult(defaultonmeasure.ICustomTabsServiceDefault, f2)) {
                    defaultOnMeasure.this.onExtraCallback();
                    if (z) {
                        defaultOnMeasure.this.ICustomTabsService_Parcel().onNavigationEvent(f, pointFArr);
                    }
                }
            }
        });
    }

    protected boolean onExtraCallbackWithResult(@NonNull CaptureRequest.Builder builder, float f) {
        if (this.IAuthTabCallback.IAuthTabCallback_Parcel()) {
            float fFloatValue = ((Float) onExtraCallbackWithResult((CameraCharacteristics.Key<CameraCharacteristics.Key>) CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM, (CameraCharacteristics.Key) Float.valueOf(1.0f))).floatValue();
            builder.set(CaptureRequest.SCALER_CROP_REGION, onWarmupCompleted((this.isEngagementSignalsApiAvailable * (fFloatValue - 1.0f)) + 1.0f, fFloatValue));
            return true;
        }
        this.isEngagementSignalsApiAvailable = f;
        return false;
    }

    private Rect onWarmupCompleted(float f, float f2) {
        Rect rect = (Rect) onExtraCallbackWithResult((CameraCharacteristics.Key<CameraCharacteristics.Key>) CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE, (CameraCharacteristics.Key) new Rect());
        int iWidth = (int) (rect.width() / f2);
        int iHeight = (int) (rect.height() / f2);
        float f3 = f - 1.0f;
        float f4 = f2 - 1.0f;
        int iWidth2 = (int) ((((rect.width() - iWidth) * f3) / f4) / 2.0f);
        int iHeight2 = (int) ((((rect.height() - iHeight) * f3) / f4) / 2.0f);
        return new Rect(iWidth2, iHeight2, rect.width() - iWidth2, rect.height() - iHeight2);
    }

    public void onNavigationEvent(final float f, @NonNull final float[] fArr, @Nullable final PointF[] pointFArr, final boolean z) {
        final float f2 = this.IAuthTabCallbackDefault;
        this.IAuthTabCallbackDefault = f;
        onSessionEnded().onNavigationEvent("exposure correction", 20);
        this.onExtraCallback = onSessionEnded().IAuthTabCallback("exposure correction", getItemDecorationCount.ENGINE, new Runnable() { // from class: o.defaultOnMeasure.7
            @Override // java.lang.Runnable
            public void run() throws stopScrollersInternal, CameraAccessException {
                defaultOnMeasure defaultonmeasure = defaultOnMeasure.this;
                if (defaultonmeasure.onWarmupCompleted(defaultonmeasure.ICustomTabsServiceDefault, f2)) {
                    defaultOnMeasure.this.onExtraCallback();
                    if (z) {
                        defaultOnMeasure.this.ICustomTabsService_Parcel().IAuthTabCallback(f, fArr, pointFArr);
                    }
                }
            }
        });
    }

    protected boolean onWarmupCompleted(@NonNull CaptureRequest.Builder builder, float f) {
        if (this.IAuthTabCallback.IAuthTabCallbackStubProxy()) {
            builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(Math.round(this.IAuthTabCallbackDefault * ((Rational) onExtraCallbackWithResult((CameraCharacteristics.Key<CameraCharacteristics.Key>) CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP, (CameraCharacteristics.Key) new Rational(1, 1))).floatValue())));
            return true;
        }
        this.IAuthTabCallbackDefault = f;
        return false;
    }

    public void onWarmupCompleted(boolean z) {
        this.readTypedObject = z;
        this.onMinimized = Tasks.forResult((Object) null);
    }

    public void onNavigationEvent(float f) {
        final float f2 = this.onMessageChannelReady;
        this.onMessageChannelReady = f;
        this.onActivityResized = onSessionEnded().IAuthTabCallback("preview fps (" + f + ")", getItemDecorationCount.ENGINE, new Runnable() { // from class: o.defaultOnMeasure.9
            @Override // java.lang.Runnable
            public void run() throws stopScrollersInternal, CameraAccessException {
                defaultOnMeasure defaultonmeasure = defaultOnMeasure.this;
                if (defaultonmeasure.onExtraCallback(defaultonmeasure.ICustomTabsServiceDefault, f2)) {
                    defaultOnMeasure.this.onExtraCallback();
                }
            }
        });
    }

    protected boolean onExtraCallback(@NonNull CaptureRequest.Builder builder, float f) {
        Range<Integer>[] rangeArr = (Range[]) onExtraCallbackWithResult((CameraCharacteristics.Key<CameraCharacteristics.Key>) CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES, (CameraCharacteristics.Key) new Range[0]);
        onNavigationEvent(rangeArr);
        float f2 = this.onMessageChannelReady;
        if (f2 == 0.0f) {
            for (Range<Integer> range : onWarmupCompleted(rangeArr)) {
                if (range.contains((Range<Integer>) 30) || range.contains((Range<Integer>) 24)) {
                    builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
                    return true;
                }
            }
        } else {
            float fMin = Math.min(f2, this.IAuthTabCallback.onNavigationEvent());
            this.onMessageChannelReady = fMin;
            this.onMessageChannelReady = Math.max(fMin, this.IAuthTabCallback.onWarmupCompleted());
            for (Range<Integer> range2 : onWarmupCompleted(rangeArr)) {
                if (range2.contains((Range<Integer>) Integer.valueOf(Math.round(this.onMessageChannelReady)))) {
                    builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range2);
                    return true;
                }
            }
        }
        this.onMessageChannelReady = f;
        return false;
    }

    private void onNavigationEvent(@NonNull Range<Integer>[] rangeArr) {
        final boolean z = prefetch() && this.onMessageChannelReady != 0.0f;
        Arrays.sort(rangeArr, new Comparator<Range<Integer>>() { // from class: o.defaultOnMeasure.8
            @Override // java.util.Comparator
            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public int compare(Range<Integer> range, Range<Integer> range2) {
                if (z) {
                    return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) - (((Integer) range2.getUpper()).intValue() - ((Integer) range2.getLower()).intValue());
                }
                return (((Integer) range2.getUpper()).intValue() - ((Integer) range2.getLower()).intValue()) - (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue());
            }
        });
    }

    protected List<Range<Integer>> onWarmupCompleted(@NonNull Range<Integer>[] rangeArr) {
        ArrayList arrayList = new ArrayList();
        int iRound = Math.round(this.IAuthTabCallback.onWarmupCompleted());
        int iRound2 = Math.round(this.IAuthTabCallback.onNavigationEvent());
        for (Range<Integer> range : rangeArr) {
            if ((range.contains((Range<Integer>) Integer.valueOf(iRound)) || range.contains((Range<Integer>) Integer.valueOf(iRound2))) && markItemDecorInsetsDirty.onNavigationEvent(range)) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    public void onNavigationEvent(@NonNull consumeFlingInHorizontalStretch consumeflinginhorizontalstretch) {
        if (consumeflinginhorizontalstretch != this.writeTypedObject) {
            this.writeTypedObject = consumeflinginhorizontalstretch;
            onSessionEnded().IAuthTabCallback("picture format (" + consumeflinginhorizontalstretch + ")", getItemDecorationCount.ENGINE, new Runnable() { // from class: o.defaultOnMeasure.11
                @Override // java.lang.Runnable
                public void run() {
                    defaultOnMeasure.this.IPostMessageService();
                }
            });
        }
    }

    @Override // o.dispatchChildAttached
    protected hasFixedSize onExtraCallbackWithResult(int i) {
        return new getScrollState(i);
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(ImageReader imageReader) {
        Image imageAcquireLatestImage;
        dispatchChildDetached.extraCommand.onExtraCallback(new Object[]{"onImageAvailable:", "trying to acquire Image."});
        try {
            imageAcquireLatestImage = imageReader.acquireLatestImage();
        } catch (Exception unused) {
            imageAcquireLatestImage = null;
        }
        if (imageAcquireLatestImage == null) {
            dispatchChildDetached.extraCommand.onWarmupCompleted(new Object[]{"onImageAvailable:", "failed to acquire Image!"});
            return;
        }
        if (IEngagementSignalsCallbackDefault() == getItemDecorationCount.PREVIEW && !onVerticalScrollEvent()) {
            getOnFlingListener getonflinglistenerOnExtraCallbackWithResult = onNavigationEvent().onExtraCallbackWithResult(imageAcquireLatestImage, System.currentTimeMillis());
            if (getonflinglistenerOnExtraCallbackWithResult != null) {
                dispatchChildDetached.extraCommand.onExtraCallback(new Object[]{"onImageAvailable:", "Image acquired, dispatching."});
                ICustomTabsService_Parcel().IAuthTabCallback(getonflinglistenerOnExtraCallbackWithResult);
                return;
            } else {
                dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"onImageAvailable:", "Image acquired, but no free frames. DROPPING."});
                return;
            }
        }
        dispatchChildDetached.extraCommand.onExtraCallbackWithResult(new Object[]{"onImageAvailable:", "Image acquired in wrong state. Closing it now."});
        imageAcquireLatestImage.close();
    }

    public void onExtraCallbackWithResult(final boolean z) {
        onSessionEnded().onExtraCallbackWithResult("has frame processors (" + z + ")", true, new Runnable() { // from class: o.defaultOnMeasure.15
            @Override // java.lang.Runnable
            public void run() {
                getItemDecorationCount getitemdecorationcountIEngagementSignalsCallbackDefault = defaultOnMeasure.this.IEngagementSignalsCallbackDefault();
                getItemDecorationCount getitemdecorationcount = getItemDecorationCount.BIND;
                if (getitemdecorationcountIEngagementSignalsCallbackDefault.isAtLeast(getitemdecorationcount) && defaultOnMeasure.this.onVerticalScrollEvent()) {
                    defaultOnMeasure.this.onExtraCallbackWithResult(z);
                    return;
                }
                defaultOnMeasure defaultonmeasure = defaultOnMeasure.this;
                defaultonmeasure.access000 = z;
                if (defaultonmeasure.IEngagementSignalsCallbackDefault().isAtLeast(getitemdecorationcount)) {
                    defaultOnMeasure.this.IEngagementSignalsCallback_Parcel();
                }
            }
        });
    }

    public void onExtraCallback(final int i) {
        if (this.onTransact == 0) {
            this.onTransact = 35;
        }
        onSessionEnded().onExtraCallbackWithResult("frame processing format (" + i + ")", true, new Runnable() { // from class: o.defaultOnMeasure.13
            @Override // java.lang.Runnable
            public void run() {
                getItemDecorationCount getitemdecorationcountIEngagementSignalsCallbackDefault = defaultOnMeasure.this.IEngagementSignalsCallbackDefault();
                getItemDecorationCount getitemdecorationcount = getItemDecorationCount.BIND;
                if (getitemdecorationcountIEngagementSignalsCallbackDefault.isAtLeast(getitemdecorationcount) && defaultOnMeasure.this.onVerticalScrollEvent()) {
                    defaultOnMeasure.this.onExtraCallback(i);
                    return;
                }
                defaultOnMeasure defaultonmeasure = defaultOnMeasure.this;
                int i2 = i;
                if (i2 <= 0) {
                    i2 = 35;
                }
                defaultonmeasure.onTransact = i2;
                if (defaultonmeasure.IEngagementSignalsCallbackDefault().isAtLeast(getitemdecorationcount)) {
                    defaultOnMeasure.this.IEngagementSignalsCallback_Parcel();
                }
            }
        });
    }

    public void onNavigationEvent(@Nullable hasNestedScrollingParent hasnestedscrollingparent, @NonNull offsetChildrenVertical offsetchildrenvertical, @NonNull PointF pointF) {
        onSessionEnded().IAuthTabCallback("autofocus (" + hasnestedscrollingparent + ")", getItemDecorationCount.PREVIEW, new 12(this, hasnestedscrollingparent, pointF, offsetchildrenvertical));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public getAccessibilityClassName onExtraCallback(@Nullable offsetChildrenVertical offsetchildrenvertical) {
        getAccessibilityClassName getaccessibilityclassname = this.prefetchWithMultipleUrls;
        if (getaccessibilityclassname != null) {
            getaccessibilityclassname.onWarmupCompleted(this);
        }
        onExtraCallbackWithResult(this.ICustomTabsServiceDefault);
        getAccessibilityClassName getaccessibilityclassname2 = new getAccessibilityClassName(this, offsetchildrenvertical, offsetchildrenvertical == null);
        this.prefetchWithMultipleUrls = getaccessibilityclassname2;
        return getaccessibilityclassname2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IPostMessageServiceStubProxy() {
        dispatchNestedScroll.onNavigationEvent(new ensureRightGlow[]{new ensureRightGlow() { // from class: o.defaultOnMeasure.18
            public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
                super.IAuthTabCallback(dispatchonscrollstatechanged);
                defaultOnMeasure.this.onNavigationEvent(dispatchonscrollstatechanged.onExtraCallbackWithResult(this));
                CaptureRequest.Builder builderOnExtraCallbackWithResult = dispatchonscrollstatechanged.onExtraCallbackWithResult(this);
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_LOCK;
                Boolean bool = Boolean.FALSE;
                builderOnExtraCallbackWithResult.set(key, bool);
                dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AWB_LOCK, bool);
                dispatchonscrollstatechanged.onNavigationEvent(this);
                onNavigationEvent(Integer.MAX_VALUE);
            }
        }, new getChildAdapterPosition()}).onExtraCallbackWithResult(this);
    }

    @Override // o.dispatchOnScrollStateChanged
    public void IAuthTabCallback(@NonNull dispatchNestedFling dispatchnestedfling) {
        if (this.onWarmupCompleted.contains(dispatchnestedfling)) {
            return;
        }
        this.onWarmupCompleted.add(dispatchnestedfling);
    }

    @Override // o.dispatchOnScrollStateChanged
    public void IAuthTabCallbackStub(@NonNull dispatchNestedFling dispatchnestedfling) {
        this.onWarmupCompleted.remove(dispatchnestedfling);
    }

    @Override // o.dispatchOnScrollStateChanged
    public CameraCharacteristics onExtraCallback(@NonNull dispatchNestedFling dispatchnestedfling) {
        return this.mayLaunchUrl;
    }

    @Override // o.dispatchOnScrollStateChanged
    public TotalCaptureResult onWarmupCompleted(@NonNull dispatchNestedFling dispatchnestedfling) {
        return this.prefetch;
    }

    @Override // o.dispatchOnScrollStateChanged
    public CaptureRequest.Builder onExtraCallbackWithResult(@NonNull dispatchNestedFling dispatchnestedfling) {
        return this.ICustomTabsServiceDefault;
    }

    @Override // o.dispatchOnScrollStateChanged
    public void onNavigationEvent(@NonNull dispatchNestedFling dispatchnestedfling) throws stopScrollersInternal, CameraAccessException {
        onExtraCallback();
    }

    @Override // o.dispatchOnScrollStateChanged
    public void IAuthTabCallback(@NonNull dispatchNestedFling dispatchnestedfling, @NonNull CaptureRequest.Builder builder) throws CameraAccessException {
        if (IEngagementSignalsCallbackDefault() != getItemDecorationCount.PREVIEW || onVerticalScrollEvent()) {
            return;
        }
        this.ICustomTabsServiceStub.capture(builder.build(), this.warmup, null);
    }
}
