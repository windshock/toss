package com.tmoney.kscc.sslio.a;

import android.content.Context;
import com.tmoney.dto.TopupRemitDto;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.PRCG0008ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.utils.Callback;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ak extends BaseTmoneyCallback {
    private final String a;
    private AbstractC0045f.a b;

    public ak(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TopupRemitInstance";
        this.b = new AbstractC0045f.a() { // from class: com.tmoney.kscc.sslio.a.ak.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                ak.this.onResult(Callback.warning(ResultError.SERVER_ERROR, str, str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                PRCG0008ResponseDTO pRCG0008ResponseDTO = (PRCG0008ResponseDTO) responseDTO;
                TopupRemitDto topupRemitDto = new TopupRemitDto();
                topupRemitDto.chgTrdNo = pRCG0008ResponseDTO.getResponse().getChgTrdNo();
                topupRemitDto.pymTkn = pRCG0008ResponseDTO.getResponse().getPymTkn();
                topupRemitDto.addPymInf = pRCG0008ResponseDTO.getResponse().getAddPymInf();
                topupRemitDto.pymUrl = pRCG0008ResponseDTO.getResponse().getPymUrl();
                ak.this.onResult(Callback.success(topupRemitDto));
            }
        };
    }

    public final void execute(String str, int i, int i2, int i3, String str2) {
        LogHelper.d("TopupRemitInstance", "execute ");
        new T(this.mContext, this.b).execute(str, i3, i, i2, str2);
    }
}
