package com.tmoney.c;

import android.content.Context;
import com.tmoney.dto.AcntBnkInfoResultDto;
import com.tmoney.dto.AcntBnkInfoRowDto;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.C0043d;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.ACRY0004ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import java.util.ArrayList;

/* renamed from: com.tmoney.c.a, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0040a extends BaseTmoneyCallback {
    private AbstractC0045f.a a;

    public C0040a(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = new AbstractC0045f.a() { // from class: com.tmoney.c.a.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                C0040a.this.onResult(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                ACRY0004ResponseDTO aCRY0004ResponseDTO = (ACRY0004ResponseDTO) responseDTO;
                int size = aCRY0004ResponseDTO.getResponse().getAcntBnkList().size();
                ArrayList arrayList = new ArrayList();
                if (size > 0) {
                    for (int i = 0; i < size; i++) {
                        arrayList.add(new AcntBnkInfoRowDto(aCRY0004ResponseDTO.getResponse().getAcntBnkList().get(i).getBnkCd(), aCRY0004ResponseDTO.getResponse().getAcntBnkList().get(i).getBnkNm()));
                    }
                }
                C0040a.this.onResult(TmoneyCallback.ResultType.SUCCESS.setData(new AcntBnkInfoResultDto(arrayList)).setMessage(aCRY0004ResponseDTO.getResponse().getRspMsg()));
            }
        };
    }

    public final void execute() {
        new C0043d(this.mContext, this.a).execute();
    }
}
