package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.request.TRDR0016RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TRDR0016ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ai extends AbstractC0049k {
    private TRDR0016RequestDTO c;

    public ai() {
        this.c = null;
    }

    public ai(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0016, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str) {
        TRDR0016RequestDTO tRDR0016RequestDTO = new TRDR0016RequestDTO();
        this.c = tRDR0016RequestDTO;
        tRDR0016RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setPymMnsGrpCd(str);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        TRDR0016ResponseDTO tRDR0016ResponseDTO = (TRDR0016ResponseDTO) c().fromJson(str, TRDR0016ResponseDTO.class);
        if (tRDR0016ResponseDTO == null || tRDR0016ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        tRDR0016ResponseDTO.setCmd(b());
        if (TextUtils.equals(tRDR0016ResponseDTO.getSuccess(), "true") && TextUtils.equals(tRDR0016ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(tRDR0016ResponseDTO);
        } else {
            d().onConnectionError(b(), tRDR0016ResponseDTO.getResponse().getRspCd(), tRDR0016ResponseDTO.getResponse().getRspMsg());
        }
    }
}
