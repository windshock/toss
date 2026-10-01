package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.request.TMCR0010RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TMCR0010ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class X extends k {
    private TMCR0010RequestDTO c;

    public X(Context context, f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_016_TMCR_0010, aVar);
        this.c = null;
    }

    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3) {
        TMCR0010RequestDTO tMCR0010RequestDTO = new TMCR0010RequestDTO();
        this.c = tMCR0010RequestDTO;
        tMCR0010RequestDTO.setPltCardNo(str);
        this.c.setLoadRst(str2);
        this.c.setChgTrdNo(str3);
        this.c.setTmcrNo(((f) this).m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        connectServer();
    }

    public final void onResponse(String str) {
        TMCR0010ResponseDTO tMCR0010ResponseDTO = (TMCR0010ResponseDTO) c().fromJson(str, TMCR0010ResponseDTO.class);
        if (tMCR0010ResponseDTO == null || tMCR0010ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        tMCR0010ResponseDTO.setCmd(b());
        if (TextUtils.equals(tMCR0010ResponseDTO.getSuccess(), "true") && TextUtils.equals(tMCR0010ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(tMCR0010ResponseDTO);
        } else {
            d().onConnectionError(b(), tMCR0010ResponseDTO.getResponse().getRspCd(), tMCR0010ResponseDTO.getResponse().getRspMsg());
        }
    }
}
