package org.bouncycastle.est;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface ESTClient {
    ESTResponse doRequest(ESTRequest eSTRequest) throws IOException;
}
