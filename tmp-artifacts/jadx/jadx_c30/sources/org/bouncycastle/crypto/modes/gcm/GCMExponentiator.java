package org.bouncycastle.crypto.modes.gcm;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface GCMExponentiator {
    void exponentiateX(long j, byte[] bArr);

    void init(byte[] bArr);
}
