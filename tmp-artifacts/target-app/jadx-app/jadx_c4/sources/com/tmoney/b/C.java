package com.tmoney.b;

import android.content.Context;
import com.tmoney.dto.RefundDataDto;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.aj;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TRDR0017ResponseDTO;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.utils.LogHelper;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C extends com.tmoney.g.a.a {
    private final String a;
    private String b;
    private String c;
    private ArrayList<RefundDataDto> d;
    private AbstractC0045f.a e;

    public C(Context context, String str, String str2, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TmoneyRefundHistoryExecuter";
        this.d = null;
        this.e = new AbstractC0045f.a() { // from class: com.tmoney.b.C.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str3, String str4) {
                C.this.a(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str3).setMessage(str4));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                TRDR0017ResponseDTO tRDR0017ResponseDTO = (TRDR0017ResponseDTO) responseDTO;
                if (tRDR0017ResponseDTO.getResponse().getRspDta() != null) {
                    int size = tRDR0017ResponseDTO.getResponse().getRspDta().size();
                    C.this.d = new ArrayList();
                    for (int i = 0; i < size; i++) {
                        C.this.d.add(new RefundDataDto(tRDR0017ResponseDTO.getResponse().getRspDta().get(i)));
                    }
                }
                C.this.a(TmoneyCallback.ResultType.SUCCESS);
            }
        };
        this.b = str;
        this.c = str2;
        LogHelper.d("TmoneyRefundHistoryExecuter", " mSYearMonth : " + this.b + "+ mEYearMonth +" + this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TmoneyCallback.ResultType resultType) {
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            resultType.setData(this.d);
        }
        onResult(resultType);
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        super.execute(dVar, resultType);
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            new aj(getContext(), this.e).execute(this.b, this.c);
        } else {
            a(resultType);
        }
        return p();
    }
}
