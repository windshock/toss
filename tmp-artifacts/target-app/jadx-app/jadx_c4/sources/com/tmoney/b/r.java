package com.tmoney.b;

import android.content.Context;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.Q;
import com.tmoney.kscc.sslio.a.S;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.PRCG0004ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.PRCG0006ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class r extends com.tmoney.g.a.a {
    AbstractC0045f.a a;
    private final String b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private String h;
    private String i;
    private boolean j;
    private AbstractC0045f.a k;

    public r(Context context, String str, String str2, int i, int i2, int i3, ResultListener resultListener) {
        super(context, resultListener);
        this.b = "TmoneyLoadPointExecuter";
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = -1;
        this.g = -1;
        this.j = false;
        this.k = new AbstractC0045f.a() { // from class: com.tmoney.b.r.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str3, String str4) {
                r.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str3).setMessage(str4));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                PRCG0006ResponseDTO pRCG0006ResponseDTO = (PRCG0006ResponseDTO) responseDTO;
                r rVar = r.this;
                rVar.j = rVar.b(pRCG0006ResponseDTO.getResponse().getLoadApdu());
                r rVar2 = r.this;
                rVar2.e = rVar2.p();
                new Q(r.this.getContext(), r.this.a).execute(pRCG0006ResponseDTO.getResponse().getChgTrdNo(), r.this.f());
            }
        };
        this.a = new AbstractC0045f.a() { // from class: com.tmoney.b.r.2
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str3, String str4) {
                TmoneyCallback.ResultType resultType = TmoneyCallback.ResultType.SUCCESS;
                if (!r.this.j) {
                    resultType = TmoneyCallback.ResultType.WARNING;
                }
                r.this.a(resultType.setError(ResultError.SERVER_ERROR).setDetailCode(str3).setMessage(str4));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                PRCG0004ResponseDTO pRCG0004ResponseDTO = (PRCG0004ResponseDTO) responseDTO;
                r.this.a(TmoneyCallback.ResultType.SUCCESS.setDetailCode(pRCG0004ResponseDTO.getResponse().getRspCd()).setMessage(pRCG0004ResponseDTO.getResponse().getRspMsg()));
            }
        };
        this.h = str;
        this.i = str2;
        this.c = i;
        this.f = i2;
        this.g = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TmoneyCallback.ResultType resultType) {
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            resultType.setData(n(), Integer.valueOf(this.d), Integer.valueOf(this.e));
        }
        onResult(resultType);
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        super.execute(dVar, resultType);
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            try {
                if (b(this.c)) {
                    this.d = p();
                    new S(getContext(), this.k).execute(this.h, this.c, this.f, this.g, this.i, b(), c());
                    return this.d;
                }
                TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
                ResultDetailCode resultDetailCode = ResultDetailCode.USIM_INIT_LOAD;
                resultType = error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()).setLog("ApduResInitLoad::" + c() + " SW::" + q());
            } catch (Exception e) {
                TmoneyCallback.ResultType error2 = TmoneyCallback.ResultType.WARNING.setError(ResultError.EXCEPTION);
                ResultDetailCode resultDetailCode2 = ResultDetailCode.EXCEPTION_SERVER;
                resultType = error2.setDetailCode(resultDetailCode2.getCodeString()).setMessage(resultDetailCode2.getMessage()).setLog(e.getMessage()).setException(e);
            }
        }
        a(resultType);
        return p();
    }
}
