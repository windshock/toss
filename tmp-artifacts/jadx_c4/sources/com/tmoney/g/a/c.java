package com.tmoney.g.a;

import android.content.Context;
import android.nfc.tech.IsoDep;
import android.text.TextUtils;
import com.tmoney.TmoneyMsg;
import com.tmoney.a.g;
import com.tmoney.b.m;
import com.tmoney.g.d;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.Callback;
import com.tmoney.utils.LogHelper;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class c implements d.a {
    private final String a = "Task";
    private Context b;
    private com.tmoney.g.d c;
    private com.tmoney.g.a.a d;
    private com.tmoney.f.a.a e;
    private long f;
    private boolean g;
    private IsoDep h;
    private b i;
    private TmoneyMsg.TmoneyResult j;

    public final class a extends Thread {
        private com.tmoney.g.a.a a;

        public a(com.tmoney.g.a.a aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            TmoneyCallback.ResultType resultTypeWarning;
            c cVar;
            TmoneyCallback.ResultType resultType;
            ResultError resultError;
            TmoneyCallback.ResultType resultTypeWarning2;
            StringBuilder sb;
            String string;
            ResultError resultError2;
            ResultDetailCode resultDetailCode;
            LogHelper.d("Task", "SerialTask run() " + this.a + "[" + c.this.c + "]" + c.this.j);
            TmoneyCallback.ResultType resultType2 = TmoneyCallback.ResultType.SUCCESS;
            if (c.this.j != TmoneyMsg.TmoneyResult.SUCCESS) {
                if (c.this.j == TmoneyMsg.TmoneyResult.USIM_ERROR_NEED_REBOOT) {
                    cVar = c.this;
                    resultType = TmoneyCallback.ResultType.TODO;
                    resultError = ResultError.NEED_REBOOT;
                } else if (c.this.j == TmoneyMsg.TmoneyResult.USIM_ERROR_SEIOAGENT_UPDATE) {
                    cVar = c.this;
                    resultType = TmoneyCallback.ResultType.TODO;
                    resultError = ResultError.SKT_SEIO_UPDATE;
                } else if (c.this.j == TmoneyMsg.TmoneyResult.USIM_ERROR_UNSUPPORT) {
                    cVar = c.this;
                    resultType = TmoneyCallback.ResultType.WARNING;
                    resultError = ResultError.NOT_SUPPORT;
                } else if (c.this.j == TmoneyMsg.TmoneyResult.USIM_ERROR_LGU_UPDATE_AGENT) {
                    cVar = c.this;
                    resultType = TmoneyCallback.ResultType.TODO;
                    resultError = ResultError.LGU_USIM_AGENT;
                } else if (c.this.j == TmoneyMsg.TmoneyResult.AJAX_FAIL_SEND) {
                    cVar = c.this;
                    resultType = TmoneyCallback.ResultType.WARNING;
                    resultError = ResultError.NETWORK;
                } else if (c.this.j == TmoneyMsg.TmoneyResult.USIM_ERROR_KT_INSTALL_AGENT) {
                    cVar = c.this;
                    resultType = TmoneyCallback.ResultType.TODO;
                    resultError = ResultError.KT_UFIN_CLIENT_INSTALL;
                } else if (c.this.j == TmoneyMsg.TmoneyResult.USIM_ERROR_KT_UPDATE_AGENT) {
                    cVar = c.this;
                    resultType = TmoneyCallback.ResultType.TODO;
                    resultError = ResultError.KT_UFIN_CLIENT_UPDATE;
                } else if (c.this.j == TmoneyMsg.TmoneyResult.USIM_ERROR_KT_CLIENT_WORKING) {
                    cVar = c.this;
                    resultType = TmoneyCallback.ResultType.WARNING;
                    resultError = ResultError.USIM_WAITTING;
                } else if (c.this.j == TmoneyMsg.TmoneyResult.USIM_ERROR_LOCK) {
                    cVar = c.this;
                    resultType = TmoneyCallback.ResultType.TODO;
                    resultError = ResultError.NEED_ENABLE;
                } else {
                    resultTypeWarning = Callback.warning(ResultError.USIM_ERROR, c.this.j.getCode(), (c.this.j == null || TextUtils.isEmpty(c.this.j.getMessage())) ? ResultDetailCode.USIM_CREATE.getMessage() : c.this.j.getMessage());
                    if (c.this.j != null && !TextUtils.isEmpty(c.this.j.getLog())) {
                        resultTypeWarning.setLog(c.this.j.getLog());
                    }
                }
                resultTypeWarning = cVar.makeResult(resultType, resultError, cVar.j);
            } else if (c.this.h == null && TmoneyData.getInstance().isNotUseUsimPartner()) {
                resultTypeWarning = Callback.success(TmoneyData.getInstance().getUserId(), 0, "", new byte[0], "", "");
            } else if (c.this.c == null) {
                resultTypeWarning = Callback.warning(ResultError.USIM_ERROR, ResultDetailCode.USIM_CREATE);
            } else {
                try {
                    c.this.c.open();
                    if (c.this.c.getChannel() >= 0) {
                        byte[] bArrTransmitAPDU = c.this.c.transmitAPDU(c.this.e.getApduSelect());
                        g gVar = new g(bArrTransmitAPDU);
                        if (gVar.isbResData()) {
                            String iDep = gVar.getIDep();
                            String usercode = gVar.getUSERCODE();
                            String diss = gVar.getDISS();
                            String cardNumber = TmoneyData.getInstance().getCardNumber();
                            String str = "";
                            if (cardNumber.equals("0000000000000000")) {
                                cardNumber = "";
                            }
                            if (c.this.h == null) {
                                str = cardNumber;
                            }
                            LogHelper.d("Task", "oldCardNo=" + str);
                            LogHelper.d("Task", "newCardNo=" + iDep);
                            if (!TextUtils.isEmpty(str) && !str.equals(iDep)) {
                                LogHelper.d("Task", "USIM_CHANGED");
                                resultError2 = ResultError.USIM_ERROR;
                                resultDetailCode = ResultDetailCode.USIM_CHANGED;
                            } else if (c.this.h != null && ((!gVar.isTmoneyCARDtype() && !gVar.isPasscardCARDType()) || ((TmoneyData.getInstance().getServerType() == 0 && gVar.isRealIDcenter()) || ((TmoneyData.getInstance().getServerType() == 2 || TmoneyData.getInstance().getServerType() == 1) && !gVar.isRealIDcenter())))) {
                                resultError2 = ResultError.USIM_ERROR;
                                resultDetailCode = ResultDetailCode.NOT_SUPPORT_CARD;
                            } else if (c.this.g) {
                                byte[] bArrTransmitAPDU2 = c.this.c.transmitAPDU(c.this.e.getApduBalance());
                                TmoneyMsg tmoneyMsg = new TmoneyMsg(bArrTransmitAPDU2);
                                if (tmoneyMsg.isbResData()) {
                                    int balance = tmoneyMsg.getBalance();
                                    TmoneyData.getInstance().setLastBalance(balance);
                                    resultTypeWarning = Callback.success(iDep, Integer.valueOf(balance), usercode, bArrTransmitAPDU, bArrTransmitAPDU2, diss);
                                } else {
                                    resultTypeWarning2 = Callback.warning(ResultError.USIM_ERROR, ResultDetailCode.USIM_BALANCE);
                                    string = "ApduResBalance::" + ByteHelper.toHexString(bArrTransmitAPDU2) + " SW::" + tmoneyMsg.getSW();
                                    resultTypeWarning = resultTypeWarning2.setLog(string);
                                }
                            } else {
                                resultTypeWarning = Callback.success(iDep, 0, usercode, bArrTransmitAPDU, null, diss);
                            }
                            resultTypeWarning = Callback.warning(resultError2, resultDetailCode);
                        } else {
                            resultTypeWarning2 = Callback.warning(ResultError.USIM_ERROR, gVar.getSW(), ResultDetailCode.USIM_SEL.getMessage());
                            sb = new StringBuilder("ApduResSel::");
                            sb.append(ByteHelper.toHexString(bArrTransmitAPDU));
                        }
                    } else {
                        resultTypeWarning2 = Callback.warning(ResultError.USIM_ERROR, ResultDetailCode.USIM_CHANNEL);
                        sb = new StringBuilder("channel::");
                        sb.append(c.this.c.getChannel());
                    }
                    string = sb.toString();
                    resultTypeWarning = resultTypeWarning2.setLog(string);
                } catch (Exception e) {
                    TmoneyCallback.ResultType exception = Callback.warning(ResultError.EXCEPTION, ResultDetailCode.EXCEPTION_TASK).setLog(e.getMessage()).setException(e);
                    LogHelper.exception("Task", e);
                    resultTypeWarning = exception;
                }
            }
            LogHelper.d("Task", "SerialTask run balance:" + this.a.execute(c.this.c, resultTypeWarning));
            this.a = null;
            c.a(c.this, null);
        }
    }

    public c(Context context, com.tmoney.g.a.a aVar, boolean z, IsoDep isoDep) {
        LogHelper.d("Task", "new Task");
        this.b = context;
        this.d = aVar;
        this.e = new com.tmoney.f.a.a();
        this.g = z;
        this.h = isoDep;
    }

    static /* synthetic */ com.tmoney.g.a.a a(c cVar, com.tmoney.g.a.a aVar) {
        cVar.d = null;
        return null;
    }

    public final void createUsim(Map<String, Object> map) {
        LogHelper.d("Task", "createUsim Executer [" + this.d.TAG + "]");
        com.tmoney.g.d dVar = com.tmoney.g.d.getInstance(getContext(), this.h);
        this.c = dVar;
        dVar.setOnUsimListener(this);
        this.c.create(map);
        com.tmoney.a.getInstance().clearTagException();
    }

    public final void finalizeUsim() {
        LogHelper.d("Task", "finalizeUsim()");
        com.tmoney.g.d dVar = this.c;
        if (dVar != null) {
            dVar.destroy();
            this.c = null;
        }
    }

    @Override // com.tmoney.g.d.a
    public final void finalizeUsim_CB() {
        finalizeUsim();
    }

    public final Context getContext() {
        return this.b;
    }

    public final com.tmoney.g.a.a getExcuter() {
        return this.d;
    }

    public final long getStartTime() {
        return this.f;
    }

    public final TmoneyCallback.ResultType makeResult(TmoneyCallback.ResultType resultType, ResultError resultError, TmoneyMsg.TmoneyResult tmoneyResult) {
        return resultType.setError(resultError).setDetailCode(tmoneyResult.getCode()).setMessage(tmoneyResult.getMessage());
    }

    public final TmoneyCallback.ResultType makeResult(TmoneyCallback.ResultType resultType, ResultError resultError, ResultDetailCode resultDetailCode) {
        return resultType.setError(resultError).setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage());
    }

    @Override // com.tmoney.g.d.a
    public final void onCreateResult(boolean z, TmoneyMsg.TmoneyResult tmoneyResult) {
        TmoneyMsg.TmoneyResult tmoneyResult2;
        this.j = tmoneyResult;
        LogHelper.d("Task", "onCreateResult " + z + "[" + this.d + "]" + tmoneyResult);
        if (!z) {
            try {
                tmoneyResult2 = this.j;
            } catch (Exception e) {
                LogHelper.exception("Task", e);
            }
            if (tmoneyResult2 != TmoneyMsg.TmoneyResult.USIM_ERROR_LGU_WAITING && tmoneyResult2 != TmoneyMsg.TmoneyResult.USIM_ERROR_KT_CLIENT_PROGRESS) {
                com.tmoney.g.d dVar = this.c;
                if (dVar != null) {
                    dVar.destroy();
                }
                this.c = null;
            }
            LogHelper.d("Task", "CLIENT_PROGRESS WAITING ..... " + this.j.getMessage());
            com.tmoney.g.a.a aVar = this.d;
            if (aVar instanceof m) {
                ((m) aVar).lgu_waitingProgressChanged(tmoneyResult);
                return;
            }
            return;
        }
        if (this.d == null) {
            LogHelper.d("Task", "mExecuter is null");
            return;
        }
        LogHelper.d("Task", "execute()" + this.d);
        new a(this.d).start();
    }

    @Override // com.tmoney.g.d.a
    public final void onDestroyResult(boolean z) {
        LogHelper.d("Task", "onDestroyResult isDestroy:" + z);
        b bVar = this.i;
        if (bVar != null) {
            bVar.onTaskResult();
        }
    }

    public final void setOnTaskListener(b bVar) {
        this.i = bVar;
    }

    public final void setStartTime() {
        this.f = System.currentTimeMillis();
    }
}
