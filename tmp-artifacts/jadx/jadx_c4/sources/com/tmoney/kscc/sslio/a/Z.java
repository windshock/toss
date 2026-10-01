package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.request.TMCR0012RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TMCR0012ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Z extends AbstractC0049k {
    private TMCR0012RequestDTO c;

    public Z(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_016_TMCR_0012, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3, String str4) {
        TMCR0012RequestDTO tMCR0012RequestDTO = new TMCR0012RequestDTO(this.m_tmoneyData.getCardNumber(), str2);
        this.c = tMCR0012RequestDTO;
        tMCR0012RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setPltCardNo(str2);
        this.c.setBftrBal(str3);
        this.c.setIntgMbrsId(str);
        this.c.setPymMnsGrpCd(str4);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        TMCR0012ResponseDTO tMCR0012ResponseDTO = (TMCR0012ResponseDTO) c().fromJson(str, TMCR0012ResponseDTO.class);
        if (tMCR0012ResponseDTO == null || tMCR0012ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        tMCR0012ResponseDTO.setCmd(b());
        if (TextUtils.equals(tMCR0012ResponseDTO.getSuccess(), "true") && TextUtils.equals(tMCR0012ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(tMCR0012ResponseDTO);
        } else {
            d().onConnectionError(b(), tMCR0012ResponseDTO.getResponse().getRspCd(), tMCR0012ResponseDTO.getResponse().getRspMsg());
        }
    }
}
