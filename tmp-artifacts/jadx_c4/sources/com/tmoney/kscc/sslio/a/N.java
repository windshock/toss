package com.tmoney.kscc.sslio.a;

import android.content.Context;
import com.tmoney.dto.TopupRemitDto;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TMCR0011ResponseDTO;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.utils.Callback;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class N extends BaseTmoneyCallback {
    private final String a;
    private AbstractC0045f.a b;

    public N(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TopupRemitInstance";
        this.b = new AbstractC0045f.a() { // from class: com.tmoney.kscc.sslio.a.N.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                N.this.onResult(Callback.warning(ResultError.SERVER_ERROR, str, str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                TMCR0011ResponseDTO tMCR0011ResponseDTO = (TMCR0011ResponseDTO) responseDTO;
                TopupRemitDto topupRemitDto = new TopupRemitDto();
                topupRemitDto.chgTrdNo = tMCR0011ResponseDTO.getResponse().getChgTrdNo();
                topupRemitDto.pymTkn = tMCR0011ResponseDTO.getResponse().getPymTkn();
                topupRemitDto.addPymInf = tMCR0011ResponseDTO.getResponse().getAddPymInf();
                topupRemitDto.pymUrl = tMCR0011ResponseDTO.getResponse().getPymUrl();
                N.this.onResult(Callback.success(topupRemitDto));
            }
        };
    }

    public final void execute(String str, int i, int i2, int i3, String str2, String str3) {
        LogHelper.d("TopupRemitInstance", "execute ");
        new Y(this.mContext, this.b).execute(str, i3, i, i2, str2, str3);
    }
}
