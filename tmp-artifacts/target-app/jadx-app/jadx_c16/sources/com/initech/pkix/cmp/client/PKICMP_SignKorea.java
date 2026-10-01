package com.initech.pkix.cmp.client;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.initech.asn1.ASN1OID;
import com.initech.asn1.DEREncoder;
import com.initech.asn1.useful.AlgorithmID;
import com.initech.asn1.useful.EVID;
import com.initech.asn1.useful.GeneralName;
import com.initech.cryptox.spec.PBEKeySpec;
import com.initech.cryptox.spec.PBEParameterSpec;
import com.initech.pkcs.pkcs8.EncryptedPrivateKeyInfo;
import com.initech.pkcs.pkcs8.PrivateKeyInfo;
import com.initech.pki.pkcs12.InitechPKCS12Provider;
import com.initech.pkix.cmp.CertRepMessage;
import com.initech.pkix.cmp.CertResponse;
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
import java.lang.reflect.Method;
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
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PKICMP_SignKorea implements PKICMPInterface {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int CMP1999 = 1;
    public static final int CMP2000 = 2;
    public static final int GET_SIGNKOREA_CA_CERT = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final int REQUEST_KUR = 2;
    private static String a = "_enc";
    private static int asBinder = 0;
    private static String n = null;
    private static char onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    private String b;
    private KeyStore c;
    private URI d;
    private int e;
    private Hashtable f;
    private int g;
    private String h;
    private byte[] i;
    private CMPTransportFactory j;
    private CMPTransport k;
    private boolean l;
    private CMPTransport m;

    static {
        onWarmupCompleted();
        Security.addProvider(new InitechProvider());
        Security.addProvider(new InitechPKCS12Provider());
        Security.addProvider(new InitechPKIXProvider());
        n = "km_key_gen=users";
        int i = onTransact + 67;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public void setUseSingleTransport(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.l = z;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean getUseSingleTransport() {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        boolean z = this.l;
        int i5 = i3 + 97;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void o(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 91;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $10 + 83;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i10 = (c3 + i8) ^ ((c3 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "");
                        int defaultSize = View.getDefaultSize(i3, i3) + 10;
                        int iIndexOf = 12433 - TextUtils.indexOf((CharSequence) "", '0', i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, defaultSize, iIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    int i12 = i9;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 10 - View.resolveSize(0, 0), TextUtils.indexOf((CharSequence) "", '0') + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9 = i12 + 1;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16013), Drawable.resolveOpacity(0, 0) + 14, 19949 - AndroidCharacter.getMirror('0'), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    protected CMPTransport getTransport(CMPContext cMPContext) throws CMPException {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 69;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.l) {
            int i4 = i2 + 115;
            int i5 = i4 % 128;
            IAuthTabCallbackStub = i5;
            int i6 = i4 % 2;
            CMPTransport cMPTransport = this.m;
            if (cMPTransport == null) {
                int i7 = i5 + 115;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                this.m = CMPTransportFactory.getInstance().getCMPTransport(cMPContext);
            } else {
                cMPTransport.updateCtx(cMPContext);
            }
        } else {
            CMPTransport cMPTransport2 = this.m;
            if (cMPTransport2 != null) {
                try {
                    cMPTransport2.close();
                } catch (Exception unused) {
                }
            }
            this.m = CMPTransportFactory.getInstance().getCMPTransport(cMPContext);
            int i9 = IAuthTabCallbackStub + 5;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
        }
        return this.m;
    }

    protected void finalize() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super.finalize();
            closeTransport();
            int i3 = asBinder + 41;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.finalize();
        closeTransport();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void closeTransport() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        CMPTransport cMPTransport = this.m;
        if (cMPTransport != null) {
            try {
                cMPTransport.close();
                int i4 = asBinder + 9;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception unused) {
            }
        }
        this.m = null;
    }

    public PKICMP_SignKorea(KeyStore keyStore, URI uri) throws CMPException {
        this(1, keyStore, uri);
    }

    public PKICMP_SignKorea(URI uri) throws CMPException, NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException {
        this(1, uri);
    }

    public PKICMP_SignKorea(int i, KeyStore keyStore, URI uri) throws CMPException {
        this.b = "SIGNKOREACA";
        this.f = new Hashtable();
        this.g = -1;
        this.h = "";
        this.i = null;
        this.j = CMPTransportFactory.getInstance();
        this.k = null;
        this.l = true;
        this.m = null;
        this.c = keyStore;
        this.e = i;
        this.d = uri;
    }

    public PKICMP_SignKorea(int i, URI uri) throws NoSuchAlgorithmException, CMPException, IOException, KeyStoreException, CertificateException, NoSuchProviderException {
        this.b = "SIGNKOREACA";
        this.f = new Hashtable();
        this.g = -1;
        this.h = "";
        this.i = null;
        this.j = CMPTransportFactory.getInstance();
        this.k = null;
        this.l = true;
        this.m = null;
        KeyStore keyStore = KeyStore.getInstance("PKCS12", "InitechPKCS12Provider");
        this.c = keyStore;
        keyStore.load(null, null);
        this.e = i;
        this.d = uri;
    }

    public void initKeyStore(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        initKeyStore(str, str2, str3, str4, str5, str6.toCharArray(), str7, str8);
        int i4 = IAuthTabCallbackStub + 125;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void initKeyStore(String str, String str2, String str3, String str4, String str5, char[] cArr, String str6, String str7) throws Exception {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            initKeyStore(str, str2, str3, str4, a(str5, cArr), cArr, str6, str7);
            int i3 = 53 / 0;
        } else {
            initKeyStore(str, str2, str3, str4, a(str5, cArr), cArr, str6, str7);
        }
    }

    public void initKeyStore(String str, String str2, String str3, String str4, PrivateKey privateKey, char[] cArr, String str5, String str6) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        initKeyStore(str, str2, str3, x509CertificateInfo.loadCertificateFromFile(str4), privateKey, cArr, str5, str6);
        int i4 = IAuthTabCallbackStub + 7;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void initKeyStore(String str, String str2, String str3, Certificate certificate, PrivateKey privateKey, char[] cArr, String str4, String str5) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 57;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.b = str;
        if (str2 != null) {
            int i5 = i2 + 75;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            if (str3 != null) {
                this.c.setCertificateEntry(str, x509CertificateInfo.loadCertificate(str2.getBytes()));
                this.c.setCertificateEntry(str + "_enc", x509CertificateInfo.loadCertificate(str3.getBytes()));
            }
        }
        this.c.setKeyEntry(str4, privateKey, str5.toCharArray(), new Certificate[]{certificate});
        int i7 = asBinder + 5;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public void initKeyStore(String str, String str2, String str3, Certificate certificate, PrivateKey privateKey, String str4, String str5) throws Exception {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        initKeyStore(str, str2, str3, certificate, privateKey, x509CertificateInfo.loadCertificateFromFile(str4), str5);
        int i4 = IAuthTabCallbackStub + 117;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public void initKeyStore(String str, String str2, String str3, Certificate certificate, PrivateKey privateKey, Certificate certificate2, String str4) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        this.b = str;
        if (str == null) {
            int i5 = i3 + 23;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            str = "SignKoreaCA";
        }
        if (str2 != null) {
            X509Certificate x509CertificateLoadCertificateFromFile = x509CertificateInfo.loadCertificateFromFile(str2);
            if (x509CertificateLoadCertificateFromFile == null) {
                Object[] objArr = new Object[1];
                o(new char[]{46119, 48728, 10247, 48061, 50625, 28388, 28223, 45221, 27866, 9650, 29646, 18626}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, objArr);
                throw new Exception(((String) objArr[0]).intern() + str2 + ") 로딩 중 오류가 발생했습니다.");
            }
            int i6 = asBinder + 85;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            this.c.setCertificateEntry(str, x509CertificateLoadCertificateFromFile);
        }
        if (str3 != null) {
            int i8 = IAuthTabCallbackStub + 57;
            asBinder = i8 % 128;
            if (i8 % 2 != 0) {
                x509CertificateInfo.loadCertificateFromFile(str3);
                throw null;
            }
            X509Certificate x509CertificateLoadCertificateFromFile2 = x509CertificateInfo.loadCertificateFromFile(str3);
            if (x509CertificateLoadCertificateFromFile2 == null) {
                Object[] objArr2 = new Object[1];
                o(new char[]{4040, 58087, 45953, 47061, 46119, 48728, 10247, 48061, 50625, 28388, 28223, 45221, 27866, 9650, 29646, 18626}, TextUtils.lastIndexOf("", '0', 0) + 17, objArr2);
                throw new Exception(((String) objArr2[0]).intern() + str3 + ") 로딩 중 오류가 발생했습니다.");
            }
            this.c.setCertificateEntry(str + "_enc", x509CertificateLoadCertificateFromFile2);
        }
        if (certificate != null && privateKey != null) {
            int i9 = asBinder + 3;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 == 0) {
                this.c.setKeyEntry("RA", privateKey, "inisafecmp".toCharArray(), new Certificate[]{certificate});
            } else {
                this.c.setKeyEntry("RA", privateKey, "inisafecmp".toCharArray(), new Certificate[]{certificate});
            }
        }
        this.c.setCertificateEntry(str4, certificate2);
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public Certificate getEncCACert() throws KeyStoreException {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            KeyStore keyStore = this.c;
            if (keyStore != null) {
                try {
                    Certificate certificate = keyStore.getCertificate(this.b + a);
                    int i3 = asBinder + 35;
                    IAuthTabCallbackStub = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 26 / 0;
                    }
                    return certificate;
                } catch (Exception unused) {
                }
            }
            return null;
        }
        throw null;
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public void requestIR(String str, String str2, String str3, String str4, String str5, String str6, int i) throws CMPException, KeyStoreException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 23;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            requestIR(str, str2, str3, str4, str5, str6, i, null, null);
        } else {
            requestIR(str, str2, str3, str4, str5, str6, i, null, null);
            int i4 = 19 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0167, code lost:
    
        if (r1 != null) goto L37;
     */
    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void requestIR(String str, String str2, String str3, String str4, String str5, String str6, int i, PublicKey publicKey, EVID evid) throws CMPException, KeyStoreException {
        Certificate[] certificateArr;
        PrivateKey encPrivKey;
        int i2 = 2 % 2;
        CMPContext cMPContext = new CMPContext(this.e);
        if (publicKey != null) {
            cMPContext.setSignPopMode(0);
            cMPContext.setSignPubKey(publicKey);
        }
        if (evid != null) {
            cMPContext.setEVID(evid);
        }
        a(cMPContext, this.c, str, str2, str4);
        GeneralName generalName = new GeneralName();
        generalName.set(1, " ");
        GeneralName generalName2 = new GeneralName();
        generalName2.set(1, " ");
        cMPContext.setSender(generalName);
        cMPContext.setRecipient(generalName2);
        cMPContext.setSenderKID(str5.getBytes());
        cMPContext.setAuthCode(str6.getBytes());
        cMPContext.setURI(this.d);
        cMPContext.setRequestCertNum(i);
        cMPContext.setIdn(str3);
        cMPContext.setKeysize(this.g);
        cMPContext.setSignAlgorithm(this.h);
        cMPContext.setFreeText(this.f);
        try {
            PKIMessage pKIMessage = PKIMessageFormatter_SignKorea.format(cMPContext, 0);
            CMPTransport transport = getTransport(cMPContext);
            PKIMessage pKIMessageProcess = transport.process(pKIMessage);
            PKIMessageDump.dumpFile(pKIMessageProcess, "ip_signkorea.dump");
            a(cMPContext, pKIMessageProcess, 1);
            CertRepMessage certRepMessage = (CertRepMessage) pKIMessageProcess.getContentBody();
            if (certRepMessage.nOfResponses() != cMPContext.getRequestCertNum()) {
                throw new CMPException(2, (short) 2004, (short) 104, CMPException.METHOD_requestIR, "expected number of response is only one, but this time[" + certRepMessage.nOfResponses() + "]");
            }
            CertResponse certResponseResponseAt = certRepMessage.responseAt(0);
            a(certResponseResponseAt.getStatusInfo());
            cMPContext.setSignCertificate(certResponseResponseAt.getIssuedCert());
            if (cMPContext.getRequestCertNum() == 2) {
                CertResponse certResponseResponseAt2 = certRepMessage.responseAt(1);
                a(certResponseResponseAt2.getStatusInfo());
                EncryptedValue encryptedCert = certResponseResponseAt2.getCertifiedKeyPair().getEncryptedCert();
                DEREncoder dEREncoder = new DEREncoder();
                dEREncoder.encodeOctetString("0123456789012345".getBytes());
                encryptedCert.setSymmAlg(new AlgorithmID("SEEDcbc", dEREncoder.toByteArray()));
                this.i = encryptedCert.getData(cMPContext.getEncPrivKey());
                cMPContext.setEncCertificate(new X509CertImpl(this.i));
                int i3 = IAuthTabCallbackStub + 57;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
            }
            transport.process(PKIMessageFormatter_SignKorea.format(cMPContext, 19));
            transport.close();
            try {
                Certificate[] certificateArr2 = {cMPContext.getSignCertificate()};
                PrivateKey signPrivKey = cMPContext.getSignPrivKey();
                if (signPrivKey != null) {
                    int i5 = IAuthTabCallbackStub + 7;
                    asBinder = i5 % 128;
                    if (i5 % 2 != 0) {
                        this.c.setKeyEntry(str, signPrivKey, str2.toCharArray(), certificateArr2);
                        throw null;
                    }
                    this.c.setKeyEntry(str, signPrivKey, str2.toCharArray(), certificateArr2);
                } else {
                    this.c.setCertificateEntry(str, certificateArr2[0]);
                }
                if (cMPContext.getRequestCertNum() != 2) {
                    return;
                }
                int i6 = asBinder + 105;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 == 0) {
                    certificateArr = new Certificate[1];
                    certificateArr[1] = cMPContext.getEncCertificate();
                    encPrivKey = cMPContext.getEncPrivKey();
                    if (encPrivKey != null) {
                        this.c.setKeyEntry(str + a, encPrivKey, str2.toCharArray(), certificateArr);
                        return;
                    }
                    this.c.setCertificateEntry(str + a, certificateArr[0]);
                    int i7 = asBinder + 69;
                    IAuthTabCallbackStub = i7 % 128;
                    int i8 = i7 % 2;
                    return;
                }
                certificateArr = new Certificate[]{cMPContext.getEncCertificate()};
                encPrivKey = cMPContext.getEncPrivKey();
            } catch (Exception e) {
                throw new CMPException(3, (short) 3001, (short) 104, CMPException.METHOD_requestIR, "on saving private key and cert into keystore[" + e.toString() + "]");
            }
        } catch (CMPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new CMPException(1, (short) 1005, (short) 104, CMPException.METHOD_requestIR, "on processing IR[" + e3.toString() + "]");
        }
    }

    public void requestKRR(String str, String str2, String str3, String str4, String str5, String str6, int i) throws CMPException, KeyStoreException {
        int i2 = 2 % 2;
        CMPContext cMPContext = new CMPContext(this.e);
        a(cMPContext, this.c, str, str2, str4);
        cMPContext.setSenderKID(str5.getBytes());
        cMPContext.setAuthCode(str6.getBytes());
        cMPContext.setURI(this.d);
        cMPContext.setRequestCertNum(i);
        cMPContext.setIdn(str3);
        cMPContext.setKeysize(this.g);
        cMPContext.setSignAlgorithm(this.h);
        cMPContext.setFreeText(this.f);
        try {
            PKIMessage pKIMessage = PKIMessageFormatter_SignKorea.format(cMPContext, 9);
            CMPTransport transport = getTransport(cMPContext);
            PKIMessage pKIMessageProcess = transport.process(pKIMessage);
            PKIMessageDump.dumpFile(pKIMessageProcess, "krp_signkorea.dump");
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
            transport.process(PKIMessageFormatter_SignKorea.format(cMPContext, 19));
            transport.close();
            try {
                this.c.setKeyEntry(str, cMPContext.getSignPrivKey(), str2.toCharArray(), new Certificate[]{cMPContext.getSignCertificate()});
                if (cMPContext.getRequestCertNum() == 2) {
                    Certificate[] certificateArr = {cMPContext.getEncCertificate()};
                    PrivateKey encPrivKey = cMPContext.getEncPrivKey();
                    this.c.setKeyEntry(str + a, encPrivKey, str2.toCharArray(), certificateArr);
                    int i3 = asBinder + 85;
                    IAuthTabCallbackStub = i3 % 128;
                    int i4 = i3 % 2;
                }
            } catch (Exception e) {
                throw new CMPException(3, "on saving private key and cert into keystore[" + e.toString() + "]");
            }
        } catch (CMPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new CMPException(1, "on processing KRR[" + e3.toString() + "]");
        }
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public void requestKUR(String str, String str2, String str3, int i) throws CMPException, KeyStoreException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 73;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        requestKUR(str, str2, str3, i, null, null);
        int i5 = asBinder + 7;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0135, code lost:
    
        if (r2 != null) goto L35;
     */
    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void requestKUR(String str, String str2, String str3, int i, PublicKey publicKey, EVID evid) throws CMPException, KeyStoreException {
        Certificate[] certificateArr;
        PrivateKey encPrivKey;
        int i2 = 2 % 2;
        CMPContext cMPContext = new CMPContext(this.e);
        if (publicKey != null) {
            int i3 = IAuthTabCallbackStub + 47;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                cMPContext.setSignPopMode(1);
            } else {
                cMPContext.setSignPopMode(0);
            }
            cMPContext.setSignPubKey(publicKey);
        }
        if (evid != null) {
            int i4 = asBinder + 33;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                cMPContext.setEVID(evid);
            } else {
                cMPContext.setEVID(evid);
                throw null;
            }
        }
        cMPContext.setURI(this.d);
        cMPContext.setRequestCertNum(i);
        cMPContext.setIdn(str3);
        a(cMPContext, this.c, str, str2, this.b);
        try {
            PKIMessage pKIMessage = PKIMessageFormatter_SignKorea.format(cMPContext, 7);
            CMPTransport transport = getTransport(cMPContext);
            PKIMessage pKIMessageProcess = transport.process(pKIMessage);
            PKIMessageDump.dumpFile(pKIMessageProcess, "kup_signkorea.dump");
            a(cMPContext, pKIMessageProcess, 8);
            CertRepMessage certRepMessage = (CertRepMessage) pKIMessageProcess.getContentBody();
            if (certRepMessage.nOfResponses() != cMPContext.getRequestCertNum()) {
                throw new CMPException(2, (short) 2004, (short) 104, CMPException.METHOD_requestKUR, "expected number of response is " + cMPContext.getRequestCertNum() + ", but this time[" + certRepMessage.nOfResponses() + "]");
            }
            CertResponse certResponseResponseAt = certRepMessage.responseAt(0);
            a(certResponseResponseAt.getStatusInfo());
            cMPContext.setSignCertificate(certResponseResponseAt.getIssuedCert());
            if (cMPContext.getRequestCertNum() == 2) {
                CertResponse certResponseResponseAt2 = certRepMessage.responseAt(1);
                a(certResponseResponseAt2.getStatusInfo());
                EncryptedValue encryptedCert = certResponseResponseAt2.getCertifiedKeyPair().getEncryptedCert();
                DEREncoder dEREncoder = new DEREncoder();
                dEREncoder.encodeOctetString("0123456789012345".getBytes());
                encryptedCert.setSymmAlg(new AlgorithmID("SEEDcbc", dEREncoder.toByteArray()));
                this.i = encryptedCert.getData(cMPContext.getEncPrivKey());
                cMPContext.setEncCertificate(new X509CertImpl(this.i));
            }
            transport.process(PKIMessageFormatter_SignKorea.format(cMPContext, 19));
            transport.close();
            try {
                Certificate[] certificateArr2 = {cMPContext.getSignCertificate()};
                PrivateKey signPrivKey = cMPContext.getSignPrivKey();
                if (signPrivKey != null) {
                    this.c.setKeyEntry(str, signPrivKey, str2.toCharArray(), certificateArr2);
                } else {
                    this.c.setCertificateEntry(str, certificateArr2[0]);
                }
                if (cMPContext.getRequestCertNum() != 2) {
                    return;
                }
                int i5 = asBinder + 85;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 == 0) {
                    certificateArr = new Certificate[]{cMPContext.getEncCertificate()};
                    encPrivKey = cMPContext.getEncPrivKey();
                    if (encPrivKey != null) {
                        this.c.setKeyEntry(str + a, encPrivKey, str2.toCharArray(), certificateArr);
                        return;
                    }
                    this.c.setCertificateEntry(str + a, certificateArr[0]);
                    return;
                }
                certificateArr = new Certificate[]{cMPContext.getEncCertificate()};
                encPrivKey = cMPContext.getEncPrivKey();
            } catch (Exception e) {
                throw new CMPException(3, (short) 3001, (short) 104, CMPException.METHOD_requestKUR, "on saving private key and cert into keystore[" + e.toString() + "]");
            }
        } catch (CMPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new CMPException(1, (short) 1010, (short) 104, CMPException.METHOD_requestKUR, "on processing KUR[" + e3.toString() + "]");
        }
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public int requestGetCACert(String str, String str2, String str3) throws CMPException {
        int i = 2 % 2;
        this.b = str;
        Vector vector = new Vector();
        vector.add(str);
        vector.add(str2);
        vector.add(str3);
        int iIntValue = ((Integer) a(1, vector).elementAt(0)).intValue();
        int i2 = asBinder + 19;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return iIntValue;
        }
        throw null;
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public int requestPreKUR(String str, String str2) throws CMPException {
        int i = 2 % 2;
        Vector vector = new Vector();
        vector.add(str);
        vector.add(str2);
        int iIntValue = ((Integer) a(2, vector).elementAt(0)).intValue();
        int i2 = asBinder + 81;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x017f A[Catch: Exception -> 0x01e1, CMPException -> 0x0205, PHI: r10
      0x017f: PHI (r10v3 byte[]) = (r10v2 byte[]), (r10v7 byte[]) binds: [B:47:0x017d, B:42:0x0168] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {CMPException -> 0x0205, Exception -> 0x01e1, blocks: (B:22:0x00f4, B:23:0x0106, B:26:0x0113, B:31:0x012c, B:33:0x013a, B:35:0x0142, B:39:0x0155, B:41:0x0167, B:49:0x019f, B:51:0x01ab, B:52:0x01b9, B:48:0x017f, B:46:0x016d, B:56:0x01c1, B:57:0x01d0), top: B:77:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019f A[Catch: Exception -> 0x01e1, CMPException -> 0x0205, PHI: r7 r10
      0x019f: PHI (r7v9 com.initech.asn1.ASN1OID) = (r7v7 com.initech.asn1.ASN1OID), (r7v13 com.initech.asn1.ASN1OID) binds: [B:47:0x017d, B:42:0x0168] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r10v6 byte[]) = (r10v2 byte[]), (r10v7 byte[]) binds: [B:47:0x017d, B:42:0x0168] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {CMPException -> 0x0205, Exception -> 0x01e1, blocks: (B:22:0x00f4, B:23:0x0106, B:26:0x0113, B:31:0x012c, B:33:0x013a, B:35:0x0142, B:39:0x0155, B:41:0x0167, B:49:0x019f, B:51:0x01ab, B:52:0x01b9, B:48:0x017f, B:46:0x016d, B:56:0x01c1, B:57:0x01d0), top: B:77:0x00f4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Vector a(int i, Vector vector) throws CMPException, KeyStoreException {
        ASN1OID typeIdAt;
        byte[] valueAt;
        int i2 = 2 % 2;
        CMPContext cMPContext = new CMPContext(this.e);
        cMPContext.setURI(this.d);
        GeneralName generalName = new GeneralName();
        GeneralName generalName2 = new GeneralName();
        int i3 = 1;
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
        } else {
            if (i != 2) {
                throw new CMPException(4, (short) 4001, (short) 104, (short) 102, "not supported type");
            }
            String str2 = this.b;
            String str3 = (String) vector.elementAt(0);
            String str4 = (String) vector.elementAt(1);
            generalName.set(1, " ");
            generalName2.set(1, "INI_RENEW");
            cMPContext.setSender(generalName);
            cMPContext.setRecipient(generalName2);
            a(cMPContext, this.c, str3, str4, "signKoareCA");
            cMPContext.setSenderKID(Integer.toString(((X509Certificate) cMPContext.getOldSignCertificate()).getSerialNumber().intValue()).getBytes());
            cMPContext.setCAAlias(str2);
        }
        cMPContext.setGENMType(i);
        try {
            PKIMessage pKIMessageProcess = getTransport(cMPContext).process(PKIMessageFormatter_SignKorea.format(cMPContext, 21));
            parseFreeText(pKIMessageProcess.getHeader().getFreeText().toString());
            PKIMessageDump.dumpFile(pKIMessageProcess, "genp_signkorea.dump");
            a(cMPContext, pKIMessageProcess, 22);
            GeneralMessage generalMessage = (GeneralMessage) pKIMessageProcess.getContentBody();
            Object obj = null;
            if (i != 1 && i != 2) {
                int i4 = IAuthTabCallbackStub + 103;
                int i5 = i4 % 128;
                asBinder = i5;
                if (i4 % 2 != 0) {
                    throw null;
                }
                int i6 = i5 + 113;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            try {
                String[] allTexts = pKIMessageProcess.getHeader().getFreeText().getAllTexts();
                Vector vector2 = new Vector();
                int i7 = 0;
                while (true) {
                    if (i7 >= allTexts.length) {
                        break;
                    }
                    int i8 = asBinder + 125;
                    IAuthTabCallbackStub = i8 % 128;
                    int i9 = i8 % 2;
                    if (allTexts[i7].indexOf(n) != -1) {
                        int i10 = asBinder + 111;
                        IAuthTabCallbackStub = i10 % 128;
                        int i11 = i10 % 2;
                        i3 = 2;
                        break;
                    }
                    i7++;
                }
                vector2.add(new Integer(i3));
                if (cMPContext.getCAAlias() == null) {
                    cMPContext.setCAAlias("caCertAlias");
                }
                X509CertImpl x509CertImpl = null;
                Certificate x509CertImpl2 = null;
                for (int i12 = 0; i12 < generalMessage.size(); i12++) {
                    int i13 = IAuthTabCallbackStub + 33;
                    asBinder = i13 % 128;
                    if (i13 % 2 != 0) {
                        typeIdAt = generalMessage.getTypeIdAt(i12);
                        valueAt = generalMessage.getValueAt(i12);
                        int i14 = 30 / 0;
                        if (typeIdAt.getName().equals("caProtEncCert")) {
                            x509CertImpl = new X509CertImpl(valueAt);
                            this.c.setCertificateEntry(cMPContext.getCAAlias() + "_enc", x509CertImpl);
                        } else if (typeIdAt.get().equals("1.2.410.200005.1.10.1")) {
                            x509CertImpl2 = new X509CertImpl(valueAt);
                            this.c.setCertificateEntry(cMPContext.getCAAlias(), x509CertImpl2);
                        }
                    } else {
                        typeIdAt = generalMessage.getTypeIdAt(i12);
                        valueAt = generalMessage.getValueAt(i12);
                        if (typeIdAt.getName().equals("caProtEncCert")) {
                        }
                    }
                }
                if (x509CertImpl == null && x509CertImpl2 == null) {
                    throw new CMPException(1, (short) 1006, (short) 104, (short) 102, "not all ca cert are received");
                }
                int i15 = IAuthTabCallbackStub + 121;
                asBinder = i15 % 128;
                if (i15 % 2 == 0) {
                    return vector2;
                }
                obj.hashCode();
                throw null;
            } catch (CMPException e) {
                throw e;
            } catch (Exception e2) {
                throw new CMPException(1, (short) 1007, (short) 104, (short) 102, "error on processing GENM[" + e2.toString() + "]");
            }
        } catch (CMPException e3) {
            throw e3;
        } catch (Exception e4) {
            throw new CMPException(1, (short) 1007, (short) 104, (short) 102, "on processing IR[" + e4.toString() + "]");
        }
    }

    private void a(CMPContext cMPContext, PKIMessage pKIMessage, int i) throws CMPException {
        int i2 = 2 % 2;
        PKIHeader header = pKIMessage.getHeader();
        if (pKIMessage.getContentType() != i) {
            int i3 = IAuthTabCallbackStub + 13;
            asBinder = i3 % 128;
            if (i3 % 2 == 0 ? pKIMessage.getContentType() == 23 : pKIMessage.getContentType() == 7) {
                a((ErrorMsgContent) pKIMessage.getContentBody());
            }
            throw new CMPException(6, (short) 2001, (short) 104, (short) 105, "unexpected message body is received. we wanted [" + i + "] but received [" + pKIMessage.getContentType() + "]");
        }
        if (header.getProtectionAlg() == null) {
            return;
        }
        Object authCode = header.getProtectionAlg().getAlg().equals("1.2.840.113533.7.66.13") ? cMPContext.getAuthCode() : cMPContext.getIssuerSignCert().getPublicKey();
        try {
            CertRepMessage certRepMessage = (CertRepMessage) pKIMessage.getContentBody();
            int i4 = 0;
            if (certRepMessage.responseAt(0).getStatus() == 2) {
                String[] allTexts = certRepMessage.responseAt(0).getStatusInfo().getStatusString().getAllTexts();
                StringBuffer stringBuffer = new StringBuffer();
                while (i4 < allTexts.length) {
                    int i5 = IAuthTabCallbackStub + 29;
                    asBinder = i5 % 128;
                    if (i5 % 2 != 0) {
                        stringBuffer.append(allTexts[i4]);
                        i4 += 92;
                    } else {
                        stringBuffer.append(allTexts[i4]);
                        i4++;
                    }
                }
                throw new CMPException(6, (short) 2003, (short) 104, (short) 105, "[" + stringBuffer.toString() + "]");
            }
            if (!pKIMessage.verify(authCode)) {
                if (!pKIMessage.verify(cMPContext.getIssuerEncCert().getPublicKey())) {
                    throw new CMPException(6, (short) 1003, (short) 104, (short) 105, "message verification failed");
                }
                int i6 = asBinder + 125;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
            }
            if (!byteCompare(cMPContext.getSenderNonce(), header.getRecipNonce())) {
                throw new CMPException(6, (short) 1004, (short) 104, (short) 105, "nonce check failed");
            }
            int i8 = asBinder + 109;
            IAuthTabCallbackStub = i8 % 128;
            if (i8 % 2 == 0) {
                cMPContext.setRecipientNonce(header.getSenderNonce());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            cMPContext.setRecipientNonce(header.getSenderNonce());
            int i9 = IAuthTabCallbackStub + 3;
            asBinder = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 25 / 0;
            }
        } catch (CMPException e) {
            throw e;
        } catch (Exception e2) {
            throw new CMPException(6, (short) 1011, (short) 104, (short) 105, "message verification failed[" + e2.toString() + "]");
        }
    }

    protected static boolean byteCompare(byte[] bArr, byte[] bArr2) {
        int i = 2 % 2;
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i2 = 0;
        while (i2 < bArr.length) {
            if (bArr[i2] != bArr2[i2]) {
                int i3 = IAuthTabCallbackStub + 59;
                asBinder = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 68 / 0;
                }
                return false;
            }
            i2++;
            int i5 = IAuthTabCallbackStub + 7;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(ErrorMsgContent errorMsgContent) throws CMPException {
        int i = 2 % 2;
        String[] errorDetail = errorMsgContent.getErrorDetail();
        StringBuffer stringBuffer = new StringBuffer();
        if (errorDetail != null) {
            for (int i2 = 0; i2 < errorDetail.length; i2++) {
                int i3 = IAuthTabCallbackStub + 15;
                asBinder = i3 % 128;
                if (i3 % 2 != 0) {
                    stringBuffer.append(errorDetail[i2]);
                    if (i2 != (errorDetail.length >>> 1)) {
                        stringBuffer.append(",");
                        int i4 = asBinder + 43;
                        IAuthTabCallbackStub = i4 % 128;
                        int i5 = i4 % 2;
                    }
                } else {
                    stringBuffer.append(errorDetail[i2]);
                    if (i2 != errorDetail.length - 1) {
                    }
                }
            }
        }
        throw new CMPException(6, (short) 2003, (short) 104, CMPException.METHOD_throwError, "CA ErrorCode[" + errorMsgContent.getErrorCode() + "]\n" + stringBuffer.toString());
    }

    private static void a(PKIStatusInfo pKIStatusInfo) throws CMPException {
        int i;
        String str;
        int i2 = 2 % 2;
        if (pKIStatusInfo.getStatus() == 3) {
            throw new CMPException(1, (short) 1008, (short) 104, CMPException.METHOD_checkPKIStatusInfo, "polling is not supported!");
        }
        int i3 = asBinder + 87;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (pKIStatusInfo.getStatus() != 2) {
            if (pKIStatusInfo.getStatus() == 0) {
                return;
            }
            throw new CMPException(1, (short) 1008, (short) 104, CMPException.METHOD_checkPKIStatusInfo, "this client doesn't support PKIStatus [" + pKIStatusInfo.getStatus() + "]");
        }
        int i5 = IAuthTabCallbackStub + 77;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            pKIStatusInfo.hasFailInfo();
            throw null;
        }
        if (pKIStatusInfo.hasFailInfo()) {
            i = 0;
            while (i < 27) {
                if (pKIStatusInfo.isAReason(i)) {
                    break;
                }
                int i6 = IAuthTabCallbackStub + 119;
                int i7 = i6 % 128;
                asBinder = i7;
                int i8 = i6 % 2;
                i++;
                int i9 = i7 + 75;
                IAuthTabCallbackStub = i9 % 128;
                int i10 = i9 % 2;
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
        throw new CMPException(1, (short) 1008, (short) 104, CMPException.METHOD_checkPKIStatusInfo, sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c9, code lost:
    
        r6.nextElement().equals(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01d2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01d3, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01d6, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091 A[Catch: Exception -> 0x0083, CMPException -> 0x0087, TryCatch #5 {CMPException -> 0x0087, Exception -> 0x0083, blocks: (B:4:0x001f, B:6:0x0036, B:8:0x003c, B:10:0x0053, B:11:0x0073, B:12:0x007a, B:13:0x007b, B:14:0x0082, B:19:0x008b, B:21:0x0091, B:22:0x00b0, B:24:0x00b6, B:28:0x00c0, B:33:0x00eb, B:34:0x00f8, B:39:0x00fe, B:40:0x010b, B:41:0x0140, B:45:0x0151, B:47:0x015d, B:49:0x0163, B:51:0x01aa, B:52:0x01c9, B:54:0x01d3, B:55:0x01d6, B:58:0x01d9, B:60:0x01f0), top: B:78:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0 A[Catch: Exception -> 0x0083, CMPException -> 0x0087, TRY_LEAVE, TryCatch #5 {CMPException -> 0x0087, Exception -> 0x0083, blocks: (B:4:0x001f, B:6:0x0036, B:8:0x003c, B:10:0x0053, B:11:0x0073, B:12:0x007a, B:13:0x007b, B:14:0x0082, B:19:0x008b, B:21:0x0091, B:22:0x00b0, B:24:0x00b6, B:28:0x00c0, B:33:0x00eb, B:34:0x00f8, B:39:0x00fe, B:40:0x010b, B:41:0x0140, B:45:0x0151, B:47:0x015d, B:49:0x0163, B:51:0x01aa, B:52:0x01c9, B:54:0x01d3, B:55:0x01d6, B:58:0x01d9, B:60:0x01f0), top: B:78:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb A[Catch: Exception -> 0x0083, CMPException -> 0x0087, TRY_ENTER, TRY_LEAVE, TryCatch #5 {CMPException -> 0x0087, Exception -> 0x0083, blocks: (B:4:0x001f, B:6:0x0036, B:8:0x003c, B:10:0x0053, B:11:0x0073, B:12:0x007a, B:13:0x007b, B:14:0x0082, B:19:0x008b, B:21:0x0091, B:22:0x00b0, B:24:0x00b6, B:28:0x00c0, B:33:0x00eb, B:34:0x00f8, B:39:0x00fe, B:40:0x010b, B:41:0x0140, B:45:0x0151, B:47:0x015d, B:49:0x0163, B:51:0x01aa, B:52:0x01c9, B:54:0x01d3, B:55:0x01d6, B:58:0x01d9, B:60:0x01f0), top: B:78:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe A[Catch: Exception -> 0x0083, CMPException -> 0x0087, TRY_ENTER, TryCatch #5 {CMPException -> 0x0087, Exception -> 0x0083, blocks: (B:4:0x001f, B:6:0x0036, B:8:0x003c, B:10:0x0053, B:11:0x0073, B:12:0x007a, B:13:0x007b, B:14:0x0082, B:19:0x008b, B:21:0x0091, B:22:0x00b0, B:24:0x00b6, B:28:0x00c0, B:33:0x00eb, B:34:0x00f8, B:39:0x00fe, B:40:0x010b, B:41:0x0140, B:45:0x0151, B:47:0x015d, B:49:0x0163, B:51:0x01aa, B:52:0x01c9, B:54:0x01d3, B:55:0x01d6, B:58:0x01d9, B:60:0x01f0), top: B:78:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f0 A[Catch: Exception -> 0x0083, CMPException -> 0x0087, TRY_LEAVE, TryCatch #5 {CMPException -> 0x0087, Exception -> 0x0083, blocks: (B:4:0x001f, B:6:0x0036, B:8:0x003c, B:10:0x0053, B:11:0x0073, B:12:0x007a, B:13:0x007b, B:14:0x0082, B:19:0x008b, B:21:0x0091, B:22:0x00b0, B:24:0x00b6, B:28:0x00c0, B:33:0x00eb, B:34:0x00f8, B:39:0x00fe, B:40:0x010b, B:41:0x0140, B:45:0x0151, B:47:0x015d, B:49:0x0163, B:51:0x01aa, B:52:0x01c9, B:54:0x01d3, B:55:0x01d6, B:58:0x01d9, B:60:0x01f0), top: B:78:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d9 A[EDGE_INSN: B:79:0x01d9->B:58:0x01d9 BREAK  A[LOOP:0: B:41:0x0140->B:84:0x0140], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(CMPContext cMPContext, KeyStore keyStore, String str, String str2, String str3) throws CMPException, KeyStoreException {
        Enumeration<String> enumerationAliases;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 107;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
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
                }
                if (keyStore.isKeyEntry("RA")) {
                    cMPContext.setRACertificate(new X509CertImpl(keyStore.getCertificate("RA").getEncoded()));
                    cMPContext.setRAPrivKey((PrivateKey) keyStore.getKey("RA", "inisafecmp".toCharArray()));
                }
                if (!keyStore.isCertificateEntry(str) || keyStore.isKeyEntry(str)) {
                    X509CertImpl x509CertImpl = new X509CertImpl(keyStore.getCertificate(str).getEncoded());
                    cMPContext.setUserAlias(str);
                    cMPContext.setOldSignCertificate(x509CertImpl);
                    PublicKey publicKey = x509CertImpl.getPublicKey();
                    if (keyStore.isKeyEntry(str) && str2 != null) {
                        i = asBinder + 79;
                        IAuthTabCallbackStub = i % 128;
                        if (i % 2 != 0) {
                            cMPContext.setOldSignPrivKey((PrivateKey) keyStore.getKey(str, str2.toCharArray()));
                            int i5 = 79 / 0;
                        } else {
                            cMPContext.setOldSignPrivKey((PrivateKey) keyStore.getKey(str, str2.toCharArray()));
                        }
                    }
                    String name = x509CertImpl.getSubjectDN().getName();
                    cMPContext.setSenderKID(new SubjectKeyIdentifier(x509CertImpl.getExtensionValue("2.5.29.14")).getKID());
                    cMPContext.setSender(new GeneralName("DN:" + name));
                    cMPContext.setOldSignPubKey(publicKey);
                    enumerationAliases = keyStore.aliases();
                    while (true) {
                        if (!enumerationAliases.hasMoreElements()) {
                            int i6 = asBinder + 107;
                            IAuthTabCallbackStub = i6 % 128;
                            if (i6 % 2 == 0) {
                                break;
                            }
                            String strNextElement = enumerationAliases.nextElement();
                            if (!strNextElement.equals(str) && keyStore.isCertificateEntry(strNextElement)) {
                                X509CertImpl x509CertImpl2 = new X509CertImpl(keyStore.getCertificate(strNextElement).getEncoded());
                                String string = x509CertImpl2.getSubjectDN().toString();
                                String string2 = x509CertImpl.getIssuerDN().toString();
                                int iIndexOf = string.indexOf("O=");
                                String upperCase = string.substring(iIndexOf + 2, string.indexOf(",", iIndexOf)).toUpperCase();
                                int iIndexOf2 = string2.indexOf("O=");
                                if (upperCase.equals(string2.substring(iIndexOf2 + 2, string2.indexOf(",", iIndexOf2)).toUpperCase())) {
                                    cMPContext.setIssuerSignCert(x509CertImpl2);
                                    cMPContext.setRecipientDN(x509CertImpl2.getSubjectDN().toString());
                                    cMPContext.setRecipientKID(new SubjectKeyIdentifier(x509CertImpl2.getExtensionValue("2.5.29.14")).getKID());
                                    break;
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    if (keyStore.isKeyEntry(str + a)) {
                        cMPContext.setOldEncCertificate((X509Certificate) keyStore.getCertificate(str + a));
                        PublicKey publicKey2 = x509CertImpl.getPublicKey();
                        PrivateKey privateKey = (PrivateKey) keyStore.getKey(str + a, str2.toCharArray());
                        cMPContext.setOldEncPubKey(publicKey2);
                        cMPContext.setOldEncPrivKey(privateKey);
                    }
                }
                try {
                    this.c = keyStore;
                    int i7 = IAuthTabCallbackStub + 33;
                    asBinder = i7 % 128;
                    int i8 = i7 % 2;
                    return;
                } catch (CMPException e) {
                    throw e;
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (CMPException e3) {
                throw e3;
            } catch (Exception e4) {
                e = e4;
            }
        } else {
            if (keyStore.isKeyEntry("RA")) {
            }
            if (!keyStore.isCertificateEntry(str)) {
                X509CertImpl x509CertImpl3 = new X509CertImpl(keyStore.getCertificate(str).getEncoded());
                cMPContext.setUserAlias(str);
                cMPContext.setOldSignCertificate(x509CertImpl3);
                PublicKey publicKey3 = x509CertImpl3.getPublicKey();
                if (keyStore.isKeyEntry(str)) {
                    i = asBinder + 79;
                    IAuthTabCallbackStub = i % 128;
                    if (i % 2 != 0) {
                    }
                }
                String name2 = x509CertImpl3.getSubjectDN().getName();
                cMPContext.setSenderKID(new SubjectKeyIdentifier(x509CertImpl3.getExtensionValue("2.5.29.14")).getKID());
                cMPContext.setSender(new GeneralName("DN:" + name2));
                cMPContext.setOldSignPubKey(publicKey3);
                enumerationAliases = keyStore.aliases();
                while (true) {
                    if (!enumerationAliases.hasMoreElements()) {
                    }
                }
                if (keyStore.isKeyEntry(str + a)) {
                }
                this.c = keyStore;
                int i72 = IAuthTabCallbackStub + 33;
                asBinder = i72 % 128;
                int i82 = i72 % 2;
                return;
            }
        }
        throw new CMPException(3, "fail to retrive key pair from keystore[" + e.toString() + "]");
    }

    public void parseFreeText(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String[] strArrSplit = str.split("\\$");
        int i4 = 0;
        while (i4 < strArrSplit.length - 1) {
            String[] strArrSplit2 = strArrSplit[i4].split("=");
            this.f.put(strArrSplit2[0], strArrSplit2[1]);
            i4++;
            int i5 = asBinder + 55;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public void setFreeText(Hashtable hashtable) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 77;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.f = hashtable;
        int i5 = i2 + 101;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public Hashtable getFreeText() {
        Hashtable hashtable;
        int i = 2 % 2;
        int i2 = asBinder + 77;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            hashtable = this.f;
            int i4 = 0 / 0;
        } else {
            hashtable = this.f;
        }
        int i5 = i3 + 63;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return hashtable;
    }

    public void setKeysize(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 123;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.g = i;
        if (i4 == 0) {
            throw null;
        }
    }

    public int getKeysize() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.g;
        int i5 = i3 + 65;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public void setSignAlgorithm(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 119;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        this.h = str;
        int i5 = i3 + 53;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getSignAlgorithm() {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.h;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public byte[] getUserCert(String str) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        byte[] encoded = ((X509Certificate) this.c.getCertificate(str)).getEncoded();
        int i4 = IAuthTabCallbackStub + 75;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return encoded;
    }

    public byte[] getUserEncCert(String str) throws Exception {
        int i = 2 % 2;
        byte[] encoded = ((X509Certificate) this.c.getCertificate(str + a)).getEncoded();
        int i2 = asBinder + 55;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return encoded;
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public byte[] getUesrPrivateKey(String str, String str2) throws Exception {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            byte[] encoded = ((PrivateKey) this.c.getKey(str, str2.toCharArray())).getEncoded();
            int i3 = asBinder + 117;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return encoded;
        }
        ((PrivateKey) this.c.getKey(str, str2.toCharArray())).getEncoded();
        throw null;
    }

    public byte[] getEncUserPrivateKey(String str, String str2, String str3) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        byte[] encUserPrivateKey = getEncUserPrivateKey(str, str2, str3.toCharArray());
        int i4 = asBinder + 57;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return encUserPrivateKey;
    }

    public byte[] getEncUserPrivateKey(String str, String str2, char[] cArr) throws Exception {
        int i = 2 % 2;
        PrivateKeyInfo privateKeyInfo = new PrivateKeyInfo((PrivateKey) this.c.getKey(str, str2.toCharArray()));
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        AlgorithmID algorithmID = new AlgorithmID("1.2.410.200004.1.15");
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("PBE");
        byte[] bArr = new byte[8];
        SecureRandom.getInstance("FIPS186-2Appendix3", "Initech").nextBytes(bArr);
        algorithmParameters.init((AlgorithmParameterSpec) new PBEParameterSpec(bArr, 2048));
        algorithmID.setParameter(algorithmParameters.getEncoded());
        byte[] encoded = new EncryptedPrivateKeyInfo(privateKeyInfo, pBEKeySpec, algorithmID).getEncoded();
        pBEKeySpec.clearPassword();
        int i2 = asBinder + 31;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return encoded;
    }

    public byte[] getEncUserEncPrivateKey(String str, String str2, String str3) throws Exception {
        int i = 2 % 2;
        PrivateKeyInfo privateKeyInfo = new PrivateKeyInfo((PrivateKey) this.c.getKey(str + a, str2.toCharArray()));
        PBEKeySpec pBEKeySpec = new PBEKeySpec(str3.toCharArray());
        AlgorithmID algorithmID = new AlgorithmID("1.2.410.200004.1.15");
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("PBE");
        byte[] bArr = new byte[8];
        SecureRandom.getInstance("FIPS186-2Appendix3", "Initech").nextBytes(bArr);
        algorithmParameters.init((AlgorithmParameterSpec) new PBEParameterSpec(bArr, 2048));
        algorithmID.setParameter(algorithmParameters.getEncoded());
        byte[] encoded = new EncryptedPrivateKeyInfo(privateKeyInfo, pBEKeySpec, algorithmID).getEncoded();
        int i2 = IAuthTabCallbackStub + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return encoded;
    }

    private static PrivateKey a(String str, char[] cArr) throws Exception {
        int i = 2 % 2;
        if (!new File(str).exists()) {
            throw new FileNotFoundException(str);
        }
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(str));
        int iAvailable = dataInputStream.available();
        if (iAvailable <= Integer.MAX_VALUE) {
            int i2 = asBinder + 33;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (iAvailable >= Integer.MIN_VALUE) {
                byte[] bArr = new byte[iAvailable];
                dataInputStream.readFully(bArr);
                try {
                    try {
                        PrivateKey privateKeyDecrypt = new EncryptedPrivateKeyInfo(bArr).decrypt(new PBEKeySpec(cArr));
                        try {
                            int i3 = asBinder + 41;
                            IAuthTabCallbackStub = i3 % 128;
                            int i4 = i3 % 2;
                        } catch (Exception unused) {
                        }
                        return privateKeyDecrypt;
                    } catch (BadPaddingException unused2) {
                        throw new CMPException(1, (short) 1012, (short) 104, CMPException.METHOD_loadPrivateKey, "password is not matched");
                    }
                } finally {
                    try {
                        dataInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
            }
        }
        try {
            dataInputStream.close();
        } catch (Exception unused4) {
        }
        throw new Exception();
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = (char) 18460;
        onExtraCallback = (char) 25090;
        onExtraCallbackWithResult = (char) 26428;
        onNavigationEvent = (char) 47905;
    }
}
