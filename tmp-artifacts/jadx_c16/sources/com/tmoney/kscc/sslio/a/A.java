package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.GIFT0007RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.GIFT0007ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class A extends k {
    private GIFT0007RequestDTO c;

    public A(Context context, f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_010_GIFT_0007, aVar);
        this.c = null;
    }

    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3) {
        GIFT0007RequestDTO gIFT0007RequestDTO = new GIFT0007RequestDTO();
        this.c = gIFT0007RequestDTO;
        gIFT0007RequestDTO.setTmcrNo(((f) this).m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setPurRst(str);
        this.c.setGiftTrdNo(str2);
        this.c.setBalRst(str3);
        connectServer();
    }

    public final void onResponse(String str) {
        GIFT0007ResponseDTO gIFT0007ResponseDTO = (GIFT0007ResponseDTO) c().fromJson(str, GIFT0007ResponseDTO.class);
        if (gIFT0007ResponseDTO == null || gIFT0007ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        gIFT0007ResponseDTO.setCmd(b());
        if (TextUtils.equals(gIFT0007ResponseDTO.getSuccess(), "true") && TextUtils.equals(gIFT0007ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(gIFT0007ResponseDTO);
        } else {
            d().onConnectionError(b(), gIFT0007ResponseDTO.getResponse().getRspCd(), gIFT0007ResponseDTO.getResponse().getRspMsg());
        }
    }
}
