package com.tmoney.c;

import android.content.Context;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.C0054v;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.DPCG0009ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class h extends BaseTmoneyCallback {
    private TmoneyData a;
    private AbstractC0045f.a b;

    public h(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.b = new AbstractC0045f.a() { // from class: com.tmoney.c.h.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                h.this.a.setOneDayLimitRemainCount(-1);
                h.this.onResult(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                h.this.a.setOneDayLimitRemainCount(Integer.parseInt(((DPCG0009ResponseDTO) responseDTO).getResponse().getPsbFcntRestLmt()));
                h hVar = h.this;
                hVar.onResult(TmoneyCallback.ResultType.SUCCESS.setData(Integer.valueOf(hVar.a.getOneDayLimitRemainCount())));
            }
        };
        this.mContext = context;
        TmoneyData tmoneyData = TmoneyData.getInstance(context);
        this.a = tmoneyData;
        tmoneyData.setOneDayLimitRemainCount(-1);
    }

    @Override // com.tmoney.listener.BaseTmoneyCallback
    public final Context getContext() {
        return this.mContext;
    }

    public final void getCount() {
        new C0054v(getContext(), this.b).execute();
    }
}
