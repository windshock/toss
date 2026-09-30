package com.tmoney.b;

import android.content.Context;
import com.tmoney.Tmoney;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.C0055w;
import com.tmoney.kscc.sslio.a.C0056y;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.response.DPCG0014ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MBR0003ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class o extends com.tmoney.g.a.a {
    AbstractC0045f.a a;
    private final String b;
    private APIConstants.EAPI_CONST c;

    public o(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.b = "TmoneyIncreaseLimitExecuter";
        this.a = new AbstractC0045f.a() { // from class: com.tmoney.b.o.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                TmoneyCallback.ResultType resultType = TmoneyCallback.ResultType.WARNING;
                TmoneyCallback.ResultType message = resultType.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2);
                if (!str.equals("PO64")) {
                    if (o.this.c == APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0016) {
                        message = resultType.setError(ResultError.NOREGIST_CREDITCARD).setDetailCode(str).setMessage(str2);
                    }
                    o.this.onResult(message);
                    return;
                }
                o.this.c = APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0016;
                if (o.this.s()) {
                    String registedCreditCardCode = Tmoney.Info.getRegistedCreditCardCode();
                    int limiteAmountPostPaid = Tmoney.Info.getLimiteAmountPostPaid(Tmoney.Info.getRegistedCreditCardCode());
                    new C0056y(o.this.getContext(), o.this.a).execute(registedCreditCardCode, String.valueOf(limiteAmountPostPaid), "", CodeConstants.ENC_TGT_DVS_CD.OTC.getCode(), o.this.b(), o.this.p());
                    return;
                }
                o oVar = o.this;
                TmoneyCallback.ResultType error = resultType.setError(ResultError.USIM_ERROR);
                ResultDetailCode resultDetailCode = ResultDetailCode.USIM_SEL;
                oVar.onResult(error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) throws Throwable {
                if (o.this.c == APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0014) {
                    DPCG0014ResponseDTO dPCG0014ResponseDTO = (DPCG0014ResponseDTO) responseDTO;
                    String loadApdu = dPCG0014ResponseDTO.getResponse().getLoadApdu();
                    String lmtCancTrdNo = dPCG0014ResponseDTO.getResponse().getLmtCancTrdNo();
                    if (o.this.a(loadApdu)) {
                        o.this.c = APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0015;
                        new com.tmoney.kscc.sslio.a.x(o.this.getContext(), o.this.a).execute(lmtCancTrdNo, o.this.b(), o.this.i());
                        return;
                    } else {
                        o oVar = o.this;
                        TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
                        ResultDetailCode resultDetailCode = ResultDetailCode.USIM_UNLOAD;
                        oVar.onResult(error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()));
                        return;
                    }
                }
                if (o.this.c != APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0015) {
                    if (o.this.c == APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0016) {
                        o.this.c = APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0003;
                        new com.tmoney.kscc.sslio.a.D(o.this.getContext(), o.this.a).execute();
                        return;
                    } else {
                        if (o.this.c == APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0003) {
                            TmoneyData.getInstance().setTmoneyData((MBR0003ResponseDTO) responseDTO);
                            o oVar2 = o.this;
                            oVar2.onResult(TmoneyCallback.ResultType.SUCCESS.setData(Integer.valueOf(oVar2.p())));
                            return;
                        }
                        return;
                    }
                }
                o.this.c = APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0016;
                if (o.this.s()) {
                    new C0056y(o.this.getContext(), o.this.a).execute(Tmoney.Info.getRegistedCreditCardCode(), String.valueOf(Tmoney.Info.getLimiteAmountPostPaid(Tmoney.Info.getRegistedCreditCardCode())), "", CodeConstants.ENC_TGT_DVS_CD.OTC.getCode(), o.this.b(), o.this.p());
                    return;
                }
                o oVar3 = o.this;
                TmoneyCallback.ResultType error2 = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
                ResultDetailCode resultDetailCode2 = ResultDetailCode.USIM_SEL;
                oVar3.onResult(error2.setDetailCode(resultDetailCode2.getCodeString()).setMessage(resultDetailCode2.getMessage()).setLog("ApduResSel::" + o.this.b() + " SW::" + o.this.q()));
            }
        };
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        super.execute(dVar, resultType);
        if (k()) {
            this.c = APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0014;
            new C0055w(getContext(), this.a).execute(b(), g(), String.format("%d", Integer.valueOf(p())));
        } else {
            TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
            ResultDetailCode resultDetailCode = ResultDetailCode.USIM_INIT_UNLOAD;
            onResult(error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()));
        }
        return p();
    }
}
