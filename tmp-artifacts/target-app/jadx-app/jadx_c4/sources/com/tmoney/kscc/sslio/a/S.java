package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.PRCG0006RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.PRCG0006ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class S extends AbstractC0049k {
    private PRCG0006RequestDTO c;

    public S(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_002_PRCG_0006, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, int i, int i2, int i3, String str2, String str3, String str4) {
        PRCG0006RequestDTO pRCG0006RequestDTO = new PRCG0006RequestDTO();
        this.c = pRCG0006RequestDTO;
        pRCG0006RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnic(g());
        this.c.setPymMnsTypCd(str);
        this.c.setChgAmt(String.format("%d", Integer.valueOf(i)));
        this.c.setSvcUtam(String.format("%d", Integer.valueOf(i2)));
        this.c.setPymAmt(String.format("%d", Integer.valueOf(i3)));
        this.c.setPymInf(str2);
        this.c.setSlctRst(str3);
        this.c.setILoadRst(str4);
        connectServer();
    }

    public final void execute(String str, int i, String str2, String str3, String str4) {
        PRCG0006RequestDTO pRCG0006RequestDTO = new PRCG0006RequestDTO();
        this.c = pRCG0006RequestDTO;
        pRCG0006RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnic(g());
        this.c.setPymMnsTypCd(str);
        this.c.setChgAmt(String.format("%d", Integer.valueOf(i)));
        this.c.setPymInf(str2);
        this.c.setSlctRst(str3);
        this.c.setILoadRst(str4);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        PRCG0006ResponseDTO pRCG0006ResponseDTO = (PRCG0006ResponseDTO) c().fromJson(str, PRCG0006ResponseDTO.class);
        if (pRCG0006ResponseDTO == null || pRCG0006ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        pRCG0006ResponseDTO.setCmd(b());
        if (TextUtils.equals(pRCG0006ResponseDTO.getSuccess(), "true") && TextUtils.equals(pRCG0006ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(pRCG0006ResponseDTO);
        } else {
            d().onConnectionError(b(), pRCG0006ResponseDTO.getResponse().getRspCd(), pRCG0006ResponseDTO.getResponse().getRspMsg());
        }
    }
}
