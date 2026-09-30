package com.tmoney.ota.a;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import com.tmoney.kscc.sslio.a.O;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.ota.c.h;
import com.tmoney.ota.c.i;
import com.tmoney.ota.dto.APDU;
import com.tmoney.ota.dto.EfIssuActCDTO;
import com.tmoney.ota.dto.OTAData2001;
import com.tmoney.ota.dto.OTAData2005;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class c extends com.tmoney.g.a.a {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = {64897, 64898, 64896, 64899};
    private static char onExtraCallback = 51243;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private com.tmoney.ota.e.b l;
    private com.tmoney.ota.e.c m;
    private com.tmoney.ota.e.a n;

    /* renamed from: o, reason: collision with root package name */
    private int f9o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private EfIssuActCDTO w;
    private O x;

    public c(Context context, String str, String str2, String str3, String str4, String str5, String str6, ResultListener resultListener) throws Throwable {
        super(context, resultListener);
        this.a = "TmoneyMemberOtaExecuter";
        Object[] objArr = new Object[1];
        y(new char[]{13803}, (byte) (66 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, objArr);
        this.q = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        y(new char[]{13838}, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 98), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
        this.r = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        y(new char[]{13857}, (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 121), -MotionEvent.axisFromString(""), objArr3);
        this.s = ((String) objArr3[0]).intern();
        this.t = "9";
        Object[] objArr4 = new Object[1];
        y(new char[]{13838}, (byte) (Color.blue(0) + 99), TextUtils.getOffsetAfter("", 0) + 1, objArr4);
        this.u = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        y(new char[]{13803}, (byte) (Drawable.resolveOpacity(0, 0) + 65), 1 - ((Process.getThreadPriority(0) + 20) >> 6), objArr5);
        this.v = ((String) objArr5[0]).intern();
        this.w = null;
        this.x = O.getInstance();
        this.b = DeviceInfoHelper.getOtaIssuReqSno(getContext());
        this.c = str;
        this.d = DeviceInfoHelper.getSimSerialNumber(getContext());
        this.e = str2;
        this.f = DeviceInfoHelper.getLine1NumberLocaleRemove(getContext());
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.g = DeviceInfoHelper.getOtaTelecom(getContext());
        this.l = com.tmoney.ota.e.b.getInstance(getContext());
        this.m = new com.tmoney.ota.e.c(getContext());
        this.n = new com.tmoney.ota.e.a(getContext());
    }

    private static String a(String str, String str2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            TextUtils.isEmpty(str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str2.trim())) {
            str = str + "(" + str2 + ")";
            int i3 = onNavigationEvent + 7;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 / 3;
            }
        }
        return str;
    }

    private boolean a(com.tmoney.g.d dVar, EfIssuActCDTO efIssuActCDTO, boolean z) {
        int i = 2 % 2;
        EfIssuActCDTO efIssuActCDTO2 = efIssuActCDTO;
        boolean z2 = z;
        while (true) {
            ArrayList<APDU> trmApduList = efIssuActCDTO2.getTrmApduList();
            if (!z2 && trmApduList != null) {
                int i2 = onNavigationEvent + 37;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                if (trmApduList.size() > 0) {
                    for (int i4 = 0; i4 < trmApduList.size(); i4++) {
                        APDU apdu = trmApduList.get(i4);
                        if (!"Reset".equals(apdu.getCMD())) {
                            String cmd = apdu.getCMD();
                            LogHelper.d("TmoneyMemberOtaExecuter", "transmitAPDU cmd:" + cmd.toString());
                            String strBytesToHexString = com.tmoney.e.a.a.bytesToHexString(dVar.transmitAPDU(e(cmd)));
                            apdu.setCMD(strBytesToHexString);
                            LogHelper.d("TmoneyMemberOtaExecuter", "result:".concat(String.valueOf(strBytesToHexString)));
                        } else {
                            int i5 = onNavigationEvent + 17;
                            onWarmupCompleted = i5 % 128;
                            int i6 = i5 % 2;
                            dVar.open();
                            if (dVar.getChannel() >= 0) {
                                apdu.setCMD("9000");
                                apdu.setSW(new String[]{"9000"});
                                int i7 = onNavigationEvent + 47;
                                onWarmupCompleted = i7 % 128;
                                int i8 = i7 % 2;
                            } else {
                                apdu.setCMD("");
                                apdu.setSW(new String[]{""});
                            }
                        }
                    }
                }
            }
            LogHelper.d("TmoneyMemberOtaExecuter", "getPacket cardStaCd:" + efIssuActCDTO2.getCardStaCd());
            ResponseBody responseBodyD = d(this.n.getEfIssuActC(efIssuActCDTO2.getISSU_REQ_SNO(), efIssuActCDTO2.getCardPrdInhrNo(), this.d, efIssuActCDTO2.getTmcrNo(), efIssuActCDTO2.getHndhTelNo(), efIssuActCDTO2.getTlcmCd(), efIssuActCDTO2.getCardPrdId(), efIssuActCDTO2.getDtaRecSno(), efIssuActCDTO2.getAfltPrdId(), efIssuActCDTO2.getCardStaCd(), trmApduList).makePacket());
            if (responseBodyD == null) {
                return false;
            }
            EfIssuActCDTO efIssuActCDTO3 = (EfIssuActCDTO) new com.tmoney.ota.c.a(responseBodyD.bytes()).execute();
            this.w = efIssuActCDTO3;
            if (!TextUtils.equals(efIssuActCDTO3.getRTRM_YN(), "Y")) {
                return true;
            }
            efIssuActCDTO2 = this.w;
            z2 = false;
        }
    }

    private ResponseBody d(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.x.executePost(this.l.getUrl(), RequestBody.create(MediaType.parse("charset=utf-8"), str));
        }
        this.x.executePost(this.l.getUrl(), RequestBody.create(MediaType.parse("charset=utf-8"), str));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static byte[] e(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 77;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (str != null) {
            int i4 = i2 + 59;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                str.length();
                throw null;
            }
            if (str.length() != 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                int i5 = onWarmupCompleted + 41;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                for (int i7 = 0; i7 < length; i7++) {
                    int i8 = i7 << 1;
                    bArr[i7] = (byte) Integer.parseInt(str.substring(i8, i8 + 2), 16);
                }
                return bArr;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0205  */
    @Override // com.tmoney.g.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        ResultDetailCode resultDetailCode;
        String message;
        int i;
        String rst_msg;
        String rst_cd;
        byte[] bArrTransmitAPDU;
        TmoneyCallback.ResultType message2;
        int i2 = 2 % 2;
        super.execute(dVar, resultType);
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            try {
                ResponseBody responseBodyD = d(this.m.getOTAPacket2001(this.b, this.d, this.f, this.e).makePacket());
                if (responseBodyD != null) {
                    OTAData2001 oTAData2001 = (OTAData2001) new h(responseBodyD.bytes()).execute();
                    String rst_cd2 = oTAData2001.getRST_CD();
                    LogHelper.d("TmoneyMemberOtaExecuter", "rst cd:" + rst_cd2);
                    if (TextUtils.equals(rst_cd2, this.q)) {
                        ResponseBody responseBodyD2 = d(this.m.getOTAPacket2005(this.b, this.d, this.f).makePacket());
                        if (responseBodyD2 != null) {
                            OTAData2005 oTAData2005 = (OTAData2005) new i(responseBodyD2.bytes()).execute();
                            EfIssuActCDTO efIssuActCDTO = new EfIssuActCDTO(getContext());
                            efIssuActCDTO.setISSU_REQ_SNO(this.b);
                            efIssuActCDTO.setCardPrdInhrNo(this.c);
                            efIssuActCDTO.setUnicCardNo(this.d);
                            efIssuActCDTO.setTmcrNo(this.e);
                            efIssuActCDTO.setHndhTelNo(this.f);
                            efIssuActCDTO.setTlcmCd(this.g);
                            efIssuActCDTO.setCardPrdId(this.h);
                            efIssuActCDTO.setDtaRecSno(this.i);
                            efIssuActCDTO.setAfltPrdId(this.j);
                            efIssuActCDTO.setCardStaCd(this.k);
                            efIssuActCDTO.setTrmApdu(new APDU(oTAData2005.getENCR_DTA(), ""));
                            LogHelper.d("TmoneyMemberOtaExecuter", "mCardStaCd:" + this.k);
                            if (a(dVar, efIssuActCDTO, true) && (bArrTransmitAPDU = dVar.transmitAPDU(getMemberShipData(Byte.parseByte(this.i)))) != null && bArrTransmitAPDU.length == 66) {
                                byte[] bArr = new byte[8];
                                System.arraycopy(bArrTransmitAPDU, 6, bArr, 0, 8);
                                String strBytesToHexString = com.tmoney.e.a.a.bytesToHexString(bArr);
                                LogHelper.d("TmoneyMemberOtaExecuter", "mCardStaCd:" + this.k);
                                LogHelper.d("TmoneyMemberOtaExecuter", "memberCardNo:" + strBytesToHexString);
                                LogHelper.d("TmoneyMemberOtaExecuter", "mCardPrdInhrNo:" + this.c);
                                if (TextUtils.equals(this.k, CodeConstants.MEMBERSHIP_STATE_CD.DELETE.getCode())) {
                                    if (strBytesToHexString.equals("0000000000000000")) {
                                        this.f9o = 0;
                                        this.p = "";
                                    } else {
                                        this.f9o = ResultDetailCode.MEMBERSHIP_DELETE_ERROR.getCode();
                                        rst_msg = this.w.getRST_MSG();
                                    }
                                } else if (TextUtils.equals(this.k, CodeConstants.MEMBERSHIP_STATE_CD.ISSUE.getCode())) {
                                    if (!TextUtils.equals(this.w.getRST_CD(), this.u)) {
                                        this.f9o = ResultDetailCode.MEMBERSHIP_ISSUE_ERROR.getCode();
                                        rst_msg = this.w.getRST_MSG();
                                    }
                                    this.f9o = 0;
                                    this.p = "";
                                }
                            } else {
                                this.f9o = ResultDetailCode.SERVER.getCode();
                                rst_msg = this.w.getRST_MSG();
                            }
                            rst_cd = this.w.getTL_PRRS_CD();
                            message = a(rst_msg, rst_cd);
                        } else {
                            resultDetailCode = ResultDetailCode.NETWORK;
                        }
                    } else if (!TextUtils.equals(rst_cd2, this.r)) {
                        this.f9o = ResultDetailCode.SERVER.getCode();
                        rst_msg = oTAData2001.getRST_MSG();
                        rst_cd = oTAData2001.getRST_CD();
                        message = a(rst_msg, rst_cd);
                    } else {
                        int i3 = onWarmupCompleted + 55;
                        onNavigationEvent = i3 % 128;
                        if (i3 % 2 != 0) {
                            this.f9o = ResultDetailCode.ALREADY_ISSUE.getCode();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        resultDetailCode = ResultDetailCode.ALREADY_ISSUE;
                    }
                    this.p = message;
                    i = onNavigationEvent + 51;
                    onWarmupCompleted = i % 128;
                    if (i % 2 == 0) {
                        int i4 = 3 % 5;
                    }
                } else {
                    resultDetailCode = ResultDetailCode.NETWORK;
                }
                this.f9o = resultDetailCode.getCode();
                message = resultDetailCode.getMessage();
                this.p = message;
                i = onNavigationEvent + 51;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                }
            } catch (Exception unused) {
                ResultDetailCode resultDetailCode2 = ResultDetailCode.UNKNOWN;
                this.f9o = resultDetailCode2.getCode();
                this.p = resultDetailCode2.getMessage();
            }
        } else {
            this.f9o = 31;
            this.p = "";
        }
        int i5 = this.f9o;
        String str = this.p;
        LogHelper.d("TmoneyMemberOtaExecuter", "resultCode:" + i5);
        if (i5 == 0) {
            int i6 = onWarmupCompleted + 109;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            message2 = TmoneyCallback.ResultType.SUCCESS;
            int i8 = onWarmupCompleted + 87;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        } else {
            message2 = TmoneyCallback.ResultType.WARNING.setError(ResultError.ISSUE_ERROR).setDetailCode(String.valueOf(i5)).setMessage(str);
        }
        onResult(message2);
        return 0;
    }

    public final byte[] getMemberShipData(byte b) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        byte[] bArr = {-112, 120, b, 1, 64};
        int i5 = i3 + 81;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    private static void y(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 91;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(j), ExpandableListView.getPackedPositionChild(j) + 27, 23139 - Color.blue(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    int i7 = $11 + 57;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 4 % 4;
                    }
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), (ViewConfiguration.getScrollBarSize() >> 8) + 26, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i9 = $10 + 83;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24823 - ((byte) KeyEvent.getModifierMetaStateMask())), 74 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getScrollBarSize() >> 8) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), KeyEvent.normalizeMetaState(0) + 30, 19488 - (ViewConfiguration.getFadingEdgeLength() >> 16), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        } else {
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                            int i16 = $10 + 7;
                            $11 = i16 % 128;
                            int i17 = i16 % 2;
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}
