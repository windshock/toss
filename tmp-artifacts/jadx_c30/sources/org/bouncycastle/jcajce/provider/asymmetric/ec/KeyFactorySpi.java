package org.bouncycastle.jcajce.provider.asymmetric.ec;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import net.sf.scuba.smartcards.BuildConfig;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.ECPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec;
import org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.jce.spec.ECPrivateKeySpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {
    String algorithm;
    ProviderConfiguration configuration;

    public static class ECDH extends KeyFactorySpi {
        public ECDH() {
            super("ECDH", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDHC extends KeyFactorySpi {
        public ECDHC() {
            super("ECDHC", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDSA extends KeyFactorySpi {
        public ECDSA() {
            super("ECDSA", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECGOST3410 extends KeyFactorySpi {
        public ECGOST3410() {
            super("ECGOST3410", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECGOST3410_2012 extends KeyFactorySpi {
        public ECGOST3410_2012() {
            super("ECGOST3410-2012", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECMQV extends KeyFactorySpi {
        public ECMQV() {
            super("ECMQV", BouncyCastleProvider.CONFIGURATION);
        }
    }

    KeyFactorySpi(String str, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.configuration = providerConfiguration;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof ECPrivateKeySpec) {
            return new BCECPrivateKey(this.algorithm, (ECPrivateKeySpec) keySpec, this.configuration);
        }
        if (keySpec instanceof java.security.spec.ECPrivateKeySpec) {
            return new BCECPrivateKey(this.algorithm, (java.security.spec.ECPrivateKeySpec) keySpec, this.configuration);
        }
        if (!(keySpec instanceof OpenSSHPrivateKeySpec)) {
            return super.engineGeneratePrivate(keySpec);
        }
        ECPrivateKey eCPrivateKey = ECPrivateKey.getInstance(((OpenSSHPrivateKeySpec) keySpec).getEncoded());
        try {
            return new BCECPrivateKey(this.algorithm, new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, eCPrivateKey.getParametersObject()), eCPrivateKey), this.configuration);
        } catch (IOException e) {
            throw new InvalidKeySpecException("bad encoding: " + e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        try {
            if (keySpec instanceof ECPublicKeySpec) {
                return new BCECPublicKey(this.algorithm, (ECPublicKeySpec) keySpec, this.configuration);
            }
            if (keySpec instanceof java.security.spec.ECPublicKeySpec) {
                return new BCECPublicKey(this.algorithm, (java.security.spec.ECPublicKeySpec) keySpec, this.configuration);
            }
            if (!(keySpec instanceof OpenSSHPublicKeySpec)) {
                return super.engineGeneratePublic(keySpec);
            }
            ECPublicKeyParameters publicKey = OpenSSHPublicKeyUtil.parsePublicKey(((OpenSSHPublicKeySpec) keySpec).getEncoded());
            if (!(publicKey instanceof ECPublicKeyParameters)) {
                throw new IllegalArgumentException("openssh key is not ec public key");
            }
            ECDomainParameters parameters = publicKey.getParameters();
            return engineGeneratePublic(new ECPublicKeySpec(publicKey.getQ(), new ECParameterSpec(parameters.getCurve(), parameters.getG(), parameters.getN(), parameters.getH(), parameters.getSeed())));
        } catch (Exception e) {
            throw new InvalidKeySpecException("invalid KeySpec: " + e.getMessage(), e);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(java.security.spec.ECPublicKeySpec.class)) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            if (eCPublicKey.getParams() != null) {
                return new java.security.spec.ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            ECParameterSpec ecImplicitlyCa = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            return new java.security.spec.ECPublicKeySpec(eCPublicKey.getW(), EC5Util.convertSpec(EC5Util.convertCurve(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getSeed()), ecImplicitlyCa));
        }
        if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(java.security.spec.ECPrivateKeySpec.class)) && (key instanceof java.security.interfaces.ECPrivateKey)) {
            java.security.interfaces.ECPrivateKey eCPrivateKey = (java.security.interfaces.ECPrivateKey) key;
            if (eCPrivateKey.getParams() != null) {
                return new java.security.spec.ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            ECParameterSpec ecImplicitlyCa2 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            return new java.security.spec.ECPrivateKeySpec(eCPrivateKey.getS(), EC5Util.convertSpec(EC5Util.convertCurve(ecImplicitlyCa2.getCurve(), ecImplicitlyCa2.getSeed()), ecImplicitlyCa2));
        }
        if (cls.isAssignableFrom(ECPublicKeySpec.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey2 = (ECPublicKey) key;
            if (eCPublicKey2.getParams() != null) {
                return new ECPublicKeySpec(EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), EC5Util.convertSpec(eCPublicKey2.getParams()));
            }
            return new ECPublicKeySpec(EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
        }
        if (cls.isAssignableFrom(ECPrivateKeySpec.class) && (key instanceof java.security.interfaces.ECPrivateKey)) {
            java.security.interfaces.ECPrivateKey eCPrivateKey2 = (java.security.interfaces.ECPrivateKey) key;
            if (eCPrivateKey2.getParams() != null) {
                return new ECPrivateKeySpec(eCPrivateKey2.getS(), EC5Util.convertSpec(eCPrivateKey2.getParams()));
            }
            return new ECPrivateKeySpec(eCPrivateKey2.getS(), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
        }
        if (cls.isAssignableFrom(OpenSSHPublicKeySpec.class) && (key instanceof ECPublicKey)) {
            if (!(key instanceof BCECPublicKey)) {
                throw new IllegalArgumentException("invalid key type: " + key.getClass().getName());
            }
            BCECPublicKey bCECPublicKey = (BCECPublicKey) key;
            ECParameterSpec parameters = bCECPublicKey.getParameters();
            try {
                return new OpenSSHPublicKeySpec(OpenSSHPublicKeyUtil.encodePublicKey(new ECPublicKeyParameters(bCECPublicKey.getQ(), new ECDomainParameters(parameters.getCurve(), parameters.getG(), parameters.getN(), parameters.getH(), parameters.getSeed()))));
            } catch (IOException e) {
                throw new IllegalArgumentException("unable to produce encoding: " + e.getMessage());
            }
        }
        if (!cls.isAssignableFrom(OpenSSHPrivateKeySpec.class) || !(key instanceof java.security.interfaces.ECPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        if (!(key instanceof BCECPrivateKey)) {
            throw new IllegalArgumentException("invalid key type: " + key.getClass().getName());
        }
        try {
            return new OpenSSHPrivateKeySpec(PrivateKeyInfo.getInstance(key.getEncoded()).parsePrivateKey().toASN1Primitive().getEncoded());
        } catch (IOException e2) {
            throw new IllegalArgumentException("cannot encoded key: " + e2.getMessage());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof ECPublicKey) {
            return new BCECPublicKey((ECPublicKey) key, this.configuration);
        }
        if (key instanceof java.security.interfaces.ECPrivateKey) {
            return new BCECPrivateKey((java.security.interfaces.ECPrivateKey) key, this.configuration);
        }
        throw new InvalidKeyException("key type unknown");
    }

    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (algorithm.equals(X9ObjectIdentifiers.id_ecPublicKey)) {
            return new BCECPrivateKey(this.algorithm, privateKeyInfo, this.configuration);
        }
        throw new IOException("algorithm identifier " + algorithm + " in key not recognised");
    }

    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        if (algorithm.equals(X9ObjectIdentifiers.id_ecPublicKey)) {
            return new BCECPublicKey(this.algorithm, subjectPublicKeyInfo, this.configuration);
        }
        throw new IOException("algorithm identifier " + algorithm + " in key not recognised");
    }

    public static class EC extends KeyFactorySpi {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long onWarmupCompleted = -7875976363776210460L;

        /* JADX WARN: Illegal instructions before constructor call */
        public EC() throws Throwable {
            Object[] objArr = new Object[1];
            a(new char[]{35990, 33693}, (ViewConfiguration.getLongPressTimeout() >> 16) + 3853, objArr);
            super(((String) objArr[0]).intern(), BouncyCastleProvider.CONFIGURATION);
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i3 = $11 + 53;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 25, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0')), TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 59, 6384 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i6 = $11 + 101;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 59 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), 6383 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }
    }
}
