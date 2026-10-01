package org.xbill.DNS;

import o.ycx9;
import o.yzp2;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class Zone$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ ycx9 f$0;
    public final /* synthetic */ yzp2 f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ Record f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ Zone$$ExternalSyntheticLambda2(ycx9 ycx9Var, yzp2 yzp2Var, int i, Record record, int i2) {
        this.f$0 = ycx9Var;
        this.f$1 = yzp2Var;
        this.f$2 = i;
        this.f$3 = record;
        this.f$4 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ycx9.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
    }
}
