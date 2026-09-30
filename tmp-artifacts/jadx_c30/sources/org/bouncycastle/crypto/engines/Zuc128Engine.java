package org.bouncycastle.crypto.engines;

import org.bouncycastle.util.Memoable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class Zuc128Engine extends Zuc128CoreEngine {
    public Zuc128Engine() {
    }

    private Zuc128Engine(Zuc128Engine zuc128Engine) {
        super(zuc128Engine);
    }

    @Override // org.bouncycastle.crypto.engines.Zuc128CoreEngine
    public Memoable copy() {
        return new Zuc128Engine(this);
    }
}
