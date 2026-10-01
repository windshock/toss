package com.tmoney.b;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.C0052s;
import com.tmoney.kscc.sslio.a.K;
import com.tmoney.kscc.sslio.a.L;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.response.DPCG0005ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.DPCG0006ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MBR0003ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MSS0002ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MSS0003ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class A extends com.tmoney.g.a.a {
    AbstractC0045f.a a;
    private final String b;
    private TmoneyData c;
    private int d;
    private int e;
    private boolean f;
    private APIConstants.EAPI_CONST g;
    private AbstractC0045f.a h;

    public A(Context context, String str, ResultListener resultListener) {
        super(context, resultListener);
        this.b = "TmoneyRefundForPostPaidExecuter";
        this.d = 0;
        this.e = 0;
        this.f = false;
        this.h = new AbstractC0045f.a() { // from class: com.tmoney.b.A.2
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str2, String str3) {
                TmoneyCallback.ResultType resultType;
                ResultError resultError;
                TmoneyCallback.ResultType message;
                if (TextUtils.equals("PO63", str2)) {
                    resultType = TmoneyCallback.ResultType.WARNING;
                    resultError = ResultError.USIM_ERROR;
                } else if (TextUtils.equals("PO64", str2)) {
                    message = TmoneyCallback.ResultType.SUCCESS;
                    A.this.a(message.setDetailCode(str2).setMessage(str3), true);
                } else {
                    resultType = TmoneyCallback.ResultType.WARNING;
                    resultError = ResultError.SERVER_ERROR;
                }
                message = resultType.setError(resultError).setDetailCode(str2).setMessage(str3);
                A.this.a(message.setDetailCode(str2).setMessage(str3), true);
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                String rspCd;
                String rspMsg;
                String unLoadApdu;
                String missTrdNo;
                APIConstants.EAPI_CONST eapi_const = A.this.g;
                APIConstants.EAPI_CONST eapi_const2 = APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0005;
                if (eapi_const == eapi_const2) {
                    DPCG0005ResponseDTO dPCG0005ResponseDTO = (DPCG0005ResponseDTO) responseDTO;
                    rspCd = dPCG0005ResponseDTO.getResponse().getRspCd();
                    rspMsg = dPCG0005ResponseDTO.getResponse().getRspMsg();
                    unLoadApdu = dPCG0005ResponseDTO.getResponse().getLoadApdu();
                    missTrdNo = dPCG0005ResponseDTO.getResponse().getLmtCancTrdNo();
                } else {
                    MSS0002ResponseDTO mSS0002ResponseDTO = (MSS0002ResponseDTO) responseDTO;
                    rspCd = mSS0002ResponseDTO.getResponse().getRspCd();
                    rspMsg = mSS0002ResponseDTO.getResponse().getRspMsg();
                    unLoadApdu = mSS0002ResponseDTO.getResponse().getUnLoadApdu();
                    missTrdNo = mSS0002ResponseDTO.getResponse().getMissTrdNo();
                }
                if (A.this.g != eapi_const2 && TextUtils.isEmpty(unLoadApdu)) {
                    A.this.a(TmoneyCallback.ResultType.SUCCESS.setDetailCode(rspCd).setMessage(rspMsg), true);
                    return;
                }
                A a = A.this;
                a.f = a.a(unLoadApdu);
                if (A.this.g == eapi_const2) {
                    new com.tmoney.kscc.sslio.a.t(A.this.getContext(), A.this.a).execute(missTrdNo, A.this.b(), A.this.i(), String.format("%d", Integer.valueOf(A.this.d)));
                } else {
                    new L(A.this.getContext(), A.this.a).execute(A.this.i(), missTrdNo);
                }
            }
        };
        this.a = new AbstractC0045f.a() { // from class: com.tmoney.b.A.3
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str2, String str3) {
                TmoneyCallback.ResultType resultType = TmoneyCallback.ResultType.SUCCESS;
                if (!A.this.f) {
                    resultType = TmoneyCallback.ResultType.WARNING;
                }
                A.this.a(resultType.setError(ResultError.SERVER_ERROR).setDetailCode(str2).setMessage(str3), true);
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                String rspCd;
                String rspMsg;
                TmoneyCallback.ResultType message;
                if (responseDTO instanceof DPCG0006ResponseDTO) {
                    DPCG0006ResponseDTO dPCG0006ResponseDTO = (DPCG0006ResponseDTO) responseDTO;
                    rspCd = dPCG0006ResponseDTO.getResponse().getRspCd();
                    rspMsg = dPCG0006ResponseDTO.getResponse().getRspMsg();
                } else {
                    MSS0003ResponseDTO mSS0003ResponseDTO = (MSS0003ResponseDTO) responseDTO;
                    rspCd = mSS0003ResponseDTO.getResponse().getRspCd();
                    rspMsg = mSS0003ResponseDTO.getResponse().getRspMsg();
                }
                A a = A.this;
                a.e = a.p();
                if (A.this.f) {
                    A.this.c.setJoinGrade("B1");
                    message = TmoneyCallback.ResultType.SUCCESS;
                } else {
                    message = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR).setDetailCode(rspCd).setMessage(rspMsg);
                }
                A.this.a(message.setDetailCode(rspCd).setMessage(rspMsg), true);
            }
        };
        this.c = TmoneyData.getInstance(context);
        this.g = (CodeConstants.USR_USE_LTN_CD.LOST.getCode().equals(str) || CodeConstants.USR_USE_LTN_CD.SAFE_LOST.getCode().equals(str) || CodeConstants.USR_USE_LTN_CD.JUST_MSS.getCode().equals(str)) ? APIConstants.EAPI_CONST.EAPI_CONST_009_MSS_0002 : APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0005;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final TmoneyCallback.ResultType resultType, boolean z) {
        if (z) {
            new com.tmoney.kscc.sslio.a.D(getContext(), new AbstractC0045f.a() { // from class: com.tmoney.b.A.1
                @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
                public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                    A.this.a(resultType, false);
                }

                @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
                public final void onConnectionSuccess(ResponseDTO responseDTO) throws Throwable {
                    A.this.c.setTmoneyData((MBR0003ResponseDTO) responseDTO);
                    A.this.a(resultType, false);
                }
            }).execute();
            return;
        }
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
            if (!k()) {
                TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
                ResultDetailCode resultDetailCode = ResultDetailCode.USIM_INIT_REFUND;
                a(error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()).setLog("ApduResIunLoad" + g() + " SW::" + q()), true);
            } else if (this.g == APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0005) {
                new C0052s(getContext(), this.h).execute(b(), g(), String.format("%d", Integer.valueOf(this.d)));
            } else {
                new K(getContext(), this.h).execute(b(), g(), String.format("%d", Integer.valueOf(this.d)));
            }
        } else {
            a(resultType, true);
        }
        return p();
    }
}
