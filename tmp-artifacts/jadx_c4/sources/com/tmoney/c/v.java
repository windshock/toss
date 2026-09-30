package com.tmoney.c;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.kt.ollehusimmanager.otaclient.UFinConnection;
import com.kt.ollehusimmanager.otaclient.UsimLib;
import com.kt.ollehusimmanager.rcvdata.AppletInfo;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class v extends BaseTmoneyCallback {
    Handler a;
    private final String b;
    private UsimLib c;
    private com.tmoney.g.b.a d;
    private String e;
    private byte[] f;
    private int[] g;
    private boolean h;
    private UFinConnection i;

    public v(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.b = "TmoneyKtEnableInstance";
        this.f = new byte[57];
        this.g = new int[1];
        this.i = new UFinConnection() { // from class: com.tmoney.c.v.1
            public final void onServiceConnectFail(String str) {
                LogHelper.d("TmoneyKtEnableInstance", "onServiceConnectFail UFIN code[" + str + "]");
                v vVar = v.this;
                TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
                ResultDetailCode resultDetailCode = ResultDetailCode.KT_UFIN_CONN;
                TmoneyCallback.ResultType message = error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage() + " : " + str);
                StringBuilder sb = new StringBuilder("UFIN_ConnectFail::");
                sb.append(str);
                v.a(vVar, message.setLog(sb.toString()));
            }

            public final void onServiceConnected() {
                long jUFIN_GetVersion = v.this.c.UFIN_GetVersion(new StringBuilder());
                if (jUFIN_GetVersion == 7004) {
                    v.a(v.this, TmoneyCallback.ResultType.TODO.setDetailCode(String.valueOf(jUFIN_GetVersion)).setError(ResultError.KT_UFIN_CLIENT_UPDATE).setMessage(ResultDetailCode.KT_UFIN_CLIENT_UPDATE.getMessage()));
                    return;
                }
                long jUFIN_GetHandle = v.this.c.UFIN_GetHandle(v.this.f, v.this.g);
                LogHelper.d("TmoneyKtEnableInstance", "onServiceConnected UFIN GetHandle : " + jUFIN_GetHandle);
                if (jUFIN_GetHandle == 0) {
                    LogHelper.d("TmoneyKtEnableInstance", "UFIN_GetTransportInfo");
                    v.this.c.UFIN_GetTransportInfo(v.this.f, "C3", "4010", v.this.a);
                    return;
                }
                v vVar = v.this;
                TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
                ResultDetailCode resultDetailCode = ResultDetailCode.KT_UFIN_CONN;
                v.a(vVar, error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage() + " : " + String.valueOf(jUFIN_GetHandle)));
            }
        };
        this.a = new Handler(Looper.getMainLooper()) { // from class: com.tmoney.c.v.2
            @Override // android.os.Handler
            public final void dispatchMessage(Message message) {
                String str;
                LogHelper.d("TmoneyKtEnableInstance", "clientHandler msg.what[" + message.what + "]");
                Object obj = message.obj;
                if (obj instanceof String) {
                    str = (String) obj;
                    LogHelper.d("TmoneyKtEnableInstance", "clientHandler msg.str[" + str + "]");
                } else {
                    str = "";
                }
                int i = message.what;
                if (i == 200) {
                    v.a(v.this, TmoneyCallback.ResultType.SUCCESS);
                    return;
                }
                if (i == 300) {
                    v vVar = v.this;
                    TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.ENABLE_ERROR);
                    ResultDetailCode resultDetailCode = ResultDetailCode.ENABLE_ERROR;
                    v.a(vVar, error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage() + ":" + str));
                    StringBuilder sb = new StringBuilder("clientHandler msg.str[");
                    sb.append(str);
                    sb.append("]");
                    LogHelper.sendAppLog("TmoneyKtEnableInstance", sb.toString(), CodeConstants.E_SAVEAPPLOG.CREATE);
                    return;
                }
                if (i != 400 || v.this.h) {
                    return;
                }
                v.a(v.this, true);
                Object obj2 = message.obj;
                if (!(obj2 instanceof AppletInfo)) {
                    v vVar2 = v.this;
                    TmoneyCallback.ResultType error2 = TmoneyCallback.ResultType.WARNING.setError(ResultError.ENABLE_ERROR);
                    ResultDetailCode resultDetailCode2 = ResultDetailCode.ENABLE_ERROR;
                    v.a(vVar2, error2.setDetailCode(resultDetailCode2.getCodeString()).setMessage(resultDetailCode2.getMessage() + ":" + str));
                    return;
                }
                AppletInfo appletInfo = (AppletInfo) obj2;
                LogHelper.d("TmoneyKtEnableInstance", "clientHandler msg.state [" + appletInfo.getAppletStatus() + "]");
                LogHelper.d("TmoneyKtEnableInstance", "clientHandler msg.lock [" + appletInfo.getAppletLock() + "]");
                if (!appletInfo.getAppletStatus().equals("N")) {
                    if (appletInfo.getAppletLock().equals("N")) {
                        v.a(v.this, TmoneyCallback.ResultType.SUCCESS);
                        return;
                    } else {
                        LogHelper.d("TmoneyKtEnableInstance", "UFIN_RequestActivateTransport");
                        v.this.c.UFIN_RequestActivateTransport(v.this.f, "C3", "4010", v.this.a);
                        return;
                    }
                }
                v vVar3 = v.this;
                TmoneyCallback.ResultType error3 = TmoneyCallback.ResultType.WARNING.setError(ResultError.NOT_SUPPORT);
                ResultDetailCode resultDetailCode3 = ResultDetailCode.NOT_SUPPORT_USIM;
                v.a(vVar3, error3.setDetailCode(resultDetailCode3.getCodeString()).setMessage(resultDetailCode3.getMessage() + " : " + str));
            }
        };
        com.tmoney.g.b.a aVar = com.tmoney.g.b.a.getInstance(context);
        this.d = aVar;
        this.e = aVar.getKtUfinKey();
    }

    static /* synthetic */ void a(v vVar, final TmoneyCallback.ResultType resultType) {
        if (vVar.c != null) {
            try {
                LogHelper.d("TmoneyKtEnableInstance", "UFIN_Finalize");
                vVar.c.UFIN_Finalize();
                vVar.c = null;
            } catch (Exception e) {
                LogHelper.exception("TmoneyKtEnableInstance", e);
            }
        }
        new Handler().postDelayed(new Runnable() { // from class: com.tmoney.c.v.3
            @Override // java.lang.Runnable
            public final void run() {
                LogHelper.d("TmoneyKtEnableInstance", "onTmoneyEnableResult " + resultType);
                try {
                    TmoneyCallback.ResultType resultType2 = resultType;
                    if (resultType2 != TmoneyCallback.ResultType.SUCCESS) {
                        String detailCode = resultType2.getDetailCode();
                        if ("7001".equals(detailCode) || "7002".equals(detailCode) || "7003".equals(detailCode)) {
                            resultType.setLog(resultType.getLog() + "U:" + v.this.d.getKtUfinKey());
                        }
                    }
                    v.this.onResult(resultType);
                } catch (Exception e2) {
                    LogHelper.exception("TmoneyKtEnableInstance", e2);
                }
            }
        }, 300L);
    }

    static /* synthetic */ boolean a(v vVar, boolean z) {
        vVar.h = true;
        return true;
    }

    public final void excuteTmoneyEnable() {
        this.h = false;
        UsimLib usimLib = new UsimLib();
        this.c = usimLib;
        Context context = this.mContext;
        if (context == null) {
            this.i.onServiceConnectFail("-1");
        } else {
            usimLib.UFIN_Initialize(context, this.e, true, this.i);
        }
    }
}
