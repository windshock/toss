package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.DPCG0001RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.DPCG0001ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;

/* renamed from: com.tmoney.kscc.sslio.a.o, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0051o extends AbstractC0049k {
    private DPCG0001RequestDTO c;

    public C0051o(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0001, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3) {
        DPCG0001RequestDTO dPCG0001RequestDTO = new DPCG0001RequestDTO();
        this.c = dPCG0001RequestDTO;
        dPCG0001RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setSlctRst(str);
        this.c.setILoadRst(str2);
        this.c.setChgAmt(str3);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        DPCG0001ResponseDTO dPCG0001ResponseDTO = (DPCG0001ResponseDTO) c().fromJson(str, DPCG0001ResponseDTO.class);
        if (dPCG0001ResponseDTO == null || dPCG0001ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        dPCG0001ResponseDTO.setCmd(b());
        if (TextUtils.equals(dPCG0001ResponseDTO.getSuccess(), "true") && TextUtils.equals(dPCG0001ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(dPCG0001ResponseDTO);
        } else {
            d().onConnectionError(b(), dPCG0001ResponseDTO.getResponse().getRspCd(), dPCG0001ResponseDTO.getResponse().getRspMsg());
        }
    }
}
