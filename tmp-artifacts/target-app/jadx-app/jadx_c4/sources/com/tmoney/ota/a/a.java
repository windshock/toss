package com.tmoney.ota.a;

import android.content.Context;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.TmoneyMsg;
import com.tmoney.kscc.sslio.a.O;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.ota.c.g;
import com.tmoney.ota.dto.APDU;
import com.tmoney.ota.dto.OTAData03;
import com.tmoney.ota.dto.OTAData05;
import com.tmoney.ota.dto.Product;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class a extends com.tmoney.g.a.a {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long onExtraCallbackWithResult = -6757960308493645433L;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String a;
    private Product b;
    private com.tmoney.ota.e.b c;
    private com.tmoney.ota.e.c d;
    private O e;
    private int f;
    private String g;
    private String h;

    public a(Context context, Product product, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TmoneyIssueExecuter";
        this.b = product;
        this.c = com.tmoney.ota.e.b.getInstance(getContext());
        this.d = new com.tmoney.ota.e.c(getContext());
        this.e = O.getInstance();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x018e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(com.tmoney.g.d dVar, OTAData03 oTAData03) throws Throwable {
        int i = 2 % 2;
        while (true) {
            ArrayList<APDU> trm_apdu_val = oTAData03.getTRM_APDU_VAL();
            if (trm_apdu_val != null) {
                int i2 = onWarmupCompleted + 67;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    trm_apdu_val.size();
                    throw null;
                }
                if (trm_apdu_val.size() > 0) {
                    for (int i3 = 0; i3 < trm_apdu_val.size(); i3++) {
                        APDU apdu = trm_apdu_val.get(i3);
                        if ("Reset".equals(apdu.getCMD())) {
                            dVar.open();
                            if (dVar.getChannel() >= 0) {
                                int i4 = onNavigationEvent + 7;
                                onWarmupCompleted = i4 % 128;
                                int i5 = i4 % 2;
                                apdu.setCMD("9000");
                                if (i5 == 0) {
                                    String[] strArr = new String[0];
                                    strArr[0] = "9000";
                                    apdu.setSW(strArr);
                                } else {
                                    apdu.setSW(new String[]{"9000"});
                                }
                            } else {
                                apdu.setCMD("");
                                apdu.setSW(new String[]{""});
                            }
                        } else {
                            String cmd = apdu.getCMD();
                            LogHelper.d("TmoneyIssueExecuter", "transmitAPDU cmd:" + cmd);
                            String hexString = ByteHelper.toHexString(dVar.transmitAPDU(d(cmd)));
                            apdu.setCMD(hexString);
                            LogHelper.d("TmoneyIssueExecuter", "result:" + hexString);
                        }
                    }
                }
            }
            LogHelper.d("TmoneyIssueExecuter", "otaData03.getCARD_NO():" + oTAData03.getCARD_NO());
            TmoneyData.getInstance(getContext()).setCardNumber(oTAData03.getCARD_NO());
            ResponseBody responseBodyExecutePost = this.e.executePost(this.c.getUrl(), RequestBody.create(MediaType.parse("charset=utf-8"), this.d.getOTAPacket3(oTAData03.getISSU_REQ_SNO(), oTAData03.getISSU_REQ_SNO(), oTAData03.getHNDH_TEL_NO(), oTAData03.getTLCM_CD(), oTAData03.getCARD_NO(), this.b.getCARD_PRD_ID(), this.b.getPBCM_CD(), this.b.getCAPP_SVC_ID(), trm_apdu_val).makePacket()));
            if (responseBodyExecutePost == null) {
                break;
            }
            oTAData03 = (OTAData03) new com.tmoney.ota.c.e(responseBodyExecutePost.bytes()).execute();
            String rst_cd = oTAData03.getRST_CD();
            Object[] objArr = new Object[1];
            u(new char[]{55899, 22465, 55914, 8458, 55287}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, objArr);
            if (!TextUtils.equals(rst_cd, ((String) objArr[0]).intern())) {
                LogHelper.d("TmoneyIssueExecuter", "OTA FAIL RST_CD is 0 : " + oTAData03.getRST_MSG());
                break;
            }
            int i6 = onWarmupCompleted + 81;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                if (!"Y".equals(oTAData03.getRTRM_YN())) {
                    break;
                }
            } else {
                int i7 = 82 / 0;
                if (!"Y".equals(oTAData03.getRTRM_YN())) {
                    break;
                }
            }
        }
        int i8 = onNavigationEvent + 29;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    private static byte[] d(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 63;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (str == null) {
            return null;
        }
        int i5 = i2 + 79;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        if (str.length() == 0) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        int i7 = onWarmupCompleted + 75;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = i9 << 1;
            bArr[i9] = (byte) Integer.parseInt(str.substring(i10, i10 + 2), 16);
        }
        return bArr;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(10:4|48|5|(2:7|(2:9|(2:11|(2:13|14)(8:15|16|(1:18)|46|32|(2:34|35)(3:36|(2:38|39)|40)|41|45))(2:19|20))(2:21|22))(3:23|24|25)|26|46|32|(0)(0)|41|45)(1:30)|31|46|32|(0)(0)|41|45) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01fb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01fc, code lost:
    
        com.tmoney.utils.LogHelper.exception("TmoneyIssueExecuter", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b8 A[Catch: Exception -> 0x01fb, TRY_LEAVE, TryCatch #0 {Exception -> 0x01fb, blocks: (B:32:0x01a8, B:35:0x01b5, B:41:0x01f7, B:36:0x01b8, B:39:0x01c9, B:40:0x01d9), top: B:46:0x01a8 }] */
    @Override // com.tmoney.g.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) throws Throwable {
        String str;
        TmoneyCallback.ResultType log;
        ResponseBody responseBodyExecutePost;
        String str2;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super.execute(dVar, resultType);
        this.f = 10;
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            int i4 = onWarmupCompleted + 103;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            String simSerialNumber = DeviceInfoHelper.getSimSerialNumber(getContext());
            String line1NumberLocaleRemove = DeviceInfoHelper.getLine1NumberLocaleRemove(getContext());
            String otaTelecom = DeviceInfoHelper.getOtaTelecom(getContext());
            this.c.setOtaInfo("");
            String url = this.c.getUrl();
            try {
                responseBodyExecutePost = this.e.executePost(url, RequestBody.create(MediaType.parse("charset=utf-8"), this.d.getOTAPacket5(DeviceInfoHelper.getOtaIssuReqSno(getContext()), simSerialNumber, line1NumberLocaleRemove, otaTelecom).makePacket()));
            } catch (Exception e) {
                this.f = 52;
                str = "OTA_5" + e.getMessage();
            }
            if (responseBodyExecutePost != null) {
                OTAData05 oTAData05 = (OTAData05) new g(responseBodyExecutePost.bytes()).execute();
                APDU apdu = new APDU(oTAData05.getENCR_DTA(), "");
                ArrayList arrayList = new ArrayList();
                arrayList.add(apdu);
                ResponseBody responseBodyExecutePost2 = this.e.executePost(url, RequestBody.create(MediaType.parse("charset=utf-8"), this.d.getOTAPacket3(oTAData05.getISSU_REQ_SNO(), oTAData05.getISSU_REQ_SNO(), oTAData05.getHNDH_TEL_NO(), oTAData05.getTLCM_CD(), "0000000000000000", this.b.getCARD_PRD_ID(), this.b.getPBCM_CD(), this.b.getCAPP_SVC_ID(), arrayList).makePacket()));
                if (responseBodyExecutePost2 != null) {
                    OTAData03 oTAData03 = (OTAData03) new com.tmoney.ota.c.e(responseBodyExecutePost2.bytes()).execute();
                    String rst_cd = oTAData03.getRST_CD();
                    Object[] objArr = new Object[1];
                    u(new char[]{55899, 22465, 55914, 8458, 55287}, 1 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
                    if (!TextUtils.equals(rst_cd, ((String) objArr[0]).intern())) {
                        LogHelper.d("TmoneyIssueExecuter", "OTA FAIL RST_CD is 0 : " + oTAData03.getRST_MSG());
                        this.f = 10;
                        str2 = "OTA_2";
                    } else {
                        if (!(!"Y".equals(oTAData03.getRTRM_YN()))) {
                            int i6 = onNavigationEvent + 99;
                            onWarmupCompleted = i6 % 128;
                            int i7 = i6 % 2;
                            if (a(dVar, oTAData03)) {
                                this.f = 0;
                                this.c.setOtaInfo(simSerialNumber + line1NumberLocaleRemove + otaTelecom);
                            }
                            if (this.f == 0) {
                                int i8 = onNavigationEvent + 41;
                                onWarmupCompleted = i8 % 128;
                                int i9 = i8 % 2;
                                log = TmoneyCallback.ResultType.SUCCESS;
                            } else {
                                if (TextUtils.isEmpty(this.g)) {
                                    int i10 = onNavigationEvent + 95;
                                    onWarmupCompleted = i10 % 128;
                                    int i11 = i10 % 2;
                                    this.g = TmoneyMsg.makeMessage("OTA", this.f, TmoneyMsg.TmoneyResult.OTA_ERROR_KSCC.getMessage());
                                }
                                log = TmoneyCallback.ResultType.WARNING.setError(ResultError.ISSUE_ERROR).setDetailCode(String.valueOf(this.f)).setMessage(this.g).setLog(this.h);
                            }
                            onResult(log);
                            return 0;
                        }
                        this.f = 10;
                        int i12 = onNavigationEvent + 1;
                        onWarmupCompleted = i12 % 128;
                        int i13 = i12 % 2;
                        str2 = "OTA_1";
                    }
                } else {
                    this.f = 10;
                    str2 = "OTA_3";
                }
            } else {
                this.f = 52;
                str2 = "OTA_4";
            }
            this.h = str2;
            if (this.f == 0) {
            }
            onResult(log);
            return 0;
        }
        this.f = 31;
        str = "OTA_6" + resultType.getMessage();
        this.h = str;
        if (this.f == 0) {
        }
        onResult(log);
        return 0;
    }

    private static void u(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 53;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45860 - AndroidCharacter.getMirror('0')), 84 - TextUtils.indexOf("", ""), TextUtils.getCapsMode("", 0, 0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - ExpandableListView.getPackedPositionType(0L)), 19 - TextUtils.indexOf("", ""), AndroidCharacter.getMirror('0') + 8760, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 75;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }
}
