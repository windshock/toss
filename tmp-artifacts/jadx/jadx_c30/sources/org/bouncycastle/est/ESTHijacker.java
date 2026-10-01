package org.bouncycastle.est;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface ESTHijacker {
    ESTResponse hijack(ESTRequest eSTRequest, Source source) throws IOException;
}
