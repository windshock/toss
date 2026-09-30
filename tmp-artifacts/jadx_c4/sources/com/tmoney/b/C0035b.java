package com.tmoney.b;

import android.content.Context;
import com.tmoney.listener.ResultListener;
import com.tmoney.listener.TmoneyCallback;

/* renamed from: com.tmoney.b.b, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class C0035b extends com.tmoney.g.a.a {
    private final String a;

    public C0035b(Context context, ResultListener resultListener) {
        super(context, resultListener);
        this.a = "NfcCardInfoExecuter";
    }

    @Override // com.tmoney.g.a.a
    public final int execute(com.tmoney.g.d dVar, TmoneyCallback.ResultType resultType) {
        int iExecute = super.execute(dVar, resultType, true);
        if (resultType == TmoneyCallback.ResultType.SUCCESS) {
            resultType.setData(n(), Integer.valueOf(iExecute));
        }
        onResult(resultType);
        return iExecute;
    }
}
