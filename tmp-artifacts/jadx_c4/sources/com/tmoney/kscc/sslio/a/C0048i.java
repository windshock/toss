package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.BLMV0001RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.BLMV0001ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;

/* renamed from: com.tmoney.kscc.sslio.a.i, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0048i extends AbstractC0049k {
    private BLMV0001RequestDTO c;

    public C0048i() {
        this.c = null;
    }

    public C0048i(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_008_BLMV_0001, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3, String str4) {
        BLMV0001RequestDTO bLMV0001RequestDTO = new BLMV0001RequestDTO();
        this.c = bLMV0001RequestDTO;
        bLMV0001RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnic(g());
        this.c.setReqAmt(str);
        this.c.setIuLoadRst(str2);
        this.c.setSlctRst(str3);
        this.c.setSndrCardNo(str4);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        BLMV0001ResponseDTO bLMV0001ResponseDTO = (BLMV0001ResponseDTO) c().fromJson(str, BLMV0001ResponseDTO.class);
        if (bLMV0001ResponseDTO == null || bLMV0001ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        bLMV0001ResponseDTO.setCmd(b());
        if (TextUtils.equals(bLMV0001ResponseDTO.getSuccess(), "true") && TextUtils.equals(bLMV0001ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(bLMV0001ResponseDTO);
        } else {
            d().onConnectionError(b(), bLMV0001ResponseDTO.getResponse().getRspCd(), bLMV0001ResponseDTO.getResponse().getRspMsg());
        }
    }
}
