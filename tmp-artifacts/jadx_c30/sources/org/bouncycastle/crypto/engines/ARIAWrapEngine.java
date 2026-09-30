package org.bouncycastle.crypto.engines;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ARIAWrapEngine extends RFC3394WrapEngine {
    public ARIAWrapEngine() {
        super(new ARIAEngine());
    }

    public ARIAWrapEngine(boolean z) {
        super(new ARIAEngine(), z);
    }
}
