package org.bouncycastle.pkcs.jcajce;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.misc.ScryptParams;
import org.bouncycastle.asn1.pkcs.EncryptionScheme;
import org.bouncycastle.asn1.pkcs.KeyDerivationFunc;
import org.bouncycastle.asn1.pkcs.PBES2Parameters;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.util.PBKDF2Config;
import org.bouncycastle.crypto.util.PBKDFConfig;
import org.bouncycastle.crypto.util.ScryptConfig;
import org.bouncycastle.jcajce.PKCS12KeyWithParameters;
import org.bouncycastle.jcajce.io.CipherOutputStream;
import org.bouncycastle.jcajce.spec.ScryptKeySpec;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.AlgorithmNameFinder;
import org.bouncycastle.operator.DefaultAlgorithmNameFinder;
import org.bouncycastle.operator.DefaultSecretKeySizeProvider;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.OutputEncryptor;
import org.bouncycastle.operator.SecretKeySizeProvider;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class JcePKCSPBEOutputEncryptorBuilder {
    private ASN1ObjectIdentifier algorithm;
    private AlgorithmNameFinder algorithmNameFinder;
    private JcaJceHelper helper;
    private int iterationCount;
    private ASN1ObjectIdentifier keyEncAlgorithm;
    private SecretKeySizeProvider keySizeProvider;
    private final PBKDFConfig pbkdf;
    private PBKDF2Config.Builder pbkdfBuilder;
    private SecureRandom random;
    private static final byte[] $$a = {115, 30, 119, 102};
    private static final int $$b = 18;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent = 478308987;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, int i2) {
        int i3;
        int i4;
        int i5 = 4 - (s * 4);
        int i6 = 105 - (i2 * 4);
        byte[] bArr = $$a;
        int i7 = i * 2;
        byte[] bArr2 = new byte[1 - i7];
        int i8 = 0 - i7;
        if (bArr == null) {
            int i9 = i8;
            i4 = i5;
            i3 = 0;
            i5 += -i9;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == i8) {
                return new String(bArr2, 0);
            }
            i3++;
            i9 = bArr[i4];
            i5 += -i9;
            i4++;
            bArr2[i3] = (byte) i5;
            if (i3 == i8) {
            }
        } else {
            i3 = 0;
            i4 = i5;
            i5 = i6;
            bArr2[i3] = (byte) i5;
            if (i3 == i8) {
            }
        }
    }

    public JcePKCSPBEOutputEncryptorBuilder(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.helper = new DefaultJcaJceHelper();
        this.keySizeProvider = DefaultSecretKeySizeProvider.INSTANCE;
        this.algorithmNameFinder = new DefaultAlgorithmNameFinder();
        this.iterationCount = 1024;
        this.pbkdfBuilder = new PBKDF2Config.Builder();
        this.pbkdf = null;
        if (isPKCS12(aSN1ObjectIdentifier)) {
            this.algorithm = aSN1ObjectIdentifier;
        } else {
            this.algorithm = PKCSObjectIdentifiers.id_PBES2;
            int i = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        this.keyEncAlgorithm = aSN1ObjectIdentifier;
        int i4 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public JcePKCSPBEOutputEncryptorBuilder(PBKDFConfig pBKDFConfig, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.helper = new DefaultJcaJceHelper();
        this.keySizeProvider = DefaultSecretKeySizeProvider.INSTANCE;
        this.algorithmNameFinder = new DefaultAlgorithmNameFinder();
        this.iterationCount = 1024;
        this.pbkdfBuilder = new PBKDF2Config.Builder();
        this.algorithm = PKCSObjectIdentifiers.id_PBES2;
        this.pbkdf = pBKDFConfig;
        this.keyEncAlgorithm = aSN1ObjectIdentifier;
    }

    private static byte[] PKCS12PasswordToBytes(char[] cArr) {
        int i = 2 % 2;
        int i2 = 0;
        if (cArr == null || cArr.length <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[(cArr.length + 1) << 1];
        while (i2 != cArr.length) {
            int i3 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                char c = cArr[i2];
                bArr[i2] = (byte) (c - '\\');
                bArr[i2 >> 1] = (byte) c;
                i2 += 75;
            } else {
                int i4 = i2 << 1;
                char c2 = cArr[i2];
                bArr[i4] = (byte) (c2 >>> '\b');
                bArr[i4 + 1] = (byte) c2;
                i2++;
            }
        }
        int i5 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    private static byte[] PKCS5PasswordToBytes(char[] cArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = 0;
        if (cArr == null) {
            return new byte[0];
        }
        int length = cArr.length;
        byte[] bArr = new byte[length];
        int i6 = i3 + 31;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 4 % 4;
        }
        while (i5 != length) {
            int i8 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                bArr[i5] = (byte) cArr[i5];
                i5 += 42;
            } else {
                bArr[i5] = (byte) cArr[i5];
                i5++;
            }
        }
        return bArr;
    }

    static /* synthetic */ boolean access$000(JcePKCSPBEOutputEncryptorBuilder jcePKCSPBEOutputEncryptorBuilder, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsPKCS12 = jcePKCSPBEOutputEncryptorBuilder.isPKCS12(aSN1ObjectIdentifier);
        int i4 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zIsPKCS12;
        }
        throw null;
    }

    static /* synthetic */ byte[] access$100(char[] cArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return PKCS12PasswordToBytes(cArr);
        }
        PKCS12PasswordToBytes(cArr);
        throw null;
    }

    static /* synthetic */ byte[] access$200(char[] cArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrPKCS5PasswordToBytes = PKCS5PasswordToBytes(cArr);
        int i4 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return bArrPKCS5PasswordToBytes;
    }

    private boolean isPKCS12(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i = 2 % 2;
        if (!aSN1ObjectIdentifier.on(PKCSObjectIdentifiers.pkcs_12PbeIds) && !aSN1ObjectIdentifier.on(BCObjectIdentifiers.bc_pbe_sha1_pkcs12)) {
            int i2 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!aSN1ObjectIdentifier.on(BCObjectIdentifiers.bc_pbe_sha256_pkcs12)) {
                int i4 = IAuthTabCallback + 123;
                onExtraCallbackWithResult = i4 % 128;
                return i4 % 2 != 0;
            }
        }
        int i5 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private SecretKey simplifyPbeKey(SecretKey secretKey) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this.algorithmNameFinder.hasAlgorithmName(this.keyEncAlgorithm)) {
            String algorithmName = this.algorithmNameFinder.getAlgorithmName(this.keyEncAlgorithm);
            Object[] objArr = new Object[1];
            a(4 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1, new char[]{65533, 65529, 11}, true, 154 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
            if (algorithmName.indexOf(((String) objArr[0]).intern()) >= 0) {
                byte[] encoded = secretKey.getEncoded();
                Object[] objArr2 = new Object[1];
                a(Color.red(0) + 3, 2 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{65533, 65529, 11}, true, 154 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
                SecretKeySpec secretKeySpec = new SecretKeySpec(encoded, ((String) objArr2[0]).intern());
                int i4 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return secretKeySpec;
            }
        }
        return secretKey;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.bouncycastle.operator.OperatorCreationException */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OutputEncryptor build(final char[] cArr) throws InvalidKeySpecException, OperatorCreationException, InvalidKeyException {
        final AlgorithmIdentifier algorithmIdentifier;
        final Cipher cipherCreateCipher;
        PBES2Parameters pBES2Parameters;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 46 / 0;
            if (this.random == null) {
                this.random = new SecureRandom();
            }
        } else if (this.random == null) {
        }
        try {
            if (isPKCS12(this.algorithm)) {
                byte[] bArr = new byte[20];
                this.random.nextBytes(bArr);
                cipherCreateCipher = this.helper.createCipher(this.algorithm.getId());
                cipherCreateCipher.init(1, new PKCS12KeyWithParameters(cArr, bArr, this.iterationCount));
                algorithmIdentifier = new AlgorithmIdentifier(this.algorithm, new PKCS12PBEParams(bArr, this.iterationCount));
            } else {
                if (!this.algorithm.equals(PKCSObjectIdentifiers.id_PBES2)) {
                    throw new OperatorCreationException("unrecognised algorithm");
                }
                PBKDFConfig pBKDFConfigBuild = this.pbkdf;
                if (pBKDFConfigBuild == null) {
                    pBKDFConfigBuild = this.pbkdfBuilder.build();
                }
                ASN1ObjectIdentifier aSN1ObjectIdentifier = MiscObjectIdentifiers.id_scrypt;
                if (aSN1ObjectIdentifier.equals(pBKDFConfigBuild.getAlgorithm())) {
                    ScryptConfig scryptConfig = (ScryptConfig) pBKDFConfigBuild;
                    byte[] bArr2 = new byte[scryptConfig.getSaltLength()];
                    this.random.nextBytes(bArr2);
                    ScryptParams scryptParams = new ScryptParams(bArr2, scryptConfig.getCostParameter(), scryptConfig.getBlockSize(), scryptConfig.getParallelizationParameter());
                    SecretKey secretKeyGenerateSecret = this.helper.createSecretKeyFactory("SCRYPT").generateSecret(new ScryptKeySpec(cArr, bArr2, scryptConfig.getCostParameter(), scryptConfig.getBlockSize(), scryptConfig.getParallelizationParameter(), this.keySizeProvider.getKeySize(new AlgorithmIdentifier(this.keyEncAlgorithm))));
                    Cipher cipherCreateCipher2 = this.helper.createCipher(this.keyEncAlgorithm.getId());
                    cipherCreateCipher2.init(1, simplifyPbeKey(secretKeyGenerateSecret), this.random);
                    if (cipherCreateCipher2.getParameters() != null) {
                        pBES2Parameters = new PBES2Parameters(new KeyDerivationFunc(aSN1ObjectIdentifier, scryptParams), new EncryptionScheme(this.keyEncAlgorithm, ASN1Primitive.fromByteArray(cipherCreateCipher2.getParameters().getEncoded())));
                        int i4 = IAuthTabCallback + 65;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 4 / 5;
                        }
                    } else {
                        pBES2Parameters = new PBES2Parameters(new KeyDerivationFunc(aSN1ObjectIdentifier, scryptParams), new EncryptionScheme(this.keyEncAlgorithm));
                    }
                    algorithmIdentifier = new AlgorithmIdentifier(this.algorithm, pBES2Parameters);
                    cipherCreateCipher = cipherCreateCipher2;
                } else {
                    PBKDF2Config pBKDF2Config = (PBKDF2Config) pBKDFConfigBuild;
                    byte[] bArr3 = new byte[pBKDF2Config.getSaltLength()];
                    this.random.nextBytes(bArr3);
                    SecretKey secretKeyGenerateSecret2 = this.helper.createSecretKeyFactory(JceUtils.getAlgorithm(pBKDF2Config.getPRF().getAlgorithm())).generateSecret(new PBEKeySpec(cArr, bArr3, pBKDF2Config.getIterationCount(), this.keySizeProvider.getKeySize(new AlgorithmIdentifier(this.keyEncAlgorithm))));
                    Cipher cipherCreateCipher3 = this.helper.createCipher(this.keyEncAlgorithm.getId());
                    cipherCreateCipher3.init(1, simplifyPbeKey(secretKeyGenerateSecret2), this.random);
                    algorithmIdentifier = new AlgorithmIdentifier(this.algorithm, cipherCreateCipher3.getParameters() != null ? new PBES2Parameters(new KeyDerivationFunc(PKCSObjectIdentifiers.id_PBKDF2, new PBKDF2Params(bArr3, pBKDF2Config.getIterationCount(), pBKDF2Config.getPRF())), new EncryptionScheme(this.keyEncAlgorithm, ASN1Primitive.fromByteArray(cipherCreateCipher3.getParameters().getEncoded()))) : new PBES2Parameters(new KeyDerivationFunc(PKCSObjectIdentifiers.id_PBKDF2, new PBKDF2Params(bArr3, pBKDF2Config.getIterationCount(), pBKDF2Config.getPRF())), new EncryptionScheme(this.keyEncAlgorithm)));
                    cipherCreateCipher = cipherCreateCipher3;
                }
            }
            return new OutputEncryptor() { // from class: org.bouncycastle.pkcs.jcajce.JcePKCSPBEOutputEncryptorBuilder.1
                @Override // org.bouncycastle.operator.OutputEncryptor
                public AlgorithmIdentifier getAlgorithmIdentifier() {
                    return algorithmIdentifier;
                }

                @Override // org.bouncycastle.operator.OutputEncryptor
                public GenericKey getKey() {
                    return JcePKCSPBEOutputEncryptorBuilder.access$000(JcePKCSPBEOutputEncryptorBuilder.this, algorithmIdentifier.getAlgorithm()) ? new GenericKey(algorithmIdentifier, JcePKCSPBEOutputEncryptorBuilder.access$100(cArr)) : new GenericKey(algorithmIdentifier, JcePKCSPBEOutputEncryptorBuilder.access$200(cArr));
                }

                @Override // org.bouncycastle.operator.OutputEncryptor
                public OutputStream getOutputStream(OutputStream outputStream) {
                    return new CipherOutputStream(outputStream, cipherCreateCipher);
                }
            };
        } catch (Exception e) {
            throw new OperatorCreationException("unable to create OutputEncryptor: " + e.getMessage(), e);
        }
    }

    public JcePKCSPBEOutputEncryptorBuilder setIterationCount(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        if (this.pbkdf != null) {
            throw new IllegalStateException("set iteration count using PBKDFDef");
        }
        int i6 = i3 + 25;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        this.iterationCount = i;
        this.pbkdfBuilder.withIterationCount(i);
        int i8 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 94 / 0;
        }
        return this;
    }

    public JcePKCSPBEOutputEncryptorBuilder setKeySizeProvider(SecretKeySizeProvider secretKeySizeProvider) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        this.keySizeProvider = secretKeySizeProvider;
        int i5 = i3 + 91;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public JcePKCSPBEOutputEncryptorBuilder setPRF(AlgorithmIdentifier algorithmIdentifier) {
        int i = 2 % 2;
        if (this.pbkdf != null) {
            throw new IllegalStateException("set PRF count using PBKDFDef");
        }
        int i2 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.pbkdfBuilder.withPRF(algorithmIdentifier);
        int i4 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public JcePKCSPBEOutputEncryptorBuilder setProvider(String str) {
        int i = 2 % 2;
        this.helper = new NamedJcaJceHelper(str);
        int i2 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return this;
    }

    public JcePKCSPBEOutputEncryptorBuilder setProvider(Provider provider) {
        int i = 2 % 2;
        this.helper = new ProviderJcaJceHelper(provider);
        int i2 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return this;
    }

    public JcePKCSPBEOutputEncryptorBuilder setRandom(SecureRandom secureRandom) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 21;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        this.random = secureRandom;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 5;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 1;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR)), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 24, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10277, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - ((byte) KeyEvent.getModifierMetaStateMask())), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 55, 2166 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0)), 55 - KeyEvent.normalizeMetaState(0), View.MeasureSpec.getSize(0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i9 = $10 + 113;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
