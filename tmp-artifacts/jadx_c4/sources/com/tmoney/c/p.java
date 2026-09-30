package com.tmoney.c;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.C0042b;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.response.ACRY0002ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class p extends BaseTmoneyCallback {
    public final String TYPE_PREPAID;
    public final String TYPE_TRANS_SERVICE;
    private final String a;
    private Context b;
    private int c;
    private String d;
    private String e;
    private AbstractC0045f.a f;

    public p(Context context, int i, boolean z, ResultListener resultListener) {
        super(resultListener);
        this.a = "RefundFeeInstance";
        this.TYPE_TRANS_SERVICE = "A";
        this.TYPE_PREPAID = "X";
        this.f = new AbstractC0045f.a() { // from class: com.tmoney.c.p.1
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                p.this.onResult(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                p.this.onResult(TmoneyCallback.ResultType.SUCCESS.setData(Integer.valueOf(Integer.parseInt(((ACRY0002ResponseDTO) responseDTO).getResponse().getSvcUtam()))));
            }
        };
        this.b = context;
        this.c = i;
        if (z) {
            this.d = "A";
        } else {
            this.d = "X";
        }
        this.e = (TextUtils.equals(this.d, "X") ? CodeConstants.EMBL_SVC_TYP_CD.PREPAID : CodeConstants.EMBL_SVC_TYP_CD.POSTPAID).getCode();
    }

    public final void getRefundFee() {
        LogHelper.d("RefundFeeInstance", "mType:" + this.d);
        new C0042b(this.b, this.f).execute(this.e, String.format("%d", Integer.valueOf(this.c)));
    }
}
