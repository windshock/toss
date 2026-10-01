package com.tmoney.c;

import android.content.Context;
import android.text.TextUtils;
import com.tmoney.listener.BaseTmoneyCallback;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;
import com.tmoney.preference.TmoneyData;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class i extends BaseTmoneyCallback {
    private TmoneyData a;

    public i(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = TmoneyData.getInstance(context);
    }

    public final void requestPartnerInfo() {
        TmoneyCallback.ResultType data;
        String partnerAppName = this.a.getPartnerAppName();
        String partnerAppPackage = this.a.getPartnerAppPackage();
        String partnerAppWithdraw = this.a.getPartnerAppWithdraw();
        if (TextUtils.isEmpty(partnerAppName) && TextUtils.isEmpty(partnerAppPackage) && TextUtils.isEmpty(partnerAppWithdraw)) {
            TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.NEED_INIT);
            ResultDetailCode resultDetailCode = ResultDetailCode.NEED_INIT_PARTNERINFO;
            data = error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage());
        } else {
            data = TmoneyCallback.ResultType.SUCCESS.setData(partnerAppName, partnerAppPackage, partnerAppWithdraw);
        }
        onResult(data);
    }
}
