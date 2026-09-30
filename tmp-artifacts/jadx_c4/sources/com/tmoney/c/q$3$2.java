package com.tmoney.c;

import com.tmoney.c.q;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.MBR0003ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class q$3$2 implements AbstractC0045f.a {
    private /* synthetic */ String a;
    private /* synthetic */ String b;
    private /* synthetic */ q.3 c;

    q$3$2(q.3 r1, String str, String str2) {
        this.c = r1;
        this.a = str;
        this.b = str2;
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
    public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
        q.a(this.c.a, TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2));
    }

    @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
    public final void onConnectionSuccess(ResponseDTO responseDTO) throws Throwable {
        TmoneyData.getInstance(this.c.a.getContext()).setTmoneyData((MBR0003ResponseDTO) responseDTO);
        q.a(this.c.a, TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(this.a).setMessage(this.b));
    }
}
