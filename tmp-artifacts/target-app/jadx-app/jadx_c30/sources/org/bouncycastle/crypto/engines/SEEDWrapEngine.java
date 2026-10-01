package org.bouncycastle.crypto.engines;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class SEEDWrapEngine extends RFC3394WrapEngine {
    public SEEDWrapEngine() {
        super(new SEEDEngine());
    }
}
