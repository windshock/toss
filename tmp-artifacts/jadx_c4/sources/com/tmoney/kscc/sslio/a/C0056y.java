package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.DPCG0016RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.DPCG0016ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;

/* renamed from: com.tmoney.kscc.sslio.a.y, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0056y extends AbstractC0049k {
    private DPCG0016RequestDTO c;

    public C0056y(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0016, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3, String str4, String str5, int i) {
        DPCG0016RequestDTO dPCG0016RequestDTO = new DPCG0016RequestDTO();
        this.c = dPCG0016RequestDTO;
        dPCG0016RequestDTO.setMbphNo(f());
        this.c.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setUnicId(g());
        this.c.setTlcmCd(this.m_tmoneyData.getTelecomCode());
        this.c.setCrcmCd(str);
        this.c.setChgAmt(str2);
        DPCG0016RequestDTO dPCG0016RequestDTO2 = this.c;
        if (!TextUtils.isEmpty(str3)) {
            str4 = "";
        }
        dPCG0016RequestDTO2.setEncTgtDvsCd(str4);
        this.c.setSlctRst(str5);
        this.c.setBftrBal(String.valueOf(i));
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        DPCG0016ResponseDTO dPCG0016ResponseDTO = (DPCG0016ResponseDTO) c().fromJson(str, DPCG0016ResponseDTO.class);
        if (dPCG0016ResponseDTO == null || dPCG0016ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        dPCG0016ResponseDTO.setCmd(b());
        if (TextUtils.equals(dPCG0016ResponseDTO.getSuccess(), "true") && TextUtils.equals(dPCG0016ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(dPCG0016ResponseDTO);
        } else {
            d().onConnectionError(b(), dPCG0016ResponseDTO.getResponse().getRspCd(), dPCG0016ResponseDTO.getResponse().getRspMsg());
        }
    }
}
