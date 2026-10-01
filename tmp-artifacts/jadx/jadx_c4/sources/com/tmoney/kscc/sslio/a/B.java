package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.MBR0001RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MBR0001ResponseDTO;
import com.tmoney.utils.DeviceInfoHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class B extends AbstractC0049k {
    private MBR0001RequestDTO c;

    public B(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0001, aVar);
        this.c = null;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute(String str, String str2, String str3) {
        MBR0001RequestDTO mBR0001RequestDTO = new MBR0001RequestDTO();
        this.c = mBR0001RequestDTO;
        mBR0001RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setMbphMdlId(DeviceInfoHelper.getModel());
        this.c.setUnic(g());
        this.c.setMvnoCd("000");
        this.c.setTlcmCd(this.m_tmoneyData.getTelecomCode());
        this.c.setMoappVer(h());
        this.c.setUserBrdt(str);
        this.c.setGndrCd(str2);
        this.c.setAreaCd(str3);
        this.c.setPrsnAuthCiVal(!TextUtils.isEmpty(this.m_tmoneyData.getCIPreference()) ? this.m_tmoneyData.getCIPreference() : "");
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        MBR0001ResponseDTO mBR0001ResponseDTO = (MBR0001ResponseDTO) c().fromJson(str, MBR0001ResponseDTO.class);
        if (mBR0001ResponseDTO == null || mBR0001ResponseDTO.getResponse() == null || d() == null) {
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        mBR0001ResponseDTO.setCmd(b());
        if (TextUtils.equals(mBR0001ResponseDTO.getSuccess(), "true") && TextUtils.equals(mBR0001ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            d().onConnectionSuccess(mBR0001ResponseDTO);
        } else {
            d().onConnectionError(b(), mBR0001ResponseDTO.getResponse().getRspCd(), mBR0001ResponseDTO.getResponse().getRspMsg());
        }
    }
}
