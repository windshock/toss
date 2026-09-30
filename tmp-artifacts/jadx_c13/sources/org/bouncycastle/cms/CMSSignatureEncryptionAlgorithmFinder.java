package org.bouncycastle.cms;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface CMSSignatureEncryptionAlgorithmFinder {
    AlgorithmIdentifier findEncryptionAlgorithm(AlgorithmIdentifier algorithmIdentifier);
}
