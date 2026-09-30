package org.bouncycastle.jce.interfaces;

import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface IESKey extends Key {
    PrivateKey getPrivate();

    PublicKey getPublic();
}
