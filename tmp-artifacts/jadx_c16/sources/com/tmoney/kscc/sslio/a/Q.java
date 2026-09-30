package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.PRCG0004RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.PRCG0004ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class Q extends k {
    private PRCG0004RequestDTO c;

    public Q(Context context, f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_002_PRCG_0004, aVar);
        this.c = null;
    }

    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2) {
        PRCG0004RequestDTO pRCG0004RequestDTO = new PRCG0004RequestDTO();
        this.c = pRCG0004RequestDTO;
        pRCG0004RequestDTO.setTmcrNo(((f) this).m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnic(g());
        this.c.setChgTrdNo(str);
        this.c.setLoadRst(str2);
        connectServer();
    }

    public final void onResponse(String str) {
        PRCG0004ResponseDTO pRCG0004ResponseDTO = (PRCG0004ResponseDTO) c().fromJson(str, PRCG0004ResponseDTO.class);
        if (pRCG0004ResponseDTO == null || pRCG0004ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        pRCG0004ResponseDTO.setCmd(b());
        if (TextUtils.equals(pRCG0004ResponseDTO.getSuccess(), "true") && TextUtils.equals(pRCG0004ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(pRCG0004ResponseDTO);
        } else {
            d().onConnectionError(b(), pRCG0004ResponseDTO.getResponse().getRspCd(), pRCG0004ResponseDTO.getResponse().getRspMsg());
        }
    }
}
