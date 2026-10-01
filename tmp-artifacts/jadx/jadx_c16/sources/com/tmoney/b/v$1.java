package com.tmoney.b;

import com.tmoney.kscc.sslio.a.f;
import com.tmoney.kscc.sslio.a.p;
import com.tmoney.kscc.sslio.a.r;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.DPCG0002ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.DPCG0004ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.TmoneyCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class v$1 implements f.a {
    final /* synthetic */ v a;

    v$1(v vVar) {
        this.a = vVar;
    }

    public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
        v.a(this.a, TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2), true);
    }

    public final void onConnectionSuccess(ResponseDTO responseDTO) {
        v.a(this.a, responseDTO);
        v vVar = this.a;
        v.a(vVar, v.a(vVar, v.a(vVar)));
        if (v.b(this.a) == APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0001) {
            new p(this.a.getContext(), new f.a() { // from class: com.tmoney.b.v$1.1
                public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                    TmoneyCallback.ResultType resultType = TmoneyCallback.ResultType.SUCCESS;
                    if (!v.e(v$1.this.a)) {
                        resultType = TmoneyCallback.ResultType.WARNING;
                    }
                    v.a(v$1.this.a, resultType.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2), true);
                }

                public final void onConnectionSuccess(ResponseDTO responseDTO2) {
                    DPCG0002ResponseDTO dPCG0002ResponseDTO = (DPCG0002ResponseDTO) responseDTO2;
                    v.a(v$1.this.a, TmoneyCallback.ResultType.SUCCESS.setDetailCode(dPCG0002ResponseDTO.getResponse().getRspCd()).setMessage(dPCG0002ResponseDTO.getResponse().getRspMsg()), true);
                }
            }).execute(v.c(this.a), v.d(this.a));
        } else {
            new r(this.a.getContext(), new f.a() { // from class: com.tmoney.b.v$1.2
                public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                    TmoneyCallback.ResultType resultType = TmoneyCallback.ResultType.SUCCESS;
                    if (!v.e(v$1.this.a)) {
                        resultType = TmoneyCallback.ResultType.WARNING;
                    }
                    v.a(v$1.this.a, resultType.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2), true);
                }

                public final void onConnectionSuccess(ResponseDTO responseDTO2) {
                    DPCG0004ResponseDTO dPCG0004ResponseDTO = (DPCG0004ResponseDTO) responseDTO2;
                    v.a(v$1.this.a, TmoneyCallback.ResultType.SUCCESS.setDetailCode(dPCG0004ResponseDTO.getResponse().getRspCd()).setMessage(dPCG0004ResponseDTO.getResponse().getRspMsg()), true);
                }
            }).execute(v.f(this.a), v.d(this.a));
        }
    }
}
