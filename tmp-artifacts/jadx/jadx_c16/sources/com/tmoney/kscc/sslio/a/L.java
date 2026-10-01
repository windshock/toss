package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.MSS0003RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MSS0003ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class L extends k {
    private MSS0003RequestDTO c;

    public L(Context context, f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_009_MSS_0003, aVar);
        this.c = null;
    }

    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2) {
        MSS0003RequestDTO mSS0003RequestDTO = new MSS0003RequestDTO();
        this.c = mSS0003RequestDTO;
        mSS0003RequestDTO.setTmcrNo(((f) this).m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setULoadRst(str);
        this.c.setMissTrdNo(str2);
        connectServer();
    }

    public final void onResponse(String str) {
        MSS0003ResponseDTO mSS0003ResponseDTO = (MSS0003ResponseDTO) c().fromJson(str, MSS0003ResponseDTO.class);
        if (mSS0003ResponseDTO == null || mSS0003ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        mSS0003ResponseDTO.setCmd(b());
        if (TextUtils.equals(mSS0003ResponseDTO.getSuccess(), "true") && TextUtils.equals(mSS0003ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(mSS0003ResponseDTO);
        } else {
            d().onConnectionError(b(), mSS0003ResponseDTO.getResponse().getRspCd(), mSS0003ResponseDTO.getResponse().getRspMsg());
        }
    }
}
