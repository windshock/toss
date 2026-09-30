package org.xbill.DNS;

import o.ycx9;
import o.yzp2;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class Zone$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ ycx9 f$0;
    public final /* synthetic */ yzp2 f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ Zone$$ExternalSyntheticLambda3(ycx9 ycx9Var, yzp2 yzp2Var, int i) {
        this.f$0 = ycx9Var;
        this.f$1 = yzp2Var;
        this.f$2 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.IAuthTabCallback(this.f$1, this.f$2);
    }
}
