package org.bouncycastle.crypto.modes.kgcm;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface KGCMMultiplier {
    void init(long[] jArr);

    void multiplyH(long[] jArr);
}
