package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.request.TMCR0011RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TMCR0011ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Y extends AbstractC0049k {
    private TMCR0011RequestDTO c;

    public Y() {
        this.c = null;
    }

    public Y(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_016_TMCR_0011, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, int i, int i2, int i3, String str2, String str3) {
        TMCR0011RequestDTO tMCR0011RequestDTO = new TMCR0011RequestDTO();
        this.c = tMCR0011RequestDTO;
        tMCR0011RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setPymMnsTypCd(str);
        this.c.setPymAmt(String.valueOf(i));
        this.c.setChgAmt(String.valueOf(i2));
        this.c.setSvcUtam(String.valueOf(i3));
        this.c.setPltCardNo(str2);
        this.c.setAppScheme(str3);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        TMCR0011ResponseDTO tMCR0011ResponseDTO = (TMCR0011ResponseDTO) c().fromJson(str, TMCR0011ResponseDTO.class);
        if (tMCR0011ResponseDTO == null || tMCR0011ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        tMCR0011ResponseDTO.setCmd(b());
        if (TextUtils.equals(tMCR0011ResponseDTO.getSuccess(), "true") && TextUtils.equals(tMCR0011ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(tMCR0011ResponseDTO);
        } else {
            d().onConnectionError(b(), tMCR0011ResponseDTO.getResponse().getRspCd(), tMCR0011ResponseDTO.getResponse().getRspMsg());
        }
    }
}
