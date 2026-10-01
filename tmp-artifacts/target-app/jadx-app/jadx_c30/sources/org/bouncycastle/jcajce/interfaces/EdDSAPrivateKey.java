package org.bouncycastle.jcajce.interfaces;

import java.security.PrivateKey;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface EdDSAPrivateKey extends EdDSAKey, PrivateKey {
    EdDSAPublicKey getPublicKey();
}
