package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.MBR0015RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MBR0015ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class H extends AbstractC0049k {
    private MBR0015RequestDTO c;

    public H(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0015, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str) {
        MBR0015RequestDTO mBR0015RequestDTO = new MBR0015RequestDTO();
        this.c = mBR0015RequestDTO;
        mBR0015RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setUsrUseLtnCd(str);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        MBR0015ResponseDTO mBR0015ResponseDTO = (MBR0015ResponseDTO) c().fromJson(str, MBR0015ResponseDTO.class);
        if (mBR0015ResponseDTO == null || mBR0015ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        mBR0015ResponseDTO.setCmd(b());
        if (TextUtils.equals(mBR0015ResponseDTO.getSuccess(), "true") && TextUtils.equals(mBR0015ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(mBR0015ResponseDTO);
        } else {
            d().onConnectionError(b(), mBR0015ResponseDTO.getResponse().getRspCd(), mBR0015ResponseDTO.getResponse().getRspMsg());
        }
    }
}
