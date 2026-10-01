package com.initech.x509;

import com.initech.asn1.ASN1Decoder;
import com.initech.asn1.ASN1Encoder;
import com.initech.asn1.ASN1Exception;
import com.initech.asn1.ASN1Type;
import java.security.cert.CRLException;
import java.security.cert.X509CRL;
import java.util.Enumeration;
import java.util.Vector;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class CRLs implements ASN1Type {
    private static final long serialVersionUID = -236116118091891012L;
    Vector crls = new Vector();

    public void add(X509CRL x509crl) {
        this.crls.addElement(x509crl);
    }

    public int size() {
        return this.crls.size();
    }

    public Enumeration elements() {
        return this.crls.elements();
    }

    public void clear() {
        this.crls.removeAllElements();
    }

    public Vector getAsVector() {
        return this.crls;
    }

    public X509CRL[] getCRLs() {
        if (this.crls.size() <= 0) {
            return null;
        }
        X509CRL[] x509crlArr = new X509CRL[this.crls.size()];
        for (int i = 0; i < this.crls.size(); i++) {
            x509crlArr[i] = (X509CRL) this.crls.elementAt(i);
        }
        return x509crlArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.asn1.ASN1Exception */
    public void decode(ASN1Decoder aSN1Decoder) throws ASN1Exception {
        this.crls.removeAllElements();
        int iDecodeSequenceOf = aSN1Decoder.decodeSequenceOf();
        while (!aSN1Decoder.endOf(iDecodeSequenceOf)) {
            try {
                this.crls.addElement(new X509CRLImpl(aSN1Decoder.decodeAnyAsByteArray()));
            } catch (CRLException e) {
                throw new ASN1Exception(e);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.asn1.ASN1Exception */
    public void encode(ASN1Encoder aSN1Encoder) throws ASN1Exception {
        int iEncodeSequenceOf = aSN1Encoder.encodeSequenceOf();
        for (int i = 0; i < this.crls.size(); i++) {
            try {
                aSN1Encoder.encodeAny(((X509CRL) this.crls.elementAt(i)).getEncoded());
            } catch (CRLException e) {
                throw new ASN1Exception(e);
            }
        }
        aSN1Encoder.endOf(iEncodeSequenceOf);
    }
}
