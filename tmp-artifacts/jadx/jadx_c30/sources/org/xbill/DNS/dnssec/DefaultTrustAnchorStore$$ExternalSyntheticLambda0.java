package org.xbill.DNS.dnssec;

import java.util.function.Consumer;
import org.xbill.DNS.RRset;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class DefaultTrustAnchorStore$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ RRset f$0;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f$0.onNavigationEvent((Record) obj);
    }
}
