package org.opencv.android;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.AudioTrack;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.Surface;
import android.widget.ExpandableListView;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import net.sf.scuba.smartcards.BuildConfig;
import org.opencv.android.CameraBridgeViewBase;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class JavaCamera2View extends CameraBridgeViewBase {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static long IAuthTabCallback = 0;
    private static final String LOGTAG = "JavaCamera2View";
    private static int asInterface = 1;
    private static char onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    protected Handler mBackgroundHandler;
    private HandlerThread mBackgroundThread;
    protected CameraDevice mCameraDevice;
    protected String mCameraID;
    protected CameraCaptureSession mCaptureSession;
    protected ImageReader mImageReader;
    protected int mPreviewFormat;
    protected CaptureRequest.Builder mPreviewRequestBuilder;
    protected Size mPreviewSize;
    protected int mRequestTemplate;
    private final CameraDevice.StateCallback mStateCallback;

    static {
        onWarmupCompleted();
        int i = onExtraCallbackWithResult + 11;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    static /* synthetic */ void access$000(JavaCamera2View javaCamera2View) throws CameraAccessException {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        javaCamera2View.createCameraPreviewSession();
        if (i3 != 0) {
            throw null;
        }
    }

    public JavaCamera2View(Context context, int i) {
        super(context, i);
        this.mPreviewFormat = 35;
        this.mRequestTemplate = 1;
        this.mPreviewSize = new Size(-1, -1);
        this.mStateCallback = new CameraDevice.StateCallback() { // from class: org.opencv.android.JavaCamera2View.1
            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onOpened(CameraDevice cameraDevice) throws CameraAccessException {
                JavaCamera2View javaCamera2View = JavaCamera2View.this;
                javaCamera2View.mCameraDevice = cameraDevice;
                JavaCamera2View.access$000(javaCamera2View);
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onDisconnected(CameraDevice cameraDevice) {
                cameraDevice.close();
                JavaCamera2View.this.mCameraDevice = null;
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onError(CameraDevice cameraDevice, int i2) {
                cameraDevice.close();
                JavaCamera2View.this.mCameraDevice = null;
            }
        };
    }

    public JavaCamera2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPreviewFormat = 35;
        this.mRequestTemplate = 1;
        this.mPreviewSize = new Size(-1, -1);
        this.mStateCallback = new CameraDevice.StateCallback() { // from class: org.opencv.android.JavaCamera2View.1
            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onOpened(CameraDevice cameraDevice) throws CameraAccessException {
                JavaCamera2View javaCamera2View = JavaCamera2View.this;
                javaCamera2View.mCameraDevice = cameraDevice;
                JavaCamera2View.access$000(javaCamera2View);
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onDisconnected(CameraDevice cameraDevice) {
                cameraDevice.close();
                JavaCamera2View.this.mCameraDevice = null;
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onError(CameraDevice cameraDevice, int i2) {
                cameraDevice.close();
                JavaCamera2View.this.mCameraDevice = null;
            }
        };
    }

    private void startBackgroundThread() throws InterruptedException {
        int i = 2 % 2;
        stopBackgroundThread();
        HandlerThread handlerThread = new HandlerThread("OpenCVCameraBackground");
        this.mBackgroundThread = handlerThread;
        handlerThread.start();
        this.mBackgroundHandler = new Handler(this.mBackgroundThread.getLooper());
        int i2 = onTransact + 13;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void stopBackgroundThread() throws InterruptedException {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        HandlerThread handlerThread = this.mBackgroundThread;
        Object obj = null;
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
        int i5 = i3 + 113;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r2.length == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r12.mCameraIndex != (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        r12.mCameraID = r2[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r5 >= r4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        r8 = r2[r5];
        r9 = r1.getCameraCharacteristics(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r12.mCameraIndex != 99) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        r10 = org.opencv.android.JavaCamera2View.asInterface + 113;
        org.opencv.android.JavaCamera2View.onTransact = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (((java.lang.Integer) r9.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() == 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (r12.mCameraIndex != 98) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r10 = org.opencv.android.JavaCamera2View.asInterface + 15;
        org.opencv.android.JavaCamera2View.onTransact = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if ((r10 % 2) != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        if (((java.lang.Integer) r9.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue() != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        r12.mCameraID = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        ((java.lang.Integer) r9.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        if (r12.mCameraID == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a5, code lost:
    
        r1.openCamera(r12.mCameraID, r12.mStateCallback, r12.mBackgroundHandler);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00af, code lost:
    
        r4 = r12.mCameraIndex;
        r4 = r12.mCameraIndex;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
    
        if (r4 >= r2.length) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
    
        r5 = org.opencv.android.JavaCamera2View.asInterface + 85;
        org.opencv.android.JavaCamera2View.onTransact = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
    
        if ((r5 % 2) != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        r0 = r2[r4];
        r12.mCameraID = r0;
        r1.openCamera(r0, r12.mStateCallback, r12.mBackgroundHandler);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cc, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cd, code lost:
    
        r0 = r2[r4];
        r12.mCameraID = r0;
        r1.openCamera(r0, r12.mStateCallback, r12.mBackgroundHandler);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00db, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e3, code lost:
    
        throw new android.hardware.camera2.CameraAccessException(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r2.length == 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean initializeCamera() throws CameraAccessException {
        CameraManager cameraManager;
        String[] cameraIdList;
        int i = 2 % 2;
        int i2 = onTransact + 29;
        asInterface = i2 % 128;
        try {
            try {
                if (i2 % 2 == 0) {
                    cameraManager = (CameraManager) getContext().getSystemService("camera");
                    cameraIdList = cameraManager.getCameraIdList();
                    int i3 = 87 / 0;
                } else {
                    cameraManager = (CameraManager) getContext().getSystemService("camera");
                    cameraIdList = cameraManager.getCameraIdList();
                }
            } catch (SecurityException unused) {
                TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0);
                ExpandableListView.getPackedPositionChild(0L);
                return false;
            }
        } catch (CameraAccessException | IllegalArgumentException unused2) {
            return false;
        }
    }

    protected CameraCaptureSession.StateCallback allocateSessionStateCallback() {
        int i = 2 % 2;
        CameraCaptureSession.StateCallback stateCallback = new CameraCaptureSession.StateCallback() { // from class: org.opencv.android.JavaCamera2View.2
            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigured(CameraCaptureSession cameraCaptureSession) throws CameraAccessException {
                JavaCamera2View javaCamera2View = JavaCamera2View.this;
                if (javaCamera2View.mCameraDevice == null) {
                    return;
                }
                javaCamera2View.mCaptureSession = cameraCaptureSession;
                try {
                    javaCamera2View.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 4);
                    JavaCamera2View.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 2);
                    JavaCamera2View javaCamera2View2 = JavaCamera2View.this;
                    javaCamera2View2.mCaptureSession.setRepeatingRequest(javaCamera2View2.mPreviewRequestBuilder.build(), null, JavaCamera2View.this.mBackgroundHandler);
                } catch (Exception unused) {
                }
            }
        };
        int i2 = asInterface + 59;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return stateCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void createCameraPreviewSession() throws CameraAccessException {
        int i = 2 % 2;
        int width = this.mPreviewSize.getWidth();
        int height = this.mPreviewSize.getHeight();
        Object obj = null;
        if (width < 0 || height < 0) {
            int i2 = asInterface + 61;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i3 = onTransact + 117;
        asInterface = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (this.mCameraDevice != null && this.mCaptureSession == null) {
                ImageReader imageReaderNewInstance = ImageReader.newInstance(width, height, this.mPreviewFormat, 2);
                this.mImageReader = imageReaderNewInstance;
                imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: org.opencv.android.JavaCamera2View.3
                    static final /* synthetic */ boolean $assertionsDisabled = false;

                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public void onImageAvailable(ImageReader imageReader) {
                        Image imageAcquireLatestImage = imageReader.acquireLatestImage();
                        if (imageAcquireLatestImage == null) {
                            return;
                        }
                        imageAcquireLatestImage.getPlanes();
                        JavaCamera2Frame javaCamera2Frame = JavaCamera2View.this.new JavaCamera2Frame(imageAcquireLatestImage);
                        JavaCamera2View.this.deliverAndDrawFrame(javaCamera2Frame);
                        javaCamera2Frame.release();
                        imageAcquireLatestImage.close();
                    }
                }, this.mBackgroundHandler);
                Surface surface = this.mImageReader.getSurface();
                CaptureRequest.Builder builderCreateCaptureRequest = this.mCameraDevice.createCaptureRequest(this.mRequestTemplate);
                this.mPreviewRequestBuilder = builderCreateCaptureRequest;
                builderCreateCaptureRequest.addTarget(surface);
                this.mCameraDevice.createCaptureSession(Arrays.asList(surface), allocateSessionStateCallback(), null);
                int i4 = asInterface + 125;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
            }
        } catch (CameraAccessException unused) {
        }
    }

    @Override // org.opencv.android.CameraBridgeViewBase
    protected void disconnectCamera() throws InterruptedException {
        int i = 2 % 2;
        ImageReader imageReader = null;
        try {
            CameraDevice cameraDevice = this.mCameraDevice;
            this.mCameraDevice = null;
            CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
            if (cameraCaptureSession != null) {
                int i2 = asInterface + 73;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    cameraCaptureSession.close();
                    this.mCaptureSession = null;
                } else {
                    cameraCaptureSession.close();
                    this.mCaptureSession = null;
                    imageReader.hashCode();
                    throw null;
                }
            }
            if (cameraDevice != null) {
                cameraDevice.close();
            }
            int i3 = onTransact + 1;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        } finally {
            stopBackgroundThread();
            ImageReader imageReader2 = this.mImageReader;
            if (imageReader2 != null) {
                imageReader2.close();
                this.mImageReader = null;
            }
        }
    }

    public static class JavaCameraSizeAccessor implements CameraBridgeViewBase.ListItemAccessor {
        @Override // org.opencv.android.CameraBridgeViewBase.ListItemAccessor
        public int getWidth(Object obj) {
            return ((Size) obj).getWidth();
        }

        @Override // org.opencv.android.CameraBridgeViewBase.ListItemAccessor
        public int getHeight(Object obj) {
            return ((Size) obj).getHeight();
        }
    }

    boolean calcPreviewSize(int i, int i2) {
        int i3 = 2 % 2;
        if (this.mCameraID == null) {
            int i4 = onTransact;
            int i5 = i4 + 47;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 103;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        try {
            try {
                org.opencv.core.Size sizeCalculateCameraFrameSize = calculateCameraFrameSize(Arrays.asList(((StreamConfigurationMap) ((CameraManager) getContext().getSystemService("camera")).getCameraCharacteristics(this.mCameraID).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(ImageReader.class)), new JavaCameraSizeAccessor(), i, i2);
                Objects.toString(Integer.valueOf((int) sizeCalculateCameraFrameSize.width));
                Objects.toString(Integer.valueOf((int) sizeCalculateCameraFrameSize.height));
                if (this.mPreviewSize.getWidth() == sizeCalculateCameraFrameSize.width && this.mPreviewSize.getHeight() == sizeCalculateCameraFrameSize.height) {
                    int i9 = onTransact + 107;
                    asInterface = i9 % 128;
                    int i10 = i9 % 2;
                    return false;
                }
                this.mPreviewSize = new Size((int) sizeCalculateCameraFrameSize.width, (int) sizeCalculateCameraFrameSize.height);
                int i11 = onTransact + 3;
                asInterface = i11 % 128;
                int i12 = i11 % 2;
                return true;
            } catch (SecurityException unused) {
                ExpandableListView.getPackedPositionChild(0L);
                AudioTrack.getMinVolume();
                return false;
            }
        } catch (CameraAccessException | IllegalArgumentException unused2) {
            return false;
        }
    }

    @Override // org.opencv.android.CameraBridgeViewBase
    protected boolean connectCamera(int i, int i2) throws InterruptedException, CameraAccessException {
        int i3 = 2 % 2;
        startBackgroundThread();
        initializeCamera();
        try {
            boolean zCalcPreviewSize = calcPreviewSize(i, i2);
            this.mFrameWidth = this.mPreviewSize.getWidth();
            this.mFrameHeight = this.mPreviewSize.getHeight();
            if (getLayoutParams().width == -1 && getLayoutParams().height == -1) {
                int i4 = asInterface + 121;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                this.mScale = Math.min(i2 / this.mFrameHeight, i / this.mFrameWidth);
            } else {
                this.mScale = 0.0f;
            }
            AllocateCache();
            if (!(!zCalcPreviewSize)) {
                CameraCaptureSession cameraCaptureSession = this.mCaptureSession;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.close();
                    this.mCaptureSession = null;
                }
                createCameraPreviewSession();
                int i6 = asInterface + 23;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
            }
            FpsMeter fpsMeter = this.mFpsMeter;
            if (fpsMeter != null) {
                fpsMeter.setResolution(this.mFrameWidth, this.mFrameHeight);
            }
            return true;
        } catch (RuntimeException e) {
            throw new RuntimeException("Interrupted while setCameraPreviewSize.", e);
        }
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = 7798559133331975163L;
        onWarmupCompleted = -1776194565;
        onExtraCallback = (char) 56340;
    }

    class JavaCamera2Frame implements CameraBridgeViewBase.CvCameraViewFrame {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private Image mImage;
        private Mat mRgba = new Mat();
        private Mat mGray = new Mat();

        @Override // org.opencv.android.CameraBridgeViewBase.CvCameraViewFrame
        public Mat gray() {
            Image.Plane[] planes = this.mImage.getPlanes();
            Mat mat = new Mat(this.mImage.getHeight(), this.mImage.getWidth(), CvType.CV_8UC1, planes[0].getBuffer(), planes[0].getRowStride());
            this.mGray = mat;
            return mat;
        }

        @Override // org.opencv.android.CameraBridgeViewBase.CvCameraViewFrame
        public Mat rgba() {
            int i;
            Image.Plane[] planes = this.mImage.getPlanes();
            int width = this.mImage.getWidth();
            int height = this.mImage.getHeight();
            if (planes[1].getPixelStride() == 2) {
                ByteBuffer buffer = planes[0].getBuffer();
                int rowStride = planes[0].getRowStride();
                ByteBuffer buffer2 = planes[1].getBuffer();
                int rowStride2 = planes[1].getRowStride();
                ByteBuffer buffer3 = planes[2].getBuffer();
                int rowStride3 = planes[2].getRowStride();
                Mat mat = new Mat(height, width, CvType.CV_8UC1, buffer, rowStride);
                int i2 = height / 2;
                int i3 = width / 2;
                int i4 = CvType.CV_8UC2;
                Mat mat2 = new Mat(i2, i3, i4, buffer2, rowStride2);
                Mat mat3 = new Mat(i2, i3, i4, buffer3, rowStride3);
                if (mat3.dataAddr() - mat2.dataAddr() > 0) {
                    Imgproc.cvtColorTwoPlane(mat, mat2, this.mRgba, 94);
                } else {
                    Imgproc.cvtColorTwoPlane(mat, mat3, this.mRgba, 96);
                }
                return this.mRgba;
            }
            int i5 = height / 2;
            int i6 = height + i5;
            byte[] bArr = new byte[width * i6];
            ByteBuffer buffer4 = planes[0].getBuffer();
            ByteBuffer buffer5 = planes[1].getBuffer();
            ByteBuffer buffer6 = planes[2].getBuffer();
            int rowStride4 = planes[0].getRowStride();
            if (rowStride4 == width) {
                i = width * height;
                buffer4.get(bArr, 0, i);
            } else {
                int i7 = 0;
                for (int i8 = 0; i8 < height; i8++) {
                    buffer4.get(bArr, i7, width);
                    i7 += width;
                    if (i8 < height - 1) {
                        buffer4.position(buffer4.position() + (rowStride4 - width));
                    }
                }
                i = i7;
            }
            int i9 = width / 2;
            int rowStride5 = planes[1].getRowStride() - i9;
            if (rowStride5 == 0) {
                int i10 = (height * width) / 4;
                buffer5.get(bArr, i, i10);
                buffer6.get(bArr, i + i10, i10);
            } else {
                for (int i11 = 0; i11 < i5; i11++) {
                    buffer5.get(bArr, i, i9);
                    i += i9;
                    if (i11 < i5 - 1) {
                        buffer5.position(buffer5.position() + rowStride5);
                    }
                }
                for (int i12 = 0; i12 < i5; i12++) {
                    buffer6.get(bArr, i, i9);
                    i += i9;
                    if (i12 < i5 - 1) {
                        buffer6.position(buffer6.position() + rowStride5);
                    }
                }
            }
            Mat mat4 = new Mat(i6, width, CvType.CV_8UC1);
            mat4.put(0, 0, bArr);
            Imgproc.cvtColor(mat4, this.mRgba, 104, 4);
            return this.mRgba;
        }

        public JavaCamera2Frame(Image image) {
            this.mImage = image;
        }

        public void release() {
            this.mRgba.release();
            this.mGray.release();
        }
    }
}
