package org.bouncycastle.crypto.engines;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class CamelliaWrapEngine extends RFC3394WrapEngine {
    public CamelliaWrapEngine() {
        super(new CamelliaEngine());
    }
}
