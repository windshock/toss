package com.tmoney.c;

import com.tmoney.kscc.sslio.a.D;
import com.tmoney.kscc.sslio.a.f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.MBR0003ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class q$3 implements f.a {
    final /* synthetic */ q a;

    q$3(q qVar) {
        this.a = qVar;
    }

    public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
        new D(this.a.getContext(), new 2(this, str, str2)).execute();
    }

    public final void onConnectionSuccess(ResponseDTO responseDTO) {
        new D(this.a.getContext(), new f.a() { // from class: com.tmoney.c.q$3.1
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                q.a(q$3.this.a, TmoneyCallback.ResultType.SUCCESS);
            }

            public final void onConnectionSuccess(ResponseDTO responseDTO2) {
                TmoneyData.getInstance(q$3.this.a.getContext()).setTmoneyData((MBR0003ResponseDTO) responseDTO2);
                q.a(q$3.this.a, TmoneyCallback.ResultType.SUCCESS);
            }
        }).execute();
    }
}
