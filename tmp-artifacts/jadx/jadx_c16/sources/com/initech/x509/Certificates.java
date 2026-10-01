package com.initech.x509;

import com.initech.asn1.ASN1Decoder;
import com.initech.asn1.ASN1Encoder;
import com.initech.asn1.ASN1Exception;
import com.initech.asn1.ASN1OID;
import com.initech.asn1.ASN1Tag;
import com.initech.asn1.ASN1Type;
import com.initech.asn1.DEREncoder;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.Vector;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class Certificates implements ASN1Type {
    private static final long serialVersionUID = 4520998841307391513L;
    protected Vector certs;

    public Certificates() {
        this.certs = new Vector();
    }

    public Certificates(X509Certificate[] x509CertificateArr) {
        this();
        add(x509CertificateArr);
    }

    public void add(Certificates certificates) {
        for (int i = 0; i < certificates.certs.size(); i++) {
            this.certs.addElement(certificates.certs.elementAt(i));
        }
    }

    public void add(X509Certificate x509Certificate) {
        this.certs.addElement(x509Certificate);
    }

    public void add(X509Certificate[] x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            this.certs.addElement(x509Certificate);
        }
    }

    public int size() {
        return this.certs.size();
    }

    public Enumeration elements() {
        return this.certs.elements();
    }

    public void clear() {
        this.certs.removeAllElements();
    }

    public X509Certificate elementAt(int i) {
        if (i < 0 || i >= this.certs.size()) {
            return null;
        }
        return (X509Certificate) this.certs.elementAt(i);
    }

    public Vector getAsVector() {
        return this.certs;
    }

    public X509Certificate[] getCertificates() {
        if (this.certs.size() <= 0) {
            return null;
        }
        X509Certificate[] x509CertificateArr = new X509Certificate[this.certs.size()];
        for (int i = 0; i < this.certs.size(); i++) {
            x509CertificateArr[i] = (X509Certificate) this.certs.elementAt(i);
        }
        return x509CertificateArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.asn1.ASN1Exception */
    public void decode(ASN1Decoder aSN1Decoder) throws ASN1Exception {
        this.certs.removeAllElements();
        int iDecodeSequenceOf = aSN1Decoder.decodeSequenceOf();
        while (!aSN1Decoder.endOf(iDecodeSequenceOf)) {
            try {
                this.certs.addElement(new X509CertImpl(aSN1Decoder.decodeAnyAsByteArray()));
            } catch (CertificateException e) {
                throw new ASN1Exception(e);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.asn1.ASN1Exception */
    public void encode(ASN1Encoder aSN1Encoder) throws ASN1Exception {
        int iEncodeSequenceOf = aSN1Encoder.encodeSequenceOf();
        for (int i = 0; i < this.certs.size(); i++) {
            try {
                aSN1Encoder.encodeAny(((X509Certificate) this.certs.elementAt(i)).getEncoded());
            } catch (CertificateEncodingException e) {
                throw new ASN1Exception(e);
            }
        }
        aSN1Encoder.endOf(iEncodeSequenceOf);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.asn1.ASN1Exception */
    public byte[] toPKCS7() throws ASN1Exception {
        DEREncoder dEREncoder = new DEREncoder();
        int iEncodeSequence = dEREncoder.encodeSequence(true);
        dEREncoder.encodeObjectIdentifier(new ASN1OID("1.2.840.113549.1.7.2"));
        int iEncodeExplicit = dEREncoder.encodeExplicit(ASN1Tag.makeExplicitTag(0), true);
        int iEncodeSequence2 = dEREncoder.encodeSequence(true);
        dEREncoder.encodeInteger(1);
        dEREncoder.endOf(dEREncoder.encodeSet());
        int iEncodeSequence3 = dEREncoder.encodeSequence(true);
        dEREncoder.encodeObjectIdentifier(new ASN1OID("1.2.840.113549.1.7.1"));
        dEREncoder.endOf(iEncodeSequence3);
        dEREncoder.nextIsImplicit(ASN1Tag.makeExplicitTag(0));
        int iEncodeSequenceOf = dEREncoder.encodeSequenceOf(true);
        for (int i = 0; i < this.certs.size(); i++) {
            try {
                dEREncoder.encodeAny(((X509Certificate) this.certs.elementAt(i)).getEncoded());
            } catch (CertificateEncodingException e) {
                throw new ASN1Exception(e);
            }
        }
        dEREncoder.endOf(iEncodeSequenceOf);
        dEREncoder.endOf(dEREncoder.encodeSet());
        dEREncoder.endOf(iEncodeSequence2);
        dEREncoder.endOf(iEncodeExplicit);
        dEREncoder.endOf(iEncodeSequence);
        dEREncoder.finish();
        return dEREncoder.toByteArray();
    }
}
