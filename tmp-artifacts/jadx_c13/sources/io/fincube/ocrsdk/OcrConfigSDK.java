package io.fincube.ocrsdk;

import io.fincube.creditcard.DetectionInfo;
import java.nio.ByteBuffer;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class OcrConfigSDK {
    public static final int DEFAULT_PREVIEW_HEIGHT = 1080;
    public static final int DEFAULT_PREVIEW_WIDTH = 1920;
    public static final int ERR_CODE_ALLOC_FAILED = -100;
    public static final int ERR_CODE_EXPIRED = -1;
    public static final int ERR_CODE_FAILED_TO_LOAD_DATA = -3;
    public static final int ERR_CODE_INVALID_PACKAGE = -2;
    public static final int ERR_CODE_NONE = 0;
    public static final int ERR_CODE_TIME_OUT = -200;
    public static final int IDSCAN_DEFAULT_MODE = 0;
    public static final int IDSCAN_SINGLE_TAKE_AUTO_MODE = 2;
    public static final int IDSCAN_SINGLE_TAKE_MODE = 1;
    private static final boolean saveFrameForError = false;
    private static final boolean svaeFrameForDebug = false;
    public String AssetsPath;
    public String FDModelName;
    public boolean autoMode;
    public int cameraPictureHeight;
    public int cameraPictureWidth;
    public int changeGuideRectOrientation;
    public DetectionInfo dInfo;
    public ByteBuffer frameBuffer;
    public long handle;
    public int idScannerMode;
    public boolean reverseCamera;
    public boolean scanIssueDate;
    public boolean scanLicenseNumber;
    public boolean scanLicenseSerial;
    public boolean scanLicenseType;
    public boolean scanPassportVIZ;
    public boolean scanRegion;
    public boolean scanTruth;
    public String faceDetectionDataPath = _UrlKt.FRAGMENT_ENCODE_SET;
    public String eyeDetectionDataPath = _UrlKt.FRAGMENT_ENCODE_SET;
    public String licenseKey = _UrlKt.FRAGMENT_ENCODE_SET;
    public String licenseKeyFile = _UrlKt.FRAGMENT_ENCODE_SET;
    public String licenseKeyBuffer = _UrlKt.FRAGMENT_ENCODE_SET;
    public boolean manualMode = false;
    public int minTryCount = 2;
    public int scannerType = 0;
    public boolean scanExpiry = true;
    public boolean scanName = true;
    public boolean validateNumber = true;
    public boolean validateExpiry = false;
    public int cameraPreviewWidth = DEFAULT_PREVIEW_WIDTH;
    public int cameraPreviewHeight = DEFAULT_PREVIEW_HEIGHT;
    public int guide_x = 658;
    public int guide_y = 60;
    public int guide_w = 604;
    public int guide_h = 960;
    public int orientation = 1;
    public int errorCode = 0;
    public boolean tryColorTest = true;
    public boolean detectFace = true;
    public boolean detectEye = true;
    public boolean timeOut = false;
    public long timeOutIntervalSec = 0;
    public boolean useMultiThread = true;
    public boolean fullScreen = false;
    public boolean updateDetectedInfo = false;
    public float fd_th = 0.5f;
    public float fd_th_alien = 0.5f;
    public float fd_th_passport = 0.5f;
    public boolean maskingAddress = false;
    public float recogNumbMinConf_th = 0.5f;
    public float recogNumbConf_th = 0.7f;
    public int checkSpotLight = 0;

    public enum onExtraCallbackWithResult {
        CREDITCARD(0, "CREDITCARD"),
        IDCARD_AUTO(1, "ID-AUTO"),
        ID_NATIONAL(2, "ID_KOR"),
        ID_DRIVELICENSE(3, "ID_DRV"),
        ALIEN_REGISTRATION(4, "ID_ALIEN"),
        PASSPORT(5, "ID_PASSPORT"),
        GIRO(6, "GIRO"),
        CAPTURE_PAPER(7, "CAPTURE_PAPER"),
        BARCODEREADER(8, "BARCODEREADER"),
        ALIEN_BACK_REGISTRATION(11, "ID_ALIEN_BACK");

        private final int enumNmber;
        private final String jsonKey;

        onExtraCallbackWithResult(int i, String str) {
            this.enumNmber = i;
            this.jsonKey = str;
        }

        public int getValue() {
            return this.enumNmber;
        }

        public String getStringValue() {
            return this.jsonKey;
        }
    }
}
