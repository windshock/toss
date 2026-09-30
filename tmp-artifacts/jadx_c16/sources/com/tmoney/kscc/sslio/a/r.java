package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.DPCG0004RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.DPCG0004ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class r extends k {
    private DPCG0004RequestDTO c;

    public r(Context context, f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0004, aVar);
        this.c = null;
    }

    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2) {
        DPCG0004RequestDTO dPCG0004RequestDTO = new DPCG0004RequestDTO();
        this.c = dPCG0004RequestDTO;
        dPCG0004RequestDTO.setTmcrNo(((f) this).m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setChgTrdNo(str2);
        this.c.setLoadRst(str);
        connectServer();
    }

    public final void onResponse(String str) {
        DPCG0004ResponseDTO dPCG0004ResponseDTO = (DPCG0004ResponseDTO) c().fromJson(str, DPCG0004ResponseDTO.class);
        if (dPCG0004ResponseDTO == null || dPCG0004ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        dPCG0004ResponseDTO.setCmd(b());
        if (TextUtils.equals(dPCG0004ResponseDTO.getSuccess(), "true") && TextUtils.equals(dPCG0004ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(dPCG0004ResponseDTO);
        } else {
            d().onConnectionError(b(), dPCG0004ResponseDTO.getResponse().getRspCd(), dPCG0004ResponseDTO.getResponse().getRspMsg());
        }
    }
}
