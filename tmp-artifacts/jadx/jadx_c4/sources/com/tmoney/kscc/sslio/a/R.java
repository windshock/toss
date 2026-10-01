package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.PRCG0005RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.PRCG0005ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class R extends AbstractC0049k {
    private PRCG0005RequestDTO c;

    public R(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_002_PRCG_0005, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        PRCG0005RequestDTO pRCG0005RequestDTO = new PRCG0005RequestDTO();
        this.c = pRCG0005RequestDTO;
        pRCG0005RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setTlcmCd(this.m_tmoneyData.getTelecomCode());
        this.c.setMvnoCd("000");
        this.c.setCrdtChecPntDvsCd(str);
        this.c.setCrcmCd(str2);
        this.c.setPymCardNo(str3);
        this.c.setPymExdt(str4);
        this.c.setPymPwd(str5);
        this.c.setPymBrdt(str6);
        this.c.setPymGndrCd(str7);
        this.c.setPymFrgnYn(str8);
        this.c.setCvc(str9);
        this.c.setAtcgYn(str10);
        this.c.setCtAmt(str11);
        this.c.setChgAmt(str12);
        this.c.setOntp(str13);
        this.c.setEncTgtDvsCd(CodeConstants.ENC_TGT_DVS_CD.OTC.getCode());
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        PRCG0005ResponseDTO pRCG0005ResponseDTO = (PRCG0005ResponseDTO) c().fromJson(str, PRCG0005ResponseDTO.class);
        if (pRCG0005ResponseDTO == null || pRCG0005ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        pRCG0005ResponseDTO.setCmd(b());
        if (TextUtils.equals(pRCG0005ResponseDTO.getSuccess(), "true") && TextUtils.equals(pRCG0005ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(pRCG0005ResponseDTO);
        } else {
            d().onConnectionError(b(), pRCG0005ResponseDTO.getResponse().getRspCd(), pRCG0005ResponseDTO.getResponse().getRspMsg());
        }
    }
}
