package com.initech.pkcs.pkcs7;

import com.initech.asn1.ASN1Exception;
import com.initech.asn1.ASN1OID;
import com.initech.asn1.DERDecoder;
import com.initech.asn1.useful.AlgorithmID;
import com.initech.asn1.useful.Attribute;
import com.initech.asn1.useful.IssuerAndSerialNumber;
import com.initech.cryptox.Cipher;
import com.initech.cryptox.spec.IvParameterSpec;
import com.initech.pki.util.ArrayComparator;
import com.initech.provider.crypto.rsa.RSAAutoSignature;
import com.initech.provider.crypto.spec.NonHashedSignatureSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Enumeration;
import javax.crypto.SecretKey;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class VerifyingSigner {
    public static byte[] SimpleSignatureData;
    private SignerInfo a;
    private X509Certificate b;
    private ASN1OID c;
    private boolean d;
    private Date e;
    private final boolean f = false;

    public VerifyingSigner(SignerInfo signerInfo) {
        this.a = signerInfo;
    }

    private boolean a(X509Certificate x509Certificate, SignerInfo signerInfo, byte[] bArr) throws NoSuchAlgorithmException, SignatureException, ASN1Exception, InvalidKeyException, NoSuchProviderException {
        if (x509Certificate.getPublicKey().getAlgorithm().indexOf("KCDSA") < 0) {
            return (bArr == null ? new RSAAutoSignature(x509Certificate.getPublicKey(), signerInfo.getDERAuthAttrs(), signerInfo.getEncryptedDigest(), signerInfo.getDigestAlgorithm().getAlgName()) : new RSAAutoSignature(x509Certificate.getPublicKey(), bArr, signerInfo.getEncryptedDigest(), signerInfo.getDigestAlgorithm().getAlgName())).verify();
        }
        Signature signature = Signature.getInstance(signerInfo.getDigestAlgorithm().getAlgName() + "withKCDSA", "Initech");
        signature.initVerify(x509Certificate.getPublicKey());
        if (bArr == null) {
            signature.update(signerInfo.getDERAuthAttrs());
        } else {
            signature.update(bArr);
        }
        return signature.verify(signerInfo.getEncryptedDigest());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.pkcs.pkcs7.PKCS7Exception */
    protected boolean Simple_verify(byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, PKCS7Exception, NoSuchProviderException {
        boolean zVerify;
        try {
            if (bArr == null) {
                this.d = true;
                SimpleSignatureData = this.a.getEncryptedDigest();
            } else {
                if (this.b.getPublicKey().getAlgorithm().indexOf("KCDSA") >= 0) {
                    Signature signature = Signature.getInstance(this.a.getDigestAlgorithm().getAlgName() + "withKCDSA", "Initech");
                    signature.initVerify(this.b.getPublicKey());
                    signature.update(bArr);
                    zVerify = signature.verify(this.a.getEncryptedDigest());
                } else {
                    zVerify = new RSAAutoSignature(this.b.getPublicKey(), bArr, this.a.getEncryptedDigest(), this.a.getDigestAlgorithm().getAlgName()).verify();
                }
                this.d = zVerify;
                SimpleSignatureData = this.a.getEncryptedDigest();
            }
            return this.d;
        } catch (Exception e) {
            throw new PKCS7Exception(e.toString());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.pkcs.pkcs7.PKCS7Exception */
    protected boolean Simple_verify(byte[] bArr, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, PKCS7Exception, NoSuchProviderException {
        try {
            if (this.b == null) {
                throw new PKCS7Exception("Certificate is null");
            }
            if (bArr == null) {
                this.d = true;
                SimpleSignatureData = this.a.getEncryptedDigest();
            } else {
                Signature signature = Signature.getInstance(this.a.getDigestAlgorithm().getAlgName() + "withRSA", str);
                signature.initVerify(this.b.getPublicKey());
                signature.update(bArr);
                this.d = signature.verify(this.a.getEncryptedDigest());
                SimpleSignatureData = this.a.getEncryptedDigest();
            }
            return this.d;
        } catch (Exception e) {
            throw new PKCS7Exception(e.toString());
        }
    }

    public boolean checkValidity(PKCS7TrustManager pKCS7TrustManager) throws PKCS7Exception {
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.pkcs.pkcs7.PKCS7Exception */
    protected boolean decryptAndVerify(byte[] bArr, SecretKey secretKey, AlgorithmID algorithmID) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, PKCS7Exception, NoSuchProviderException, InvalidAlgorithmParameterException {
        boolean zVerify;
        try {
            if (!this.a.hasAuthenticatedAttributes()) {
                Cipher cipher = Cipher.getInstance(algorithmID.getAlgName(), "Initech");
                if (algorithmID.getParameter() != null) {
                    cipher.init(2, secretKey, new IvParameterSpec(new DERDecoder(algorithmID.getParameter()).decodeOctetString()));
                } else {
                    cipher.init(2, secretKey);
                }
                byte[] bArrDoFinal = cipher.doFinal(this.a.getEncryptedDigest());
                Signature signature = Signature.getInstance("NonHashedRSASignature", "Initech");
                signature.setParameter(new NonHashedSignatureSpec(this.a.getDigestAlgorithm().getAlgName()));
                signature.initVerify(this.b);
                signature.update(bArr);
                zVerify = signature.verify(bArrDoFinal);
            } else {
                if (!this.a.getAttrContentType().equals(this.c) || ArrayComparator.compare(bArr, this.a.getAttrMessageDigest()) != 0) {
                    return false;
                }
                MessageDigest messageDigest = MessageDigest.getInstance(this.a.getDigestAlgorithm().getAlgName(), "Initech");
                messageDigest.update(this.a.getDERAuthAttrs());
                byte[] bArrDigest = messageDigest.digest();
                Cipher cipher2 = Cipher.getInstance(algorithmID.getAlgName(), "Initech");
                if (algorithmID.getParameter() != null) {
                    cipher2.init(2, secretKey, new IvParameterSpec(new DERDecoder(algorithmID.getParameter()).decodeOctetString()));
                } else {
                    cipher2.init(2, secretKey);
                }
                byte[] bArrDoFinal2 = cipher2.doFinal(this.a.getEncryptedDigest());
                Signature signature2 = Signature.getInstance("NonHashedRSASignature", "Initech");
                signature2.setParameter(new NonHashedSignatureSpec(this.a.getDigestAlgorithm().getAlgName()));
                signature2.initVerify(this.b);
                signature2.update(bArrDigest);
                zVerify = signature2.verify(bArrDoFinal2);
            }
            this.d = zVerify;
            return zVerify;
        } catch (Exception e) {
            throw new PKCS7Exception(e.toString());
        }
    }

    public byte[] getAttrMessageDigest() {
        try {
            return this.a.getAttrMessageDigest();
        } catch (PKCS7Exception unused) {
            return null;
        }
    }

    public Attribute getAuthenticatedAttribute(String str) {
        return this.a.getAuthenticatedAttribute(str);
    }

    public X509Certificate getCertificate() {
        return this.b;
    }

    public byte[] getDecryptedRandom() throws PKCS7Exception {
        return getDecryptedUnauthenticatedAttribute("1.3.6.1.4.1.7150.3.1", true);
    }

    public byte[] getDecryptedUnauthenticatedAttribute() throws PKCS7Exception {
        return getDecryptedUnauthenticatedAttribute("1.3.6.1.4.1.7150.3.2", false);
    }

    public byte[] getDecryptedUnauthenticatedAttribute(String str, boolean z) throws PKCS7Exception {
        byte[] unauthenticatedAttributeValue = this.a.getUnauthenticatedAttributeValue(str);
        if (unauthenticatedAttributeValue != null) {
            return this.a.doCipherUnauthenticatedAttribute(this.e, unauthenticatedAttributeValue, 2, z);
        }
        return null;
    }

    public AlgorithmID getDigestAlgorithm() {
        return this.a.getDigestAlgorithm();
    }

    public AlgorithmID getDigestEncryptionAlgorithm() {
        return this.a.getDigestEncryptionAlgorithm();
    }

    public IssuerAndSerialNumber getIssuerAndSerialNumber() {
        return this.a.getIssuerAndSerialNumber();
    }

    public byte[] getSignature() {
        return this.a.getEncryptedDigest();
    }

    public SignerInfo getSignerInfo() {
        return this.a;
    }

    public Date getSigningTime() throws PKCS7Exception {
        return this.e;
    }

    public byte[] getSimpleSignatureData() {
        return SimpleSignatureData;
    }

    public Attribute getUnauthenticatedAttribute(String str) {
        return this.a.getUnauthenticatedAttribute(str);
    }

    public boolean getVerifyResult() {
        return this.d;
    }

    public int getVersion() {
        return this.a.getVersion();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.pkcs.pkcs7.PKCS7Exception */
    protected void setCertificate(PKCS7KeyManager pKCS7KeyManager, Enumeration enumeration) throws PKCS7Exception {
        IssuerAndSerialNumber issuerAndSerialNumber = this.a.getIssuerAndSerialNumber();
        while (enumeration.hasMoreElements()) {
            X509Certificate x509Certificate = (X509Certificate) enumeration.nextElement();
            IssuerAndSerialNumber issuerAndSerialNumber2 = new IssuerAndSerialNumber();
            issuerAndSerialNumber2.set(x509Certificate);
            if (issuerAndSerialNumber2.equals(issuerAndSerialNumber)) {
                this.b = x509Certificate;
                return;
            }
        }
        X509Certificate certificate = pKCS7KeyManager.getCertificate(issuerAndSerialNumber);
        this.b = certificate;
        if (certificate == null) {
            throw new PKCS7Exception();
        }
    }

    protected void setContentType(ASN1OID asn1oid) {
        this.c = asn1oid;
    }

    public void setSignerInfo(SignerInfo signerInfo) {
        this.a = signerInfo;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.pkcs.pkcs7.PKCS7Exception */
    protected boolean verify(byte[] bArr) throws Exception {
        try {
            if (this.a.hasAuthenticatedAttributes()) {
                this.e = this.a.getSigningTime();
                ASN1OID attrContentType = this.a.getAttrContentType();
                ASN1OID asn1oid = this.c;
                if (asn1oid == null) {
                    throw new PKCS7Exception("contentType is null");
                }
                if (attrContentType != null && attrContentType.equals(asn1oid)) {
                    if (bArr == null) {
                        this.d = true;
                    } else {
                        byte[] attrMessageDigest = this.a.getAttrMessageDigest();
                        MessageDigest messageDigest = MessageDigest.getInstance(this.a.getDigestAlgorithm().getAlgName(), "Initech");
                        messageDigest.update(bArr);
                        byte[] bArrDigest = messageDigest.digest();
                        if (ArrayComparator.compare(bArr, attrMessageDigest) != 0 && ArrayComparator.compare(bArrDigest, attrMessageDigest) != 0) {
                            return false;
                        }
                        X509Certificate x509Certificate = this.b;
                        if (x509Certificate == null) {
                            throw new Exception("Cert is null");
                        }
                        this.d = a(x509Certificate, this.a, null);
                    }
                    SimpleSignatureData = this.a.getEncryptedDigest();
                }
                return false;
            }
            X509Certificate x509Certificate2 = this.b;
            if (x509Certificate2 == null) {
                throw new PKCS7Exception("Cert is null");
            }
            if (bArr == null) {
                this.d = true;
            } else {
                this.d = a(x509Certificate2, this.a, bArr);
            }
            SimpleSignatureData = this.a.getEncryptedDigest();
            return this.d;
        } catch (Exception e) {
            throw new PKCS7Exception(e.toString());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.pkcs.pkcs7.PKCS7Exception */
    protected boolean verify(byte[] bArr, String str) throws Exception {
        try {
            if (bArr == null) {
                this.d = true;
                SimpleSignatureData = this.a.getEncryptedDigest();
            } else {
                if (this.a.hasAuthenticatedAttributes()) {
                    this.e = this.a.getSigningTime();
                    ASN1OID attrContentType = this.a.getAttrContentType();
                    ASN1OID asn1oid = this.c;
                    if (asn1oid == null) {
                        throw new PKCS7Exception("contentType is null");
                    }
                    if (attrContentType != null && attrContentType.equals(asn1oid)) {
                        byte[] attrMessageDigest = this.a.getAttrMessageDigest();
                        MessageDigest messageDigest = MessageDigest.getInstance(this.a.getDigestAlgorithm().getAlgName(), "Initech");
                        messageDigest.update(bArr);
                        if (ArrayComparator.compare(messageDigest.digest(), attrMessageDigest) != 0) {
                            return false;
                        }
                        X509Certificate x509Certificate = this.b;
                        if (x509Certificate == null) {
                            throw new Exception("Cert is null");
                        }
                        this.d = new RSAAutoSignature(x509Certificate.getPublicKey(), this.a.getDERAuthAttrs(), this.a.getEncryptedDigest(), this.a.getDigestAlgorithm().getAlgName()).verify();
                        SimpleSignatureData = this.a.getEncryptedDigest();
                    }
                    return false;
                }
                X509Certificate x509Certificate2 = this.b;
                if (x509Certificate2 == null) {
                    throw new PKCS7Exception("Cert is null");
                }
                this.d = new RSAAutoSignature(x509Certificate2.getPublicKey(), bArr, this.a.getEncryptedDigest(), this.a.getDigestAlgorithm().getAlgName()).verify();
                SimpleSignatureData = this.a.getEncryptedDigest();
            }
            return this.d;
        } catch (Exception e) {
            throw new PKCS7Exception(e.toString());
        }
    }
}
