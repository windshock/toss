package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.io.IOException;
import java.math.BigInteger;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface DSAEncoder {
    BigInteger[] decode(byte[] bArr) throws IOException;

    byte[] encode(BigInteger bigInteger, BigInteger bigInteger2) throws IOException;
}
