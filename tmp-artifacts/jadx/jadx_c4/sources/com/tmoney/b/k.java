package com.tmoney.b;

import android.content.Context;
import com.tmoney.listener.ResultDetailCode;
import com.tmoney.listener.ResultError;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class k extends com.tmoney.g.a.a {
    private final String a;

    public k(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TmoneyCardInfoExecuter";
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        super.execute(dVar, resultType);
        TmoneyCallback.ResultType resultType2 = TmoneyCallback.ResultType.SUCCESS;
        if (resultType == resultType2 && p() > 500000) {
            TmoneyCallback.ResultType error = TmoneyCallback.ResultType.WARNING.setError(ResultError.USIM_ERROR);
            ResultDetailCode resultDetailCode = ResultDetailCode.BALANCE_OVER;
            resultType = error.setDetailCode(resultDetailCode.getCodeString()).setMessage(resultDetailCode.getMessage());
        }
        if (resultType == resultType2) {
            resultType.setData(n(), Integer.valueOf(p()));
        }
        onResult(resultType);
        return p();
    }
}
