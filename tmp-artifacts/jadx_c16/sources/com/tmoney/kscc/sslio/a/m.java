package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.DCRG0002RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.DCRG0002ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class m extends k {
    private DCRG0002RequestDTO c;

    public m(Context context, f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_007_DCRG_0002, aVar);
        this.c = null;
    }

    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3) {
        DCRG0002RequestDTO dCRG0002RequestDTO = new DCRG0002RequestDTO();
        this.c = dCRG0002RequestDTO;
        dCRG0002RequestDTO.setTmcrNo(((f) this).m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnic(g());
        this.c.setPrmtUpdChipRst(str);
        this.c.setUserCode(str2);
        this.c.setTrdNo(str3);
        connectServer();
    }

    public final void onResponse(String str) {
        DCRG0002ResponseDTO dCRG0002ResponseDTO = (DCRG0002ResponseDTO) c().fromJson(str, DCRG0002ResponseDTO.class);
        if (dCRG0002ResponseDTO == null || dCRG0002ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        dCRG0002ResponseDTO.setCmd(b());
        if (TextUtils.equals(dCRG0002ResponseDTO.getSuccess(), "true") && TextUtils.equals(dCRG0002ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(dCRG0002ResponseDTO);
        } else {
            d().onConnectionError(b(), dCRG0002ResponseDTO.getResponse().getRspCd(), dCRG0002ResponseDTO.getResponse().getRspMsg());
        }
    }
}
