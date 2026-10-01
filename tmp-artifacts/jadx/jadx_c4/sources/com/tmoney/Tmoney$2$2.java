package com.tmoney;

import com.tmoney.Tmoney;
import com.tmoney.listener.TmoneyCallback;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class Tmoney$2$2 implements Runnable {
    private /* synthetic */ TmoneyCallback.ResultType a;
    private /* synthetic */ Tmoney.2 b;

    Tmoney$2$2(Tmoney.2 r1, TmoneyCallback.ResultType resultType) {
        this.b = r1;
        this.a = resultType;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tmoney.2 r0 = this.b;
        r0.b.onResult(r0.a, this.a, null);
    }
}
