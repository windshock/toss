package com.tmoney.g;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.lguplus.usimlib.AgentStateListener;
import com.lguplus.usimlib.CommonApiRequestListener;
import com.lguplus.usimlib.TsmClient;
import com.lguplus.usimlib.TsmClientConnectListener;
import com.lguplus.usimlib.TsmClientRequestListener;
import com.lguplus.usimlib.TsmRequest;
import com.lguplus.usimlib.TsmResponse;
import com.lguplus.usimlib.TsmUtil;
import com.tmoney.TmoneyMsg;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;
import com.tmoney.utils.PackageHelper;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class f extends com.tmoney.g.a {
    public static final String TAG = "UsimLguTsm";
    private static volatile f e;
    private static TsmClient f;
    private final String b;
    private final int c;
    private final String d;
    private Timer g;
    public boolean isCreted;
    public boolean needUicc;

    final class a extends TimerTask {
        private a() {
        }

        /* synthetic */ a(f fVar, byte b) {
            this();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            f.this.f();
            LogHelper.ew(f.TAG, "init time over");
            f fVar = f.this;
            fVar.a(false, fVar.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT, ResultDetailCode.USIM_TIMEOUT));
        }
    }

    private f(Context context) {
        super(context);
        this.b = "D4100000030001";
        this.c = 3000;
        this.d = "0000";
        this.g = null;
        this.isCreted = false;
        this.needUicc = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        LogHelper.d(TAG, "lguCheckAgentState " + i);
        if (i != 2002) {
            f();
        }
        if (i == 2000) {
            if (isCheckTelecomUicc()) {
                e();
                return;
            } else {
                c();
                return;
            }
        }
        if (i == 2003) {
            a(false, makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_NEED_REBOOT, ResultDetailCode.LGU_USIM_REBOOT, "[U" + i + "]"));
            return;
        }
        if (i == 2001 || i == 7806) {
            a(false, makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_UNSUPPORT, ResultDetailCode.LGU_USIM_UNUSABLE, "[U" + i + "]"));
            return;
        }
        if (i == 2004) {
            a(false, makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_UNSUPPORT, ResultDetailCode.LGU_USIM_UNUSABLE_FROM_SERVER, "[U" + i + "]"));
            return;
        }
        if (i == 2006) {
            a(false, makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_UNSUPPORT, ResultDetailCode.LGU_USIM_SMSGW_SMSC_UNSUPPORTED, "[U" + i + "]"));
            return;
        }
        if (i != 2002) {
            a(false, TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT.setCode(i, 0).setMessage(TmoneyMsg.getLguMessage(i)));
            LogHelper.ew(TAG, "requestAgentState::" + i, CodeConstants.E_SAVEAPPLOG.CREATE);
            return;
        }
        b(120000);
        a(false, makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_LGU_WAITING, ResultDetailCode.LGU_USIM_WAITING, "[U" + i + "]"));
    }

    static /* synthetic */ void a(f fVar, String str) throws Throwable {
        String upperCase = str.toUpperCase();
        if (!TextUtils.equals(upperCase, "EX23")) {
            fVar.a(false, fVar.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT, ResultDetailCode.LGU_USIM_COMMONAPI).setMessage(TmoneyMsg.getLguMessage(upperCase)));
            LogHelper.ew(TAG, "commonApiError::" + upperCase, CodeConstants.E_SAVEAPPLOG.CREATE);
            return;
        }
        fVar.a(false, fVar.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_NEED_REBOOT, ResultDetailCode.LGU_USIM_REBOOT, "[U" + upperCase + "]"));
    }

    private void b(int i) {
        f();
        this.g = new Timer();
        LogHelper.ew(TAG, "start init timer for ara");
        this.g.schedule(new TimerTask() { // from class: com.tmoney.g.f.7
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                f.this.f();
                LogHelper.ew(f.TAG, "init time over for ara");
                f fVar = f.this;
                fVar.a(false, fVar.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT, ResultDetailCode.USIM_TIMEOUT));
            }
        }, 120000L, 120000L);
    }

    static /* synthetic */ void b(f fVar) {
        LogHelper.d(TAG, "create_connectionToService() isCreted " + fVar.isCreted);
        Context context = fVar.getContext();
        com.tmoney.g.b.a aVar = com.tmoney.g.b.a.getInstance(context);
        byte b = 0;
        try {
            TsmClient tsmClient = new TsmClient(context);
            f = tsmClient;
            tsmClient.setServerType(0);
            f.setClientId(aVar.getLguClientId());
            f.setAppKey(aVar.getLguAppKey());
            f.setUiccIdEncKey(aVar.getLguUiccIdEncKey());
            LogHelper.d(TAG, "create_connectionToService() :: uicc id key :  " + aVar.getLguUiccIdEncKey());
            f.setRequestListener(new TsmClientRequestListener() { // from class: com.tmoney.g.f.3
                public final void onProgressChanged(JSONObject jSONObject) {
                    LogHelper.ew(f.TAG, "onProgressChanged " + jSONObject.toString());
                }

                public final void onRequestStopped(TsmRequest tsmRequest, TsmResponse tsmResponse) throws JSONException {
                    LogHelper.d(f.TAG, "onRequestStopped tsmResponse [" + tsmResponse.toString() + "]");
                    if (!TextUtils.equals("0000", tsmResponse.getErrorCode())) {
                        f fVar2 = f.this;
                        fVar2.a(false, fVar2.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT, ResultDetailCode.USIM_CHANNEL));
                        LogHelper.dw(f.TAG, "onRequestStopped:" + tsmResponse.getErrorCode(), CodeConstants.E_SAVEAPPLOG.CREATE);
                        return;
                    }
                    try {
                        String string = tsmResponse.getString("lifecycle");
                        LogHelper.ew(f.TAG, ">>>>> lifecycle " + string);
                        if (TextUtils.equals("LOCKED", string)) {
                            f fVar3 = f.this;
                            fVar3.a(false, fVar3.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_LOCK, ResultDetailCode.NEED_ENABLE));
                        } else if (f.this.isCheckTelecomUicc()) {
                            f.c(f.this);
                        } else {
                            f.this.c();
                        }
                    } catch (Exception e2) {
                        LogHelper.ew(f.TAG, "onRequestStopped::" + LogHelper.printStackTraceToString(e2));
                        f fVar4 = f.this;
                        fVar4.a(false, fVar4.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT, ResultDetailCode.USIM_EXCEPTION).setLog(e2.getMessage()));
                    }
                }
            });
            f.setConnectListener(new TsmClientConnectListener() { // from class: com.tmoney.g.f.4
                public final void onServiceConnectFail() {
                    f fVar2 = f.this;
                    fVar2.a(false, fVar2.makeResult(TmoneyMsg.TmoneyResult.AJAX_FAIL_SEND, ResultDetailCode.NETWORK));
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onServiceConnected() {
                    Exception e2;
                    boolean zOpenChannel;
                    f.this.f();
                    if (DeviceInfoHelper.hasEmbeddedUsim(f.this.a)) {
                        LogHelper.d(f.TAG, "setSubscriptionId(" + DeviceInfoHelper.getUsimSubscriptionId(f.this.a) + ")");
                        f.f.setSubscriptionId(DeviceInfoHelper.getUsimSubscriptionId(f.this.a));
                    }
                    try {
                        zOpenChannel = f.f.openChannel("D4100000030001");
                    } catch (Exception e3) {
                        e2 = e3;
                        zOpenChannel = false;
                    }
                    try {
                        f.f.closeChannel();
                        LogHelper.d(f.TAG, "isOpenChannel::" + zOpenChannel);
                    } catch (Exception e4) {
                        e2 = e4;
                        LogHelper.d(f.TAG, e2.getMessage());
                        if (zOpenChannel) {
                        }
                        if (f.f != null) {
                        }
                    }
                    if (zOpenChannel) {
                        f fVar2 = f.this;
                        if ((fVar2.isCreted || !fVar2.needUicc) && (!fVar2.isCheckTelecomUicc() || !f.this.needUicc)) {
                            f.this.c();
                            return;
                        }
                    }
                    if (f.f != null) {
                        f fVar3 = f.this;
                        fVar3.a(false, fVar3.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT, ResultDetailCode.USIM_EXCEPTION));
                        return;
                    }
                    try {
                        f.f.requestAppletStatus("D4100000030001");
                    } catch (Exception e5) {
                        LogHelper.d(f.TAG, "requestAppletStatus()>>" + e5.getMessage());
                        f fVar4 = f.this;
                        fVar4.a(false, fVar4.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT, ResultDetailCode.USIM_EXCEPTION));
                    }
                }
            });
            fVar.f();
            fVar.g = new Timer();
            LogHelper.ew(TAG, "start init timer");
            fVar.g.schedule(new a(fVar, b), 3000L, 3000L);
            f.connectToService();
        } catch (Exception e2) {
            fVar.a(false, fVar.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT, ResultDetailCode.USIM_EXCEPTION).setLog(e2.getMessage()));
            LogHelper.exception(TAG, "create", e2, CodeConstants.E_SAVEAPPLOG.CREATE);
        }
    }

    private boolean b() {
        LogHelper.d(TAG, ">>>check agent version");
        PackageManager packageManager = this.a.getPackageManager();
        if (PackageHelper.isExistApp(this.a, "com.lguplus.tsmproxy")) {
            try {
                int i = packageManager.getPackageInfo("com.lguplus.tsmproxy", 128).versionCode;
                LogHelper.d(TAG, "U+ Agent verCode[" + i + "]");
                if (i >= 40206) {
                    return true;
                }
                a(false, makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_LGU_UPDATE_AGENT, ResultDetailCode.LGU_USIM_AGENT));
                return false;
            } catch (Exception e2) {
                LogHelper.e(TAG, "checkInstalledAgentVersionn::" + LogHelper.printStackTraceToString(e2));
            }
        }
        a(false, makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_LGU_UPDATE_AGENT, ResultDetailCode.LGU_USIM_AGENT));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.isCreted = true;
        try {
            int uICCState = f.getUICCState();
            LogHelper.d(TAG, "getUICCState : " + uICCState);
            if (uICCState == 3000) {
                a(true, TmoneyMsg.TmoneyResult.SUCCESS);
                return;
            }
            LogHelper.exception(TAG, "create", null, CodeConstants.E_SAVEAPPLOG.CREATE);
            a(false, TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT.setLog("getUICCState : " + uICCState));
        } catch (Exception e2) {
            a(false, makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT, ResultDetailCode.USIM_EXCEPTION).setLog(e2.getMessage()));
        }
    }

    static /* synthetic */ void c(f fVar) {
        LogHelper.d(TAG, "create_requestAgentState() ---> ");
        f.setStateListener(new AgentStateListener() { // from class: com.tmoney.g.f.5
            public final void onProgressChanged(JSONObject jSONObject) throws JSONException {
                try {
                    LogHelper.d(f.TAG, "create_requestAgentState() :: onProgressChanged : progress=" + jSONObject.getString("progress") + " , msg=" + jSONObject.getString("msg"));
                } catch (Exception e2) {
                    LogHelper.d(f.TAG, "create_requestAgentState() :: onProgressChanged :EXCEPTION");
                    f fVar2 = f.this;
                    fVar2.a(false, fVar2.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT, ResultDetailCode.USIM_EXCEPTION).setLog(e2.getMessage()));
                }
            }

            public final void onRequestState(int i) {
                f.this.a(i);
            }
        });
        int iRequestAgentState = f.requestAgentState();
        LogHelper.d(TAG, "create_requestAgentState() :: state = " + iRequestAgentState);
        fVar.a(iRequestAgentState);
    }

    public static void clear() {
        e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tmoney.g.f.2
            @Override // java.lang.Runnable
            public final void run() {
                f.b(f.this);
            }
        });
    }

    private void e() {
        f.setCommonApiAuthKey("SmV+SLqiUFCfp2tWadwAtuqymDMku7/gohqD/3W6RJ4=");
        f.setCommonApiListener(new CommonApiRequestListener() { // from class: com.tmoney.g.f.6
            public final void onError(JSONObject jSONObject) throws Throwable {
                LogHelper.d(f.TAG, "onError()  =  " + jSONObject);
                try {
                    f.a(f.this, jSONObject.getString("errorCode"));
                } catch (JSONException e2) {
                    LogHelper.ew(f.TAG, "onError::" + LogHelper.printStackTraceToString(e2));
                    f fVar = f.this;
                    fVar.a(false, fVar.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT, ResultDetailCode.USIM_EXCEPTION).setLog(e2.getMessage()));
                }
            }

            public final void onRequestDeviceId(String str) {
                LogHelper.d(f.TAG, "onRequestDeviceId()  =  " + str);
            }

            public final void onRequestIccId(String str) {
                LogHelper.d(f.TAG, "onRequestIccId()  =  " + str);
                f.this.a(com.tmoney.g.a.STR_UICC, str);
                f.this.c();
            }

            public final void onRequestImei(String str) {
                LogHelper.d(f.TAG, "onRequestImei()  =  " + str);
            }

            public final void onRequestMeid(String str) {
                LogHelper.d(f.TAG, "onRequestMeid()  =  " + str);
            }

            public final void onRequestSerial(String str) {
                LogHelper.d(f.TAG, "onRequestSerial()  =  " + str);
            }

            public final void onRequestSimSerialNumber(String str) {
                LogHelper.d(f.TAG, "onRequestSimSerialNumber() ---> uicc =  " + str);
                f.this.a(com.tmoney.g.a.STR_UICC, str);
                f.this.c();
            }

            public final void onRequestSubscriberId(String str) {
                LogHelper.d(f.TAG, "onRequestSubscriberId()  =  " + str);
            }
        });
        LogHelper.d(TAG, "requestUiccId()  --->  ");
        try {
            if (DeviceInfoHelper.hasEmbeddedUsim(this.a)) {
                int usimSubscriptionId = DeviceInfoHelper.getUsimSubscriptionId(this.a);
                LogHelper.d(TAG, "requestIccIdBySubscriptionId=" + usimSubscriptionId);
                if (usimSubscriptionId > 0) {
                    f.requestIccIdBySubscriptionId(usimSubscriptionId);
                    return;
                }
            }
            f.requestSimSerialNumber();
        } catch (Exception e2) {
            LogHelper.ew(TAG, "getUicc::" + LogHelper.printStackTraceToString(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        try {
            if (this.g == null) {
                return;
            }
            LogHelper.ew(TAG, "stop init timer");
            this.g.cancel();
            this.g = null;
        } catch (Exception e2) {
            LogHelper.ew(TAG, "stopBindTimerTask::" + LogHelper.printStackTraceToString(e2));
        }
    }

    public static f getInstance(Context context) {
        if (e == null) {
            synchronized (f.class) {
                if (e == null) {
                    e = new f(context);
                }
            }
        }
        return e;
    }

    @Override // com.tmoney.g.a
    public void close() {
        if (f != null) {
            try {
                LogHelper.d(TAG, "closeChannel");
                f.closeChannel();
            } catch (Exception e2) {
                LogHelper.exception(TAG, "close", e2, CodeConstants.E_SAVEAPPLOG.CLOSE);
            }
        }
    }

    @Override // com.tmoney.g.a
    public void create(Map<String, Object> map) {
        this.needUicc = ((Boolean) map.get("needUicc")).booleanValue();
        LogHelper.d(TAG, "create() ---> ");
        LogHelper.d(TAG, "needUicc=" + this.needUicc);
        try {
            TsmClient tsmClient = f;
            if (tsmClient != null) {
                int uICCState = tsmClient.getUICCState();
                LogHelper.d(TAG, "create getUICCState:" + uICCState);
                if (uICCState == 3000) {
                    a(true, TmoneyMsg.TmoneyResult.SUCCESS);
                    return;
                }
            }
        } catch (Exception e2) {
            LogHelper.ew(TAG, e2.toString());
        }
        if (b()) {
            if (!isCheckTelecomUicc()) {
                LogHelper.d(TAG, "LGU : connection to server ...  ");
                d();
            } else {
                LogHelper.d(TAG, "LGU : req version check ");
                LogHelper.d(TAG, "create_requestVersionCheck() ---> ");
                TsmUtil.requestVersionCheck(getContext(), new TsmUtil.VersionCheckListener() { // from class: com.tmoney.g.f.1
                    public final void onVersionCheck(JSONObject jSONObject) throws JSONException {
                        f fVar;
                        TmoneyMsg.TmoneyResult tmoneyResult;
                        ResultDetailCode resultDetailCode;
                        StringBuilder sb;
                        LogHelper.d(f.TAG, "LGU : onVersionCheck : " + jSONObject.toString());
                        try {
                            int i = jSONObject.getInt("resultCode");
                            switch (i) {
                                case 1000:
                                    fVar = f.this;
                                    tmoneyResult = TmoneyMsg.TmoneyResult.AJAX_FAIL_SEND;
                                    resultDetailCode = ResultDetailCode.NETWORK;
                                    sb = new StringBuilder("[U");
                                    sb.append(i);
                                    sb.append("]");
                                    break;
                                case 1001:
                                    LogHelper.d(f.TAG, "LGU : connection to server ");
                                    f.this.d();
                                    return;
                                case 1002:
                                    fVar = f.this;
                                    tmoneyResult = TmoneyMsg.TmoneyResult.USIM_ERROR_LGU_UPDATE_AGENT;
                                    resultDetailCode = ResultDetailCode.LGU_USIM_AGENT;
                                    sb = new StringBuilder("[U");
                                    sb.append(i);
                                    sb.append("]");
                                    break;
                                case 1003:
                                    fVar = f.this;
                                    tmoneyResult = TmoneyMsg.TmoneyResult.USIM_ERROR_LGU_UPDATE_AGENT;
                                    resultDetailCode = ResultDetailCode.LGU_USIM_AGENT;
                                    sb = new StringBuilder("[U");
                                    sb.append(i);
                                    sb.append("]");
                                    break;
                                case 1004:
                                    fVar = f.this;
                                    tmoneyResult = TmoneyMsg.TmoneyResult.USIM_ERROR_LGU_UPDATE_AGENT;
                                    resultDetailCode = ResultDetailCode.LGU_USIM_AGENT;
                                    sb = new StringBuilder("[U");
                                    sb.append(i);
                                    sb.append("]");
                                    break;
                                default:
                                    f fVar2 = f.this;
                                    fVar2.a(false, fVar2.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT, ResultDetailCode.USIM_CREATE));
                                    LogHelper.dw(f.TAG, "requestVersionCheck:" + i, CodeConstants.E_SAVEAPPLOG.CREATE);
                                    return;
                            }
                            fVar.a(false, fVar.makeResult(tmoneyResult, resultDetailCode, sb.toString()));
                        } catch (Exception e3) {
                            f fVar3 = f.this;
                            fVar3.a(false, fVar3.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT, ResultDetailCode.USIM_EXCEPTION).setLog(e3.getMessage()));
                        }
                    }
                });
            }
        }
    }

    @Override // com.tmoney.g.a
    public void destroy() {
        TsmClient tsmClient = f;
        if (tsmClient != null) {
            try {
                tsmClient.stopRequest();
            } catch (Exception e2) {
                LogHelper.exception(TAG, "destroy:stopRequest", e2, CodeConstants.E_SAVEAPPLOG.DESTORY);
            }
            try {
                f.disconnectFromService();
            } catch (Exception e3) {
                LogHelper.exception(TAG, "destroy:disconnectFromService", e3, CodeConstants.E_SAVEAPPLOG.DESTORY);
            }
            f = null;
        }
        a(true);
    }

    @Override // com.tmoney.g.a
    public int getChannel() {
        return 0;
    }

    @Override // com.tmoney.g.a
    public boolean isCreated() {
        try {
            TsmClient tsmClient = f;
            if (tsmClient == null) {
                return false;
            }
            int uICCState = tsmClient.getUICCState();
            LogHelper.d(TAG, "isCreated getUICCState:" + uICCState);
            return uICCState == 3000;
        } catch (Exception e2) {
            LogHelper.d(TAG, e2.toString());
            return false;
        }
    }

    @Override // com.tmoney.g.a
    public int open() {
        return 0;
    }

    @Override // com.tmoney.g.a
    public byte[] transmit(byte[] bArr) throws Throwable {
        f();
        String strA = com.tmoney.g.a.a(bArr);
        LogHelper.d(TAG, "reqAPDU [" + strA + "]");
        String strA2 = null;
        if (f == null) {
            return null;
        }
        byte[] bArrTransmitApdu = {0};
        try {
            if (strA.contains("D4100000030001")) {
                boolean zOpenChannel = f.openChannel("D4100000030001");
                LogHelper.d(TAG, "openChannel:" + zOpenChannel);
                if (zOpenChannel) {
                    bArrTransmitApdu = f.getSelectResponse();
                } else {
                    this.isCreted = false;
                    strA = "TsmClient.openChannel";
                    strA2 = "failed";
                }
            } else {
                bArrTransmitApdu = f.transmitApdu(bArr);
            }
            LogHelper.d(TAG, "Transmit ret:" + com.tmoney.g.a.a(bArrTransmitApdu));
            if (TextUtils.isEmpty(strA2)) {
                strA2 = com.tmoney.g.a.a(bArrTransmitApdu);
            }
            CodeConstants.E_SAVEAPPLOG e_saveapplog = CodeConstants.E_SAVEAPPLOG.TRANSMIT;
            LogHelper.sendAppLog(TAG, strA, strA2, e_saveapplog);
            if (bArrTransmitApdu.length != 2 || bArrTransmitApdu[0] != 97) {
                return bArrTransmitApdu;
            }
            bArr = com.tmoney.a.a.getApduCmd(20, (byte) 0, (byte) 0, (byte) 0, 0, bArrTransmitApdu[1]);
            bArrTransmitApdu = f.transmitApdu(bArr);
            LogHelper.d(TAG, "Transmit ret2:" + com.tmoney.g.a.a(bArrTransmitApdu));
            LogHelper.sendAppLog(TAG, com.tmoney.g.a.a(bArr), com.tmoney.g.a.a(bArrTransmitApdu), e_saveapplog);
            return bArrTransmitApdu;
        } catch (Exception unused) {
            LogHelper.sendAppLog(TAG, com.tmoney.g.a.a(bArr), com.tmoney.g.a.a(bArrTransmitApdu), CodeConstants.E_SAVEAPPLOG.TRANSMIT);
            close();
            return bArrTransmitApdu;
        }
    }
}
