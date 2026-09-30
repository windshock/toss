package org.xbill.DNS.tools;

import java.net.InetAddress;
import o.TRNAS_Init_Check;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class jnamed$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ TRNAS_Init_Check f$0;
    public final /* synthetic */ InetAddress f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ jnamed$$ExternalSyntheticLambda2(TRNAS_Init_Check tRNAS_Init_Check, InetAddress inetAddress, int i) {
        this.f$0 = tRNAS_Init_Check;
        this.f$1 = inetAddress;
        this.f$2 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.onExtraCallbackWithResult(this.f$1, this.f$2);
    }
}
