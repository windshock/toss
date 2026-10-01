package com.tmoney.c;

import android.os.Bundle;
import com.tmoney.a;
import com.tmoney.kscc.sslio.a.D;
import com.tmoney.kscc.sslio.a.f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.DPCG0007ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class m$1 implements f.a {
    final /* synthetic */ m a;

    m$1(m mVar) {
        this.a = mVar;
    }

    public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
        LogHelper.d("PostPaidCreditCardRegistInstance", " >>>>> Card Regi Fail");
        m.a(this.a, TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2));
    }

    public final void onConnectionSuccess(ResponseDTO responseDTO) {
        LogHelper.d("PostPaidCreditCardRegistInstance", " >>>>> Card Regi Success");
        DPCG0007ResponseDTO dPCG0007ResponseDTO = (DPCG0007ResponseDTO) responseDTO;
        m.a(this.a).setAutoLoadAmount(dPCG0007ResponseDTO.getResponse().getChgAmt());
        m.a(this.a).setPymStupYn("Y");
        a aVar = a.getInstance();
        String chgAmt = dPCG0007ResponseDTO.getResponse().getChgAmt();
        int i = chgAmt.contains(".") ? (int) Float.parseFloat(chgAmt) : Integer.parseInt(chgAmt);
        Bundle bundle = new Bundle();
        bundle.putIntArray("step", new int[]{3});
        bundle.putInt("balance", 0);
        bundle.putInt("amount", i);
        aVar.liveCheckStep(bundle, new ResultListener() { // from class: com.tmoney.c.m$1.1
            public final void onResult(TmoneyCallback.ResultType resultType) {
                if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                    new D(m.b(m$1.this.a), m$1.this.a.a).execute();
                } else {
                    LogHelper.d("PostPaidCreditCardRegistInstance", " >>>>> limitRestoration Fail");
                    m.a(m$1.this.a, resultType);
                }
            }
        });
    }
}
