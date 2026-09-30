package org.opencv.android;

import android.graphics.Color;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.util.Size;
import android.view.KeyEvent;
import android.view.Surface;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class Camera2Renderer extends CameraGLRendererBase {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private static char[] onExtraCallbackWithResult = {47895, 17842, 18009, 16593, 16794, 16978, 19688, 19852, 20009, 18652, 18849, 18992, 21722, 21866, 22134, 20624, 20772, 21040, 23727, 23922, 24077, 22709, 22855, 23041, 25765, 25883, 26567, 24721, 24915, 25594, 27798, 27961, 28669, 26780, 26932, 24785, 40521, 40373, 39685, 39489, 39356, 38681, 38506, 38356, 37664, 37432, 37278, 36714, 36534, 36313, 35636, 35483, 35323, 34633, 34447, 34283, 33549, 33409, 33255, 48981, 48820, 48152, 47991, 47795, 47130, 46946};
    private static long onNavigationEvent = 4058304705729532787L;
    protected final String LOGTAG;
    private Handler mBackgroundHandler;
    private HandlerThread mBackgroundThread;
    private CameraDevice mCameraDevice;
    private String mCameraID;
    private Semaphore mCameraOpenCloseLock;
    private CameraCaptureSession mCaptureSession;
    private CaptureRequest.Builder mPreviewRequestBuilder;
    private Size mPreviewSize;
    private final CameraDevice.StateCallback mStateCallback;

    static /* synthetic */ CameraDevice access$002(Camera2Renderer camera2Renderer, CameraDevice cameraDevice) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 85;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        camera2Renderer.mCameraDevice = cameraDevice;
        int i5 = i2 + 75;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return cameraDevice;
    }

    static /* synthetic */ Semaphore access$100(Camera2Renderer camera2Renderer) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Semaphore semaphore = camera2Renderer.mCameraOpenCloseLock;
        if (i4 == 0) {
            int i5 = 95 / 0;
        }
        int i6 = i3 + 31;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 7 / 0;
        }
        return semaphore;
    }

    static /* synthetic */ void access$200(Camera2Renderer camera2Renderer) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        camera2Renderer.createCameraPreviewSession();
        int i4 = onExtraCallback + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ CameraCaptureSession access$300(Camera2Renderer camera2Renderer) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        CameraCaptureSession cameraCaptureSession = camera2Renderer.mCaptureSession;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 29;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return cameraCaptureSession;
        }
        throw null;
    }

    static /* synthetic */ CameraCaptureSession access$302(Camera2Renderer camera2Renderer, CameraCaptureSession cameraCaptureSession) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 63;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        camera2Renderer.mCaptureSession = cameraCaptureSession;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 97;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return cameraCaptureSession;
        }
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ CaptureRequest.Builder access$400(Camera2Renderer camera2Renderer) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        CaptureRequest.Builder builder = camera2Renderer.mPreviewRequestBuilder;
        int i5 = i3 + 17;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return builder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Handler access$500(Camera2Renderer camera2Renderer) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 73;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Handler handler = camera2Renderer.mBackgroundHandler;
        int i5 = i2 + 75;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return handler;
        }
        throw null;
    }

    Camera2Renderer(CameraGLSurfaceView cameraGLSurfaceView) {
        super(cameraGLSurfaceView);
        this.LOGTAG = "Camera2Renderer";
        this.mPreviewSize = new Size(-1, -1);
        this.mCameraOpenCloseLock = new Semaphore(1);
        this.mStateCallback = new CameraDevice.StateCallback() { // from class: org.opencv.android.Camera2Renderer.1
            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onOpened(CameraDevice cameraDevice) {
                Camera2Renderer.access$002(Camera2Renderer.this, cameraDevice);
                Camera2Renderer.access$100(Camera2Renderer.this).release();
                Camera2Renderer.access$200(Camera2Renderer.this);
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onDisconnected(CameraDevice cameraDevice) {
                cameraDevice.close();
                Camera2Renderer.access$002(Camera2Renderer.this, null);
                Camera2Renderer.access$100(Camera2Renderer.this).release();
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onError(CameraDevice cameraDevice, int i) {
                cameraDevice.close();
                Camera2Renderer.access$002(Camera2Renderer.this, null);
                Camera2Renderer.access$100(Camera2Renderer.this).release();
            }
        };
    }

    @Override // org.opencv.android.CameraGLRendererBase
    protected void doStart() throws InterruptedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        startBackgroundThread();
        super.doStart();
        int i4 = onExtraCallback + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // org.opencv.android.CameraGLRendererBase
    protected void doStop() throws InterruptedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.doStop();
        stopBackgroundThread();
        int i4 = onExtraCallback + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    boolean cacPreviewSize(int i, int i2) throws IllegalArgumentException {
        int i3 = 2 % 2;
        if (this.mCameraID == null) {
            return false;
        }
        try {
            try {
                float f = i / i2;
                int i4 = 0;
                int i5 = 0;
                for (Size size : ((StreamConfigurationMap) ((CameraManager) this.mView.getContext().getSystemService("camera")).getCameraCharacteristics(this.mCameraID).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class)) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    if (i >= width && i2 >= height && i4 <= width && i5 <= height) {
                        int i6 = onExtraCallback + 113;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        if (Math.abs(f - (width / height)) < 0.2d) {
                            i5 = height;
                            i4 = width;
                        }
                    }
                }
                if (i4 != 0) {
                    int i8 = IAuthTabCallback + 55;
                    onExtraCallback = i8 % 128;
                    Object obj = null;
                    if (i8 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (i5 != 0) {
                        if (this.mPreviewSize.getWidth() == i4) {
                            int i9 = IAuthTabCallback + 113;
                            onExtraCallback = i9 % 128;
                            if (i9 % 2 != 0) {
                                this.mPreviewSize.getHeight();
                                obj.hashCode();
                                throw null;
                            }
                            if (this.mPreviewSize.getHeight() == i5) {
                            }
                        }
                        this.mPreviewSize = new Size(i4, i5);
                        return true;
                    }
                }
                return false;
            } catch (SecurityException unused) {
                KeyEvent.normalizeMetaState(0);
                KeyEvent.normalizeMetaState(0);
                Process.getThreadPriority(0);
                return false;
            }
        } catch (CameraAccessException | IllegalArgumentException unused2) {
            return false;
        }
    }

    @Override // org.opencv.android.CameraGLRendererBase
    protected void openCamera(int i) throws CameraAccessException {
        int i2 = 2 % 2;
        CameraManager cameraManager = (CameraManager) this.mView.getContext().getSystemService("camera");
        try {
            try {
                String[] cameraIdList = cameraManager.getCameraIdList();
                if (cameraIdList.length == 0) {
                    return;
                }
                if (i != -1) {
                    int i3 = IAuthTabCallback + 41;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    for (String str : cameraIdList) {
                        int i5 = IAuthTabCallback + 49;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                        if ((i == 99 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) || (i == 98 && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                            this.mCameraID = str;
                            break;
                        }
                    }
                } else {
                    int i7 = onExtraCallback + 55;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    this.mCameraID = cameraIdList[0];
                }
                if (this.mCameraID != null) {
                    if (!this.mCameraOpenCloseLock.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                        throw new RuntimeException("Time out waiting to lock camera opening.");
                    }
                    cameraManager.openCamera(this.mCameraID, this.mStateCallback, this.mBackgroundHandler);
                }
            } catch (CameraAccessException | IllegalArgumentException unused) {
            }
        } catch (InterruptedException unused2) {
        } catch (SecurityException unused3) {
            Process.getElapsedCpuTime();
            CdmaCellLocation.convertQuartSecToDecDegrees(0);
            Color.green(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[Catch: all -> 0x004c, InterruptedException -> 0x004e, PHI: r1
      0x0026: PHI (r1v8 android.hardware.camera2.CameraCaptureSession) = (r1v7 android.hardware.camera2.CameraCaptureSession), (r1v14 android.hardware.camera2.CameraCaptureSession) binds: [B:9:0x0024, B:6:0x001a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {InterruptedException -> 0x004e, blocks: (B:4:0x000f, B:12:0x0034, B:15:0x0041, B:10:0x0026, B:8:0x001d), top: B:25:0x000d, outer: #1 }] */
    @Override // org.opencv.android.CameraGLRendererBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void closeCamera() {
        CameraCaptureSession cameraCaptureSession;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallback = i2 % 128;
        try {
            try {
                if (i2 % 2 != 0) {
                    this.mCameraOpenCloseLock.acquire();
                    cameraCaptureSession = this.mCaptureSession;
                    int i3 = 17 / 0;
                    if (cameraCaptureSession != null) {
                        cameraCaptureSession.close();
                        this.mCaptureSession = null;
                        int i4 = IAuthTabCallback + 93;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                    }
                } else {
                    this.mCameraOpenCloseLock.acquire();
                    cameraCaptureSession = this.mCaptureSession;
                    if (cameraCaptureSession != null) {
                    }
                }
                CameraDevice cameraDevice = this.mCameraDevice;
                if (cameraDevice != null) {
                    int i6 = IAuthTabCallback + 65;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    cameraDevice.close();
                    this.mCameraDevice = null;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException("Interrupted while trying to lock camera closing.", e);
            }
        } finally {
            this.mCameraOpenCloseLock.release();
        }
    }

    private void createCameraPreviewSession() {
        int i = 2 % 2;
        int width = this.mPreviewSize.getWidth();
        int height = this.mPreviewSize.getHeight();
        if (width >= 0 && height >= 0) {
            int i2 = IAuthTabCallback + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.mCameraOpenCloseLock.acquire();
                if (this.mCameraDevice == null) {
                    this.mCameraOpenCloseLock.release();
                    int i4 = IAuthTabCallback + 111;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                if (this.mCaptureSession != null) {
                    this.mCameraOpenCloseLock.release();
                    return;
                }
                SurfaceTexture surfaceTexture = this.mSTexture;
                if (surfaceTexture == null) {
                    this.mCameraOpenCloseLock.release();
                    return;
                }
                surfaceTexture.setDefaultBufferSize(width, height);
                Surface surface = new Surface(this.mSTexture);
                CaptureRequest.Builder builderCreateCaptureRequest = this.mCameraDevice.createCaptureRequest(1);
                this.mPreviewRequestBuilder = builderCreateCaptureRequest;
                builderCreateCaptureRequest.addTarget(surface);
                this.mCameraDevice.createCaptureSession(Arrays.asList(surface), new CameraCaptureSession.StateCallback() { // from class: org.opencv.android.Camera2Renderer.2
                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                    public void onConfigured(CameraCaptureSession cameraCaptureSession) throws CameraAccessException {
                        Camera2Renderer.access$302(Camera2Renderer.this, cameraCaptureSession);
                        try {
                            Camera2Renderer.access$400(Camera2Renderer.this).set(CaptureRequest.CONTROL_AF_MODE, 4);
                            Camera2Renderer.access$400(Camera2Renderer.this).set(CaptureRequest.CONTROL_AE_MODE, 2);
                            Camera2Renderer.access$300(Camera2Renderer.this).setRepeatingRequest(Camera2Renderer.access$400(Camera2Renderer.this).build(), null, Camera2Renderer.access$500(Camera2Renderer.this));
                        } catch (CameraAccessException unused) {
                        }
                        Camera2Renderer.access$100(Camera2Renderer.this).release();
                    }

                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                        Camera2Renderer.access$100(Camera2Renderer.this).release();
                    }
                }, this.mBackgroundHandler);
                int i5 = onExtraCallback + 111;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return;
            } catch (CameraAccessException unused) {
            } catch (InterruptedException e) {
                throw new RuntimeException("Interrupted while createCameraPreviewSession", e);
            }
        }
        int i7 = onExtraCallback + 17;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    private void startBackgroundThread() throws InterruptedException {
        int i = 2 % 2;
        stopBackgroundThread();
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.mBackgroundThread = handlerThread;
        handlerThread.start();
        this.mBackgroundHandler = new Handler(this.mBackgroundThread.getLooper());
        int i2 = onExtraCallback + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private void stopBackgroundThread() throws InterruptedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            HandlerThread handlerThread = this.mBackgroundThread;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                try {
                    this.mBackgroundThread.join();
                    this.mBackgroundThread = null;
                    this.mBackgroundHandler = null;
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            }
            int i4 = i3 + 33;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        throw null;
    }

    @Override // org.opencv.android.CameraGLRendererBase
    protected void setCameraPreviewSize(int i, int i2) throws InterruptedException, IllegalArgumentException {
        int i3 = 2 % 2;
        int i4 = this.mMaxCameraWidth;
        if (i4 > 0) {
            int i5 = IAuthTabCallback + 53;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (i4 < i) {
                i = i4;
            }
        }
        int i6 = this.mMaxCameraHeight;
        if (i6 > 0) {
            int i7 = onExtraCallback + 35;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            if (i6 < i2) {
                i2 = i6;
            }
        }
        try {
            this.mCameraOpenCloseLock.acquire();
            boolean zCacPreviewSize = cacPreviewSize(i, i2);
            this.mCameraWidth = this.mPreviewSize.getWidth();
            this.mCameraHeight = this.mPreviewSize.getHeight();
            if (!zCacPreviewSize) {
                this.mCameraOpenCloseLock.release();
                return;
            }
            CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
            if (cameraCaptureSession != null) {
                int i9 = IAuthTabCallback + 63;
                onExtraCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    cameraCaptureSession.close();
                    this.mCaptureSession = null;
                    throw null;
                }
                cameraCaptureSession.close();
                this.mCaptureSession = null;
            }
            this.mCameraOpenCloseLock.release();
            createCameraPreviewSession();
        } catch (InterruptedException e) {
            this.mCameraOpenCloseLock.release();
            throw new RuntimeException("Interrupted while setCameraPreviewSize.", e);
        }
    }
}
