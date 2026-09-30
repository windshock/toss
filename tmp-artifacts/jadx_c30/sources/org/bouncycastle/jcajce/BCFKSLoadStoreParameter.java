package org.bouncycastle.jcajce;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import org.bouncycastle.crypto.util.PBKDF2Config;
import org.bouncycastle.crypto.util.PBKDFConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class BCFKSLoadStoreParameter extends BCLoadStoreParameter {
    private final X509Certificate[] certificates;
    private final EncryptionAlgorithm encAlg;
    private final MacAlgorithm macAlg;
    private final SignatureAlgorithm sigAlg;
    private final Key sigKey;
    private final PBKDFConfig storeConfig;
    private final CertChainValidator validator;

    public static class Builder {
        private X509Certificate[] certs;
        private EncryptionAlgorithm encAlg;
        private final InputStream in;
        private MacAlgorithm macAlg;
        private final OutputStream out;
        private final KeyStore.ProtectionParameter protectionParameter;
        private SignatureAlgorithm sigAlg;
        private final Key sigKey;
        private PBKDFConfig storeConfig;
        private CertChainValidator validator;

        public Builder() {
            this((OutputStream) null, (KeyStore.ProtectionParameter) null);
        }

        public Builder(InputStream inputStream, KeyStore.ProtectionParameter protectionParameter) {
            this.storeConfig = new PBKDF2Config.Builder().withIterationCount(16384).withSaltLength(64).withPRF(PBKDF2Config.PRF_SHA512).build();
            this.encAlg = EncryptionAlgorithm.AES256_CCM;
            this.macAlg = MacAlgorithm.HmacSHA512;
            this.sigAlg = SignatureAlgorithm.SHA512withECDSA;
            this.certs = null;
            this.in = inputStream;
            this.out = null;
            this.protectionParameter = protectionParameter;
            this.sigKey = null;
        }

        public Builder(InputStream inputStream, PublicKey publicKey) {
            this.storeConfig = new PBKDF2Config.Builder().withIterationCount(16384).withSaltLength(64).withPRF(PBKDF2Config.PRF_SHA512).build();
            this.encAlg = EncryptionAlgorithm.AES256_CCM;
            this.macAlg = MacAlgorithm.HmacSHA512;
            this.sigAlg = SignatureAlgorithm.SHA512withECDSA;
            this.certs = null;
            this.in = inputStream;
            this.out = null;
            this.protectionParameter = null;
            this.sigKey = publicKey;
        }

        public Builder(InputStream inputStream, CertChainValidator certChainValidator) {
            this.storeConfig = new PBKDF2Config.Builder().withIterationCount(16384).withSaltLength(64).withPRF(PBKDF2Config.PRF_SHA512).build();
            this.encAlg = EncryptionAlgorithm.AES256_CCM;
            this.macAlg = MacAlgorithm.HmacSHA512;
            this.sigAlg = SignatureAlgorithm.SHA512withECDSA;
            this.certs = null;
            this.in = inputStream;
            this.out = null;
            this.protectionParameter = null;
            this.validator = certChainValidator;
            this.sigKey = null;
        }

        public Builder(InputStream inputStream, char[] cArr) {
            this(inputStream, new KeyStore.PasswordProtection(cArr));
        }

        public Builder(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter) {
            this.storeConfig = new PBKDF2Config.Builder().withIterationCount(16384).withSaltLength(64).withPRF(PBKDF2Config.PRF_SHA512).build();
            this.encAlg = EncryptionAlgorithm.AES256_CCM;
            this.macAlg = MacAlgorithm.HmacSHA512;
            this.sigAlg = SignatureAlgorithm.SHA512withECDSA;
            this.certs = null;
            this.in = null;
            this.out = outputStream;
            this.protectionParameter = protectionParameter;
            this.sigKey = null;
        }

        public Builder(OutputStream outputStream, PrivateKey privateKey) {
            this.storeConfig = new PBKDF2Config.Builder().withIterationCount(16384).withSaltLength(64).withPRF(PBKDF2Config.PRF_SHA512).build();
            this.encAlg = EncryptionAlgorithm.AES256_CCM;
            this.macAlg = MacAlgorithm.HmacSHA512;
            this.sigAlg = SignatureAlgorithm.SHA512withECDSA;
            this.certs = null;
            this.in = null;
            this.out = outputStream;
            this.protectionParameter = null;
            this.sigKey = privateKey;
        }

        public Builder(OutputStream outputStream, char[] cArr) {
            this(outputStream, new KeyStore.PasswordProtection(cArr));
        }

        public BCFKSLoadStoreParameter build() {
            return new BCFKSLoadStoreParameter(this);
        }

        public Builder withCertificates(X509Certificate[] x509CertificateArr) {
            int length = x509CertificateArr.length;
            X509Certificate[] x509CertificateArr2 = new X509Certificate[length];
            System.arraycopy(x509CertificateArr, 0, x509CertificateArr2, 0, length);
            this.certs = x509CertificateArr2;
            return this;
        }

        public Builder withStoreEncryptionAlgorithm(EncryptionAlgorithm encryptionAlgorithm) {
            this.encAlg = encryptionAlgorithm;
            return this;
        }

        public Builder withStoreMacAlgorithm(MacAlgorithm macAlgorithm) {
            this.macAlg = macAlgorithm;
            return this;
        }

        public Builder withStorePBKDFConfig(PBKDFConfig pBKDFConfig) {
            this.storeConfig = pBKDFConfig;
            return this;
        }

        public Builder withStoreSignatureAlgorithm(SignatureAlgorithm signatureAlgorithm) {
            this.sigAlg = signatureAlgorithm;
            return this;
        }
    }

    public interface CertChainValidator {
        boolean isValid(X509Certificate[] x509CertificateArr);
    }

    public enum MacAlgorithm {
        HmacSHA512,
        HmacSHA3_512
    }

    public enum SignatureAlgorithm {
        SHA512withDSA,
        SHA3_512withDSA,
        SHA512withECDSA,
        SHA3_512withECDSA,
        SHA512withRSA,
        SHA3_512withRSA
    }

    private BCFKSLoadStoreParameter(Builder builder) {
        super(builder.in, builder.out, builder.protectionParameter);
        this.storeConfig = builder.storeConfig;
        this.encAlg = builder.encAlg;
        this.macAlg = builder.macAlg;
        this.sigAlg = builder.sigAlg;
        this.sigKey = builder.sigKey;
        this.certificates = builder.certs;
        this.validator = builder.validator;
    }

    public CertChainValidator getCertChainValidator() {
        return this.validator;
    }

    public X509Certificate[] getStoreCertificates() {
        return this.certificates;
    }

    public EncryptionAlgorithm getStoreEncryptionAlgorithm() {
        return this.encAlg;
    }

    public MacAlgorithm getStoreMacAlgorithm() {
        return this.macAlg;
    }

    public PBKDFConfig getStorePBKDFConfig() {
        return this.storeConfig;
    }

    public SignatureAlgorithm getStoreSignatureAlgorithm() {
        return this.sigAlg;
    }

    public Key getStoreSignatureKey() {
        return this.sigKey;
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AES256_CCM' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class EncryptionAlgorithm {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EncryptionAlgorithm[] $VALUES;
        public static final EncryptionAlgorithm AES256_CCM;
        public static final EncryptionAlgorithm AES256_KWP;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int[] onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            onExtraCallback();
            Object[] objArr = new Object[1];
            a(new int[]{1723494320, -158827983, -699325470, -1608593127, 249418373, 1057278790}, (-16777206) - Color.rgb(0, 0, 0), objArr);
            EncryptionAlgorithm encryptionAlgorithm = new EncryptionAlgorithm(((String) objArr[0]).intern(), 0);
            AES256_CCM = encryptionAlgorithm;
            Object[] objArr2 = new Object[1];
            a(new int[]{1723494320, -158827983, 500897684, -1958197397, 271365482, 952137696}, Drawable.resolveOpacity(0, 0) + 10, objArr2);
            EncryptionAlgorithm encryptionAlgorithm2 = new EncryptionAlgorithm(((String) objArr2[0]).intern(), 1);
            AES256_KWP = encryptionAlgorithm2;
            $VALUES = new EncryptionAlgorithm[]{encryptionAlgorithm, encryptionAlgorithm2};
            int i = onExtraCallback + 83;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private EncryptionAlgorithm(String str, int i) {
        }

        public static EncryptionAlgorithm valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            EncryptionAlgorithm encryptionAlgorithm = (EncryptionAlgorithm) Enum.valueOf(EncryptionAlgorithm.class, str);
            int i4 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return encryptionAlgorithm;
        }

        public static EncryptionAlgorithm[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            EncryptionAlgorithm[] encryptionAlgorithmArr = (EncryptionAlgorithm[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return encryptionAlgorithmArr;
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = onNavigationEvent;
            int i5 = -1469660336;
            int i6 = 16;
            if (iArr3 != null) {
                int i7 = $11 + 19;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i2 = 1;
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i2 = 0;
                }
                while (i2 < length) {
                    int i8 = $11 + 39;
                    $10 = i8 % 128;
                    if (i8 % i3 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr3[i2])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> i6), Process.getGidForName(BuildConfig.FLAVOR) + 73, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr2[i2] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                            i2 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(iArr3[i2])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (Process.myPid() >> 22) + 72, 8848 - (Process.myPid() >> 22), -1725547072, false, "h", new Class[]{Integer.TYPE});
                            }
                            iArr2[i2] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                            i2++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i3 = 2;
                    i6 = 16;
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = onNavigationEvent;
            float f = 0.0f;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i9 = 0;
                while (i9 < length3) {
                    int i10 = $11 + 43;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    Object[] objArr4 = {Integer.valueOf(iArr5[i9])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), 72 - (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), 8848 - Color.red(0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i9++;
                    i5 = -1469660336;
                    f = 0.0f;
                }
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                int i12 = 0;
                for (int i13 = 16; i12 < i13; i13 = 16) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 22252), 39 - View.getDefaultSize(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i12++;
                }
                int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 4033), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 77, View.MeasureSpec.getSize(0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            String str = new String(cArr2, 0, i);
            int i17 = $10 + 7;
            $11 = i17 % 128;
            if (i17 % 2 != 0) {
                objArr[0] = str;
            } else {
                int i18 = 55 / 0;
                objArr[0] = str;
            }
        }

        static void onExtraCallback() {
            onNavigationEvent = new int[]{-808126834, 1217940332, 425096382, -1814301795, -1015772059, -1597248138, -861879231, 1764457849, 223370718, 2036838093, 1343989523, -314906024, -2077890880, 603092261, -1654621363, -753731093, -1827626347, 1605880147};
        }
    }
}
