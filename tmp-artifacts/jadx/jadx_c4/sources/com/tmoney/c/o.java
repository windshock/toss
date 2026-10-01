package com.tmoney.c;

import android.content.Context;
import com.tmoney.dto.PrepaidMethodInfoDto;
import com.tmoney.dto.PrepaidMethodInfoListDto;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.ai;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.TRDR0016ResponseDTO;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.utils.LogHelper;
import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class o extends BaseTmoneyCallback {
    private final String a;
    private Context b;
    private String c;
    private AbstractC0045f.a d;

    public o(Context context, String str, ResultListener resultListener) {
        super(resultListener);
        this.a = "PrepaidMethodInfoInstance";
        this.d = new AbstractC0045f.a() { // from class: com.tmoney.c.o.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str2, String str3) {
                o.this.onResult(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str2).setMessage(str3));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                o.this.onResult(TmoneyCallback.ResultType.SUCCESS.setData(o.a(o.this, (TRDR0016ResponseDTO) responseDTO)));
            }
        };
        this.b = context;
        this.c = str;
    }

    static /* synthetic */ PrepaidMethodInfoListDto a(o oVar, TRDR0016ResponseDTO tRDR0016ResponseDTO) {
        PrepaidMethodInfoListDto prepaidMethodInfoListDto = new PrepaidMethodInfoListDto();
        ArrayList arrayList = new ArrayList();
        ArrayList<TRDR0016ResponseDTO.TRDR0016List> remit = tRDR0016ResponseDTO.getResponse().getRemit();
        if (remit == null) {
            remit = tRDR0016ResponseDTO.getResponse().getPhonebill();
        }
        for (TRDR0016ResponseDTO.TRDR0016List tRDR0016List : remit) {
            arrayList.add(new PrepaidMethodInfoDto(tRDR0016List.getSvcNm(), tRDR0016List.getPymMnsTypCd(), tRDR0016List.getFxrtFamtDvsCd(), tRDR0016List.getFee(), tRDR0016List.getMinFee(), tRDR0016List.getMinChg(), tRDR0016List.getMaxChg()));
        }
        prepaidMethodInfoListDto.setPayList(arrayList);
        return prepaidMethodInfoListDto;
    }

    public final void execute() {
        LogHelper.d("PrepaidMethodInfoInstance", "execute ");
        new ai(this.b, this.d).execute(this.c);
    }
}
