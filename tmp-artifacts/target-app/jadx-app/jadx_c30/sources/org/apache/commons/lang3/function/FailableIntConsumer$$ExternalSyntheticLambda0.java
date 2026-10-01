package org.apache.commons.lang3.function;

import o.initToast;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class FailableIntConsumer$$ExternalSyntheticLambda0 implements initToast {
    public final /* synthetic */ initToast f$0;
    public final /* synthetic */ initToast f$1;

    public /* synthetic */ FailableIntConsumer$$ExternalSyntheticLambda0(initToast inittoast, initToast inittoast2) {
        this.f$0 = inittoast;
        this.f$1 = inittoast2;
    }

    @Override // o.initToast
    public final void accept(int i) throws Throwable {
        initToast.onNavigationEvent(this.f$0, this.f$1, i);
    }
}
