package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.DPCG0005RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.DPCG0005ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;

/* renamed from: com.tmoney.kscc.sslio.a.s, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0052s extends AbstractC0049k {
    private DPCG0005RequestDTO c;

    public C0052s(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0005, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3) {
        DPCG0005RequestDTO dPCG0005RequestDTO = new DPCG0005RequestDTO();
        this.c = dPCG0005RequestDTO;
        dPCG0005RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setSlctRst(str);
        this.c.setIuLoadRst(str2);
        this.c.setChgAmt(str3);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        DPCG0005ResponseDTO dPCG0005ResponseDTO = (DPCG0005ResponseDTO) c().fromJson(str, DPCG0005ResponseDTO.class);
        if (dPCG0005ResponseDTO == null || dPCG0005ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        dPCG0005ResponseDTO.setCmd(b());
        if (TextUtils.equals(dPCG0005ResponseDTO.getSuccess(), "true") && TextUtils.equals(dPCG0005ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(dPCG0005ResponseDTO);
        } else {
            d().onConnectionError(b(), dPCG0005ResponseDTO.getResponse().getRspCd(), dPCG0005ResponseDTO.getResponse().getRspMsg());
        }
    }
}
