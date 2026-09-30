package com.tmoney.b;

import com.google.gson.Gson;
import com.tmoney.dto.Response5T;
import com.tmoney.dto.Response6T;
import com.tmoney.kscc.sslio.a.O;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class u$1 implements O.a {
    final /* synthetic */ u a;
    private /* synthetic */ String b;

    u$1(u uVar, String str) {
        this.a = uVar;
        this.b = str;
    }

    public final void onResultType(TmoneyCallback.ResultType resultType) {
        Response5T response5T;
        String str;
        Response5T.Data data;
        Response5T.Data data2;
        if (resultType != TmoneyCallback.ResultType.SUCCESS) {
            u.a(this.a, TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(resultType.getDetailCode()).setMessage(resultType.getMessage()));
            return;
        }
        String string = resultType.getData()[0].toString();
        LogHelper.d("TmoneyPaymentLoadExecuter", string);
        try {
            response5T = (Response5T) new Gson().fromJson(string, Response5T.class);
        } catch (Exception unused) {
            response5T = null;
        }
        if (response5T == null || (data2 = response5T.data) == null || !data2.REPL_CD.equals("00")) {
            if (response5T == null || (data = response5T.data) == null || (str = data.REPL_CD) == null) {
                str = "999";
            }
            u.a(this.a, TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(response5T != null ? response5T.msg : ResultDetailCode.SERVER.getMessage()).setLog(string));
            return;
        }
        if (!u.a(this.a, response5T.data.LOAD_APDU)) {
            u.a(this.a, 0);
        }
        u uVar = this.a;
        uVar.a = u.a(uVar);
        u uVar2 = this.a;
        uVar2.c.post(uVar2.b, u.a(uVar2, response5T.data.TR_NO, u.b(uVar2), u.c(this.a), u.d(this.a), response5T.data.LOAD_APDU, this.b));
        this.a.c.setListener(new O.a() { // from class: com.tmoney.b.u$1.1
            public final void onResultType(TmoneyCallback.ResultType resultType2) {
                Response6T response6T;
                Response6T.Data data3;
                if (resultType2 != TmoneyCallback.ResultType.SUCCESS) {
                    u.a(u$1.this.a, TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(resultType2.getDetailCode()).setMessage(resultType2.getMessage()));
                    return;
                }
                String string2 = resultType2.getData()[0].toString();
                try {
                    response6T = (Response6T) new Gson().fromJson(string2, Response6T.class);
                } catch (Exception unused2) {
                    response6T = null;
                }
                if (response6T == null || (data3 = response6T.data) == null || !data3.REPL_CD.equals("00")) {
                    u.a(u$1.this.a, TmoneyCallback.ResultType.SUCCESS.setMessage(response6T != null ? response6T.msg : ResultDetailCode.SERVER.getMessage()).setLog(string2));
                } else {
                    u.a(u$1.this.a, TmoneyCallback.ResultType.SUCCESS);
                }
            }
        });
    }
}
