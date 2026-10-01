package com.tmoney.g;

import android.content.Context;
import android.text.TextUtils;
import com.skp.smarttouch.sem.SEManagerConnection;
import com.skp.smarttouch.sem.applet.SEIO;
import com.skp.smarttouch.sem.tools.common.APIResultCode;
import com.skp.smarttouch.sem.tools.dao.SEMDispatchData;
import com.skp.smarttouch.sem.tools.dao.SEMResultData;
import com.skt.usp.UCPManagerConnection;
import com.skt.usp.telco.UCPUtility;
import com.skt.usp.tools.common.APITypeCode;
import com.skt.usp.tools.common.UCPException;
import com.skt.usp.tools.dao.UCPAuthInfo;
import com.skt.usp.tools.dao.UCPResultData;
import com.skt.usp.ucp.api.UCPTelephony;
import com.skt.usp.ucp.auth.UCPAuth;
import com.tmoney.TmoneyMsg;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class i extends com.tmoney.g.a {
    public static final String TAG = "UsimSKTSeio";
    private static volatile i b;
    private SEIO c;
    private UCPTelephony d;
    private UCPAuth e;
    private int f;
    private boolean g;
    private Timer h;

    final class a extends TimerTask {
        private a() {
        }

        /* synthetic */ a(i iVar, byte b) {
            this();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            int state;
            i.this.c();
            LogHelper.dw(i.TAG, "init time over");
            LogHelper.sendAppLog(i.TAG, "Bind time out! 5sec", CodeConstants.E_SAVEAPPLOG.CREATE);
            if (i.this.g) {
                i iVar = i.this;
                iVar.a(false, iVar.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT, ResultDetailCode.USIM_CREATE).setLog("S:9995"));
                return;
            }
            if (i.this.c == null) {
                i iVar2 = i.this;
                iVar2.a(false, iVar2.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT, ResultDetailCode.USIM_CREATE).setLog("S:9990"));
                return;
            }
            try {
                state = i.this.c.getState();
            } catch (Exception e) {
                LogHelper.exception(i.TAG, e);
                state = -99;
            }
            LogHelper.dw(i.TAG, "mSeio getState:" + state);
            if (state != 50) {
                i.a(i.this, state);
                return;
            }
            int channel = i.this.c.getChannel();
            LogHelper.dw(i.TAG, "isCreated mSeio getChannel:" + channel);
            if (channel > 0) {
                i.this.close();
            }
            i.this.g = true;
            i.this.a(true, TmoneyMsg.TmoneyResult.SUCCESS);
        }
    }

    private i(Context context) {
        super(context);
        this.c = null;
        this.d = null;
        this.e = null;
        this.g = false;
        this.f = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.tmoney.g.b.a aVar = com.tmoney.g.b.a.getInstance(getContext());
        try {
            SEIO seio = this.c;
            if (seio != null) {
                this.f = seio.getChannel();
                LogHelper.dw(TAG, "create mSeio getChannels:" + this.f);
                int i = this.f;
                if (i <= 0) {
                    if (i == -1) {
                        this.f = this.c.connect();
                        LogHelper.dw(TAG, "create mSeio connect:" + this.f);
                        if (this.f <= 0) {
                            close();
                        }
                    }
                }
                close();
                a(true, TmoneyMsg.TmoneyResult.SUCCESS);
                return;
            }
        } catch (Exception e) {
            this.g = false;
            LogHelper.exception(TAG, "create()", e, CodeConstants.E_SAVEAPPLOG.CREATE);
        }
        try {
            this.g = false;
            SEIO seio2 = SEIO.getInstance(getContext());
            this.c = seio2;
            if (seio2 == null) {
                LogHelper.ew(TAG, "getInstance fail", CodeConstants.E_SAVEAPPLOG.CREATE);
                a(false, TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT.setLog("SEM_init null").setCode("S:0000"));
            } else {
                LogHelper.dw(TAG, "getInstance success");
                b();
                this.c.initialize(aVar.getSkStId(), new SEManagerConnection() { // from class: com.tmoney.g.i.3
                    public final void onDispatchAPI(SEMDispatchData sEMDispatchData) {
                        LogHelper.dw(i.TAG, "onDispatchAPI");
                    }

                    public final void onResultAPI(SEMResultData sEMResultData) {
                        LogHelper.dw(i.TAG, "onResultAPI getType[" + sEMResultData.getType() + "]");
                        LogHelper.dw(i.TAG, "onResultAPI getResultCode[" + sEMResultData.getResultCode() + "]");
                        LogHelper.dw(i.TAG, "onResultAPI getData[" + sEMResultData.getData() + "]");
                        LogHelper.dw(i.TAG, "onResultAPI getInstance[" + SEMResultData.getInstance().toString() + "]");
                        if (sEMResultData.getResultCode() != APIResultCode.ERROR_OTA_INTERACTION_FAIL || sEMResultData.getResultCode().getMessage().contains("934")) {
                            return;
                        }
                        LogHelper.sendAppLog(i.TAG, "onResultAPI code:" + sEMResultData.getResultCode().getCode() + "], message[" + sEMResultData.getResultCode().getMessage() + "]", CodeConstants.E_SAVEAPPLOG.CREATE);
                    }

                    public final void onServiceConnected(String str) {
                        LogHelper.d(i.TAG, "onServiceConnected [" + str + "]");
                        i.this.c();
                        if (i.this.g) {
                            return;
                        }
                        i.this.g = true;
                        i.this.a(true, TmoneyMsg.TmoneyResult.SUCCESS);
                    }

                    public final void onServiceDisconnected(String str, int i2) {
                        LogHelper.d(i.TAG, "onServiceDisconnected [" + str + "][" + i2 + "]");
                        i.this.c();
                        if (i2 < 0) {
                            LogHelper.sendAppLog(i.TAG, "onServiceDisconnected compId[" + str + "], state[" + i2 + "]", CodeConstants.E_SAVEAPPLOG.CREATE);
                        }
                        i.this.g = false;
                        if (i2 != 0) {
                            i.a(i.this, i2);
                        }
                    }
                });
            }
        } catch (Exception e2) {
            LogHelper.exception(TAG, "getInstance", e2, CodeConstants.E_SAVEAPPLOG.CREATE);
            a(false, makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT, ResultDetailCode.USIM_EXCEPTION).setLog("SEM_init E1::" + e2.getMessage()));
        }
    }

    static /* synthetic */ void a(i iVar, int i) {
        TmoneyMsg.TmoneyResult log;
        TmoneyMsg.TmoneyResult tmoneyResult;
        ResultDetailCode resultDetailCode;
        StringBuilder sb;
        if (i == 80) {
            tmoneyResult = TmoneyMsg.TmoneyResult.USIM_ERROR_NEED_REBOOT;
            resultDetailCode = ResultDetailCode.SKT_SEIO_SEM_80;
            sb = new StringBuilder("[S");
        } else if (i == -82) {
            tmoneyResult = TmoneyMsg.TmoneyResult.USIM_ERROR_UNSUPPORT;
            resultDetailCode = ResultDetailCode.SKT_SEIO_SEM_82;
            sb = new StringBuilder("[S");
        } else if (i == -83) {
            tmoneyResult = TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT;
            resultDetailCode = ResultDetailCode.SKT_SEIO_SEM_83;
            sb = new StringBuilder("[S");
        } else if (i == -84) {
            tmoneyResult = TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT;
            resultDetailCode = ResultDetailCode.SKT_SEIO_SEM_84;
            sb = new StringBuilder("[S");
        } else if (i == -85) {
            tmoneyResult = TmoneyMsg.TmoneyResult.USIM_ERROR_SEIOAGENT_UPDATE;
            resultDetailCode = ResultDetailCode.SKT_SEIO_SEM_85;
            sb = new StringBuilder("[S");
        } else if (i == -86) {
            tmoneyResult = TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT;
            resultDetailCode = ResultDetailCode.SKT_SEIO_SEM_86;
            sb = new StringBuilder("[S");
        } else if (i == 983) {
            tmoneyResult = TmoneyMsg.TmoneyResult.USIM_ERROR_UNSUPPORT;
            resultDetailCode = ResultDetailCode.SKT_UCP_983;
            sb = new StringBuilder("[S");
        } else {
            if (i != 994) {
                log = TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT.setCode(i, -99).setMessage(TmoneyMsg.makeMessage("S", i, 28)).setLog("SEM_ConnectFail::" + i);
                iVar.a(false, log);
            }
            tmoneyResult = TmoneyMsg.TmoneyResult.USIM_ERROR_UNSUPPORT;
            resultDetailCode = ResultDetailCode.SKT_UCP_994;
            sb = new StringBuilder("[S");
        }
        sb.append(i);
        sb.append("]");
        log = iVar.makeResult(tmoneyResult, resultDetailCode, sb.toString());
        iVar.a(false, log);
    }

    private void b() {
        c();
        this.h = new Timer();
        LogHelper.dw(TAG, "start init timer");
        this.h.schedule(new a(this, (byte) 0), 5000L, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            if (this.h == null) {
                return;
            }
            LogHelper.dw(TAG, "stop init timer");
            this.h.cancel();
            this.h = null;
        } catch (Exception e) {
            LogHelper.exception(TAG, e);
        }
    }

    static /* synthetic */ void c(i iVar) {
        int applicationVersionCode = UCPUtility.getApplicationVersionCode(iVar.a, "com.skp.seio");
        LogHelper.d(TAG, "seio agent version code = " + applicationVersionCode);
        if (applicationVersionCode < 14) {
            iVar.a(false, iVar.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_SEIOAGENT_UPDATE, ResultDetailCode.SKT_SEIO_SEM_85));
            return;
        }
        String skStId = com.tmoney.g.b.a.getInstance(iVar.a).getSkStId();
        UCPTelephony uCPTelephony = UCPTelephony.getInstance(iVar.a);
        iVar.d = uCPTelephony;
        uCPTelephony.initialize(skStId, new UCPManagerConnection() { // from class: com.tmoney.g.i.1
            @Override // com.skt.usp.UCPManagerConnection
            public final void onResultAPI(UCPResultData uCPResultData) {
                LogHelper.d(i.TAG, "UCPTelephony onResultAPI code = " + uCPResultData.getResultCode().getCode());
                LogHelper.d(i.TAG, "UCPTelephony onResultAPI message = " + uCPResultData.getResultCode().getMessage());
            }

            @Override // com.skt.usp.UCPManagerConnection
            public final void onServiceConnected(String str) {
                LogHelper.d(i.TAG, "onServiceConnected [" + str + "]");
                try {
                    String strUcpGetSimSerialNumber = UCPTelephony.getInstance(i.this.a).ucpGetSimSerialNumber();
                    String strUcpGetLine1Number = UCPTelephony.getInstance(i.this.a).ucpGetLine1Number();
                    LogHelper.d(i.TAG, "onResultAPI uicc = " + strUcpGetSimSerialNumber);
                    LogHelper.d(i.TAG, "onResultAPI phNum = " + strUcpGetLine1Number);
                    i.this.a(com.tmoney.g.a.STR_UICC, strUcpGetSimSerialNumber);
                    UCPTelephony.getInstance(i.this.a).finalize();
                } catch (UCPException e) {
                    LogHelper.e(i.TAG, "onServiceConnected::" + LogHelper.printStackTraceToString(e));
                }
            }

            @Override // com.skt.usp.UCPManagerConnection
            public final void onServiceDisconnected(String str, int i) {
                LogHelper.d(i.TAG, "onServiceDisconnected [" + str + "][" + i + "]");
                if (i == 0) {
                    LogHelper.d(i.TAG, "create seio agent");
                    i.this.a();
                    return;
                }
                LogHelper.sendAppLog(i.TAG, "onServiceDisconnected compId[" + str + "], state[" + i + "]", CodeConstants.E_SAVEAPPLOG.CREATE);
                i.a(i.this, i);
            }
        });
    }

    public static void clear() {
        b = null;
    }

    public static i getInstance(Context context) {
        if (b == null) {
            synchronized (i.class) {
                if (b == null) {
                    b = new i(context);
                }
            }
        }
        return b;
    }

    @Override // com.tmoney.g.a
    public void close() {
        try {
            LogHelper.dw(TAG, "close:" + this.f);
            SEIO seio = this.c;
            if (seio != null) {
                this.f = seio.getChannel();
                LogHelper.dw(TAG, "close getChannel:" + this.f);
                LogHelper.dw(TAG, "get disconnect ret:" + this.c.disconnect());
            } else {
                LogHelper.ew(TAG, "mSeio null");
            }
        } catch (Exception e) {
            LogHelper.exception(TAG, "mSeio.disconnect", e, CodeConstants.E_SAVEAPPLOG.CLOSE);
        } finally {
            this.f = -1;
        }
    }

    @Override // com.tmoney.g.a
    public void create(Map<String, Object> map) {
        LogHelper.dw(TAG, "create");
        if (!isCheckTelecomUicc()) {
            a();
            return;
        }
        this.e = UCPAuth.getInstance(this.a);
        this.e.initialize(com.tmoney.g.b.a.getInstance(this.a).getSkStId(), new UCPManagerConnection() { // from class: com.tmoney.g.i.2
            @Override // com.skt.usp.UCPManagerConnection
            public final void onResultAPI(UCPResultData uCPResultData) {
                LogHelper.e(i.TAG, "onResultAPI getType[" + uCPResultData.getType() + "]");
                LogHelper.e(i.TAG, "onResultAPI getResultCode[" + uCPResultData.getResultCode() + "]");
                LogHelper.e(i.TAG, "onResultAPI getData[" + uCPResultData.getData() + "]");
                if (APITypeCode.UCP_AUTH_UCP_API_AVAILABLE_YN.equals(uCPResultData.getType()) && com.skt.usp.tools.common.APIResultCode.SUCCESS.equals(uCPResultData.getResultCode())) {
                    UCPAuthInfo uCPAuthInfo = (UCPAuthInfo) uCPResultData.getData();
                    if (uCPAuthInfo.isAuthResult()) {
                        i.c(i.this);
                        return;
                    }
                    String authResult_code = uCPAuthInfo.getAuthResult_code();
                    if (TextUtils.equals(authResult_code, "994")) {
                        i.a(i.this, 994);
                        return;
                    }
                    if (TextUtils.equals(authResult_code, "983")) {
                        i.a(i.this, 983);
                        return;
                    }
                    if (TextUtils.equals(authResult_code, "-83")) {
                        i.a(i.this, -83);
                    } else if (TextUtils.equals(authResult_code, "-86")) {
                        i.a(i.this, -86);
                    } else {
                        i.a(i.this, -1);
                    }
                }
            }

            @Override // com.skt.usp.UCPManagerConnection
            public final void onServiceConnected(String str) {
                LogHelper.e(i.TAG, "onServiceConnected [" + str + "]");
                try {
                    LogHelper.e(i.TAG, "mUCPAuth.hasUcpYn() " + i.this.e.hasUcpYn());
                    if (i.this.e.hasUcpYn()) {
                        i.c(i.this);
                    } else {
                        LogHelper.e(i.TAG, "mUCPAuth.ucpApiAvailableYn() ");
                        i.this.e.ucpApiAvailableYn();
                    }
                } catch (Exception unused) {
                    i.a(i.this, -1);
                }
            }

            @Override // com.skt.usp.UCPManagerConnection
            public final void onServiceDisconnected(String str, int i) {
                LogHelper.d(i.TAG, "onServiceDisconnected [" + str + "][" + i + "]");
                if (i != 0) {
                    LogHelper.sendAppLog(i.TAG, "onServiceDisconnected compId[" + str + "], state[" + i + "]", CodeConstants.E_SAVEAPPLOG.CREATE);
                    i.a(i.this, i);
                }
            }
        });
    }

    @Override // com.tmoney.g.a
    public void destroy() {
        LogHelper.dw(TAG, "destroy");
        SEIO seio = this.c;
        if (seio != null) {
            try {
                seio.finalize();
                this.c = null;
            } catch (Exception e) {
                LogHelper.exception(TAG, "destroy()", e, CodeConstants.E_SAVEAPPLOG.DESTORY);
            }
        }
        UCPAuth uCPAuth = this.e;
        if (uCPAuth != null) {
            uCPAuth.finalize();
        }
        a(true);
    }

    @Override // com.tmoney.g.a
    public int getChannel() {
        try {
            return this.f;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.tmoney.g.a
    public boolean isCreated() {
        int state;
        LogHelper.dw(TAG, "isCreated() mSeio:" + this.c + " / mIsBound : " + this.g);
        try {
            SEIO seio = this.c;
            if (seio != null) {
                try {
                    state = seio.getState();
                } catch (Exception e) {
                    LogHelper.exception(TAG, e);
                    state = -99;
                }
                LogHelper.dw(TAG, "isCreated mSeio getState:" + state);
                if (state == 50) {
                    int channel = this.c.getChannel();
                    LogHelper.dw(TAG, "isCreated mSeio getChannel:" + channel);
                    if (channel > 0) {
                        close();
                        return true;
                    }
                }
            }
        } catch (Exception e2) {
            this.g = false;
            LogHelper.exception(TAG, "isCreated()", e2, CodeConstants.E_SAVEAPPLOG.ISCREATE);
        }
        return false;
    }

    @Override // com.tmoney.g.a
    public int open() throws Throwable {
        String strSubstring;
        try {
            this.f = -1;
            SEIO seio = this.c;
            if (seio != null) {
                this.f = seio.getChannel();
                LogHelper.dw(TAG, "open mSeio getChannels:" + this.f);
            }
            if (this.f <= 0) {
                this.f = this.c.connect();
                LogHelper.dw(TAG, "open connect channel:" + this.f);
            }
            String simSerialNumber = DeviceInfoHelper.getSimSerialNumber(this.a);
            try {
                strSubstring = simSerialNumber.substring(6, 11);
            } catch (Exception unused) {
                strSubstring = "";
            }
            LogHelper.d(TAG, simSerialNumber + "-" + strSubstring);
            int i = this.f;
            if (i > 0 && i != 3 && (strSubstring.equals("11063") || strSubstring.equals("12053") || strSubstring.equals("11043") || strSubstring.equals("11093"))) {
                try {
                    transmit(b.CHANNEL_3_CLOSE);
                } catch (Exception e) {
                    LogHelper.exception(TAG, "ch3 close", e, CodeConstants.E_SAVEAPPLOG.OPEN);
                }
            }
        } catch (Exception e2) {
            LogHelper.exception(TAG, "open()", e2, CodeConstants.E_SAVEAPPLOG.OPEN);
        }
        if (this.f < 0) {
            LogHelper.dw(TAG, "open channel : " + this.f, CodeConstants.E_SAVEAPPLOG.OPEN);
        }
        return this.f;
    }

    @Override // com.tmoney.g.a
    public byte[] transmit(byte[] bArr) throws Throwable {
        byte[] bArr2;
        c();
        LogHelper.dw(TAG, "reqAPDU [" + com.tmoney.g.a.a(bArr) + "]");
        try {
            byte[] bArr3 = new byte[1024];
            byte[] bArr4 = bArr;
            int iTransmit = this.c.transmit(bArr4, bArr3);
            LogHelper.dw(TAG, "transmit ret :" + iTransmit);
            if (iTransmit > 0) {
                bArr2 = new byte[iTransmit];
                System.arraycopy(bArr3, 0, bArr2, 0, iTransmit);
                LogHelper.dw(TAG, "revAPDU [" + com.tmoney.g.a.a(bArr2) + "]");
                String strA = com.tmoney.g.a.a(bArr);
                String strA2 = com.tmoney.g.a.a(bArr2);
                CodeConstants.E_SAVEAPPLOG e_saveapplog = CodeConstants.E_SAVEAPPLOG.TRANSMIT;
                LogHelper.sendAppLog(TAG, strA, strA2, e_saveapplog);
                if (iTransmit == 2 && bArr2[0] == 97) {
                    byte[] apduCmd = com.tmoney.a.a.getApduCmd(20, (byte) 0, (byte) 0, (byte) 0, 0, bArr2[1]);
                    LogHelper.dw(TAG, "reqAPDU [" + com.tmoney.g.a.a(apduCmd) + "]");
                    int iTransmit2 = this.c.transmit(apduCmd, bArr3);
                    if (iTransmit2 > 0) {
                        bArr2 = new byte[iTransmit2];
                        System.arraycopy(bArr3, 0, bArr2, 0, iTransmit2);
                    }
                    LogHelper.dw(TAG, "revAPDU [" + com.tmoney.g.a.a(bArr2) + "]");
                    LogHelper.sendAppLog(TAG, com.tmoney.g.a.a(apduCmd), com.tmoney.g.a.a(bArr2), e_saveapplog);
                    bArr4 = apduCmd;
                    iTransmit = iTransmit2;
                }
            } else {
                bArr2 = null;
            }
            if (iTransmit < 0) {
                LogHelper.sendAppLog(TAG, com.tmoney.g.a.a(bArr4), "transmit ret:" + iTransmit, CodeConstants.E_SAVEAPPLOG.TRANSMIT);
            }
            return bArr2;
        } catch (Exception e) {
            LogHelper.exception(TAG, "Exception:reqAPDU", e, CodeConstants.E_SAVEAPPLOG.TRANSMIT);
            this.g = false;
            return null;
        }
    }
}
