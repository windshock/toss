package org.bouncycastle.oer.its;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PublicEncryptionKey extends ASN1Object {
    private final BasePublicEncryptionKey basePublicEncryptionKey;
    private final SymmAlgorithm supportedSymmAlg;

    public PublicEncryptionKey(SymmAlgorithm symmAlgorithm, BasePublicEncryptionKey basePublicEncryptionKey) {
        this.supportedSymmAlg = symmAlgorithm;
        this.basePublicEncryptionKey = basePublicEncryptionKey;
    }

    public static PublicEncryptionKey getInstance(Object obj) {
        if (obj instanceof PublicEncryptionKey) {
            return (PublicEncryptionKey) obj;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        return new PublicEncryptionKey(SymmAlgorithm.getInstance(aSN1Sequence.getObjectAt(0)), BasePublicEncryptionKey.getInstance(aSN1Sequence.getObjectAt(1)));
    }

    public BasePublicEncryptionKey getBasePublicEncryptionKey() {
        return this.basePublicEncryptionKey;
    }

    public SymmAlgorithm getSupportedSymmAlg() {
        return this.supportedSymmAlg;
    }

    public ASN1Primitive toASN1Primitive() {
        return Utils.toSequence(this.supportedSymmAlg, this.basePublicEncryptionKey);
    }
}
