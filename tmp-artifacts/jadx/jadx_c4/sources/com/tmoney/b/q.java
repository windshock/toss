package com.tmoney.b;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.P;
import com.tmoney.kscc.sslio.a.Q;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.PRCG0001ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.PRCG0004ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class q extends com.tmoney.g.a.a {
    AbstractC0045f.a a;
    private final String b;
    private TmoneyData c;
    private int d;
    private int e;
    private int f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;

    /* renamed from: o, reason: collision with root package name */
    private String f6o;
    private String p;
    private boolean q;
    private AbstractC0045f.a r;

    public q(Context context, int i, int i2, ResultListener resultListener) {
        super(context, resultListener);
        this.b = "TmoneyLoadExecuter";
        this.d = 0;
        this.e = 0;
        this.q = false;
        this.r = new AbstractC0045f.a() { // from class: com.tmoney.b.q.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                if (TextUtils.equals(str, "PR23")) {
                    new com.tmoney.c.c(q.this.getContext(), null).requestOnlyDate();
                }
                q.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                PRCG0001ResponseDTO pRCG0001ResponseDTO = (PRCG0001ResponseDTO) responseDTO;
                q qVar = q.this;
                qVar.q = qVar.b(pRCG0001ResponseDTO.getResponse().getLoadApdu());
                q qVar2 = q.this;
                qVar2.e = qVar2.p();
                new Q(q.this.getContext(), q.this.a).execute(pRCG0001ResponseDTO.getResponse().getChgTrdNo(), q.this.f());
            }
        };
        this.a = new AbstractC0045f.a() { // from class: com.tmoney.b.q.2
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                TmoneyCallback.ResultType resultType = TmoneyCallback.ResultType.SUCCESS;
                if (!q.this.q) {
                    resultType = TmoneyCallback.ResultType.WARNING;
                }
                q.this.a(resultType.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                PRCG0004ResponseDTO pRCG0004ResponseDTO = (PRCG0004ResponseDTO) responseDTO;
                q.this.a(TmoneyCallback.ResultType.SUCCESS.setDetailCode(pRCG0004ResponseDTO.getResponse().getRspCd()).setMessage(pRCG0004ResponseDTO.getResponse().getRspMsg()));
            }
        };
        this.c = TmoneyData.getInstance(context);
        this.f = i;
        this.g = "02";
        this.h = String.format("%d", Integer.valueOf(i));
        this.i = "";
        this.j = "";
        this.k = "M";
        this.l = this.c.getCrcmCd();
        this.m = this.c.getCrdtChecDvsCd();
        this.n = "";
        this.f6o = String.format("%d", Integer.valueOf(i2));
        this.p = String.format("%d", Integer.valueOf(i + i2));
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
            this.d = p();
            if (b(this.f)) {
                new P(getContext(), this.r).execute(this.g, Integer.parseInt(this.h), this.i, this.j, b(), c(), this.k, this.l, this.m, this.n, this.f6o, this.p);
                return this.d;
            }
            TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
            ResultDetailCode resultDetailCode = ResultDetailCode.USIM_INIT_LOAD;
            resultType = error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()).setLog("ApduResInitLoad::" + c() + " SW::" + q());
        }
        a(resultType);
        return p();
    }
}
