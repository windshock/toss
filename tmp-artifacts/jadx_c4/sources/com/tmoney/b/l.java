package com.tmoney.b;

import android.content.Context;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.DCRG0001ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.DCRG0002ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class l extends com.tmoney.g.a.a {
    AbstractC0045f.a a;
    private final String b;
    private String c;
    private String d;
    private AbstractC0045f.a e;

    public l(Context context, boolean z, String str, ResultListener resultListener) {
        super(context, resultListener);
        this.b = "TmoneyDiscountCardRegistExecuter";
        this.e = new AbstractC0045f.a() { // from class: com.tmoney.b.l.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str2, String str3) {
                l.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str2).setMessage(str3));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                DCRG0001ResponseDTO dCRG0001ResponseDTO = (DCRG0001ResponseDTO) responseDTO;
                byte[] bArrA = l.this.a(com.tmoney.e.a.a.hexStringToByteArray(dCRG0001ResponseDTO.getResponse().getPrmtUpdCmd()));
                if (l.this.s()) {
                    l.this.d = com.tmoney.e.a.a.bytesToHexString(bArrA);
                    new com.tmoney.kscc.sslio.a.m(l.this.getContext(), l.this.a).execute(l.this.d, l.this.o(), dCRG0001ResponseDTO.getResponse().getTrdNo());
                    return;
                }
                l lVar = l.this;
                TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
                ResultDetailCode resultDetailCode = ResultDetailCode.USIM_SEL;
                lVar.a(error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()).setLog("ApduResSel::" + l.this.b() + " SW::" + l.this.q()));
            }
        };
        this.a = new AbstractC0045f.a() { // from class: com.tmoney.b.l.2
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str2, String str3) {
                l.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str2).setMessage(str3));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                DCRG0002ResponseDTO dCRG0002ResponseDTO = (DCRG0002ResponseDTO) responseDTO;
                l.this.a(TmoneyCallback.ResultType.SUCCESS.setDetailCode(dCRG0002ResponseDTO.getResponse().getRspCd()).setMessage(dCRG0002ResponseDTO.getResponse().getRspMsg()));
            }
        };
        this.c = z ? str : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TmoneyCallback.ResultType resultType) {
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            resultType.setData(n(), o());
        }
        onResult(resultType);
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) throws Throwable {
        super.execute(dVar, resultType);
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            try {
                if (l()) {
                    new com.tmoney.kscc.sslio.a.l(getContext(), this.e).execute(j(), b(), this.c);
                    return p();
                }
                TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
                ResultDetailCode resultDetailCode = ResultDetailCode.USIM_INIT_PARAM;
                resultType = error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()).setLog("ApduResInitParamUp::" + j() + " SW::" + q());
            } catch (Exception e) {
                TmoneyCallback.ResultType error2 = TmoneyCallback.ResultType.WARNING.setError(ResultError.EXCEPTION);
                ResultDetailCode resultDetailCode2 = ResultDetailCode.EXCEPTION_SERVER;
                onResult(error2.setDetailCode(resultDetailCode2.getCodeString()).setMessage(resultDetailCode2.getMessage()).setLog(e.getMessage()).setException(e));
            }
        }
        a(resultType);
        return p();
    }
}
