package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.DCRG0003RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.DCRG0003ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;

/* renamed from: com.tmoney.kscc.sslio.a.n, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0050n extends AbstractC0049k {
    private DCRG0003RequestDTO c;

    public C0050n(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_007_DCRG_0003, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute() {
        DCRG0003RequestDTO dCRG0003RequestDTO = new DCRG0003RequestDTO();
        this.c = dCRG0003RequestDTO;
        dCRG0003RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        DCRG0003ResponseDTO dCRG0003ResponseDTO = (DCRG0003ResponseDTO) c().fromJson(str, DCRG0003ResponseDTO.class);
        if (dCRG0003ResponseDTO == null || dCRG0003ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        dCRG0003ResponseDTO.setCmd(b());
        if (TextUtils.equals(dCRG0003ResponseDTO.getSuccess(), "true") && TextUtils.equals(dCRG0003ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(dCRG0003ResponseDTO);
        } else {
            d().onConnectionError(b(), dCRG0003ResponseDTO.getResponse().getRspCd(), dCRG0003ResponseDTO.getResponse().getRspMsg());
        }
    }
}
