package com.tmoney.kscc.sslio.constants;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.g.e;
import com.tmoney.g.f;
import com.tmoney.g.i;
import java.lang.reflect.Method;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CodeConstants {
    public static String AUT_MNL_DVS_AUT = "A";
    public static String AUT_MNL_DVS_MNL = "M";
    public static String CARD_TYPE_CHECK = "2";
    public static String CARD_TYPE_CREDIT = "1";
    public static String CARD_TYPE_POINT = "3";
    public static String CHIP_CODE_FAIL = "96";
    public static String CHIP_CODE_SUCCESS = "00";
    public static String DEFAULT_CARD_NO = "0000000000000000";
    public static String GNDR_F = "F";
    public static String GNDR_M = "M";
    public static String LIST_REQ_TYP_LEAST_TOTAL = "2";
    public static String LIST_REQ_TYP_LEAST_TRAFFIC = "1";
    public static final String REPLCD_DISCOUNT_REGIST_OVER_COUNT = "DR01";
    public static String RSP_CD_SUCCESS = "0000";

    public enum AFLT_STUP_VAL_CD {
        LIVECHECK_CYCLE_PREPAID("001"),
        LIVECHECK_CYCLE_POSTPAID("002"),
        MILEAGE_CASHBACK_003("003"),
        MILEAGE_CASHBACK_004("004"),
        MILEAGE_CASHBACK_005("005"),
        GIFT_UTAM_10000_OVER("006"),
        OFFHOST_DYNAMIC_AID_LISTS("007"),
        REFUND_FREE_AMOUNT("008"),
        TPO_CODE("009"),
        OTA_CODE("010"),
        RECEIVE_YN("011"),
        FEE_PHONEBILL("012"),
        FEE_TRANSFER("013"),
        MKTP_TOKEN("016"),
        KT_APP_KEY("017"),
        ENCRYPT_KEY("018"),
        SAVEAPPLOG_INTERVAL("019"),
        OTC_OR_CARDNUM("023"),
        AFLT_SETUP_UPDATE_TIME("026"),
        MEMBERSHIP("020"),
        SETUP_CARD_INFO("028");

        private String a;

        AFLT_STUP_VAL_CD(String str) {
            this.a = str;
        }

        public final String getCode() {
            return this.a;
        }
    }

    public enum EPARTNER_CODE {
        NOT_USE("01", "01", "앱미이용"),
        MTMONEY("02", "02", "모바일티머니"),
        MTMONEY_GEAR("03", "03", "티머니기어"),
        SPAY("04", "04", "삼성페이티머니"),
        PAYCO("05", "05", "페이코티머니"),
        TPAY("06", "06", "티페이"),
        LGPAY("07", "07", "LG페이"),
        SSGPAY("08", "08", "SSGPAY"),
        SPAY_MINI("09", "04", "삼성페이미니"),
        CLIP("11", "11", "KT클립"),
        KTCLIP("12", "12", "KT클립"),
        NEW_TPAY("13", "13", "TPAY"),
        SK_TPAY("16", "16", "SKPAY"),
        SHINHAN_APPCARD("50", "50", "신한앱카드"),
        HYUNDAI_BLUECOIN("51", "51", "현대블루코인"),
        TMONET("80", "80", "티모넷"),
        CALL_CENTER("81", "81", "고객센터");

        private String a;
        private String b;
        private String c;

        EPARTNER_CODE(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String getCode() {
            return this.a;
        }

        public final String getName() {
            return this.c;
        }

        public final String getParentCode() {
            return this.b;
        }
    }

    public enum MEMBERSHIP_STATE_CD {
        ISSUE("11", "10", "01"),
        DELETE("13", "20", "02");

        private String a;
        private String b;
        private String c;

        MEMBERSHIP_STATE_CD(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String getCode() {
            return this.a;
        }

        public final String getCode2() {
            return this.c;
        }

        public final String getCodeMKTP() {
            return this.b;
        }
    }

    public enum USR_USE_LTN_CD {
        LOST("01"),
        LOGNTIME_REFUND_BALANCE("02"),
        USIM_POOR("03"),
        PHONE_CHANGE("04"),
        LOST_DISABLE("05"),
        LONGTIME_DISABLE("06"),
        POOR_USER("07"),
        SAFE_LOST("08"),
        SAFE_LOST_DISABLE("09"),
        POOR_USER_NO_REFUND("10"),
        JUST_MSS("98"),
        JUST_DPCG("99");

        private String a;

        USR_USE_LTN_CD(String str) {
            this.a = str;
        }

        public final String getCode() {
            return this.a;
        }
    }

    public static EMBL_SVC_TYP_CD getEMBL_SVC_TYP_CD(String str) {
        EMBL_SVC_TYP_CD embl_svc_typ_cd = EMBL_SVC_TYP_CD.PREPAID;
        return TextUtils.equals(str, embl_svc_typ_cd.getCode()) ? embl_svc_typ_cd : EMBL_SVC_TYP_CD.POSTPAID;
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'OTC' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class ENC_TGT_DVS_CD {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        public static final ENC_TGT_DVS_CD NFILTER;
        public static final ENC_TGT_DVS_CD OTC;
        public static final ENC_TGT_DVS_CD PAYCO;
        private static final /* synthetic */ ENC_TGT_DVS_CD[] b;
        private static long onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private String a;

        static {
            onExtraCallbackWithResult();
            Object[] objArr = new Object[1];
            c(new char[]{45300, 45253, 41798, 13096, 44166}, KeyEvent.normalizeMetaState(0) + 1, objArr);
            ENC_TGT_DVS_CD enc_tgt_dvs_cd = new ENC_TGT_DVS_CD("OTC", 0, ((String) objArr[0]).intern());
            OTC = enc_tgt_dvs_cd;
            Object[] objArr2 = new Object[1];
            c(new char[]{51905, 51955, 26233, 63916, 46065}, 1 - TextUtils.indexOf("", "", 0, 0), objArr2);
            ENC_TGT_DVS_CD enc_tgt_dvs_cd2 = new ENC_TGT_DVS_CD("NFILTER", 1, ((String) objArr2[0]).intern());
            NFILTER = enc_tgt_dvs_cd2;
            ENC_TGT_DVS_CD enc_tgt_dvs_cd3 = new ENC_TGT_DVS_CD("PAYCO", 2, "3");
            PAYCO = enc_tgt_dvs_cd3;
            b = new ENC_TGT_DVS_CD[]{enc_tgt_dvs_cd, enc_tgt_dvs_cd2, enc_tgt_dvs_cd3};
            int i = onExtraCallbackWithResult + 3;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 78 / 0;
            }
        }

        private ENC_TGT_DVS_CD(String str, int i, String str2) {
            this.a = str2;
        }

        public static ENC_TGT_DVS_CD valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            ENC_TGT_DVS_CD enc_tgt_dvs_cd = (ENC_TGT_DVS_CD) Enum.valueOf(ENC_TGT_DVS_CD.class, str);
            if (i3 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = onWarmupCompleted + 105;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return enc_tgt_dvs_cd;
            }
            throw null;
        }

        public static ENC_TGT_DVS_CD[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ENC_TGT_DVS_CD[] enc_tgt_dvs_cdArr = b;
            if (i3 != 0) {
                return (ENC_TGT_DVS_CD[]) enc_tgt_dvs_cdArr.clone();
            }
            throw null;
        }

        public final String getCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.a;
            int i4 = i3 + 111;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            throw null;
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i3 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 45812), 83 - TextUtils.lastIndexOf("", '0'), 21233 - (ViewConfiguration.getTouchSlop() >> 8), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 'C' - AndroidCharacter.getMirror('0'), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i4 = $11 + 37;
                    $10 = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 2 % 5;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
            int i6 = $10 + 1;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            objArr[0] = str;
        }

        static void onExtraCallbackWithResult() {
            onExtraCallback = -6394175348377163507L;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'CREATE' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class E_SAVEAPPLOG {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final E_SAVEAPPLOG CLOSE;
        public static final E_SAVEAPPLOG CREATE;
        public static final E_SAVEAPPLOG DESTORY;
        public static final E_SAVEAPPLOG ETC;
        private static int IAuthTabCallback = 0;
        public static final E_SAVEAPPLOG ISCREATE;
        public static final E_SAVEAPPLOG OPEN;
        public static final E_SAVEAPPLOG TRANSMIT;
        private static final /* synthetic */ E_SAVEAPPLOG[] c;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static long onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private String a;
        private String b;

        static {
            onWarmupCompleted();
            Object[] objArr = new Object[1];
            d(new char[]{49088}, 25771 - KeyEvent.keyCodeFromString(""), objArr);
            E_SAVEAPPLOG e_saveapplog = new E_SAVEAPPLOG("CREATE", 0, ((String) objArr[0]).intern());
            CREATE = e_saveapplog;
            Object[] objArr2 = new Object[1];
            d(new char[]{49091}, ExpandableListView.getPackedPositionGroup(0L) + 17203, objArr2);
            E_SAVEAPPLOG e_saveapplog2 = new E_SAVEAPPLOG("ISCREATE", 1, ((String) objArr2[0]).intern());
            ISCREATE = e_saveapplog2;
            E_SAVEAPPLOG e_saveapplog3 = new E_SAVEAPPLOG("OPEN", 2, "3");
            OPEN = e_saveapplog3;
            E_SAVEAPPLOG e_saveapplog4 = new E_SAVEAPPLOG("CLOSE", 3, "4");
            CLOSE = e_saveapplog4;
            E_SAVEAPPLOG e_saveapplog5 = new E_SAVEAPPLOG("TRANSMIT", 4, "5");
            TRANSMIT = e_saveapplog5;
            E_SAVEAPPLOG e_saveapplog6 = new E_SAVEAPPLOG("DESTORY", 5, "6");
            DESTORY = e_saveapplog6;
            E_SAVEAPPLOG e_saveapplog7 = new E_SAVEAPPLOG("ETC", 6, "9");
            ETC = e_saveapplog7;
            c = new E_SAVEAPPLOG[]{e_saveapplog, e_saveapplog2, e_saveapplog3, e_saveapplog4, e_saveapplog5, e_saveapplog6, e_saveapplog7};
            int i = onExtraCallbackWithResult + 61;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        private E_SAVEAPPLOG(String str, int i, String str2) {
            this.a = str2;
        }

        public static E_SAVEAPPLOG valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            E_SAVEAPPLOG e_saveapplog = (E_SAVEAPPLOG) Enum.valueOf(E_SAVEAPPLOG.class, str);
            int i4 = IAuthTabCallback + 121;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return e_saveapplog;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static E_SAVEAPPLOG[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            E_SAVEAPPLOG[] e_saveapplogArr = (E_SAVEAPPLOG[]) c.clone();
            int i4 = onWarmupCompleted + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return e_saveapplogArr;
            }
            throw null;
        }

        public final String getCode() {
            String str;
            int i = 2 % 2;
            String str2 = this.b;
            if (str2 == null) {
                str = "X";
            } else {
                if (str2.length() <= 0) {
                    int i2 = IAuthTabCallback + 47;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                } else if (this.b.equals(i.TAG)) {
                    str = "S";
                } else if (this.b.equals(e.TAG)) {
                    str = "K";
                } else if (this.b.equals(f.TAG)) {
                    str = "L";
                }
                str = "X";
            }
            String str3 = str + this.a;
            int i4 = IAuthTabCallback + 17;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return str3;
        }

        public final String getUsimClassName() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 47;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.b;
            int i5 = i2 + 97;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 76 / 0;
            }
            return str;
        }

        public final void setUsimClassName(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.b = str;
            if (i3 != 0) {
                throw null;
            }
        }

        private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $10 + 75;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), View.combineMeasuredStates(0, 0) + 24, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() & (onNavigationEvent + 5407414049857832247L);
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 59 - (Process.myTid() >> 22), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), KeyEvent.keyCodeFromString("") + 24, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (5407414049857832247L ^ onNavigationEvent);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 59 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 6383 - View.getDefaultSize(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                int i6 = $10 + 25;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 59 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
        }

        static void onWarmupCompleted() {
            onNavigationEvent = -2898004999541933370L;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ISSUE_FAILED' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class MEMBERSHIP_CARD_STATE_CD {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final MEMBERSHIP_CARD_STATE_CD DELETE_FAILED;
        public static final MEMBERSHIP_CARD_STATE_CD DELETE_SUCCESS;
        public static final MEMBERSHIP_CARD_STATE_CD DELETING;
        private static int IAuthTabCallback = 1;
        public static final MEMBERSHIP_CARD_STATE_CD ISSUE_FAILED;
        public static final MEMBERSHIP_CARD_STATE_CD ISSUE_SUCCESS;
        public static final MEMBERSHIP_CARD_STATE_CD ISSUING;
        private static final /* synthetic */ MEMBERSHIP_CARD_STATE_CD[] b;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static long onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private String a;

        static {
            IAuthTabCallback();
            MEMBERSHIP_CARD_STATE_CD membership_card_state_cd = new MEMBERSHIP_CARD_STATE_CD("ISSUING", 0, "01");
            ISSUING = membership_card_state_cd;
            MEMBERSHIP_CARD_STATE_CD membership_card_state_cd2 = new MEMBERSHIP_CARD_STATE_CD("ISSUE_SUCCESS", 1, "02");
            ISSUE_SUCCESS = membership_card_state_cd2;
            MEMBERSHIP_CARD_STATE_CD membership_card_state_cd3 = new MEMBERSHIP_CARD_STATE_CD("DELETING", 2, "11");
            DELETING = membership_card_state_cd3;
            MEMBERSHIP_CARD_STATE_CD membership_card_state_cd4 = new MEMBERSHIP_CARD_STATE_CD("DELETE_SUCCESS", 3, "12");
            DELETE_SUCCESS = membership_card_state_cd4;
            MEMBERSHIP_CARD_STATE_CD membership_card_state_cd5 = new MEMBERSHIP_CARD_STATE_CD("DELETE_FAILED", 4, "19");
            DELETE_FAILED = membership_card_state_cd5;
            Object[] objArr = new Object[1];
            c(new char[]{1758, 36745, 5214, 40229, 9190, 43081, 12575, 51149, 19638, 54638, 23504, 57500}, 35148 - TextUtils.lastIndexOf("", '0', 0), objArr);
            MEMBERSHIP_CARD_STATE_CD membership_card_state_cd6 = new MEMBERSHIP_CARD_STATE_CD(((String) objArr[0]).intern(), 5, "09");
            ISSUE_FAILED = membership_card_state_cd6;
            b = new MEMBERSHIP_CARD_STATE_CD[]{membership_card_state_cd, membership_card_state_cd2, membership_card_state_cd3, membership_card_state_cd4, membership_card_state_cd5, membership_card_state_cd6};
            int i = onExtraCallback + 3;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 7 / 0;
            }
        }

        private MEMBERSHIP_CARD_STATE_CD(String str, int i, String str2) {
            this.a = str2;
        }

        public static MEMBERSHIP_CARD_STATE_CD valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            MEMBERSHIP_CARD_STATE_CD membership_card_state_cd = (MEMBERSHIP_CARD_STATE_CD) Enum.valueOf(MEMBERSHIP_CARD_STATE_CD.class, str);
            if (i3 != 0) {
                return membership_card_state_cd;
            }
            throw null;
        }

        public static MEMBERSHIP_CARD_STATE_CD[] values() {
            MEMBERSHIP_CARD_STATE_CD[] membership_card_state_cdArr;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                membership_card_state_cdArr = (MEMBERSHIP_CARD_STATE_CD[]) b.clone();
                int i3 = 61 / 0;
            } else {
                membership_card_state_cdArr = (MEMBERSHIP_CARD_STATE_CD[]) b.clone();
            }
            int i4 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 35 / 0;
            }
            return membership_card_state_cdArr;
        }

        public final String getCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 41;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.a;
            int i5 = i2 + 73;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $10 + 117;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24, TextUtils.getTrimmedLength("") + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() % (onNavigationEvent * 5407414049857832247L);
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 59 - Color.blue(0), MotionEvent.axisFromString("") + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.red(0) + 24, View.getDefaultSize(0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (5407414049857832247L ^ onNavigationEvent);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 59 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i6 = $11 + 71;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 59 - (ViewConfiguration.getJumpTapTimeout() >> 16), 6383 - View.MeasureSpec.getMode(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    throw null;
                }
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr7 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), TextUtils.indexOf("", "") + 59, View.combineMeasuredStates(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
                int i7 = $11 + 7;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            }
            objArr[0] = new String(cArr2);
        }

        static void IAuthTabCallback() {
            onNavigationEvent = 5189365049584550816L;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'PREPAID' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class EMBL_SVC_TYP_CD {
        private static long IAuthTabCallback;
        public static final EMBL_SVC_TYP_CD POSTPAID;
        public static final EMBL_SVC_TYP_CD PREPAID;
        private static final /* synthetic */ EMBL_SVC_TYP_CD[] c;
        private static int onExtraCallback;
        private static char[] onNavigationEvent;
        private String a;
        private String b;
        private static final byte[] $$a = {112, 44, -46, -27};
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallbackWithResult = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i, byte b, short s) {
            int i2;
            int i3 = (b * 2) + 97;
            int i4 = 4 - (i * 2);
            byte[] bArr = $$a;
            int i5 = s * 2;
            byte[] bArr2 = new byte[1 - i5];
            int i6 = 0 - i5;
            if (bArr == null) {
                int i7 = i4;
                int i8 = i6;
                i2 = 0;
                int i9 = i7 + 1;
                i3 = i4 + i8;
                i4 = i9;
                bArr2[i2] = (byte) i3;
                if (i2 == i6) {
                    return new String(bArr2, 0);
                }
                i2++;
                i8 = bArr[i4];
                int i10 = i3;
                i7 = i4;
                i4 = i10;
                int i92 = i7 + 1;
                i3 = i4 + i8;
                i4 = i92;
                bArr2[i2] = (byte) i3;
                if (i2 == i6) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i3;
                if (i2 == i6) {
                }
            }
        }

        static {
            onExtraCallback = 1;
            IAuthTabCallback();
            Object[] objArr = new Object[1];
            d((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, 1 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
            EMBL_SVC_TYP_CD embl_svc_typ_cd = new EMBL_SVC_TYP_CD("PREPAID", 0, ((String) objArr[0]).intern(), "선불");
            PREPAID = embl_svc_typ_cd;
            Object[] objArr2 = new Object[1];
            d(1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1 - (Process.myTid() >> 22), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
            EMBL_SVC_TYP_CD embl_svc_typ_cd2 = new EMBL_SVC_TYP_CD("POSTPAID", 1, ((String) objArr2[0]).intern(), "후불");
            POSTPAID = embl_svc_typ_cd2;
            c = new EMBL_SVC_TYP_CD[]{embl_svc_typ_cd, embl_svc_typ_cd2};
            int i = onExtraCallbackWithResult + 5;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 90 / 0;
            }
        }

        private EMBL_SVC_TYP_CD(String str, int i, String str2, String str3) {
            this.a = str2;
            this.b = str3;
        }

        public static EMBL_SVC_TYP_CD valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            EMBL_SVC_TYP_CD embl_svc_typ_cd = (EMBL_SVC_TYP_CD) Enum.valueOf(EMBL_SVC_TYP_CD.class, str);
            if (i3 != 0) {
                return embl_svc_typ_cd;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EMBL_SVC_TYP_CD[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            EMBL_SVC_TYP_CD[] embl_svc_typ_cdArr = (EMBL_SVC_TYP_CD[]) c.clone();
            int i4 = onWarmupCompleted + 37;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 54 / 0;
            }
            return embl_svc_typ_cdArr;
        }

        public final String getCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 79;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.a;
            int i5 = i2 + 99;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final String getValue() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            String str = this.b;
            int i5 = i3 + 91;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        private static void d(int i, int i2, char c2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = $10 + 85;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 16 - ((byte) KeyEvent.getModifierMetaStateMask()), 10972 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallback), Integer.valueOf(c2)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getEdgeSlop() >> 16)), 31 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        char cMyPid = (char) (49123 - (Process.myPid() >> 22));
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 44;
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1494;
                        byte b = (byte) $$b;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyPid, packedPositionType, iResolveSizeAndState, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i7 = $10 + 97;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i9 = $11 + 93;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        char defaultSize = (char) (View.getDefaultSize(0, 0) + 49123);
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 44;
                        int defaultSize2 = View.getDefaultSize(0, 0) + 1494;
                        byte b3 = (byte) $$b;
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(defaultSize, iIndexOf, defaultSize2, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    int i10 = 29 / 0;
                } else {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback5 == null) {
                        char c3 = (char) (49124 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 44;
                        int i11 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1494;
                        byte b5 = (byte) $$b;
                        byte b6 = b5;
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, absoluteGravity, i11, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr);
        }

        static void IAuthTabCallback() {
            onNavigationEvent = new char[]{60901, 60902};
            IAuthTabCallback = 1397768738123330220L;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UNKNOWN' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class EERROR_CODE {
        public static final EERROR_CODE DATA;
        public static final EERROR_CODE NETWORK;
        public static final EERROR_CODE PARSE;
        public static final EERROR_CODE SERVER;
        public static final EERROR_CODE TIMEOUT;
        public static final EERROR_CODE UNKNOWN;
        private static final /* synthetic */ EERROR_CODE[] c;
        private static int onExtraCallback;
        private static int onExtraCallbackWithResult;
        private static char onNavigationEvent;
        private static long onWarmupCompleted;
        private String a;
        private String b;
        private static final byte[] $$a = {7, 75, -84, -52};
        private static final int $$b = 177;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int IAuthTabCallback = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i, int i2, int i3) {
            int i4;
            int i5 = 3 - (i * 3);
            int i6 = 110 - i2;
            int i7 = 1 - (i3 * 4);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i7];
            if (bArr == null) {
                int i8 = i6;
                i6 = i7;
                i4 = 0;
                i6 += i8;
                i5++;
                bArr2[i4] = (byte) i6;
                i4++;
                if (i4 == i7) {
                    return new String(bArr2, 0);
                }
                i8 = bArr[i5];
                i6 += i8;
                i5++;
                bArr2[i4] = (byte) i6;
                i4++;
                if (i4 == i7) {
                }
            } else {
                i4 = 0;
                i5++;
                bArr2[i4] = (byte) i6;
                i4++;
                if (i4 == i7) {
                }
            }
        }

        static {
            onExtraCallback = 0;
            onWarmupCompleted();
            Object[] objArr = new Object[1];
            d((char) (ViewConfiguration.getTapTimeout() >> 16), (-1444664876) + (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{46165, 44750, 12435, 7262, 2235, 44423, 14026}, new char[]{0, 0, 0, 0}, new char[]{54351, 58409, 27561, 18969}, objArr);
            EERROR_CODE eerror_code = new EERROR_CODE(((String) objArr[0]).intern(), 0, "-1", "UNKNOWN ERROR");
            UNKNOWN = eerror_code;
            EERROR_CODE eerror_code2 = new EERROR_CODE("TIMEOUT", 1, "-2", "TIMEOUT ERROR");
            TIMEOUT = eerror_code2;
            EERROR_CODE eerror_code3 = new EERROR_CODE("SERVER", 2, "-3", "SERVER ERROR");
            SERVER = eerror_code3;
            EERROR_CODE eerror_code4 = new EERROR_CODE("NETWORK", 3, "-4", "NETWORK ERROR");
            NETWORK = eerror_code4;
            EERROR_CODE eerror_code5 = new EERROR_CODE("PARSE", 4, "-5", "PARSE ERROR");
            PARSE = eerror_code5;
            EERROR_CODE eerror_code6 = new EERROR_CODE("DATA", 5, "-6", "DATA ERROR");
            DATA = eerror_code6;
            c = new EERROR_CODE[]{eerror_code, eerror_code2, eerror_code3, eerror_code4, eerror_code5, eerror_code6};
            int i = IAuthTabCallback + 33;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        private EERROR_CODE(String str, int i, String str2, String str3) {
            this.a = str2;
            this.b = str3;
        }

        public static EERROR_CODE valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 55;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            EERROR_CODE eerror_code = (EERROR_CODE) Enum.valueOf(EERROR_CODE.class, str);
            int i4 = IAuthTabCallbackDefault + 85;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return eerror_code;
        }

        public static EERROR_CODE[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 77;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            EERROR_CODE[] eerror_codeArr = (EERROR_CODE[]) c.clone();
            int i4 = IAuthTabCallbackStub + 9;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return eerror_codeArr;
        }

        public final EERROR_CODE get() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 13;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 35;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final String getCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 21;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            String str = this.a;
            if (i3 != 0) {
                int i4 = 26 / 0;
            }
            return str;
        }

        public final String getMsg() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 67;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            String str = this.b;
            int i5 = i3 + 113;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final void set(String str, String str2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 57;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            this.a = str;
            this.b = str2;
            int i5 = i3 + 117;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        }

        public final void setMsg(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 17;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            this.b = str;
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void d(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            int i5 = 0;
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c2);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            int i6 = $11 + 111;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i8 = $10 + 89;
                $11 = i8 % 128;
                int i9 = i8 % i3;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 44;
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1451;
                        byte b = (byte) i5;
                        byte b2 = b;
                        String str$$c = $$c(b, b2, b2);
                        Class[] clsArr = new Class[1];
                        clsArr[i5] = Object.class;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollBarFadeDuration, iIndexOf, tapTimeout, 228868077, false, str$$c, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            char modifierMetaStateMask = (char) (49122 - ((byte) KeyEvent.getModifierMetaStateMask()));
                            int i10 = 45 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                            int iRed = 1494 - Color.red(i5);
                            byte b3 = (byte) i5;
                            byte b4 = (byte) (b3 + 1);
                            String str$$c2 = $$c(b3, b4, (byte) (b4 - 1));
                            Class[] clsArr2 = new Class[1];
                            clsArr2[i5] = Object.class;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(modifierMetaStateMask, i10, iRed, 1533236389, false, str$$c2, clsArr2);
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        int i11 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                        try {
                            Object[] objArr4 = new Object[3];
                            objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                            objArr4[1] = Integer.valueOf(i11);
                            objArr4[i5] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                            if (objOnExtraCallback3 == null) {
                                char c3 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23972);
                                int iResolveSize = View.resolveSize(i5, i5) + 50;
                                int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 22940;
                                Class[] clsArr3 = new Class[3];
                                clsArr3[i5] = Object.class;
                                clsArr3[1] = Integer.TYPE;
                                clsArr3[2] = Integer.TYPE;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, iResolveSize, modifierMetaStateMask2, 1872485556, false, "k", clsArr3);
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            int i12 = cArr4[iIntValue2] * 32718;
                            try {
                                Object[] objArr5 = new Object[2];
                                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                                objArr5[i5] = Integer.valueOf(i12);
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                                if (objOnExtraCallback4 == null) {
                                    char cMyPid = (char) ((Process.myPid() >> 22) + 45848);
                                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 29;
                                    int iRed2 = Color.red(i5) + 12577;
                                    i2 = 2;
                                    Class[] clsArr4 = new Class[2];
                                    clsArr4[i5] = Integer.TYPE;
                                    clsArr4[1] = Integer.TYPE;
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyPid, scrollBarSize, iRed2, 1401536470, false, "l", clsArr4);
                                } else {
                                    i2 = 2;
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                                i3 = i2;
                                i5 = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            objArr[0] = new String(cArr6);
        }

        static void onWarmupCompleted() {
            onWarmupCompleted = 7798559133331975163L;
            onExtraCallbackWithResult = -1776194565;
            onNavigationEvent = (char) 17311;
        }
    }
}
