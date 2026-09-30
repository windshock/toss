package org.bouncycastle.jce.spec;

import java.security.spec.KeySpec;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ElGamalKeySpec implements KeySpec {
    private ElGamalParameterSpec spec;

    public ElGamalKeySpec(ElGamalParameterSpec elGamalParameterSpec) {
        this.spec = elGamalParameterSpec;
    }

    public ElGamalParameterSpec getParams() {
        return this.spec;
    }
}
