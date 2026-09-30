package com.tmoney.b;

import android.content.Context;
import com.tmoney.dto.MonthlySumDto;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.ac;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TRDR0004ResponseDTO;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.utils.LogHelper;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class t extends com.tmoney.g.a.a {
    private final String a;
    private String b;
    private String c;
    private String d;
    private ArrayList<MonthlySumDto> e;
    private AbstractC0045f.a f;

    public t(Context context, String str, String str2, String str3, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TmoneyMonthlySumExecuter";
        this.e = null;
        this.f = new AbstractC0045f.a() { // from class: com.tmoney.b.t.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str4, String str5) {
                t.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str4).setMessage(str5));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                TRDR0004ResponseDTO tRDR0004ResponseDTO = (TRDR0004ResponseDTO) responseDTO;
                if (tRDR0004ResponseDTO.getResponse().getRspDta() != null) {
                    int size = tRDR0004ResponseDTO.getResponse().getRspDta().size();
                    t.this.e = new ArrayList();
                    for (int i = 0; i < size; i++) {
                        t.this.e.add(new MonthlySumDto(tRDR0004ResponseDTO.getResponse().getRspDta().get(i)));
                    }
                }
                t.this.a(TmoneyCallback.ResultType.SUCCESS);
            }
        };
        this.b = str2;
        this.c = str3;
        this.d = str;
        LogHelper.d("TmoneyMonthlySumExecuter", " mSYearMonth : " + this.b + "+ mEYearMonth +" + this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TmoneyCallback.ResultType resultType) {
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            resultType.setData(this.e);
        }
        onResult(resultType);
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        super.execute(dVar, resultType);
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            new ac(getContext(), this.f).execute(this.d, this.b, this.c);
        } else {
            a(resultType);
        }
        return p();
    }
}
