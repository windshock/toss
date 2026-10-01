package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.GIFT0001RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.GIFT0001ResponseDTO;

/* renamed from: com.tmoney.kscc.sslio.a.z, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0057z extends AbstractC0049k {
    private GIFT0001RequestDTO c;

    public C0057z(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_010_GIFT_0001, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        GIFT0001RequestDTO gIFT0001RequestDTO = new GIFT0001RequestDTO();
        this.c = gIFT0001RequestDTO;
        gIFT0001RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnicId(g());
        this.c.setGnrlSmpcDvsCd(str);
        this.c.setSndrMrkgUserId(str2);
        this.c.setRcvrMbphNo(str3);
        this.c.setRcvrMrkgUserId(str4);
        this.c.setReqAmt(str5);
        this.c.setSvcUtam(str6);
        this.c.setSendMsgCtt(str7);
        this.c.setIPurRst(str8);
        this.c.setSlctRst(str9);
        this.c.setLimitAmt(str10);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        GIFT0001ResponseDTO gIFT0001ResponseDTO = (GIFT0001ResponseDTO) c().fromJson(str, GIFT0001ResponseDTO.class);
        if (gIFT0001ResponseDTO == null || gIFT0001ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        gIFT0001ResponseDTO.setCmd(b());
        if (TextUtils.equals(gIFT0001ResponseDTO.getSuccess(), "true") && TextUtils.equals(gIFT0001ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(gIFT0001ResponseDTO);
        } else {
            d().onConnectionError(b(), gIFT0001ResponseDTO.getResponse().getRspCd(), gIFT0001ResponseDTO.getResponse().getRspMsg());
        }
    }
}
