package com.tmoney.g;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.kt.ollehusimmanager.otaclient.UFinConnection;
import com.kt.ollehusimmanager.otaclient.UsimLib;
import com.skt.usp.UCPApiConstants;
import com.tmoney.TmoneyMsg;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class e extends com.tmoney.g.a {
    public static final String TAG = "UsimKTUfin";
    private static volatile e e;
    Timer b;
    long c;
    boolean d;
    private UsimLib f;
    private byte[] g;
    private int[] h;
    private byte[] i;
    private int[] j;
    private byte[] k;
    private int[] l;
    private String m;
    private String n;

    /* renamed from: o, reason: collision with root package name */
    private Timer f8o;
    private int p;

    final class a extends TimerTask {
        private a() {
        }

        /* synthetic */ a(e eVar, byte b) {
            this();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            e.this.c();
            LogHelper.dw(e.TAG, "init time over");
            e eVar = e.this;
            eVar.a(false, eVar.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT, ResultDetailCode.USIM_TIMEOUT));
        }
    }

    private e(Context context) {
        super(context);
        this.f = null;
        this.g = new byte[57];
        this.h = new int[1];
        this.i = new byte[]{-1};
        this.j = new int[1];
        this.f8o = null;
        this.c = 0L;
        this.p = UCPApiConstants.ARAM_TIME_OUT;
        this.d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a() {
        try {
            this.f.UFIN_GetHandle(this.g, this.h);
            byte[] bArr = new byte[64];
            int[] iArr = new int[1];
            LogHelper.d(TAG, "KT UFIN_GetICCID retVal = " + this.f.UFIN_GetICCID(this.g, bArr, iArr));
            String str = new String(bArr, 0, iArr[0]);
            LogHelper.d(TAG, "KT UICC = " + str);
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    private void b() {
        if (this.f != null) {
            try {
                LogHelper.dw(TAG, "UFIN_Finalize");
                this.f.UFIN_Finalize();
            } catch (Exception e2) {
                LogHelper.exception(TAG, "unbind()", e2, CodeConstants.E_SAVEAPPLOG.DESTORY);
            } finally {
                this.f = null;
            }
        }
    }

    static /* synthetic */ void b(e eVar) {
        eVar.c();
        eVar.f8o = new Timer();
        LogHelper.dw(TAG, "start init timer");
        eVar.f8o.schedule(new a(eVar, (byte) 0), 3000L, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            if (this.f8o == null) {
                return;
            }
            LogHelper.dw(TAG, "stop init timer");
            this.f8o.cancel();
            this.f8o = null;
        } catch (Exception e2) {
            LogHelper.exception(TAG, e2);
        }
    }

    public static void clear() {
        e = null;
    }

    static /* synthetic */ void f(e eVar) throws Throwable {
        eVar.f.UFIN_RequestCarrierPrivilege(DeviceInfoHelper.getLine1NumberLocaleRemove(eVar.getContext()), new Handler() { // from class: com.tmoney.g.e.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                LogHelper.d(e.TAG, "requestCarrierPrivilege::handleMessage::" + message);
                int i = message.what;
                if (i == 100) {
                    LogHelper.d(e.TAG, "requestCarrierPrivilege::handleMessage::CLIENT_PROGRESS_MESSAGE");
                    e eVar2 = e.this;
                    if (eVar2.d) {
                        return;
                    }
                    eVar2.a(false, eVar2.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_KT_CLIENT_PROGRESS, ResultDetailCode.KT_UFIN_CLIENT_PROGRESS));
                    e.this.d = true;
                    return;
                }
                if (i == 200) {
                    LogHelper.d(e.TAG, "requestCarrierPrivilege::handleMessage::CLIENT_SUCCESS");
                    e.g(e.this);
                } else if (i == 300) {
                    LogHelper.d(e.TAG, "requestCarrierPrivilege::handleMessage::CLIENT_FAIL");
                    e eVar3 = e.this;
                    eVar3.a(false, eVar3.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_KT_CLIENT_FAIL, ResultDetailCode.KT_UFIN_CLIENT_FAIL));
                }
            }
        });
    }

    static /* synthetic */ void g(e eVar) {
        Timer timer = eVar.b;
        if (timer != null) {
            timer.cancel();
        }
        LogHelper.d(TAG, "UFIN_GetHandle::" + eVar.f.UFIN_GetHandle(eVar.g, eVar.h));
        eVar.c = System.currentTimeMillis();
        eVar.b = new Timer();
        LogHelper.dw(TAG, "start init timer");
        eVar.b.schedule((TimerTask) new b(eVar, (byte) 0), 3000L, 3000L);
    }

    public static e getInstance(Context context) {
        if (e == null) {
            synchronized (e.class) {
                if (e == null) {
                    e = new e(context);
                }
            }
        }
        return e;
    }

    @Override // com.tmoney.g.a
    public void close() {
        try {
            LogHelper.dw(TAG, "close channel:" + ((int) this.i[0]));
            byte b = this.i[0];
            if (b > 0) {
                LogHelper.dw(TAG, "close ret:" + this.f.UFIN_Close(this.g, b));
            }
        } catch (Exception e2) {
            LogHelper.exception(TAG, "close", e2, CodeConstants.E_SAVEAPPLOG.CLOSE);
        } finally {
            this.i[0] = -1;
        }
    }

    @Override // com.tmoney.g.a
    public void create(Map<String, Object> map) {
        LogHelper.dw(TAG, "create");
        try {
            LogHelper.dw(TAG, "new UsimFinManager");
            this.m = com.tmoney.g.b.a.getInstance(getContext()).getKtUfinKey();
            this.n = com.tmoney.g.b.a.getInstance(getContext()).getKtAppKey();
            LogHelper.dw(TAG, "create UK : " + this.m);
            LogHelper.dw(TAG, "create AK : " + this.n);
            try {
                if (this.f != null) {
                    b();
                }
            } catch (Exception e2) {
                LogHelper.exception(TAG, "mUsimFinLib unbind()", e2, CodeConstants.E_SAVEAPPLOG.CREATE);
            }
            try {
                LogHelper.dw(TAG, " UFIN_Initialize");
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.tmoney.g.e.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.f = new UsimLib();
                        if (e.this.f == null) {
                            LogHelper.dw(e.TAG, "mUsimFinLib UsimLib() fail", CodeConstants.E_SAVEAPPLOG.CREATE);
                            e.this.a(false, TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT.setLog("UFIN_Init fail").setCode("K:0000"));
                            return;
                        }
                        LogHelper.dw(e.TAG, "mUsimFinLib  getInstance sucess");
                        e.b(e.this);
                        UsimLib usimLib = e.this.f;
                        e eVar = e.this;
                        usimLib.UFIN_Initialize(eVar.a, eVar.m, true, new UFinConnection() { // from class: com.tmoney.g.e.1.1
                            /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void onServiceConnectFail(String str) throws Throwable {
                                TmoneyMsg.TmoneyResult tmoneyResultMakeResult;
                                e eVar2;
                                TmoneyMsg.TmoneyResult tmoneyResult;
                                ResultDetailCode resultDetailCode;
                                StringBuilder sb;
                                e.this.c();
                                LogHelper.dw(e.TAG, "onServiceConnectFail KT UFIN code[" + str + "]", CodeConstants.E_SAVEAPPLOG.CREATE);
                                if ("7010".equals(str)) {
                                    e.f(e.this);
                                    return;
                                }
                                TmoneyMsg.TmoneyResult tmoneyResult2 = TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT;
                                if ("7000".equals(str)) {
                                    eVar2 = e.this;
                                    tmoneyResult = TmoneyMsg.TmoneyResult.USIM_ERROR_KT_INSTALL_AGENT;
                                    resultDetailCode = ResultDetailCode.KT_UFIN_CLIENT_INSTALL;
                                    sb = new StringBuilder("[K");
                                } else if ("7004".equals(str)) {
                                    eVar2 = e.this;
                                    tmoneyResult = TmoneyMsg.TmoneyResult.USIM_ERROR_KT_UPDATE_AGENT;
                                    resultDetailCode = ResultDetailCode.KT_UFIN_CLIENT_UPDATE;
                                    sb = new StringBuilder("[K");
                                } else if ("7012".equals(str)) {
                                    eVar2 = e.this;
                                    tmoneyResult = TmoneyMsg.TmoneyResult.USIM_ERROR_UNSUPPORT;
                                    resultDetailCode = ResultDetailCode.NOT_SUPPORT_USIM;
                                    sb = new StringBuilder("[K");
                                } else {
                                    if (!"7702".equals(str)) {
                                        tmoneyResultMakeResult = tmoneyResult2;
                                        if (tmoneyResultMakeResult == tmoneyResult2) {
                                            String ktMessage = TmoneyMsg.getKtMessage(str);
                                            if (TextUtils.isEmpty(ktMessage)) {
                                                ktMessage = TmoneyMsg.makeMessage("K", str, 28);
                                            }
                                            tmoneyResultMakeResult.setCode(str).setMessage(ktMessage);
                                        }
                                        e.this.a(false, tmoneyResultMakeResult);
                                    }
                                    eVar2 = e.this;
                                    tmoneyResult = TmoneyMsg.TmoneyResult.USIM_ERROR_KT_CLIENT_WORKING;
                                    resultDetailCode = ResultDetailCode.KT_UFIN_CLIENT_WORKING;
                                    sb = new StringBuilder("[K");
                                }
                                sb.append(str);
                                sb.append("]");
                                tmoneyResultMakeResult = eVar2.makeResult(tmoneyResult, resultDetailCode, sb.toString());
                                if (tmoneyResultMakeResult == tmoneyResult2) {
                                }
                                e.this.a(false, tmoneyResultMakeResult);
                            }

                            public final void onServiceConnected() {
                                e eVar2;
                                TmoneyMsg.TmoneyResult message;
                                e.this.c();
                                LogHelper.dw(e.TAG, "onServiceConnected KT UFIN");
                                long jUFIN_GetVersion = e.this.f.UFIN_GetVersion(new StringBuilder());
                                LogHelper.dw(e.TAG, "UFIN_GetVersion:" + jUFIN_GetVersion);
                                boolean z = false;
                                if (jUFIN_GetVersion == 7004) {
                                    eVar2 = e.this;
                                    message = eVar2.makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_KT_UPDATE_AGENT, ResultDetailCode.KT_UFIN_CLIENT_UPDATE, "[K" + jUFIN_GetVersion + "]");
                                } else if (jUFIN_GetVersion == 0) {
                                    if (e.this.isCheckTelecomUicc()) {
                                        e eVar3 = e.this;
                                        eVar3.a(com.tmoney.g.a.STR_UICC, eVar3.a());
                                    }
                                    eVar2 = e.this;
                                    message = TmoneyMsg.TmoneyResult.SUCCESS;
                                    z = true;
                                } else {
                                    eVar2 = e.this;
                                    message = TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT.setCode(String.valueOf(jUFIN_GetVersion)).setMessage(TmoneyMsg.getMsg(28));
                                }
                                eVar2.a(z, message);
                            }
                        });
                    }
                }, 0L);
            } catch (Exception e3) {
                LogHelper.exception(TAG, "mUsimFinLib UsimLib()", e3, CodeConstants.E_SAVEAPPLOG.CREATE);
                a(false, makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT, ResultDetailCode.USIM_EXCEPTION).setLog(e3.getMessage()));
            }
        } catch (Exception e4) {
            LogHelper.exception(TAG, "mUsimFinLib getInstance", e4, CodeConstants.E_SAVEAPPLOG.CREATE);
            a(false, makeResult(TmoneyMsg.TmoneyResult.USIM_ERROR_CONNECT, ResultDetailCode.USIM_EXCEPTION).setLog(e4.getMessage()));
        }
    }

    @Override // com.tmoney.g.a
    public void destroy() {
        LogHelper.dw(TAG, "destroy");
        b();
        a(true);
    }

    @Override // com.tmoney.g.a
    public int getChannel() {
        try {
            if (this.f == null) {
                return -1;
            }
            byte b = this.i[0];
            if (b > 0) {
                return b;
            }
            return -1;
        } catch (Exception e2) {
            LogHelper.exception(TAG, "getChannel()", e2);
            return -2;
        }
    }

    @Override // com.tmoney.g.a
    public boolean isCreated() {
        UsimLib usimLib = this.f;
        if (usimLib == null) {
            return false;
        }
        try {
            long jUFIN_GetHandle = usimLib.UFIN_GetHandle(this.g, this.h);
            LogHelper.dw(TAG, "isCreated UFIN_GetHandle uifRet:" + jUFIN_GetHandle);
            return jUFIN_GetHandle == 0;
        } catch (Exception e2) {
            LogHelper.exception(TAG, "isCreated()", e2, CodeConstants.E_SAVEAPPLOG.ISCREATE);
            return false;
        }
    }

    @Override // com.tmoney.g.a
    public int open() {
        long jUFIN_GetHandle;
        LogHelper.dw(TAG, "open>current channel:" + ((int) this.i[0]));
        if (this.i[0] > 0) {
            close();
        }
        try {
            LogHelper.dw(TAG, "UFIN_GetHandle");
            jUFIN_GetHandle = this.f.UFIN_GetHandle(this.g, this.h);
            LogHelper.dw(TAG, "UFIN_GetHandle uifRet:" + jUFIN_GetHandle);
        } catch (Exception e2) {
            LogHelper.exception(TAG, "open", e2, CodeConstants.E_SAVEAPPLOG.OPEN);
            close();
        }
        if (jUFIN_GetHandle != 0) {
            LogHelper.dw(TAG, "UFIN_Open uifRet:" + jUFIN_GetHandle, CodeConstants.E_SAVEAPPLOG.OPEN);
            return -1;
        }
        long jUFIN_Open = this.f.UFIN_Open(this.g, this.i, this.j);
        LogHelper.dw(TAG, "UFIN_Open uifRet:" + jUFIN_Open);
        if (jUFIN_Open != 0) {
            LogHelper.dw(TAG, "UFIN_Open uifRet:" + jUFIN_Open, CodeConstants.E_SAVEAPPLOG.OPEN);
        }
        if (this.i != null) {
            LogHelper.dw(TAG, "handle:" + ((int) this.i[0]));
            if (this.i[0] < 0) {
                LogHelper.dw(TAG, "UFIN_Open handle : " + jUFIN_Open, CodeConstants.E_SAVEAPPLOG.OPEN);
            }
        }
        byte[] bArr = new byte[64];
        this.f.UFIN_GetICCID(this.g, bArr, new int[1]);
        LogHelper.d(TAG, "KT UICC = " + ByteHelper.toHexString(bArr));
        return this.i[0];
    }

    @Override // com.tmoney.g.a
    public byte[] transmit(byte[] bArr) throws Throwable {
        StringBuilder sb;
        try {
            c();
            bArr[0] = (byte) (bArr[0] | this.i[0]);
            this.k = new byte[1024];
            this.l = new int[1];
            LogHelper.dw(TAG, "reqAPDU1 [" + ByteHelper.byteArrayToHexString(bArr) + "]");
            if (bArr[1] == -92 && bArr[2] == 4) {
                byte[] bArr2 = new byte[7];
                System.arraycopy(bArr, 5, bArr2, 0, 7);
                LogHelper.dw(TAG, ">>UFIN_Select handle :" + ByteHelper.byteArrayToHexString(this.g));
                LogHelper.dw(TAG, ">>UFIN_Select aid :" + ByteHelper.byteArrayToHexString(bArr2));
                LogHelper.dw(TAG, ">>UFIN_Select channel :" + ByteHelper.byteArrayToHexString(this.i));
                long jUFIN_Select = this.f.UFIN_Select(this.g, bArr2, this.n, this.k, this.l, this.i);
                sb = new StringBuilder("UFIN_Select uifRet:");
                sb.append(jUFIN_Select);
            } else {
                long jUFIN_Transmit = this.f.UFIN_Transmit(this.g, bArr, bArr.length, this.k, this.l);
                sb = new StringBuilder("UFIN_Transmit uifRet:");
                sb.append(jUFIN_Transmit);
            }
            LogHelper.dw(TAG, sb.toString());
            int i = this.l[0];
            byte[] bArr3 = new byte[i];
            System.arraycopy(this.k, 0, bArr3, 0, i);
            LogHelper.dw(TAG, "revAPDU1 [" + ByteHelper.byteArrayToHexString(bArr3) + "]");
            String strByteArrayToHexString = ByteHelper.byteArrayToHexString(bArr);
            String strByteArrayToHexString2 = ByteHelper.byteArrayToHexString(bArr3);
            CodeConstants.E_SAVEAPPLOG e_saveapplog = CodeConstants.E_SAVEAPPLOG.TRANSMIT;
            LogHelper.sendAppLog(TAG, strByteArrayToHexString, strByteArrayToHexString2, e_saveapplog);
            if (i != 2 || bArr3[0] != 97) {
                return bArr3;
            }
            byte[] apduCmd = com.tmoney.a.a.getApduCmd(20, (byte) 0, (byte) 0, (byte) 0, 0, bArr3[1]);
            apduCmd[0] = (byte) (apduCmd[0] | this.i[0]);
            LogHelper.dw(TAG, "reqAPDU2 :" + ByteHelper.byteArrayToHexString(apduCmd));
            LogHelper.dw(TAG, "Transmit ret2:" + this.f.UFIN_Transmit(this.g, apduCmd, apduCmd.length, this.k, this.l));
            int i2 = this.l[0];
            byte[] bArr4 = new byte[i2];
            System.arraycopy(this.k, 0, bArr4, 0, i2);
            LogHelper.dw(TAG, "revAPDU2 [" + ByteHelper.byteArrayToHexString(bArr4) + "]");
            LogHelper.sendAppLog(TAG, ByteHelper.byteArrayToHexString(apduCmd), ByteHelper.byteArrayToHexString(bArr4), e_saveapplog);
            return bArr4;
        } catch (Exception e2) {
            LogHelper.exception(TAG, "sendAPDU", e2, CodeConstants.E_SAVEAPPLOG.TRANSMIT);
            close();
            return null;
        }
    }
}
