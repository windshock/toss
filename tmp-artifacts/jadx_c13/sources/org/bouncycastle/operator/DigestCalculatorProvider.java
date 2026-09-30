package org.bouncycastle.operator;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface DigestCalculatorProvider {
    DigestCalculator get(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException;
}
