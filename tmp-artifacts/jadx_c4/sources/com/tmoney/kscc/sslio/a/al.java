package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.request.UCAD0001RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.UCAD0001ResponseDTO;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class al extends AbstractC0049k {
    private UCAD0001RequestDTO c;

    public al(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_015_UCAD_0001, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String[] strArr, String str2, String str3) {
        UCAD0001RequestDTO uCAD0001RequestDTO = new UCAD0001RequestDTO();
        this.c = uCAD0001RequestDTO;
        uCAD0001RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setSlctRst(str);
        this.c.setPurseRst(strArr);
        this.c.setPurseRstState(str2);
        this.c.setInitPurchaseRst(str3);
        connectServer();
    }

    public final void execute(String str, String[] strArr, String str2, String str3, String str4) {
        UCAD0001RequestDTO uCAD0001RequestDTO = new UCAD0001RequestDTO();
        this.c = uCAD0001RequestDTO;
        uCAD0001RequestDTO.setTmcrNo(str4);
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setSlctRst(str);
        this.c.setPurseRst(strArr);
        this.c.setPurseRstState(str2);
        this.c.setInitPurchaseRst(str3);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        UCAD0001ResponseDTO uCAD0001ResponseDTO = (UCAD0001ResponseDTO) c().fromJson(str, UCAD0001ResponseDTO.class);
        if (uCAD0001ResponseDTO == null || uCAD0001ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        uCAD0001ResponseDTO.setCmd(b());
        if (TextUtils.equals(uCAD0001ResponseDTO.getSuccess(), "true") && TextUtils.equals(uCAD0001ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(uCAD0001ResponseDTO);
        } else {
            d().onConnectionError(b(), uCAD0001ResponseDTO.getResponse().getRspCd(), uCAD0001ResponseDTO.getResponse().getRspMsg());
        }
    }
}
