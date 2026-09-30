package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.ACRY0003RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ACRY0003ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class c extends k {
    private ACRY0003RequestDTO c;

    public c(Context context, f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_011_ACRY_0003, aVar);
        this.c = null;
    }

    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2) {
        ACRY0003RequestDTO aCRY0003RequestDTO = new ACRY0003RequestDTO();
        this.c = aCRY0003RequestDTO;
        aCRY0003RequestDTO.setTmcrNo(((f) this).m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setULoadRst(str);
        this.c.setAcntRyTrdNo(str2);
        connectServer();
    }

    public final void onResponse(String str) {
        ACRY0003ResponseDTO aCRY0003ResponseDTO = (ACRY0003ResponseDTO) c().fromJson(str, ACRY0003ResponseDTO.class);
        if (aCRY0003ResponseDTO == null || aCRY0003ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        aCRY0003ResponseDTO.setCmd(b());
        if (TextUtils.equals(aCRY0003ResponseDTO.getSuccess(), "true") && TextUtils.equals(aCRY0003ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(aCRY0003ResponseDTO);
        } else {
            d().onConnectionError(b(), aCRY0003ResponseDTO.getResponse().getRspCd(), aCRY0003ResponseDTO.getResponse().getRspMsg());
        }
    }
}
