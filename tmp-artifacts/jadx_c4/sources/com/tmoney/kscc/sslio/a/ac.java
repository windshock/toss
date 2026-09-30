package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.request.TRDR0004RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TRDR0004ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ac extends AbstractC0049k {
    private TRDR0004RequestDTO c;

    public ac() {
        this.c = null;
    }

    public ac(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0004, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3) {
        TRDR0004RequestDTO tRDR0004RequestDTO = new TRDR0004RequestDTO();
        this.c = tRDR0004RequestDTO;
        tRDR0004RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnic(g());
        this.c.setReqTyp(str);
        this.c.setSttDt(str2);
        this.c.setEndDt(str3);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        TRDR0004ResponseDTO tRDR0004ResponseDTO = (TRDR0004ResponseDTO) c().fromJson(str, TRDR0004ResponseDTO.class);
        if (tRDR0004ResponseDTO == null || tRDR0004ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        tRDR0004ResponseDTO.setCmd(b());
        if (TextUtils.equals(tRDR0004ResponseDTO.getSuccess(), "true") && TextUtils.equals(tRDR0004ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(tRDR0004ResponseDTO);
        } else {
            d().onConnectionError(b(), tRDR0004ResponseDTO.getResponse().getRspCd(), tRDR0004ResponseDTO.getResponse().getRspMsg());
        }
    }
}
