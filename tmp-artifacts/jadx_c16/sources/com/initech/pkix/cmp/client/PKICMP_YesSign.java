package com.initech.pkix.cmp.client;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
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
import java.math.BigInteger;
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
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PKICMP_YesSign implements PKICMPInterface {
    public static final int CMP1999 = 1;
    public static final int CMP2000 = 2;
    protected static String ENC_CERT_AVAIL = null;
    protected static String ENC_CERT_SURFIX = "_enc";
    public static final int GET_YESSIGN_CA_CERT = 1;
    public static final int REQUEST_KUR = 2;
    private static long onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onWarmupCompleted;
    private String a;
    private boolean b;
    private CMPTransport c;
    protected Hashtable freeText;
    protected KeyStore keyStore;
    protected int key_size;
    protected String signAlgorithm;
    protected URI uri;
    protected int version;
    private static final byte[] $$a = {5, -4, -80, 1};
    private static final int $$b = 178;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i;
        int i2 = b * 4;
        byte[] bArr = $$a;
        int i3 = s + 4;
        int i4 = s2 + 109;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == null) {
            int i6 = i5;
            i = 0;
            i4 += -i6;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            i3++;
            i++;
            i6 = bArr[i3];
            i4 += -i6;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public void initKeyStore(String str, String str2, String str3, Certificate certificate, PrivateKey privateKey, String str4, String str5) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public void initKeyStore(String str, String str2, String str3, Certificate certificate, PrivateKey privateKey, Certificate certificate2, String str4) throws Exception {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public void requestKUR(String str, String str2, String str3, int i, PublicKey publicKey, EVID evid) throws CMPException {
        int i2 = 2 % 2;
        int i3 = asBinder + 45;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 41 / 0;
        }
    }

    static {
        onExtraCallbackWithResult = 1;
        IAuthTabCallback();
        Security.addProvider(new InitechProvider());
        Security.addProvider(new InitechPKCS12Provider());
        Security.addProvider(new InitechPKIXProvider());
        ENC_CERT_AVAIL = "km_key_gen=users";
        int i = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public void setUseSingleTransport(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 101;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.b = z;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 31;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean getUseSingleTransport() {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.b;
        int i4 = i3 + 15;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    protected CMPTransport getTransport(CMPContext cMPContext) throws CMPException {
        int i = 2 % 2;
        if (this.b) {
            int i2 = asBinder;
            int i3 = i2 + 105;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                CMPTransport cMPTransport = this.c;
                if (cMPTransport != null) {
                    cMPTransport.updateCtx(cMPContext);
                } else {
                    int i4 = i2 + 13;
                    IAuthTabCallbackStub = i4 % 128;
                    if (i4 % 2 != 0) {
                        this.c = CMPTransportFactory.getInstance().getCMPTransport(cMPContext);
                        int i5 = 40 / 0;
                    } else {
                        this.c = CMPTransportFactory.getInstance().getCMPTransport(cMPContext);
                    }
                }
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            CMPTransport cMPTransport2 = this.c;
            if (cMPTransport2 != null) {
                try {
                    cMPTransport2.close();
                } catch (Exception unused) {
                }
            }
            this.c = CMPTransportFactory.getInstance().getCMPTransport(cMPContext);
            int i6 = IAuthTabCallbackStub + 103;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        }
        return this.c;
    }

    protected void finalize() throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            super.finalize();
            closeTransport();
        } else {
            super.finalize();
            closeTransport();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void d(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $11 + 37;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $10 + 17;
            $11 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cGreen = (char) Color.green(0);
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 43;
                    int i8 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1450;
                    byte b = $$a[3];
                    byte b2 = (byte) (-b);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cGreen, scrollDefaultDelay, i8, 228868077, false, $$c(b2, (byte) (b2 + 1), b), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char keyRepeatDelay = (char) (49123 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    int iResolveSize = View.resolveSize(0, 0) + 44;
                    int i9 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1494;
                    byte b3 = (byte) (-$$a[3]);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(keyRepeatDelay, iResolveSize, i9, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.lastIndexOf("", '0', 0)), View.resolveSizeAndState(0, 0, 0) + 50, (Process.myTid() >> 22) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 45800), 30 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 12578 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i10 = $11 + 39;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001b A[EXC_TOP_SPLITTER, PHI: r1
      0x001b: PHI (r1v5 com.initech.pkix.cmp.client.transport.CMPTransport) = (r1v4 com.initech.pkix.cmp.client.transport.CMPTransport), (r1v7 com.initech.pkix.cmp.client.transport.CMPTransport) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void closeTransport() {
        CMPTransport cMPTransport;
        int i = 2 % 2;
        int i2 = asBinder + 121;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            cMPTransport = this.c;
            int i3 = 65 / 0;
            if (cMPTransport != null) {
                try {
                    cMPTransport.close();
                } catch (Exception unused) {
                }
            }
        } else {
            cMPTransport = this.c;
            if (cMPTransport != null) {
            }
        }
        this.c = null;
        int i4 = asBinder + 33;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public PKICMP_YesSign(KeyStore keyStore, URI uri) throws CMPException {
        this(1, keyStore, uri);
    }

    public PKICMP_YesSign(URI uri) throws CMPException, NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException {
        this(1, uri);
    }

    public PKICMP_YesSign(int i, KeyStore keyStore, URI uri) throws CMPException {
        this.a = "YESSIGN";
        this.freeText = new Hashtable();
        this.key_size = -1;
        this.signAlgorithm = "";
        this.b = true;
        this.keyStore = keyStore;
        if (i != 1) {
            throw new CMPException(4, (short) 4000, (short) 100, (short) 100, "version not supported");
        }
        this.version = i;
        this.uri = uri;
        int i2 = IAuthTabCallbackStub + 39;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PKICMP_YesSign(int i, URI uri) throws NoSuchAlgorithmException, CMPException, IOException, KeyStoreException, CertificateException, NoSuchProviderException {
        this.a = "YESSIGN";
        this.freeText = new Hashtable();
        this.key_size = -1;
        this.signAlgorithm = "";
        this.b = true;
        KeyStore keyStore = KeyStore.getInstance("PKCS12", "InitechPKCS12Provider");
        this.keyStore = keyStore;
        keyStore.load(null, null);
        if (i != 1) {
            throw new CMPException(4, (short) 4000, (short) 100, (short) 100, "version not supported");
        }
        this.version = i;
        this.uri = uri;
        int i2 = IAuthTabCallbackStub + 61;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
    }

    public void initKeyStore(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        initKeyStore(str, str2, str3, str4, str5, str6.toCharArray(), str7, str8);
        int i4 = IAuthTabCallbackStub + 51;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
    }

    public void initKeyStore(String str, String str2, String str3, String str4, String str5, char[] cArr, String str6, String str7) throws Exception {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            initKeyStore(str, str2, str3, str4, a(str5, cArr), cArr, str6, str7);
            int i3 = IAuthTabCallbackStub + 93;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        initKeyStore(str, str2, str3, str4, a(str5, cArr), cArr, str6, str7);
        obj.hashCode();
        throw null;
    }

    public void initKeyStore(String str, String str2, String str3, String str4, PrivateKey privateKey, char[] cArr, String str5, String str6) throws Exception {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            initKeyStore(str, str2, str3, x509CertificateInfo.loadCertificateFromFile(str4), privateKey, cArr, str5, str6);
            int i3 = 59 / 0;
        } else {
            initKeyStore(str, str2, str3, x509CertificateInfo.loadCertificateFromFile(str4), privateKey, cArr, str5, str6);
        }
    }

    public void initKeyStore(String str, String str2, String str3, Certificate certificate, PrivateKey privateKey, char[] cArr, String str4, String str5) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.a = str;
            if (str2 != null) {
                int i4 = i3 + 31;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (str3 != null) {
                    this.keyStore.setCertificateEntry(str, x509CertificateInfo.loadCertificate(str2.getBytes()));
                    this.keyStore.setCertificateEntry(str + "_enc", x509CertificateInfo.loadCertificate(str3.getBytes()));
                    int i5 = asBinder + 77;
                    IAuthTabCallbackStub = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            this.keyStore.setKeyEntry(str4, privateKey, str5.toCharArray(), new Certificate[]{certificate});
            return;
        }
        this.a = str;
        throw null;
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public Certificate getEncCACert() throws KeyStoreException {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KeyStore keyStore = this.keyStore;
        if (keyStore == null) {
            return null;
        }
        try {
            Certificate certificate = keyStore.getCertificate(this.a + ENC_CERT_SURFIX);
            int i4 = IAuthTabCallbackStub + 33;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return certificate;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public void requestIR(String str, String str2, String str3, String str4, String str5, String str6, int i) throws CMPException, KeyStoreException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 9;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        requestIR(str, str2, str3, str4, str5, str6, i, null, null);
        int i5 = asBinder + 87;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void requestIR(String str, String str2, String str3, String str4, String str5, String str6, int i, PKICMPAdapter pKICMPAdapter) throws CMPException, KeyStoreException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 85;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        requestIR(str, str2, str3, str4, str5, str6, i, null, null, pKICMPAdapter);
        if (i4 == 0) {
            throw null;
        }
        int i5 = IAuthTabCallbackStub + 91;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public void requestIR(String str, String str2, String str3, String str4, String str5, String str6, int i, PublicKey publicKey, EVID evid) throws CMPException, KeyStoreException {
        int i2 = 2 % 2;
        int i3 = asBinder + 71;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        requestIR(str, str2, str3, str4, str5, str6, i, publicKey, evid, null);
        if (i4 != 0) {
            throw null;
        }
        int i5 = IAuthTabCallbackStub + 3;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void requestIR(String str, String str2, String str3, String str4, String str5, String str6, int i, PublicKey publicKey, EVID evid, PKICMPAdapter pKICMPAdapter) throws CMPException, KeyStoreException {
        int i2 = 2 % 2;
        CMPContext cMPContext = new CMPContext(this.version);
        if (publicKey != null) {
            int i3 = asBinder + 69;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                cMPContext.setSignPopMode(1);
            } else {
                cMPContext.setSignPopMode(0);
            }
            cMPContext.setSignPubKey(publicKey);
        } else if (pKICMPAdapter != null) {
            int i4 = asBinder + 51;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                cMPContext.setSignPopMode(pKICMPAdapter.getProofOfPossessionMode());
                cMPContext.setSignPubKey(pKICMPAdapter.getPublicKey());
            } else {
                cMPContext.setSignPopMode(pKICMPAdapter.getProofOfPossessionMode());
                cMPContext.setSignPubKey(pKICMPAdapter.getPublicKey());
                throw null;
            }
        }
        if (evid != null) {
            cMPContext.setEVID(evid);
        }
        setFromKeyStore(cMPContext, this.keyStore, str, str2, str4);
        cMPContext.setSenderKID(str5.getBytes());
        cMPContext.setAuthCode(str6.getBytes());
        cMPContext.setURI(this.uri);
        cMPContext.setRequestCertNum(i);
        cMPContext.setIdn(str3);
        cMPContext.setKeysize(this.key_size);
        cMPContext.setSignAlgorithm(this.signAlgorithm);
        cMPContext.setFreeText(this.freeText);
        try {
            PKIMessage pKIMessage = PKIMessageFormatter_YesSign.format(cMPContext, 0, pKICMPAdapter);
            CMPTransport transport = getTransport(cMPContext);
            PKIMessage pKIMessageProcess = transport.process(pKIMessage);
            PKIMessageDump.dumpFile(pKIMessageProcess, "ip_yessign.dump");
            checkMsg(cMPContext, pKIMessageProcess, 1);
            CertRepMessage certRepMessage = (CertRepMessage) pKIMessageProcess.getContentBody();
            if (certRepMessage.nOfResponses() != cMPContext.getRequestCertNum()) {
                throw new CMPException(2, (short) 2004, (short) 100, CMPException.METHOD_requestIR, "expected number of response is only one, but this time[" + certRepMessage.nOfResponses() + "]");
            }
            CertResponse certResponseResponseAt = certRepMessage.responseAt(0);
            checkPKIStatusInfo(certResponseResponseAt.getStatusInfo());
            cMPContext.setSignCertificate(certResponseResponseAt.getIssuedCert());
            if (cMPContext.getRequestCertNum() == 2) {
                CertResponse certResponseResponseAt2 = certRepMessage.responseAt(1);
                checkPKIStatusInfo(certResponseResponseAt2.getStatusInfo());
                EncryptedValue encryptedCert = certResponseResponseAt2.getCertifiedKeyPair().getEncryptedCert();
                DEREncoder dEREncoder = new DEREncoder();
                dEREncoder.encodeOctetString("0123456789012345".getBytes());
                encryptedCert.setSymmAlg(new AlgorithmID("SEEDcbc", dEREncoder.toByteArray()));
                cMPContext.setEncCertificate(new X509CertImpl(encryptedCert.getData(cMPContext.getEncPrivKey())));
            }
            transport.process(PKIMessageFormatter_YesSign.format(cMPContext, 19));
            try {
                Certificate[] certificateArr = {cMPContext.getSignCertificate()};
                PrivateKey signPrivKey = cMPContext.getSignPrivKey();
                if (signPrivKey != null) {
                    this.keyStore.setKeyEntry(str, signPrivKey, str2.toCharArray(), certificateArr);
                } else {
                    this.keyStore.setCertificateEntry(str, certificateArr[0]);
                }
                if (cMPContext.getRequestCertNum() == 2) {
                    Certificate[] certificateArr2 = {cMPContext.getEncCertificate()};
                    PrivateKey encPrivKey = cMPContext.getEncPrivKey();
                    if (encPrivKey != null) {
                        this.keyStore.setKeyEntry(str + ENC_CERT_SURFIX, encPrivKey, str2.toCharArray(), certificateArr2);
                        return;
                    }
                    this.keyStore.setCertificateEntry(str + ENC_CERT_SURFIX, certificateArr2[0]);
                }
            } catch (Exception e) {
                throw new CMPException(3, (short) 3001, (short) 100, CMPException.METHOD_requestIR, "on saving private key and cert into keystore[" + e.toString() + "]");
            }
        } catch (CMPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new CMPException(1, (short) 1005, (short) 100, CMPException.METHOD_requestIR, "on processing IR[" + e3.toString() + "]");
        }
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public void requestKUR(String str, String str2, String str3, int i) throws CMPException, KeyStoreException {
        int i2 = 2 % 2;
        CMPContext cMPContext = new CMPContext(this.version);
        cMPContext.setURI(this.uri);
        cMPContext.setRequestCertNum(i);
        cMPContext.setIdn(str3);
        setFromKeyStore(cMPContext, this.keyStore, str, str2, null);
        try {
            PKIMessage pKIMessage = PKIMessageFormatter_YesSign.format(cMPContext, 7);
            CMPTransport transport = getTransport(cMPContext);
            PKIMessage pKIMessageProcess = transport.process(pKIMessage);
            PKIMessageDump.dumpFile(pKIMessageProcess, "kup_yessign.dump");
            checkMsg(cMPContext, pKIMessageProcess, 8);
            CertRepMessage certRepMessage = (CertRepMessage) pKIMessageProcess.getContentBody();
            if (certRepMessage.nOfResponses() != cMPContext.getRequestCertNum()) {
                throw new CMPException(2, (short) 2004, (short) 100, CMPException.METHOD_requestKUR, "expected number of response is " + cMPContext.getRequestCertNum() + ", but this time[" + certRepMessage.nOfResponses() + "]");
            }
            int i3 = IAuthTabCallbackStub + 29;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                CertResponse certResponseResponseAt = certRepMessage.responseAt(0);
                checkPKIStatusInfo(certResponseResponseAt.getStatusInfo());
                cMPContext.setSignCertificate(certResponseResponseAt.getIssuedCert());
                if (cMPContext.getRequestCertNum() == 4) {
                    CertResponse certResponseResponseAt2 = certRepMessage.responseAt(1);
                    checkPKIStatusInfo(certResponseResponseAt2.getStatusInfo());
                    EncryptedValue encryptedCert = certResponseResponseAt2.getCertifiedKeyPair().getEncryptedCert();
                    DEREncoder dEREncoder = new DEREncoder();
                    dEREncoder.encodeOctetString("0123456789012345".getBytes());
                    encryptedCert.setSymmAlg(new AlgorithmID("SEEDcbc", dEREncoder.toByteArray()));
                    cMPContext.setEncCertificate(new X509CertImpl(encryptedCert.getData(cMPContext.getEncPrivKey())));
                }
            } else {
                CertResponse certResponseResponseAt3 = certRepMessage.responseAt(0);
                checkPKIStatusInfo(certResponseResponseAt3.getStatusInfo());
                cMPContext.setSignCertificate(certResponseResponseAt3.getIssuedCert());
                if (cMPContext.getRequestCertNum() == 2) {
                    CertResponse certResponseResponseAt22 = certRepMessage.responseAt(1);
                    checkPKIStatusInfo(certResponseResponseAt22.getStatusInfo());
                    EncryptedValue encryptedCert2 = certResponseResponseAt22.getCertifiedKeyPair().getEncryptedCert();
                    DEREncoder dEREncoder2 = new DEREncoder();
                    dEREncoder2.encodeOctetString("0123456789012345".getBytes());
                    encryptedCert2.setSymmAlg(new AlgorithmID("SEEDcbc", dEREncoder2.toByteArray()));
                    cMPContext.setEncCertificate(new X509CertImpl(encryptedCert2.getData(cMPContext.getEncPrivKey())));
                }
            }
            transport.process(PKIMessageFormatter_YesSign.format(cMPContext, 19));
            transport.close();
            try {
                this.keyStore.setKeyEntry(str, cMPContext.getSignPrivKey(), str2.toCharArray(), new Certificate[]{cMPContext.getSignCertificate()});
                if (cMPContext.getRequestCertNum() != 2) {
                    int i4 = IAuthTabCallbackStub + 63;
                    asBinder = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 51 / 0;
                        return;
                    }
                    return;
                }
                Certificate[] certificateArr = {cMPContext.getEncCertificate()};
                PrivateKey encPrivKey = cMPContext.getEncPrivKey();
                this.keyStore.setKeyEntry(str + ENC_CERT_SURFIX, encPrivKey, str2.toCharArray(), certificateArr);
            } catch (Exception e) {
                throw new CMPException(3, (short) 3001, (short) 100, CMPException.METHOD_requestKUR, "on saving private key and cert into keystore[" + e.toString() + "]");
            }
        } catch (CMPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new CMPException(1, (short) 1010, (short) 100, CMPException.METHOD_requestKUR, "on processing KUR[" + e3.toString() + "]");
        }
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public int requestGetCACert(String str, String str2, String str3) throws CMPException {
        int i = 2 % 2;
        this.a = str;
        Vector vector = new Vector();
        vector.add(str);
        vector.add(str2);
        vector.add(str3);
        int iIntValue = ((Integer) requestGENM(1, vector).elementAt(0)).intValue();
        int i2 = asBinder + 89;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 67 / 0;
        }
        return iIntValue;
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public int requestPreKUR(String str, String str2) throws CMPException {
        int i = 2 % 2;
        Vector vector = new Vector();
        vector.add(str);
        vector.add(str2);
        int iIntValue = ((Integer) requestGENM(2, vector).elementAt(0)).intValue();
        int i2 = IAuthTabCallbackStub + 111;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected Vector requestGENM(int i, Vector vector) throws Throwable {
        int i2;
        String string;
        int i3 = 2 % 2;
        CMPContext cMPContext = new CMPContext(this.version);
        cMPContext.setURI(this.uri);
        if (i == 1) {
            String str = (String) vector.elementAt(0);
            byte[] bytes = ((String) vector.elementAt(1)).getBytes();
            byte[] bytes2 = ((String) vector.elementAt(2)).getBytes();
            GeneralName generalName = new GeneralName();
            new GeneralName();
            generalName.set(1, " ");
            cMPContext.setSender(generalName);
            cMPContext.setSenderKID(bytes);
            cMPContext.setAuthCode(bytes2);
            cMPContext.setCAAlias(str);
        } else {
            if (i != 2) {
                throw new CMPException(4, (short) 4001, (short) 100, (short) 102, "not supported type");
            }
            setFromKeyStore(cMPContext, this.keyStore, (String) vector.elementAt(0), (String) vector.elementAt(1), null);
            new GeneralName().set(4, "");
            GeneralName generalName2 = new GeneralName();
            generalName2.set(4, "");
            cMPContext.setRecipient(generalName2);
            BigInteger serialNumber = ((X509Certificate) cMPContext.getOldSignCertificate()).getSerialNumber();
            if (this.a.equals("crossCert")) {
                string = serialNumber.toString(16).toUpperCase();
                if (string.length() % 2 != 0) {
                    Object[] objArr = new Object[1];
                    d((char) (Drawable.resolveOpacity(0, 0) + 2307), (ViewConfiguration.getScrollBarSize() >> 8) + 1237317360, new char[]{5818}, new char[]{0, 0, 0, 0}, new char[]{61618, 49142, 841, 39689}, objArr);
                    string = ((String) objArr[0]).intern() + string;
                }
            } else {
                string = serialNumber.toString();
                int i4 = IAuthTabCallbackStub + 81;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            }
            cMPContext.setSenderKID(string.getBytes());
            cMPContext.setRecipientKID(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        }
        cMPContext.setGENMType(i);
        try {
            PKIMessage pKIMessageProcess = getTransport(cMPContext).process(PKIMessageFormatter_YesSign.format(cMPContext, 21));
            parseFreeText(pKIMessageProcess.getHeader().getFreeText().toString());
            PKIMessageDump.dumpFile(pKIMessageProcess, "genp_yessign.dump");
            checkMsg(cMPContext, pKIMessageProcess, 22);
            GeneralMessage generalMessage = (GeneralMessage) pKIMessageProcess.getContentBody();
            Certificate x509CertImpl = null;
            if (i != 1 && i != 2) {
                int i6 = IAuthTabCallbackStub + 39;
                int i7 = i6 % 128;
                asBinder = i7;
                int i8 = i6 % 2;
                int i9 = i7 + 83;
                IAuthTabCallbackStub = i9 % 128;
                int i10 = i9 % 2;
                return null;
            }
            try {
                String[] allTexts = pKIMessageProcess.getHeader().getFreeText().getAllTexts();
                Vector vector2 = new Vector();
                int i11 = 0;
                while (true) {
                    if (i11 >= allTexts.length) {
                        i2 = 1;
                        break;
                    }
                    int i12 = IAuthTabCallbackStub + 79;
                    asBinder = i12 % 128;
                    if (i12 % 2 == 0) {
                        allTexts[i11].indexOf(ENC_CERT_AVAIL);
                        throw null;
                    }
                    if (allTexts[i11].indexOf(ENC_CERT_AVAIL) != -1) {
                        int i13 = asBinder + 47;
                        IAuthTabCallbackStub = i13 % 128;
                        int i14 = i13 % 2;
                        i2 = 2;
                        break;
                    }
                    i11++;
                }
                vector2.add(new Integer(i2));
                X509CertImpl x509CertImpl2 = null;
                int i15 = 0;
                while (i15 < generalMessage.size()) {
                    ASN1OID typeIdAt = generalMessage.getTypeIdAt(i15);
                    byte[] valueAt = generalMessage.getValueAt(i15);
                    if (typeIdAt.getName().equals("caProtEncCert")) {
                        x509CertImpl2 = new X509CertImpl(valueAt);
                    } else if (typeIdAt.get().equals("1.2.410.200005.1.10.1")) {
                        x509CertImpl = new X509CertImpl(valueAt);
                    }
                    i15++;
                    int i16 = IAuthTabCallbackStub + 111;
                    asBinder = i16 % 128;
                    int i17 = i16 % 2;
                }
                if (cMPContext.getCAAlias() == null) {
                    int i18 = IAuthTabCallbackStub + 1;
                    asBinder = i18 % 128;
                    if (i18 % 2 == 0) {
                        cMPContext.setCAAlias("caCertAlias");
                        int i19 = 42 / 0;
                    } else {
                        cMPContext.setCAAlias("caCertAlias");
                    }
                }
                if (x509CertImpl2 != null) {
                    int i20 = IAuthTabCallbackStub + 79;
                    asBinder = i20 % 128;
                    int i21 = i20 % 2;
                    if (x509CertImpl != null) {
                        try {
                            this.keyStore.setCertificateEntry(cMPContext.getCAAlias(), x509CertImpl2);
                            this.keyStore.setCertificateEntry(cMPContext.getCAAlias() + "_enc", x509CertImpl);
                            return vector2;
                        } catch (Exception e) {
                            throw new CMPException(3, (short) 3000, (short) 100, (short) 102, "on saving ca certs[" + e.toString() + "]");
                        }
                    }
                }
                throw new CMPException(1, (short) 1006, (short) 100, (short) 102, "not all ca cert are received");
            } catch (CMPException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new CMPException(1, (short) 1007, (short) 100, (short) 102, "error on processing GENM[" + e3.toString() + "]");
            }
        } catch (CMPException e4) {
            throw e4;
        } catch (Exception e5) {
            throw new CMPException(1, (short) 1007, (short) 100, (short) 102, "on processing IR[" + e5.toString() + "]");
        }
    }

    protected void checkMsg(CMPContext cMPContext, PKIMessage pKIMessage, int i) throws CMPException {
        Object publicKey;
        int i2 = 2 % 2;
        PKIHeader header = pKIMessage.getHeader();
        if (pKIMessage.getContentType() != i) {
            int i3 = asBinder + 69;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0 ? pKIMessage.getContentType() != 23 : pKIMessage.getContentType() != 16) {
                throw new CMPException(6, (short) 2001, (short) 100, (short) 105, "unexpected message body is received. we wanted [" + i + "] but received [" + pKIMessage.getContentType() + "]");
            }
            ErrorMsgContent errorMsgContent = (ErrorMsgContent) pKIMessage.getContentBody();
            String[] errorDetail = errorMsgContent.getErrorDetail();
            StringBuffer stringBuffer = new StringBuffer();
            if (errorDetail != null) {
                int i4 = asBinder + 5;
                IAuthTabCallbackStub = i4 % 128;
                for (i = i4 % 2 != 0 ? 1 : 0; i < errorDetail.length; i++) {
                    stringBuffer.append(errorDetail[i]);
                    if (i != errorDetail.length - 1) {
                        stringBuffer.append(",");
                    }
                }
            }
            throw new CMPException(6, (short) 2003, (short) 100, CMPException.METHOD_throwError, "CA ErrorCode[" + errorMsgContent.getErrorCode() + "]\n" + stringBuffer.toString());
        }
        if (header.getProtectionAlg() == null) {
            int i5 = IAuthTabCallbackStub + 55;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 50 / 0;
                return;
            }
            return;
        }
        if (header.getProtectionAlg().getAlg().equals("1.2.840.113533.7.66.13")) {
            int i7 = IAuthTabCallbackStub + 25;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            publicKey = cMPContext.getAuthCode();
        } else {
            publicKey = cMPContext.getIssuerSignCert().getPublicKey();
            int i9 = asBinder + 123;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
        }
        try {
            CertRepMessage certRepMessage = (CertRepMessage) pKIMessage.getContentBody();
            if (certRepMessage.responseAt(0).getStatus() != 2) {
                if (!pKIMessage.verify(publicKey)) {
                    throw new CMPException(6, (short) 1003, (short) 100, (short) 105, "message verification failed");
                }
                if (!byteCompare(cMPContext.getSenderNonce(), header.getRecipNonce())) {
                    throw new CMPException(6, (short) 1004, (short) 100, (short) 105, "nonce check failed");
                }
                cMPContext.setRecipientNonce(header.getSenderNonce());
                return;
            }
            String[] allTexts = certRepMessage.responseAt(0).getStatusInfo().getStatusString().getAllTexts();
            StringBuffer stringBuffer2 = new StringBuffer();
            while (i < allTexts.length) {
                int i11 = asBinder + 9;
                IAuthTabCallbackStub = i11 % 128;
                if (i11 % 2 != 0) {
                    stringBuffer2.append(allTexts[i]);
                    i += 104;
                } else {
                    stringBuffer2.append(allTexts[i]);
                    i++;
                }
            }
            throw new CMPException(6, (short) 2003, (short) 100, (short) 105, "[" + stringBuffer2.toString() + "]");
        } catch (CMPException e) {
            throw e;
        } catch (Exception e2) {
            throw new CMPException(6, (short) 1011, (short) 100, (short) 105, "message verification failed[" + e2.toString() + "]");
        }
    }

    protected static boolean byteCompare(byte[] bArr, byte[] bArr2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int length = bArr.length;
            int length2 = bArr2.length;
            throw null;
        }
        if (bArr.length != bArr2.length) {
            return false;
        }
        for (int i3 = 0; i3 < bArr.length; i3++) {
            if (bArr[i3] != bArr2[i3]) {
                int i4 = IAuthTabCallbackStub + 95;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        }
        return true;
    }

    protected void checkPKIStatusInfo(PKIStatusInfo pKIStatusInfo) throws CMPException {
        int i;
        String str;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 123;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (pKIStatusInfo.getStatus() == 3) {
            throw new CMPException(1, (short) 1008, (short) 100, CMPException.METHOD_checkPKIStatusInfo, "polling is not supported!");
        }
        if (pKIStatusInfo.getStatus() != 2) {
            if (pKIStatusInfo.getStatus() == 0) {
                int i5 = IAuthTabCallbackStub + 73;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                return;
            } else {
                throw new CMPException(1, (short) 1008, (short) 100, CMPException.METHOD_checkPKIStatusInfo, "this client doesn't support PKIStatus [" + pKIStatusInfo.getStatus() + "]");
            }
        }
        int i7 = IAuthTabCallbackStub + 43;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        if (!(!pKIStatusInfo.hasFailInfo())) {
            int i9 = IAuthTabCallbackStub + 99;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            i = 0;
            while (i < 27) {
                if (pKIStatusInfo.isAReason(i)) {
                    break;
                }
                i++;
                int i11 = asBinder + 31;
                IAuthTabCallbackStub = i11 % 128;
                int i12 = i11 % 2;
            }
            int i13 = asBinder + 73;
            IAuthTabCallbackStub = i13 % 128;
            int i14 = i13 % 2;
            i = -1;
        } else {
            int i132 = asBinder + 73;
            IAuthTabCallbackStub = i132 % 128;
            int i142 = i132 % 2;
            i = -1;
        }
        StringBuilder sb = new StringBuilder("server reject requeset message ");
        if (i == -1) {
            int i15 = asBinder + 49;
            IAuthTabCallbackStub = i15 % 128;
            int i16 = i15 % 2;
            str = "";
        } else {
            str = "reason[" + i + "]";
        }
        sb.append(str);
        throw new CMPException(1, (short) 1008, (short) 100, CMPException.METHOD_checkPKIStatusInfo, sb.toString());
    }

    protected void setFromKeyStore(CMPContext cMPContext, KeyStore keyStore, String str, String str2, String str3) throws CMPException, KeyStoreException {
        int i = 2 % 2;
        if (str3 != null) {
            try {
                if (this.keyStore.isCertificateEntry(str3)) {
                    if (this.keyStore.isKeyEntry(str3)) {
                        throw new CMPException(3, "this is key entry");
                    }
                    X509CertImpl certificate = this.keyStore.getCertificate(str3);
                    cMPContext.setIssuerSignCert(certificate);
                    cMPContext.setRecipientDN(certificate.getSubjectDN().toString());
                    cMPContext.setRecipientKID(new SubjectKeyIdentifier(certificate.getExtensionValue("2.5.29.14")).getKID());
                    Certificate certificate2 = this.keyStore.getCertificate(str3 + ENC_CERT_SURFIX);
                    if (certificate2 == null) {
                        throw new CMPException(3, "no encryption CA cert!");
                    }
                    int i2 = asBinder + 55;
                    IAuthTabCallbackStub = i2 % 128;
                    if (i2 % 2 != 0) {
                        cMPContext.setIssuerEncCert(certificate2);
                        cMPContext.setCAAlias(str3);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    cMPContext.setIssuerEncCert(certificate2);
                    cMPContext.setCAAlias(str3);
                    int i3 = IAuthTabCallbackStub + 123;
                    asBinder = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
            } catch (CMPException e) {
                throw e;
            } catch (Exception e2) {
                throw new CMPException(3, "fail to retrive key pair from keystore[" + e2.toString() + "]");
            }
        }
        if (this.keyStore.isKeyEntry(str)) {
            int i5 = IAuthTabCallbackStub + 49;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            if (str2 != null) {
                X509CertImpl certificate3 = this.keyStore.getCertificate(str);
                cMPContext.setUserAlias(str);
                cMPContext.setOldSignCertificate(certificate3);
                PublicKey publicKey = certificate3.getPublicKey();
                PrivateKey privateKey = (PrivateKey) this.keyStore.getKey(str, str2.toCharArray());
                String name = certificate3.getSubjectDN().getName();
                cMPContext.setSenderKID(new SubjectKeyIdentifier(certificate3.getExtensionValue("2.5.29.14")).getKID());
                cMPContext.setSender(new GeneralName("DN:" + name));
                cMPContext.setOldSignPubKey(publicKey);
                cMPContext.setOldSignPrivKey(privateKey);
                Enumeration<String> enumerationAliases = this.keyStore.aliases();
                while (true) {
                    if (!enumerationAliases.hasMoreElements()) {
                        break;
                    }
                    String strNextElement = enumerationAliases.nextElement();
                    if (this.keyStore.isCertificateEntry(strNextElement)) {
                        int i7 = asBinder + 37;
                        IAuthTabCallbackStub = i7 % 128;
                        int i8 = i7 % 2;
                        X509CertImpl certificate4 = this.keyStore.getCertificate(strNextElement);
                        String string = certificate4.getSubjectDN().toString();
                        String string2 = certificate3.getIssuerDN().toString();
                        int iIndexOf = string.indexOf("O=");
                        String upperCase = string.substring(iIndexOf + 2, string.indexOf(",", iIndexOf)).toUpperCase();
                        int iIndexOf2 = string2.indexOf("O=");
                        if (upperCase.equals(string2.substring(iIndexOf2 + 2, string2.indexOf(",", iIndexOf2)).toUpperCase())) {
                            cMPContext.setIssuerSignCert(certificate4);
                            cMPContext.setRecipientDN(certificate4.getSubjectDN().toString());
                            cMPContext.setRecipientKID(new SubjectKeyIdentifier(certificate4.getExtensionValue("2.5.29.14")).getKID());
                            Certificate certificate5 = this.keyStore.getCertificate(strNextElement + ENC_CERT_SURFIX);
                            if (certificate5 == null) {
                                throw new CMPException(3, "sign cert exist, but no encryption CA cert!");
                            }
                            cMPContext.setIssuerEncCert(certificate5);
                            cMPContext.setCAAlias(strNextElement);
                        }
                    }
                }
                if (!this.keyStore.isKeyEntry(str + ENC_CERT_SURFIX)) {
                    if (cMPContext.getRequestCertNum() == 2) {
                        System.err.println("Waring! request certificate number is 2, but only one available!!");
                        cMPContext.setRequestCertNum(1);
                        return;
                    }
                    return;
                }
                cMPContext.setOldEncCertificate((X509Certificate) this.keyStore.getCertificate(str + ENC_CERT_SURFIX));
                PublicKey publicKey2 = certificate3.getPublicKey();
                PrivateKey privateKey2 = (PrivateKey) this.keyStore.getKey(str + ENC_CERT_SURFIX, str2.toCharArray());
                cMPContext.setOldEncPubKey(publicKey2);
                cMPContext.setOldEncPrivKey(privateKey2);
                return;
            }
        }
        throw new CMPException(3, "no such key or cerfiticate entry");
    }

    public void parseFreeText(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 29;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String[] strArrSplit = str.split("\\$");
        int i4 = 0;
        while (i4 < strArrSplit.length - 1) {
            String[] strArrSplit2 = strArrSplit[i4].split("=");
            this.freeText.put(strArrSplit2[0], strArrSplit2[1]);
            i4++;
            int i5 = IAuthTabCallbackStub + 105;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public void setFreeText(Hashtable hashtable) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.freeText = hashtable;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Hashtable getFreeText() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Hashtable hashtable = this.freeText;
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        return hashtable;
    }

    public void setKeysize(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 79;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        Object obj = null;
        this.key_size = i;
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 115;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public int getKeysize() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 21;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.key_size;
        int i6 = i2 + 85;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setSignAlgorithm(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        this.signAlgorithm = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getSignAlgorithm() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 121;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.signAlgorithm;
        int i5 = i2 + 85;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public byte[] getUserCert(String str) throws Exception {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 28 / 0;
            return ((X509Certificate) this.keyStore.getCertificate(str)).getEncoded();
        }
        return ((X509Certificate) this.keyStore.getCertificate(str)).getEncoded();
    }

    @Override // com.initech.pkix.cmp.client.PKICMPInterface
    public byte[] getUesrPrivateKey(String str, String str2) throws Exception {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return ((PrivateKey) this.keyStore.getKey(str, str2.toCharArray())).getEncoded();
        }
        ((PrivateKey) this.keyStore.getKey(str, str2.toCharArray())).getEncoded();
        throw null;
    }

    public byte[] getEncUserPrivateKey(String str, String str2, String str3) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        byte[] encUserPrivateKey = getEncUserPrivateKey(str, str2, str3.toCharArray());
        int i4 = IAuthTabCallbackStub + 59;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
        return encUserPrivateKey;
    }

    public byte[] getEncUserPrivateKey(String str, String str2, char[] cArr) throws Exception {
        int i = 2 % 2;
        PrivateKeyInfo privateKeyInfo = new PrivateKeyInfo((PrivateKey) this.keyStore.getKey(str, str2.toCharArray()));
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        AlgorithmID algorithmID = new AlgorithmID("1.2.410.200004.1.15");
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("PBE");
        byte[] bArr = new byte[8];
        SecureRandom.getInstance("FIPS186-2Appendix3", "Initech").nextBytes(bArr);
        algorithmParameters.init((AlgorithmParameterSpec) new PBEParameterSpec(bArr, 2048));
        algorithmID.setParameter(algorithmParameters.getEncoded());
        byte[] encoded = new EncryptedPrivateKeyInfo(privateKeyInfo, pBEKeySpec, algorithmID).getEncoded();
        pBEKeySpec.clearPassword();
        int i2 = IAuthTabCallbackStub + 47;
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
            int i2 = asBinder + 95;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (iAvailable >= Integer.MIN_VALUE) {
                byte[] bArr = new byte[iAvailable];
                dataInputStream.readFully(bArr);
                try {
                    try {
                        PrivateKey privateKeyDecrypt = new EncryptedPrivateKeyInfo(bArr).decrypt(new PBEKeySpec(cArr));
                        try {
                            dataInputStream.close();
                        } catch (Exception unused) {
                        }
                        return privateKeyDecrypt;
                    } catch (Throwable th) {
                        try {
                            dataInputStream.close();
                            int i3 = asBinder + 77;
                            IAuthTabCallbackStub = i3 % 128;
                            if (i3 % 2 != 0) {
                                int i4 = 5 % 3;
                            }
                        } catch (Exception unused2) {
                        }
                        throw th;
                    }
                } catch (BadPaddingException unused3) {
                    throw new CMPException(1, (short) 1012, (short) 100, CMPException.METHOD_loadPrivateKey, "password is not matched");
                }
            }
        }
        try {
            dataInputStream.close();
            int i5 = asBinder + 51;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        } catch (Exception unused4) {
        }
        throw new Exception();
    }

    static void IAuthTabCallback() {
        onExtraCallback = 7798559133331975163L;
        onWarmupCompleted = 740774518;
        onNavigationEvent = (char) 27643;
    }
}
