package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.BLMV0002RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.BLMV0002ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class j extends k {
    private BLMV0002RequestDTO c;

    public j() {
        this.c = null;
    }

    public j(Context context, f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_008_BLMV_0002, aVar);
        this.c = null;
    }

    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2) {
        BLMV0002RequestDTO bLMV0002RequestDTO = new BLMV0002RequestDTO();
        this.c = bLMV0002RequestDTO;
        bLMV0002RequestDTO.setTmcrNo(((f) this).m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnic(g());
        this.c.setUnLoadRst(str);
        this.c.setBltrTrdNo(str2);
        connectServer();
    }

    public final void onResponse(String str) {
        BLMV0002ResponseDTO bLMV0002ResponseDTO = (BLMV0002ResponseDTO) c().fromJson(str, BLMV0002ResponseDTO.class);
        if (bLMV0002ResponseDTO == null || bLMV0002ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        bLMV0002ResponseDTO.setCmd(b());
        if (TextUtils.equals(bLMV0002ResponseDTO.getSuccess(), "true") && TextUtils.equals(bLMV0002ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(bLMV0002ResponseDTO);
        } else {
            d().onConnectionError(b(), bLMV0002ResponseDTO.getResponse().getRspCd(), bLMV0002ResponseDTO.getResponse().getRspMsg());
        }
    }
}
