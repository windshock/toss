package org.bouncycastle.asn1;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class DLFactory {
    static final DLSequence EMPTY_SEQUENCE = new DLSequence();
    static final DLSet EMPTY_SET = new DLSet();

    DLFactory() {
    }

    static DLSequence createSequence(ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.size() <= 0 ? EMPTY_SEQUENCE : new DLSequence(aSN1EncodableVector);
    }

    static DLSet createSet(ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.size() <= 0 ? EMPTY_SET : new DLSet(aSN1EncodableVector);
    }
}
