package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.MBR0012RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MBR0012ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class G extends AbstractC0049k {
    private MBR0012RequestDTO c;

    public G(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0012, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute() {
        MBR0012RequestDTO mBR0012RequestDTO = new MBR0012RequestDTO();
        this.c = mBR0012RequestDTO;
        mBR0012RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        MBR0012ResponseDTO mBR0012ResponseDTO = (MBR0012ResponseDTO) c().fromJson(str, MBR0012ResponseDTO.class);
        if (mBR0012ResponseDTO == null || mBR0012ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        mBR0012ResponseDTO.setCmd(b());
        if (TextUtils.equals(mBR0012ResponseDTO.getSuccess(), "true") && TextUtils.equals(mBR0012ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(mBR0012ResponseDTO);
        } else {
            d().onConnectionError(b(), mBR0012ResponseDTO.getResponse().getRspCd(), mBR0012ResponseDTO.getResponse().getRspMsg());
        }
    }
}
