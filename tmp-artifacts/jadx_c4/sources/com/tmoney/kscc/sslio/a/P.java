package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.PRCG0001RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.PRCG0001ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class P extends AbstractC0049k {
    private PRCG0001RequestDTO c;

    public P(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_002_PRCG_0001, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        PRCG0001RequestDTO pRCG0001RequestDTO = new PRCG0001RequestDTO();
        this.c = pRCG0001RequestDTO;
        pRCG0001RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnic(g());
        this.c.setPymMnsTypCd(str);
        this.c.setChgAmt(String.format("%d", Integer.valueOf(i)));
        this.c.setMrkgUserId(str2);
        this.c.setMrkgUserPw(str3);
        this.c.setSlctRst(str4);
        this.c.setILoadRst(str5);
        this.c.setAutMnlDvsCd(str6);
        this.c.setCrcmCd(str7);
        this.c.setCrdtChecDvsCd(str8);
        this.c.setUtamMnsCd(str9);
        this.c.setSvcUtam(str10);
        this.c.setPymAmt(str11);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        PRCG0001ResponseDTO pRCG0001ResponseDTO = (PRCG0001ResponseDTO) c().fromJson(str, PRCG0001ResponseDTO.class);
        if (pRCG0001ResponseDTO == null || pRCG0001ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        pRCG0001ResponseDTO.setCmd(b());
        if (TextUtils.equals(pRCG0001ResponseDTO.getSuccess(), "true") && TextUtils.equals(pRCG0001ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(pRCG0001ResponseDTO);
        } else {
            d().onConnectionError(b(), pRCG0001ResponseDTO.getResponse().getRspCd(), pRCG0001ResponseDTO.getResponse().getRspMsg());
        }
    }
}
