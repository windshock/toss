package o;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class deserializeSeverityReasonbugsnag_android_core_release {
    private String IAuthTabCallback;
    private CameraCaptureSession IAuthTabCallbackStub;
    private onExtraCallback IAuthTabCallbackStubProxy;
    private byte[] IAuthTabCallback_Parcel;
    private Surface ICustomTabsCallback;
    private ImageReader access100;
    private final Context asBinder;
    private int extraCallback;
    private SurfaceTexture extraCallbackWithResult;
    private volatile Runnable onActivityResized;
    private HandlerThread onExtraCallback;
    private final CameraManager onExtraCallbackWithResult;
    private int onMessageChannelReady;
    private int onMinimized;
    private volatile Handler onNavigationEvent;
    private onWarmupCompleted onTransact;
    private CameraDevice onWarmupCompleted;
    private String readTypedObject;
    private int writeTypedObject;
    private volatile boolean access000 = false;
    private volatile boolean IAuthTabCallbackDefault = false;
    private final CameraDevice.StateCallback onActivityLayout = new CameraDevice.StateCallback() { // from class: o.deserializeSeverityReasonbugsnag_android_core_release.2
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) throws CameraAccessException {
            deserializeSeverityReasonbugsnag_android_core_release.this.onWarmupCompleted = cameraDevice;
            deserializeSeverityReasonbugsnag_android_core_release.this.IAuthTabCallbackStub();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            cameraDevice.close();
            deserializeSeverityReasonbugsnag_android_core_release.this.onWarmupCompleted = null;
            deserializeSeverityReasonbugsnag_android_core_release.this.access000 = false;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            cameraDevice.close();
            deserializeSeverityReasonbugsnag_android_core_release.this.onWarmupCompleted = null;
            deserializeSeverityReasonbugsnag_android_core_release.this.access000 = false;
        }
    };
    private final CameraCaptureSession.CaptureCallback asInterface = new CameraCaptureSession.CaptureCallback() { // from class: o.deserializeSeverityReasonbugsnag_android_core_release.5
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    };
    private final ImageReader.OnImageAvailableListener getInterfaceDescriptor = new ImageReader.OnImageAvailableListener() { // from class: o.deserializeSeverityReasonbugsnag_android_core_release.10
        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image image = null;
            try {
                Image imageAcquireLatestImage = imageReader.acquireLatestImage();
                if (imageAcquireLatestImage == null) {
                    if (imageAcquireLatestImage != null) {
                        imageAcquireLatestImage.close();
                        return;
                    }
                    return;
                }
                onWarmupCompleted onwarmupcompleted = deserializeSeverityReasonbugsnag_android_core_release.this.onTransact;
                if (onwarmupcompleted != null && deserializeSeverityReasonbugsnag_android_core_release.this.IAuthTabCallback_Parcel != null && configureEventSynthesizer.onNavigationEvent(imageAcquireLatestImage, deserializeSeverityReasonbugsnag_android_core_release.this.IAuthTabCallback_Parcel)) {
                    if (!deserializeSeverityReasonbugsnag_android_core_release.this.IAuthTabCallbackDefault) {
                        deserializeSeverityReasonbugsnag_android_core_release.this.IAuthTabCallbackDefault = true;
                        int unused = deserializeSeverityReasonbugsnag_android_core_release.this.writeTypedObject;
                        int unused2 = deserializeSeverityReasonbugsnag_android_core_release.this.extraCallback;
                    }
                    onwarmupcompleted.onNavigationEvent(deserializeSeverityReasonbugsnag_android_core_release.this.IAuthTabCallback_Parcel, deserializeSeverityReasonbugsnag_android_core_release.this.writeTypedObject, deserializeSeverityReasonbugsnag_android_core_release.this.extraCallback);
                }
                imageAcquireLatestImage.close();
            } catch (Exception unused3) {
                if (0 != 0) {
                    image.close();
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    image.close();
                }
                throw th;
            }
        }
    };

    public interface onExtraCallback {
        void onExtraCallbackWithResult(String str);
    }

    public interface onWarmupCompleted {
        void onNavigationEvent(byte[] bArr, int i, int i2);
    }

    public void onNavigationEvent(onExtraCallback onextracallback) {
        this.IAuthTabCallbackStubProxy = onextracallback;
    }

    public deserializeSeverityReasonbugsnag_android_core_release(Context context) {
        this.asBinder = context;
        this.onExtraCallbackWithResult = (CameraManager) context.getSystemService("camera");
    }

    public boolean onExtraCallback() {
        return (!configureEventSynthesizer.onExtraCallback() || this.onExtraCallbackWithResult == null || configureEventSynthesizer.onExtraCallback(this.asBinder) == null) ? false : true;
    }

    public boolean onWarmupCompleted(Surface surface, SurfaceTexture surfaceTexture, int i, int i2, onWarmupCompleted onwarmupcompleted) {
        synchronized (this) {
            if (this.access000) {
                return true;
            }
            if (surface == null || surfaceTexture == null) {
                return false;
            }
            this.ICustomTabsCallback = surface;
            this.extraCallbackWithResult = surfaceTexture;
            this.onMessageChannelReady = i;
            this.onMinimized = i2;
            this.onTransact = onwarmupcompleted;
            this.IAuthTabCallbackDefault = false;
            String strOnExtraCallback = configureEventSynthesizer.onExtraCallback(this.asBinder);
            this.IAuthTabCallback = strOnExtraCallback;
            if (strOnExtraCallback == null) {
                return false;
            }
            String strOnNavigationEvent = configureEventSynthesizer.onNavigationEvent(this.onExtraCallbackWithResult, strOnExtraCallback);
            this.readTypedObject = strOnNavigationEvent;
            if (strOnNavigationEvent != null && onWarmupCompleted(strOnNavigationEvent)) {
                this.IAuthTabCallback = this.readTypedObject;
                this.readTypedObject = null;
            }
            String str = this.readTypedObject;
            if (str == null) {
                str = this.IAuthTabCallback;
            }
            Size sizeOnExtraCallback = onExtraCallback(str, i, i2);
            if (sizeOnExtraCallback == null) {
                this.writeTypedObject = i;
                this.extraCallback = i2;
            } else {
                this.writeTypedObject = sizeOnExtraCallback.getWidth();
                this.extraCallback = sizeOnExtraCallback.getHeight();
            }
            this.IAuthTabCallback_Parcel = new byte[((this.writeTypedObject * this.extraCallback) * 3) / 2];
            onTransact();
            try {
                try {
                    this.extraCallbackWithResult.setDefaultBufferSize(this.writeTypedObject, this.extraCallback);
                    ImageReader imageReaderNewInstance = ImageReader.newInstance(this.writeTypedObject, this.extraCallback, 35, 2);
                    this.access100 = imageReaderNewInstance;
                    imageReaderNewInstance.setOnImageAvailableListener(this.getInterfaceDescriptor, this.onNavigationEvent);
                    this.onExtraCallbackWithResult.openCamera(this.IAuthTabCallback, this.onActivityLayout, this.onNavigationEvent);
                    this.access000 = true;
                    return true;
                } catch (SecurityException unused) {
                    onWarmupCompleted();
                    return false;
                }
            } catch (CameraAccessException unused2) {
                onWarmupCompleted();
                return false;
            }
        }
    }

    private boolean onWarmupCompleted(String str) throws CameraAccessException {
        try {
            for (String str2 : this.onExtraCallbackWithResult.getCameraIdList()) {
                if (str2.equals(str)) {
                    return true;
                }
            }
        } catch (CameraAccessException unused) {
        }
        return false;
    }

    private Size onExtraCallback(String str, int i, int i2) {
        char c;
        Size[] sizeArr;
        HashSet hashSet;
        Size[] sizeArr2;
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.onExtraCallbackWithResult.getCameraCharacteristics(str).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap == null) {
                return null;
            }
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(35);
            Size[] outputSizes2 = streamConfigurationMap.getOutputSizes(SurfaceHolder.class);
            if (outputSizes != null && outputSizes.length != 0) {
                if (outputSizes2 == null || outputSizes2.length == 0) {
                    outputSizes2 = outputSizes;
                }
                HashSet hashSet2 = new HashSet();
                int length = outputSizes.length;
                int i3 = 0;
                while (true) {
                    c = ' ';
                    if (i3 >= length) {
                        break;
                    }
                    Size size = outputSizes[i3];
                    hashSet2.add(Long.valueOf((4294967295L & size.getHeight()) | (size.getWidth() << 32)));
                    i3++;
                }
                int iMax = Math.max(i, i2);
                int iMin = Math.min(i, i2);
                double d = iMax / iMin;
                long j = iMax * iMin;
                try {
                    int length2 = outputSizes2.length;
                    Size size2 = null;
                    long j2 = Long.MAX_VALUE;
                    long j3 = Long.MAX_VALUE;
                    int i4 = 0;
                    Size size3 = null;
                    while (i4 < length2) {
                        Size size4 = outputSizes2[i4];
                        int width = size4.getWidth();
                        int height = size4.getHeight();
                        Size[] sizeArr3 = outputSizes2;
                        long j4 = width;
                        int i5 = length2;
                        int i6 = i4;
                        long j5 = height;
                        if (hashSet2.contains(Long.valueOf((j4 << c) | (j5 & 4294967295L)))) {
                            sizeArr = outputSizes;
                            hashSet = hashSet2;
                            double d2 = width;
                            sizeArr2 = sizeArr3;
                            long jAbs = Math.abs((j4 * j5) - j);
                            if (Math.abs((d2 / height) - d) < 0.01d && jAbs < j3) {
                                j3 = jAbs;
                                size3 = size4;
                            }
                            if (jAbs < j2) {
                                j2 = jAbs;
                                size2 = size4;
                            }
                        } else {
                            sizeArr = outputSizes;
                            hashSet = hashSet2;
                            sizeArr2 = sizeArr3;
                        }
                        i4 = i6 + 1;
                        length2 = i5;
                        outputSizes2 = sizeArr2;
                        outputSizes = sizeArr;
                        hashSet2 = hashSet;
                        c = ' ';
                    }
                    Size[] sizeArr4 = outputSizes2;
                    Size[] sizeArr5 = outputSizes;
                    if (size3 == null) {
                        size3 = size2;
                    }
                    int length3 = sizeArr5.length;
                    int length4 = sizeArr4.length;
                    if (size3 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(size3.getWidth());
                        sb.append("x");
                        sb.append(size3.getHeight());
                    }
                    return size3;
                } catch (CameraAccessException unused) {
                    return null;
                }
            }
            return null;
        } catch (CameraAccessException unused2) {
            return null;
        }
    }

    public void onWarmupCompleted() {
        synchronized (this) {
            this.access000 = false;
            asBinder();
            try {
                CameraCaptureSession cameraCaptureSession = this.IAuthTabCallbackStub;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.close();
                    this.IAuthTabCallbackStub = null;
                }
                CameraDevice cameraDevice = this.onWarmupCompleted;
                if (cameraDevice != null) {
                    cameraDevice.close();
                    this.onWarmupCompleted = null;
                }
                ImageReader imageReader = this.access100;
                if (imageReader != null) {
                    imageReader.close();
                    this.access100 = null;
                }
            } catch (Exception unused) {
            }
            asInterface();
            this.onTransact = null;
            this.ICustomTabsCallback = null;
            this.extraCallbackWithResult = null;
        }
    }

    public boolean onExtraCallbackWithResult() {
        return this.access000;
    }

    public int IAuthTabCallback() {
        return this.writeTypedObject;
    }

    public int onNavigationEvent() {
        return this.extraCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IAuthTabCallbackDefault() {
        asBinder();
        Handler handler = this.onNavigationEvent;
        if (handler == null) {
            return;
        }
        this.IAuthTabCallbackDefault = false;
        Runnable runnable = new Runnable() { // from class: o.deserializeSeverityReasonbugsnag_android_core_release.3
            @Override // java.lang.Runnable
            public void run() {
                if (deserializeSeverityReasonbugsnag_android_core_release.this.access000 && !deserializeSeverityReasonbugsnag_android_core_release.this.IAuthTabCallbackDefault) {
                    deserializeSeverityReasonbugsnag_android_core_release.this.onExtraCallbackWithResult("no frames in 1000ms (green/blank preview)");
                }
            }
        };
        this.onActivityResized = runnable;
        handler.postDelayed(runnable, 1000L);
    }

    private void asBinder() {
        Runnable runnable = this.onActivityResized;
        this.onActivityResized = null;
        Handler handler = this.onNavigationEvent;
        if (runnable == null || handler == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallbackWithResult(String str) {
        onExtraCallback onextracallback = this.IAuthTabCallbackStubProxy;
        if (onextracallback != null) {
            onextracallback.onExtraCallbackWithResult(str);
        }
    }

    private void onTransact() {
        if (this.onExtraCallback != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("Camera2Background");
        this.onExtraCallback = handlerThread;
        handlerThread.start();
        this.onNavigationEvent = new Handler(this.onExtraCallback.getLooper());
    }

    private void asInterface() throws InterruptedException {
        HandlerThread handlerThread = this.onExtraCallback;
        if (handlerThread == null) {
            return;
        }
        handlerThread.quitSafely();
        try {
            this.onExtraCallback.join(500L);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        this.onExtraCallback = null;
        this.onNavigationEvent = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IAuthTabCallbackStub() throws CameraAccessException {
        Surface surface;
        ImageReader imageReader;
        if (this.onWarmupCompleted == null || (surface = this.ICustomTabsCallback) == null || (imageReader = this.access100) == null) {
            return;
        }
        try {
            Surface surface2 = imageReader.getSurface();
            List<Surface> listAsList = Arrays.asList(surface, surface2);
            final CaptureRequest.Builder builderCreateCaptureRequest = this.onWarmupCompleted.createCaptureRequest(1);
            builderCreateCaptureRequest.addTarget(surface);
            builderCreateCaptureRequest.addTarget(surface2);
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
            CameraCaptureSession.StateCallback stateCallback = new CameraCaptureSession.StateCallback() { // from class: o.deserializeSeverityReasonbugsnag_android_core_release.4
                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onConfigured(CameraCaptureSession cameraCaptureSession) throws CameraAccessException {
                    if (!deserializeSeverityReasonbugsnag_android_core_release.this.access000 || deserializeSeverityReasonbugsnag_android_core_release.this.onWarmupCompleted == null) {
                        try {
                            cameraCaptureSession.close();
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    deserializeSeverityReasonbugsnag_android_core_release.this.IAuthTabCallbackStub = cameraCaptureSession;
                    Handler handler = deserializeSeverityReasonbugsnag_android_core_release.this.onNavigationEvent;
                    if (handler == null) {
                        try {
                            cameraCaptureSession.close();
                        } catch (Exception unused2) {
                        }
                    } else {
                        try {
                            cameraCaptureSession.setRepeatingRequest(builderCreateCaptureRequest.build(), deserializeSeverityReasonbugsnag_android_core_release.this.asInterface, handler);
                            deserializeSeverityReasonbugsnag_android_core_release.this.IAuthTabCallbackDefault();
                        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException unused3) {
                        }
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    deserializeSeverityReasonbugsnag_android_core_release.this.onExtraCallbackWithResult("session config failed");
                }
            };
            if (Build.VERSION.SDK_INT >= 28 && this.readTypedObject != null) {
                ArrayList arrayList = new ArrayList();
                OutputConfiguration outputConfiguration = new OutputConfiguration(surface);
                OutputConfiguration outputConfiguration2 = new OutputConfiguration(surface2);
                outputConfiguration2.setPhysicalCameraId(this.readTypedObject);
                arrayList.add(outputConfiguration);
                arrayList.add(outputConfiguration2);
                final Handler handler = this.onNavigationEvent;
                Executor executor = new Executor() { // from class: o.deserializeSeverityReasonbugsnag_android_core_release.1
                    @Override // java.util.concurrent.Executor
                    public void execute(Runnable runnable) {
                        if (runnable != null) {
                            Handler handler2 = deserializeSeverityReasonbugsnag_android_core_release.this.onNavigationEvent;
                            if (handler2 == null) {
                                handler2 = handler;
                            }
                            if (handler2 != null) {
                                handler2.post(runnable);
                            }
                        }
                    }
                };
                saveState.onExtraCallbackWithResult();
                this.onWarmupCompleted.createCaptureSession(ComponentActivityExternalSyntheticLambda7.dZ_(0, arrayList, executor, stateCallback));
                return;
            }
            this.onWarmupCompleted.createCaptureSession(listAsList, stateCallback, this.onNavigationEvent);
        } catch (CameraAccessException unused) {
        }
    }
}
