package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.request.TRDR0005RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TRDR0005ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ad extends AbstractC0049k {
    private TRDR0005RequestDTO c;

    public ad(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0005, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3, String str4, String str5) {
        TRDR0005RequestDTO tRDR0005RequestDTO = new TRDR0005RequestDTO();
        this.c = tRDR0005RequestDTO;
        tRDR0005RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnic(g());
        this.c.setReqTyp(str);
        this.c.setSttDt(str2);
        this.c.setEndDt(str3);
        this.c.setListCnt(str4);
        this.c.setPage(str5);
        this.c.setMoappVer("222");
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        TRDR0005ResponseDTO tRDR0005ResponseDTO = (TRDR0005ResponseDTO) c().fromJson(str, TRDR0005ResponseDTO.class);
        if (tRDR0005ResponseDTO == null || tRDR0005ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        tRDR0005ResponseDTO.setCmd(b());
        if (TextUtils.equals(tRDR0005ResponseDTO.getSuccess(), "true") && TextUtils.equals(tRDR0005ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(tRDR0005ResponseDTO);
        } else {
            d().onConnectionError(b(), tRDR0005ResponseDTO.getResponse().getRspCd(), tRDR0005ResponseDTO.getResponse().getRspMsg());
        }
    }
}
