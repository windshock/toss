package com.tmoney.kscc.sslio.a;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.b.j;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.request.MBR0003RequestDTO;
import com.tmoney.kscc.sslio.dto.request.RequestDTO;
import com.tmoney.kscc.sslio.dto.response.ErrorResponseDTO;
import com.tmoney.kscc.sslio.dto.response.MBR0003ResponseDTO;
import com.tmoney.utils.DeviceInfoHelper;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class D extends AbstractC0049k {
    private MBR0003RequestDTO c;

    public D() {
        this.c = null;
    }

    public D(Context context, AbstractC0045f.a aVar) {
        super(context, APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0003, aVar);
        this.c = null;
    }

    private void i() {
        String strG = g();
        if (strG == null || strG.startsWith("00000000")) {
            LogHelper.sendAppLog("getUicc", strG, CodeConstants.E_SAVEAPPLOG.CREATE);
        }
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void callback() {
        RequestDTO requestDTOE = e();
        requestDTOE.setRequest(this.c);
        a(c().toJson(requestDTOE));
    }

    public final void execute() {
        MBR0003RequestDTO mBR0003RequestDTO = new MBR0003RequestDTO();
        this.c = mBR0003RequestDTO;
        mBR0003RequestDTO.setTmcrNo(this.m_tmoneyData.getCardNumber());
        this.c.setMbphNo(f());
        this.c.setUnic(g());
        this.c.setMbphMdlId(DeviceInfoHelper.getModel());
        this.c.setTlcmCd(this.m_tmoneyData.getTelecomCode());
        this.c.setMvnoCd("000");
        this.c.setMoappVer(h());
        connectServer();
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0046g
    public final void onResponse(String str) {
        MBR0003ResponseDTO mBR0003ResponseDTO = (MBR0003ResponseDTO) c().fromJson(str, MBR0003ResponseDTO.class);
        if (mBR0003ResponseDTO == null || mBR0003ResponseDTO.getResponse() == null || d() == null) {
            i();
            ErrorResponseDTO errorResponseDTO = (ErrorResponseDTO) c().fromJson(str, ErrorResponseDTO.class);
            d().onConnectionError(b(), errorResponseDTO.getCode(), errorResponseDTO.getMessage());
            return;
        }
        mBR0003ResponseDTO.setCmd(b());
        if (!TextUtils.equals(mBR0003ResponseDTO.getSuccess(), "true") || !TextUtils.equals(mBR0003ResponseDTO.getResponse().getRspCd(), CodeConstants.RSP_CD_SUCCESS)) {
            i();
            d().onConnectionError(b(), mBR0003ResponseDTO.getResponse().getRspCd(), mBR0003ResponseDTO.getResponse().getRspMsg());
        } else if (mBR0003ResponseDTO.getResponse().getUcfmYn() == null || !mBR0003ResponseDTO.getResponse().getUcfmYn().equals("Y")) {
            d().onConnectionSuccess(mBR0003ResponseDTO);
        } else {
            com.tmoney.g.a.d.getInstance().offerTask(AbstractC0045f.b, new j(AbstractC0045f.a(), null));
            d().onConnectionSuccess(mBR0003ResponseDTO);
        }
    }
}
