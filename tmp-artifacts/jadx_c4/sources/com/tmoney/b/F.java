package com.tmoney.b;

import android.content.Context;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class F extends com.tmoney.g.a.a {
    private final String a;

    public F(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "TmoneyUiccExecuter";
        com.tmoney.g.d.clearInstance();
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        super.execute(dVar, resultType);
        onResult(resultType);
        return p();
    }
}
