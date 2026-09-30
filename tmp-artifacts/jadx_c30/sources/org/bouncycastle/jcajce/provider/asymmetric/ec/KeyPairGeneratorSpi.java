package org.bouncycastle.jcajce.provider.asymmetric.ec;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.util.Hashtable;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Integers;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class KeyPairGeneratorSpi extends KeyPairGenerator {

    public static class ECDH extends EC {
        public ECDH() {
            super("ECDH", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDHC extends EC {
        public ECDHC() {
            super("ECDHC", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDSA extends EC {
        public ECDSA() {
            super("ECDSA", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECMQV extends EC {
        public ECMQV() {
            super("ECMQV", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public KeyPairGeneratorSpi(String str) {
        super(str);
    }

    public static class EC extends KeyPairGeneratorSpi {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackDefault = 1;
        private static int asBinder = 1;
        private static Hashtable ecParameters;
        private static char[] onExtraCallback;
        private static boolean onExtraCallbackWithResult;
        private static boolean onNavigationEvent;
        private static int onTransact;
        private static int onWarmupCompleted;
        String algorithm;
        ProviderConfiguration configuration;
        Object ecParams;
        ECKeyPairGenerator engine;
        boolean initialised;
        ECKeyGenerationParameters param;
        SecureRandom random;
        int strength;

        static {
            IAuthTabCallback();
            Hashtable hashtable = new Hashtable();
            ecParameters = hashtable;
            hashtable.put(Integers.valueOf(CertificateHolderAuthorization.CVCA), new ECGenParameterSpec("prime192v1"));
            ecParameters.put(Integers.valueOf(239), new ECGenParameterSpec("prime239v1"));
            ecParameters.put(Integers.valueOf(256), new ECGenParameterSpec("prime256v1"));
            ecParameters.put(Integers.valueOf(224), new ECGenParameterSpec("P-224"));
            ecParameters.put(Integers.valueOf(384), new ECGenParameterSpec("P-384"));
            ecParameters.put(Integers.valueOf(521), new ECGenParameterSpec("P-521"));
            int i = IAuthTabCallbackDefault + 1;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public EC() throws Throwable {
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-126, ISOFileInfo.DATA_BYTES2}, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            super(((String) objArr[0]).intern());
            this.engine = new ECKeyPairGenerator();
            this.ecParams = null;
            this.strength = 239;
            this.random = CryptoServicesRegistrar.getSecureRandom();
            this.initialised = false;
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-126, ISOFileInfo.DATA_BYTES2}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, objArr2);
            this.algorithm = ((String) objArr2[0]).intern();
            this.configuration = BouncyCastleProvider.CONFIGURATION;
        }

        public EC(String str, ProviderConfiguration providerConfiguration) {
            super(str);
            this.engine = new ECKeyPairGenerator();
            this.ecParams = null;
            this.strength = 239;
            this.random = CryptoServicesRegistrar.getSecureRandom();
            this.initialised = false;
            this.algorithm = str;
            this.configuration = providerConfiguration;
        }

        protected ECKeyGenerationParameters createKeyGenParamsBC(ECParameterSpec eCParameterSpec, SecureRandom secureRandom) {
            int i = 2 % 2;
            ECKeyGenerationParameters eCKeyGenerationParameters = new ECKeyGenerationParameters(new ECDomainParameters(eCParameterSpec.getCurve(), eCParameterSpec.getG(), eCParameterSpec.getN(), eCParameterSpec.getH()), secureRandom);
            int i2 = onTransact + 11;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 0;
            }
            return eCKeyGenerationParameters;
        }

        protected ECKeyGenerationParameters createKeyGenParamsJCE(java.security.spec.ECParameterSpec eCParameterSpec, SecureRandom secureRandom) {
            X9ECParameters domainParametersFromName;
            int i = 2 % 2;
            int i2 = asBinder + 67;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z = eCParameterSpec instanceof ECNamedCurveSpec;
                throw null;
            }
            if (!(eCParameterSpec instanceof ECNamedCurveSpec) || (domainParametersFromName = ECUtils.getDomainParametersFromName(((ECNamedCurveSpec) eCParameterSpec).getName(), this.configuration)) == null) {
                ECCurve eCCurveConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                return new ECKeyGenerationParameters(new ECDomainParameters(eCCurveConvertCurve, EC5Util.convertPoint(eCCurveConvertCurve, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
            }
            ECKeyGenerationParameters eCKeyGenerationParametersCreateKeyGenParamsJCE = createKeyGenParamsJCE(domainParametersFromName, secureRandom);
            int i3 = asBinder + 3;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return eCKeyGenerationParametersCreateKeyGenParamsJCE;
        }

        protected ECKeyGenerationParameters createKeyGenParamsJCE(X9ECParameters x9ECParameters, SecureRandom secureRandom) {
            int i = 2 % 2;
            ECKeyGenerationParameters eCKeyGenerationParameters = new ECKeyGenerationParameters(new ECDomainParameters(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH()), secureRandom);
            int i2 = onTransact + 41;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return eCKeyGenerationParameters;
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            int i = 2 % 2;
            int i2 = asBinder + 39;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (!this.initialised) {
                initialize(this.strength, new SecureRandom());
            }
            AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.engine.generateKeyPair();
            ECPublicKeyParameters eCPublicKeyParameters = asymmetricCipherKeyPairGenerateKeyPair.getPublic();
            ECPrivateKeyParameters eCPrivateKeyParameters = asymmetricCipherKeyPairGenerateKeyPair.getPrivate();
            Object obj = this.ecParams;
            if (obj instanceof ECParameterSpec) {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCECPublicKey bCECPublicKey = new BCECPublicKey(this.algorithm, eCPublicKeyParameters, eCParameterSpec, this.configuration);
                return new KeyPair(bCECPublicKey, new BCECPrivateKey(this.algorithm, eCPrivateKeyParameters, bCECPublicKey, eCParameterSpec, this.configuration));
            }
            if (obj != null) {
                java.security.spec.ECParameterSpec eCParameterSpec2 = (java.security.spec.ECParameterSpec) obj;
                BCECPublicKey bCECPublicKey2 = new BCECPublicKey(this.algorithm, eCPublicKeyParameters, eCParameterSpec2, this.configuration);
                return new KeyPair(bCECPublicKey2, new BCECPrivateKey(this.algorithm, eCPrivateKeyParameters, bCECPublicKey2, eCParameterSpec2, this.configuration));
            }
            KeyPair keyPair = new KeyPair(new BCECPublicKey(this.algorithm, eCPublicKeyParameters, this.configuration), new BCECPrivateKey(this.algorithm, eCPrivateKeyParameters, this.configuration));
            int i4 = onTransact + 91;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return keyPair;
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(int i, SecureRandom secureRandom) {
            int i2 = 2 % 2;
            int i3 = asBinder + 13;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            this.strength = i;
            this.random = secureRandom;
            if (i4 != 0) {
                throw null;
            }
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) ecParameters.get(Integers.valueOf(i));
            if (eCGenParameterSpec == null) {
                throw new InvalidParameterException("unknown key size.");
            }
            int i5 = asBinder + 33;
            onTransact = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    initialize(eCGenParameterSpec, secureRandom);
                    int i6 = 15 / 0;
                } else {
                    initialize(eCGenParameterSpec, secureRandom);
                }
            } catch (InvalidAlgorithmParameterException unused) {
                throw new InvalidParameterException("key size not configurable.");
            }
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            String name;
            ECKeyGenerationParameters eCKeyGenerationParametersCreateKeyGenParamsJCE;
            ECParameterSpec ecImplicitlyCa;
            int i = 2 % 2;
            Object obj = null;
            if (algorithmParameterSpec == null) {
                ecImplicitlyCa = this.configuration.getEcImplicitlyCa();
                if (ecImplicitlyCa == null) {
                    throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
                }
                this.ecParams = null;
            } else {
                if (!(algorithmParameterSpec instanceof ECParameterSpec)) {
                    if (algorithmParameterSpec instanceof java.security.spec.ECParameterSpec) {
                        int i2 = onTransact + 33;
                        asBinder = i2 % 128;
                        int i3 = i2 % 2;
                        this.ecParams = algorithmParameterSpec;
                        java.security.spec.ECParameterSpec eCParameterSpec = (java.security.spec.ECParameterSpec) algorithmParameterSpec;
                        if (i3 == 0) {
                            createKeyGenParamsJCE(eCParameterSpec, secureRandom);
                            obj.hashCode();
                            throw null;
                        }
                        eCKeyGenerationParametersCreateKeyGenParamsJCE = createKeyGenParamsJCE(eCParameterSpec, secureRandom);
                        this.param = eCKeyGenerationParametersCreateKeyGenParamsJCE;
                        this.engine.init(this.param);
                        this.initialised = true;
                        int i4 = asBinder + 121;
                        onTransact = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    if (algorithmParameterSpec instanceof ECGenParameterSpec) {
                        name = ((ECGenParameterSpec) algorithmParameterSpec).getName();
                    } else {
                        if (!(algorithmParameterSpec instanceof ECNamedCurveGenParameterSpec)) {
                            String nameFrom = ECUtil.getNameFrom(algorithmParameterSpec);
                            if (nameFrom == null) {
                                throw new InvalidAlgorithmParameterException("invalid parameterSpec: " + algorithmParameterSpec);
                            }
                            initializeNamedCurve(nameFrom, secureRandom);
                            this.engine.init(this.param);
                            this.initialised = true;
                            int i42 = asBinder + 121;
                            onTransact = i42 % 128;
                            int i52 = i42 % 2;
                        }
                        name = ((ECNamedCurveGenParameterSpec) algorithmParameterSpec).getName();
                    }
                    initializeNamedCurve(name, secureRandom);
                    this.engine.init(this.param);
                    this.initialised = true;
                    int i422 = asBinder + 121;
                    onTransact = i422 % 128;
                    int i522 = i422 % 2;
                }
                this.ecParams = algorithmParameterSpec;
                ecImplicitlyCa = (ECParameterSpec) algorithmParameterSpec;
            }
            eCKeyGenerationParametersCreateKeyGenParamsJCE = createKeyGenParamsBC(ecImplicitlyCa, secureRandom);
            this.param = eCKeyGenerationParametersCreateKeyGenParamsJCE;
            this.engine.init(this.param);
            this.initialised = true;
            int i4222 = asBinder + 121;
            onTransact = i4222 % 128;
            int i5222 = i4222 % 2;
        }

        protected void initializeNamedCurve(String str, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            int i = 2 % 2;
            int i2 = asBinder + 103;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                ECUtils.getDomainParametersFromName(str, this.configuration);
                throw null;
            }
            X9ECParameters domainParametersFromName = ECUtils.getDomainParametersFromName(str, this.configuration);
            if (domainParametersFromName == null) {
                throw new InvalidAlgorithmParameterException("unknown curve name: " + str);
            }
            this.ecParams = new ECNamedCurveSpec(str, domainParametersFromName.getCurve(), domainParametersFromName.getG(), domainParametersFromName.getN(), domainParametersFromName.getH(), (byte[]) null);
            this.param = createKeyGenParamsJCE(domainParametersFromName, secureRandom);
            int i3 = onTransact + 45;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onExtraCallback;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i3 = 0; i3 < length; i3++) {
                    int i4 = $11 + 7;
                    $10 = i4 % 128;
                    int i5 = i4 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 77 - View.MeasureSpec.getMode(0), (ViewConfiguration.getScrollBarSize() >> 8) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 75, 16036 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            char c = '0';
            if (onNavigationEvent) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                int i6 = $11 + 3;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), 63 - View.resolveSize(0, 0), 12213 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, c), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    c = '0';
                }
                String str = new String(cArr4);
                int i8 = $11 + 109;
                $10 = i8 % 128;
                if (i8 % 2 == 0) {
                    objArr[0] = str;
                    return;
                } else {
                    int i9 = 36 / 0;
                    objArr[0] = str;
                    return;
                }
            }
            if (!onExtraCallbackWithResult) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                int i10 = $10 + 115;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i12 = $11 + 23;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 63, View.resolveSize(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        }

        static void IAuthTabCallback() {
            onExtraCallback = new char[]{32736, 32738};
            onWarmupCompleted = -1184333907;
            onExtraCallbackWithResult = true;
            onNavigationEvent = true;
        }
    }
}
