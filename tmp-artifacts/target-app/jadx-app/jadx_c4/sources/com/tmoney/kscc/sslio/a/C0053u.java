package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.DPCG0007RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.DPCG0007ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;

/* renamed from: com.tmoney.kscc.sslio.a.u, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0053u extends AbstractC0049k {
    private DPCG0007RequestDTO c;
    private com.tmoney.a d;
    private ResultListener e;

    public C0053u(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0007, aVar);
        this.c = null;
        this.d = null;
        this.e = new ResultListener() { // from class: com.tmoney.kscc.sslio.a.u.1
            @Override // com.tmoney.listener.ResultListener
            public final void onResult(TmoneyCallback.ResultType resultType) {
                if (resultType != TmoneyCallback.ResultType.SUCCESS) {
                    C0053u.this.d().onConnectionError(C0053u.this.b(), "-1", "USIM Error");
                    return;
                }
                C0053u.this.c.setSlctRst(com.tmoney.e.a.a.bytesToHexString((byte[]) resultType.getData()[0]));
                C0053u.this.d.cardInfo(new ResultListener() { // from class: com.tmoney.kscc.sslio.a.u.1.1
                    @Override // com.tmoney.listener.ResultListener
                    public final void onResult(TmoneyCallback.ResultType resultType2) {
                        if (resultType2 == TmoneyCallback.ResultType.SUCCESS) {
                            C0053u.this.c.setBftrBal(resultType2.getData()[1].toString());
                            C0053u.this.connectServer();
                        }
                    }
                });
            }
        };
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        DPCG0007RequestDTO dPCG0007RequestDTO = new DPCG0007RequestDTO();
        this.c = dPCG0007RequestDTO;
        dPCG0007RequestDTO.setMbphNo(f());
        this.c.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setUnicId(g());
        this.c.setTlcmCd(this.m_tmoneyData.getTelecomCode());
        this.c.setCrcmCd(str);
        this.c.setCrdtChecDvsCd(str2);
        this.c.setPymCardNo(str3);
        this.c.setPymBrdt(str4);
        this.c.setPymExdt(str5);
        this.c.setPymGndrCd(str6);
        this.c.setCvc(str7);
        this.c.setPymPwd(str8);
        this.c.setPymFrgnYn(str9);
        this.c.setChgAmt(str10);
        this.c.setOntp(str11);
        this.c.setEncTgtDvsCd(CodeConstants.ENC_TGT_DVS_CD.OTC.getCode());
        com.tmoney.a aVar = com.tmoney.a.getInstance();
        this.d = aVar;
        aVar.selChip(this.e);
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        DPCG0007ResponseDTO dPCG0007ResponseDTO = (DPCG0007ResponseDTO) c().fromJson(str, DPCG0007ResponseDTO.class);
        if (dPCG0007ResponseDTO == null || dPCG0007ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        dPCG0007ResponseDTO.setCmd(b());
        if (TextUtils.equals(dPCG0007ResponseDTO.getSuccess(), "true") && TextUtils.equals(dPCG0007ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(dPCG0007ResponseDTO);
        } else {
            d().onConnectionError(b(), dPCG0007ResponseDTO.getResponse().getRspCd(), dPCG0007ResponseDTO.getResponse().getRspMsg());
        }
    }
}
