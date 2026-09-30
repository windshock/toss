package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.MBR0032RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MBR0032ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class J extends AbstractC0049k {
    private MBR0032RequestDTO c;

    public J(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0032, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str) {
        MBR0032RequestDTO mBR0032RequestDTO = new MBR0032RequestDTO();
        this.c = mBR0032RequestDTO;
        mBR0032RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setAdidVal(str);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        MBR0032ResponseDTO mBR0032ResponseDTO = (MBR0032ResponseDTO) c().fromJson(str, MBR0032ResponseDTO.class);
        if (mBR0032ResponseDTO == null || mBR0032ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        mBR0032ResponseDTO.setCmd(b());
        if (TextUtils.equals(mBR0032ResponseDTO.getSuccess(), "true") && TextUtils.equals(mBR0032ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(mBR0032ResponseDTO);
        } else {
            d().onConnectionError(b(), mBR0032ResponseDTO.getResponse().getRspCd(), mBR0032ResponseDTO.getResponse().getRspMsg());
        }
    }
}
