package org.bouncycastle.openssl;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cert.X509AttributeCertificateHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfo;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.io.pem.PemGenerationException;
import org.bouncycastle.util.io.pem.PemHeader;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemObjectGenerator;
import org.jmrtd.lds.CVCAFile;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class MiscPEMGenerator implements PemObjectGenerator {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static final ASN1ObjectIdentifier[] dsaOids;
    private static final byte[] hexEncodingTable;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;
    private final PEMEncryptor encryptor;
    private final Object obj;

    static {
        onNavigationEvent();
        dsaOids = new ASN1ObjectIdentifier[]{X9ObjectIdentifiers.id_dsa, OIWObjectIdentifiers.dsaWithSHA1};
        hexEncodingTable = new byte[]{ISO7816.INS_DECREASE, 49, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 65, CVCAFile.CAR_TAG, 67, ISO7816.INS_REHABILITATE_CHV, 69, 70};
        int i = IAuthTabCallbackDefault + 111;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MiscPEMGenerator(Object obj) {
        this.obj = obj;
        this.encryptor = null;
    }

    public MiscPEMGenerator(Object obj, PEMEncryptor pEMEncryptor) {
        this.obj = obj;
        this.encryptor = pEMEncryptor;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.util.io.pem.PemGenerationException */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private PemObject createPemObject(Object obj) throws Throwable {
        byte[] encoded;
        String strIntern;
        int i = 2 % 2;
        if (obj instanceof PemObject) {
            int i2 = asBinder + 53;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return (PemObject) obj;
        }
        if (obj instanceof PemObjectGenerator) {
            return ((PemObjectGenerator) obj).generate();
        }
        if (obj instanceof X509CertificateHolder) {
            encoded = ((X509CertificateHolder) obj).getEncoded();
            strIntern = PEMParser.TYPE_CERTIFICATE;
        } else if (!(!(obj instanceof X509CRLHolder))) {
            encoded = ((X509CRLHolder) obj).getEncoded();
            strIntern = PEMParser.TYPE_X509_CRL;
        } else if (obj instanceof X509TrustedCertificateBlock) {
            encoded = ((X509TrustedCertificateBlock) obj).getEncoded();
            strIntern = PEMParser.TYPE_TRUSTED_CERTIFICATE;
        } else if (obj instanceof PrivateKeyInfo) {
            PrivateKeyInfo privateKeyInfo = (PrivateKeyInfo) obj;
            ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
            if (algorithm.equals(PKCSObjectIdentifiers.rsaEncryption)) {
                encoded = privateKeyInfo.parsePrivateKey().toASN1Primitive().getEncoded();
                Object[] objArr = new Object[1];
                a(new char[]{2591, 18755, 35889, 198, 45235, 11813, 16009, 52758, 58592, 11581, 61542, 63175, 7382, 40736, 25068, 29053}, 15 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
                strIntern = ((String) objArr[0]).intern();
            } else {
                ASN1Primitive[] aSN1PrimitiveArr = dsaOids;
                if (!algorithm.equals(aSN1PrimitiveArr[0])) {
                    int i4 = asInterface + 75;
                    asBinder = i4 % 128;
                    if (i4 % 2 == 0 ? algorithm.equals(aSN1PrimitiveArr[1]) : algorithm.equals(aSN1PrimitiveArr[1])) {
                        DSAParameter dSAParameter = DSAParameter.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
                        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                        aSN1EncodableVector.add(new ASN1Integer(0L));
                        aSN1EncodableVector.add(new ASN1Integer(dSAParameter.getP()));
                        aSN1EncodableVector.add(new ASN1Integer(dSAParameter.getQ()));
                        aSN1EncodableVector.add(new ASN1Integer(dSAParameter.getG()));
                        BigInteger value = ASN1Integer.getInstance(privateKeyInfo.parsePrivateKey()).getValue();
                        aSN1EncodableVector.add(new ASN1Integer(dSAParameter.getG().modPow(value, dSAParameter.getP())));
                        aSN1EncodableVector.add(new ASN1Integer(value));
                        encoded = new DERSequence(aSN1EncodableVector).getEncoded();
                        strIntern = PEMParser.TYPE_DSA_PRIVATE_KEY;
                    } else {
                        int i5 = asBinder + 61;
                        asInterface = i5 % 128;
                        int i6 = i5 % 2;
                        if (algorithm.equals(X9ObjectIdentifiers.id_ecPublicKey)) {
                            int i7 = asInterface + 53;
                            asBinder = i7 % 128;
                            int i8 = i7 % 2;
                            encoded = privateKeyInfo.parsePrivateKey().toASN1Primitive().getEncoded();
                            strIntern = PEMParser.TYPE_EC_PRIVATE_KEY;
                        } else {
                            encoded = privateKeyInfo.getEncoded();
                            strIntern = PEMParser.TYPE_PRIVATE_KEY;
                        }
                    }
                }
            }
        } else if (obj instanceof SubjectPublicKeyInfo) {
            int i9 = asInterface + 95;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            encoded = ((SubjectPublicKeyInfo) obj).getEncoded();
            strIntern = PEMParser.TYPE_PUBLIC_KEY;
        } else if (obj instanceof X509AttributeCertificateHolder) {
            encoded = ((X509AttributeCertificateHolder) obj).getEncoded();
            strIntern = PEMParser.TYPE_ATTRIBUTE_CERTIFICATE;
        } else if (obj instanceof PKCS10CertificationRequest) {
            int i11 = asInterface + 93;
            asBinder = i11 % 128;
            PKCS10CertificationRequest pKCS10CertificationRequest = (PKCS10CertificationRequest) obj;
            if (i11 % 2 != 0) {
                pKCS10CertificationRequest.getEncoded();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            encoded = pKCS10CertificationRequest.getEncoded();
            strIntern = PEMParser.TYPE_CERTIFICATE_REQUEST;
        } else if (obj instanceof PKCS8EncryptedPrivateKeyInfo) {
            int i12 = asInterface + 119;
            asBinder = i12 % 128;
            int i13 = i12 % 2;
            encoded = ((PKCS8EncryptedPrivateKeyInfo) obj).getEncoded();
            strIntern = PEMParser.TYPE_ENCRYPTED_PRIVATE_KEY;
        } else {
            if (!(obj instanceof ContentInfo)) {
                throw new PemGenerationException("unknown object passed - can't encode.");
            }
            encoded = ((ContentInfo) obj).getEncoded();
            strIntern = PEMParser.TYPE_PKCS7;
        }
        PEMEncryptor pEMEncryptor = this.encryptor;
        if (pEMEncryptor == null) {
            return new PemObject(strIntern, encoded);
        }
        String upperCase = Strings.toUpperCase(pEMEncryptor.getAlgorithm());
        if (upperCase.equals("DESEDE")) {
            int i14 = asInterface + 95;
            asBinder = i14 % 128;
            int i15 = i14 % 2;
            upperCase = "DES-EDE3-CBC";
        }
        byte[] iv = this.encryptor.getIV();
        byte[] bArrEncrypt = this.encryptor.encrypt(encoded);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new PemHeader("Proc-Type", "4,ENCRYPTED"));
        arrayList.add(new PemHeader("DEK-Info", upperCase + "," + getHexEncoded(iv)));
        return new PemObject(strIntern, arrayList, bArrEncrypt);
    }

    private String getHexEncoded(byte[] bArr) throws IOException {
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 67;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            cArr = new char[bArr.length];
            i = 1;
        } else {
            cArr = new char[bArr.length << 1];
            i = 0;
        }
        while (i != bArr.length) {
            int i4 = asBinder + 119;
            int i5 = i4 % 128;
            asInterface = i5;
            int i6 = i4 % 2;
            byte b = bArr[i];
            int i7 = i << 1;
            byte[] bArr2 = hexEncodingTable;
            cArr[i7] = (char) bArr2[(b & 255) >>> 4];
            cArr[i7 + 1] = (char) bArr2[b & 15];
            i++;
            int i8 = i5 + 17;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
        }
        String str = new String(cArr);
        int i10 = asBinder + 61;
        asInterface = i10 % 128;
        if (i10 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.util.io.pem.PemGenerationException */
    public PemObject generate() throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        try {
            PemObject pemObjectCreatePemObject = createPemObject(this.obj);
            int i4 = asInterface + 41;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return pemObjectCreatePemObject;
        } catch (IOException e) {
            throw new PemGenerationException("encoding exception: " + e.getMessage(), e);
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i6 = (c2 + i4) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i7 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i7);
                    objArr2[1] = Integer.valueOf(i6);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(i3, i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == 0L ? 0 : -1)));
                        int capsMode = 10 - TextUtils.getCapsMode(BuildConfig.FLAVOR, i3, i3);
                        int i8 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12433;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, capsMode, i8, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9, 12434 - (Process.myPid() >> 22), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), View.resolveSize(0, 0) + 14, TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i9 = $11 + 109;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i11 = $10 + 93;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        objArr[0] = str;
    }

    static void onNavigationEvent() {
        IAuthTabCallback = (char) 3974;
        onWarmupCompleted = (char) 34599;
        onExtraCallback = (char) 28169;
        onNavigationEvent = (char) 2736;
    }
}
