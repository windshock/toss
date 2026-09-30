package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.AFLT0001RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.AFLT0001ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;

/* renamed from: com.tmoney.kscc.sslio.a.e, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0044e extends AbstractC0049k {
    private AFLT0001RequestDTO c;

    public C0044e(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_018_AFLT_0001, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3, String str4) {
        AFLT0001RequestDTO aFLT0001RequestDTO = new AFLT0001RequestDTO();
        this.c = aFLT0001RequestDTO;
        aFLT0001RequestDTO.tmcrNo = str;
        aFLT0001RequestDTO.mbrsPrdId = str2;
        aFLT0001RequestDTO.mbrsCardNo = str3;
        aFLT0001RequestDTO.mbrsCardStaCd = str4;
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        AFLT0001ResponseDTO aFLT0001ResponseDTO = (AFLT0001ResponseDTO) c().fromJson(str, AFLT0001ResponseDTO.class);
        if (aFLT0001ResponseDTO == null || aFLT0001ResponseDTO.getResponse() == null || d() == null) {
            if (d() == null) {
                return;
            }
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        aFLT0001ResponseDTO.setCmd(b());
        if (TextUtils.equals(aFLT0001ResponseDTO.getSuccess(), "true") && TextUtils.equals(aFLT0001ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(aFLT0001ResponseDTO);
        } else {
            d().onConnectionError(b(), aFLT0001ResponseDTO.getResponse().getRspCd(), aFLT0001ResponseDTO.getResponse().getRspMsg());
        }
    }
}
