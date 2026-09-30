package org.bouncycastle.pqc.crypto.gmss;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class GMSSKeyParameters extends AsymmetricKeyParameter {
    private GMSSParameters params;

    public GMSSKeyParameters(boolean z, GMSSParameters gMSSParameters) {
        super(z);
        this.params = gMSSParameters;
    }

    public GMSSParameters getParameters() {
        return this.params;
    }
}
