package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.MBR0019RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MBR0019ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class I extends AbstractC0049k {
    private MBR0019RequestDTO c;

    public I(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0019, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str) {
        MBR0019RequestDTO mBR0019RequestDTO = new MBR0019RequestDTO();
        this.c = mBR0019RequestDTO;
        mBR0019RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setEncDvsCd(str);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        MBR0019ResponseDTO mBR0019ResponseDTO = (MBR0019ResponseDTO) c().fromJson(str, MBR0019ResponseDTO.class);
        if (mBR0019ResponseDTO == null || mBR0019ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        mBR0019ResponseDTO.setCmd(b());
        if (TextUtils.equals(mBR0019ResponseDTO.getSuccess(), "true") && TextUtils.equals(mBR0019ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(mBR0019ResponseDTO);
        } else {
            d().onConnectionError(b(), mBR0019ResponseDTO.getResponse().getRspCd(), mBR0019ResponseDTO.getResponse().getRspMsg());
        }
    }
}
