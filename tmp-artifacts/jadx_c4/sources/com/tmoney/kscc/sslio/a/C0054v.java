package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.DPCG0009RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.DPCG0009ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;

/* renamed from: com.tmoney.kscc.sslio.a.v, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0054v extends AbstractC0049k {
    private DPCG0009RequestDTO c;

    public C0054v(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0009, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute() {
        DPCG0009RequestDTO dPCG0009RequestDTO = new DPCG0009RequestDTO();
        this.c = dPCG0009RequestDTO;
        dPCG0009RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        DPCG0009ResponseDTO dPCG0009ResponseDTO = (DPCG0009ResponseDTO) c().fromJson(str, DPCG0009ResponseDTO.class);
        if (dPCG0009ResponseDTO == null || dPCG0009ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        dPCG0009ResponseDTO.setCmd(b());
        if (TextUtils.equals(dPCG0009ResponseDTO.getSuccess(), "true") && TextUtils.equals(dPCG0009ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(dPCG0009ResponseDTO);
        } else {
            d().onConnectionError(b(), dPCG0009ResponseDTO.getResponse().getRspCd(), dPCG0009ResponseDTO.getResponse().getRspMsg());
        }
    }
}
