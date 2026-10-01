package com.tmoney.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.Gson;
import com.tmoney.Tmoney;
import com.tmoney.TmoneyConstants;
import com.tmoney.dto.MembershipItemDto;
import com.tmoney.dto.PointResult;
import com.tmoney.dto.PointResultData;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.response.MBR0003ResponseDTO;
import com.tmoney.utils.AppInfoHelper;
import com.tmoney.utils.CryptoHelper;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class TmoneyData extends a {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String TAG = "TmoneyData";
    private static TmoneyData aD = null;
    private static String aE = null;
    private static String aF = null;
    private static String aG = null;
    private static String aH = null;
    private static String aI = null;
    private static String aJ = null;
    private static String aK = null;
    private static String aL = null;
    private static String aM = null;
    private static String aN = null;
    private static String aO = null;
    private static String aP = null;
    private static String aQ = null;
    private static String aR = null;
    private static String aS = null;
    private static int asBinder = 1;
    private static int onWarmupCompleted;
    private final String A;
    private final String B;
    private final String C;
    private final String D;
    private final String E;
    private final String F;
    private final String G;
    private final String H;
    private final String I;
    private final String J;
    private final String K;
    private final String L;
    private final String M;
    private final String N;
    private final String O;
    private final String P;
    private final String Q;
    private final String R;
    private final String S;
    private final String T;
    private final String U;
    private final String V;
    private final String W;
    private final String X;
    private final String Y;
    private final String Z;
    private final String aA;
    private final String aB;
    private final String aC;
    private final String aa;
    private final String ab;
    private final String ac;
    private final String ad;
    private final String ae;
    private final String af;
    private final String ag;
    private final String ah;
    private final String ai;
    private final String aj;
    private final String ak;
    private final String al;
    private final String am;
    private final String an;
    private final String ao;
    private final String ap;
    private final String aq;
    private final String ar;
    private final String as;
    private final String at;
    private final String au;
    private final String av;
    private final String aw;
    private final String ax;
    private final String ay;
    private final String az;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;

    /* renamed from: o, reason: collision with root package name */
    private final String f10o;
    private final String p;
    private final String q;
    private final String r;
    private final String s;
    private final String t;
    private final String u;
    private final String v;
    private final String w;
    private final String x;
    private final String y;
    private final String z;
    private static char[] onExtraCallbackWithResult = {32611, 32610, 32609};
    private static int IAuthTabCallback = -1184333997;
    private static boolean onExtraCallback = true;
    private static boolean onNavigationEvent = true;

    private TmoneyData(Context context) {
        super(context);
        this.c = "Dracn";
        this.d = "TmoneyUserCode";
        this.e = "TmoneyPlatform";
        this.f = "TmoneyUICC";
        this.g = "TmoneyUserId";
        this.h = "TmoneyCI";
        this.i = "TmoneyPayment";
        this.j = "TmoneyPartnerJoin";
        this.k = "TmoneyAfltCD";
        this.l = "TmoneyPpyDpyDvsCd";
        this.m = "TmoneyPymMnsGrpCd";
        this.n = "TmoneyCrcmCd";
        this.f10o = "TmoneyCrdtChecDvsCd";
        this.p = "TmoneyAutoBaseAmount";
        this.q = "TmoneyAutoLoadAmount";
        this.r = "TmoneyUrUseLtnCd";
        this.s = "TmoneyPymStupYn";
        this.t = "TmoneylmtModTgtYn";
        this.u = "Resun";
        this.v = "TmoneyJoinGrade";
        this.w = "TmoneyCount";
        this.x = "TmoneyOneDayLimitRemainCount";
        this.y = "TmoneyTmoneyYn";
        this.z = "TmoneyUserSex";
        this.A = "TmoneyUserAge";
        this.B = "TmoneyCreditCheckType";
        this.C = "TmoneySamePartner";
        this.D = "TmoneyLastBalance";
        this.E = "TmoneyServerType";
        this.F = "SdkDebugType";
        this.G = "Rebmunp";
        this.H = "TmoneyIssueVersion";
        this.I = "TmoneyIssueLifeCycle";
        this.J = "TmoneyIssueAlias";
        this.K = "Sidracn";
        this.L = "TmoneyIssueUserCode";
        this.M = "geretad";
        this.N = "TmoneyCardListAll";
        this.O = "PartnerAppName";
        this.P = "PartnerAppPackage";
        this.Q = "PartnerAppIntro";
        this.R = "PartnerAppLoad";
        this.S = "PartnerAppWithdraw";
        this.T = "PARTNER_CODE";
        this.U = "PARTNER_KEY";
        this.V = "SDK_APP_KEY";
        this.W = "SDK_SK_STID";
        this.X = "SDK_KT_UFIN_KEY";
        this.Y = "SDK_LG_UICC_ID_KEY";
        this.Z = "SDK_LG_CLIENT_ID";
        this.aa = "PREF_STR_LG_COMMONAI_KEY";
        this.ab = "USE_BLUETOOTH";
        this.ac = "MemberManageNumber";
        this.ad = "MemberId";
        this.ae = "PointCumPoint";
        this.af = "MemberPoint";
        this.ag = "PointUsePoint";
        this.ah = "PointRmnPoint";
        this.ai = "PointExpiPoint";
        this.aj = "PointSchdPoint";
        this.ak = "TPO_PURSE";
        this.al = "TPO_TRANS";
        this.am = "TPO_TIME";
        this.an = "TmoneySetupInfo";
        this.ao = "TmoneyLiveCheckTime";
        this.ap = "TmoneySetupInfoTime";
        this.aq = "APP_LOG";
        this.ar = "Tmoney_2issue_from_enableCheck";
        this.as = "Tmoney_adid";
        this.at = "TmoneySendAdid";
        this.au = "TmoneyUserId";
        this.av = "SAVE_CARD_INFO";
        this.aw = "KEY";
        this.ax = "KT_APP_KEY";
        this.ay = "MKTP_TOKEN";
        this.az = "AFLTMBRSDATAV";
        this.aA = "VER";
        this.aB = "TmoneyPartnerList";
        this.aC = "TmoneyOffHostSentUnset";
        this.a = context;
        this.b = this.a.getSharedPreferences(com.tmoney.d.a.getInstance().getPrefName(), 0);
        setTmoney2IssueFromEnableChek(false);
    }

    public static TmoneyData getInstance() {
        TmoneyData tmoneyData;
        synchronized (TmoneyData.class) {
            tmoneyData = aD;
            if (tmoneyData == null) {
                throw new IllegalStateException("TmoneyData is not initialized, call initializeInstance(..) method first.");
            }
        }
        return tmoneyData;
    }

    public static TmoneyData getInstance(Context context) {
        TmoneyData tmoneyData;
        synchronized (TmoneyData.class) {
            if (aD == null) {
                synchronized (TmoneyData.class) {
                    aD = new TmoneyData(context);
                }
            }
            tmoneyData = aD;
        }
        return tmoneyData;
    }

    @Override // com.tmoney.preference.a
    public void clear() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        LogHelper.d(TAG, "TmoneyData.clear()");
        super.clear();
        Object obj = null;
        aD = null;
        aE = null;
        aF = null;
        aI = null;
        aJ = null;
        aK = null;
        aL = null;
        aM = null;
        aN = null;
        aO = null;
        aP = null;
        aQ = null;
        aR = null;
        aS = null;
        int i4 = asBinder + 123;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public String getAdvertisingId() {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return getString("Tmoney_adid");
        }
        getString("Tmoney_adid");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getAfltCd() {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String string = getString("TmoneyAfltCD");
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        return string;
    }

    public String getAfltMbrsDataV() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String string = getString("AFLTMBRSDATAV");
        int i4 = onWarmupCompleted + 77;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public ArrayList<String> getApltPckgNm() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ArrayList<String> list = getList("TmoneyPartnerList");
        int i4 = onWarmupCompleted + 57;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getAppKey() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = aM;
        if (str == null || TextUtils.isEmpty(str)) {
            aM = CryptoHelper.decode(getString("SDK_APP_KEY"));
            int i3 = onWarmupCompleted + 23;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }
        return aM;
    }

    public String getAppVersion() {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String strSubstring = AppInfoHelper.getAppVersion(this.a).substring(0, 3);
        int i4 = onWarmupCompleted + 45;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return strSubstring;
    }

    public String getAutoLoadAmount() throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = asBinder + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            String string = getString("TmoneyAutoLoadAmount");
            int i3 = 91 / 0;
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        } else {
            String string2 = getString("TmoneyAutoLoadAmount");
            if (!TextUtils.isEmpty(string2)) {
                return string2;
            }
        }
        int i4 = asBinder + 121;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            Object[] objArr = new Object[1];
            aT(null, null, new byte[]{-127}, 16226 % (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            aT(null, null, new byte[]{-127}, 128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getCIPreference() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (aH != null) {
            int i5 = i2 + 7;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            if (!(!TextUtils.isEmpty(r2))) {
                aH = CryptoHelper.decode(getString("TmoneyCI"));
            }
        }
        return aH;
    }

    public String getCardNumber() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        aE = CryptoHelper.decode(getString("Dracn"));
        if (!(!TextUtils.isEmpty(r1))) {
            aE = "0000000000000000";
            int i4 = asBinder + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        return aE;
    }

    public int getCount() {
        int i = 2 % 2;
        int i2 = this.b.getInt("TmoneyCount", -1);
        LogHelper.d(TAG, "getCount:" + i2);
        int i3 = asBinder + 89;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return i2;
    }

    public String getCrcmCd() {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String string = getString("TmoneyCrcmCd");
        int i4 = onWarmupCompleted + 43;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public String getCrdtChecDvsCd() {
        String string;
        int i = 2 % 2;
        int i2 = asBinder + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            string = getString("TmoneyCrdtChecDvsCd");
            int i3 = 90 / 0;
        } else {
            string = getString("TmoneyCrdtChecDvsCd");
        }
        int i4 = onWarmupCompleted + 27;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public String getCreditCardAll() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String string = getString("TmoneyCardListAll");
        int i4 = asBinder + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public boolean getIsPartnerJoin() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!getString("TmoneyPartnerJoin").equals("Y")) {
            return false;
        }
        int i4 = onWarmupCompleted + 47;
        int i5 = i4 % 128;
        asBinder = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 117;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public boolean getIsPayment() {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (!getString("TmoneyPayment").equals("Y")) {
            return false;
        }
        int i4 = onWarmupCompleted + 63;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public String getIssueDataAlias() {
        int i = 2 % 2;
        String string = getString("TmoneyIssueAlias");
        LogHelper.d(TAG, "getIssueDataAlias[" + string + "]");
        int i2 = asBinder + 7;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getIssueDataCardNo() {
        int i = 2 % 2;
        if (aS == null || !(!TextUtils.isEmpty(r1))) {
            String strDecode = CryptoHelper.decode(getString("Sidracn"));
            aS = strDecode;
            if (strDecode.length() == 0) {
                int i2 = asBinder + 21;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                aS = "0000000000000000";
            }
        } else {
            int i4 = onWarmupCompleted + 81;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            if ("0000000000000000".equals(aS)) {
            }
        }
        LogHelper.d(TAG, "getIssueDataCardNo[" + aS + "]");
        return aS;
    }

    public String getIssueDataLifeCycle() {
        int i = 2 % 2;
        String string = getString("TmoneyIssueLifeCycle");
        LogHelper.d(TAG, "getIssueDataLifeCycle[" + string + "]");
        int i2 = onWarmupCompleted + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public int getIssueDataVersion() {
        int i = 2 % 2;
        int i2 = getInt("TmoneyIssueVersion");
        LogHelper.d(TAG, "getIssueDataVersion[" + i2 + "]");
        int i3 = onWarmupCompleted + 15;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        if (android.text.TextUtils.equals(r9.getUsrUseLtnCd(), "06") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        if (android.text.TextUtils.equals(r9.getUsrUseLtnCd(), "06") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        r9 = com.tmoney.preference.TmoneyData.onWarmupCompleted + 17;
        com.tmoney.preference.TmoneyData.asBinder = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
    
        return "X2";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getJoinGradeFromMBR0003(MBR0003ResponseDTO mBR0003ResponseDTO) {
        int i = 2 % 2;
        MBR0003ResponseDTO.Response response = mBR0003ResponseDTO.getResponse();
        String ppyDpyDvsCd = response.getPpyDpyDvsCd();
        CodeConstants.EMBL_SVC_TYP_CD embl_svc_typ_cd = CodeConstants.EMBL_SVC_TYP_CD.PREPAID;
        if (TextUtils.equals(ppyDpyDvsCd, embl_svc_typ_cd.getCode()) && TextUtils.equals(response.getUsrUseLtnCd(), "04")) {
            return "XX";
        }
        String ppyDpyDvsCd2 = response.getPpyDpyDvsCd();
        CodeConstants.EMBL_SVC_TYP_CD embl_svc_typ_cd2 = CodeConstants.EMBL_SVC_TYP_CD.POSTPAID;
        if (TextUtils.equals(ppyDpyDvsCd2, embl_svc_typ_cd2.getCode()) && TextUtils.equals(response.getUsrUseLtnCd(), "04") && TextUtils.equals(response.getPymStupYn(), "Y")) {
            return "MR";
        }
        if (TextUtils.equals(response.getPpyDpyDvsCd(), embl_svc_typ_cd2.getCode()) && TextUtils.equals(response.getUsrUseLtnCd(), "04") && TextUtils.equals(response.getPymStupYn(), "N")) {
            return "MC";
        }
        if (TextUtils.equals(response.getPpyDpyDvsCd(), embl_svc_typ_cd2.getCode())) {
            int i2 = onWarmupCompleted + 83;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 39 / 0;
            }
        }
        if (TextUtils.equals(response.getPpyDpyDvsCd(), embl_svc_typ_cd2.getCode()) && TextUtils.equals(response.getUsrUseLtnCd(), "02")) {
            int i4 = asBinder + 37;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return "F2";
            }
            throw null;
        }
        if (TextUtils.equals(response.getUsrUseLtnCd(), "05")) {
            return "X1";
        }
        if (TextUtils.equals(response.getPpyDpyDvsCd(), embl_svc_typ_cd2.getCode())) {
            int i5 = asBinder + 39;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 65 / 0;
                if (TextUtils.equals(response.getUsrUseLtnCd(), "01")) {
                    return "F5";
                }
            } else if (TextUtils.equals(response.getUsrUseLtnCd(), "01")) {
                return "F5";
            }
        }
        if (TextUtils.equals(response.getPpyDpyDvsCd(), embl_svc_typ_cd2.getCode()) && TextUtils.equals(response.getPymStupYn(), "Y")) {
            return "B2";
        }
        if (TextUtils.equals(response.getPpyDpyDvsCd(), embl_svc_typ_cd2.getCode()) && TextUtils.equals(response.getPymStupYn(), "N")) {
            int i7 = onWarmupCompleted + 23;
            asBinder = i7 % 128;
            if (i7 % 2 != 0) {
                return "B1";
            }
            throw null;
        }
        if (TextUtils.equals(response.getPpyDpyDvsCd(), embl_svc_typ_cd.getCode())) {
            int i8 = asBinder + 39;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            if (TextUtils.equals(response.getAtcgYn(), "Y")) {
                int i10 = onWarmupCompleted + 7;
                asBinder = i10 % 128;
                int i11 = i10 % 2;
                return "A2";
            }
        }
        TextUtils.equals(response.getPpyDpyDvsCd(), embl_svc_typ_cd.getCode());
        return "A1";
    }

    public String getKey() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String string = getString("KEY");
        int i4 = asBinder + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getKtAppKey() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getString("KT_APP_KEY");
            obj.hashCode();
            throw null;
        }
        String string = getString("KT_APP_KEY");
        int i3 = asBinder + 75;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getKtUfinKey() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = aO;
        if (str != null) {
            int i5 = i3 + 59;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            boolean zIsEmpty = TextUtils.isEmpty(str);
            if (i6 != 0) {
                int i7 = 77 / 0;
                if (!(!zIsEmpty)) {
                    aO = CryptoHelper.decode(getString("SDK_KT_UFIN_KEY"));
                }
            } else if (zIsEmpty) {
            }
        }
        return aO;
    }

    public int getLastBalance() {
        int i = 2 % 2;
        if (!isNotUseUsimPartner()) {
            return getInt("TmoneyLastBalance");
        }
        int i2 = onWarmupCompleted + 49;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 91;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public String getLgClientId() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (aQ == null || !(!TextUtils.isEmpty(r1))) {
            aQ = CryptoHelper.decode(getString("SDK_LG_CLIENT_ID"));
            int i3 = asBinder + 115;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        return aQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getLgUiccIDKey() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 49;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = aP;
        if (str != null) {
            int i4 = i2 + 101;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            if (TextUtils.isEmpty(str)) {
                aP = CryptoHelper.decode(getString("SDK_LG_UICC_ID_KEY"));
            }
        }
        return aP;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getLguCommonApikey() {
        int i = 2 % 2;
        String str = aR;
        if (str != null) {
            int i2 = asBinder + 53;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                TextUtils.isEmpty(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (TextUtils.isEmpty(str)) {
                aR = CryptoHelper.decode(getString("PREF_STR_LG_COMMONAI_KEY"));
                int i3 = asBinder + 35;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        return aR;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getLiveCheckCycle() throws NumberFormatException {
        CodeConstants.AFLT_STUP_VAL_CD aflt_stup_val_cd;
        String code;
        int i = 2 % 2;
        int i2 = 0;
        if (getPpyDpyDvsCd(CodeConstants.EMBL_SVC_TYP_CD.PREPAID.getCode())) {
            int i3 = asBinder + 115;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                code = CodeConstants.AFLT_STUP_VAL_CD.LIVECHECK_CYCLE_PREPAID.getCode();
                int i4 = 8 / 0;
                i2 = Integer.parseInt(getSetupInfo(code));
                if (i2 <= 0) {
                    if (isPrePaidPlatform()) {
                        i2 = 600;
                    } else {
                        int i5 = asBinder + 103;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        i2 = 90;
                    }
                }
                return i2 * 60000;
            }
            aflt_stup_val_cd = CodeConstants.AFLT_STUP_VAL_CD.LIVECHECK_CYCLE_PREPAID;
        } else {
            aflt_stup_val_cd = CodeConstants.AFLT_STUP_VAL_CD.LIVECHECK_CYCLE_POSTPAID;
        }
        code = aflt_stup_val_cd.getCode();
        i2 = Integer.parseInt(getSetupInfo(code));
        if (i2 <= 0) {
        }
        return i2 * 60000;
    }

    public long getLiveCheckTime() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return getLong("TmoneyLiveCheckTime");
        }
        int i3 = 62 / 0;
        return getLong("TmoneyLiveCheckTime");
    }

    public MembershipItemDto getMembershipItem(String str) {
        int i = 2 % 2;
        for (MembershipItemDto membershipItemDto : getMembershipItemAll()) {
            if (membershipItemDto.getCode().equals(str)) {
                int i2 = asBinder + 101;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                if (i2 % 2 != 0) {
                    int i4 = 27 / 0;
                }
                int i5 = i3 + 41;
                asBinder = i5 % 128;
                if (i5 % 2 != 0) {
                    return membershipItemDto;
                }
                throw null;
            }
        }
        return null;
    }

    public List<MembershipItemDto> getMembershipItemAll() {
        int i = 2 % 2;
        String setupInfo = getInstance().getSetupInfo(CodeConstants.AFLT_STUP_VAL_CD.MEMBERSHIP.getCode());
        ArrayList arrayList = new ArrayList();
        if (!setupInfo.isEmpty()) {
            String[] strArrSplit = setupInfo.split("\\^");
            int i2 = asBinder + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            for (String str : strArrSplit) {
                String[] strArrSplit2 = str.split("\\|");
                if (strArrSplit2.length == 4) {
                    arrayList.add(new MembershipItemDto(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2], strArrSplit2[3]));
                    int i4 = asBinder + 37;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        }
        return arrayList;
    }

    public String getMktpToken() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String string = getString("MKTP_TOKEN");
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return string;
    }

    public int getNeedAfltSetupUpdateTime() throws NumberFormatException {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 39;
        asBinder = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                i = Integer.parseInt(getSetupInfo(CodeConstants.AFLT_STUP_VAL_CD.AFLT_SETUP_UPDATE_TIME.getCode()));
                int i4 = 7 / 0;
            } else {
                i = Integer.parseInt(getSetupInfo(CodeConstants.AFLT_STUP_VAL_CD.AFLT_SETUP_UPDATE_TIME.getCode()));
            }
        } catch (Exception unused) {
            i = 90;
        }
        int i5 = i * 60000;
        int i6 = asBinder + 121;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public int getOneDayLimitRemainCount() {
        int i = 2 % 2;
        int i2 = this.b.getInt("TmoneyOneDayLimitRemainCount", -1);
        LogHelper.d(TAG, "getOneDayLimitRemainCount:" + i2);
        int i3 = asBinder + 95;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 18 / 0;
        }
        return i2;
    }

    public boolean getPartnerApp() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            CodeConstants.EPARTNER_CODE.NOT_USE.getCode().equals(getAfltCd());
            obj.hashCode();
            throw null;
        }
        String afltCd = getAfltCd();
        if (!CodeConstants.EPARTNER_CODE.NOT_USE.getCode().equals(afltCd) && !CodeConstants.EPARTNER_CODE.MTMONEY.getCode().equals(afltCd) && !CodeConstants.EPARTNER_CODE.MTMONEY_GEAR.getCode().equals(afltCd)) {
            int i3 = asBinder + 111;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (!CodeConstants.EPARTNER_CODE.TMONET.getCode().equals(afltCd) && !CodeConstants.EPARTNER_CODE.CALL_CENTER.getCode().equals(afltCd)) {
                int i5 = asBinder + 37;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        if (!TextUtils.equals("com.lgt.tmoney", this.a.getPackageName()) || (!CodeConstants.EPARTNER_CODE.MTMONEY.getCode().equals(afltCd))) {
            return false;
        }
        int i7 = asBinder;
        int i8 = i7 + 55;
        onWarmupCompleted = i8 % 128;
        boolean z = i8 % 2 == 0;
        int i9 = i7 + 23;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public String getPartnerAppIntro() {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String string = getString("PartnerAppIntro");
        int i4 = onWarmupCompleted + 75;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public String getPartnerAppName() {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            getString("PartnerAppName");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String string = getString("PartnerAppName");
        int i3 = asBinder + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public String getPartnerAppPackage() {
        String string;
        int i = 2 % 2;
        int i2 = asBinder + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            string = getString("PartnerAppPackage");
            int i3 = 18 / 0;
        } else {
            string = getString("PartnerAppPackage");
        }
        int i4 = onWarmupCompleted + 37;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
        return string;
    }

    public String getPartnerAppWithdraw() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return getString("PartnerAppWithdraw");
        }
        getString("PartnerAppWithdraw");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getPartnerCD() {
        int i = 2 % 2;
        String str = aK;
        if (str != null) {
            int i2 = onWarmupCompleted + 97;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                TextUtils.isEmpty(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!(!TextUtils.isEmpty(str))) {
                aK = CryptoHelper.decode(getString("PARTNER_CODE"));
            }
        }
        String str2 = aK;
        int i3 = onWarmupCompleted + 93;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getPartnerKey() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = aL;
        if (str != null) {
            int i5 = i3 + 29;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                TextUtils.isEmpty(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (TextUtils.isEmpty(str)) {
                aL = CryptoHelper.decode(getString("PARTNER_KEY"));
            }
        }
        String str2 = aL;
        int i6 = asBinder + 119;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 23 / 0;
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getPhoneNumber() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = aJ;
        if (str == null || TextUtils.isEmpty(str) || aJ.equals("01000000000")) {
            String string = getString("Rebmunp");
            if (string != null) {
                int i4 = asBinder + 27;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    string.length();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (string.length() > 0) {
                    aJ = CryptoHelper.decode(string);
                } else {
                    aJ = "01000000000";
                    int i5 = asBinder + 33;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 2 / 4;
                    }
                }
            }
        }
        return aJ;
    }

    public String getPlatform() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String string = getString("TmoneyPlatform");
        int i4 = asBinder + 59;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getPlatformFromMBR0003(MBR0003ResponseDTO mBR0003ResponseDTO) throws Throwable {
        int i = 2 % 2;
        MBR0003ResponseDTO.Response response = mBR0003ResponseDTO.getResponse();
        if (TextUtils.equals(response.getPynUsrYn(), "N") && TextUtils.equals(response.getAfltStupYn(), "N")) {
            return "XX";
        }
        String ppyDpyDvsCd = response.getPpyDpyDvsCd();
        CodeConstants.EMBL_SVC_TYP_CD embl_svc_typ_cd = CodeConstants.EMBL_SVC_TYP_CD.PREPAID;
        if (TextUtils.equals(ppyDpyDvsCd, embl_svc_typ_cd.getCode()) && !(!TextUtils.equals(response.getUsrUseLtnCd(), "03"))) {
            return "PU";
        }
        if (TextUtils.equals(response.getPpyDpyDvsCd(), embl_svc_typ_cd.getCode()) && TextUtils.equals(response.getUsrUseLtnCd(), "07")) {
            return "PE";
        }
        if (TextUtils.equals(response.getUsrUseLtnCd(), "08")) {
            int i2 = asBinder + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return "PE";
        }
        if (TextUtils.equals(response.getUsrUseLtnCd(), "09")) {
            int i4 = onWarmupCompleted + 57;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return "SD";
        }
        if (TextUtils.equals(response.getPpyDpyDvsCd(), embl_svc_typ_cd.getCode()) && TextUtils.equals(response.getAfltCd(), CodeConstants.EPARTNER_CODE.SPAY.getCode())) {
            return "SA";
        }
        String ppyDpyDvsCd2 = response.getPpyDpyDvsCd();
        CodeConstants.EMBL_SVC_TYP_CD embl_svc_typ_cd2 = CodeConstants.EMBL_SVC_TYP_CD.POSTPAID;
        if (TextUtils.equals(ppyDpyDvsCd2, embl_svc_typ_cd2.getCode()) && TextUtils.equals(response.getAfltCd(), CodeConstants.EPARTNER_CODE.SPAY.getCode())) {
            return "SA";
        }
        if (TextUtils.equals(response.getPpyDpyDvsCd(), embl_svc_typ_cd2.getCode())) {
            int i6 = asBinder + 17;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return "AF";
        }
        if (TextUtils.equals(response.getPpyDpyDvsCd(), embl_svc_typ_cd.getCode())) {
            int i8 = onWarmupCompleted + 5;
            asBinder = i8 % 128;
            if (i8 % 2 == 0) {
                String telecomCode = getTelecomCode();
                Object[] objArr = new Object[1];
                aT(null, null, new byte[]{-126}, Color.alpha(0) * 69, objArr);
                if (TextUtils.equals(telecomCode, ((String) objArr[0]).intern())) {
                    return "AA";
                }
            } else {
                String telecomCode2 = getTelecomCode();
                Object[] objArr2 = new Object[1];
                aT(null, null, new byte[]{-126}, Color.alpha(0) + 127, objArr2);
                if (TextUtils.equals(telecomCode2, ((String) objArr2[0]).intern())) {
                    return "AA";
                }
            }
            String telecomCode3 = getTelecomCode();
            Object[] objArr3 = new Object[1];
            aT(null, null, new byte[]{-125}, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr3);
            if (TextUtils.equals(telecomCode3, ((String) objArr3[0]).intern())) {
                int i9 = onWarmupCompleted + 35;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
                return "AK";
            }
            if (TextUtils.equals(getTelecomCode(), "3")) {
                int i11 = asBinder + 63;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                return "AL";
            }
        }
        int i13 = asBinder + 89;
        onWarmupCompleted = i13 % 128;
        int i14 = i13 % 2;
        return "XX";
    }

    public String getPpyDpyDvsCd() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getString("TmoneyPpyDpyDvsCd");
            obj.hashCode();
            throw null;
        }
        String string = getString("TmoneyPpyDpyDvsCd");
        int i3 = asBinder + 85;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public boolean getPpyDpyDvsCd(String str) {
        boolean zEquals;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            zEquals = TextUtils.equals(getPpyDpyDvsCd(), str);
            int i3 = 24 / 0;
        } else {
            zEquals = TextUtils.equals(getPpyDpyDvsCd(), str);
        }
        int i4 = onWarmupCompleted + 35;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return zEquals;
        }
        throw null;
    }

    public String getPymStupYn() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getString("TmoneyPymStupYn");
            obj.hashCode();
            throw null;
        }
        String string = getString("TmoneyPymStupYn");
        int i3 = asBinder + 17;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public long getReadAfltSetupTime() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return getLong("TmoneySetupInfoTime");
        }
        getLong("TmoneySetupInfoTime");
        throw null;
    }

    public int getRegistedLimiteAmountPostPaid() throws NumberFormatException {
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 3;
        onWarmupCompleted = i3 % 128;
        try {
        } catch (Exception unused) {
            i = -1;
        }
        if (i3 % 2 != 0) {
            Integer.parseInt(getString("TmoneyAutoLoadAmount"));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        i = Integer.parseInt(getString("TmoneyAutoLoadAmount"));
        LogHelper.d(TAG, "getLimiteAmountPostPaid:" + i);
        int i4 = asBinder + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return i;
    }

    public boolean getSamePartner() {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            TextUtils.equals(getString("TmoneySamePartner"), "Y");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zEquals = TextUtils.equals(getString("TmoneySamePartner"), "Y");
        int i3 = asBinder + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return zEquals;
    }

    public String getSaveCardInfo() {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String string = getString("SAVE_CARD_INFO");
        int i4 = onWarmupCompleted + 117;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public String getSendAdid() {
        String string;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            string = getString("TmoneySendAdid");
            int i3 = 2 / 0;
        } else {
            string = getString("TmoneySendAdid");
        }
        int i4 = onWarmupCompleted + 79;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return string;
    }

    public Long getSendLogTime(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Long lValueOf = Long.valueOf(getLong(String.format("%s_%s", "APP_LOG", str)));
        int i4 = onWarmupCompleted + 121;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return lValueOf;
    }

    public int getServerType() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getInt("TmoneyServerType");
            obj.hashCode();
            throw null;
        }
        int i3 = getInt("TmoneyServerType");
        int i4 = asBinder + 39;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return i3;
        }
        obj.hashCode();
        throw null;
    }

    public String getSetupInfo(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String string = getString(String.format("%s%s", "TmoneySetupInfo", str));
        int i4 = onWarmupCompleted + 95;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public String getSkStId() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = aN;
        if (str == null || TextUtils.isEmpty(str)) {
            aN = CryptoHelper.decode(getString("SDK_SK_STID"));
            int i3 = asBinder + 77;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        return aN;
    }

    public String getTelNumber() throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            DeviceInfoHelper.getLine1NumberLocaleRemove(this.a);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String line1NumberLocaleRemove = DeviceInfoHelper.getLine1NumberLocaleRemove(this.a);
        int i3 = asBinder + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return line1NumberLocaleRemove;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[PHI: r1
      0x002c: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v10 java.lang.String) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getTelecomCode() throws Throwable {
        String telecom;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            telecom = DeviceInfoHelper.getTelecom(this.a);
            int i3 = 42 / 0;
            if (isOrangeOrToss()) {
                int i4 = onWarmupCompleted + 97;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr = new Object[1];
                aT(null, null, new byte[]{-127}, KeyEvent.getDeadChar(0, 0) + 127, objArr);
                if (!telecom.equals(((String) objArr[0]).intern())) {
                    int i6 = onWarmupCompleted + 117;
                    asBinder = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 3 / 0;
                        if (telecom.isEmpty()) {
                            telecom = "4";
                        }
                    } else if (telecom.isEmpty()) {
                    }
                }
            }
        } else {
            telecom = DeviceInfoHelper.getTelecom(this.a);
            if (isOrangeOrToss()) {
            }
        }
        int i8 = onWarmupCompleted + 23;
        asBinder = i8 % 128;
        if (i8 % 2 != 0) {
            return telecom;
        }
        throw null;
    }

    public TmoneyConstants.TelecomType getTelecomType() throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            isBluetooth().booleanValue();
            throw null;
        }
        if (isBluetooth().booleanValue()) {
            int i3 = onWarmupCompleted + 11;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return TmoneyConstants.TelecomType.Other;
        }
        String telecomCode = getTelecomCode();
        Object[] objArr = new Object[1];
        aT(null, null, new byte[]{-126}, 127 - (Process.myPid() >> 22), objArr);
        if (!telecomCode.equals(((String) objArr[0]).intern())) {
            Object[] objArr2 = new Object[1];
            aT(null, null, new byte[]{-125}, 127 - View.getDefaultSize(0, 0), objArr2);
            return telecomCode.equals(((String) objArr2[0]).intern()) ? TmoneyConstants.TelecomType.Kt : telecomCode.equals("3") ? TmoneyConstants.TelecomType.Lgu : TmoneyConstants.TelecomType.Unknown;
        }
        int i5 = asBinder + 29;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        TmoneyConstants.TelecomType telecomType = TmoneyConstants.TelecomType.SktSeio;
        int i7 = onWarmupCompleted + 41;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return telecomType;
    }

    public TmoneyConstants.TmoneySdkDebugType getTmoneyDebug() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        onWarmupCompleted = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                return TmoneyConstants.TmoneySdkDebugType.values()[getInt("SdkDebugType")];
            }
            TmoneyConstants.TmoneySdkDebugType tmoneySdkDebugType = TmoneyConstants.TmoneySdkDebugType.values()[getInt("SdkDebugType")];
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            LogHelper.exception(TAG, e);
            return TmoneyConstants.TmoneySdkDebugType.Debug;
        }
    }

    public boolean getTmoneyYn() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean z = getBoolean("TmoneyTmoneyYn");
        int i4 = onWarmupCompleted + 87;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public String getTpoPurse() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return getString("TPO_PURSE");
        }
        getString("TPO_PURSE");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getTpoTrans() {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String string = getString("TPO_TRANS");
        int i4 = onWarmupCompleted + 75;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getUicc() {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String simSerialNumber = DeviceInfoHelper.getSimSerialNumber(this.a);
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return simSerialNumber;
    }

    public String getUiccPreference() {
        int i = 2 % 2;
        String str = aF;
        if (str == null || TextUtils.isEmpty(str)) {
            aF = CryptoHelper.decode(getString("TmoneyUICC"));
            int i2 = onWarmupCompleted + 45;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        }
        String str2 = aF;
        int i4 = asBinder + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return str2;
    }

    public String getUserCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String string = getString("TmoneyUserCode");
        int i4 = asBinder + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getUserId() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = aG;
        if (str != null) {
            int i5 = i2 + 125;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                TextUtils.isEmpty(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (TextUtils.isEmpty(str)) {
                aG = CryptoHelper.decode(getString("TmoneyUserId"));
                int i6 = asBinder + 69;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 3;
                }
            }
        }
        return aG;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getUserNo() {
        int i = 2 % 2;
        String str = aI;
        Object obj = null;
        if (str != null) {
            int i2 = onWarmupCompleted + 79;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                TextUtils.isEmpty(str);
                throw null;
            }
            if (TextUtils.isEmpty(str)) {
                String string = getString("Resun");
                if (string == null || "".equals(string)) {
                    aI = "";
                    int i3 = onWarmupCompleted + 77;
                    asBinder = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    int i5 = asBinder + 3;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    aI = CryptoHelper.decode(string);
                    if (i6 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                }
            }
        }
        return aI;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getUseridPreference() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 9;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (aG != null) {
            int i5 = i2 + 103;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            if (!(!TextUtils.isEmpty(r2))) {
                aG = CryptoHelper.decode(getString("TmoneyUICC"));
            }
        }
        return aG;
    }

    public String getUsrUseLtnCd() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String string = getString("TmoneyUrUseLtnCd");
        int i4 = onWarmupCompleted + 99;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public String getVer() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String string = getString("VER");
        int i4 = onWarmupCompleted + 83;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public Boolean isBluetooth() {
        Boolean boolValueOf;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            boolValueOf = Boolean.valueOf(getBoolean("USE_BLUETOOTH"));
            int i3 = 56 / 0;
        } else {
            boolValueOf = Boolean.valueOf(getBoolean("USE_BLUETOOTH"));
        }
        int i4 = asBinder + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public boolean isGamin() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return TextUtils.equals("17", Tmoney.getAffiliateCd());
        }
        int i3 = 97 / 0;
        return TextUtils.equals("17", Tmoney.getAffiliateCd());
    }

    public boolean isLmtModTgtYn() {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = getString("TmoneylmtModTgtYn").equals("Y");
        int i4 = asBinder + 9;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zEquals;
    }

    public boolean isMobileTmoneyPlatform() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String afltCd = getAfltCd();
        if (i3 != 0) {
            return TextUtils.equals(afltCd, CodeConstants.EPARTNER_CODE.MTMONEY.getCode());
        }
        TextUtils.equals(afltCd, CodeConstants.EPARTNER_CODE.MTMONEY.getCode());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isMobileTmoneyPostPaidPlatform() {
        int i = 2 % 2;
        if (!isMobileTmoneyPlatform()) {
            return false;
        }
        int i2 = onWarmupCompleted + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!TextUtils.equals(getPpyDpyDvsCd(), CodeConstants.EMBL_SVC_TYP_CD.POSTPAID.getCode())) {
            return false;
        }
        int i4 = onWarmupCompleted + 125;
        asBinder = i4 % 128;
        return i4 % 2 != 0;
    }

    public boolean isNeedJoinTmoney() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!getPartnerApp()) {
            return true;
        }
        int i4 = onWarmupCompleted + 7;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return false;
    }

    public boolean isNotUseUsimPartner() throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (Tmoney.getAffiliateCd().length() <= 0) {
            int i4 = onWarmupCompleted + 9;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 40 / 0;
            }
            return false;
        }
        int i6 = onWarmupCompleted + 105;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        String strSubstring = Tmoney.getAffiliateCd().substring(0, 1);
        Object[] objArr = new Object[1];
        aT(null, null, new byte[]{-125}, TextUtils.indexOf("", "") + 127, objArr);
        return strSubstring.equals(((String) objArr[0]).intern());
    }

    public boolean isOffHostSentUnset() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean z = getBoolean("TmoneyOffHostSentUnset");
        int i4 = onWarmupCompleted + 67;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return z;
    }

    public boolean isOrangeOrToss() {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            TextUtils.equals("23", Tmoney.getAffiliateCd());
            throw null;
        }
        if (TextUtils.equals("23", Tmoney.getAffiliateCd())) {
            return true;
        }
        int i3 = asBinder + 49;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 47 / 0;
            if (TextUtils.equals("21", Tmoney.getAffiliateCd())) {
                return true;
            }
        } else if (TextUtils.equals("21", Tmoney.getAffiliateCd())) {
            return true;
        }
        int i5 = asBinder + 107;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public boolean isPostPaidPlatform() {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (getPartnerApp()) {
            if (TextUtils.equals(getAfltCd(), getPartnerCD())) {
                int i4 = asBinder + 109;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                String code = CodeConstants.EMBL_SVC_TYP_CD.POSTPAID.getCode();
                if (i5 == 0) {
                    return code.equals(getPpyDpyDvsCd());
                }
                code.equals(getPpyDpyDvsCd());
                throw null;
            }
            if (getSamePartner() && CodeConstants.EMBL_SVC_TYP_CD.POSTPAID.getCode().equals(getPpyDpyDvsCd())) {
                return true;
            }
        }
        int i6 = asBinder + 41;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public boolean isPrePaidPlatform() {
        int i = 2 % 2;
        if (getPartnerApp()) {
            if (TextUtils.equals(getAfltCd(), getPartnerCD())) {
                int i2 = onWarmupCompleted + 77;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                String code = CodeConstants.EMBL_SVC_TYP_CD.PREPAID.getCode();
                if (i3 != 0) {
                    return code.equals(getPpyDpyDvsCd());
                }
                code.equals(getPpyDpyDvsCd());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (getSamePartner()) {
                int i4 = onWarmupCompleted + 3;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                if (CodeConstants.EMBL_SVC_TYP_CD.PREPAID.getCode().equals(getPpyDpyDvsCd())) {
                    return true;
                }
            }
        }
        int i6 = asBinder + 19;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public boolean isPrepaidTmoneyAutoLoad() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = TextUtils.equals(getPymStupYn(), "Y");
        int i4 = onWarmupCompleted + 93;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return zEquals;
    }

    public boolean isTelecomTestServer() {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 29;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public boolean isTelecomTypeKt() {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (getTelecomType() != TmoneyConstants.TelecomType.Kt) {
            return false;
        }
        int i4 = asBinder + 67;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 99;
        asBinder = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isTelecomTypeLgu() {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (getTelecomType() == TmoneyConstants.TelecomType.Lgu) {
            return true;
        }
        int i4 = asBinder + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public boolean isTelecomTypeSk() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (getTelecomType() != TmoneyConstants.TelecomType.SktSeio) {
            return false;
        }
        int i4 = onWarmupCompleted + 45;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (getTelecomType() == com.tmoney.TmoneyConstants.TelecomType.Unknown) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (getTelecomType() == com.tmoney.TmoneyConstants.TelecomType.Unknown) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1 = com.tmoney.preference.TmoneyData.onWarmupCompleted + 41;
        com.tmoney.preference.TmoneyData.asBinder = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isTelecomTypeUnknown() {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
        }
    }

    public boolean isTestServer() {
        int i = 2 % 2;
        if (getInt("TmoneyServerType") != 0) {
            int i2 = asBinder + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = asBinder;
        int i4 = i3 + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 65;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public boolean isTmoney2IssueFromEnableChek() {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean z = getBoolean("Tmoney_2issue_from_enableCheck");
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return z;
    }

    public boolean isTmoneyUser() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean partnerApp = getPartnerApp();
        int i4 = asBinder + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return partnerApp;
    }

    public void setAdvertisingId(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        putString("Tmoney_adid", str);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setApltPckgNm(ArrayList<String> arrayList) {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        putList("TmoneyPartnerList", arrayList);
        if (i3 != 0) {
            throw null;
        }
    }

    public void setAppKey(String str) {
        int i = 2 % 2;
        if (TextUtils.isEmpty(aM) || !TextUtils.equals(aM, str)) {
            aM = null;
            LogHelper.dw(TAG, "setAppKey", str);
            putString("SDK_APP_KEY", CryptoHelper.encode(str));
            int i2 = onWarmupCompleted + 89;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = onWarmupCompleted + 93;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        LogHelper.dw(TAG, "setedAppKey", str);
        if (i5 == 0) {
            int i6 = 32 / 0;
        }
    }

    public void setAutoLoadAmount(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        putString("TmoneyAutoLoadAmount", str);
        int i4 = asBinder + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setBluetooth(Boolean bool) {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        putBoolean("USE_BLUETOOTH", bool.booleanValue());
        int i4 = asBinder + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
    }

    public void setCIPreference(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        LogHelper.dw(TAG, "setCIPreference", str);
        putString("TmoneyCI", CryptoHelper.encode(str));
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCardNumber(String str) {
        int i = 2 % 2;
        Object obj = null;
        if (!TextUtils.isEmpty(aE)) {
            int i2 = onWarmupCompleted + 115;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                TextUtils.equals(aE, str);
                throw null;
            }
            if (TextUtils.equals(aE, str)) {
                return;
            }
        }
        aE = null;
        putString("Dracn", CryptoHelper.encode(str));
        int i3 = onWarmupCompleted + 91;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setCount(int i) {
        int i2 = 2 % 2;
        LogHelper.d(TAG, "setCount:" + i);
        putInt("TmoneyCount", i);
        int i3 = asBinder + 43;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public void setCrcmCd(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        putString("TmoneyCrcmCd", str);
        int i4 = asBinder + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
    }

    public void setCreditCardAll(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        putString("TmoneyCardListAll", str);
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
    }

    public void setCreditCardListRegDate(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        putString("geretad", str);
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        int i5 = onWarmupCompleted + 37;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setIssueData(int i, String str, String str2, String str3, String str4) {
        int i2 = 2 % 2;
        int i3 = asBinder + 9;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        putInt("TmoneyIssueVersion", i);
        putString("TmoneyIssueLifeCycle", str);
        if (i4 != 0) {
            putString("TmoneyIssueAlias", str2);
            TextUtils.isEmpty(aS);
            obj.hashCode();
            throw null;
        }
        putString("TmoneyIssueAlias", str2);
        if (TextUtils.isEmpty(aS) || !TextUtils.equals(aS, str3)) {
            aS = null;
            putString("Sidracn", CryptoHelper.encode(str3));
        }
        putString("TmoneyIssueUserCode", str4);
        int i5 = asBinder + 7;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setJoinGrade(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        putString("TmoneyJoinGrade", str);
        int i4 = asBinder + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setKey(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        putString("KEY", str);
        int i4 = asBinder + 61;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setKtAppKey(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        putString("KT_APP_KEY", str);
        int i4 = onWarmupCompleted + 17;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setKtUfinKey(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 88 / 0;
            if (!TextUtils.isEmpty(aO)) {
                if (TextUtils.equals(aO, str)) {
                    LogHelper.dw(TAG, "setedKtUfinKey", str);
                    return;
                }
            }
        } else if (!TextUtils.isEmpty(aO)) {
        }
        aO = null;
        LogHelper.dw(TAG, "setKtUfinKey", str);
        putString("SDK_KT_UFIN_KEY", CryptoHelper.encode(str));
        int i4 = onWarmupCompleted + 87;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void setLastBalance(int i) {
        int i2 = 2 % 2;
        LogHelper.d(TAG, "setLastBalance:" + i);
        putInt("TmoneyLastBalance", i);
        int i3 = onWarmupCompleted + 33;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    public void setLgClientId(String str) {
        int i = 2 % 2;
        Object obj = null;
        if (!TextUtils.isEmpty(aQ)) {
            int i2 = asBinder + 91;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                TextUtils.equals(aQ, str);
                obj.hashCode();
                throw null;
            }
            if (TextUtils.equals(aQ, str)) {
                LogHelper.dw(TAG, "setedLgClientId", str);
                int i3 = onWarmupCompleted + 103;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
        }
        aQ = null;
        LogHelper.dw(TAG, "setLgClientId", str);
        putString("SDK_LG_CLIENT_ID", CryptoHelper.encode(str));
        int i5 = onWarmupCompleted + 9;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setLgCommonApikey(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!TextUtils.isEmpty(aR)) {
            int i4 = asBinder + 61;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (TextUtils.equals(aR, str)) {
                LogHelper.dw(TAG, "setLgCommonApiKey", str);
                return;
            }
        }
        aR = null;
        LogHelper.dw(TAG, "setLgCommonApiKey", str);
        putString("PREF_STR_LG_COMMONAI_KEY", CryptoHelper.encode(str));
        int i6 = asBinder + 27;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setLgUiccIDKey(String str) {
        int i = 2 % 2;
        Object obj = null;
        if (!TextUtils.isEmpty(aP)) {
            int i2 = onWarmupCompleted + 3;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (TextUtils.equals(aP, str)) {
                int i4 = onWarmupCompleted + 43;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                LogHelper.dw(TAG, "setedLgUiccIDKey ", str);
                if (i5 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        aP = null;
        LogHelper.dw(TAG, "setLgUiccIDKey", str);
        putString("SDK_LG_UICC_ID_KEY", CryptoHelper.encode(str));
    }

    public void setLiveCheckTime(long j) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        putLong("TmoneyLiveCheckTime", j);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setManageId(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        putString("MemberId", str);
        int i4 = onWarmupCompleted + 77;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setManageNumber(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        putString("MemberManageNumber", str);
        int i4 = asBinder + 7;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void setMktpToken(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        putString("MKTP_TOKEN", str);
        int i4 = onWarmupCompleted + 101;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setOffHostSentUnset(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        putBoolean("TmoneyOffHostSentUnset", z);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setOneDayLimitRemainCount(int i) {
        int i2 = 2 % 2;
        LogHelper.d(TAG, "setOneDayLimitRemainCount:" + i);
        putInt("TmoneyOneDayLimitRemainCount", i);
        int i3 = asBinder + 23;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public void setPartnerCd(String str) {
        int i = 2 % 2;
        Object obj = null;
        if (!TextUtils.isEmpty(aK)) {
            int i2 = onWarmupCompleted + 121;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                TextUtils.equals(aK, str);
                throw null;
            }
            if (TextUtils.equals(aK, str)) {
                LogHelper.dw(TAG, "setedPartnerCd", str);
                int i3 = asBinder + 121;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        aK = null;
        LogHelper.dw(TAG, "setPartnerCd", str);
        putString("PARTNER_CODE", CryptoHelper.encode(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setPartnerKey(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = 57 / 0;
            if (!TextUtils.isEmpty(aL)) {
                int i4 = onWarmupCompleted + 83;
                asBinder = i4 % 128;
                if (i4 % 2 == 0) {
                    TextUtils.equals(aL, str);
                    obj.hashCode();
                    throw null;
                }
                if (!(!TextUtils.equals(aL, str))) {
                    LogHelper.dw(TAG, "setedPartnerKey", str);
                    int i5 = asBinder + 57;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
        } else if (!TextUtils.isEmpty(aL)) {
        }
        aL = null;
        LogHelper.dw(TAG, "setPartnerKey", str);
        putString("PARTNER_KEY", CryptoHelper.encode(str));
    }

    public void setPayment(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        putString("TmoneyPayment", str);
        if (i3 == 0) {
            throw null;
        }
    }

    public void setPhoneNumber(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.equals(aJ, str)) {
            int i4 = asBinder + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            LogHelper.dw(TAG, "setedPhoneNumber", str);
            return;
        }
        aJ = null;
        LogHelper.dw(TAG, "setPhoneNumber", str);
        putString("Rebmunp", CryptoHelper.encode(str));
        int i6 = asBinder + 111;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public boolean setPointDataReset() throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        aT(null, null, new byte[]{-127}, 127 - Color.blue(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putString("PointCumPoint", strIntern);
        editorEdit.putString("MemberPoint", strIntern);
        editorEdit.putString("PointRmnPoint", strIntern);
        editorEdit.putString("PointExpiPoint", strIntern);
        editorEdit.putString("PointSchdPoint", strIntern);
        boolean zCommit = editorEdit.commit();
        LogHelper.d(TAG, "setPointDataReset commit : " + zCommit);
        int i2 = asBinder + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return zCommit;
    }

    public boolean setPointDataResult(PointResult pointResult) throws Throwable {
        String useMileage;
        int i = 2 % 2;
        PointResultData resultData = pointResult.getResultData();
        SharedPreferences.Editor editorEdit = this.b.edit();
        String prcDvs = resultData.getPrcDvs();
        Object[] objArr = new Object[1];
        aT(null, null, new byte[]{-126}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 127, objArr);
        if (prcDvs.equals(((String) objArr[0]).intern())) {
            editorEdit.putString("PointCumPoint", resultData.getCumPnt());
            editorEdit.putString("MemberPoint", resultData.getPtuPnt());
            editorEdit.putString("PointRmnPoint", resultData.getRmnPnt());
            editorEdit.putString("PointExpiPoint", resultData.getExpiPnt());
            editorEdit.putString("PointSchdPoint", resultData.getSchdPnt());
            useMileage = resultData.getUsePnt();
            int i2 = onWarmupCompleted + 1;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        } else {
            editorEdit.putString("PointCumPoint", resultData.getCumMileage());
            editorEdit.putString("MemberPoint", resultData.getPtuMileage());
            editorEdit.putString("PointRmnPoint", resultData.getRmnMileage());
            editorEdit.putString("PointExpiPoint", resultData.getExpiMileage());
            editorEdit.putString("PointSchdPoint", resultData.getSchdMileage());
            useMileage = resultData.getUseMileage();
        }
        editorEdit.putString("PointUsePoint", useMileage);
        int i4 = asBinder + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        boolean zCommit = editorEdit.commit();
        LogHelper.d(TAG, "setPointDataResult commit : " + zCommit);
        return zCommit;
    }

    public void setPpyDpyDvsCd(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        putString("TmoneyPpyDpyDvsCd", str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asBinder + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
    }

    public void setPymStupYn(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        putString("TmoneyPymStupYn", str);
        int i4 = asBinder + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setReadAfltSetupTime(long j) {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        putLong("TmoneySetupInfoTime", j);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 61;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setSaveCardInfo(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        putString("SAVE_CARD_INFO", str);
        if (i3 == 0) {
            throw null;
        }
    }

    public void setSendAdid(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        putString("TmoneySendAdid", str);
        int i4 = onWarmupCompleted + 29;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setSendLogTime(String str, long j) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        putLong(String.format("%s_%s", "APP_LOG", str), j);
        int i4 = asBinder + 31;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
    }

    public void setServerType(int i) {
        int i2 = 2 % 2;
        LogHelper.d(TAG, "setServerType:" + i);
        putInt("TmoneyServerType", i);
        if (i != getServerType()) {
            int i3 = asBinder + 65;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            setManageNumber("");
        }
        int i5 = asBinder + 11;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setSetupInfo(String str, String str2) {
        String str3;
        int i = 2 % 2;
        int i2 = asBinder + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[4];
            objArr[1] = "TmoneySetupInfo";
            objArr[1] = str;
            str3 = String.format("%s%s", objArr);
        } else {
            str3 = String.format("%s%s", "TmoneySetupInfo", str);
        }
        putString(str3, str2);
    }

    public void setSkStId(String str) {
        int i = 2 % 2;
        if (!TextUtils.isEmpty(aN)) {
            int i2 = asBinder + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (TextUtils.equals(aN, str)) {
                LogHelper.dw(TAG, "setedSkStId", str);
                int i4 = asBinder + 21;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
        }
        aN = null;
        LogHelper.dw(TAG, "setSkStId", str);
        putString("SDK_SK_STID", CryptoHelper.encode(str));
    }

    public void setTmoney2IssueFromEnableChek(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        putBoolean("Tmoney_2issue_from_enableCheck", z);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 31;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public boolean setTmoneyData(MBR0003ResponseDTO mBR0003ResponseDTO) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String platformFromMBR0003 = getPlatformFromMBR0003(mBR0003ResponseDTO);
        MBR0003ResponseDTO.Response response = mBR0003ResponseDTO.getResponse();
        String afcpApltNm = response.getAfcpApltNm();
        String apltPckgNm = response.getApltPckgNm();
        String sttSchmCtt = response.getSttSchmCtt();
        String chgSchmCtt = response.getChgSchmCtt();
        String cncnSchmCtt = response.getCncnSchmCtt();
        SharedPreferences.Editor editorEdit = this.b.edit();
        if (platformFromMBR0003.equals("XX")) {
            int i4 = asBinder + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            putString("TmoneyJoinGrade", "");
            if (i5 != 0) {
                throw null;
            }
        }
        if (platformFromMBR0003.equals("AF")) {
            int i6 = onWarmupCompleted + 9;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            if ("com.sktelecom.tsmartpay".equals(apltPckgNm)) {
                platformFromMBR0003 = "MO";
            }
        }
        editorEdit.putString("PartnerAppName", afcpApltNm);
        editorEdit.putString("PartnerAppPackage", apltPckgNm);
        editorEdit.putString("PartnerAppIntro", sttSchmCtt);
        editorEdit.putString("PartnerAppLoad", chgSchmCtt);
        editorEdit.putString("PartnerAppWithdraw", cncnSchmCtt);
        editorEdit.putString("TmoneyPlatform", platformFromMBR0003);
        if (response.getAfltMbrsV() == null || response.getAfltMbrsV().size() <= 0) {
            editorEdit.putString("AFLTMBRSDATAV", "");
        } else {
            editorEdit.putString("AFLTMBRSDATAV", new Gson().toJson(response.getAfltMbrsV()));
        }
        String pynUsrYn = response.getPynUsrYn();
        String afltStupYn = response.getAfltStupYn();
        String afltCd = response.getAfltCd();
        String ppyDpyDvsCd = response.getPpyDpyDvsCd();
        String pymMnsGrpCd = response.getPymMnsGrpCd();
        String crcmCd = response.getCrcmCd();
        String crdtChecDvsCd = response.getCrdtChecDvsCd();
        String usrUseLtnCd = response.getUsrUseLtnCd();
        String pymStupYn = response.getPymStupYn();
        String lmtModTgtYn = response.getLmtModTgtYn();
        String joinGradeFromMBR0003 = getJoinGradeFromMBR0003(mBR0003ResponseDTO);
        response.getCrcmCd();
        String atcgCtAmt = response.getAtcgCtAmt();
        String atcgLmtRestAmt = response.getAtcgLmtRestAmt();
        String samePartnerAfltYn = response.getSamePartnerAfltYn();
        boolean zEquals = TextUtils.equals(response.getPsbMbph(), "Y");
        String crdtChecDvsCd2 = response.getCrdtChecDvsCd();
        editorEdit.putString("TmoneyPayment", pynUsrYn);
        editorEdit.putString("TmoneyPartnerJoin", afltStupYn);
        editorEdit.putString("TmoneyAfltCD", afltCd);
        editorEdit.putString("TmoneyPpyDpyDvsCd", ppyDpyDvsCd);
        editorEdit.putString("TmoneyPymMnsGrpCd", pymMnsGrpCd);
        editorEdit.putString("TmoneyCrcmCd", crcmCd);
        editorEdit.putString("TmoneyCrdtChecDvsCd", crdtChecDvsCd);
        editorEdit.putString("TmoneyUrUseLtnCd", usrUseLtnCd);
        editorEdit.putString("TmoneyPymStupYn", pymStupYn);
        if (lmtModTgtYn != null) {
            editorEdit.putString("TmoneylmtModTgtYn", lmtModTgtYn);
            int i8 = asBinder + 37;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        editorEdit.putString("TmoneyJoinGrade", joinGradeFromMBR0003);
        editorEdit.putString("TmoneyUserSex", response.getGndrCd());
        editorEdit.putString("TmoneyUserAge", response.getUserBrdt());
        editorEdit.putString("TmoneyAutoBaseAmount", atcgCtAmt);
        editorEdit.putString("TmoneyAutoLoadAmount", atcgLmtRestAmt);
        editorEdit.putBoolean("TmoneyTmoneyYn", zEquals);
        editorEdit.putString("TmoneyCreditCheckType", crdtChecDvsCd2);
        editorEdit.putString("TmoneySamePartner", samePartnerAfltYn);
        boolean zCommit = editorEdit.commit();
        LogHelper.d(TAG, "setTmoneyData(MBR0003) commit:" + zCommit);
        return zCommit;
    }

    public void setTmoneyDebug(TmoneyConstants.TmoneySdkDebugType tmoneySdkDebugType) {
        int iOrdinal;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            getServerType();
            TmoneyConstants.TmoneyServerType.Release.ordinal();
            throw null;
        }
        if (getServerType() == TmoneyConstants.TmoneyServerType.Release.ordinal()) {
            iOrdinal = TmoneyConstants.TmoneySdkDebugType.None.ordinal();
        } else {
            int iOrdinal2 = tmoneySdkDebugType.ordinal();
            int i3 = asBinder + 119;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            iOrdinal = iOrdinal2;
        }
        putInt("SdkDebugType", iOrdinal);
        LogHelper.setLogHelperDebug();
        LogHelper.d(TAG, "setTmoneyDebug:" + tmoneySdkDebugType);
    }

    public void setTmoneyYn(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        putBoolean("TmoneyTmoneyYn", z);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asBinder + 7;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
    }

    public boolean setTpoData(String str, String str2) {
        int i = 2 % 2;
        LogHelper.d(TAG, "setTpoData purse:" + str + ",trans:" + str2);
        StringBuilder sb = new StringBuilder("setTpoData time:");
        sb.append(System.currentTimeMillis());
        LogHelper.d(TAG, sb.toString());
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putString("TPO_PURSE", str.trim());
        editorEdit.putString("TPO_TRANS", str2.trim());
        editorEdit.putLong("TPO_TIME", System.currentTimeMillis());
        boolean zCommit = editorEdit.commit();
        LogHelper.d(TAG, "setTpoData commit : " + zCommit);
        int i2 = asBinder + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return zCommit;
    }

    public void setUiccPreference(String str) {
        int i = 2 % 2;
        Object obj = null;
        if (!TextUtils.isEmpty(aF)) {
            int i2 = onWarmupCompleted + 11;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (!(!TextUtils.equals(aF, str))) {
                LogHelper.dw(TAG, "setedUiccPreference", str);
                int i4 = asBinder + 115;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        aF = null;
        LogHelper.dw(TAG, "setUiccPreference", str);
        putString("TmoneyUICC", CryptoHelper.encode(str));
    }

    public void setUserCode(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        putString("TmoneyUserCode", str);
        int i4 = onWarmupCompleted + 3;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setUserIdPreference(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            TextUtils.isEmpty(aG);
            throw null;
        }
        if (!TextUtils.isEmpty(aG) && TextUtils.equals(aG, str)) {
            LogHelper.dw(TAG, "setedUserIdPreference", str);
            return;
        }
        aG = null;
        LogHelper.dw(TAG, "setUserIdPreference", str);
        putString("TmoneyUserId", CryptoHelper.encode(str));
        int i3 = onWarmupCompleted + 9;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    public void setVer(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        putString("VER", str);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void aT(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onExtraCallbackWithResult;
        if (cArr3 != null) {
            int i4 = $11 + 117;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i5 = $11 + 11;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 77 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 20951 - ImageFormat.getBitsPerPixel(0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i2 >>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i2])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 76 - MotionEvent.axisFromString(""), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 20951, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i2++;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 75 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.green(0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 62 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i6 = $10 + 45;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i8 = $10 + 37;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            try {
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 62, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr6);
    }
}
