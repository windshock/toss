package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.request.TMCR0009RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TMCR0009ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class W extends AbstractC0049k {
    private TMCR0009RequestDTO c;

    public W(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_016_TMCR_0009, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3) {
        TMCR0009RequestDTO tMCR0009RequestDTO = new TMCR0009RequestDTO();
        this.c = tMCR0009RequestDTO;
        tMCR0009RequestDTO.setPltCardNo(str);
        this.c.setSlctRst(str2);
        this.c.setiLoadRst(str3);
        this.c.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setPymMnsTypCd(str4);
        this.c.setChgAmt(String.format("%d", Integer.valueOf(i)));
        this.c.setSvcUtam(String.format("%d", Integer.valueOf(i2)));
        this.c.setPymAmt(String.format("%d", Integer.valueOf(i3)));
        this.c.setPymInf(str5);
        this.c.setUtamMnsCd("");
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        TMCR0009ResponseDTO tMCR0009ResponseDTO = (TMCR0009ResponseDTO) c().fromJson(str, TMCR0009ResponseDTO.class);
        if (tMCR0009ResponseDTO == null || tMCR0009ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        tMCR0009ResponseDTO.setCmd(b());
        if (TextUtils.equals(tMCR0009ResponseDTO.getSuccess(), "true") && TextUtils.equals(tMCR0009ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(tMCR0009ResponseDTO);
        } else {
            d().onConnectionError(b(), tMCR0009ResponseDTO.getResponse().getRspCd(), tMCR0009ResponseDTO.getResponse().getRspMsg());
        }
    }
}
