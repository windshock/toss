package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.DPCG0003RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.DPCG0003ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class q extends AbstractC0049k {
    private DPCG0003RequestDTO c;

    public q(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0003, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3, String str4, String str5) {
        DPCG0003RequestDTO dPCG0003RequestDTO = new DPCG0003RequestDTO();
        this.c = dPCG0003RequestDTO;
        dPCG0003RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setSlctRst(str);
        this.c.setILoadRst(str2);
        this.c.setChgAmt(str3);
        this.c.setAutMnlDvsCd(str4);
        this.c.setDpyCncnMxchYn(str5);
        connectServer();
    }

    public final void execute(String str, String str2, String str3, String str4, String str5, String str6) {
        DPCG0003RequestDTO dPCG0003RequestDTO = new DPCG0003RequestDTO();
        this.c = dPCG0003RequestDTO;
        dPCG0003RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setSlctRst(str);
        this.c.setILoadRst(str2);
        this.c.setChgAmt(str3);
        this.c.setAutMnlDvsCd(str4);
        this.c.setDpyCncnMxchYn(str5);
        this.c.setInitPurchaseRst(str6);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        DPCG0003ResponseDTO dPCG0003ResponseDTO = (DPCG0003ResponseDTO) c().fromJson(str, DPCG0003ResponseDTO.class);
        if (dPCG0003ResponseDTO == null || dPCG0003ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        dPCG0003ResponseDTO.setCmd(b());
        if (TextUtils.equals(dPCG0003ResponseDTO.getSuccess(), "true") && TextUtils.equals(dPCG0003ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(dPCG0003ResponseDTO);
        } else {
            d().onConnectionError(b(), dPCG0003ResponseDTO.getResponse().getRspCd(), dPCG0003ResponseDTO.getResponse().getRspMsg());
        }
    }
}
