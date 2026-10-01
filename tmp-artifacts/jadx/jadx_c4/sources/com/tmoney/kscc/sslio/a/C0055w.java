package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.DPCG0014RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.DPCG0014ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;

/* renamed from: com.tmoney.kscc.sslio.a.w, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0055w extends AbstractC0049k {
    private DPCG0014RequestDTO c;

    public C0055w(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0014, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3) {
        DPCG0014RequestDTO dPCG0014RequestDTO = new DPCG0014RequestDTO();
        this.c = dPCG0014RequestDTO;
        dPCG0014RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setSlctRst(str);
        this.c.setIuLoadRst(str2);
        this.c.setChgAmt(str3);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        DPCG0014ResponseDTO dPCG0014ResponseDTO = (DPCG0014ResponseDTO) c().fromJson(str, DPCG0014ResponseDTO.class);
        if (dPCG0014ResponseDTO == null || dPCG0014ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        dPCG0014ResponseDTO.setCmd(b());
        if (TextUtils.equals(dPCG0014ResponseDTO.getSuccess(), "true") && TextUtils.equals(dPCG0014ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(dPCG0014ResponseDTO);
        } else {
            d().onConnectionError(b(), dPCG0014ResponseDTO.getResponse().getRspCd(), dPCG0014ResponseDTO.getResponse().getRspMsg());
        }
    }
}
