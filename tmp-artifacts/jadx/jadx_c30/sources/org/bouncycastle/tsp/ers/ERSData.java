package org.bouncycastle.tsp.ers;

import org.bouncycastle.operator.DigestCalculator;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface ERSData {
    byte[] getHash(DigestCalculator digestCalculator);
}
