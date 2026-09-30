package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.MSS0002RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MSS0002ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class K extends AbstractC0049k {
    private MSS0002RequestDTO c;

    public K(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_009_MSS_0002, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3) {
        MSS0002RequestDTO mSS0002RequestDTO = new MSS0002RequestDTO();
        this.c = mSS0002RequestDTO;
        mSS0002RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setSlctRst(str);
        this.c.setIuLoadRst(str2);
        this.c.setReqAmt(str3);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        MSS0002ResponseDTO mSS0002ResponseDTO = (MSS0002ResponseDTO) c().fromJson(str, MSS0002ResponseDTO.class);
        if (mSS0002ResponseDTO == null || mSS0002ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        mSS0002ResponseDTO.setCmd(b());
        if (TextUtils.equals(mSS0002ResponseDTO.getSuccess(), "true") && TextUtils.equals(mSS0002ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(mSS0002ResponseDTO);
        } else {
            d().onConnectionError(b(), mSS0002ResponseDTO.getResponse().getRspCd(), mSS0002ResponseDTO.getResponse().getRspMsg());
        }
    }
}
