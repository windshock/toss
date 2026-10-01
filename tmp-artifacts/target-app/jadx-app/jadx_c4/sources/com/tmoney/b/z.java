package com.tmoney.b;

import android.content.Context;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.K;
import com.tmoney.kscc.sslio.a.L;
import com.tmoney.kscc.sslio.constants.APIConstants;
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
public final class z extends com.tmoney.g.a.a {
    AbstractC0045f.a a;
    private TmoneyData b;
    private int c;
    private int d;
    private boolean e;
    private TmoneyCallback.ResultType f;
    private AbstractC0045f.a g;
    private AbstractC0045f.a h;

    public z(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.c = 0;
        this.d = 0;
        this.e = false;
        this.g = new AbstractC0045f.a() { // from class: com.tmoney.b.z.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                z.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2), true);
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                MSS0002ResponseDTO mSS0002ResponseDTO = (MSS0002ResponseDTO) responseDTO;
                if (z.this.c <= 0) {
                    z.this.a(TmoneyCallback.ResultType.SUCCESS, true);
                    return;
                }
                z zVar = z.this;
                zVar.e = zVar.a(mSS0002ResponseDTO.getResponse().getUnLoadApdu());
                new L(z.this.getContext(), z.this.a).execute(z.this.i(), mSS0002ResponseDTO.getResponse().getMissTrdNo());
            }
        };
        this.a = new AbstractC0045f.a() { // from class: com.tmoney.b.z.2
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                TmoneyCallback.ResultType resultType = TmoneyCallback.ResultType.SUCCESS;
                if (!z.this.e) {
                    resultType = TmoneyCallback.ResultType.WARNING;
                }
                z.this.a(resultType.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2), true);
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                z zVar;
                TmoneyCallback.ResultType error;
                MSS0003ResponseDTO mSS0003ResponseDTO = (MSS0003ResponseDTO) responseDTO;
                if (z.this.e) {
                    z zVar2 = z.this;
                    zVar2.d = zVar2.p();
                    z.this.b.setLastBalance(z.this.d);
                    z.this.b.setJoinGrade("B1");
                    zVar = z.this;
                    error = TmoneyCallback.ResultType.SUCCESS;
                } else {
                    zVar = z.this;
                    error = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
                }
                zVar.f = error;
                z.this.f.setDetailCode(mSS0003ResponseDTO.getResponse().getRspCd());
                z.this.f.setMessage(mSS0003ResponseDTO.getResponse().getRspMsg());
                z zVar3 = z.this;
                zVar3.a(zVar3.f, true);
            }
        };
        this.h = new AbstractC0045f.a() { // from class: com.tmoney.b.z.3
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                z zVar = z.this;
                zVar.a(zVar.f, false);
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) throws Throwable {
                z.this.b.setTmoneyData((MBR0003ResponseDTO) responseDTO);
                z zVar = z.this;
                zVar.a(zVar.f, false);
            }
        };
        this.b = TmoneyData.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TmoneyCallback.ResultType resultType, boolean z) {
        if (z) {
            this.f = resultType;
            new com.tmoney.kscc.sslio.a.D(getContext(), this.h).execute();
            return;
        }
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            resultType.setData(n(), Integer.valueOf(this.c), Integer.valueOf(this.d));
        }
        onResult(resultType);
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        super.execute(dVar, resultType);
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            this.c = p();
            if (k()) {
                new K(getContext(), this.g).execute(b(), g(), Integer.toString(this.c));
            } else {
                TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
                ResultDetailCode resultDetailCode = ResultDetailCode.USIM_INIT_REFUND;
                resultType = error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage()).setLog("ApduResInitUnLoad::" + g() + " SW::" + q());
                a(resultType, true);
            }
        } else {
            a(resultType, true);
        }
        return p();
    }
}
