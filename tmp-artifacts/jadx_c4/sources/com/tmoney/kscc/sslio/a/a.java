package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.ACRY0001RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ACRY0001ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class a extends AbstractC0049k {
    private ACRY0001RequestDTO c;

    public a(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_011_ACRY_0001, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        ACRY0001RequestDTO aCRY0001RequestDTO = new ACRY0001RequestDTO();
        this.c = aCRY0001RequestDTO;
        aCRY0001RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setRyAmt(str);
        this.c.setSvcUtam(str2);
        this.c.setIuLoadRst(str3);
        this.c.setSlctRst(str4);
        this.c.setBnkCd(str5);
        this.c.setAcntCusName(str6);
        this.c.setAcntNo(str7);
        this.c.setRyDvsCd(str8);
        this.c.setAcntEncCd(str9);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        ACRY0001ResponseDTO aCRY0001ResponseDTO = (ACRY0001ResponseDTO) c().fromJson(str, ACRY0001ResponseDTO.class);
        if (aCRY0001ResponseDTO == null || aCRY0001ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        aCRY0001ResponseDTO.setCmd(b());
        if (TextUtils.equals(aCRY0001ResponseDTO.getSuccess(), "true") && TextUtils.equals(aCRY0001ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(aCRY0001ResponseDTO);
        } else {
            d().onConnectionError(b(), aCRY0001ResponseDTO.getResponse().getRspCd(), aCRY0001ResponseDTO.getResponse().getRspMsg());
        }
    }
}
