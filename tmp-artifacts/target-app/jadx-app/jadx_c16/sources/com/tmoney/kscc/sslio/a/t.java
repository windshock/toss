package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.DPCG0006RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.DPCG0006ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class t extends k {
    private DPCG0006RequestDTO c;

    public t(Context context, f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0006, aVar);
        this.c = null;
    }

    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3, String str4) {
        DPCG0006RequestDTO dPCG0006RequestDTO = new DPCG0006RequestDTO();
        this.c = dPCG0006RequestDTO;
        dPCG0006RequestDTO.setTmcrNo(((f) this).m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setLmtCancTrdNo(str);
        this.c.setSlctRst(str2);
        this.c.setULoadRst(str3);
        connectServer();
    }

    public final void onResponse(String str) {
        DPCG0006ResponseDTO dPCG0006ResponseDTO = (DPCG0006ResponseDTO) c().fromJson(str, DPCG0006ResponseDTO.class);
        if (dPCG0006ResponseDTO == null || dPCG0006ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        dPCG0006ResponseDTO.setCmd(b());
        if (TextUtils.equals(dPCG0006ResponseDTO.getSuccess(), "true") && TextUtils.equals(dPCG0006ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(dPCG0006ResponseDTO);
        } else {
            d().onConnectionError(b(), dPCG0006ResponseDTO.getResponse().getRspCd(), dPCG0006ResponseDTO.getResponse().getRspMsg());
        }
    }
}
