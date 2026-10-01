package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.ACRY0004RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ACRY0004ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;

/* renamed from: com.tmoney.kscc.sslio.a.d, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0043d extends AbstractC0049k {
    private ACRY0004RequestDTO c;

    public C0043d(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_011_ACRY_0004, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute() {
        ACRY0004RequestDTO aCRY0004RequestDTO = new ACRY0004RequestDTO();
        this.c = aCRY0004RequestDTO;
        aCRY0004RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        ACRY0004ResponseDTO aCRY0004ResponseDTO = (ACRY0004ResponseDTO) c().fromJson(str, ACRY0004ResponseDTO.class);
        if (aCRY0004ResponseDTO == null || aCRY0004ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        aCRY0004ResponseDTO.setCmd(b());
        if (TextUtils.equals(aCRY0004ResponseDTO.getSuccess(), "true") && TextUtils.equals(aCRY0004ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(aCRY0004ResponseDTO);
        } else {
            d().onConnectionError(b(), aCRY0004ResponseDTO.getResponse().getRspCd(), aCRY0004ResponseDTO.getResponse().getRspMsg());
        }
    }
}
