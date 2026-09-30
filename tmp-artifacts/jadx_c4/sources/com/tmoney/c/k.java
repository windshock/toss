package com.tmoney.c;

import android.content.Context;
import com.tmoney.dto.PostpaidBillingDayDto;
import com.tmoney.dto.PostpaidBillingResultDto;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.ae;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResultTRDR0006RowDTO;
import com.tmoney.kscc.sslio.dto.response.TRDR0006ResponseDTO;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class k extends BaseTmoneyCallback {
    private final String a;
    private Context b;
    private String c;
    private AbstractC0045f.a d;

    public k(Context context, String str, ResultListener resultListener) {
        super(resultListener);
        this.a = "PostPaidBillingDayInstance";
        this.d = new AbstractC0045f.a() { // from class: com.tmoney.c.k.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str2, String str3) {
                k.this.onResult(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str2).setMessage(str3));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                k.this.onResult(TmoneyCallback.ResultType.SUCCESS.setData(k.a(k.this, (TRDR0006ResponseDTO) responseDTO).getBillDay()));
            }
        };
        this.b = context;
        this.c = str;
    }

    static /* synthetic */ PostpaidBillingResultDto a(k kVar, TRDR0006ResponseDTO tRDR0006ResponseDTO) {
        PostpaidBillingResultDto postpaidBillingResultDto = new PostpaidBillingResultDto();
        ArrayList billDay = postpaidBillingResultDto.getBillDay();
        for (int i = 0; i < tRDR0006ResponseDTO.getResponse().getBillDtaV().size(); i++) {
            PostpaidBillingDayDto postpaidBillingDayDto = new PostpaidBillingDayDto();
            ResultTRDR0006RowDTO resultTRDR0006RowDTO = tRDR0006ResponseDTO.getResponse().getBillDtaV().get(i);
            postpaidBillingDayDto.setBillDay(resultTRDR0006RowDTO.getBillDay());
            postpaidBillingDayDto.setBillMon(resultTRDR0006RowDTO.getBillMon());
            postpaidBillingDayDto.setBillYearMonth(resultTRDR0006RowDTO.getBillYearMonth());
            billDay.add(postpaidBillingDayDto);
        }
        return postpaidBillingResultDto;
    }

    public final void excutePostPaidBillingDay() {
        new ae(this.b, this.d).execute(this.c);
    }
}
