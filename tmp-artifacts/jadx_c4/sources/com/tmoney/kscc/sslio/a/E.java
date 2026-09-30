package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.MBR0006RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MBR0006ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class E extends AbstractC0049k {
    private MBR0006RequestDTO c;

    public E(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0006, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute() {
        MBR0006RequestDTO mBR0006RequestDTO = new MBR0006RequestDTO();
        this.c = mBR0006RequestDTO;
        mBR0006RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        MBR0006ResponseDTO mBR0006ResponseDTO = (MBR0006ResponseDTO) c().fromJson(str, MBR0006ResponseDTO.class);
        if (mBR0006ResponseDTO == null || mBR0006ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        mBR0006ResponseDTO.setCmd(b());
        if (TextUtils.equals(mBR0006ResponseDTO.getSuccess(), "true") && TextUtils.equals(mBR0006ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(mBR0006ResponseDTO);
        } else {
            d().onConnectionError(b(), mBR0006ResponseDTO.getResponse().getRspCd(), mBR0006ResponseDTO.getResponse().getRspMsg());
        }
    }
}
