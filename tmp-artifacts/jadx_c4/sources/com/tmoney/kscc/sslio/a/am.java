package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.request.UCAD0002RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.UCAD0002ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class am extends AbstractC0049k {
    private UCAD0002RequestDTO c;

    public am(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_015_UCAD_0002, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str) {
        UCAD0002RequestDTO uCAD0002RequestDTO = new UCAD0002RequestDTO();
        this.c = uCAD0002RequestDTO;
        uCAD0002RequestDTO.setTmcrNo(str);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        UCAD0002ResponseDTO uCAD0002ResponseDTO = (UCAD0002ResponseDTO) c().fromJson(str, UCAD0002ResponseDTO.class);
        if (uCAD0002ResponseDTO == null || uCAD0002ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        uCAD0002ResponseDTO.setCmd(b());
        if (TextUtils.equals(uCAD0002ResponseDTO.getSuccess(), "true") && TextUtils.equals(uCAD0002ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(uCAD0002ResponseDTO);
        } else {
            d().onConnectionError(b(), uCAD0002ResponseDTO.getResponse().getRspCd(), uCAD0002ResponseDTO.getResponse().getRspMsg());
        }
    }
}
