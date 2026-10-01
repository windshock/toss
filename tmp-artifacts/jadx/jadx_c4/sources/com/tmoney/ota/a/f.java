package com.tmoney.ota.a;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.TmoneyMsg;
import com.tmoney.kscc.sslio.a.O;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.ota.c.g;
import com.tmoney.ota.dto.APDU;
import com.tmoney.ota.dto.OTAData04;
import com.tmoney.ota.dto.OTAData05;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class f extends com.tmoney.g.a.a {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] IAuthTabCallback = {-951435170, -811216548, -1681855066, -594493663, 1216153055, -760990818, -1070209273, 687008612, -408911693, -940941055, -1722997722, 381967593, 218986070, 558720664, 143956146, 436669149, 486452474, -686369603};
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String a;
    private String b;
    private String c;
    private com.tmoney.ota.e.b d;
    private com.tmoney.ota.e.c e;
    private O f;
    private int g;
    private String h;
    private String i;

    public f(Context context, String str, String str2, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TmoneyReIssueExecuter";
        this.f = O.getInstance();
        this.b = str;
        this.c = str2;
        this.d = com.tmoney.ota.e.b.getInstance(getContext());
        this.e = new com.tmoney.ota.e.c(getContext());
    }

    private boolean a(com.tmoney.g.d dVar, OTAData04 oTAData04) throws Throwable {
        int i = 2 % 2;
        do {
            ArrayList<APDU> trm_apdu_val = oTAData04.getTRM_APDU_VAL();
            if (trm_apdu_val != null && trm_apdu_val.size() > 0) {
                for (int i2 = 0; i2 < trm_apdu_val.size(); i2++) {
                    int i3 = onNavigationEvent + 57;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    APDU apdu = trm_apdu_val.get(i2);
                    if ("Reset".equals(apdu.getCMD())) {
                        dVar.open();
                        if (dVar.getChannel() >= 0) {
                            apdu.setCMD("9000");
                            apdu.setSW(new String[]{"9000"});
                            int i5 = onWarmupCompleted + 119;
                            onNavigationEvent = i5 % 128;
                            int i6 = i5 % 2;
                        } else {
                            apdu.setCMD("");
                            apdu.setSW(new String[]{""});
                        }
                    } else {
                        String cmd = apdu.getCMD();
                        LogHelper.d("TmoneyReIssueExecuter", "transmitAPDU cmd:" + cmd);
                        String hexString = ByteHelper.toHexString(dVar.transmitAPDU(d(cmd)));
                        apdu.setCMD(hexString);
                        LogHelper.d("TmoneyReIssueExecuter", "result:" + hexString);
                    }
                }
            }
            LogHelper.d("TmoneyReIssueExecuter", "otaData04.getCARD_NO():" + oTAData04.getCARD_NO());
            ResponseBody responseBodyExecutePost = this.f.executePost(this.d.getUrl(), RequestBody.create(MediaType.parse("charset=utf-8"), this.e.getOTAPacket4(oTAData04.getISSU_REQ_SNO(), oTAData04.getISSU_REQ_SNO(), oTAData04.getHNDH_TEL_NO(), oTAData04.getTLCM_CD(), oTAData04.getCARD_NO(), oTAData04.getDUTY_DVS_CD(), oTAData04.getCARD_PRD_ID(), oTAData04.getPBCM_CD(), oTAData04.getCAPP_SVC_ID(), trm_apdu_val).makePacket()));
            if (responseBodyExecutePost != null) {
                oTAData04 = (OTAData04) new com.tmoney.ota.c.f(responseBodyExecutePost.bytes()).execute();
                String rst_cd = oTAData04.getRST_CD();
                Object[] objArr = new Object[1];
                u(new int[]{-912415343, -130695555}, (KeyEvent.getMaxKeyCode() >> 16) + 1, objArr);
                if (TextUtils.equals(rst_cd, ((String) objArr[0]).intern())) {
                }
            }
            return false;
        } while ("Y".equals(oTAData04.getRTRM_YN()));
        dVar.close();
        return true;
    }

    private static byte[] d(String str) {
        int i = 2 % 2;
        if (str == null) {
            return null;
        }
        int i2 = onWarmupCompleted + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (str.length() == 0) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 << 1;
            bArr[i4] = (byte) Integer.parseInt(str.substring(i5, i5 + 2), 16);
            i4++;
            int i6 = onNavigationEvent + 99;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        return bArr;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(8:57|4|(2:6|(2:8|(2:10|(3:12|13|(2:28|29)(4:16|17|(1:19)(1:20)|21))(5:22|23|62|24|25))(0))(1:30))(0)|60|36|(2:38|(4:40|41|58|42)(1:47))(3:48|(1:50)|51)|52|56)(1:34)|35|60|36|(0)(0)|52|56) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01e5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e6, code lost:
    
        com.tmoney.utils.LogHelper.exception("TmoneyReIssueExecuter", r0);
        r0 = com.tmoney.ota.a.f.onNavigationEvent + 125;
        com.tmoney.ota.a.f.onWarmupCompleted = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0156 A[Catch: Exception -> 0x015f, TRY_LEAVE, TryCatch #0 {Exception -> 0x015f, blocks: (B:4:0x0039, B:6:0x0061, B:8:0x00c2, B:12:0x0105, B:17:0x011b, B:19:0x0121, B:21:0x013f, B:20:0x013b, B:22:0x0143, B:24:0x014b, B:25:0x014e, B:29:0x0153, B:30:0x0156), top: B:57:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ab A[Catch: Exception -> 0x01e5, TryCatch #2 {Exception -> 0x01e5, blocks: (B:36:0x0190, B:40:0x019f, B:42:0x01a3, B:52:0x01e1, B:47:0x01a8, B:48:0x01ab, B:50:0x01b3, B:51:0x01c3), top: B:60:0x0190 }] */
    @Override // com.tmoney.g.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) throws Throwable {
        String str;
        TmoneyCallback.ResultType log;
        int i = 2 % 2;
        this.g = 10;
        this.h = "";
        this.i = "";
        String simSerialNumber = DeviceInfoHelper.getSimSerialNumber(getContext());
        String line1NumberLocaleRemove = DeviceInfoHelper.getLine1NumberLocaleRemove(getContext());
        String otaTelecom = DeviceInfoHelper.getOtaTelecom(getContext());
        this.d.setOtaInfo("");
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            try {
                String strMakePacket = this.e.getOTAPacket5(DeviceInfoHelper.getOtaIssuReqSno(getContext()), simSerialNumber, line1NumberLocaleRemove, otaTelecom).makePacket();
                String url = this.d.getUrl();
                ResponseBody responseBodyExecutePost = this.f.executePost(url, RequestBody.create(MediaType.parse("charset=utf-8"), strMakePacket));
                if (responseBodyExecutePost != null) {
                    OTAData05 oTAData05 = (OTAData05) new g(responseBodyExecutePost.bytes()).execute();
                    APDU apdu = new APDU(oTAData05.getENCR_DTA(), "");
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(apdu);
                    ResponseBody responseBodyExecutePost2 = this.f.executePost(url, RequestBody.create(MediaType.parse("charset=utf-8"), this.e.getOTAPacket4(oTAData05.getISSU_REQ_SNO(), oTAData05.getISSU_REQ_SNO(), oTAData05.getHNDH_TEL_NO(), oTAData05.getTLCM_CD(), this.b, this.c, "", "", "", arrayList).makePacket()));
                    if (responseBodyExecutePost2 != null) {
                        OTAData04 oTAData04 = (OTAData04) new com.tmoney.ota.c.f(responseBodyExecutePost2.bytes()).execute();
                        String rst_cd = oTAData04.getRST_CD();
                        Object[] objArr = new Object[1];
                        u(new int[]{-912415343, -130695555}, 1 - View.resolveSizeAndState(0, 0, 0), objArr);
                        if (TextUtils.equals(rst_cd, ((String) objArr[0]).intern())) {
                            int i2 = onWarmupCompleted + 5;
                            onNavigationEvent = i2 % 128;
                            if (i2 % 2 != 0) {
                                "Y".equals(oTAData04.getRTRM_YN());
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            if (!"Y".equals(oTAData04.getRTRM_YN())) {
                                this.g = 10;
                            } else {
                                int i3 = onNavigationEvent + 31;
                                onWarmupCompleted = i3 % 128;
                                int i4 = i3 % 2;
                                if (a(dVar, oTAData04)) {
                                    this.g = 0;
                                    this.d.setOtaInfo(simSerialNumber + line1NumberLocaleRemove + otaTelecom);
                                } else {
                                    this.g = 10;
                                }
                                dVar.close();
                            }
                        }
                    } else {
                        this.g = 55;
                        this.i = "OTA::Null";
                    }
                }
            } catch (Exception e) {
                LogHelper.exception("TmoneyReIssueExecuter", e);
                this.g = 55;
                str = "OTA::" + e.getMessage();
            }
            if (this.g != 0) {
                int i5 = onWarmupCompleted + 21;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    log = TmoneyCallback.ResultType.SUCCESS;
                    int i6 = 48 / 0;
                } else {
                    log = TmoneyCallback.ResultType.SUCCESS;
                }
            } else {
                if ("".equals(this.h)) {
                    this.h = TmoneyMsg.makeMessage("OTA", this.g, TmoneyMsg.TmoneyResult.OTA_ERROR_KSCC.getMessage());
                }
                log = TmoneyCallback.ResultType.WARNING.setError(ResultError.ISSUE_ERROR).setDetailCode(String.valueOf(this.g)).setMessage(this.h).setLog(this.i);
            }
            onResult(log);
            return 0;
        }
        this.g = 31;
        str = "OTA:" + resultType.getMessage();
        this.i = str;
        if (this.g != 0) {
        }
        onResult(log);
        return 0;
    }

    private static void u(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = IAuthTabCallback;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $10 + 1;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 65;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 71 - ExpandableListView.getPackedPositionChild(0L), TextUtils.getTrimmedLength("") + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallback;
        if (iArr5 != null) {
            int i10 = $11 + 47;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $11 + 87;
                $10 = i13 % 128;
                if (i13 % i2 != 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr5[i12]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 72, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i12 >>= 1;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), TextUtils.indexOf("", "", 0) + 72, View.MeasureSpec.getMode(0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i12++;
                }
                i2 = 2;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i14 = i5;
        System.arraycopy(iArr5, i14, iArr4, i14, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i14;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i14] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i15 = 0; i15 < 16; i15++) {
                int i16 = $10 + 49;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22252), 39 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.getOffsetAfter("", 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4034 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.indexOf("", "") + 78, TextUtils.indexOf("", "", 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            int i21 = $11 + 23;
            $10 = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 4 / 2;
            }
            i14 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
