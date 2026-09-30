package org.bouncycastle.operator;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface MacCalculatorProvider {
    MacCalculator get(AlgorithmIdentifier algorithmIdentifier);
}
