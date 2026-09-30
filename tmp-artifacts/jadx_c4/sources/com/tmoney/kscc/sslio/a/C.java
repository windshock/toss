package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.MBR0002RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MBR0002ResponseDTO;
import com.tmoney.utils.DeviceInfoHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C extends AbstractC0049k {
    private MBR0002RequestDTO c;

    public C(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0002, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3, String str4) {
        MBR0002RequestDTO mBR0002RequestDTO = new MBR0002RequestDTO();
        this.c = mBR0002RequestDTO;
        mBR0002RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnic(g());
        this.c.setMbphMdlId(DeviceInfoHelper.getModel());
        this.c.setTlcmCd(this.m_tmoneyData.getTelecomCode());
        this.c.setMoappVer(h());
        this.c.setMvnoCd("000");
        this.c.setPpyDpyDvsCd(str);
        this.c.setUserBrdt(str2);
        this.c.setGndrCd(str3);
        this.c.setAreaCd(str4);
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        MBR0002ResponseDTO mBR0002ResponseDTO = (MBR0002ResponseDTO) c().fromJson(str, MBR0002ResponseDTO.class);
        if (mBR0002ResponseDTO == null || mBR0002ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        mBR0002ResponseDTO.setCmd(b());
        if (TextUtils.equals(mBR0002ResponseDTO.getSuccess(), "true") && TextUtils.equals(mBR0002ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(mBR0002ResponseDTO);
        } else {
            d().onConnectionError(b(), mBR0002ResponseDTO.getResponse().getRspCd(), mBR0002ResponseDTO.getResponse().getRspMsg());
        }
    }
}
