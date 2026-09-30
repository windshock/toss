package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.request.TRDR0001RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TRDR0001ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class aa extends AbstractC0049k {
    private TRDR0001RequestDTO c;

    public aa(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0001, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2) {
        TRDR0001RequestDTO tRDR0001RequestDTO = new TRDR0001RequestDTO();
        this.c = tRDR0001RequestDTO;
        tRDR0001RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setCrcmCd(str2);
        this.c.setBillYM(str);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        TRDR0001ResponseDTO tRDR0001ResponseDTO = (TRDR0001ResponseDTO) c().fromJson(str, TRDR0001ResponseDTO.class);
        if (tRDR0001ResponseDTO == null || tRDR0001ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        tRDR0001ResponseDTO.setCmd(b());
        if (TextUtils.equals(tRDR0001ResponseDTO.getSuccess(), "true") && TextUtils.equals(tRDR0001ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(tRDR0001ResponseDTO);
        } else {
            d().onConnectionError(b(), tRDR0001ResponseDTO.getResponse().getRspCd(), tRDR0001ResponseDTO.getResponse().getRspMsg());
        }
    }
}
