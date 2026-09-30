package org.bouncycastle.tsp.ers;

import org.bouncycastle.asn1.tsp.PartialHashtree;
import org.bouncycastle.operator.DigestCalculator;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface ERSRootNodeCalculator {
    byte[] computeRootHash(DigestCalculator digestCalculator, PartialHashtree[] partialHashtreeArr);
}
