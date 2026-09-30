package org.bouncycastle.jce.interfaces;

import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface ElGamalPublicKey extends ElGamalKey, DHPublicKey {
    BigInteger getY();
}
