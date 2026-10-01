package com.tmoney.c;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.skp.smarttouch.sem.SEManagerConnection;
import com.skp.smarttouch.sem.std.Transportation;
import com.skp.smarttouch.sem.tools.common.APIResultCode;
import com.skp.smarttouch.sem.tools.common.APITypeCode;
import com.skp.smarttouch.sem.tools.dao.SEMDispatchData;
import com.skp.smarttouch.sem.tools.dao.SEMResultData;
import com.tmoney.TmoneyMsg;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class y extends BaseTmoneyCallback {
    private final String a;
    private Context b;
    private com.tmoney.g.b.a c;
    private Transportation d;
    private boolean e;
    private boolean f;
    private SEManagerConnection g;
    private Handler h;

    public y(Context context, ResultListener resultListener) {
        super(resultListener);
        this.a = "TmoneySktIssueCheckInstance";
        this.e = false;
        this.f = false;
        this.g = new SEManagerConnection() { // from class: com.tmoney.c.y.1
            public final void onDispatchAPI(SEMDispatchData sEMDispatchData) {
            }

            public final void onResultAPI(SEMResultData sEMResultData) {
                String str;
                TmoneyCallback.ResultType resultType;
                TmoneyCallback.ResultType error;
                ResultDetailCode resultDetailCode;
                TmoneyCallback.ResultType error2 = TmoneyCallback.ResultType.WARNING.setError(ResultError.ENABLE_ERROR);
                ResultDetailCode resultDetailCode2 = ResultDetailCode.ENABLE_ERROR;
                TmoneyCallback.ResultType message = error2.setDetailCode(resultDetailCode2.getCodeString()).setMessage(resultDetailCode2.getMessage());
                try {
                    str = (String) sEMResultData.getData();
                } catch (Exception unused) {
                }
                if (str == null) {
                    str = "";
                }
                String message2 = sEMResultData.getResultCode().getMessage();
                String str2 = message2 != null ? message2 : "";
                int code = sEMResultData.getResultCode().getCode();
                LogHelper.d("TmoneySktIssueCheckInstance", "onResultAPI data:" + str + ", code:" + code + ", message:" + str2);
                if (APITypeCode.STD_TRP_REQUEST_IS_TRANS_ISSUED.equals(sEMResultData.getType())) {
                    if (APIResultCode.SUCCESS.equals(sEMResultData.getResultCode())) {
                        if ("NONE".equals(str) || "DELETED".equals(str)) {
                            resultType = TmoneyCallback.ResultType.TODO;
                            error = resultType.setError(ResultError.NEED_1TH_ISSUE);
                            resultDetailCode = ResultDetailCode.NEED_1TH_ISSUE;
                        } else if ("INSTALLED".equals(str)) {
                            if (y.this.f) {
                                y.e(y.this);
                                return;
                            } else {
                                resultType = TmoneyCallback.ResultType.TODO;
                                error = resultType.setError(ResultError.NEED_ENABLE);
                                resultDetailCode = ResultDetailCode.NEED_ENABLE;
                            }
                        }
                        error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage());
                        message = resultType;
                    }
                } else if (APITypeCode.STD_TRP_REQUEST_TRANSPORTATION_ENABLE.equals(sEMResultData.getType()) && (APIResultCode.SUCCESS.equals(sEMResultData.getResultCode()) || (code == -13 && str2.contains("934")))) {
                    message = TmoneyCallback.ResultType.SUCCESS;
                }
                if (message.getError() == ResultError.ENABLE_ERROR) {
                    message.setDetailCode(String.valueOf(code));
                    message.setMessage(TmoneyMsg.makeMessage("S", code, str2));
                }
                y.a(y.this, message);
            }

            public final void onServiceConnected(String str) {
                LogHelper.d("TmoneySktIssueCheckInstance", "onServiceConnected [" + str + "][" + y.this.d.getTranitpassYn() + "]");
                y.b(y.this);
            }

            public final void onServiceDisconnected(String str, int i) {
                LogHelper.d("TmoneySktIssueCheckInstance", "onServiceDisconnected [" + str + "][" + i + "]");
                if ((str.endsWith("STD_TRP") && i == 0) || y.this.e) {
                    return;
                }
                try {
                    ResultDetailCode detailCode = ResultDetailCode.getDetailCode(i);
                    if (detailCode != ResultDetailCode.UNKNOWN) {
                        TmoneyCallback.ResultType message = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR).setDetailCode(detailCode.getCodeString()).setMessage(detailCode.getMessage());
                        if (detailCode == ResultDetailCode.SKT_SEIO_SEM_85) {
                            message = TmoneyCallback.ResultType.TODO.setError(ResultError.SKT_SEIO_UPDATE).setDetailCode(detailCode.getCodeString()).setMessage(detailCode.getMessage());
                        }
                        y.a(y.this, message);
                        return;
                    }
                    y.a(y.this, TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR).setDetailCode(ResultDetailCode.getDetailCode(i).getCodeString()).setMessage("[" + str + "]" + TmoneyMsg.getSktMsg(i)));
                } catch (Exception e) {
                    LogHelper.exception("TmoneySktIssueCheckInstance", e);
                }
            }
        };
        this.h = new Handler(Looper.getMainLooper()) { // from class: com.tmoney.c.y.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                String message2;
                try {
                    TmoneyCallback.ResultType message3 = (TmoneyCallback.ResultType) message.obj;
                    if (message3 != TmoneyCallback.ResultType.SUCCESS && "-13".equals(message3.getDetailCode()) && (message2 = message3.getMessage()) != null) {
                        if (message2.contains("922") || message2.contains("923") || message2.contains("924") || message2.contains("933") || message2.contains("943") || message2.contains("944")) {
                            LogHelper.sendAppLog("NOT_SUPPORT", "TmoneySktEnableInstance resMsg:" + message2, CodeConstants.E_SAVEAPPLOG.CREATE);
                            TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.NOT_SUPPORT);
                            ResultDetailCode resultDetailCode = ResultDetailCode.NOT_SUPPORT_TMONEY;
                            message3 = error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage());
                        } else {
                            message3.setMessage(TmoneyMsg.makeUsimMessage("S", message3.getDetailCode(), message2));
                        }
                    }
                    y.this.onResult(message3);
                } catch (Exception e) {
                    LogHelper.exception("TmoneySktIssueCheckInstance", e);
                }
            }
        };
        this.b = context;
        this.c = com.tmoney.g.b.a.getInstance(context);
    }

    static /* synthetic */ void a(y yVar, TmoneyCallback.ResultType resultType) {
        int i = resultType.getDetailCode().equals(ResultDetailCode.SKT_SEIO_CONN.getCodeString()) ? 0 : 300;
        LogHelper.d("TmoneySktIssueCheckInstance", "onTmoneyEnableCheckResult " + resultType + "(delay:" + i + ") " + resultType.getError() + "/" + resultType.getMessage());
        try {
            Transportation transportation = yVar.d;
            if (transportation != null && !yVar.e) {
                transportation.finalize();
                yVar.d = null;
                yVar.e = true;
            }
        } catch (Exception unused) {
        }
        Message messageObtain = Message.obtain();
        messageObtain.obj = resultType;
        yVar.h.sendMessageDelayed(messageObtain, i);
    }

    static /* synthetic */ void b(y yVar) {
        LogHelper.d("TmoneySktIssueCheckInstance", "requestIsTransIssued");
        yVar.d.requestIsTransIssued("D4100000030001");
    }

    static /* synthetic */ void e(y yVar) {
        LogHelper.d("TmoneySktIssueCheckInstance", "requestTransportationEnable");
        yVar.d.requestTransportationEnable(1);
    }

    public final void excuteSktIssueCheck(boolean z) {
        this.f = z;
        LogHelper.d("TmoneySktIssueCheckInstance", "initializeTransportation");
        Transportation transportation = Transportation.getInstance(this.b);
        this.d = transportation;
        transportation.initialize(this.c.getSkStId(), this.g);
    }
}
