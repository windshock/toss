package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.DPCG0015RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.DPCG0015ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;

/* renamed from: com.tmoney.kscc.sslio.a.x, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class C0004x extends k {
    private DPCG0015RequestDTO c;

    public C0004x(Context context, f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0015, aVar);
        this.c = null;
    }

    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3) {
        DPCG0015RequestDTO dPCG0015RequestDTO = new DPCG0015RequestDTO();
        this.c = dPCG0015RequestDTO;
        dPCG0015RequestDTO.setTmcrNo(((f) this).m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setLmtCancTrdNo(str);
        this.c.setSlctRst(str2);
        this.c.setULoadRst(str3);
        connectServer();
    }

    public final void onResponse(String str) {
        DPCG0015ResponseDTO dPCG0015ResponseDTO = (DPCG0015ResponseDTO) c().fromJson(str, DPCG0015ResponseDTO.class);
        if (dPCG0015ResponseDTO == null || dPCG0015ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        dPCG0015ResponseDTO.setCmd(b());
        if (TextUtils.equals(dPCG0015ResponseDTO.getSuccess(), "true") && TextUtils.equals(dPCG0015ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(dPCG0015ResponseDTO);
        } else {
            d().onConnectionError(b(), dPCG0015ResponseDTO.getResponse().getRspCd(), dPCG0015ResponseDTO.getResponse().getRspMsg());
        }
    }
}
