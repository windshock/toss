package org.bouncycastle.jce.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface ECPrivateKey extends ECKey, PrivateKey {
    BigInteger getD();
}
