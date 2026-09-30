package org.bouncycastle.jcajce.interfaces;

import java.security.PublicKey;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface EdDSAPublicKey extends EdDSAKey, PublicKey {
    byte[] getPointEncoding();
}
