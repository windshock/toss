package com.initech.x509;

import com.initech.asn1.ASN1Decoder;
import com.initech.asn1.ASN1Exception;
import com.initech.asn1.ASN1Tag;

/* JADX INFO: Access modifiers changed from: protected */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public class X509CertificateFactory$dummyPKCS7 {
    Certificates certs = new Certificates();
    CRLs crls = new CRLs();
    final /* synthetic */ X509CertificateFactory this$0;

    protected X509CertificateFactory$dummyPKCS7(X509CertificateFactory x509CertificateFactory) {
        this.this$0 = x509CertificateFactory;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.asn1.ASN1Exception */
    public void decode(ASN1Decoder aSN1Decoder, int i) throws ASN1Exception {
        int iDecodeSequence = aSN1Decoder.decodeSequence();
        if ("1.2.840.113549.1.7.2".equals(aSN1Decoder.decodeObjectIdentifier().get())) {
            int iDecodeExplicit = aSN1Decoder.decodeExplicit(ASN1Tag.makeContextTag(0));
            int iDecodeSequence2 = aSN1Decoder.decodeSequence();
            aSN1Decoder.skipNextTag();
            aSN1Decoder.skipNextTag();
            aSN1Decoder.skipNextTag();
            if (!aSN1Decoder.nextIsOptional(ASN1Tag.makeExplicitTag(0))) {
                if (i == 0) {
                    aSN1Decoder.nextIsImplicit(ASN1Tag.makeContextTag(0));
                    this.certs.decode(aSN1Decoder);
                } else {
                    aSN1Decoder.skipNextTag();
                }
            }
            if (!aSN1Decoder.nextIsOptional(ASN1Tag.makeExplicitTag(1))) {
                if (i == 1) {
                    aSN1Decoder.nextIsImplicit(ASN1Tag.makeExplicitTag(1));
                    this.crls.decode(aSN1Decoder);
                } else {
                    aSN1Decoder.skipNextTag();
                }
            }
            aSN1Decoder.skipNextTag();
            aSN1Decoder.endOf(iDecodeSequence2);
            aSN1Decoder.endOf(iDecodeExplicit);
            aSN1Decoder.endOf(iDecodeSequence);
            return;
        }
        throw new ASN1Exception("no Certificates, Crl found");
    }
}
