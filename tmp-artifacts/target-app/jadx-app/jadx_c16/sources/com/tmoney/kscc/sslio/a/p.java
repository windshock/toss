package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.DPCG0002RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.DPCG0002ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class p extends k {
    private DPCG0002RequestDTO c;

    public p(Context context, f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0002, aVar);
        this.c = null;
    }

    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2) {
        DPCG0002RequestDTO dPCG0002RequestDTO = new DPCG0002RequestDTO();
        this.c = dPCG0002RequestDTO;
        dPCG0002RequestDTO.setTmcrNo(((f) this).m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setTlcmCd(((f) this).m_tmoneyData.getTelecomCode());
        this.c.setChgTrdNo(str2);
        this.c.setLoadRst(str);
        connectServer();
    }

    public final void onResponse(String str) {
        DPCG0002ResponseDTO dPCG0002ResponseDTO = (DPCG0002ResponseDTO) c().fromJson(str, DPCG0002ResponseDTO.class);
        if (dPCG0002ResponseDTO == null || dPCG0002ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        dPCG0002ResponseDTO.setCmd(b());
        if (TextUtils.equals(dPCG0002ResponseDTO.getSuccess(), "true") && TextUtils.equals(dPCG0002ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(dPCG0002ResponseDTO);
        } else {
            d().onConnectionError(b(), dPCG0002ResponseDTO.getResponse().getRspCd(), dPCG0002ResponseDTO.getResponse().getRspMsg());
        }
    }
}
