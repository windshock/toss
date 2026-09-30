package com.tmoney.c;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.kscc.sslio.a.AbstractC0045f;
import com.tmoney.kscc.sslio.a.D;
import com.tmoney.kscc.sslio.a.H;
import com.tmoney.kscc.sslio.constants.APIConstants;
import com.tmoney.kscc.sslio.constants.CodeConstants;
import com.tmoney.kscc.sslio.dto.response.MBR0003ResponseDTO;
import com.tmoney.kscc.sslio.dto.response.ResponseDTO;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class g extends BaseTmoneyCallback {
    private final String a;
    private TmoneyData b;
    private String c;
    private AbstractC0045f.a d;
    private AbstractC0045f.a e;

    public g(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "LostDisableInstance";
        this.b = null;
        this.d = new AbstractC0045f.a() { // from class: com.tmoney.c.g.2
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                g.this.onResult(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) {
                g.this.onResult(TmoneyCallback.ResultType.SUCCESS);
            }
        };
        this.e = new AbstractC0045f.a() { // from class: com.tmoney.c.g.3
            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionError(APIConstants.EAPI_CONST eapi_const, String str, String str2) {
                g.this.onResult(TmoneyCallback.ResultType.WARNING.setError(ResultError.SERVER_ERROR).setDetailCode(str).setMessage(str2));
            }

            @Override // com.tmoney.kscc.sslio.a.AbstractC0045f.a
            public final void onConnectionSuccess(ResponseDTO responseDTO) throws Throwable {
                g.this.b.setTmoneyData((MBR0003ResponseDTO) responseDTO);
                g.this.a();
            }
        };
        LogHelper.d("LostDisableInstance", "LostDisableInstance");
        this.b = TmoneyData.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.c = this.b.getUsrUseLtnCd();
        new H(this.mContext, this.d).execute(this.c);
    }

    static /* synthetic */ void a(g gVar) {
        new D(gVar.mContext, gVar.e).execute();
    }

    public final void excuteLongTimeNoUseDisable() {
        this.c = this.b.getUsrUseLtnCd();
        a();
    }

    public final void excutePostPaidLostDisable() {
        this.c = this.b.getUsrUseLtnCd();
        a();
    }

    public final void excutePrePaidLostDisable() {
        String usrUseLtnCd = this.b.getUsrUseLtnCd();
        this.c = usrUseLtnCd;
        if (TextUtils.equals(usrUseLtnCd, CodeConstants.USR_USE_LTN_CD.SAFE_LOST.getCode()) || TextUtils.equals(this.c, CodeConstants.USR_USE_LTN_CD.LOST.getCode())) {
            com.tmoney.a.getInstance().forceRefund(new ResultListener() { // from class: com.tmoney.c.g.1
                @Override // com.tmoney.listener.ResultListener
                public final void onResult(TmoneyCallback.ResultType resultType) {
                    if (resultType == TmoneyCallback.ResultType.SUCCESS) {
                        g.a(g.this);
                    } else {
                        g.this.onResult(resultType);
                    }
                }
            });
        } else if (TextUtils.equals(this.c, CodeConstants.USR_USE_LTN_CD.SAFE_LOST_DISABLE.getCode()) || TextUtils.equals(this.c, CodeConstants.USR_USE_LTN_CD.LOST_DISABLE.getCode())) {
            a();
        }
    }
}
