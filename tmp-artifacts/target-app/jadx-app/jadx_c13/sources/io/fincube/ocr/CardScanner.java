package io.fincube.ocr;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.SizeF;
import android.view.Display;
import android.view.Surface;
import android.view.TextureView;
import android.view.WindowManager;
import io.fincube.creditcard.DetectionInfo;
import io.fincube.ocrsdk.OcrConfigSDK;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.addAllExitInfoAtFirstRun;
import o.configureEventSynthesizer;
import o.convertToEventImplbugsnag_android_core_release;
import o.deserializeSeverityReasonbugsnag_android_core_release;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class CardScanner implements Camera.PreviewCallback, Camera.AutoFocusCallback, TextureView.SurfaceTextureListener {
    private static final int CAMERA_CONNECT_RETRY_INTERVAL = 50;
    private static final int CAMERA_CONNECT_TIMEOUT = 5000;
    static final int CREDIT_CARD_TARGET_HEIGHT = 604;
    static final int CREDIT_CARD_TARGET_WIDTH = 960;
    private static final long GREEN_CHECK_DELAY_MS = 1000;
    private static final int GREEN_MAX_RB = 50;
    private static final int GREEN_MIN_G = 80;
    private static final long GREEN_RECHECK_DELAY_MS = 500;
    private static final int GREEN_SAMPLE_SIZE = 16;
    private static final int GREEN_UNIFORM_TOLERANCE = 12;
    private static final float MIN_FOCUS_SCORE = 5.0f;
    private static final int ORIENTATION_LANDSCAPE_LEFT = 4;
    private static final int ORIENTATION_LANDSCAPE_RIGHT = 3;
    private static final int ORIENTATION_PORTRAIT = 1;
    private static final int ORIENTATION_PORTRAIT_UPSIDE_DOWN = 2;
    public static final int SCAN_MODE_EMBOSS = 0;
    public static final int SCAN_MODE_PRINT = 1;
    public static final int SCAN_MODE_UNKNOWN = 2;
    private static final String TAG = "CardScannerLOG";
    private static boolean manualFallbackForError = false;
    private static boolean processingInProgress = false;
    private long DMZ_handle;
    private long captureStart;
    private DetectionInfo detectionInfo;
    private boolean isSurfaceValid;
    long last;
    private Activity mActivity;
    private long mAutoFocusCompletedAt;
    private long mAutoFocusStartedAt;
    private long mCamStartTime;
    private Camera mCamera;
    Context mContext;
    private long mLastPreviewTime;
    addAllExitInfoAtFirstRun mListener;
    OcrConfig mOcrConfig;
    private boolean mOptionSaveFrameForDebug;
    private boolean mScanExpiry;
    private int numAutoRefocus;
    private int numFramesSkipped;
    private int numManualRefocus;
    private int numManualTorchChange;
    private int mScanMode = 2;
    private boolean mCheckSanityNumber = true;
    private boolean mCheckSanityExpiry = false;
    private Rect mGuideRect = new Rect();
    private boolean mSuppressScan = false;
    private int mFrameOrientation = 1;
    private int mFrameNumber = 0;
    private boolean mFirstPreviewFrame = true;
    private ByteBuffer mPreviewBuffer = null;
    private ByteBuffer nativeBuffer = null;
    private Thread nativeThread = null;
    private deserializeSeverityReasonbugsnag_android_core_release mCam2 = null;
    private boolean mUseCamera2 = false;
    private onWarmupCompleted mActualSizeListener = null;
    private onExtraCallback mSurfaceProvider = null;
    private boolean mPreviewRevealed = false;
    protected boolean useCamera = true;
    private boolean mLastFrameDetected = false;
    private final deserializeSeverityReasonbugsnag_android_core_release.onWarmupCompleted mCam2FrameCallback = new deserializeSeverityReasonbugsnag_android_core_release.onWarmupCompleted() { // from class: io.fincube.ocr.CardScanner.1
        @Override // o.deserializeSeverityReasonbugsnag_android_core_release.onWarmupCompleted
        public void onNavigationEvent(byte[] bArr, int i, int i2) {
            if (bArr != null) {
                if (CardScanner.processingInProgress) {
                    CardScanner.this.numFramesSkipped++;
                    return;
                }
                if (CardScanner.this.mFirstPreviewFrame) {
                    CardScanner.this.mLastPreviewTime = SystemClock.uptimeMillis();
                    CardScanner.this.mFirstPreviewFrame = false;
                    CardScanner.this.mListener.onWarmupCompleted();
                } else {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    if (jUptimeMillis - CardScanner.this.mLastPreviewTime < 3) {
                        return;
                    } else {
                        CardScanner.this.mLastPreviewTime = jUptimeMillis;
                    }
                }
                if (CardScanner.this.nativeBuffer == null) {
                    return;
                }
                synchronized (CardScanner.this.nativeBuffer) {
                    CardScanner.this.nativeBuffer.rewind();
                    CardScanner.this.nativeBuffer.put(bArr, 0, Math.min(bArr.length, CardScanner.this.nativeBuffer.capacity()));
                    CardScanner.this.nativeBuffer.notify();
                }
            }
        }
    };
    private volatile boolean mFellBackToCamera1 = false;
    private final deserializeSeverityReasonbugsnag_android_core_release.onExtraCallback mNoFrameHandler = new 3(this);
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private Runnable mGreenCheck = null;
    private int frameCount = 0;
    private float[] srcPts = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    private float[] dstPts = {0.0f, 0.0f, 960.0f, 0.0f, 0.0f, 604.0f, 960.0f, 604.0f};
    private float[] dstPts_reverse = {960.0f, 604.0f, 0.0f, 604.0f, 960.0f, 0.0f, 0.0f, 0.0f};
    private float[] dstPts_quad = {0.0f, 0.0f, 1920.0f, 0.0f, 0.0f, 1208.0f, 1920.0f, 1208.0f};
    Matrix unwarpMat = new Matrix();
    Matrix unwarpMat_quad = new Matrix();
    boolean requestStop = false;
    onExtraCallbackWithResult requestChangeScannerType = new onExtraCallbackWithResult();
    Runnable nativeDetectRunnable = new Runnable() { // from class: io.fincube.ocr.CardScanner.4
        /* JADX WARN: Removed duplicated region for block: B:164:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            int iQrCodeScanFrame;
            addAllExitInfoAtFirstRun addallexitinfoatfirstrun = CardScanner.this.mListener;
            if (addallexitinfoatfirstrun != null) {
                addallexitinfoatfirstrun.onNavigationEvent();
            }
            if (!CardScanner.this.createDMZ()) {
                CardScanner cardScanner = CardScanner.this;
                cardScanner.requestStop = true;
                cardScanner.mListener.IAuthTabCallback(cardScanner.mOcrConfig.errorCode);
            } else {
                CardScanner.this.requestStop = false;
            }
            addAllExitInfoAtFirstRun addallexitinfoatfirstrun2 = CardScanner.this.mListener;
            if (addallexitinfoatfirstrun2 != null) {
                addallexitinfoatfirstrun2.onExtraCallbackWithResult();
            }
            DetectionInfo detectionInfo = new DetectionInfo();
            while (true) {
                CardScanner cardScanner2 = CardScanner.this;
                if (!cardScanner2.requestStop) {
                    synchronized (cardScanner2.requestChangeScannerType) {
                        if (CardScanner.this.requestChangeScannerType.onNavigationEvent()) {
                            addAllExitInfoAtFirstRun addallexitinfoatfirstrun3 = CardScanner.this.mListener;
                            if (addallexitinfoatfirstrun3 != null) {
                                addallexitinfoatfirstrun3.onNavigationEvent();
                            }
                            CardScanner.this.releaseDMZ();
                            CardScanner cardScanner3 = CardScanner.this;
                            cardScanner3.mOcrConfig.scannerType = cardScanner3.requestChangeScannerType.onExtraCallbackWithResult();
                            CardScanner.this.createDMZ();
                            CardScanner.this.requestChangeScannerType.onWarmupCompleted();
                            addAllExitInfoAtFirstRun addallexitinfoatfirstrun4 = CardScanner.this.mListener;
                            if (addallexitinfoatfirstrun4 != null) {
                                addallexitinfoatfirstrun4.onExtraCallbackWithResult();
                            }
                        }
                    }
                    synchronized (CardScanner.this.nativeBuffer) {
                        if (CardScanner.this.mCamStartTime == 0) {
                            CardScanner.this.mCamStartTime = SystemClock.uptimeMillis();
                        }
                        if (CardScanner.this.mOcrConfig.timeOutIntervalSec > 0) {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            long j = CardScanner.this.mCamStartTime;
                            CardScanner cardScanner4 = CardScanner.this;
                            OcrConfig ocrConfig = cardScanner4.mOcrConfig;
                            if (jUptimeMillis - j > ocrConfig.timeOutIntervalSec * CardScanner.GREEN_CHECK_DELAY_MS) {
                                ocrConfig.dInfo.errorCode = DetectionInfo.onExtraCallbackWithResult.TIME_OUT;
                                cardScanner4.mListener.onExtraCallbackWithResult(detectionInfo);
                            } else {
                                try {
                                    CardScanner.this.nativeBuffer.wait(300L);
                                } catch (InterruptedException unused) {
                                }
                                if (!CardScanner.this.requestStop) {
                                    CardScanner.processingInProgress = true;
                                    ByteBuffer byteBuffer = CardScanner.this.nativeBuffer;
                                    CardScanner cardScanner5 = CardScanner.this;
                                    cardScanner5.mOcrConfig.handle = cardScanner5.DMZ_handle;
                                    CardScanner cardScanner6 = CardScanner.this;
                                    cardScanner6.mOcrConfig.reverseCamera = cardScanner6.mReverseCamera;
                                    CardScanner cardScanner7 = CardScanner.this;
                                    OcrConfig ocrConfig2 = cardScanner7.mOcrConfig;
                                    ocrConfig2.frameBuffer = byteBuffer;
                                    ocrConfig2.dInfo = detectionInfo;
                                    ocrConfig2.tryColorTest = true;
                                    if (!cardScanner7.requestStop) {
                                        if (ocrConfig2.scannerType != OcrConfigSDK.onExtraCallbackWithResult.BARCODEREADER.getValue()) {
                                            iQrCodeScanFrame = OcrEngine.ScanFrame(CardScanner.this.mOcrConfig);
                                            if (detectionInfo.numVisibleEdges() == 4) {
                                                CardScanner.this.mListener.onExtraCallback();
                                            }
                                        } else {
                                            iQrCodeScanFrame = OcrEngine.QrCodeScanFrame(CardScanner.this.mOcrConfig);
                                            if (iQrCodeScanFrame != 0) {
                                                try {
                                                    byte[] bArr = detectionInfo.barcode_str;
                                                    if (bArr != null) {
                                                        detectionInfo.barcodeString = new String(bArr, "euc-kr");
                                                    }
                                                } catch (UnsupportedEncodingException unused2) {
                                                }
                                                detectionInfo.cardScannerType = OcrConfigSDK.onExtraCallbackWithResult.BARCODEREADER.getValue();
                                                detectionInfo.barcode_str = null;
                                                detectionInfo.barcode_type = -1;
                                                detectionInfo.complete = true;
                                                CardScanner.this.mListener.onExtraCallbackWithResult(detectionInfo);
                                            }
                                        }
                                        boolean z = iQrCodeScanFrame != 0;
                                        CardScanner cardScanner8 = CardScanner.this;
                                        if (!cardScanner8.requestStop) {
                                            cardScanner8.mListener.onWarmupCompleted(detectionInfo);
                                            if (z) {
                                                if (detectionInfo.predicted() || (CardScanner.this.mSuppressScan && detectionInfo.detected())) {
                                                    break;
                                                }
                                                CardScanner cardScanner9 = CardScanner.this;
                                                if (cardScanner9.mOcrConfig.updateDetectedInfo && detectionInfo.cardScannerType == -1 && detectionInfo.updated) {
                                                    detectionInfo.unRecognizedCard = (Bitmap) OcrEngine.getUnRecognizedCardImage(cardScanner9.DMZ_handle);
                                                    CardScanner.this.mListener.onExtraCallbackWithResult(detectionInfo);
                                                }
                                            } else {
                                                CardScanner.this.mLastFrameDetected = false;
                                            }
                                            CardScanner.processingInProgress = false;
                                            Thread.yield();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            }
            SystemClock.uptimeMillis();
            long unused3 = CardScanner.this.mCamStartTime;
            String str = _UrlKt.FRAGMENT_ENCODE_SET;
            int i = 0;
            while (true) {
                int[] iArr = detectionInfo.spaceIndices;
                if (i >= iArr.length || iArr[i] == 0) {
                    break;
                }
                str = str + detectionInfo.spaceIndices[i] + ",";
                i++;
            }
            if (!CardScanner.this.requestStop) {
                if (detectionInfo.cardScannerType == OcrConfigSDK.onExtraCallbackWithResult.IDCARD_AUTO.getValue()) {
                    detectionInfo.photoImage = (Bitmap) OcrEngine.getDetectedPhotoImage(CardScanner.this.DMZ_handle);
                    detectionInfo.markedCardImage = (Bitmap) OcrEngine.getDetectedCardImage(CardScanner.this.DMZ_handle);
                    detectionInfo.cardImage = (Bitmap) OcrEngine.getDetectedOrgCardImage(CardScanner.this.DMZ_handle);
                    detectionInfo.markedFrameImage = (Bitmap) OcrEngine.getDetectedFrameImage(CardScanner.this.DMZ_handle);
                    detectionInfo.frameImage = (Bitmap) OcrEngine.getDetectedOrgFrameImage(CardScanner.this.DMZ_handle);
                    detectionInfo.fullFrameImage = (Bitmap) OcrEngine.getDetectedFullFrameImage(CardScanner.this.DMZ_handle);
                    detectionInfo.frameList = OcrEngine.getScanedImages(CardScanner.this.DMZ_handle);
                    if (detectionInfo.photoImage != null) {
                        detectionInfo.photoImage_rect400 = Bitmap.createScaledBitmap(detectionInfo.photoImage, (int) (r4.getWidth() * (400.0f / detectionInfo.photoImage.getHeight())), 400, false);
                    }
                    int[] iArr2 = detectionInfo.mask_rect_id_number_array;
                    int i2 = iArr2[0];
                    int i3 = iArr2[1];
                    detectionInfo.mask_rect_id_number = new Rect(i2, i3, iArr2[2] + i2, iArr2[3] + i3);
                    int[] iArr3 = detectionInfo.mask_rect_license_number_array;
                    int i4 = iArr3[0];
                    int i5 = iArr3[1];
                    detectionInfo.mask_rect_license_number = new Rect(i4, i5, iArr3[2] + i4, iArr3[3] + i5);
                    int[] iArr4 = detectionInfo.rect_id_issue_date_array;
                    int i6 = iArr4[0];
                    int i7 = iArr4[1];
                    detectionInfo.rect_id_issue_date = new Rect(i6, i7, iArr4[2] + i6, iArr4[3] + i7);
                    int[] iArr5 = detectionInfo.rect_id_overseas_residents_array;
                    int i8 = iArr5[0];
                    int i9 = iArr5[1];
                    detectionInfo.rect_id_overseas_residents = new Rect(i8, i9, iArr5[2] + i8, iArr5[3] + i9);
                } else if (detectionInfo.cardScannerType == OcrConfigSDK.onExtraCallbackWithResult.ALIEN_REGISTRATION.getValue()) {
                    detectionInfo.photoImage = (Bitmap) OcrEngine.getDetectedPhotoImage(CardScanner.this.DMZ_handle);
                    detectionInfo.markedCardImage = (Bitmap) OcrEngine.getDetectedCardImage(CardScanner.this.DMZ_handle);
                    detectionInfo.cardImage = (Bitmap) OcrEngine.getDetectedOrgCardImage(CardScanner.this.DMZ_handle);
                    detectionInfo.markedFrameImage = (Bitmap) OcrEngine.getDetectedFrameImage(CardScanner.this.DMZ_handle);
                    detectionInfo.frameImage = (Bitmap) OcrEngine.getDetectedOrgFrameImage(CardScanner.this.DMZ_handle);
                    detectionInfo.fullFrameImage = (Bitmap) OcrEngine.getDetectedFullFrameImage(CardScanner.this.DMZ_handle);
                    detectionInfo.frameList = OcrEngine.getScanedImages(CardScanner.this.DMZ_handle);
                    if (detectionInfo.photoImage != null) {
                        detectionInfo.photoImage_rect400 = Bitmap.createScaledBitmap(detectionInfo.photoImage, (int) (r1.getWidth() * (400.0f / detectionInfo.photoImage.getHeight())), 400, false);
                    }
                } else if (detectionInfo.cardScannerType == OcrConfigSDK.onExtraCallbackWithResult.ALIEN_BACK_REGISTRATION.getValue()) {
                    detectionInfo.cardImage = (Bitmap) OcrEngine.getDetectedCardImage(CardScanner.this.DMZ_handle);
                } else if (detectionInfo.cardScannerType == OcrConfigSDK.onExtraCallbackWithResult.PASSPORT.getValue()) {
                    detectionInfo.photoImage = (Bitmap) OcrEngine.getDetectedPhotoImage(CardScanner.this.DMZ_handle);
                    detectionInfo.markedCardImage = (Bitmap) OcrEngine.getDetectedCardImage(CardScanner.this.DMZ_handle);
                    detectionInfo.cardImage = (Bitmap) OcrEngine.getDetectedOrgCardImage(CardScanner.this.DMZ_handle);
                    detectionInfo.markedFrameImage = (Bitmap) OcrEngine.getDetectedFrameImage(CardScanner.this.DMZ_handle);
                    detectionInfo.frameImage = (Bitmap) OcrEngine.getDetectedOrgFrameImage(CardScanner.this.DMZ_handle);
                    detectionInfo.fullFrameImage = (Bitmap) OcrEngine.getDetectedFullFrameImage(CardScanner.this.DMZ_handle);
                    detectionInfo.frameList = OcrEngine.getScanedImages(CardScanner.this.DMZ_handle);
                    if (detectionInfo.photoImage != null) {
                        detectionInfo.photoImage_rect400 = Bitmap.createScaledBitmap(detectionInfo.photoImage, (int) (r1.getWidth() * (400.0f / detectionInfo.photoImage.getHeight())), 400, false);
                    }
                } else if (detectionInfo.cardScannerType == OcrConfigSDK.onExtraCallbackWithResult.GIRO.getValue() || detectionInfo.cardScannerType == OcrConfigSDK.onExtraCallbackWithResult.CREDITCARD.getValue()) {
                    detectionInfo.cardImage = (Bitmap) OcrEngine.getDetectedCardImage(CardScanner.this.DMZ_handle);
                } else if (detectionInfo.cardScannerType == OcrConfigSDK.onExtraCallbackWithResult.CAPTURE_PAPER.getValue()) {
                    CardScanner.this.detectionInfo = detectionInfo;
                    CardScanner.this.mCamera.takePicture(CardScanner.this.shutterCallback, null, CardScanner.this.rawCallback);
                    CardScanner.this.mOcrConfig.dInfo.complete = true;
                }
                detectionInfo.engineInfo = OcrEngine.getEngineInfo();
                CardScanner cardScanner10 = CardScanner.this;
                OcrConfig ocrConfig3 = cardScanner10.mOcrConfig;
                if (ocrConfig3.autoReleaseCamera) {
                    cardScanner10.mListener.onExtraCallbackWithResult(detectionInfo);
                } else {
                    OcrEngine.Reset(ocrConfig3.handle, ocrConfig3.scannerType);
                    CardScanner cardScanner11 = CardScanner.this;
                    if (cardScanner11.requestStop && cardScanner11.mOcrConfig.scannerType != OcrConfigSDK.onExtraCallbackWithResult.CAPTURE_PAPER.getValue()) {
                        CardScanner.this.releaseCamera();
                        CardScanner.this.releaseDMZ();
                    }
                    CardScanner.processingInProgress = false;
                    CardScanner.this.mListener.onExtraCallbackWithResult(detectionInfo);
                    return;
                }
            }
            CardScanner cardScanner12 = CardScanner.this;
            if (!cardScanner12.requestStop) {
                OcrConfig ocrConfig4 = cardScanner12.mOcrConfig;
                OcrEngine.Reset(ocrConfig4.handle, ocrConfig4.scannerType);
            }
            CardScanner cardScanner13 = CardScanner.this;
            OcrConfig ocrConfig5 = cardScanner13.mOcrConfig;
            if ((ocrConfig5.autoReleaseCamera || cardScanner13.requestStop) && ocrConfig5.scannerType != OcrConfigSDK.onExtraCallbackWithResult.CAPTURE_PAPER.getValue()) {
                CardScanner.this.releaseCamera();
                CardScanner.this.releaseDMZ();
            }
        }
    };
    private final Camera.ShutterCallback shutterCallback = new Camera.ShutterCallback() { // from class: io.fincube.ocr.CardScanner.8
        @Override // android.hardware.Camera.ShutterCallback
        public void onShutter() {
        }
    };
    private final Camera.PictureCallback rawCallback = new Camera.PictureCallback() { // from class: io.fincube.ocr.CardScanner.9
        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            int i = camera.getParameters().getPictureSize().width;
            int i2 = camera.getParameters().getPictureSize().height;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            Bitmap bitmapCreateBitmap = (Bitmap) OcrEngine.getWrappedImage(bitmapDecodeByteArray, CardScanner.this.mOcrConfig);
            if (bitmapCreateBitmap == null) {
                float f = i;
                int i3 = (int) (((CardScanner.this.detectionInfo.cornerTLX + CardScanner.this.detectionInfo.cornerTRX) / 2.0f) * f);
                float f2 = i2;
                int i4 = (int) (((CardScanner.this.detectionInfo.cornerTRY + CardScanner.this.detectionInfo.cornerBRY) / 2.0f) * f2);
                int i5 = (int) (((CardScanner.this.detectionInfo.cornerBRX + CardScanner.this.detectionInfo.cornerBLX) / 2.0f) * f);
                int i6 = (int) (((CardScanner.this.detectionInfo.cornerTLY + CardScanner.this.detectionInfo.cornerBLY) / 2.0f) * f2);
                Matrix matrix = new Matrix();
                if (CardScanner.this.mOcrConfig.orientation == 1) {
                    matrix.setRotate(90.0f);
                } else {
                    matrix.setRotate(0.0f);
                }
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, i3, i4, i5 - i3, i6 - i4, matrix, true);
            }
            CardScanner.this.detectionInfo.cardImage = bitmapCreateBitmap;
            CardScanner.this.releaseCamera();
            CardScanner.this.releaseDMZ();
            CardScanner.this.detectionInfo.engineInfo = OcrEngine.getEngineInfo();
            CardScanner cardScanner = CardScanner.this;
            cardScanner.mListener.onExtraCallbackWithResult(cardScanner.detectionInfo);
        }
    };
    private int mPrintTryNumber = 0;
    private int mTotalTries = 0;
    private boolean mReverseCamera = false;

    public interface onExtraCallback {
        Surface IAuthTabCallback();

        SurfaceTexture onExtraCallback();

        void onNavigationEvent(TextureView.SurfaceTextureListener surfaceTextureListener);

        boolean onNavigationEvent();

        Bitmap onWarmupCompleted(int i, int i2);

        void onWarmupCompleted();
    }

    public interface onWarmupCompleted {
        void onWarmupCompleted(int i, int i2);
    }

    static boolean processorSupported() {
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void setScanMode(int i) {
        this.mScanMode = i;
    }

    public int getScanMode() {
        return this.mScanMode;
    }

    private static String loadLicenseKeyFile(Context context, OcrConfigSDK ocrConfigSDK) throws Throwable {
        BufferedReader bufferedReader;
        if (ocrConfigSDK.licenseKeyBuffer.length() > 0) {
            return ocrConfigSDK.licenseKeyBuffer;
        }
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(ocrConfigSDK.licenseKeyFile)));
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            String line = bufferedReader.readLine();
            try {
                bufferedReader.close();
                return line;
            } catch (IOException unused2) {
                return line;
            }
        } catch (IOException unused3) {
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused4) {
                }
            }
            return _UrlKt.FRAGMENT_ENCODE_SET;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean createDMZ() {
        this.mOcrConfig.faceDetectionDataPath = checkFaceDetectionDataFile(this.mContext);
        this.mOcrConfig.eyeDetectionDataPath = checkEyeDetectionDataFile(this.mContext);
        String str = this.mOcrConfig.faceDetectionDataPath;
        OcrConfig ocrConfig = this.mOcrConfig;
        ocrConfig.licenseKey = loadLicenseKeyFile(this.mContext, ocrConfig);
        Context context = this.mContext;
        this.DMZ_handle = OcrEngine.InitWithAssetDirectly(context, context.getAssets(), this.mOcrConfig);
        int i = this.mOcrConfig.errorCode;
        return this.DMZ_handle != 0 && this.mOcrConfig.errorCode == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseDMZ() {
        synchronized (this) {
            long j = this.DMZ_handle;
            if (j != 0) {
                OcrEngine.Destroy(j, this.mOcrConfig.scannerType);
                this.DMZ_handle = 0L;
            }
        }
    }

    static String checkFaceDetectionDataFile(Context context) throws IOException {
        String string = context.getFilesDir().toString();
        String[] strArr = {string, string + "/facedetection/"};
        for (int i = 0; i < 2; i++) {
            File file = new File(strArr[i]);
            if (!file.exists() && !file.mkdirs()) {
                return _UrlKt.FRAGMENT_ENCODE_SET;
            }
        }
        if (!new File(string + "/facedetection/haarcascade_frontalface_alt.xml").exists()) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("facedetection/haarcascade_frontalface_alt.xml");
                FileOutputStream fileOutputStream = new FileOutputStream(strArr[1] + "haarcascade_frontalface_alt.xml");
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = inputStreamOpen.read(bArr);
                    if (i2 <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i2);
                }
                inputStreamOpen.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.toString();
                return _UrlKt.FRAGMENT_ENCODE_SET;
            }
        }
        return strArr[1] + "haarcascade_frontalface_alt.xml";
    }

    static String checkEyeDetectionDataFile(Context context) throws IOException {
        String string = context.getFilesDir().toString();
        String[] strArr = {string, string + "/facedetection/"};
        for (int i = 0; i < 2; i++) {
            File file = new File(strArr[i]);
            if (!file.exists() && !file.mkdirs()) {
                return _UrlKt.FRAGMENT_ENCODE_SET;
            }
        }
        if (!new File(string + "/facedetection/haarcascade_eye.xml").exists()) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("facedetection/haarcascade_eye.xml");
                FileOutputStream fileOutputStream = new FileOutputStream(strArr[1] + "haarcascade_eye.xml");
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = inputStreamOpen.read(bArr);
                    if (i2 <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i2);
                }
                inputStreamOpen.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.toString();
                return _UrlKt.FRAGMENT_ENCODE_SET;
            }
        }
        return strArr[1] + "haarcascade_eye.xml";
    }

    public void setActualSizeListener(onWarmupCompleted onwarmupcompleted) {
        this.mActualSizeListener = onwarmupcompleted;
    }

    public void setSurfaceProvider(onExtraCallback onextracallback) {
        this.mSurfaceProvider = onextracallback;
    }

    public void cardScannerStartListener(addAllExitInfoAtFirstRun addallexitinfoatfirstrun) {
        this.mListener = addallexitinfoatfirstrun;
    }

    CardScanner(Context context, OcrConfig ocrConfig) {
        this.mContext = context;
        this.mOcrConfig = ocrConfig;
    }

    private Camera connectToCamera(int i, int i2) throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.useCamera) {
            return null;
        }
        do {
            try {
                return openCamera(this.mOcrConfig);
            } catch (RuntimeException unused) {
                try {
                    Thread.sleep(i);
                } catch (InterruptedException unused2) {
                }
            } catch (Exception unused3) {
                i2 = 0;
            }
        } while (System.currentTimeMillis() - jCurrentTimeMillis < i2);
        return null;
    }

    void setFocusMode(Camera camera, OcrConfig ocrConfig) throws CameraAccessException {
        try {
            CameraCharacteristics cameraCharacteristics = ((CameraManager) ocrConfig.context.getSystemService("camera")).getCameraCharacteristics(((CameraManager) ocrConfig.context.getSystemService("camera")).getCameraIdList()[ocrConfig.cameraIdx]);
            float f = ((float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS))[0];
            SizeF sizeF = (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            CameraCharacteristics.Key key = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
            float fFloatValue = 1000.0f / (cameraCharacteristics.get(key) != null ? ((Float) cameraCharacteristics.get(key)).floatValue() : 10.0f);
            float width = (sizeF.getWidth() / f) * fFloatValue;
            float height = (sizeF.getHeight() / f) * fFloatValue;
            float fMin = Math.min(width / Math.min(95.111115f, width), height / Math.min(59.97778f, height));
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.isZoomSupported()) {
                List<Integer> zoomRatios = parameters.getZoomRatios();
                int iAbs = Integer.MAX_VALUE;
                int i = 0;
                for (int i2 = 0; i2 <= parameters.getMaxZoom(); i2++) {
                    int i3 = (int) (100.0f * fMin);
                    if (Math.abs(i3 - zoomRatios.get(i2).intValue()) < iAbs) {
                        iAbs = Math.abs(i3 - zoomRatios.get(i2).intValue());
                        i = i2;
                    }
                }
                parameters.setZoom(i);
            }
            camera.setParameters(parameters);
        } catch (Exception e) {
            e.toString();
        }
    }

    void prepareScanner() throws InterruptedException, RuntimeException {
        int i;
        this.mFirstPreviewFrame = true;
        this.mFrameNumber = 0;
        this.mAutoFocusStartedAt = 0L;
        this.mAutoFocusCompletedAt = 0L;
        this.numManualRefocus = 0;
        this.numAutoRefocus = 0;
        this.numManualTorchChange = 0;
        this.numFramesSkipped = 0;
        if (this.useCamera && this.mCam2 == null && configureEventSynthesizer.onExtraCallback() && !this.mFellBackToCamera1) {
            try {
                deserializeSeverityReasonbugsnag_android_core_release deserializeseverityreasonbugsnag_android_core_release = new deserializeSeverityReasonbugsnag_android_core_release(this.mOcrConfig.context);
                if (deserializeseverityreasonbugsnag_android_core_release.onExtraCallback()) {
                    this.mCam2 = deserializeseverityreasonbugsnag_android_core_release;
                    this.mUseCamera2 = true;
                    deserializeseverityreasonbugsnag_android_core_release.onNavigationEvent(this.mNoFrameHandler);
                }
            } catch (Throwable unused) {
                this.mCam2 = null;
                this.mUseCamera2 = false;
            }
        }
        if (this.mUseCamera2) {
            return;
        }
        configureEventSynthesizer.onExtraCallback();
        boolean z = this.useCamera;
        if (z && this.mCamera == null) {
            Camera cameraConnectToCamera = connectToCamera(50, CAMERA_CONNECT_TIMEOUT);
            this.mCamera = cameraConnectToCamera;
            if (cameraConnectToCamera == null) {
                return;
            }
            setCameraDisplayOrientation(cameraConnectToCamera);
            setCameraBrightness(this.mCamera, 0);
            Camera.Parameters parameters = this.mCamera.getParameters();
            OcrConfig ocrConfig = this.mOcrConfig;
            parameters.setPreviewSize(ocrConfig.cameraPreviewWidth, ocrConfig.cameraPreviewHeight);
            parameters.setZoom(0);
            OcrConfig ocrConfig2 = this.mOcrConfig;
            int i2 = ocrConfig2.cameraPictureWidth;
            if (i2 > 0 && (i = ocrConfig2.cameraPictureHeight) > 0) {
                parameters.setPictureSize(i2, i);
            }
            if (new Camera.CameraInfo().canDisableShutterSound) {
                this.mCamera.enableShutterSound(false);
            }
            int i3 = 1;
            int i4 = 1;
            for (int[] iArr : parameters.getSupportedPreviewFpsRange()) {
                int i5 = iArr[1];
                if (i5 > i4) {
                    i3 = iArr[0];
                    i4 = i5;
                }
            }
            parameters.setPreviewFpsRange(i3, i4);
            this.mCamera.setParameters(parameters);
            return;
        }
        if (!z || this.mCamera == null) {
            return;
        }
        Objects.toString(this.mCamera);
    }

    void setSurfaceValid(boolean z) {
        this.isSurfaceValid = z;
    }

    public boolean getCameraState() {
        return this.requestStop;
    }

    boolean resumeScanning() throws InterruptedException, IOException, RuntimeException {
        boolean z;
        SurfaceTexture surfaceTextureOnExtraCallback;
        if (this.mSurfaceProvider == null) {
            return false;
        }
        if (this.mUseCamera2) {
            return resumeScanningCamera2();
        }
        if (this.mCamera == null) {
            prepareScanner();
            z = true;
        } else {
            z = false;
        }
        if (this.mUseCamera2) {
            return resumeScanningCamera2();
        }
        boolean z2 = this.useCamera;
        if (z2 && this.mCamera == null) {
            return false;
        }
        if (z2 && this.mPreviewBuffer == null) {
            int bitsPerPixel = ImageFormat.getBitsPerPixel(this.mCamera.getParameters().getPreviewFormat()) / 8;
            OcrConfig ocrConfig = this.mOcrConfig;
            int i = (((ocrConfig.cameraPreviewWidth * ocrConfig.cameraPreviewHeight) * bitsPerPixel) * 3) / 2;
            this.mPreviewBuffer = ByteBuffer.allocateDirect(i);
            this.nativeBuffer = ByteBuffer.allocateDirect(i);
        }
        if (this.useCamera && z) {
            this.mCamera.addCallbackBuffer(this.mPreviewBuffer.array());
        }
        this.mSurfaceProvider.onNavigationEvent(this);
        if (this.mSurfaceProvider.onNavigationEvent()) {
            this.isSurfaceValid = true;
        }
        if (this.useCamera && z) {
            this.mCamera.setPreviewCallbackWithBuffer(this);
        }
        if (this.isSurfaceValid && (surfaceTextureOnExtraCallback = this.mSurfaceProvider.onExtraCallback()) != null) {
            makePreviewGoTexture(surfaceTextureOnExtraCallback, z);
        }
        this.captureStart = System.currentTimeMillis();
        return true;
    }

    private boolean isCameraSupportAutoFocus(Camera.Parameters parameters, String str) {
        return parameters.getSupportedFocusModes().contains(str);
    }

    public void pauseScanning() throws InterruptedException, RuntimeException {
        setFlashOn(false);
        this.requestStop = true;
        Thread thread = this.nativeThread;
        this.nativeThread = null;
        if (thread != null && thread != Thread.currentThread()) {
            thread.interrupt();
            try {
                thread.join(1500L);
                thread.isAlive();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (!processingInProgress) {
            releaseDMZ();
        }
        releaseCamera();
    }

    public void endScanning() throws InterruptedException, RuntimeException {
        pauseScanning();
    }

    private boolean makePreviewGoTexture(SurfaceTexture surfaceTexture, boolean z) throws IOException {
        if (surfaceTexture == null) {
            return false;
        }
        this.mFirstPreviewFrame = true;
        this.mFrameNumber = 0;
        if (this.useCamera) {
            if (z) {
                try {
                    this.mCamera.setPreviewTexture(surfaceTexture);
                    processingInProgress = false;
                } catch (IOException unused) {
                    return false;
                }
            }
            try {
                if (this.nativeThread != null) {
                    this.nativeThread.isAlive();
                }
                Thread thread = this.nativeThread;
                if (thread == null || !thread.isAlive()) {
                    ByteBuffer byteBuffer = this.nativeBuffer;
                    if (byteBuffer != null) {
                        synchronized (byteBuffer) {
                            Arrays.fill(this.nativeBuffer.array(), (byte) 0);
                            this.nativeBuffer.clear();
                        }
                    }
                    this.requestStop = false;
                    Thread thread2 = new Thread(this.nativeDetectRunnable);
                    this.nativeThread = thread2;
                    thread2.start();
                }
                if (z) {
                    this.mCamera.startPreview();
                    this.mCamera.autoFocus(this);
                }
            } catch (RuntimeException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        onExtraCallback onextracallback;
        Surface surfaceIAuthTabCallback;
        synchronized (this) {
            if (this.mUseCamera2) {
                this.isSurfaceValid = true;
                deserializeSeverityReasonbugsnag_android_core_release deserializeseverityreasonbugsnag_android_core_release = this.mCam2;
                if (deserializeseverityreasonbugsnag_android_core_release != null && !deserializeseverityreasonbugsnag_android_core_release.onExtraCallbackWithResult() && (onextracallback = this.mSurfaceProvider) != null && (surfaceIAuthTabCallback = onextracallback.IAuthTabCallback()) != null) {
                    deserializeSeverityReasonbugsnag_android_core_release deserializeseverityreasonbugsnag_android_core_release2 = this.mCam2;
                    OcrConfig ocrConfig = this.mOcrConfig;
                    boolean zOnWarmupCompleted = deserializeseverityreasonbugsnag_android_core_release2.onWarmupCompleted(surfaceIAuthTabCallback, surfaceTexture, ocrConfig.cameraPreviewWidth, ocrConfig.cameraPreviewHeight, this.mCam2FrameCallback);
                    notifyActualCameraSize();
                    if (zOnWarmupCompleted) {
                        scheduleGreenCheck();
                    }
                }
                return;
            }
            if (this.mCamera != null || !this.useCamera) {
                this.isSurfaceValid = true;
                makePreviewGoTexture(surfaceTexture, true);
            } else {
                Log.wtf("fincube.ocr", "CardScanner.onSurfaceTextureAvailable - camera is null!");
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            if (this.mUseCamera2) {
                try {
                    this.requestStop = true;
                    Thread thread = this.nativeThread;
                    if (thread != null) {
                        thread.interrupt();
                    }
                    this.nativeThread = null;
                    deserializeSeverityReasonbugsnag_android_core_release deserializeseverityreasonbugsnag_android_core_release = this.mCam2;
                    if (deserializeseverityreasonbugsnag_android_core_release != null) {
                        deserializeseverityreasonbugsnag_android_core_release.onWarmupCompleted();
                    }
                } catch (Exception unused) {
                }
                this.isSurfaceValid = false;
                return true;
            }
            if (this.mCamera != null) {
                try {
                    this.requestStop = true;
                    Thread thread2 = this.nativeThread;
                    if (thread2 != null) {
                        thread2.interrupt();
                    }
                    this.nativeThread = null;
                    this.mCamera.stopPreview();
                } catch (Exception unused2) {
                }
            }
            this.isSurfaceValid = false;
            return true;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.mPreviewRevealed) {
            return;
        }
        this.mPreviewRevealed = true;
        onExtraCallback onextracallback = this.mSurfaceProvider;
        if (onextracallback != null) {
            onextracallback.onWarmupCompleted();
        }
    }

    private boolean resumeScanningCamera2() {
        if (this.mCam2 == null || this.mSurfaceProvider == null) {
            return false;
        }
        if (this.mPreviewBuffer == null) {
            int bitsPerPixel = ImageFormat.getBitsPerPixel(17) / 8;
            OcrConfig ocrConfig = this.mOcrConfig;
            int i = (((ocrConfig.cameraPreviewWidth * ocrConfig.cameraPreviewHeight) * bitsPerPixel) * 3) / 2;
            this.mPreviewBuffer = ByteBuffer.allocateDirect(i);
            this.nativeBuffer = ByteBuffer.allocateDirect(i);
        }
        this.mSurfaceProvider.onNavigationEvent(this);
        if (this.mSurfaceProvider.onNavigationEvent()) {
            this.isSurfaceValid = true;
        }
        Thread thread = this.nativeThread;
        if (thread == null || !thread.isAlive()) {
            ByteBuffer byteBuffer = this.nativeBuffer;
            if (byteBuffer != null) {
                synchronized (byteBuffer) {
                    Arrays.fill(this.nativeBuffer.array(), (byte) 0);
                    this.nativeBuffer.clear();
                }
            }
            this.requestStop = false;
            Thread thread2 = new Thread(this.nativeDetectRunnable);
            this.nativeThread = thread2;
            thread2.start();
        }
        if (this.mCam2.onExtraCallbackWithResult()) {
            this.captureStart = System.currentTimeMillis();
            return true;
        }
        if (!this.isSurfaceValid || !this.mSurfaceProvider.onNavigationEvent()) {
            return true;
        }
        Surface surfaceIAuthTabCallback = this.mSurfaceProvider.IAuthTabCallback();
        SurfaceTexture surfaceTextureOnExtraCallback = this.mSurfaceProvider.onExtraCallback();
        if (surfaceIAuthTabCallback == null || surfaceTextureOnExtraCallback == null) {
            return false;
        }
        deserializeSeverityReasonbugsnag_android_core_release deserializeseverityreasonbugsnag_android_core_release = this.mCam2;
        OcrConfig ocrConfig2 = this.mOcrConfig;
        if (!deserializeseverityreasonbugsnag_android_core_release.onWarmupCompleted(surfaceIAuthTabCallback, surfaceTextureOnExtraCallback, ocrConfig2.cameraPreviewWidth, ocrConfig2.cameraPreviewHeight, this.mCam2FrameCallback)) {
            return false;
        }
        notifyActualCameraSize();
        this.captureStart = System.currentTimeMillis();
        this.mFirstPreviewFrame = true;
        scheduleGreenCheck();
        return true;
    }

    private void notifyActualCameraSize() {
        deserializeSeverityReasonbugsnag_android_core_release deserializeseverityreasonbugsnag_android_core_release = this.mCam2;
        if (deserializeseverityreasonbugsnag_android_core_release == null || this.mActualSizeListener == null) {
            return;
        }
        int iIAuthTabCallback = deserializeseverityreasonbugsnag_android_core_release.IAuthTabCallback();
        int iOnNavigationEvent = this.mCam2.onNavigationEvent();
        if (iIAuthTabCallback > 0 && iOnNavigationEvent > 0) {
            this.mActualSizeListener.onWarmupCompleted(iIAuthTabCallback, iOnNavigationEvent);
        }
        updateCameraOrientation();
        int i = this.mOcrConfig.orientation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fallbackToCamera1(String str) {
        synchronized (this) {
            if (!this.mFellBackToCamera1 && this.mUseCamera2) {
                this.mFellBackToCamera1 = true;
                try {
                    this.mUseCamera2 = false;
                    releaseCamera2();
                    this.mCam2 = null;
                    resumeScanning();
                } catch (Throwable unused) {
                }
            }
        }
    }

    private void releaseCamera2() {
        synchronized (this) {
            cancelGreenCheck();
            deserializeSeverityReasonbugsnag_android_core_release deserializeseverityreasonbugsnag_android_core_release = this.mCam2;
            if (deserializeseverityreasonbugsnag_android_core_release != null) {
                try {
                    deserializeseverityreasonbugsnag_android_core_release.onWarmupCompleted();
                } catch (Exception unused) {
                }
            }
        }
    }

    private void scheduleGreenCheck() {
        cancelGreenCheck();
        Runnable runnable = new Runnable() { // from class: io.fincube.ocr.CardScanner.2
            @Override // java.lang.Runnable
            public void run() {
                CardScanner.this.runGreenCheck(false);
            }
        };
        this.mGreenCheck = runnable;
        this.mMainHandler.postDelayed(runnable, GREEN_CHECK_DELAY_MS);
    }

    private void cancelGreenCheck() {
        Runnable runnable = this.mGreenCheck;
        if (runnable != null) {
            this.mMainHandler.removeCallbacks(runnable);
            this.mGreenCheck = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runGreenCheck(boolean z) {
        onExtraCallback onextracallback;
        Bitmap bitmapOnWarmupCompleted;
        this.mGreenCheck = null;
        if (!this.mUseCamera2 || this.mFellBackToCamera1 || (onextracallback = this.mSurfaceProvider) == null || (bitmapOnWarmupCompleted = onextracallback.onWarmupCompleted(16, 16)) == null) {
            return;
        }
        try {
            if (isUniformGreen(bitmapOnWarmupCompleted, z)) {
                if (!z) {
                    Runnable runnable = new Runnable() { // from class: io.fincube.ocr.CardScanner.5
                        @Override // java.lang.Runnable
                        public void run() {
                            CardScanner.this.runGreenCheck(true);
                        }
                    };
                    this.mGreenCheck = runnable;
                    this.mMainHandler.postDelayed(runnable, GREEN_RECHECK_DELAY_MS);
                    return;
                }
                fallbackToCamera1("preview stream is blank (uniform green)");
            }
        } finally {
            bitmapOnWarmupCompleted.recycle();
        }
    }

    private static boolean isUniformGreen(Bitmap bitmap, boolean z) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            return false;
        }
        int i = width * height;
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        int i3 = 255;
        int i4 = 0;
        int i5 = 255;
        int i6 = 0;
        int i7 = 255;
        int i8 = 0;
        while (i2 < i) {
            int i9 = iArr[i2];
            int[] iArr2 = iArr;
            int i10 = i;
            int i11 = (i9 >> 16) & 255;
            long j4 = j;
            int i12 = (i9 >> 8) & 255;
            int i13 = i9 & 255;
            if (i11 < i5) {
                i5 = i11;
            }
            if (i11 > i4) {
                i4 = i11;
            }
            if (i12 < i7) {
                i7 = i12;
            }
            if (i12 > i6) {
                i6 = i12;
            }
            if (i13 < i3) {
                i3 = i13;
            }
            if (i13 > i8) {
                i8 = i13;
            }
            j2 += i12;
            j3 += i13;
            i2++;
            j = j4 + i11;
            i5 = i5;
            iArr = iArr2;
            i = i10;
            i4 = i4;
        }
        long j5 = j;
        long j6 = i;
        return Math.max(i4 - i5, Math.max(i6 - i7, i8 - i3)) <= 12 && ((int) (j2 / j6)) >= 80 && ((int) (j5 / j6)) <= 50 && ((int) (j3 / j6)) <= 50;
    }

    public int changeScannerType(OcrConfigSDK.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnExtraCallbackWithResult;
        synchronized (this) {
            synchronized (this.requestChangeScannerType) {
                this.requestChangeScannerType.onWarmupCompleted(onextracallbackwithresult.getValue());
                iOnExtraCallbackWithResult = this.requestChangeScannerType.onExtraCallbackWithResult();
            }
        }
        return iOnExtraCallbackWithResult;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        ByteBuffer byteBuffer;
        synchronized (this) {
            if (bArr == null) {
                return;
            }
            if (this.mCamera != null && (byteBuffer = this.mPreviewBuffer) != null) {
                byteBuffer.rewind();
                this.mCamera.addCallbackBuffer(this.mPreviewBuffer.array());
            }
            if (processingInProgress) {
                this.numFramesSkipped++;
                return;
            }
            if (this.mFirstPreviewFrame) {
                this.mLastPreviewTime = SystemClock.uptimeMillis();
                this.mFirstPreviewFrame = false;
                this.mListener.onWarmupCompleted();
            } else {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (jUptimeMillis - this.mLastPreviewTime < 3) {
                    return;
                } else {
                    this.mLastPreviewTime = jUptimeMillis;
                }
            }
            synchronized (this.nativeBuffer) {
                this.mPreviewBuffer.rewind();
                this.nativeBuffer.rewind();
                this.nativeBuffer.put(this.mPreviewBuffer);
                this.nativeBuffer.notify();
            }
        }
    }

    class onExtraCallbackWithResult {
        boolean onExtraCallbackWithResult = false;
        int onExtraCallback = 0;

        onExtraCallbackWithResult() {
        }

        void onWarmupCompleted(int i) {
            this.onExtraCallback = i;
            this.onExtraCallbackWithResult = true;
        }

        void onWarmupCompleted() {
            this.onExtraCallbackWithResult = false;
        }

        boolean onNavigationEvent() {
            return this.onExtraCallbackWithResult;
        }

        int onExtraCallbackWithResult() {
            return this.onExtraCallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCamera() {
        synchronized (this) {
            if (this.mUseCamera2) {
                releaseCamera2();
                return;
            }
            Camera camera = this.mCamera;
            this.mCamera = null;
            if (camera != null) {
                try {
                    camera.stopPreview();
                    camera.setPreviewDisplay(null);
                } catch (IOException unused) {
                }
                camera.setPreviewCallback(null);
                camera.release();
            }
        }
    }

    Rect getGuideFrame(int i, int i2, int i3) {
        float fMin;
        if (!processorSupported()) {
            return null;
        }
        if (i == 1) {
            float f = i2;
            OcrConfig ocrConfig = this.mOcrConfig;
            float fMin2 = Math.min(f / ocrConfig.cameraPreviewHeight, i3 / ocrConfig.cameraPreviewWidth);
            OcrConfig ocrConfig2 = this.mOcrConfig;
            return new Rect((int) (((ocrConfig2.cameraPreviewHeight - ocrConfig2.guide_y) - ocrConfig2.guide_h) * fMin2), (int) (this.mOcrConfig.guide_x * fMin2), (int) ((r8 + r0.guide_h) * fMin2), (int) ((r1 + r0.guide_w) * fMin2));
        }
        if (i != 0 && i != 2) {
            return null;
        }
        if (i2 > i3) {
            float f2 = i2;
            OcrConfig ocrConfig3 = this.mOcrConfig;
            fMin = Math.min(f2 / ocrConfig3.cameraPreviewWidth, i3 / ocrConfig3.cameraPreviewHeight);
        } else {
            float f3 = i2;
            OcrConfig ocrConfig4 = this.mOcrConfig;
            fMin = Math.min(f3 / ocrConfig4.cameraPreviewHeight, i3 / ocrConfig4.cameraPreviewWidth);
        }
        OcrConfig ocrConfig5 = this.mOcrConfig;
        return new Rect((int) (ocrConfig5.guide_x * fMin), (int) (ocrConfig5.guide_y * fMin), (int) ((r8 + ocrConfig5.guide_w) * fMin), (int) ((r1 + ocrConfig5.guide_h) * fMin));
    }

    Map<String, Object> getAnalytics() {
        HashMap map = new HashMap(11);
        map.put("num_frames_skipped", Integer.valueOf(this.numFramesSkipped));
        map.put("elapsed_time", Double.valueOf((System.currentTimeMillis() - this.captureStart) / GREEN_CHECK_DELAY_MS));
        map.put("num_manual_refocusings", Integer.valueOf(this.numManualRefocus));
        map.put("num_auto_triggered_refocusings", Integer.valueOf(this.numAutoRefocus));
        map.put("num_manual_torch_changes", Integer.valueOf(this.numManualTorchChange));
        return map;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z, Camera camera) {
        if (this.mCamera == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        if (isCameraSupportAutoFocus(parameters, "continuous-picture")) {
            parameters.setFocusMode("continuous-picture");
        }
        try {
            camera.setParameters(parameters);
        } catch (RuntimeException unused) {
        }
    }

    void toggleFlash() throws RuntimeException {
        setFlashOn(!isFlashOn());
    }

    void triggerAutoFocus(boolean z) throws RuntimeException {
        Camera camera;
        synchronized (this) {
            if (this.useCamera && (camera = this.mCamera) != null) {
                Camera.Parameters parameters = camera.getParameters();
                parameters.setFocusMode("auto");
                this.mCamera.setParameters(parameters);
                this.mCamera.autoFocus(this);
            }
        }
    }

    public boolean isFlashOn() {
        synchronized (this) {
            if (!this.useCamera) {
                return false;
            }
            return this.mCamera.getParameters().getFlashMode().equals("torch");
        }
    }

    public boolean setFlashOn(boolean z) throws RuntimeException {
        synchronized (this) {
            Camera camera = this.mCamera;
            if (camera == null) {
                return false;
            }
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFlashMode(z ? "torch" : "off");
            this.mCamera.setParameters(parameters);
            this.numManualTorchChange++;
            return true;
        }
    }

    private void setCameraDisplayOrientation(Camera camera) {
        camera.setDisplayOrientation(updateCameraOrientation());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int updateCameraOrientation() {
        int i;
        int i2;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(0, cameraInfo);
        Display defaultDisplay = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay();
        int i3 = this.mContext.getResources().getConfiguration().orientation;
        int rotation = defaultDisplay.getRotation();
        OcrConfig ocrConfig = this.mOcrConfig;
        if (ocrConfig.useCustomPreviewDegree) {
            i = ocrConfig.customPreviewDegrees;
        } else if (i3 == 1) {
            if (rotation != 0) {
                if (rotation != 1) {
                    i = rotation == 2 ? 180 : 270;
                }
                i = 90;
            }
            i = 0;
        } else {
            if (rotation != 0) {
                if (rotation != 1) {
                    if (rotation != 2) {
                        if (rotation != 3) {
                        }
                    }
                }
                i = 90;
            }
            i = 0;
        }
        if (cameraInfo.facing == 1) {
            i2 = (360 - ((cameraInfo.orientation + i) % 360)) % 360;
        } else {
            i2 = ((cameraInfo.orientation - i) + 360) % 360;
        }
        this.mReverseCamera = cameraInfo.orientation == 270;
        if (ocrConfig.cameraIdx == 1) {
            this.mReverseCamera = true;
        }
        if (rotation == 2) {
            this.mReverseCamera = true;
        }
        return i2;
    }

    public enum IAuthTabCallback {
        HORIZONTAL(0),
        VERTICAL(1);

        private final int value;

        IAuthTabCallback(int i) {
            this.value = i;
        }

        public int getInt() {
            return this.value;
        }
    }

    public int changeGuideRectCard(OcrConfigSDK ocrConfigSDK, float f, float f2, float f3, IAuthTabCallback iAuthTabCallback) {
        int i = ocrConfigSDK.cameraPreviewHeight;
        int i2 = (i * CREDIT_CARD_TARGET_WIDTH) / OcrConfigSDK.DEFAULT_PREVIEW_HEIGHT;
        int i3 = (i2 * CREDIT_CARD_TARGET_HEIGHT) / CREDIT_CARD_TARGET_WIDTH;
        int i4 = (i - i2) / 2;
        int i5 = (ocrConfigSDK.cameraPreviewWidth - i3) / 2;
        if (ocrConfigSDK.orientation % 2 == 1) {
            this.mOcrConfig.setGuideLine(i5, i4, i3, i2);
        } else {
            this.mOcrConfig.setGuideLine(i4, i5, i2, i3);
        }
        return changeGuideRect(f, f2, f3, iAuthTabCallback);
    }

    public int changeGuideRectPaper(OcrConfigSDK ocrConfigSDK, float f, float f2, float f3, IAuthTabCallback iAuthTabCallback) {
        int i = ocrConfigSDK.cameraPreviewWidth;
        int i2 = (int) (i * 0.62916f);
        int i3 = (int) (i2 * 0.71192f);
        int i4 = (i - i2) / 2;
        int i5 = (ocrConfigSDK.cameraPreviewHeight - i3) / 2;
        if (ocrConfigSDK.orientation % 2 == 1) {
            this.mOcrConfig.setGuideLine(i4, i5, i2, i3);
        } else {
            this.mOcrConfig.setGuideLine(i5, i4, i3, i2);
        }
        return changeGuideRect(f, f2, f3, iAuthTabCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int changeGuideRect(float f, float f2, float f3, IAuthTabCallback iAuthTabCallback) {
        OcrConfig ocrConfig = this.mOcrConfig;
        if (ocrConfig == null) {
            return -1;
        }
        if (ocrConfig.cameraPreviewHeight == 0 || ocrConfig.cameraPreviewWidth == 0) {
            return -2;
        }
        int i = ocrConfig.orientation;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                f2 = f;
                f = f2;
            } else if (i != 2) {
                if (i != 3) {
                    f = 0.5f;
                    f2 = 0.5f;
                }
            }
        }
        int iCeil = (int) Math.ceil(this.mOcrConfig.cameraPreviewWidth * 0.055f);
        int iCeil2 = (int) Math.ceil(this.mOcrConfig.cameraPreviewHeight * 0.055f);
        OcrConfig ocrConfig2 = this.mOcrConfig;
        int i3 = ocrConfig2.cameraPreviewWidth - iCeil;
        int i4 = ocrConfig2.cameraPreviewHeight - iCeil2;
        int iRound = Math.round(((int) ((f - 0.5f) * r6)) * f3);
        int iRound2 = Math.round(((int) ((f2 - 0.5f) * r5)) * f3);
        this.mOcrConfig.guide_w = Math.round(r2.guide_w * f3);
        this.mOcrConfig.guide_h = Math.round(r2.guide_h * f3);
        if (this.mOcrConfig.changeGuideRectOrientation != iAuthTabCallback.getInt()) {
            OcrConfig ocrConfig3 = this.mOcrConfig;
            int i5 = ocrConfig3.cameraPreviewHeight;
            int i6 = ocrConfig3.guide_w;
            int i7 = ocrConfig3.cameraPreviewWidth;
            int i8 = ocrConfig3.guide_h;
            ocrConfig3.setGuideLine((i7 - i8) / 2, (i5 - i6) / 2, i8, i6);
        } else {
            OcrConfig ocrConfig4 = this.mOcrConfig;
            int i9 = ocrConfig4.cameraPreviewWidth;
            int i10 = ocrConfig4.guide_w;
            int i11 = ocrConfig4.cameraPreviewHeight;
            int i12 = ocrConfig4.guide_h;
            ocrConfig4.setGuideLine((i9 - i10) / 2, (i11 - i12) / 2, i10, i12);
        }
        this.mOcrConfig.changeGuideRectOrientation = iAuthTabCallback.getInt();
        OcrConfig ocrConfig5 = this.mOcrConfig;
        int i13 = ocrConfig5.guide_x + iRound;
        int i14 = ocrConfig5.guide_y + iRound2;
        if (i13 >= iCeil) {
            i2 = 0;
            iCeil = i13;
        }
        if (i14 < iCeil2) {
            i2 += 2;
        } else {
            iCeil2 = i14;
        }
        int i15 = ocrConfig5.guide_w;
        if (iCeil + i15 > i3) {
            iCeil = i3 - i15;
            i2 += 4;
        }
        int i16 = ocrConfig5.guide_h;
        if (iCeil2 + i16 > i4) {
            iCeil2 = i4 - i16;
            i2 += 8;
        }
        ocrConfig5.guide_x = iCeil;
        ocrConfig5.guide_y = iCeil2;
        return i2;
    }

    private void setCameraBrightness(Camera camera, int i) throws RuntimeException {
        Camera.Parameters parameters = camera.getParameters();
        int exposureCompensation = parameters.getExposureCompensation() + i;
        if (exposureCompensation > parameters.getMaxExposureCompensation()) {
            exposureCompensation = parameters.getMinExposureCompensation();
        }
        parameters.setExposureCompensation(exposureCompensation);
        camera.setParameters(parameters);
    }

    public boolean hardwareSupported(OcrConfig ocrConfig) {
        return hardwareSupportCheck(ocrConfig);
    }

    private boolean hardwareSupportCheck(OcrConfig ocrConfig) {
        if (!processorSupported()) {
            return false;
        }
        try {
            Camera cameraOpenCamera = openCamera(ocrConfig);
            if (cameraOpenCamera == null) {
                return false;
            }
            List<Camera.Size> supportedPreviewSizes = cameraOpenCamera.getParameters().getSupportedPreviewSizes();
            List<Camera.Size> supportedPictureSizes = cameraOpenCamera.getParameters().getSupportedPictureSizes();
            cameraOpenCamera.release();
            int i = 10000;
            Camera.Size size = null;
            int i2 = 10000;
            for (Camera.Size size2 : supportedPreviewSizes) {
                int iAbs = Math.abs(size2.width - ocrConfig.cameraPreviewWidth);
                int iAbs2 = Math.abs(size2.height - ocrConfig.cameraPreviewHeight);
                if (size2.width * size2.height >= 307200 && (i > iAbs || (i == iAbs && i2 > iAbs2))) {
                    size = size2;
                    i = iAbs;
                    i2 = iAbs2;
                }
            }
            if (size == null) {
                Iterator<Camera.Size> it = supportedPreviewSizes.iterator();
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    if (it.hasNext()) {
                        Camera.Size next = it.next();
                        int i3 = next.width;
                        if (i3 != 1920 || next.height != 1080) {
                            if (i3 == 1280 && next.height == 720) {
                                z = true;
                            }
                            if (i3 == 640 && next.height == 480) {
                                z2 = true;
                            }
                        } else {
                            ocrConfig.cameraPreviewWidth = OcrConfigSDK.DEFAULT_PREVIEW_WIDTH;
                            ocrConfig.cameraPreviewHeight = OcrConfigSDK.DEFAULT_PREVIEW_HEIGHT;
                            break;
                        }
                    } else if (z) {
                        ocrConfig.cameraPreviewWidth = 1280;
                        ocrConfig.cameraPreviewHeight = 720;
                    } else {
                        if (!z2) {
                            return false;
                        }
                        ocrConfig.cameraPreviewWidth = 640;
                        ocrConfig.cameraPreviewHeight = 480;
                    }
                }
            } else {
                ocrConfig.cameraPreviewWidth = size.width;
                ocrConfig.cameraPreviewHeight = size.height;
            }
            int i4 = ocrConfig.cameraPreviewHeight;
            int i5 = (i4 * CREDIT_CARD_TARGET_WIDTH) / OcrConfigSDK.DEFAULT_PREVIEW_HEIGHT;
            int i6 = (i5 * CREDIT_CARD_TARGET_HEIGHT) / CREDIT_CARD_TARGET_WIDTH;
            if (ocrConfig.orientation == 1) {
                ocrConfig.setGuideLine((ocrConfig.cameraPreviewWidth - i6) / 2, (i4 - i5) / 2, i6, i5);
            } else {
                ocrConfig.setGuideLine((ocrConfig.cameraPreviewWidth - i5) / 2, (i4 - i6) / 2, i5, i6);
            }
            float f = ocrConfig.cameraPreviewWidth / ocrConfig.cameraPreviewHeight;
            Iterator<Camera.Size> it2 = supportedPictureSizes.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Camera.Size next2 = it2.next();
                int i7 = next2.width;
                int i8 = next2.height;
                if (f == i7 / i8) {
                    ocrConfig.cameraPictureWidth = i7;
                    ocrConfig.cameraPictureHeight = i8;
                    break;
                }
            }
            return true;
        } catch (RuntimeException e) {
            e.toString();
            throw new convertToEventImplbugsnag_android_core_release();
        }
    }

    private static Camera openCamera(OcrConfig ocrConfig) {
        int i = ocrConfig.cameraIdx == 0 ? 0 : 1;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        Camera cameraOpen = null;
        for (int i2 = 0; i2 < numberOfCameras; i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == i) {
                try {
                    cameraOpen = Camera.open(i2);
                    ocrConfig.cameraIdx = i2;
                    break;
                } catch (RuntimeException e) {
                    e.getLocalizedMessage();
                }
            }
        }
        return cameraOpen;
    }
}
