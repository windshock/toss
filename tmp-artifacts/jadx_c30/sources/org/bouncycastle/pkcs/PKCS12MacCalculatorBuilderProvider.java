package org.bouncycastle.pkcs;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface PKCS12MacCalculatorBuilderProvider {
    PKCS12MacCalculatorBuilder get(AlgorithmIdentifier algorithmIdentifier);
}
