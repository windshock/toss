package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.b.j;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.request.SIN0001RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.SIN0001ResponseDTO;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class V extends AbstractC0049k {
    private SIN0001RequestDTO c;

    public V(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_004_SIN_0001, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str) throws Throwable {
        SIN0001RequestDTO sIN0001RequestDTO = new SIN0001RequestDTO();
        this.c = sIN0001RequestDTO;
        sIN0001RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        String strF = f();
        SIN0001RequestDTO sIN0001RequestDTO2 = this.c;
        if (TextUtils.isEmpty(strF)) {
            strF = "01000000000";
        }
        sIN0001RequestDTO2.setMbphNo(strF);
        this.c.setUnicId(g());
        this.c.setBftrBal(str);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        final SIN0001ResponseDTO sIN0001ResponseDTO = (SIN0001ResponseDTO) c().fromJson(str, SIN0001ResponseDTO.class);
        if (sIN0001ResponseDTO == null || sIN0001ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        sIN0001ResponseDTO.setCmd(b());
        if (!TextUtils.equals(sIN0001ResponseDTO.getSuccess(), "true") || !TextUtils.equals(sIN0001ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionError(b(), sIN0001ResponseDTO.getResponse().getRspCd(), sIN0001ResponseDTO.getResponse().getRspMsg());
        } else if (sIN0001ResponseDTO.getResponse().getUcfmYn() == null || !sIN0001ResponseDTO.getResponse().getUcfmYn().equals("Y")) {
            d().onConnectionSuccess(sIN0001ResponseDTO);
        } else {
            com.tmoney.g.a.d.getInstance().offerTask(AbstractC0045f.a(), new j(AbstractC0045f.a(), new ResultListener() { // from class: com.tmoney.kscc.sslio.a.V.1
                @Override // com.tmoney.listener.ResultListener
                public final void onResult(TmoneyCallback.ResultType resultType) {
                    if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                        V.this.d().onConnectionSuccess(sIN0001ResponseDTO);
                    } else {
                        V.this.d().onConnectionError(V.this.b(), resultType.getDetailCode(), resultType.getMessage());
                    }
                }
            }));
        }
    }
}
