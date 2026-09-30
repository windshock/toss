package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.request.TRDR0013RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TRDR0013ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ag extends AbstractC0049k {
    private TRDR0013RequestDTO c;

    public ag(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0013, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute() {
        TRDR0013RequestDTO tRDR0013RequestDTO = new TRDR0013RequestDTO();
        this.c = tRDR0013RequestDTO;
        tRDR0013RequestDTO.setMbphNo(f());
        this.c.setTlcmCd(this.m_tmoneyData.getTelecomCode());
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        TRDR0013ResponseDTO tRDR0013ResponseDTO = (TRDR0013ResponseDTO) c().fromJson(str, TRDR0013ResponseDTO.class);
        if (tRDR0013ResponseDTO == null || tRDR0013ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        tRDR0013ResponseDTO.setCmd(b());
        if (TextUtils.equals(tRDR0013ResponseDTO.getSuccess(), "true") && TextUtils.equals(tRDR0013ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(tRDR0013ResponseDTO);
        } else {
            d().onConnectionError(b(), tRDR0013ResponseDTO.getResponse().getRspCd(), tRDR0013ResponseDTO.getResponse().getRspMsg());
        }
    }
}
