package com.initech.pkix.cmp.client;

import com.initech.asn1.useful.AlgorithmID;
import com.initech.asn1.useful.GeneralName;
import com.initech.cryptox.spec.PBEKeySpec;
import com.initech.cryptox.spec.PBEParameterSpec;
import com.initech.pkcs.pkcs8.EncryptedPrivateKeyInfo;
import com.initech.pkcs.pkcs8.PrivateKeyInfo;
import com.initech.pki.pkcs12.InitechPKCS12Provider;
import com.initech.pkix.cmp.CertRepMessage;
import com.initech.pkix.cmp.CertResponse;
import com.initech.pkix.cmp.ErrorMsgContent;
import com.initech.pkix.cmp.PKIHeader;
import com.initech.pkix.cmp.PKIMessage;
import com.initech.pkix.cmp.PKIStatusInfo;
import com.initech.pkix.cmp.RevRepContent;
import com.initech.pkix.cmp.client.transport.CMPTransport;
import com.initech.pkix.cmp.client.transport.CMPTransportFactory;
import com.initech.pkix.cmp.client.util.Assert;
import com.initech.pkix.cmp.client.util.URI;
import com.initech.pkix.cmp.crmf.control.CertId;
import com.initech.provider.crypto.InitechProvider;
import com.initech.provider.pkix.InitechPKIXProvider;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Enumeration;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PKICMP {
    public static final int CMP1999 = 1;
    public static final int CMP2000 = 2;
    public static final int CMPSignGate = 0;
    public static final int FOR_ENCYPTION = 2;
    public static final int FOR_SIGNATURE = 1;
    private KeyStore a;
    private URI b;
    private int c;

    static {
        Security.addProvider(new InitechProvider());
        Security.addProvider(new InitechPKCS12Provider());
        Security.addProvider(new InitechPKIXProvider());
    }

    public PKICMP(KeyStore keyStore, URI uri) throws CMPException {
        this(2, keyStore, uri);
    }

    public PKICMP(int i, KeyStore keyStore, URI uri) throws CMPException {
        this.a = keyStore;
        if (i != 1 && i != 2) {
            throw new CMPException(4, "version not supported");
        }
        this.c = i;
        this.b = uri;
    }

    public PKICMP(int i, URI uri) throws NoSuchAlgorithmException, CMPException, IOException, KeyStoreException, CertificateException, NoSuchProviderException {
        KeyStore keyStore = KeyStore.getInstance("PKCS12", "InitechPKCS12Provider");
        this.a = keyStore;
        keyStore.load(null, null);
        if (i != 1 && i != 2) {
            throw new CMPException(4, "version not supported");
        }
        this.c = i;
        this.b = uri;
    }

    public void requestIR(String str, String str2, String str3, String str4, String str5) throws CMPException, KeyStoreException {
        CMPContext cMPContext = new CMPContext(this.c);
        try {
            Assert.assertParam(str != null, "key engry alias is not specified");
            Assert.assertParam(str3 != null, "CA Name is not specified");
            Assert.assertParam(str4 != null, "reference value is not specified");
            Assert.assertParam(str5 != null, "authcode is not specified");
            Assert.assertParam(str2 != null, "key entry pass is not specified");
            cMPContext.setSenderKID(str4.getBytes());
            cMPContext.setAuthCode(str5.getBytes());
            cMPContext.setURI(this.b);
            try {
                PKIMessage pKIMessage = PKIMessageFormatter.format(cMPContext, 0);
                CMPTransport cMPTransport = CMPTransportFactory.getInstance().getCMPTransport(cMPContext);
                PKIMessage pKIMessageProcess = cMPTransport.process(pKIMessage);
                a(cMPContext, pKIMessageProcess, 1);
                CertRepMessage certRepMessage = (CertRepMessage) pKIMessageProcess.getContentBody();
                cMPContext.setCACertificates(certRepMessage.getCACertificates());
                if (certRepMessage.nOfResponses() != 1) {
                    throw new CMPException(1, "expected number of response is only one, but this time[" + certRepMessage.nOfResponses() + "]");
                }
                CertResponse certResponseResponseAt = certRepMessage.responseAt(0);
                a(certResponseResponseAt.getStatusInfo());
                cMPContext.setSignCertificate(certResponseResponseAt.getIssuedCert());
                int i = this.c;
                if (i == 1) {
                    cMPTransport.process(PKIMessageFormatter.format(cMPContext, 19));
                } else if (i == 2) {
                    a(cMPContext, cMPTransport.process(PKIMessageFormatter.format(cMPContext, 24)), 19);
                }
                cMPTransport.close();
                try {
                    this.a.setKeyEntry(str, cMPContext.getSignPrivKey(), str2.toCharArray(), new Certificate[]{cMPContext.getSignCertificate()});
                    for (int i2 = 0; i2 < cMPContext.nOfCACerts(); i2++) {
                        this.a.setCertificateEntry(str3, cMPContext.getCACertAt(i2));
                    }
                } catch (Exception e) {
                    throw new CMPException(3, "on saving private key and cert into keystore[" + e.toString() + "]");
                }
            } catch (CMPException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new CMPException(1, "on processing IR[" + e3.toString() + "]");
            }
        } catch (Exception e4) {
            throw new CMPException(4, e4.toString());
        }
    }

    public void requestIR(String str, String str2, String str3, String str4, String str5, int i) throws CMPException, KeyStoreException {
        CMPContext cMPContext = new CMPContext(this.c);
        try {
            Assert.assertParam(str != null, "key engry alias is not specified");
            Assert.assertParam(str3 != null, "CA Name is not specified");
            Assert.assertParam(str4 != null, "reference value is not specified");
            Assert.assertParam(str5 != null, "authcode is not specified");
            Assert.assertParam(str2 != null, "key entry pass is not specified");
            cMPContext.setSenderKID(str4.getBytes());
            cMPContext.setAuthCode(str5.getBytes());
            cMPContext.setURI(this.b);
            try {
                PKIMessage pKIMessage = PKIMessageFormatter.format(cMPContext, 0, i);
                CMPTransport cMPTransport = CMPTransportFactory.getInstance().getCMPTransport(cMPContext);
                PKIMessage pKIMessageProcess = cMPTransport.process(pKIMessage);
                a(cMPContext, pKIMessageProcess, 1);
                CertRepMessage certRepMessage = (CertRepMessage) pKIMessageProcess.getContentBody();
                cMPContext.setCACertificates(certRepMessage.getCACertificates());
                if (certRepMessage.nOfResponses() != 1) {
                    throw new CMPException(1, "expected number of response is only one, but this time[" + certRepMessage.nOfResponses() + "]");
                }
                CertResponse certResponseResponseAt = certRepMessage.responseAt(0);
                a(certResponseResponseAt.getStatusInfo());
                cMPContext.setSignCertificate(certResponseResponseAt.getIssuedCert());
                int i2 = this.c;
                if (i2 == 1) {
                    cMPTransport.process(PKIMessageFormatter.format(cMPContext, 19));
                } else if (i2 == 2) {
                    a(cMPContext, cMPTransport.process(PKIMessageFormatter.format(cMPContext, 24)), 19);
                }
                cMPTransport.close();
                try {
                    this.a.setKeyEntry(str, cMPContext.getSignPrivKey(), str2.toCharArray(), new Certificate[]{cMPContext.getSignCertificate()});
                    for (int i3 = 0; i3 < cMPContext.nOfCACerts(); i3++) {
                        this.a.setCertificateEntry(str3, cMPContext.getCACertAt(i3));
                    }
                } catch (Exception e) {
                    throw new CMPException(3, "on saving private key and cert into keystore[" + e.toString() + "]");
                }
            } catch (CMPException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new CMPException(1, "on processing IR[" + e3.toString() + "]");
            }
        } catch (Exception e4) {
            throw new CMPException(4, e4.toString());
        }
    }

    public void requestIR(String str, String str2, String str3, String str4, String str5, PublicKey publicKey, PrivateKey privateKey) throws CMPException, KeyStoreException {
        CMPContext cMPContext = new CMPContext(this.c);
        try {
            Assert.assertParam(str != null, "key engry alias is not specified");
            Assert.assertParam(str3 != null, "CA Name is not specified");
            Assert.assertParam(str4 != null, "reference value is not specified");
            Assert.assertParam(str5 != null, "authcode is not specified");
            Assert.assertParam(str2 != null, "key entry pass is not specified");
            cMPContext.setSenderKID(str4.getBytes());
            cMPContext.setAuthCode(str5.getBytes());
            cMPContext.setURI(this.b);
            try {
                PKIMessage pKIMessage = PKIMessageFormatter.format(cMPContext, 0, publicKey, privateKey);
                CMPTransport cMPTransport = CMPTransportFactory.getInstance().getCMPTransport(cMPContext);
                PKIMessage pKIMessageProcess = cMPTransport.process(pKIMessage);
                a(cMPContext, pKIMessageProcess, 1);
                CertRepMessage certRepMessage = (CertRepMessage) pKIMessageProcess.getContentBody();
                cMPContext.setCACertificates(certRepMessage.getCACertificates());
                if (certRepMessage.nOfResponses() != 1) {
                    throw new CMPException(1, "expected number of response is only one, but this time[" + certRepMessage.nOfResponses() + "]");
                }
                CertResponse certResponseResponseAt = certRepMessage.responseAt(0);
                a(certResponseResponseAt.getStatusInfo());
                cMPContext.setSignCertificate(certResponseResponseAt.getIssuedCert());
                int i = this.c;
                if (i == 1) {
                    cMPTransport.process(PKIMessageFormatter.format(cMPContext, 19));
                } else if (i == 2) {
                    a(cMPContext, cMPTransport.process(PKIMessageFormatter.format(cMPContext, 24)), 19);
                }
                cMPTransport.close();
                try {
                    this.a.setKeyEntry(str, cMPContext.getSignPrivKey(), str2.toCharArray(), new Certificate[]{cMPContext.getSignCertificate()});
                    for (int i2 = 0; i2 < cMPContext.nOfCACerts(); i2++) {
                        this.a.setCertificateEntry(str3, cMPContext.getCACertAt(i2));
                    }
                } catch (Exception e) {
                    throw new CMPException(3, "on saving private key and cert into keystore[" + e.toString() + "]");
                }
            } catch (CMPException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new CMPException(1, "on processing IR[" + e3.toString() + "]");
            }
        } catch (Exception e4) {
            throw new CMPException(4, e4.toString());
        }
    }

    public void requestCR(String str, String str2, int i) throws CMPException, KeyStoreException {
        CMPContext cMPContext = new CMPContext(this.c);
        cMPContext.setURI(this.b);
        a(cMPContext, str, str2);
        try {
            PKIMessage pKIMessage = PKIMessageFormatter.format(cMPContext, 2);
            CMPTransport cMPTransport = CMPTransportFactory.getInstance().getCMPTransport(cMPContext);
            PKIMessage pKIMessageProcess = cMPTransport.process(pKIMessage);
            a(cMPContext, pKIMessageProcess, 3);
            CertRepMessage certRepMessage = (CertRepMessage) pKIMessageProcess.getContentBody();
            if (certRepMessage.nOfResponses() != 1) {
                throw new CMPException(1, "expected number of response is only one, but this time[" + certRepMessage.nOfResponses() + "]");
            }
            CertResponse certResponseResponseAt = certRepMessage.responseAt(0);
            a(certResponseResponseAt.getStatusInfo());
            cMPContext.setSignCertificate(certResponseResponseAt.getIssuedCert());
            int i2 = this.c;
            if (i2 == 1) {
                cMPTransport.process(PKIMessageFormatter.format(cMPContext, 19));
            } else if (i2 == 2) {
                a(cMPContext, cMPTransport.process(PKIMessageFormatter.format(cMPContext, 24)), 19);
            }
            cMPTransport.close();
            try {
                this.a.setKeyEntry(str, cMPContext.getSignPrivKey(), str2.toCharArray(), new Certificate[]{cMPContext.getSignCertificate()});
            } catch (Exception e) {
                throw new CMPException(3, "on saving private key and cert into keystore[" + e.toString() + "]");
            }
        } catch (CMPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new CMPException(1, "on processing CR[" + e3.toString() + "]");
        }
    }

    public void requestKUR(String str, String str2) throws CMPException, KeyStoreException {
        CMPContext cMPContext = new CMPContext(this.c);
        cMPContext.setURI(this.b);
        a(cMPContext, str, str2);
        try {
            PKIMessage pKIMessage = PKIMessageFormatter.format(cMPContext, 7);
            CMPTransport cMPTransport = CMPTransportFactory.getInstance().getCMPTransport(cMPContext);
            PKIMessage pKIMessageProcess = cMPTransport.process(pKIMessage);
            a(cMPContext, pKIMessageProcess, 8);
            CertRepMessage certRepMessage = (CertRepMessage) pKIMessageProcess.getContentBody();
            if (certRepMessage.nOfResponses() != 1) {
                throw new CMPException(1, "expected number of response is only one, but this time[" + certRepMessage.nOfResponses() + "]");
            }
            CertResponse certResponseResponseAt = certRepMessage.responseAt(0);
            a(certResponseResponseAt.getStatusInfo());
            cMPContext.setSignCertificate(certResponseResponseAt.getIssuedCert());
            int i = this.c;
            if (i == 1) {
                cMPTransport.process(PKIMessageFormatter.format(cMPContext, 19));
            } else if (i == 2) {
                a(cMPContext, cMPTransport.process(PKIMessageFormatter.format(cMPContext, 24)), 19);
            }
            cMPTransport.close();
            try {
                this.a.setKeyEntry(str, cMPContext.getSignPrivKey(), str2.toCharArray(), new Certificate[]{cMPContext.getSignCertificate()});
            } catch (Exception e) {
                throw new CMPException(3, "on saving private key and cert into keystore[" + e.toString() + "]");
            }
        } catch (CMPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new CMPException(1, "on processing KUR[" + e3.toString() + "]");
        }
    }

    public void requestRR(String str, String str2) throws CMPException, KeyStoreException {
        CMPContext cMPContext = new CMPContext(this.c);
        cMPContext.setURI(this.b);
        a(cMPContext, str, str2);
        try {
            PKIMessage pKIMessageProcess = CMPTransportFactory.getInstance().getCMPTransport(cMPContext).process(PKIMessageFormatter.format(cMPContext, 11));
            a(cMPContext, pKIMessageProcess, 12);
            RevRepContent revRepContent = (RevRepContent) pKIMessageProcess.getContentBody();
            if (revRepContent.nOfStatuses() != 1 || revRepContent.nOfCertId() > 1 || revRepContent.nOfCRLs() > 1) {
                throw new CMPException(1, "expected number of PKIStatus was only one, but this time was[" + revRepContent.nOfStatuses() + "]");
            }
            a(revRepContent.getStatusAt(0));
            if (revRepContent.getCertIDAt(0) != null) {
                CertId certIDAt = revRepContent.getCertIDAt(0);
                X509Certificate x509Certificate = (X509Certificate) cMPContext.getOldSignCertificate();
                certIDAt.getSerial().equals(x509Certificate.getSerialNumber());
                if (!certIDAt.getIssuer().toString().equals(x509Certificate.getIssuerDN().getName())) {
                    System.err.println(certIDAt.getIssuer().toString() + " vs " + x509Certificate.getIssuerDN().getName());
                }
            }
            try {
                this.a.deleteEntry(str);
            } catch (Exception e) {
                throw new CMPException(3, "on deleting key and cert[" + e.toString() + "]");
            }
        } catch (CMPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new CMPException(1, "on processing RR[" + e3.toString() + "]");
        }
    }

    private void a(CMPContext cMPContext, PKIMessage pKIMessage, int i) throws CMPException {
        Object publicKey;
        PKIHeader header = pKIMessage.getHeader();
        if (header.getProtectionAlg().getAlg().equals("1.2.840.113533.7.66.13")) {
            publicKey = cMPContext.getAuthCode();
        } else {
            publicKey = cMPContext.getIssuerSignCert().getPublicKey();
        }
        try {
            if (!pKIMessage.verify(publicKey)) {
                throw new CMPException(1, "message verification failed");
            }
            if (cMPContext.getVersion() != header.getVersion()) {
                throw new CMPException(1, "PKIMessage version(pvno) mismatch");
            }
            if (!byteCompare(cMPContext.getTransactionID(), header.getTransacID())) {
                throw new CMPException(1, "transaction ID check failed");
            }
            if (!byteCompare(cMPContext.getSenderNonce(), header.getRecipNonce())) {
                throw new CMPException(1, "nonce check failed");
            }
            cMPContext.setRecipientNonce(header.getSenderNonce());
            if (pKIMessage.getContentType() != i) {
                if (pKIMessage.getContentType() == 23) {
                    a((ErrorMsgContent) pKIMessage.getContentBody());
                }
                throw new CMPException(1, "unexpected message body is received. we wanted [" + i + "] but received [" + pKIMessage.getContentType() + "]");
            }
        } catch (CMPException e) {
            throw e;
        } catch (Exception e2) {
            throw new CMPException(1, "message verification failed[" + e2.toString() + "]");
        }
    }

    protected static boolean byteCompare(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private static void a(ErrorMsgContent errorMsgContent) throws CMPException {
        String[] errorDetail = errorMsgContent.getErrorDetail();
        StringBuffer stringBuffer = new StringBuffer();
        if (errorDetail != null) {
            for (int i = 0; i < errorDetail.length; i++) {
                stringBuffer.append(errorDetail[i]);
                if (i != errorDetail.length - 1) {
                    stringBuffer.append(",");
                }
            }
        }
        throw new CMPException(1, "get error msg from server errorCode[" + errorMsgContent.getErrorCode() + "] errordetailes[" + stringBuffer.toString() + "]");
    }

    private static void a(PKIStatusInfo pKIStatusInfo) throws CMPException {
        int i;
        String str;
        if (pKIStatusInfo.getStatus() == 3) {
            throw new CMPException(1, "polling is not supported!");
        }
        if (pKIStatusInfo.getStatus() == 2) {
            if (pKIStatusInfo.hasFailInfo()) {
                i = 0;
                while (i < 27) {
                    if (pKIStatusInfo.isAReason(i)) {
                        break;
                    } else {
                        i++;
                    }
                }
                i = -1;
            } else {
                i = -1;
            }
            StringBuilder sb = new StringBuilder("server reject requeset message ");
            if (i == -1) {
                str = "";
            } else {
                str = "reason[" + i + "]";
            }
            sb.append(str);
            throw new CMPException(1, sb.toString());
        }
        if (pKIStatusInfo.getStatus() == 0 || pKIStatusInfo.getStatus() == 1) {
            return;
        }
        throw new CMPException(1, "this client doesn't support PKIStatus [" + pKIStatusInfo.getStatus() + "]");
    }

    private void a(CMPContext cMPContext, String str, String str2) throws CMPException, KeyStoreException {
        try {
            if (!this.a.isKeyEntry(str)) {
                throw new CMPException(3, "sender keyentry ailas is not key entry");
            }
            X509Certificate x509Certificate = (X509Certificate) this.a.getCertificate(str);
            cMPContext.setOldSignCertificate(x509Certificate);
            PublicKey publicKey = x509Certificate.getPublicKey();
            PrivateKey privateKey = (PrivateKey) this.a.getKey(str, str2.toCharArray());
            cMPContext.setSender(new GeneralName("DN:" + x509Certificate.getSubjectDN().getName()));
            cMPContext.setOldSignPubKey(publicKey);
            cMPContext.setOldSignPrivKey(privateKey);
            Enumeration<String> enumerationAliases = this.a.aliases();
            X509Certificate x509Certificate2 = null;
            while (true) {
                if (!enumerationAliases.hasMoreElements()) {
                    break;
                }
                String strNextElement = enumerationAliases.nextElement();
                if (this.a.isCertificateEntry(strNextElement)) {
                    x509Certificate2 = (X509Certificate) this.a.getCertificate(strNextElement);
                    if (x509Certificate2.getSubjectDN().equals(x509Certificate.getIssuerDN())) {
                        cMPContext.setIssuerSignCert(x509Certificate2);
                        break;
                    }
                }
            }
            if (x509Certificate2 == null) {
                throw new CMPException(3, "no issuer certs  exist");
            }
        } catch (CMPException e) {
            throw e;
        } catch (Exception e2) {
            throw new CMPException(3, "fail to retrive key pair from keystore[" + e2.toString() + "]");
        }
    }

    public byte[] getUserCert(String str) throws Exception {
        return ((X509Certificate) this.a.getCertificate(str)).getEncoded();
    }

    public byte[] getUesrPrivateKey(String str, String str2) throws Exception {
        return ((PrivateKey) this.a.getKey(str, str2.toCharArray())).getEncoded();
    }

    public byte[] getEncUserPrivateKey(String str, String str2, String str3) throws Exception {
        return getEncUserPrivateKey(str, str2, str3.toCharArray());
    }

    public byte[] getEncUserPrivateKey(String str, String str2, char[] cArr) throws Exception {
        PrivateKeyInfo privateKeyInfo = new PrivateKeyInfo((PrivateKey) this.a.getKey(str, str2.toCharArray()));
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        AlgorithmID algorithmID = new AlgorithmID("1.2.410.200004.1.15");
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("PBE");
        byte[] bArr = new byte[8];
        SecureRandom.getInstance("FIPS186-2Appendix3", "Initech").nextBytes(bArr);
        algorithmParameters.init((AlgorithmParameterSpec) new PBEParameterSpec(bArr, 2048));
        algorithmID.setParameter(algorithmParameters.getEncoded());
        return new EncryptedPrivateKeyInfo(privateKeyInfo, pBEKeySpec, algorithmID).getEncoded();
    }
}
