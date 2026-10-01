package com.tmoney.c;

import android.content.Context;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.M;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class f extends BaseTmoneyCallback {
    private final String a;
    private String b;
    private String c;
    private String d;
    private AbstractC0045f.a e;

    public f(Context context, String str, String str2, String str3, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "LostAccountRegistInstance";
        this.e = new AbstractC0045f.a() { // from class: com.tmoney.c.f.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str4, String str5) {
                f.this.onResult(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str4).setMessage(str5));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                f.this.onResult(TmoneyCallback.ResultType.SUCCESS);
            }
        };
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.tmoney.listener.BaseTmoneyCallback
    public final Context getContext() {
        return this.mContext;
    }

    public final void setLostAccountRegist() throws Throwable {
        new M(this.mContext, this.e).execute(this.b, this.c, this.d);
    }
}
