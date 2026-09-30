package com.tmoney.b;

import android.content.Context;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.MBR0003ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class w extends com.tmoney.g.a.a {
    private final String a;
    private final int b;
    private AbstractC0045f.a c;

    public w(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TmoneyPostpaidLoadInitCheckExecuter";
        this.b = 1;
        this.c = new AbstractC0045f.a() { // from class: com.tmoney.b.w.2
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                w.this.a("PO85".equals(str) ? TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2) : TmoneyCallback.ResultType.SUCCESS, true);
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                w.this.a(TmoneyCallback.ResultType.SUCCESS, true);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final TmoneyCallback.ResultType resultType, boolean z) {
        LogHelper.dw("TmoneyPostpaidLoadInitCheckExecuter", "Listener " + resultType);
        if (z) {
            new com.tmoney.kscc.sslio.a.D(getContext(), new AbstractC0045f.a() { // from class: com.tmoney.b.w.1
                @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
                public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                    w.this.a(resultType, false);
                }

                @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
                public final void onConnectionSuccess(ResponseDTO responseDTO) throws Throwable {
                    TmoneyData.getInstance(w.this.getContext()).setTmoneyData((MBR0003ResponseDTO) responseDTO);
                    w.this.a(resultType, false);
                }
            }).execute();
            return;
        }
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            resultType.setData(n());
        }
        onResult(resultType);
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        super.execute(dVar, resultType);
        if (resultType != TmoneyCallback.ResultType.SUCCESS) {
            a(resultType, true);
        } else if (a(1)) {
            new com.tmoney.kscc.sslio.a.q(getContext(), this.c).execute(b(), c(), String.format("%d", 1), "Y", "N", d());
        } else {
            TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
            ResultDetailCode resultDetailCode = ResultDetailCode.USIM_INIT_PURCHASE;
            resultType = error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()).setLog("SW::" + q());
            a(resultType, true);
        }
        return p();
    }
}
