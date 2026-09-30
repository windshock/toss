package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.ACRY0002RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ACRY0002ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;

/* renamed from: com.tmoney.kscc.sslio.a.b, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0042b extends AbstractC0049k {
    private ACRY0002RequestDTO c;

    public C0042b(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_011_ACRY_0002, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2) {
        ACRY0002RequestDTO aCRY0002RequestDTO = new ACRY0002RequestDTO();
        this.c = aCRY0002RequestDTO;
        aCRY0002RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setRyDvsCd(str);
        this.c.setReqAmt(str2);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        ACRY0002ResponseDTO aCRY0002ResponseDTO = (ACRY0002ResponseDTO) c().fromJson(str, ACRY0002ResponseDTO.class);
        if (aCRY0002ResponseDTO == null || aCRY0002ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        aCRY0002ResponseDTO.setCmd(b());
        if (TextUtils.equals(aCRY0002ResponseDTO.getSuccess(), "true") && TextUtils.equals(aCRY0002ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(aCRY0002ResponseDTO);
        } else {
            d().onConnectionError(b(), aCRY0002ResponseDTO.getResponse().getRspCd(), aCRY0002ResponseDTO.getResponse().getRspMsg());
        }
    }
}
