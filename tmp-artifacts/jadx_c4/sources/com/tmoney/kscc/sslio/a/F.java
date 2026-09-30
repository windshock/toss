package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.MBR0011RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MBR0011ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class F extends AbstractC0049k {
    private MBR0011RequestDTO c;

    public F(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0011, aVar);
        this.c = null;
        this.m_object = this;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute() {
        MBR0011RequestDTO mBR0011RequestDTO = new MBR0011RequestDTO();
        this.c = mBR0011RequestDTO;
        mBR0011RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        MBR0011ResponseDTO mBR0011ResponseDTO = (MBR0011ResponseDTO) c().fromJson(str, MBR0011ResponseDTO.class);
        if (mBR0011ResponseDTO == null || mBR0011ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        mBR0011ResponseDTO.setCmd(b());
        if (TextUtils.equals(mBR0011ResponseDTO.getSuccess(), "true") && TextUtils.equals(mBR0011ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(mBR0011ResponseDTO);
        } else {
            d().onConnectionError(b(), mBR0011ResponseDTO.getResponse().getRspCd(), mBR0011ResponseDTO.getResponse().getRspMsg());
        }
    }
}
