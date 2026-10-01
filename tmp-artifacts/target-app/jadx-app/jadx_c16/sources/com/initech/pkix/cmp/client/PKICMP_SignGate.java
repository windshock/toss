package com.initech.pkix.cmp.client;

import com.initech.asn1.ASN1OID;
import com.initech.asn1.DEREncoder;
import com.initech.asn1.useful.AlgorithmID;
import com.initech.asn1.useful.GeneralName;
import com.initech.cryptox.spec.PBEKeySpec;
import com.initech.cryptox.spec.PBEParameterSpec;
import com.initech.pkcs.pkcs8.EncryptedPrivateKeyInfo;
import com.initech.pkcs.pkcs8.PrivateKeyInfo;
import com.initech.pki.pkcs12.InitechPKCS12Provider;
import com.initech.pkix.cmp.CertRepMessage;
import com.initech.pkix.cmp.CertResponse;
import com.initech.pkix.cmp.CertifiedKeyPair;
import com.initech.pkix.cmp.ErrorMsgContent;
import com.initech.pkix.cmp.GeneralMessage;
import com.initech.pkix.cmp.KeyRecRepContent;
import com.initech.pkix.cmp.PKIHeader;
import com.initech.pkix.cmp.PKIMessage;
import com.initech.pkix.cmp.PKIStatusInfo;
import com.initech.pkix.cmp.client.transport.CMPTransport;
import com.initech.pkix.cmp.client.transport.CMPTransportFactory;
import com.initech.pkix.cmp.client.util.PKIMessageDump;
import com.initech.pkix.cmp.client.util.URI;
import com.initech.pkix.cmp.crmf.EncryptedValue;
import com.initech.pkix.cmp.util.x509CertificateInfo;
import com.initech.provider.crypto.InitechProvider;
import com.initech.provider.pkix.InitechPKIXProvider;
import com.initech.x509.X509CertImpl;
import com.initech.x509.extensions.SubjectKeyIdentifier;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import java.util.Hashtable;
import java.util.Vector;
import javax.crypto.BadPaddingException;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PKICMP_SignGate {
    public static final int CMP1999 = 1;
    public static final int CMP2000 = 2;
    public static final int GET_YESSIGN_CA_CERT = 1;
    public static final int REQUEST_KUR = 2;
    public static final int SIGNGATECMP = 0;
    private static String a = "_enc";
    private static String k;
    private KeyStore b;
    private URI c;
    private int d;
    private Hashtable e;
    private int f;
    private String g;
    private byte[] h;
    private CMPTransportFactory i;
    private CMPTransport j;

    static {
        Security.addProvider(new InitechProvider());
        Security.addProvider(new InitechPKCS12Provider());
        Security.addProvider(new InitechPKIXProvider());
        k = "km_key_gen=users";
    }

    public PKICMP_SignGate(KeyStore keyStore, URI uri) throws CMPException {
        this(1, keyStore, uri);
    }

    public PKICMP_SignGate(URI uri) throws CMPException, NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException {
        this(1, uri);
    }

    public PKICMP_SignGate(int i, KeyStore keyStore, URI uri) throws CMPException {
        this.e = new Hashtable();
        this.f = -1;
        this.g = "";
        this.h = null;
        this.i = CMPTransportFactory.getInstance();
        this.j = null;
        this.b = keyStore;
        this.d = i;
        this.c = uri;
    }

    public PKICMP_SignGate(int i, URI uri) throws NoSuchAlgorithmException, CMPException, IOException, KeyStoreException, CertificateException, NoSuchProviderException {
        this.e = new Hashtable();
        this.f = -1;
        this.g = "";
        this.h = null;
        this.i = CMPTransportFactory.getInstance();
        this.j = null;
        KeyStore keyStore = KeyStore.getInstance("PKCS12", "InitechPKCS12Provider");
        this.b = keyStore;
        keyStore.load(null, null);
        if (i != 1) {
            throw new CMPException(4, (short) 4000, (short) 105, (short) 100, "version not supported");
        }
        this.d = i;
        this.c = uri;
    }

    public void initKeyStore(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) throws Exception {
        initKeyStore(str, str2, str3, str4, str5, str6, str7, str8.toCharArray(), str9, str10);
    }

    public void initKeyStore(String str, String str2, String str3, String str4, String str5, String str6, String str7, char[] cArr, String str8, String str9) throws Exception {
        initKeyStore(str, str2, str3, str4, a(str5, cArr), str6, a(str7, cArr), cArr, str8, str9);
    }

    public void initKeyStore(String str, String str2, String str3, String str4, PrivateKey privateKey, String str5, PrivateKey privateKey2, char[] cArr, String str6, String str7) throws Exception {
        initKeyStore(str, str2, str3, x509CertificateInfo.loadCertificateFromFile(str4), privateKey, (str2 == null || str3 == null) ? x509CertificateInfo.loadCertificateFromFile(str5) : null, privateKey2, cArr, str6, str7);
    }

    public void initKeyStore(String str, String str2, String str3, Certificate certificate, PrivateKey privateKey, Certificate certificate2, PrivateKey privateKey2, char[] cArr, String str4, String str5) throws Exception {
        if (str2 != null && str3 != null) {
            this.b.setCertificateEntry(str, x509CertificateInfo.loadCertificate(str2.getBytes()));
            this.b.setCertificateEntry(str + "_enc", x509CertificateInfo.loadCertificate(str3.getBytes()));
        } else {
            this.b.setKeyEntry(str4 + "_enc", privateKey2, str5.toCharArray(), new Certificate[]{certificate2});
        }
        this.b.setKeyEntry(str4, privateKey, str5.toCharArray(), new Certificate[]{certificate});
    }

    public void requestIR(String str, String str2, String str3, String str4, String str5, String str6, int i) throws CMPException, KeyStoreException {
        CMPContext cMPContext = new CMPContext(this.d);
        a(cMPContext, this.b, str, str2, str4);
        GeneralName generalName = new GeneralName();
        generalName.set(1, " ");
        GeneralName generalName2 = new GeneralName();
        generalName2.set(1, " ");
        cMPContext.setSender(generalName);
        cMPContext.setRecipient(generalName2);
        cMPContext.setSenderKID(str5.getBytes());
        cMPContext.setAuthCode(str6.getBytes());
        cMPContext.setURI(this.c);
        cMPContext.setRequestCertNum(i);
        cMPContext.setIdn(str3);
        cMPContext.setKeysize(this.f);
        cMPContext.setSignAlgorithm(this.g);
        cMPContext.setFreeText(this.e);
        try {
            PKIMessage pKIMessage = PKIMessageFormatter_SignGate.format(cMPContext, 0);
            CMPTransportFactory cMPTransportFactory = CMPTransportFactory.getInstance();
            if (this.j == null) {
                this.j = cMPTransportFactory.getCMPTransport(cMPContext);
            }
            PKIMessage pKIMessageProcess = this.j.process(pKIMessage);
            PKIMessageDump.dumpFile(pKIMessageProcess, "ip_signgate.dump");
            a(cMPContext, pKIMessageProcess, 1);
            CertRepMessage certRepMessage = (CertRepMessage) pKIMessageProcess.getContentBody();
            if (certRepMessage.nOfResponses() != cMPContext.getRequestCertNum()) {
                throw new CMPException(2, (short) 2004, (short) 105, CMPException.METHOD_requestIR, "expected number of response is only one, but this time[" + certRepMessage.nOfResponses() + "]");
            }
            CertResponse certResponseResponseAt = certRepMessage.responseAt(0);
            a(certResponseResponseAt.getStatusInfo());
            cMPContext.setSignCertificate(certResponseResponseAt.getIssuedCert());
            if (cMPContext.getRequestCertNum() == 2) {
                CertResponse certResponseResponseAt2 = certRepMessage.responseAt(1);
                a(certResponseResponseAt2.getStatusInfo());
                EncryptedValue encryptedCert = certResponseResponseAt2.getCertifiedKeyPair().getEncryptedCert();
                DEREncoder dEREncoder = new DEREncoder();
                dEREncoder.encodeOctetString("01234567".getBytes());
                encryptedCert.setSymmAlg(new AlgorithmID("DESofb", dEREncoder.toByteArray()));
                encryptedCert.setPadding("PKCS1Padding");
                this.h = encryptedCert.getData(cMPContext.getEncPrivKey());
                cMPContext.setEncCertificate(new X509CertImpl(this.h));
            }
            this.j.process(PKIMessageFormatter_SignGate.format(cMPContext, 19));
            this.j.close();
            try {
                this.b.setKeyEntry(str, cMPContext.getSignPrivKey(), str2.toCharArray(), new Certificate[]{cMPContext.getSignCertificate()});
                if (cMPContext.getRequestCertNum() == 2) {
                    Certificate[] certificateArr = {cMPContext.getEncCertificate()};
                    PrivateKey encPrivKey = cMPContext.getEncPrivKey();
                    this.b.setKeyEntry(str + a, encPrivKey, str2.toCharArray(), certificateArr);
                }
            } catch (Exception e) {
                throw new CMPException(3, (short) 3001, (short) 105, CMPException.METHOD_requestIR, "on saving private key and cert into keystore[" + e.toString() + "]");
            }
        } catch (CMPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new CMPException(1, (short) 1005, (short) 105, CMPException.METHOD_requestIR, "on processing IR[" + e3.toString() + "]");
        }
    }

    public void requestKRR(String str, String str2, String str3, String str4, String str5, String str6, int i) throws CMPException, KeyStoreException {
        CMPContext cMPContext = new CMPContext(this.d);
        a(cMPContext, this.b, str, str2, str4);
        cMPContext.setSenderKID(str5.getBytes());
        cMPContext.setAuthCode(str6.getBytes());
        cMPContext.setURI(this.c);
        cMPContext.setRequestCertNum(i);
        cMPContext.setIdn(str3);
        cMPContext.setKeysize(this.f);
        cMPContext.setSignAlgorithm(this.g);
        cMPContext.setFreeText(this.e);
        try {
            PKIMessage pKIMessage = PKIMessageFormatter_SignGate.format(cMPContext, 9);
            CMPTransportFactory cMPTransportFactory = CMPTransportFactory.getInstance();
            if (this.j == null) {
                this.j = cMPTransportFactory.getCMPTransport(cMPContext);
            }
            PKIMessage pKIMessageProcess = this.j.process(pKIMessage);
            PKIMessageDump.dumpFile(pKIMessageProcess, "krp_signgate.dump");
            a(cMPContext, pKIMessageProcess, 10);
            KeyRecRepContent keyRecRepContent = (KeyRecRepContent) pKIMessageProcess.getContentBody();
            a(keyRecRepContent.getStatusInfo());
            cMPContext.setSignCertificate(keyRecRepContent.getCertificate());
            GeneralName generalName = new GeneralName();
            generalName.set(1, " ");
            GeneralName generalName2 = new GeneralName();
            generalName2.set(1, " ");
            cMPContext.setSender(generalName);
            cMPContext.setRecipient(generalName2);
            if (cMPContext.getRequestCertNum() == 2) {
                EncryptedValue encryptedCert = ((CertifiedKeyPair) keyRecRepContent.keyHistorys().nextElement()).getEncryptedCert();
                DEREncoder dEREncoder = new DEREncoder();
                dEREncoder.encodeOctetString("01234567".getBytes());
                encryptedCert.setSymmAlg(new AlgorithmID("DESofb", dEREncoder.toByteArray()));
                encryptedCert.setPadding("PKCS1Padding");
                this.h = encryptedCert.getData(cMPContext.getEncPrivKey());
                cMPContext.setEncCertificate(new X509CertImpl(this.h));
            }
            this.j.process(PKIMessageFormatter_SignGate.format(cMPContext, 19));
            this.j.close();
            try {
                this.b.setKeyEntry(str, cMPContext.getSignPrivKey(), str2.toCharArray(), new Certificate[]{cMPContext.getSignCertificate()});
                if (cMPContext.getRequestCertNum() == 2) {
                    Certificate[] certificateArr = {cMPContext.getEncCertificate()};
                    PrivateKey encPrivKey = cMPContext.getEncPrivKey();
                    this.b.setKeyEntry(str + a, encPrivKey, str2.toCharArray(), certificateArr);
                }
            } catch (Exception e) {
                throw new CMPException(1, (short) 3001, (short) 105, CMPException.METHOD_requestKRR, "on saving private key and cert into keystore[" + e.toString() + "]");
            }
        } catch (CMPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new CMPException(1, (short) 1009, (short) 105, CMPException.METHOD_requestKRR, "on processing KRR[" + e3.toString() + "]");
        }
    }

    public void requestKUR(String str, String str2, String str3, int i) throws CMPException, KeyStoreException {
        CMPContext cMPContext = new CMPContext(this.d);
        cMPContext.setURI(this.c);
        cMPContext.setRequestCertNum(i);
        cMPContext.setIdn(str3);
        a(cMPContext, this.b, str, str2, null);
        try {
            PKIMessage pKIMessage = PKIMessageFormatter_SignGate.format(cMPContext, 7);
            CMPTransportFactory cMPTransportFactory = CMPTransportFactory.getInstance();
            if (this.j == null) {
                this.j = cMPTransportFactory.getCMPTransport(cMPContext);
            }
            PKIMessage pKIMessageProcess = this.j.process(pKIMessage);
            PKIMessageDump.dumpFile(pKIMessageProcess, "kup_signgate.dump");
            a(cMPContext, pKIMessageProcess, 8);
            CertRepMessage certRepMessage = (CertRepMessage) pKIMessageProcess.getContentBody();
            if (certRepMessage.nOfResponses() != cMPContext.getRequestCertNum()) {
                throw new CMPException(1, "expected number of response is " + cMPContext.getRequestCertNum() + ", but this time[" + certRepMessage.nOfResponses() + "]");
            }
            CertResponse certResponseResponseAt = certRepMessage.responseAt(0);
            a(certResponseResponseAt.getStatusInfo());
            cMPContext.setSignCertificate(certResponseResponseAt.getIssuedCert());
            if (cMPContext.getRequestCertNum() == 2) {
                CertResponse certResponseResponseAt2 = certRepMessage.responseAt(1);
                a(certResponseResponseAt2.getStatusInfo());
                EncryptedValue encryptedCert = certResponseResponseAt2.getCertifiedKeyPair().getEncryptedCert();
                DEREncoder dEREncoder = new DEREncoder();
                dEREncoder.encodeOctetString("01234567".getBytes());
                encryptedCert.setSymmAlg(new AlgorithmID("DESofb", dEREncoder.toByteArray()));
                encryptedCert.setPadding("PKCS1Padding");
                this.h = encryptedCert.getData(cMPContext.getEncPrivKey());
                cMPContext.setEncCertificate(new X509CertImpl(this.h));
            }
            this.j.process(PKIMessageFormatter_SignGate.format(cMPContext, 19));
            this.j.close();
            try {
                this.b.setKeyEntry(str, cMPContext.getSignPrivKey(), str2.toCharArray(), new Certificate[]{cMPContext.getSignCertificate()});
                if (cMPContext.getRequestCertNum() == 2) {
                    Certificate[] certificateArr = {cMPContext.getEncCertificate()};
                    PrivateKey encPrivKey = cMPContext.getEncPrivKey();
                    this.b.setKeyEntry(str + a, encPrivKey, str2.toCharArray(), certificateArr);
                }
            } catch (Exception e) {
                throw new CMPException(3, "on saving private key and cert into keystore[" + e.toString() + "]");
            }
        } catch (CMPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new CMPException(1, "on processing KUR[" + e3.toString() + "]");
        }
    }

    public int requestGetCACert(String str, String str2, String str3) throws CMPException {
        Vector vector = new Vector();
        vector.add(str);
        vector.add(str2);
        vector.add(str3);
        return ((Integer) a(1, vector).elementAt(0)).intValue();
    }

    public int requestPreKUR(String str, String str2) throws CMPException {
        Vector vector = new Vector();
        vector.add(str);
        vector.add(str2);
        return ((Integer) a(2, vector).elementAt(0)).intValue();
    }

    private Vector a(int i, Vector vector) throws CMPException, KeyStoreException {
        CMPContext cMPContext = new CMPContext(this.d);
        cMPContext.setURI(this.c);
        GeneralName generalName = new GeneralName();
        GeneralName generalName2 = new GeneralName();
        int i2 = 2;
        if (i == 1) {
            String str = (String) vector.elementAt(0);
            byte[] bytes = ((String) vector.elementAt(1)).getBytes();
            byte[] bytes2 = ((String) vector.elementAt(2)).getBytes();
            generalName.set(1, " ");
            generalName2.set(1, " ");
            cMPContext.setSender(generalName);
            cMPContext.setRecipient(generalName2);
            cMPContext.setSenderKID(bytes);
            cMPContext.setAuthCode(bytes2);
            cMPContext.setCAAlias(str);
        } else if (i == 2) {
            String str2 = (String) vector.elementAt(0);
            String str3 = (String) vector.elementAt(1);
            generalName.set(1, " ");
            generalName2.set(1, " ");
            cMPContext.setSender(generalName);
            cMPContext.setRecipient(generalName2);
            a(cMPContext, this.b, str2, str3, null);
            cMPContext.setSenderKID(Integer.toString(((X509Certificate) cMPContext.getOldSignCertificate()).getSerialNumber().intValue()).getBytes());
        } else {
            throw new CMPException(4, (short) 4001, (short) 105, (short) 102, "not supported type");
        }
        cMPContext.setGENMType(i);
        try {
            PKIMessage pKIMessage = PKIMessageFormatter_SignGate.format(cMPContext, 21);
            CMPTransportFactory cMPTransportFactory = CMPTransportFactory.getInstance();
            if (this.j == null) {
                this.j = cMPTransportFactory.getCMPTransport(cMPContext);
            }
            PKIMessage pKIMessageProcess = this.j.process(pKIMessage);
            parseFreeText(pKIMessageProcess.getHeader().getFreeText().toString());
            PKIMessageDump.dumpFile(pKIMessageProcess, "genp_signgate.dump");
            a(cMPContext, pKIMessageProcess, 22);
            GeneralMessage generalMessage = (GeneralMessage) pKIMessageProcess.getContentBody();
            Certificate x509CertImpl = null;
            if (i != 1 && i != 2) {
                return null;
            }
            try {
                String[] allTexts = pKIMessageProcess.getHeader().getFreeText().getAllTexts();
                Vector vector2 = new Vector();
                int i3 = 0;
                while (true) {
                    if (i3 >= allTexts.length) {
                        i2 = 1;
                        break;
                    }
                    if (allTexts[i3].indexOf(k) != -1) {
                        break;
                    }
                    i3++;
                }
                vector2.add(new Integer(i2));
                for (int i4 = 0; i4 < generalMessage.size(); i4++) {
                    ASN1OID typeIdAt = generalMessage.getTypeIdAt(i4);
                    byte[] valueAt = generalMessage.getValueAt(i4);
                    if (typeIdAt.getName().equals("caProtEncCert")) {
                        x509CertImpl = new X509CertImpl(valueAt);
                    }
                }
                if (cMPContext.getCAAlias() == null) {
                    cMPContext.setCAAlias("caCertAlias");
                }
                if (x509CertImpl != null) {
                    try {
                        this.b.setCertificateEntry(cMPContext.getCAAlias() + "_enc", x509CertImpl);
                        return vector2;
                    } catch (Exception e) {
                        throw new CMPException(3, (short) 3000, (short) 105, (short) 102, "on saving ca certs[" + e.toString() + "]");
                    }
                }
                throw new CMPException(1, (short) 1006, (short) 105, (short) 102, "not all ca cert are received");
            } catch (CMPException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new CMPException(1, (short) 1007, (short) 105, (short) 102, "error on processing GENM[" + e3.toString() + "]");
            }
        } catch (CMPException e4) {
            throw e4;
        } catch (Exception e5) {
            throw new CMPException(1, "on processing IR[" + e5.toString() + "]");
        }
    }

    private void a(CMPContext cMPContext, PKIMessage pKIMessage, int i) throws CMPException {
        Object publicKey;
        PKIHeader header = pKIMessage.getHeader();
        if (pKIMessage.getContentType() != i) {
            if (pKIMessage.getContentType() == 23) {
                a((ErrorMsgContent) pKIMessage.getContentBody());
            }
            throw new CMPException(6, (short) 2001, (short) 105, (short) 105, "unexpected message body is received. we wanted [" + i + "] but received [" + pKIMessage.getContentType() + "]");
        }
        if (header.getProtectionAlg() == null) {
            return;
        }
        if (header.getProtectionAlg().getAlg().equals("1.2.840.113533.7.66.13")) {
            publicKey = cMPContext.getAuthCode();
        } else {
            publicKey = cMPContext.getIssuerEncCert().getPublicKey();
        }
        int i2 = 0;
        try {
            if (i == 10) {
                KeyRecRepContent keyRecRepContent = (KeyRecRepContent) pKIMessage.getContentBody();
                if (keyRecRepContent.getStatusInfo().getStatus() == 2) {
                    String[] allTexts = keyRecRepContent.getStatusInfo().getStatusString().getAllTexts();
                    StringBuffer stringBuffer = new StringBuffer();
                    while (i2 < allTexts.length) {
                        stringBuffer.append(allTexts[i2]);
                        i2++;
                    }
                    throw new CMPException(6, (short) 2003, (short) 105, (short) 105, "[" + stringBuffer.toString() + "]");
                }
                if (!pKIMessage.verify(publicKey)) {
                    throw new CMPException(6, (short) 1003, (short) 105, (short) 105, "message verification failed");
                }
            } else {
                CertRepMessage certRepMessage = (CertRepMessage) pKIMessage.getContentBody();
                if (certRepMessage.responseAt(0).getStatus() == 2) {
                    String[] allTexts2 = certRepMessage.responseAt(0).getStatusInfo().getStatusString().getAllTexts();
                    StringBuffer stringBuffer2 = new StringBuffer();
                    while (i2 < allTexts2.length) {
                        stringBuffer2.append(allTexts2[i2]);
                        i2++;
                    }
                    throw new CMPException(6, (short) 2003, (short) 105, (short) 105, "[" + stringBuffer2.toString() + "]");
                }
                if (!pKIMessage.verify(publicKey)) {
                    throw new CMPException(6, (short) 1003, (short) 105, (short) 105, "message verification failed");
                }
            }
            if (!byteCompare(cMPContext.getSenderNonce(), header.getRecipNonce())) {
                throw new CMPException(6, (short) 1004, (short) 105, (short) 105, "nonce check failed");
            }
            cMPContext.setRecipientNonce(header.getSenderNonce());
        } catch (CMPException e) {
            throw e;
        } catch (Exception e2) {
            throw new CMPException(6, (short) 1011, (short) 105, (short) 105, "message verification failed[" + e2.toString() + "]");
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
        throw new CMPException(6, (short) 2003, (short) 105, CMPException.METHOD_throwError, "CA ErrorCode[" + errorMsgContent.getErrorCode() + "]\n" + stringBuffer.toString());
    }

    private static void a(PKIStatusInfo pKIStatusInfo) throws CMPException {
        int i;
        String str;
        if (pKIStatusInfo.getStatus() == 3) {
            throw new CMPException(1, (short) 1008, (short) 105, CMPException.METHOD_checkPKIStatusInfo, "polling is not supported!");
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
            throw new CMPException(1, (short) 1008, (short) 105, CMPException.METHOD_checkPKIStatusInfo, sb.toString());
        }
        if (pKIStatusInfo.getStatus() == 0) {
            return;
        }
        throw new CMPException(1, (short) 1008, (short) 105, CMPException.METHOD_checkPKIStatusInfo, "this client doesn't support PKIStatus [" + pKIStatusInfo.getStatus() + "]");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006e A[Catch: Exception -> 0x0199, CMPException -> 0x01b7, TryCatch #2 {CMPException -> 0x01b7, Exception -> 0x0199, blocks: (B:4:0x0009, B:6:0x0020, B:8:0x0026, B:10:0x003d, B:29:0x018e, B:11:0x005e, B:12:0x0065, B:13:0x0066, B:14:0x006d, B:15:0x006e, B:18:0x0076, B:19:0x00c8, B:21:0x00ce, B:23:0x00da, B:25:0x011a, B:26:0x0138, B:28:0x014f, B:31:0x0191, B:32:0x0198), top: B:38:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(CMPContext cMPContext, KeyStore keyStore, String str, String str2, String str3) throws CMPException, KeyStoreException {
        if (str3 != null) {
            try {
                if (keyStore.isCertificateEntry(str3 + a)) {
                    if (keyStore.isKeyEntry(str3)) {
                        throw new CMPException(3, "this is key entry");
                    }
                    Certificate certificate = keyStore.getCertificate(str3 + a);
                    if (certificate == null) {
                        throw new CMPException(3, "no encryption CA cert!");
                    }
                    cMPContext.setIssuerEncCert(certificate);
                    cMPContext.setCAAlias(str3);
                    cMPContext.setRecipientKID(new SubjectKeyIdentifier(new X509CertImpl(certificate.getEncoded()).getExtensionValue("2.5.29.14")).getKID());
                } else if (keyStore.isKeyEntry(str) && str2 != null) {
                    X509CertImpl certificate2 = keyStore.getCertificate(str);
                    cMPContext.setUserAlias(str);
                    cMPContext.setOldSignCertificate(certificate2);
                    PublicKey publicKey = certificate2.getPublicKey();
                    PrivateKey privateKey = (PrivateKey) keyStore.getKey(str, str2.toCharArray());
                    String name = certificate2.getSubjectDN().getName();
                    cMPContext.setSenderKID(new SubjectKeyIdentifier(certificate2.getExtensionValue("2.5.29.14")).getKID());
                    cMPContext.setSender(new GeneralName("DN:" + name));
                    cMPContext.setOldSignPubKey(publicKey);
                    cMPContext.setOldSignPrivKey(privateKey);
                    Enumeration<String> enumerationAliases = keyStore.aliases();
                    while (true) {
                        if (!enumerationAliases.hasMoreElements()) {
                            break;
                        }
                        String strNextElement = enumerationAliases.nextElement();
                        if (keyStore.isCertificateEntry(strNextElement)) {
                            X509CertImpl certificate3 = keyStore.getCertificate(strNextElement);
                            String string = certificate3.getSubjectDN().toString();
                            String string2 = certificate2.getIssuerDN().toString();
                            int iIndexOf = string.indexOf("O=");
                            String upperCase = string.substring(iIndexOf + 2, string.indexOf(",", iIndexOf)).toUpperCase();
                            int iIndexOf2 = string2.indexOf("O=");
                            if (upperCase.equals(string2.substring(iIndexOf2 + 2, string2.indexOf(",", iIndexOf2)).toUpperCase())) {
                                cMPContext.setIssuerEncCert(certificate3);
                                cMPContext.setRecipientDN(certificate3.getSubjectDN().toString());
                                cMPContext.setRecipientKID(new SubjectKeyIdentifier(certificate3.getExtensionValue("2.5.29.14")).getKID());
                                break;
                            }
                        }
                    }
                    if (keyStore.isKeyEntry(str + a)) {
                        cMPContext.setOldEncCertificate((X509Certificate) keyStore.getCertificate(str + a));
                        PublicKey publicKey2 = certificate2.getPublicKey();
                        PrivateKey privateKey2 = (PrivateKey) keyStore.getKey(str + a, str2.toCharArray());
                        cMPContext.setOldEncPubKey(publicKey2);
                        cMPContext.setOldEncPrivKey(privateKey2);
                    }
                } else {
                    throw new CMPException(3, "no such key or cerfiticate entry");
                }
            } catch (CMPException e) {
                throw e;
            } catch (Exception e2) {
                throw new CMPException(3, "fail to retrive key pair from keystore[" + e2.toString() + "]");
            }
        }
        this.b = keyStore;
    }

    public void parseFreeText(String str) {
        String[] strArrSplit = str.split("\\$");
        for (int i = 0; i < strArrSplit.length - 1; i++) {
            String[] strArrSplit2 = strArrSplit[i].split("=");
            this.e.put(strArrSplit2[0], strArrSplit2[1]);
        }
    }

    public void setFreeText(Hashtable hashtable) {
        this.e = hashtable;
    }

    public Hashtable getFreeText() {
        return this.e;
    }

    public void setKeysize(int i) {
        this.f = i;
    }

    public int getKeysize() {
        return this.f;
    }

    public void setSignAlgorithm(String str) {
        this.g = str;
    }

    public String getSignAlgorithm() {
        return this.g;
    }

    public byte[] getUserCert(String str) throws Exception {
        return ((X509Certificate) this.b.getCertificate(str)).getEncoded();
    }

    public byte[] getUserEncCert(String str) throws Exception {
        return ((X509Certificate) this.b.getCertificate(str + a)).getEncoded();
    }

    public byte[] getUesrPrivateKey(String str, String str2) throws Exception {
        return ((PrivateKey) this.b.getKey(str, str2.toCharArray())).getEncoded();
    }

    public byte[] getEncUserPrivateKey(String str, String str2, String str3) throws Exception {
        return getEncUserPrivateKey(str, str2, str3.toCharArray());
    }

    public byte[] getEncUserPrivateKey(String str, String str2, char[] cArr) throws Exception {
        PrivateKeyInfo privateKeyInfo = new PrivateKeyInfo((PrivateKey) this.b.getKey(str, str2.toCharArray()));
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        AlgorithmID algorithmID = new AlgorithmID("1.2.410.200004.1.15");
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("PBE");
        byte[] bArr = new byte[8];
        SecureRandom.getInstance("FIPS186-2Appendix3", "Initech").nextBytes(bArr);
        algorithmParameters.init((AlgorithmParameterSpec) new PBEParameterSpec(bArr, 2048));
        algorithmID.setParameter(algorithmParameters.getEncoded());
        byte[] encoded = new EncryptedPrivateKeyInfo(privateKeyInfo, pBEKeySpec, algorithmID).getEncoded();
        pBEKeySpec.clearPassword();
        return encoded;
    }

    public byte[] getEncUserEncPrivateKey(String str, String str2, String str3) throws Exception {
        return getEncUserEncPrivateKey(str, str2, str3.toCharArray());
    }

    public byte[] getEncUserEncPrivateKey(String str, String str2, char[] cArr) throws Exception {
        PrivateKeyInfo privateKeyInfo = new PrivateKeyInfo((PrivateKey) this.b.getKey(str + a, str2.toCharArray()));
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        AlgorithmID algorithmID = new AlgorithmID("1.2.410.200004.1.15");
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("PBE");
        byte[] bArr = new byte[8];
        SecureRandom.getInstance("FIPS186-2Appendix3", "Initech").nextBytes(bArr);
        algorithmParameters.init((AlgorithmParameterSpec) new PBEParameterSpec(bArr, 2048));
        algorithmID.setParameter(algorithmParameters.getEncoded());
        byte[] encoded = new EncryptedPrivateKeyInfo(privateKeyInfo, pBEKeySpec, algorithmID).getEncoded();
        pBEKeySpec.clearPassword();
        return encoded;
    }

    private static PrivateKey a(String str, char[] cArr) throws Exception {
        if (!new File(str).exists()) {
            throw new FileNotFoundException(str);
        }
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(str));
        int iAvailable = dataInputStream.available();
        if (iAvailable > Integer.MAX_VALUE || iAvailable < Integer.MIN_VALUE) {
            try {
                dataInputStream.close();
            } catch (Exception unused) {
            }
            throw new Exception();
        }
        byte[] bArr = new byte[iAvailable];
        dataInputStream.readFully(bArr);
        try {
            try {
                return new EncryptedPrivateKeyInfo(bArr).decrypt(new PBEKeySpec(cArr));
            } catch (BadPaddingException unused2) {
                throw new CMPException(1, (short) 1012, (short) 105, CMPException.METHOD_loadPrivateKey, "password is not matched");
            }
        } finally {
            try {
                dataInputStream.close();
            } catch (Exception unused3) {
            }
        }
    }
}
