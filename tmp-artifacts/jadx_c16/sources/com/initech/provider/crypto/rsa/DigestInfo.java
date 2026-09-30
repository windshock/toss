package com.initech.provider.crypto.rsa;

import com.initech.asn1.ASN1Decoder;
import com.initech.asn1.ASN1Encoder;
import com.initech.asn1.ASN1Exception;
import com.initech.asn1.DERDecoder;
import com.initech.asn1.useful.ASN1Object;
import com.initech.asn1.useful.AlgorithmID;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class DigestInfo extends ASN1Object {
    private static final long serialVersionUID = -1015747821323295308L;
    private AlgorithmID digestAlg = new AlgorithmID();
    private byte[] digest = null;

    public DigestInfo() {
    }

    public DigestInfo(String str, byte[] bArr) {
        setDigestAlgorithm(str);
        setDigest(bArr);
    }

    public DigestInfo(byte[] bArr) throws ASN1Exception {
        decode(new DERDecoder(bArr));
        ((ASN1Object) this).encoded = (byte[]) bArr.clone();
        ((ASN1Object) this).modified = false;
    }

    public void setDigestAlgorithm(String str) {
        this.digestAlg.setAlgorithm(str);
        this.digestAlg.setParameter((byte[]) null);
        this.digestAlg.omitParameter(false);
    }

    public void setDigest(byte[] bArr) {
        ((ASN1Object) this).modified = true;
        this.digest = bArr;
    }

    public String getDigestAlgorithm() {
        return this.digestAlg.getAlgName();
    }

    public byte[] getDigest() {
        return this.digest;
    }

    public void encode(ASN1Encoder aSN1Encoder) throws ASN1Exception {
        int iEncodeSequence = aSN1Encoder.encodeSequence();
        this.digestAlg.encode(aSN1Encoder);
        aSN1Encoder.encodeOctetString(this.digest);
        aSN1Encoder.endOf(iEncodeSequence);
    }

    public void decode(ASN1Decoder aSN1Decoder) throws ASN1Exception {
        int iDecodeSequence = aSN1Decoder.decodeSequence();
        this.digestAlg.decode(aSN1Decoder);
        this.digest = aSN1Decoder.decodeOctetString();
        aSN1Decoder.endOf(iDecodeSequence);
    }

    public byte[] getEncoded() {
        try {
            return super.getEncoded();
        } catch (Exception unused) {
            return null;
        }
    }
}
