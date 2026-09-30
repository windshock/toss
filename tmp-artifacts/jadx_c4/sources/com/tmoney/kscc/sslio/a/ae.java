package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.request.TRDR0006RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TRDR0006ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ae extends AbstractC0049k {
    private TRDR0006RequestDTO c;

    public ae(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0006, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str) {
        TRDR0006RequestDTO tRDR0006RequestDTO = new TRDR0006RequestDTO();
        this.c = tRDR0006RequestDTO;
        tRDR0006RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setCrcmCd(str);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        TRDR0006ResponseDTO tRDR0006ResponseDTO = (TRDR0006ResponseDTO) c().fromJson(str, TRDR0006ResponseDTO.class);
        if (tRDR0006ResponseDTO == null || tRDR0006ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        tRDR0006ResponseDTO.setCmd(b());
        if (TextUtils.equals(tRDR0006ResponseDTO.getSuccess(), "true") && TextUtils.equals(tRDR0006ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(tRDR0006ResponseDTO);
        } else {
            d().onConnectionError(b(), tRDR0006ResponseDTO.getResponse().getRspCd(), tRDR0006ResponseDTO.getResponse().getRspMsg());
        }
    }
}
