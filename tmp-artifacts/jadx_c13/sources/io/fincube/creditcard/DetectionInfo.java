package io.fincube.creditcard;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class DetectionInfo implements Serializable {
    static final int MAX_NUM_SIZE = 32;
    private static final int REC_DATA_GIRO_CUSTOMER_NO = 10;
    private static final int REC_DATA_GIRO_NUMBER = 9;
    private static final int REC_DATA_ID_ALIENSERIAL = 8;
    private static final int REC_DATA_ID_BIRTH = 5;
    private static final int REC_DATA_ID_COUNTRY = 18;
    private static final int REC_DATA_ID_DL_NUMBER = 2;
    private static final int REC_DATA_ID_DL_SERIAL = 3;
    private static final int REC_DATA_ID_ISSUEDATE = 20;
    private static final int REC_DATA_ID_NAME = 1;
    private static final int REC_DATA_ID_NAME_KOR = 4;
    private static final int REC_DATA_ID_PASSPORT_MRZ1 = 21;
    private static final int REC_DATA_ID_PASSPORT_MRZ2 = 22;
    private static final int REC_DATA_ID_PASSPORT_NO = 7;
    private static final int REC_DATA_ID_PASSPORT_VIZ_BIRTH = 28;
    private static final int REC_DATA_ID_PASSPORT_VIZ_COUNTRY = 24;
    private static final int REC_DATA_ID_PASSPORT_VIZ_EXPIRY = 31;
    private static final int REC_DATA_ID_PASSPORT_VIZ_GIVENNAME = 27;
    private static final int REC_DATA_ID_PASSPORT_VIZ_NATIONALITY = 30;
    private static final int REC_DATA_ID_PASSPORT_VIZ_PASSNO = 25;
    private static final int REC_DATA_ID_PASSPORT_VIZ_PERSONAL_NO = 34;
    private static final int REC_DATA_ID_PASSPORT_VIZ_SEX = 29;
    private static final int REC_DATA_ID_PASSPORT_VIZ_SURNAME = 26;
    private static final int REC_DATA_ID_PASSPORT_VIZ_TYPE = 23;
    private static final int REC_DATA_ID_PERSONAL_NO = 6;
    public String alienType;
    public String amount;
    public String amount2;
    public String amount2C;
    public String amountC;
    public String barcodeString;
    public byte[] barcode_str;
    public int barcode_type;
    public boolean bottomEdge;
    public Bitmap cardImage;
    public String cardholderName;
    public String code;
    public float colorPoint;
    public float cornerBLX;
    public float cornerBLY;
    public float cornerBRX;
    public float cornerBRY;
    public float cornerTLX;
    public float cornerTLY;
    public float cornerTRX;
    public float cornerTRY;
    public int creditCardType;
    public StringBuffer crn;
    public String designType;
    public boolean detectedIDNumber;
    public boolean detectedIssuingDate;
    public boolean detectedLicenseNumber;
    public boolean detectedName;
    public boolean detectedRegion;
    public boolean detectedSerial;
    public String dueDate;
    public String ePaymentNumber;
    public long end_t;
    public String engineInfo;
    public onExtraCallbackWithResult errorCode;
    public int expiry_month;
    public int expiry_year;
    public double eyeScore;
    public double faceScore;
    public double fd_confidence;
    public float focusScore;
    public Bitmap frameImage;
    public ArrayList<Bitmap> frameList;
    public Bitmap fullFrameImage;
    public StringBuffer giro;
    public int giro_type;
    public boolean hasSpotLight;
    public String[] idAlienConfirmation;
    public String[] idAlienExpiryDate;
    public String[] idAlienPermissionDate;
    public StringBuffer idAlienSerial;
    public String idAptitudeDateEnd;
    public String idAptitudeDateStart;
    public StringBuffer idBirth;
    public String idDesignType;
    public String idExpiry;
    public String idGivenName;
    public StringBuffer idIssueDate;
    public StringBuffer idLicenseNumber;
    public StringBuffer idLicenseNumberMasking;
    ArrayList<StringBuffer> idLicenseNumberToken;
    public StringBuffer idLicenseSerial;
    public String idLicenseType;
    public StringBuffer idMRZ1;
    public StringBuffer idMRZ2;
    public StringBuffer idName;
    public StringBuffer idNameKor;
    public String idNation;
    public StringBuffer idNumber;
    public StringBuffer idNumberMasking;
    public String idOverSeasResident;
    public StringBuffer idPassportNo;
    public StringBuffer idPassportNoMasking;
    public String idPassportType;
    public StringBuffer idPersonalNo;
    public String idRegion;
    public String idSex;
    public String idSurName;
    public String idTruth;
    public int idType;
    public StringBuffer idVIZBirth;
    public StringBuffer idVIZCountryCode;
    public StringBuffer idVIZExpiry;
    public StringBuffer idVIZGivenName;
    public StringBuffer idVIZNationality;
    public StringBuffer idVIZPassNo;
    public StringBuffer idVIZPersonalNo;
    public StringBuffer idVIZSex;
    public StringBuffer idVIZSurName;
    public StringBuffer idVIZType;
    public String idValid;
    public String idValidJumin;
    public String idVisaType;
    public boolean isColor;
    public String isMobileID;
    public boolean issueDateSpotLight;
    public boolean juminSpotLight;
    public boolean leftEdge;
    public boolean licenseNumberSpotLight;
    public String lowerCode;
    public Bitmap markedCardImage;
    public Bitmap markedFrameImage;
    public Rect mask_rect_id_number;
    public Rect mask_rect_license_number;
    public boolean nameSpotLight;
    public Bitmap photoImage;
    public Bitmap photoImage_rect400;
    public boolean photoSpotLight;
    public int prediction_length;
    public float recogNumbConf;
    public float recogNumbMinConf;
    public Rect rect_id_issue_date;
    public Rect rect_id_overseas_residents;
    public boolean rightEdge;
    public long scanTime;
    public float specularRatio;
    public long start_t;
    public boolean topEdge;
    public Bitmap unRecognizedCard;
    public boolean updated;
    public String upperCode;
    public int cardScannerType = -1;
    public int[] mask_rect_id_number_array = new int[4];
    public int[] mask_rect_license_number_array = new int[4];
    public int[] rect_id_issue_date_array = new int[4];
    public int[] rect_id_overseas_residents_array = new int[4];
    public boolean verticalCard = false;
    public boolean complete = false;
    public int[] prediction = new int[32];
    public float[] numberPos = new float[128];
    public float[] expiryPos = new float[4];
    public int[] spaceIndices = new int[32];

    public enum onExtraCallbackWithResult {
        NO_ERROR(0, "SCAN Complete"),
        UNKOWN(-1, "Unkown error"),
        TIME_OUT(-2, "Time out occured");

        private final String enumKey;
        private final int enumNmber;

        onExtraCallbackWithResult(int i, String str) {
            this.enumNmber = i;
            this.enumKey = str;
        }

        public int getValue() {
            return this.enumNmber;
        }

        public String getErrorString() {
            return this.enumKey;
        }
    }

    private void clearPrediction() {
        Arrays.fill(this.prediction, 0);
        this.expiry_month = -1;
        this.expiry_year = -1;
    }

    public static void clearPrivacyData(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return;
        }
        int length = stringBuffer.length();
        for (int i = 0; i < length; i++) {
            stringBuffer.setCharAt(i, ' ');
        }
        stringBuffer.delete(0, length);
    }

    public String getIdLicenseTypeByPriority() {
        String str = this.idLicenseType;
        if (str != null && str.length() != 0) {
            String[] strArr = {"1종대형", "1종보통", "2종보통", "특수", "2종소형", "원동기자전거"};
            int[] iArr = new int[6];
            String[] strArrSplit = this.idLicenseType.replace(" ", _UrlKt.FRAGMENT_ENCODE_SET).split(",");
            if (strArrSplit.length <= 1) {
                return this.idLicenseType;
            }
            for (String str2 : strArrSplit) {
                int i = 0;
                while (true) {
                    if (i >= 6) {
                        break;
                    }
                    if (str2.equals(strArr[i])) {
                        iArr[i] = 100;
                        break;
                    }
                    i++;
                }
            }
            for (int i2 = 0; i2 < 6; i2++) {
                if (iArr[i2] == 100) {
                    return strArr[i2];
                }
            }
        }
        return null;
    }

    public ArrayList<StringBuffer> getIDLicenseNumberByToken() {
        this.idLicenseNumberToken.clear();
        StringBuffer stringBuffer = this.idLicenseNumber;
        if (stringBuffer == null || stringBuffer.length() == 0) {
            return null;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.idLicenseNumber.length(); i2++) {
            if (this.idLicenseNumber.charAt(i2) == '-') {
                if (i2 - i > 0) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    while (i < i2) {
                        stringBuffer2.append(this.idLicenseNumber.charAt(i));
                        i++;
                    }
                    this.idLicenseNumberToken.add(stringBuffer2);
                }
                i = i2 + 1;
            }
        }
        int length = this.idLicenseNumber.length();
        if (length - i > 0) {
            StringBuffer stringBuffer3 = new StringBuffer();
            while (i < length) {
                stringBuffer3.append(this.idLicenseNumber.charAt(i));
                i++;
            }
            this.idLicenseNumberToken.add(stringBuffer3);
        }
        return this.idLicenseNumberToken;
    }

    public void clearAllPrivacyData() {
        clearPrediction();
        clearPrivacyData(this.idName);
        clearPrivacyData(this.idLicenseNumber);
        clearPrivacyData(this.idLicenseNumberMasking);
        clearPrivacyData(this.idLicenseSerial);
        clearPrivacyData(this.idNameKor);
        clearPrivacyData(this.idBirth);
        clearPrivacyData(this.idPersonalNo);
        clearPrivacyData(this.idPassportNo);
        clearPrivacyData(this.idPassportNoMasking);
        clearPrivacyData(this.idAlienSerial);
        clearPrivacyData(this.giro);
        clearPrivacyData(this.crn);
        clearPrivacyData(this.idIssueDate);
        clearPrivacyData(this.idNumber);
        clearPrivacyData(this.idNumberMasking);
        clearPrivacyData(this.idMRZ1);
        clearPrivacyData(this.idMRZ2);
        clearPrivacyData(this.idVIZType);
        clearPrivacyData(this.idVIZCountryCode);
        clearPrivacyData(this.idVIZPassNo);
        clearPrivacyData(this.idVIZSurName);
        clearPrivacyData(this.idVIZGivenName);
        clearPrivacyData(this.idVIZBirth);
        clearPrivacyData(this.idVIZSex);
        clearPrivacyData(this.idVIZNationality);
        clearPrivacyData(this.idVIZExpiry);
        clearPrivacyData(this.idVIZPersonalNo);
        for (int i = 0; i < this.idLicenseNumberToken.size(); i++) {
            clearPrivacyData(this.idLicenseNumberToken.get(i));
        }
        this.idLicenseNumberToken.clear();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void setStringBuffer(int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int length = (bArr.length + 1) / 2;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 << 1;
            cArr[i2] = (char) (((bArr[i3 + 1] & 255) << 8) | (bArr[i3] & 255));
        }
        if (i != 34) {
            switch (i) {
                case 1:
                    clearPrivacyData(this.idName);
                    StringBuffer stringBuffer = new StringBuffer();
                    this.idName = stringBuffer;
                    stringBuffer.append(cArr);
                    break;
                case 2:
                    clearPrivacyData(this.idLicenseNumber);
                    clearPrivacyData(this.idLicenseNumberMasking);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    this.idLicenseNumber = stringBuffer2;
                    stringBuffer2.append(cArr);
                    this.idLicenseNumberMasking = new StringBuffer();
                    for (int i4 = 0; i4 < length; i4++) {
                        if (i4 >= length - 9 && i4 < length - 3) {
                            this.idLicenseNumberMasking.append('*');
                        } else {
                            this.idLicenseNumberMasking.append(cArr[i4]);
                        }
                    }
                    break;
                case 3:
                    clearPrivacyData(this.idLicenseSerial);
                    StringBuffer stringBuffer3 = new StringBuffer();
                    this.idLicenseSerial = stringBuffer3;
                    stringBuffer3.append(cArr);
                    break;
                case 4:
                    clearPrivacyData(this.idNameKor);
                    StringBuffer stringBuffer4 = new StringBuffer();
                    this.idNameKor = stringBuffer4;
                    stringBuffer4.append(cArr);
                    break;
                case 5:
                    clearPrivacyData(this.idBirth);
                    StringBuffer stringBuffer5 = new StringBuffer();
                    this.idBirth = stringBuffer5;
                    stringBuffer5.append(cArr);
                    break;
                case 6:
                    clearPrivacyData(this.idPersonalNo);
                    StringBuffer stringBuffer6 = new StringBuffer();
                    this.idPersonalNo = stringBuffer6;
                    stringBuffer6.append(cArr);
                    break;
                case 7:
                    clearPrivacyData(this.idPassportNo);
                    StringBuffer stringBuffer7 = new StringBuffer();
                    this.idPassportNo = stringBuffer7;
                    stringBuffer7.append(cArr);
                    this.idPassportNoMasking = new StringBuffer();
                    for (int i5 = 0; i5 < length; i5++) {
                        if (i5 >= length - 3 && i5 < length) {
                            this.idPassportNoMasking.append('*');
                        } else {
                            this.idPassportNoMasking.append(cArr[i5]);
                        }
                    }
                    break;
                case 8:
                    clearPrivacyData(this.idAlienSerial);
                    StringBuffer stringBuffer8 = new StringBuffer();
                    this.idAlienSerial = stringBuffer8;
                    stringBuffer8.append(cArr);
                    break;
                case 9:
                    clearPrivacyData(this.giro);
                    StringBuffer stringBuffer9 = new StringBuffer();
                    this.giro = stringBuffer9;
                    stringBuffer9.append(cArr);
                    break;
                case 10:
                    clearPrivacyData(this.crn);
                    StringBuffer stringBuffer10 = new StringBuffer();
                    this.crn = stringBuffer10;
                    stringBuffer10.append(cArr);
                    break;
                default:
                    switch (i) {
                        case 20:
                            clearPrivacyData(this.idIssueDate);
                            StringBuffer stringBuffer11 = new StringBuffer();
                            this.idIssueDate = stringBuffer11;
                            stringBuffer11.append(cArr);
                            clearPrivacyData(this.idVIZType);
                            StringBuffer stringBuffer12 = new StringBuffer();
                            this.idVIZType = stringBuffer12;
                            stringBuffer12.append(cArr);
                            break;
                        case 21:
                            clearPrivacyData(this.idMRZ1);
                            StringBuffer stringBuffer13 = new StringBuffer();
                            this.idMRZ1 = stringBuffer13;
                            stringBuffer13.append(cArr);
                            break;
                        case 22:
                            clearPrivacyData(this.idMRZ2);
                            StringBuffer stringBuffer14 = new StringBuffer();
                            this.idMRZ2 = stringBuffer14;
                            stringBuffer14.append(cArr);
                            break;
                        case 23:
                            clearPrivacyData(this.idVIZType);
                            StringBuffer stringBuffer122 = new StringBuffer();
                            this.idVIZType = stringBuffer122;
                            stringBuffer122.append(cArr);
                            break;
                        case 24:
                            clearPrivacyData(this.idVIZCountryCode);
                            StringBuffer stringBuffer15 = new StringBuffer();
                            this.idVIZCountryCode = stringBuffer15;
                            stringBuffer15.append(cArr);
                            break;
                        case 25:
                            clearPrivacyData(this.idVIZPassNo);
                            StringBuffer stringBuffer16 = new StringBuffer();
                            this.idVIZPassNo = stringBuffer16;
                            stringBuffer16.append(cArr);
                            break;
                        case 26:
                            clearPrivacyData(this.idVIZSurName);
                            StringBuffer stringBuffer17 = new StringBuffer();
                            this.idVIZSurName = stringBuffer17;
                            stringBuffer17.append(cArr);
                            break;
                        case 27:
                            clearPrivacyData(this.idVIZGivenName);
                            StringBuffer stringBuffer18 = new StringBuffer();
                            this.idVIZGivenName = stringBuffer18;
                            stringBuffer18.append(cArr);
                            break;
                        case 28:
                            clearPrivacyData(this.idVIZBirth);
                            StringBuffer stringBuffer19 = new StringBuffer();
                            this.idVIZBirth = stringBuffer19;
                            stringBuffer19.append(cArr);
                            break;
                        case 29:
                            clearPrivacyData(this.idVIZSex);
                            StringBuffer stringBuffer20 = new StringBuffer();
                            this.idVIZSex = stringBuffer20;
                            stringBuffer20.append(cArr);
                            break;
                        case 30:
                            clearPrivacyData(this.idVIZNationality);
                            StringBuffer stringBuffer21 = new StringBuffer();
                            this.idVIZNationality = stringBuffer21;
                            stringBuffer21.append(cArr);
                            break;
                        case 31:
                            clearPrivacyData(this.idVIZExpiry);
                            StringBuffer stringBuffer22 = new StringBuffer();
                            this.idVIZExpiry = stringBuffer22;
                            stringBuffer22.append(cArr);
                            break;
                    }
            }
        } else {
            clearPrivacyData(this.idVIZPersonalNo);
            StringBuffer stringBuffer23 = new StringBuffer();
            this.idVIZPersonalNo = stringBuffer23;
            stringBuffer23.append(cArr);
        }
        Arrays.fill(cArr, ' ');
        Arrays.fill(bArr, (byte) 0);
    }

    public DetectionInfo() {
        for (int i = 0; i < 32; i++) {
            this.prediction[i] = -1;
            this.spaceIndices[i] = 0;
        }
        this.expiry_month = -1;
        this.expiry_year = -1;
        this.cardholderName = new String();
        this.creditCardType = 0;
        this.isColor = true;
        this.faceScore = 0.0d;
        this.eyeScore = 0.0d;
        this.specularRatio = 0.0f;
        this.fd_confidence = -1.0d;
        this.errorCode = onExtraCallbackWithResult.NO_ERROR;
        this.idLicenseNumberToken = new ArrayList<>();
    }

    public boolean detected() {
        return this.topEdge && this.bottomEdge && this.rightEdge && this.leftEdge;
    }

    public boolean predicted() {
        return this.complete;
    }

    public StringBuffer getCardNumber() {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 0;
        for (int i3 = 0; i3 < this.prediction_length && (i = this.prediction[i3]) >= 0 && i < 10; i3++) {
            stringBuffer.append(String.valueOf(i));
            if (i3 == this.spaceIndices[i2]) {
                stringBuffer.append(' ');
                i2++;
            }
        }
        return stringBuffer;
    }

    public StringBuffer getIDNumberMasking() {
        getIDNumber();
        return this.idNumberMasking;
    }

    public StringBuffer getIDNumber() {
        StringBuffer stringBuffer = this.idNumber;
        if (stringBuffer != null) {
            clearPrivacyData(stringBuffer);
            clearPrivacyData(this.idNumberMasking);
        }
        this.idNumber = new StringBuffer();
        this.idNumberMasking = new StringBuffer();
        for (int i = 0; i < this.prediction_length; i++) {
            this.idNumber.append(String.valueOf(this.prediction[i]));
            if (i < 7) {
                this.idNumberMasking.append(String.valueOf(this.prediction[i]));
            } else {
                this.idNumberMasking.append("*");
            }
            if (i == 5) {
                this.idNumber.append("-");
                this.idNumberMasking.append("-");
            }
        }
        return this.idNumber;
    }

    public int numVisibleEdges() {
        return (this.topEdge ? 1 : 0) + (this.bottomEdge ? 1 : 0) + (this.leftEdge ? 1 : 0) + (this.rightEdge ? 1 : 0);
    }
}
