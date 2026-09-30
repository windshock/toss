package com.tmoney.c;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.tmoney.TmoneyInfo;
import com.tmoney.dto.CardListDto;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.af;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TRDR0012ResponseDTO;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class c extends BaseTmoneyCallback {
    private TmoneyData a;
    private AbstractC0045f.a b;

    public c(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.b = new AbstractC0045f.a() { // from class: com.tmoney.c.c.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                c.this.a.setCreditCardListRegDate("");
                c.this.onResult(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                Gson gson = new Gson();
                TRDR0012ResponseDTO tRDR0012ResponseDTO = (TRDR0012ResponseDTO) responseDTO;
                tRDR0012ResponseDTO.setTxId("");
                tRDR0012ResponseDTO.setSuccess("");
                tRDR0012ResponseDTO.getResponse().setRspCd("");
                tRDR0012ResponseDTO.getResponse().setRspMsg("");
                c.this.a.setCreditCardAll(gson.toJson(tRDR0012ResponseDTO));
                TmoneyInfo tmoneyInfo = TmoneyInfo.getInstance();
                c.this.onResult(TmoneyCallback.ResultType.SUCCESS.setData(new CardListDto(tmoneyInfo.getPrePaidCardList(), tmoneyInfo.getPostPaidCardList())));
            }
        };
        this.a = TmoneyData.getInstance(getContext());
    }

    public final void requestOnlyDate() {
        String creditCardAll = this.a.getCreditCardAll();
        String setupInfo = this.a.getSetupInfo(CodeConstants.AFLT_STUP_VAL_CD.SETUP_CARD_INFO.getCode());
        String saveCardInfo = this.a.getSaveCardInfo();
        if (TextUtils.isEmpty(creditCardAll) || TextUtils.isEmpty(setupInfo) || TextUtils.isEmpty(saveCardInfo) || !setupInfo.equals(saveCardInfo)) {
            new af(getContext(), this.b).execute("3");
            return;
        }
        TmoneyInfo tmoneyInfo = TmoneyInfo.getInstance();
        onResult(TmoneyCallback.ResultType.SUCCESS.setData(new CardListDto(tmoneyInfo.getPrePaidCardList(), tmoneyInfo.getPostPaidCardList())));
    }
}
