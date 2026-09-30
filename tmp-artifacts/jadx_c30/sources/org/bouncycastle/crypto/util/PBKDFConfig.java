package org.bouncycastle.crypto.util;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class PBKDFConfig {
    private final ASN1ObjectIdentifier algorithm;

    protected PBKDFConfig(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.algorithm = aSN1ObjectIdentifier;
    }

    public ASN1ObjectIdentifier getAlgorithm() {
        return this.algorithm;
    }
}
