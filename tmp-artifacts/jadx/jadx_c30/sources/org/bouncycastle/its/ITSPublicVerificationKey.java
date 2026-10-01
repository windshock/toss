package org.bouncycastle.its;

import org.bouncycastle.oer.its.PublicVerificationKey;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ITSPublicVerificationKey {
    public final PublicVerificationKey verificationKey;

    public ITSPublicVerificationKey(PublicVerificationKey publicVerificationKey) {
        this.verificationKey = publicVerificationKey;
    }

    public PublicVerificationKey toASN1Structure() {
        return this.verificationKey;
    }
}
