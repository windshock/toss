package com.tmoney.c;

import android.content.Context;
import com.google.gson.Gson;
import com.tmoney.dto.UsePlaceListDto;
import com.tmoney.kscc.sslio.a.O;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.Callback;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class B extends C0041b {
    UsePlaceListDto b;
    private final String c;
    private com.tmoney.d.a d;
    private int e;
    private TmoneyData f;
    private O g;

    public B(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.c = "UsePlaceInfoInstance";
        this.b = null;
        this.f = TmoneyData.getInstance(context);
        this.d = com.tmoney.d.a.getInstance();
        this.e = this.f.getServerType();
        this.g = O.getInstance();
    }

    public final void request() throws Throwable {
        this.g.get(this.d.getUsePlaceUrl(this.e));
        this.g.setListener(new O.a() { // from class: com.tmoney.c.B.1
            @Override // com.tmoney.kscc.sslio.a.O.a
            public final void onResultType(TmoneyCallback.ResultType resultType) {
                if (resultType != TmoneyCallback.ResultType.SUCCESS) {
                    B.this.onResult(resultType);
                    return;
                }
                try {
                    String string = resultType.getData()[0].toString();
                    B.this.b = (UsePlaceListDto) new Gson().fromJson(string, UsePlaceListDto.class);
                    if ("200".equals(B.this.b.getStatus())) {
                        B b = B.this;
                        b.onResult(Callback.success(b.b.getItemList().get(0).getblthCtt()));
                    } else {
                        B b2 = B.this;
                        b2.onResult(Callback.warning(ResultError.SERVER_ERROR, b2.b.getStatus(), B.this.b.getMessage()));
                    }
                } catch (Exception e) {
                    B b3 = B.this;
                    ResultError resultError = ResultError.EXCEPTION;
                    ResultDetailCode resultDetailCode = ResultDetailCode.EXCEPTION_SERVER;
                    b3.onResult(Callback.warning(resultError, resultDetailCode.getCodeString(), resultDetailCode.getMessage()).setLog(e.getMessage()).setException(e));
                }
            }
        });
    }
}
