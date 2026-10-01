package com.initech.pkcs.pkcs7;

import com.initech.asn1.useful.AlgorithmID;
import com.initech.cryptox.Cipher;
import com.initech.provider.crypto.spec.RSAOAEPParameterSpec;
import java.security.cert.X509Certificate;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class Sealer {
    private RecipientInfo a = new RecipientInfo();
    private X509Certificate b = null;

    public void encryptKey(byte[] bArr) throws PKCS7Exception {
        encryptKey(bArr, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.pkcs.pkcs7.PKCS7Exception */
    public void encryptKey(byte[] bArr, String str) throws PKCS7Exception {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a.getKeyEncryptionAlgorithm().getAlgName());
            if (str == null) {
                str = "";
            }
            sb.append(str);
            Cipher cipher = Cipher.getInstance(sb.toString(), "Initech");
            cipher.init(1, this.b.getPublicKey());
            this.a.setEncryptedKey(cipher.doFinal(bArr));
        } catch (Exception e) {
            throw new PKCS7Exception(e.toString());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.initech.pkcs.pkcs7.PKCS7Exception */
    public void encryptKey(byte[] bArr, String str, String str2) throws PKCS7Exception {
        try {
            if (str.equalsIgnoreCase("/ECB/PKCS1Padding")) {
                Cipher cipher = Cipher.getInstance(this.a.getKeyEncryptionAlgorithm().getAlgName() + str, "Initech");
                cipher.init(1, this.b.getPublicKey());
                this.a.setEncryptedKey(cipher.doFinal(bArr));
                return;
            }
            if (!str.equalsIgnoreCase("/ECB/OAEPPadding")) {
                Cipher cipher2 = Cipher.getInstance(this.a.getKeyEncryptionAlgorithm().getAlgName(), "Initech");
                cipher2.init(1, this.b.getPublicKey());
                this.a.setEncryptedKey(cipher2.doFinal(bArr));
            } else {
                Cipher cipher3 = Cipher.getInstance(this.a.getKeyEncryptionAlgorithm().getAlgName() + str, "Initech");
                cipher3.init(1, this.b.getPublicKey(), new RSAOAEPParameterSpec(str2, (byte[]) null));
                this.a.setEncryptedKey(cipher3.doFinal(bArr));
            }
        } catch (Exception e) {
            throw new PKCS7Exception(e.toString());
        }
    }

    public RecipientInfo getRecipientInfo() {
        return this.a;
    }

    public void setCertificate(X509Certificate x509Certificate) {
        this.a.setIssuerAndSerialNumber(x509Certificate);
        this.b = x509Certificate;
    }

    public void setKeyEncryptionAlgorithm(AlgorithmID algorithmID) {
        this.a.setKeyEncryptionAlgorithm(algorithmID);
    }
}
