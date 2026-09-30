package com.tmoney.b;

import android.content.Context;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class g extends com.tmoney.g.a.a {
    private final String a;

    public g(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "NfcSelchipExecuter";
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        int iExecute = super.execute(dVar, resultType, true);
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            resultType.setData(a());
        }
        onResult(resultType);
        return iExecute;
    }
}
