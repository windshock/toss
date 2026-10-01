package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.request.TRDR0017RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TRDR0017ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class aj extends AbstractC0049k {
    private TRDR0017RequestDTO c;

    public aj() {
        this.c = null;
    }

    public aj(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0017, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2) {
        TRDR0017RequestDTO tRDR0017RequestDTO = new TRDR0017RequestDTO();
        this.c = tRDR0017RequestDTO;
        tRDR0017RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setRgtFromDt(str);
        this.c.setRgtToDt(str2);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        TRDR0017ResponseDTO tRDR0017ResponseDTO = (TRDR0017ResponseDTO) c().fromJson(str, TRDR0017ResponseDTO.class);
        if (tRDR0017ResponseDTO == null || tRDR0017ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        tRDR0017ResponseDTO.setCmd(b());
        if (TextUtils.equals(tRDR0017ResponseDTO.getSuccess(), "true") && TextUtils.equals(tRDR0017ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(tRDR0017ResponseDTO);
        } else {
            d().onConnectionError(b(), tRDR0017ResponseDTO.getResponse().getRspCd(), tRDR0017ResponseDTO.getResponse().getRspMsg());
        }
    }
}
