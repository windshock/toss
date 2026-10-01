package org.bouncycastle.jce.interfaces;

import java.security.PublicKey;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface MQVPublicKey extends PublicKey {
    PublicKey getEphemeralKey();

    PublicKey getStaticKey();
}
