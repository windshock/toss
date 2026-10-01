package org.opencv.android;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import net.sf.scuba.smartcards.BuildConfig;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import org.opencv.android.CameraBridgeViewBase;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class JavaCameraView extends CameraBridgeViewBase implements Camera.PreviewCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static final int MAGIC_TEXTURE_ID = 10;
    private static final String TAG = "JavaCameraView";
    private static long onExtraCallback = -3836092328986531445L;
    private static int onNavigationEvent = 1;
    private byte[] mBuffer;
    protected Camera mCamera;
    protected JavaCameraFrame[] mCameraFrame;
    private boolean mCameraFrameReady;
    private int mChainIdx;
    private Mat[] mFrameChain;
    private int mPreviewFormat;
    private boolean mStopThread;
    private SurfaceTexture mSurfaceTexture;
    private Thread mThread;

    static /* synthetic */ int access$100(JavaCameraView javaCameraView) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = javaCameraView.mPreviewFormat;
        if (i3 == 0) {
            return i4;
        }
        throw null;
    }

    static /* synthetic */ boolean access$200(JavaCameraView javaCameraView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean z = javaCameraView.mCameraFrameReady;
        if (i3 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean access$202(JavaCameraView javaCameraView, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 13;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        javaCameraView.mCameraFrameReady = z;
        int i5 = i2 + 43;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean access$300(JavaCameraView javaCameraView) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 73;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = javaCameraView.mStopThread;
        int i5 = i2 + 65;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 20 / 0;
        }
        return z;
    }

    static /* synthetic */ int access$400(JavaCameraView javaCameraView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = javaCameraView.mChainIdx;
        int i6 = i3 + 39;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static /* synthetic */ int access$402(JavaCameraView javaCameraView, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 81;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        javaCameraView.mChainIdx = i;
        if (i4 != 0) {
            int i5 = 23 / 0;
        }
        return i;
    }

    static /* synthetic */ Mat[] access$500(JavaCameraView javaCameraView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 121;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Mat[] matArr = javaCameraView.mFrameChain;
        int i5 = i2 + 69;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return matArr;
    }

    public static class JavaCameraSizeAccessor implements CameraBridgeViewBase.ListItemAccessor {
        @Override // org.opencv.android.CameraBridgeViewBase.ListItemAccessor
        public int getWidth(Object obj) {
            return ((Camera.Size) obj).width;
        }

        @Override // org.opencv.android.CameraBridgeViewBase.ListItemAccessor
        public int getHeight(Object obj) {
            return ((Camera.Size) obj).height;
        }
    }

    public JavaCameraView(Context context, int i) {
        super(context, i);
        this.mChainIdx = 0;
        this.mPreviewFormat = 17;
        this.mCameraFrameReady = false;
    }

    public JavaCameraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChainIdx = 0;
        this.mPreviewFormat = 17;
        this.mCameraFrameReady = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087 A[Catch: all -> 0x022a, EDGE_INSN: B:113:0x0087->B:47:0x0087 BREAK  A[LOOP:2: B:14:0x001c->B:22:0x0037], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0002, B:7:0x000b, B:11:0x0016, B:14:0x001c, B:16:0x0022, B:17:0x0029, B:22:0x0037, B:20:0x0032, B:47:0x0087, B:51:0x008d, B:53:0x0097, B:55:0x00ab, B:57:0x00ce, B:59:0x00d8, B:61:0x00e0, B:63:0x00e8, B:65:0x00f2, B:67:0x00fc, B:69:0x0106, B:72:0x0111, B:74:0x011d, B:76:0x014a, B:77:0x014d, B:79:0x0153, B:81:0x015b, B:82:0x0160, B:84:0x0183, B:86:0x018b, B:88:0x019e, B:90:0x01a2, B:91:0x01a9, B:87:0x019c, B:73:0x0117, B:25:0x0040, B:26:0x0046, B:28:0x004c, B:31:0x0054, B:42:0x0075, B:43:0x007c, B:46:0x0084, B:33:0x0059, B:34:0x005f, B:36:0x0065, B:39:0x006e, B:10:0x0013), top: B:106:0x0002, inners: #0, #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014a A[Catch: Exception -> 0x0227, all -> 0x022a, TryCatch #2 {Exception -> 0x0227, blocks: (B:51:0x008d, B:53:0x0097, B:55:0x00ab, B:57:0x00ce, B:59:0x00d8, B:61:0x00e0, B:63:0x00e8, B:65:0x00f2, B:67:0x00fc, B:69:0x0106, B:72:0x0111, B:74:0x011d, B:76:0x014a, B:77:0x014d, B:79:0x0153, B:81:0x015b, B:82:0x0160, B:84:0x0183, B:86:0x018b, B:88:0x019e, B:90:0x01a2, B:91:0x01a9, B:87:0x019c, B:73:0x0117), top: B:104:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a2 A[Catch: Exception -> 0x0227, all -> 0x022a, TryCatch #2 {Exception -> 0x0227, blocks: (B:51:0x008d, B:53:0x0097, B:55:0x00ab, B:57:0x00ce, B:59:0x00d8, B:61:0x00e0, B:63:0x00e8, B:65:0x00f2, B:67:0x00fc, B:69:0x0106, B:72:0x0111, B:74:0x011d, B:76:0x014a, B:77:0x014d, B:79:0x0153, B:81:0x015b, B:82:0x0160, B:84:0x0183, B:86:0x018b, B:88:0x019e, B:90:0x01a2, B:91:0x01a9, B:87:0x019c, B:73:0x0117), top: B:104:0x008d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean initializeCamera(int i, int i2) {
        Camera camera;
        Camera.Parameters parameters;
        List<Camera.Size> supportedPreviewSizes;
        List<String> supportedFocusModes;
        FpsMeter fpsMeter;
        int i3;
        synchronized (this) {
            this.mCamera = null;
            int i4 = this.mCameraIndex;
            boolean z = true;
            if (i4 == -1) {
                try {
                    this.mCamera = Camera.open();
                } catch (Exception e) {
                    e.getLocalizedMessage();
                }
                if (this.mCamera == null) {
                    boolean z2 = false;
                    for (int i5 = 0; i5 < Camera.getNumberOfCameras(); i5++) {
                        Objects.toString(Integer.valueOf(i5));
                        try {
                            this.mCamera = Camera.open(i5);
                            z2 = true;
                        } catch (RuntimeException e2) {
                            e2.getLocalizedMessage();
                        }
                        if (z2) {
                            break;
                        }
                    }
                    camera = this.mCamera;
                    if (camera != null) {
                        return false;
                    }
                    try {
                        parameters = camera.getParameters();
                        supportedPreviewSizes = parameters.getSupportedPreviewSizes();
                    } catch (Exception unused) {
                    }
                    if (supportedPreviewSizes != null) {
                        Size sizeCalculateCameraFrameSize = calculateCameraFrameSize(supportedPreviewSizes, new JavaCameraSizeAccessor(), i, i2);
                        String str = Build.FINGERPRINT;
                        if (!str.startsWith("generic")) {
                            Object[] objArr = new Object[1];
                            a(new char[]{44233, 14807, 34525, 5085, 63687, 17874, 53964}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 38148, objArr);
                            if (!str.startsWith(((String) objArr[0]).intern())) {
                                String str2 = Build.MODEL;
                                if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
                                    parameters.setPreviewFormat(17);
                                }
                                this.mPreviewFormat = parameters.getPreviewFormat();
                                Objects.toString(Integer.valueOf((int) sizeCalculateCameraFrameSize.width));
                                Objects.toString(Integer.valueOf((int) sizeCalculateCameraFrameSize.height));
                                parameters.setPreviewSize((int) sizeCalculateCameraFrameSize.width, (int) sizeCalculateCameraFrameSize.height);
                                if (!Build.MODEL.equals("GT-I9100")) {
                                    parameters.setRecordingHint(true);
                                }
                                supportedFocusModes = parameters.getSupportedFocusModes();
                                if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
                                    parameters.setFocusMode("continuous-video");
                                }
                                this.mCamera.setParameters(parameters);
                                Camera.Parameters parameters2 = this.mCamera.getParameters();
                                this.mFrameWidth = parameters2.getPreviewSize().width;
                                this.mFrameHeight = parameters2.getPreviewSize().height;
                                if (getLayoutParams().width != -1 && getLayoutParams().height == -1) {
                                    this.mScale = Math.min(i2 / this.mFrameHeight, i / this.mFrameWidth);
                                } else {
                                    this.mScale = 0.0f;
                                }
                                fpsMeter = this.mFpsMeter;
                                if (fpsMeter != null) {
                                    fpsMeter.setResolution(this.mFrameWidth, this.mFrameHeight);
                                }
                                byte[] bArr = new byte[((this.mFrameWidth * this.mFrameHeight) * ImageFormat.getBitsPerPixel(parameters2.getPreviewFormat())) / 8];
                                this.mBuffer = bArr;
                                this.mCamera.addCallbackBuffer(bArr);
                                this.mCamera.setPreviewCallbackWithBuffer(this);
                                Mat[] matArr = new Mat[2];
                                this.mFrameChain = matArr;
                                int i6 = this.mFrameHeight;
                                int i7 = this.mFrameWidth;
                                int i8 = CvType.CV_8UC1;
                                matArr[0] = new Mat(i6 + (i6 / 2), i7, i8);
                                Mat[] matArr2 = this.mFrameChain;
                                int i9 = this.mFrameHeight;
                                matArr2[1] = new Mat(i9 + (i9 / 2), this.mFrameWidth, i8);
                                AllocateCache();
                                JavaCameraFrame[] javaCameraFrameArr = new JavaCameraFrame[2];
                                this.mCameraFrame = javaCameraFrameArr;
                                javaCameraFrameArr[0] = new JavaCameraFrame(this.mFrameChain[0], this.mFrameWidth, this.mFrameHeight);
                                this.mCameraFrame[1] = new JavaCameraFrame(this.mFrameChain[1], this.mFrameWidth, this.mFrameHeight);
                                SurfaceTexture surfaceTexture = new SurfaceTexture(10);
                                this.mSurfaceTexture = surfaceTexture;
                                this.mCamera.setPreviewTexture(surfaceTexture);
                                this.mCamera.startPreview();
                            }
                        }
                        parameters.setPreviewFormat(842094169);
                        this.mPreviewFormat = parameters.getPreviewFormat();
                        Objects.toString(Integer.valueOf((int) sizeCalculateCameraFrameSize.width));
                        Objects.toString(Integer.valueOf((int) sizeCalculateCameraFrameSize.height));
                        parameters.setPreviewSize((int) sizeCalculateCameraFrameSize.width, (int) sizeCalculateCameraFrameSize.height);
                        if (!Build.MODEL.equals("GT-I9100")) {
                        }
                        supportedFocusModes = parameters.getSupportedFocusModes();
                        if (supportedFocusModes != null) {
                            parameters.setFocusMode("continuous-video");
                        }
                        this.mCamera.setParameters(parameters);
                        Camera.Parameters parameters22 = this.mCamera.getParameters();
                        this.mFrameWidth = parameters22.getPreviewSize().width;
                        this.mFrameHeight = parameters22.getPreviewSize().height;
                        if (getLayoutParams().width != -1) {
                        }
                        this.mScale = 0.0f;
                        fpsMeter = this.mFpsMeter;
                        if (fpsMeter != null) {
                        }
                        byte[] bArr2 = new byte[((this.mFrameWidth * this.mFrameHeight) * ImageFormat.getBitsPerPixel(parameters22.getPreviewFormat())) / 8];
                        this.mBuffer = bArr2;
                        this.mCamera.addCallbackBuffer(bArr2);
                        this.mCamera.setPreviewCallbackWithBuffer(this);
                        Mat[] matArr3 = new Mat[2];
                        this.mFrameChain = matArr3;
                        int i62 = this.mFrameHeight;
                        int i72 = this.mFrameWidth;
                        int i82 = CvType.CV_8UC1;
                        matArr3[0] = new Mat(i62 + (i62 / 2), i72, i82);
                        Mat[] matArr22 = this.mFrameChain;
                        int i92 = this.mFrameHeight;
                        matArr22[1] = new Mat(i92 + (i92 / 2), this.mFrameWidth, i82);
                        AllocateCache();
                        JavaCameraFrame[] javaCameraFrameArr2 = new JavaCameraFrame[2];
                        this.mCameraFrame = javaCameraFrameArr2;
                        javaCameraFrameArr2[0] = new JavaCameraFrame(this.mFrameChain[0], this.mFrameWidth, this.mFrameHeight);
                        this.mCameraFrame[1] = new JavaCameraFrame(this.mFrameChain[1], this.mFrameWidth, this.mFrameHeight);
                        SurfaceTexture surfaceTexture2 = new SurfaceTexture(10);
                        this.mSurfaceTexture = surfaceTexture2;
                        this.mCamera.setPreviewTexture(surfaceTexture2);
                        this.mCamera.startPreview();
                    } else {
                        z = false;
                    }
                    return z;
                }
                camera = this.mCamera;
                if (camera != null) {
                }
            } else if (i4 == 99) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                i3 = 0;
                while (i3 < Camera.getNumberOfCameras()) {
                    Camera.getCameraInfo(i3, cameraInfo);
                    if (cameraInfo.facing == 0) {
                        i4 = i3;
                        break;
                    }
                    i3++;
                }
                if (i4 == 99 && i4 != 98) {
                    Objects.toString(Integer.valueOf(i4));
                    try {
                        this.mCamera = Camera.open(i4);
                    } catch (RuntimeException e3) {
                        e3.getLocalizedMessage();
                    }
                    camera = this.mCamera;
                    if (camera != null) {
                    }
                }
            } else {
                if (i4 == 98) {
                    Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                    i3 = 0;
                    while (i3 < Camera.getNumberOfCameras()) {
                        Camera.getCameraInfo(i3, cameraInfo2);
                        if (cameraInfo2.facing == 1) {
                            i4 = i3;
                            break;
                        }
                        i3++;
                    }
                }
                if (i4 == 99) {
                    camera = this.mCamera;
                    if (camera != null) {
                    }
                }
            }
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 19;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Process.getGidForName(BuildConfig.FLAVOR) + 25, Color.alpha(0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 60 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 25;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), 59 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 6383 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    protected void releaseCamera() {
        synchronized (this) {
            Camera camera = this.mCamera;
            if (camera != null) {
                camera.stopPreview();
                this.mCamera.setPreviewCallback(null);
                this.mCamera.release();
            }
            this.mCamera = null;
            Mat[] matArr = this.mFrameChain;
            if (matArr != null) {
                matArr[0].release();
                this.mFrameChain[1].release();
            }
            JavaCameraFrame[] javaCameraFrameArr = this.mCameraFrame;
            if (javaCameraFrameArr != null) {
                javaCameraFrameArr[0].release();
                this.mCameraFrame[1].release();
            }
        }
    }

    @Override // org.opencv.android.CameraBridgeViewBase
    protected boolean connectCamera(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if (!(!initializeCamera(i, i2))) {
            this.mCameraFrameReady = false;
            this.mStopThread = false;
            Thread thread = new Thread(new CameraWorker());
            this.mThread = thread;
            thread.start();
            return true;
        }
        int i6 = onNavigationEvent + 97;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    @Override // org.opencv.android.CameraBridgeViewBase
    protected void disconnectCamera() {
        try {
            this.mStopThread = true;
            synchronized (this) {
                notify();
            }
            Thread thread = this.mThread;
            if (thread != null) {
                thread.join();
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            this.mThread = null;
            throw th;
        }
        this.mThread = null;
        releaseCamera();
        this.mCameraFrameReady = false;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        synchronized (this) {
            this.mFrameChain[this.mChainIdx].put(0, 0, bArr);
            this.mCameraFrameReady = true;
            notify();
        }
        Camera camera2 = this.mCamera;
        if (camera2 != null) {
            camera2.addCallbackBuffer(this.mBuffer);
        }
    }

    class JavaCameraFrame implements CameraBridgeViewBase.CvCameraViewFrame {
        private int mHeight;
        private Mat mRgba = new Mat();
        private int mWidth;
        private Mat mYuvFrameData;

        @Override // org.opencv.android.CameraBridgeViewBase.CvCameraViewFrame
        public Mat gray() {
            return this.mYuvFrameData.submat(0, this.mHeight, 0, this.mWidth);
        }

        @Override // org.opencv.android.CameraBridgeViewBase.CvCameraViewFrame
        public Mat rgba() {
            if (JavaCameraView.access$100(JavaCameraView.this) == 17) {
                Imgproc.cvtColor(this.mYuvFrameData, this.mRgba, 96, 4);
            } else if (JavaCameraView.access$100(JavaCameraView.this) == 842094169) {
                Imgproc.cvtColor(this.mYuvFrameData, this.mRgba, 100, 4);
            } else {
                throw new IllegalArgumentException("Preview Format can be NV21 or YV12");
            }
            return this.mRgba;
        }

        public JavaCameraFrame(Mat mat, int i, int i2) {
            this.mWidth = i;
            this.mHeight = i2;
            this.mYuvFrameData = mat;
        }

        public void release() {
            this.mRgba.release();
        }
    }

    class CameraWorker implements Runnable {
        private CameraWorker() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            do {
                synchronized (JavaCameraView.this) {
                    while (!JavaCameraView.access$200(JavaCameraView.this) && !JavaCameraView.access$300(JavaCameraView.this)) {
                        try {
                            JavaCameraView.this.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    z = false;
                    if (JavaCameraView.access$200(JavaCameraView.this)) {
                        JavaCameraView javaCameraView = JavaCameraView.this;
                        JavaCameraView.access$402(javaCameraView, 1 - JavaCameraView.access$400(javaCameraView));
                        JavaCameraView.access$202(JavaCameraView.this, false);
                        z = true;
                    }
                }
                if (!JavaCameraView.access$300(JavaCameraView.this) && z && !JavaCameraView.access$500(JavaCameraView.this)[1 - JavaCameraView.access$400(JavaCameraView.this)].empty()) {
                    JavaCameraView javaCameraView2 = JavaCameraView.this;
                    javaCameraView2.deliverAndDrawFrame(javaCameraView2.mCameraFrame[1 - JavaCameraView.access$400(javaCameraView2)]);
                }
            } while (!JavaCameraView.access$300(JavaCameraView.this));
        }
    }
}
