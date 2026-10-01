package com.tmoney.c;

import android.content.Context;
import android.os.Handler;
import com.lguplus.usimlib.TsmClient;
import com.lguplus.usimlib.TsmClientConnectListener;
import com.lguplus.usimlib.TsmClientRequestListener;
import com.lguplus.usimlib.TsmRequest;
import com.lguplus.usimlib.TsmResponse;
import com.lguplus.usimlib.TsmUtil;
import com.tmoney.TmoneyConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.Callback;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class w extends BaseTmoneyCallback {
    TsmClientConnectListener a;
    TsmClientRequestListener b;
    private final String c;
    private final String d;
    private com.tmoney.g.b.a e;
    private TsmClient f;

    public w(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.c = "TmoneyLguEnableInstance";
        this.d = "A00000003044F11549900101";
        this.a = new TsmClientConnectListener() { // from class: com.tmoney.c.w.2
            public final void onServiceConnectFail() {
                Exception exc = new Exception("TSM client service connect fail!");
                w.a(w.this, TmoneyCallback.ResultType.WARNING.setError(ResultError.EXCEPTION).setDetailCode(ResultDetailCode.EXCEPTION_SERVER.getCodeString()).setException(exc).setMessage(exc.getMessage()));
            }

            public final void onServiceConnected() {
                LogHelper.d("TmoneyLguEnableInstance", "onServiceConnected LGU TSM");
                if (DeviceInfoHelper.hasEmbeddedUsim(w.this.mContext)) {
                    LogHelper.d("TmoneyLguEnableInstance", "setSubscriptionId(" + DeviceInfoHelper.getUsimSubscriptionId(w.this.mContext) + ")");
                    w.this.f.setSubscriptionId(DeviceInfoHelper.getUsimSubscriptionId(w.this.mContext));
                }
                try {
                    if (w.g(w.this)) {
                        w.this.f.requestAppletStatus("A00000003044F11549900101");
                    } else {
                        w.this.f.requestEnableApplet("D4100000030001");
                    }
                } catch (Exception e) {
                    w.a(w.this, TmoneyCallback.ResultType.WARNING.setError(ResultError.EXCEPTION).setDetailCode(ResultDetailCode.EXCEPTION_TASK.getCodeString()).setException(e).setMessage(e.getMessage()));
                }
            }
        };
        this.b = new TsmClientRequestListener() { // from class: com.tmoney.c.w.3
            public final void onProgressChanged(JSONObject jSONObject) {
            }

            public final void onRequestStopped(TsmRequest tsmRequest, TsmResponse tsmResponse) throws JSONException {
                w wVar;
                ResultError resultError;
                ResultDetailCode resultDetailCode;
                TmoneyCallback.ResultType resultTypeWarning;
                LogHelper.d("TmoneyLguEnableInstance", ">>>>> req.getType() " + tsmRequest.getType());
                LogHelper.d("TmoneyLguEnableInstance", ">>>>> res.getErrorCode() " + tsmResponse.getErrorCode());
                LogHelper.d("TmoneyLguEnableInstance", ">>>>> res.getErrorMsg() " + tsmResponse.getErrorMsg());
                if (!"0000".equals(tsmResponse.getErrorCode())) {
                    LogHelper.sendAppLog("TmoneyLguEnableInstance", "res.type : " + tsmRequest.getType() + ", res.code : " + tsmResponse.getErrorMsg(), CodeConstants.E_SAVEAPPLOG.CREATE);
                }
                String str = "[U" + tsmResponse.getErrorCode() + "] " + tsmResponse.toString();
                if (!"enableApplet".equals(tsmRequest.getType())) {
                    if ("appletStatus".equals(tsmRequest.getType())) {
                        if ("0000".equals(tsmResponse.getErrorCode())) {
                            try {
                                String string = tsmResponse.getString("lifecycle");
                                LogHelper.d("TmoneyLguEnableInstance", ">>>>> lifecycle " + string);
                                if (string.equals("NONE")) {
                                    w.this.f.requestIssueApplet("A00000003044F11549900101");
                                    return;
                                } else {
                                    w.this.f.requestEnableApplet("D4100000030001");
                                    return;
                                }
                            } catch (Exception e) {
                                LogHelper.d("TmoneyLguEnableInstance", "requestEnableApplet()>>" + e.getMessage());
                            }
                        }
                        wVar = w.this;
                        resultError = ResultError.USIM_ERROR;
                        resultDetailCode = ResultDetailCode.LGU_USIM_STATE;
                    } else {
                        if ("issueApplet".equals(tsmRequest.getType())) {
                            if ("0000".equals(tsmResponse.getErrorCode())) {
                                try {
                                    w.this.f.requestEnableApplet("D4100000030001");
                                    return;
                                } catch (Exception e2) {
                                    LogHelper.d("TmoneyLguEnableInstance", "requestEnableApplet()>>" + e2.getMessage());
                                }
                            }
                            wVar = w.this;
                            resultError = ResultError.USIM_ERROR;
                            resultDetailCode = ResultDetailCode.LGU_USIM_ISSUE;
                        }
                        wVar = w.this;
                        resultTypeWarning = Callback.warning(ResultError.ENABLE_ERROR, ResultDetailCode.ENABLE_ERROR.getCodeString(), str);
                    }
                    resultTypeWarning = Callback.warning(resultError, resultDetailCode);
                } else if ("0000".equals(tsmResponse.getErrorCode())) {
                    wVar = w.this;
                    resultTypeWarning = TmoneyCallback.ResultType.SUCCESS;
                } else {
                    wVar = w.this;
                    resultTypeWarning = Callback.warning(ResultError.ENABLE_ERROR, ResultDetailCode.ENABLE_ERROR.getCodeString(), str);
                }
                w.a(wVar, resultTypeWarning);
            }
        };
        this.e = com.tmoney.g.b.a.getInstance(context);
    }

    static /* synthetic */ void a(w wVar, final TmoneyCallback.ResultType resultType) {
        new Handler().postDelayed(new Runnable() { // from class: com.tmoney.c.w.4
            @Override // java.lang.Runnable
            public final void run() {
                w.this.onResult(resultType);
            }
        }, 300L);
    }

    static /* synthetic */ boolean g(w wVar) {
        String simSerialNumber = DeviceInfoHelper.getSimSerialNumber(wVar.mContext);
        return simSerialNumber != null && simSerialNumber.startsWith("8982066740");
    }

    public final void excuteTmoneyEnable() {
        if (TmoneyData.getInstance().getTmoneyDebug() == TmoneyConstants.TmoneySdkDebugType.Debug) {
            TsmUtil.setLogLevel(3);
        }
        TsmUtil.requestVersionCheck(this.mContext, new TsmUtil.VersionCheckListener() { // from class: com.tmoney.c.w.1
            public final void onVersionCheck(JSONObject jSONObject) {
                w wVar;
                TmoneyCallback.ResultType error;
                ResultDetailCode resultDetailCode;
                String codeString;
                LogHelper.d("TmoneyLguEnableInstance", "LGU : onVersionCheck : " + jSONObject);
                try {
                    switch (jSONObject.getInt("resultCode")) {
                        case 1000:
                            wVar = w.this;
                            error = TmoneyCallback.ResultType.WARNING.setError(ResultError.NETWORK);
                            resultDetailCode = ResultDetailCode.NETWORK;
                            codeString = resultDetailCode.getCodeString();
                            break;
                        case 1001:
                            w.this.f = new TsmClient(w.this.mContext);
                            w.this.f.setServerType(0);
                            w.this.f.setIssueType(0);
                            w.this.f.setConnectListener(w.this.a);
                            w.this.f.setRequestListener(w.this.b);
                            w.this.f.setClientId(w.this.e.getLguClientId());
                            w.this.f.setAppKey(w.this.e.getLguAppKey());
                            w.this.f.setUiccIdEncKey(w.this.e.getLguUiccIdEncKey());
                            w.this.f.connectToService();
                            return;
                        case 1002:
                        case 1003:
                        case 1004:
                            wVar = w.this;
                            error = TmoneyCallback.ResultType.TODO.setError(ResultError.LGU_USIM_AGENT);
                            resultDetailCode = ResultDetailCode.LGU_USIM_AGENT;
                            codeString = resultDetailCode.getCodeString();
                            break;
                        default:
                            wVar = w.this;
                            error = TmoneyCallback.ResultType.WARNING.setError(ResultError.ENABLE_ERROR);
                            resultDetailCode = ResultDetailCode.ENABLE_ERROR;
                            codeString = resultDetailCode.getCodeString();
                            break;
                    }
                    w.a(wVar, error.setDetailCode(codeString).setMessage(resultDetailCode.getMessage()));
                } catch (Exception unused) {
                    w wVar2 = w.this;
                    TmoneyCallback.ResultType error2 = TmoneyCallback.ResultType.WARNING.setError(ResultError.EXCEPTION);
                    ResultDetailCode resultDetailCode2 = ResultDetailCode.ENABLE_ERROR;
                    w.a(wVar2, error2.setDetailCode(resultDetailCode2.getCodeString()).setMessage(resultDetailCode2.getMessage()));
                }
            }
        });
    }
}
