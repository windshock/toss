package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.PRCG0008RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.PRCG0008ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class T extends AbstractC0049k {
    private PRCG0008RequestDTO c;

    public T(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_002_PRCG_0008, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, int i, int i2, int i3, String str2) {
        PRCG0008RequestDTO pRCG0008RequestDTO = new PRCG0008RequestDTO();
        this.c = pRCG0008RequestDTO;
        pRCG0008RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setPymMnsTypCd(str);
        this.c.setPymAmt(String.valueOf(i));
        this.c.setChgAmt(String.valueOf(i2));
        this.c.setSvcUtam(String.valueOf(i3));
        this.c.setAppScheme(str2);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        PRCG0008ResponseDTO pRCG0008ResponseDTO = (PRCG0008ResponseDTO) c().fromJson(str, PRCG0008ResponseDTO.class);
        if (pRCG0008ResponseDTO == null || pRCG0008ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        pRCG0008ResponseDTO.setCmd(b());
        if (TextUtils.equals(pRCG0008ResponseDTO.getSuccess(), "true") && TextUtils.equals(pRCG0008ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(pRCG0008ResponseDTO);
        } else {
            d().onConnectionError(b(), pRCG0008ResponseDTO.getResponse().getRspCd(), pRCG0008ResponseDTO.getResponse().getRspMsg());
        }
    }
}
