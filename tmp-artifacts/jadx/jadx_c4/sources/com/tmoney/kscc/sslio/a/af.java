package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.request.TRDR0012RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TRDR0012ResponseDTO;
import com.tmoney.preference.TmoneyData;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class af extends AbstractC0049k {
    private TRDR0012RequestDTO c;

    public af(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0012, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str) {
        TRDR0012RequestDTO tRDR0012RequestDTO = new TRDR0012RequestDTO();
        this.c = tRDR0012RequestDTO;
        tRDR0012RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setPpyDpyDvsCd(str);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        TRDR0012ResponseDTO tRDR0012ResponseDTO = (TRDR0012ResponseDTO) c().fromJson(str, TRDR0012ResponseDTO.class);
        if (tRDR0012ResponseDTO == null || tRDR0012ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        tRDR0012ResponseDTO.setCmd(b());
        if (!TextUtils.equals(tRDR0012ResponseDTO.getSuccess(), "true") || !TextUtils.equals(tRDR0012ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionError(b(), tRDR0012ResponseDTO.getResponse().getRspCd(), tRDR0012ResponseDTO.getResponse().getRspMsg());
            return;
        }
        tRDR0012ResponseDTO.normalize();
        TmoneyData tmoneyData = TmoneyData.getInstance(AbstractC0045f.a());
        String setupInfo = tmoneyData.getSetupInfo(CodeConstants.AFLT_STUP_VAL_CD.SETUP_CARD_INFO.getCode());
        if (setupInfo != null) {
            tmoneyData.setSaveCardInfo(setupInfo);
        }
        d().onConnectionSuccess(tRDR0012ResponseDTO);
    }
}
