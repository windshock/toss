package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.encodings.ISO9796d1Encoding;
import org.bouncycastle.crypto.encodings.OAEPEncoding;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec;
import org.bouncycastle.util.Strings;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class CipherSpi extends BaseCipherSpi {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] onExtraCallback = {27258, 27168, 27170, 27178, 27157, 27164, 27140, 27262, 27263, 27160, 27170, 27170, 27176, 27173, 27143, 27145, 27168, 27199, 27140, 27146, 27173, 27173, 27168, 27168, 27179, 27176, 27222, 27142};
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private BaseCipherSpi.ErasableOutputStream bOut;
    private AsymmetricBlockCipher cipher;
    private AlgorithmParameters engineParams;
    private final JcaJceHelper helper;
    private AlgorithmParameterSpec paramSpec;
    private boolean privateKeyOnly;
    private boolean publicKeyOnly;

    public static class ISO9796d1Padding extends CipherSpi {
        public ISO9796d1Padding() {
            super(new ISO9796d1Encoding(new RSABlindedEngine()));
        }
    }

    public static class NoPadding extends CipherSpi {
        public NoPadding() {
            super(new RSABlindedEngine());
        }
    }

    public static class OAEPPadding extends CipherSpi {
        public OAEPPadding() {
            super(OAEPParameterSpec.DEFAULT);
        }
    }

    public static class PKCS1v1_5Padding extends CipherSpi {
        public PKCS1v1_5Padding() {
            super(new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class PKCS1v1_5Padding_PrivateOnly extends CipherSpi {
        public PKCS1v1_5Padding_PrivateOnly() {
            super(false, true, new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class PKCS1v1_5Padding_PublicOnly extends CipherSpi {
        public PKCS1v1_5Padding_PublicOnly() {
            super(true, false, new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public CipherSpi(OAEPParameterSpec oAEPParameterSpec) {
        this.helper = new BCJcaJceHelper();
        this.publicKeyOnly = false;
        this.privateKeyOnly = false;
        this.bOut = new BaseCipherSpi.ErasableOutputStream();
        try {
            initFromSpec(oAEPParameterSpec);
        } catch (NoSuchPaddingException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public CipherSpi(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.helper = new BCJcaJceHelper();
        this.publicKeyOnly = false;
        this.privateKeyOnly = false;
        this.bOut = new BaseCipherSpi.ErasableOutputStream();
        this.cipher = asymmetricBlockCipher;
    }

    public CipherSpi(boolean z, boolean z2, AsymmetricBlockCipher asymmetricBlockCipher) {
        this.helper = new BCJcaJceHelper();
        this.publicKeyOnly = false;
        this.privateKeyOnly = false;
        this.bOut = new BaseCipherSpi.ErasableOutputStream();
        this.publicKeyOnly = z;
        this.privateKeyOnly = z2;
        this.cipher = asymmetricBlockCipher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    private byte[] getOutput() throws BadPaddingException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        String str = "unable to decrypt block";
        try {
            try {
                try {
                    byte[] bArrProcessBlock = i2 % 2 == 0 ? this.cipher.processBlock(this.bOut.getBuf(), 0, this.bOut.size()) : this.cipher.processBlock(this.bOut.getBuf(), 0, this.bOut.size());
                    this.bOut.erase();
                    int i3 = onWarmupCompleted + 93;
                    onNavigationEvent = i3 % 128;
                    str = i3 % 2;
                    if (str == 0) {
                        return bArrProcessBlock;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                } catch (InvalidCipherTextException e) {
                    throw new BadBlockException(str, e);
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new BadBlockException(str, e2);
            }
        } catch (Throwable th) {
            this.bOut.erase();
            throw th;
        }
    }

    private void initFromSpec(OAEPParameterSpec oAEPParameterSpec) throws NoSuchPaddingException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
        Digest digest = DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
        if (digest == null) {
            throw new NoSuchPaddingException("no match on OAEP constructor for digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
        }
        this.cipher = new OAEPEncoding(new RSABlindedEngine(), digest, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
        this.paramSpec = oAEPParameterSpec;
        int i4 = onNavigationEvent + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        int i4 = 2 % 2;
        if (engineGetOutputSize(i2) + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        int i5 = onNavigationEvent + 9;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (bArr != null) {
            this.bOut.write(bArr, i, i2);
        }
        if (this.cipher instanceof RSABlindedEngine) {
            if (this.bOut.size() > this.cipher.getInputBlockSize() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else if (this.bOut.size() > this.cipher.getInputBlockSize()) {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        byte[] output = getOutput();
        int i6 = 0;
        while (i6 != output.length) {
            int i7 = onNavigationEvent + 33;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                bArr2[i3 / i6] = output[i6];
                i6 += 98;
            } else {
                bArr2[i3 + i6] = output[i6];
                i6++;
            }
        }
        return output.length;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) throws BadPaddingException, IllegalBlockSizeException, IOException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if (bArr != null) {
            this.bOut.write(bArr, i, i2);
        }
        if (!(this.cipher instanceof RSABlindedEngine)) {
            if (this.bOut.size() > this.cipher.getInputBlockSize()) {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else if (this.bOut.size() > this.cipher.getInputBlockSize() + 1) {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        byte[] output = getOutput();
        int i6 = onNavigationEvent + 45;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return output;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetBlockSize() throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onWarmupCompleted = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                return this.cipher.getInputBlockSize();
            }
            this.cipher.getInputBlockSize();
            throw null;
        } catch (NullPointerException unused) {
            Object[] objArr = new Object[1];
            a(new int[]{0, 26, 0, 4}, false, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1}, objArr);
            throw new IllegalStateException(((String) objArr[0]).intern());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        RSAKey rSAKey;
        int i = 2 % 2;
        if (key instanceof RSAPrivateKey) {
            int i2 = onNavigationEvent + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            rSAKey = (RSAPrivateKey) key;
        } else {
            if (!(key instanceof RSAPublicKey)) {
                throw new IllegalArgumentException("not an RSA key!");
            }
            int i4 = onWarmupCompleted;
            int i5 = i4 + 31;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            rSAKey = (RSAPublicKey) key;
            int i7 = i4 + 71;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
        int iBitLength = rSAKey.getModulus().bitLength();
        int i9 = onWarmupCompleted + 109;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 == 0) {
            return iBitLength;
        }
        throw null;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 123;
        onNavigationEvent = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                return this.cipher.getOutputBlockSize();
            }
            this.cipher.getOutputBlockSize();
            throw null;
        } catch (NullPointerException unused) {
            Object[] objArr = new Object[1];
            a(new int[]{0, 26, 0, 4}, false, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1}, objArr);
            throw new IllegalStateException(((String) objArr[0]).intern());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() throws InvalidParameterSpecException {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this.engineParams == null) {
            int i5 = i2 + 83;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            if (this.paramSpec != null) {
                try {
                    AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters("OAEP");
                    this.engineParams = algorithmParametersCreateAlgorithmParameters;
                    algorithmParametersCreateAlgorithmParameters.init(this.paramSpec);
                } catch (Exception e) {
                    throw new RuntimeException(e.toString());
                }
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidParameterSpecException, InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 93;
        onNavigationEvent = i4 % 128;
        AlgorithmParameterSpec parameterSpec = null;
        if (i4 % 2 != 0) {
            parameterSpec.hashCode();
            throw null;
        }
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(OAEPParameterSpec.class);
            } catch (InvalidParameterSpecException e) {
                throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + e.toString(), e);
            }
        } else {
            int i5 = i3 + 19;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        this.engineParams = algorithmParameters;
        engineInit(i, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 25;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
            int i5 = onNavigationEvent + 81;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException("Eeeek! " + e.toString(), e);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        CipherParameters cipherParametersGeneratePrivateKeyParameter;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if (algorithmParameterSpec != null) {
            int i6 = i3 + 89;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
                throw new InvalidAlgorithmParameterException("unknown parameter type: " + algorithmParameterSpec.getClass().getName());
            }
        }
        if (key instanceof RSAPublicKey) {
            if (this.privateKeyOnly) {
                int i8 = onWarmupCompleted + 123;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                if (i == 1) {
                    throw new InvalidKeyException("mode 1 requires RSAPrivateKey");
                }
            }
            cipherParametersGeneratePrivateKeyParameter = RSAUtil.generatePublicKeyParameter((RSAPublicKey) key);
        } else {
            if (!(key instanceof RSAPrivateKey)) {
                throw new InvalidKeyException("unknown key type passed to RSA");
            }
            if (this.publicKeyOnly && i == 1) {
                throw new InvalidKeyException("mode 2 requires RSAPublicKey");
            }
            cipherParametersGeneratePrivateKeyParameter = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) key);
        }
        if (algorithmParameterSpec != null) {
            OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
            this.paramSpec = algorithmParameterSpec;
            if (!oAEPParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !oAEPParameterSpec.getMGFAlgorithm().equals(PKCSObjectIdentifiers.id_mgf1.getId())) {
                throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
            }
            if (!(oAEPParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
                throw new InvalidAlgorithmParameterException("unkown MGF parameters");
            }
            Digest digest = DigestFactory.getDigest(oAEPParameterSpec.getDigestAlgorithm());
            if (digest == null) {
                throw new InvalidAlgorithmParameterException("no match on digest algorithm: " + oAEPParameterSpec.getDigestAlgorithm());
            }
            int i10 = onWarmupCompleted + 61;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 != 0) {
                DigestFactory.getDigest(((MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters()).getDigestAlgorithm());
                throw null;
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
            Digest digest2 = DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
            if (digest2 == null) {
                throw new InvalidAlgorithmParameterException("no match on MGF digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
            }
            this.cipher = new OAEPEncoding(new RSABlindedEngine(), digest, digest2, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
        }
        if (!(this.cipher instanceof RSABlindedEngine)) {
            int i11 = onWarmupCompleted + 17;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            cipherParametersGeneratePrivateKeyParameter = secureRandom != null ? new ParametersWithRandom(cipherParametersGeneratePrivateKeyParameter, secureRandom) : new ParametersWithRandom(cipherParametersGeneratePrivateKeyParameter, CryptoServicesRegistrar.getSecureRandom());
        }
        this.bOut.reset();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    int i13 = onWarmupCompleted + 35;
                    onNavigationEvent = i13 % 128;
                    if (i13 % 2 == 0 ? i != 4 : i != 3) {
                        throw new InvalidParameterException("unknown opmode " + i + " passed to RSA");
                    }
                }
            }
            this.cipher.init(false, cipherParametersGeneratePrivateKeyParameter);
            return;
        }
        this.cipher.init(true, cipherParametersGeneratePrivateKeyParameter);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetMode(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("NONE")) {
            return;
        }
        int i4 = onNavigationEvent + 77;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            upperCase.equals("ECB");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!upperCase.equals("ECB")) {
            Object[] objArr = new Object[1];
            a(new int[]{26, 1, 0, 0}, true, new byte[]{1}, objArr);
            if (upperCase.equals(((String) objArr[0]).intern())) {
                int i5 = onWarmupCompleted + 117;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                this.privateKeyOnly = true;
                this.publicKeyOnly = false;
                return;
            }
            Object[] objArr2 = new Object[1];
            a(new int[]{27, 1, 95, 0}, false, new byte[]{1}, objArr2);
            if (upperCase.equals(((String) objArr2[0]).intern())) {
                this.privateKeyOnly = false;
                this.publicKeyOnly = true;
            } else {
                throw new NoSuchAlgorithmException("can't support mode " + str);
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        int i = 2 % 2;
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("NOPADDING")) {
            this.cipher = new RSABlindedEngine();
            return;
        }
        if (upperCase.equals("PKCS1PADDING")) {
            this.cipher = new PKCS1Encoding(new RSABlindedEngine());
            return;
        }
        if (upperCase.equals("ISO9796-1PADDING")) {
            this.cipher = new ISO9796d1Encoding(new RSABlindedEngine());
            return;
        }
        if (upperCase.equals("OAEPWITHMD5ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT));
            return;
        }
        Object obj = null;
        if (upperCase.equals("OAEPPADDING")) {
            int i2 = onNavigationEvent + 1;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                initFromSpec(OAEPParameterSpec.DEFAULT);
                return;
            } else {
                initFromSpec(OAEPParameterSpec.DEFAULT);
                throw null;
            }
        }
        if (upperCase.equals("OAEPWITHSHA1ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-1ANDMGF1PADDING")) {
            initFromSpec(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (upperCase.equals("OAEPWITHSHA224ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-224ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA224, "MGF1", new MGF1ParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA224), PSource.PSpecified.DEFAULT));
            return;
        }
        int i3 = onWarmupCompleted + 11;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (upperCase.equals("OAEPWITHSHA256ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-256ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA256, "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            return;
        }
        int i5 = onWarmupCompleted + 79;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        if (upperCase.equals("OAEPWITHSHA384ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-384ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA384, "MGF1", MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT));
            return;
        }
        if (!upperCase.equals("OAEPWITHSHA512ANDMGF1PADDING")) {
            int i7 = onNavigationEvent + 83;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                upperCase.equals("OAEPWITHSHA-512ANDMGF1PADDING");
                obj.hashCode();
                throw null;
            }
            if (!upperCase.equals("OAEPWITHSHA-512ANDMGF1PADDING")) {
                if (upperCase.equals("OAEPWITHSHA3-224ANDMGF1PADDING")) {
                    initFromSpec(new OAEPParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), PSource.PSpecified.DEFAULT));
                    return;
                }
                if (upperCase.equals("OAEPWITHSHA3-256ANDMGF1PADDING")) {
                    initFromSpec(new OAEPParameterSpec(SPHINCS256KeyGenParameterSpec.SHA3_256, "MGF1", new MGF1ParameterSpec(SPHINCS256KeyGenParameterSpec.SHA3_256), PSource.PSpecified.DEFAULT));
                    return;
                }
                if (upperCase.equals("OAEPWITHSHA3-384ANDMGF1PADDING")) {
                    initFromSpec(new OAEPParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), PSource.PSpecified.DEFAULT));
                    return;
                }
                if (!upperCase.equals("OAEPWITHSHA3-512ANDMGF1PADDING")) {
                    throw new NoSuchPaddingException(str + " unavailable with RSA.");
                }
                initFromSpec(new OAEPParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), PSource.PSpecified.DEFAULT));
                int i8 = onWarmupCompleted + 119;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return;
            }
        }
        initFromSpec(new OAEPParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA512, "MGF1", MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT));
    }

    @Override // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 5;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        this.bOut.write(bArr, i, i2);
        if (!(this.cipher instanceof RSABlindedEngine)) {
            if (this.bOut.size() <= this.cipher.getInputBlockSize()) {
                return 0;
            }
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        int i7 = onWarmupCompleted + 95;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        if (this.bOut.size() <= this.cipher.getInputBlockSize() + 1) {
            return 0;
        }
        throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            this.bOut.write(bArr, i, i2);
            int i5 = 20 / 0;
            if (this.cipher instanceof RSABlindedEngine) {
                if (this.bOut.size() > this.cipher.getInputBlockSize() + 1) {
                    throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
                }
            } else if (this.bOut.size() > this.cipher.getInputBlockSize()) {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else {
            this.bOut.write(bArr, i, i2);
            if (!(this.cipher instanceof RSABlindedEngine)) {
            }
        }
        int i6 = onWarmupCompleted + 3;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onExtraCallback;
        char c = '0';
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), AndroidCharacter.getMirror(c) - '\r', (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    c = '0';
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i7 = $11 + 115;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i9 = $10 + 93;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 65 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 16718 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29, (Process.myTid() >> 22) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49466), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 71, 12485 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i13 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i13, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i14 = $11 + 113;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i16 = $10 + 21;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 5 % 4;
                }
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
