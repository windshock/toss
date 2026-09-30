package org.bouncycastle.jcajce.provider.symmetric.util;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import o.onVideoError;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.engines.DSTU7624Engine;
import org.bouncycastle.crypto.fpe.FPEEngine;
import org.bouncycastle.crypto.fpe.FPEFF1Engine;
import org.bouncycastle.crypto.fpe.FPEFF3_1Engine;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CCMBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.CTSBlockCipher;
import org.bouncycastle.crypto.modes.EAXBlockCipher;
import org.bouncycastle.crypto.modes.GCFBBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.modes.GOFBBlockCipher;
import org.bouncycastle.crypto.modes.KCCMBlockCipher;
import org.bouncycastle.crypto.modes.KCTRBlockCipher;
import org.bouncycastle.crypto.modes.KGCMBlockCipher;
import org.bouncycastle.crypto.modes.OCBBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.crypto.modes.OpenPGPCFBBlockCipher;
import org.bouncycastle.crypto.modes.PGPCFBBlockCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;
import org.bouncycastle.crypto.paddings.ISO10126d2Padding;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.paddings.TBCPadding;
import org.bouncycastle.crypto.paddings.X923Padding;
import org.bouncycastle.crypto.paddings.ZeroBytePadding;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.FPEParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.crypto.params.RC5Parameters;
import org.bouncycastle.internal.asn1.cms.GCMParameters;
import org.bouncycastle.jcajce.PBKDF1Key;
import org.bouncycastle.jcajce.PBKDF1KeyWithParameters;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.PKCS12KeyWithParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import org.bouncycastle.jcajce.spec.FPEParameterSpec;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.jcajce.spec.RepeatedSecretKeySpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class BaseBlockCipher extends BaseWrapCipher implements PBE {
    private static final int BUF_SIZE = 512;
    private static final Class gcmSpecClass = ClassUtil.loadClass(BaseBlockCipher.class, "javax.crypto.spec.GCMParameterSpec");
    private AEADParameters aeadParams;
    private Class[] availableSpecs;
    private BlockCipher baseEngine;
    private GenericBlockCipher cipher;
    private int digest;
    private BlockCipherProvider engineProvider;
    private boolean fixedIv;
    private int ivLength;
    private ParametersWithIV ivParam;
    private int keySizeInBits;
    private String modeName;
    private boolean padded;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;
    private int scheme;

    static class AEADGenericBlockCipher implements GenericBlockCipher {
        private static final Constructor aeadBadTagConstructor;
        private AEADCipher cipher;

        static {
            Class clsLoadClass = ClassUtil.loadClass(BaseBlockCipher.class, "javax.crypto.AEADBadTagException");
            aeadBadTagConstructor = clsLoadClass != null ? findExceptionConstructor(clsLoadClass) : null;
        }

        AEADGenericBlockCipher(AEADCipher aEADCipher) {
            this.cipher = aEADCipher;
        }

        private static Constructor findExceptionConstructor(Class cls) {
            try {
                return cls.getConstructor(String.class);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i) throws IllegalStateException, BadPaddingException {
            BadPaddingException badPaddingException;
            try {
                return this.cipher.doFinal(bArr, i);
            } catch (InvalidCipherTextException e) {
                Constructor constructor = aeadBadTagConstructor;
                if (constructor != null) {
                    try {
                        badPaddingException = (BadPaddingException) constructor.newInstance(e.getMessage());
                    } catch (Exception unused) {
                        badPaddingException = null;
                    }
                    if (badPaddingException != null) {
                        throw badPaddingException;
                    }
                }
                throw new BadPaddingException(e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            AEADCipher aEADCipher = this.cipher;
            return aEADCipher instanceof AEADBlockCipher ? ((AEADBlockCipher) aEADCipher).getUnderlyingCipher().getAlgorithmName() : aEADCipher.getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i) {
            return this.cipher.getOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public BlockCipher getUnderlyingCipher() {
            AEADCipher aEADCipher = this.cipher;
            if (aEADCipher instanceof AEADBlockCipher) {
                return ((AEADBlockCipher) aEADCipher).getUnderlyingCipher();
            }
            return null;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i) {
            return this.cipher.getUpdateOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
            this.cipher.init(z, cipherParameters);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
            return this.cipher.processByte(b, bArr, i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i, int i2) {
            this.cipher.processAADBytes(bArr, i, i2);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    static class BufferedFPEBlockCipher implements GenericBlockCipher {
        private FPEEngine cipher;
        private BaseWrapCipher.ErasableOutputStream eOut = new BaseWrapCipher.ErasableOutputStream();

        BufferedFPEBlockCipher(FPEEngine fPEEngine) {
            this.cipher = fPEEngine;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i) throws IllegalStateException, BadPaddingException {
            try {
                return this.cipher.processBlock(this.eOut.getBuf(), 0, this.eOut.size(), bArr, i);
            } finally {
                this.eOut.erase();
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return this.cipher.getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i) {
            return this.eOut.size() + i;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public BlockCipher getUnderlyingCipher() {
            throw new IllegalStateException("not applicable for FPE");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i) {
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
            this.cipher.init(z, cipherParameters);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b, byte[] bArr, int i) throws DataLengthException, IOException {
            this.eOut.write(b);
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException, IOException {
            this.eOut.write(bArr, i, i2);
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    static class BufferedGenericBlockCipher implements GenericBlockCipher {
        private BufferedBlockCipher cipher;

        BufferedGenericBlockCipher(BlockCipher blockCipher) {
            this.cipher = new PaddedBufferedBlockCipher(blockCipher);
        }

        BufferedGenericBlockCipher(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
            this.cipher = new PaddedBufferedBlockCipher(blockCipher, blockCipherPadding);
        }

        BufferedGenericBlockCipher(BufferedBlockCipher bufferedBlockCipher) {
            this.cipher = bufferedBlockCipher;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i) throws IllegalStateException, BadPaddingException {
            try {
                return this.cipher.doFinal(bArr, i);
            } catch (InvalidCipherTextException e) {
                throw new BadPaddingException(e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return this.cipher.getUnderlyingCipher().getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i) {
            return this.cipher.getOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public BlockCipher getUnderlyingCipher() {
            return this.cipher.getUnderlyingCipher();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i) {
            return this.cipher.getUpdateOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
            this.cipher.init(z, cipherParameters);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
            return this.cipher.processByte(b, bArr, i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return !(this.cipher instanceof CTSBlockCipher);
        }
    }

    interface GenericBlockCipher {
        int doFinal(byte[] bArr, int i) throws IllegalStateException, BadPaddingException;

        String getAlgorithmName();

        int getOutputSize(int i);

        BlockCipher getUnderlyingCipher();

        int getUpdateOutputSize(int i);

        void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException;

        int processByte(byte b, byte[] bArr, int i) throws DataLengthException;

        int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException;

        void updateAAD(byte[] bArr, int i, int i2);

        boolean wrapOnNoPadding();
    }

    public BaseBlockCipher(BlockCipher blockCipher) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipher;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
    }

    public BaseBlockCipher(BlockCipher blockCipher, int i) {
        this(blockCipher, true, i);
    }

    public BaseBlockCipher(BlockCipher blockCipher, int i, int i2, int i3, int i4) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipher;
        this.scheme = i;
        this.digest = i2;
        this.keySizeInBits = i3;
        this.ivLength = i4;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
    }

    public BaseBlockCipher(BlockCipher blockCipher, boolean z, int i) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipher;
        this.fixedIv = z;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
        this.ivLength = i / 8;
    }

    public BaseBlockCipher(BufferedBlockCipher bufferedBlockCipher, int i) {
        this(bufferedBlockCipher, true, i);
    }

    public BaseBlockCipher(BufferedBlockCipher bufferedBlockCipher, boolean z, int i) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = bufferedBlockCipher.getUnderlyingCipher();
        this.cipher = new BufferedGenericBlockCipher(bufferedBlockCipher);
        this.fixedIv = z;
        this.ivLength = i / 8;
    }

    public BaseBlockCipher(AEADBlockCipher aEADBlockCipher) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = aEADBlockCipher.getUnderlyingCipher();
        this.ivLength = aEADBlockCipher.getAlgorithmName().indexOf("GCM") >= 0 ? 12 : this.baseEngine.getBlockSize();
        this.cipher = new AEADGenericBlockCipher(aEADBlockCipher);
    }

    public BaseBlockCipher(AEADBlockCipher aEADBlockCipher, boolean z, int i) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = aEADBlockCipher.getUnderlyingCipher();
        this.fixedIv = z;
        this.ivLength = i;
        this.cipher = new AEADGenericBlockCipher(aEADBlockCipher);
    }

    public BaseBlockCipher(AEADCipher aEADCipher, boolean z, int i) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = null;
        this.fixedIv = z;
        this.ivLength = i;
        this.cipher = new AEADGenericBlockCipher(aEADCipher);
    }

    public BaseBlockCipher(BlockCipherProvider blockCipherProvider) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipherProvider.get();
        this.engineProvider = blockCipherProvider;
        this.cipher = new BufferedGenericBlockCipher(blockCipherProvider.get());
    }

    private CipherParameters adjustParameters(AlgorithmParameterSpec algorithmParameterSpec, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithIV) {
            CipherParameters parameters = ((ParametersWithIV) cipherParameters).getParameters();
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                ParametersWithIV parametersWithIV = new ParametersWithIV(parameters, ((IvParameterSpec) algorithmParameterSpec).getIV());
                this.ivParam = parametersWithIV;
                return parametersWithIV;
            }
            if (algorithmParameterSpec instanceof GOST28147ParameterSpec) {
                GOST28147ParameterSpec gOST28147ParameterSpec = (GOST28147ParameterSpec) algorithmParameterSpec;
                ParametersWithSBox parametersWithSBox = new ParametersWithSBox(cipherParameters, gOST28147ParameterSpec.getSbox());
                if (gOST28147ParameterSpec.getIV() == null || this.ivLength == 0) {
                    return parametersWithSBox;
                }
                ParametersWithIV parametersWithIV2 = new ParametersWithIV(parameters, gOST28147ParameterSpec.getIV());
                this.ivParam = parametersWithIV2;
                return parametersWithIV2;
            }
        } else {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                ParametersWithIV parametersWithIV3 = new ParametersWithIV(cipherParameters, ((IvParameterSpec) algorithmParameterSpec).getIV());
                this.ivParam = parametersWithIV3;
                return parametersWithIV3;
            }
            if (algorithmParameterSpec instanceof GOST28147ParameterSpec) {
                GOST28147ParameterSpec gOST28147ParameterSpec2 = (GOST28147ParameterSpec) algorithmParameterSpec;
                ParametersWithSBox parametersWithSBox2 = new ParametersWithSBox(cipherParameters, gOST28147ParameterSpec2.getSbox());
                return (gOST28147ParameterSpec2.getIV() == null || this.ivLength == 0) ? parametersWithSBox2 : new ParametersWithIV(parametersWithSBox2, gOST28147ParameterSpec2.getIV());
            }
        }
        return cipherParameters;
    }

    private boolean isAEADModeName(String str) {
        return "CCM".equals(str) || "EAX".equals(str) || "GCM".equals(str) || "GCM-SIV".equals(str) || "OCB".equals(str);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        int iProcessBytes;
        if (engineGetOutputSize(i2) + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        if (i2 != 0) {
            try {
                iProcessBytes = this.cipher.processBytes(bArr, i, i2, bArr2, i3);
            } catch (OutputLengthException e) {
                throw new IllegalBlockSizeException(e.getMessage());
            } catch (DataLengthException e2) {
                throw new IllegalBlockSizeException(e2.getMessage());
            }
        } else {
            iProcessBytes = 0;
        }
        return iProcessBytes + this.cipher.doFinal(bArr2, i3 + iProcessBytes);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) throws BadPaddingException, IllegalBlockSizeException {
        int iEngineGetOutputSize = engineGetOutputSize(i2);
        byte[] bArr2 = new byte[iEngineGetOutputSize];
        int iProcessBytes = i2 != 0 ? this.cipher.processBytes(bArr, i, i2, bArr2, 0) : 0;
        try {
            int iDoFinal = iProcessBytes + this.cipher.doFinal(bArr2, iProcessBytes);
            if (iDoFinal == iEngineGetOutputSize) {
                return bArr2;
            }
            if (iDoFinal > iEngineGetOutputSize) {
                throw new IllegalBlockSizeException("internal buffer overflow");
            }
            byte[] bArr3 = new byte[iDoFinal];
            System.arraycopy(bArr2, 0, bArr3, 0, iDoFinal);
            return bArr3;
        } catch (DataLengthException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        BlockCipher blockCipher = this.baseEngine;
        if (blockCipher == null) {
            return -1;
        }
        return blockCipher.getBlockSize();
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        AEADParameters aEADParameters = this.aeadParams;
        if (aEADParameters != null) {
            return aEADParameters.getNonce();
        }
        ParametersWithIV parametersWithIV = this.ivParam;
        if (parametersWithIV != null) {
            return parametersWithIV.getIV();
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length << 3;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i) {
        return this.cipher.getOutputSize(i);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() throws InvalidParameterSpecException, IOException {
        if (this.engineParams == null) {
            if (this.pbeSpec != null) {
                try {
                    AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance(this.pbeAlgorithm);
                    this.engineParams = algorithmParametersCreateParametersInstance;
                    algorithmParametersCreateParametersInstance.init(this.pbeSpec);
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.aeadParams != null) {
                if (this.baseEngine == null) {
                    try {
                        AlgorithmParameters algorithmParametersCreateParametersInstance2 = createParametersInstance(PKCSObjectIdentifiers.id_alg_AEADChaCha20Poly1305.getId());
                        this.engineParams = algorithmParametersCreateParametersInstance2;
                        algorithmParametersCreateParametersInstance2.init(new DEROctetString(this.aeadParams.getNonce()).getEncoded());
                    } catch (Exception e) {
                        throw new RuntimeException(e.toString());
                    }
                } else {
                    try {
                        AlgorithmParameters algorithmParametersCreateParametersInstance3 = createParametersInstance("GCM");
                        this.engineParams = algorithmParametersCreateParametersInstance3;
                        algorithmParametersCreateParametersInstance3.init(new GCMParameters(this.aeadParams.getNonce(), this.aeadParams.getMacSize() / 8).getEncoded());
                    } catch (Exception e2) {
                        throw new RuntimeException(e2.toString());
                    }
                }
            } else if (this.ivParam != null) {
                String algorithmName = this.cipher.getUnderlyingCipher().getAlgorithmName();
                if (algorithmName.indexOf(47) >= 0) {
                    algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                }
                try {
                    AlgorithmParameters algorithmParametersCreateParametersInstance4 = createParametersInstance(algorithmName);
                    this.engineParams = algorithmParametersCreateParametersInstance4;
                    algorithmParametersCreateParametersInstance4.init(new IvParameterSpec(this.ivParam.getIV()));
                } catch (Exception e3) {
                    throw new RuntimeException(e3.toString());
                }
            }
        }
        return this.engineParams;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpecExtractSpec;
        if (algorithmParameters != null) {
            algorithmParameterSpecExtractSpec = SpecUtil.extractSpec(algorithmParameters, this.availableSpecs);
            if (algorithmParameterSpecExtractSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        } else {
            algorithmParameterSpecExtractSpec = null;
        }
        engineInit(i, key, algorithmParameterSpecExtractSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0202 A[PHI: r5
      0x0202: PHI (r5v8 org.bouncycastle.crypto.CipherParameters) = 
      (r5v60 org.bouncycastle.crypto.CipherParameters)
      (r5v61 org.bouncycastle.crypto.CipherParameters)
      (r5v62 org.bouncycastle.crypto.CipherParameters)
      (r5v63 org.bouncycastle.crypto.CipherParameters)
     binds: [B:101:0x0200, B:59:0x0144, B:48:0x00f5, B:33:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x049a A[Catch: Exception -> 0x04cb, IllegalArgumentException -> 0x04d6, TryCatch #3 {IllegalArgumentException -> 0x04d6, Exception -> 0x04cb, blocks: (B:235:0x0477, B:236:0x0492, B:237:0x0493, B:239:0x049f, B:241:0x04a5, B:243:0x04a9, B:238:0x049a), top: B:255:0x046e }] */
    /* JADX WARN: Type inference failed for: r2v82, types: [org.bouncycastle.crypto.params.ParametersWithIV] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [org.bouncycastle.crypto.CipherParameters, org.bouncycastle.crypto.params.RC5Parameters] */
    /* JADX WARN: Type inference failed for: r5v15, types: [org.bouncycastle.crypto.CipherParameters, org.bouncycastle.crypto.params.RC2Parameters] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [org.bouncycastle.crypto.CipherParameters, org.bouncycastle.crypto.params.ParametersWithSBox] */
    /* JADX WARN: Type inference failed for: r5v18, types: [org.bouncycastle.crypto.params.ParametersWithIV] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v22, types: [org.bouncycastle.crypto.CipherParameters] */
    /* JADX WARN: Type inference failed for: r5v27, types: [org.bouncycastle.crypto.params.AEADParameters] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v9, types: [org.bouncycastle.crypto.CipherParameters] */
    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        CipherParameters cipherParametersMakePBEParameters;
        CipherParameters cipherParameters;
        ParametersWithIV parametersWithIV;
        ParametersWithRandom parametersWithRandom;
        GenericBlockCipher genericBlockCipher;
        CipherParameters cipherParametersMakePBEParameters2;
        BlockCipher blockCipher;
        KeyParameter keyParameterExtractAeadParameters = 0;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.engineParams = null;
        this.aeadParams = null;
        if (!(key instanceof SecretKey)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Key for algorithm ");
            sb.append(key != null ? key.getAlgorithm() : null);
            sb.append(" not suitable for symmetric enryption.");
            throw new InvalidKeyException(sb.toString());
        }
        if (algorithmParameterSpec == null && (blockCipher = this.baseEngine) != null && blockCipher.getAlgorithmName().startsWith("RC5-64")) {
            throw new InvalidAlgorithmParameterException("RC5 requires an RC5ParametersSpec to be passed in.");
        }
        int i2 = this.scheme;
        if (i2 == 2 || (key instanceof PKCS12Key)) {
            try {
                SecretKey secretKey = (SecretKey) key;
                if (algorithmParameterSpec instanceof PBEParameterSpec) {
                    this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
                }
                boolean z = secretKey instanceof PBEKey;
                if (z && this.pbeSpec == null) {
                    PBEKey pBEKey = (PBEKey) secretKey;
                    if (pBEKey.getSalt() == null) {
                        throw new InvalidAlgorithmParameterException("PBEKey requires parameters to specify salt");
                    }
                    this.pbeSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                }
                if (this.pbeSpec == null && !z) {
                    throw new InvalidKeyException("Algorithm requires a PBE key");
                }
                if (key instanceof BCPBEKey) {
                    CipherParameters param = ((BCPBEKey) key).getParam();
                    if (!(param instanceof ParametersWithIV)) {
                        if (param != null) {
                            throw new InvalidKeyException("Algorithm requires a PBE key suitable for PKCS12");
                        }
                        param = PBE.Util.makePBEParameters(secretKey.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength << 3, this.pbeSpec, this.cipher.getAlgorithmName());
                    }
                    cipherParametersMakePBEParameters = param;
                } else {
                    cipherParametersMakePBEParameters = PBE.Util.makePBEParameters(secretKey.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength << 3, this.pbeSpec, this.cipher.getAlgorithmName());
                }
                boolean z2 = cipherParametersMakePBEParameters instanceof ParametersWithIV;
                keyParameterExtractAeadParameters = cipherParametersMakePBEParameters;
                cipherParameters = cipherParametersMakePBEParameters;
                if (z2) {
                    this.ivParam = (ParametersWithIV) cipherParameters;
                    keyParameterExtractAeadParameters = cipherParameters;
                }
            } catch (Exception unused) {
                throw new InvalidKeyException("PKCS12 requires a SecretKey/PBEKey");
            }
        } else if (key instanceof PBKDF1Key) {
            PBKDF1Key pBKDF1Key = (PBKDF1Key) key;
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
            }
            if ((pBKDF1Key instanceof PBKDF1KeyWithParameters) && this.pbeSpec == null) {
                PBKDF1KeyWithParameters pBKDF1KeyWithParameters = (PBKDF1KeyWithParameters) pBKDF1Key;
                this.pbeSpec = new PBEParameterSpec(pBKDF1KeyWithParameters.getSalt(), pBKDF1KeyWithParameters.getIterationCount());
            }
            CipherParameters cipherParametersMakePBEParameters3 = PBE.Util.makePBEParameters(pBKDF1Key.getEncoded(), 0, this.digest, this.keySizeInBits, this.ivLength << 3, this.pbeSpec, this.cipher.getAlgorithmName());
            boolean z3 = cipherParametersMakePBEParameters3 instanceof ParametersWithIV;
            keyParameterExtractAeadParameters = cipherParametersMakePBEParameters3;
            cipherParameters = cipherParametersMakePBEParameters3;
            if (z3) {
            }
        } else if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            this.pbeAlgorithm = bCPBEKey.getOID() != null ? bCPBEKey.getOID().getId() : bCPBEKey.getAlgorithm();
            if (bCPBEKey.getParam() != null) {
                cipherParametersMakePBEParameters2 = adjustParameters(algorithmParameterSpec, bCPBEKey.getParam());
            } else {
                if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
                this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
                cipherParametersMakePBEParameters2 = PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.cipher.getUnderlyingCipher().getAlgorithmName());
            }
            boolean z4 = cipherParametersMakePBEParameters2 instanceof ParametersWithIV;
            keyParameterExtractAeadParameters = cipherParametersMakePBEParameters2;
            cipherParameters = cipherParametersMakePBEParameters2;
            if (z4) {
            }
        } else if (key instanceof PBEKey) {
            PBEKey pBEKey2 = (PBEKey) key;
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            this.pbeSpec = pBEParameterSpec;
            if ((pBEKey2 instanceof PKCS12KeyWithParameters) && pBEParameterSpec == null) {
                this.pbeSpec = new PBEParameterSpec(pBEKey2.getSalt(), pBEKey2.getIterationCount());
            }
            CipherParameters cipherParametersMakePBEParameters4 = PBE.Util.makePBEParameters(pBEKey2.getEncoded(), this.scheme, this.digest, this.keySizeInBits, this.ivLength << 3, this.pbeSpec, this.cipher.getAlgorithmName());
            boolean z5 = cipherParametersMakePBEParameters4 instanceof ParametersWithIV;
            keyParameterExtractAeadParameters = cipherParametersMakePBEParameters4;
            cipherParameters = cipherParametersMakePBEParameters4;
            if (z5) {
            }
        } else if (!(key instanceof RepeatedSecretKeySpec)) {
            if (i2 == 0 || i2 == 4 || i2 == 1 || i2 == 5) {
                throw new InvalidKeyException("Algorithm requires a PBE key");
            }
            keyParameterExtractAeadParameters = new KeyParameter(key.getEncoded());
        }
        try {
            if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                    if (algorithmParameterSpec instanceof GOST28147ParameterSpec) {
                        GOST28147ParameterSpec gOST28147ParameterSpec = (GOST28147ParameterSpec) algorithmParameterSpec;
                        keyParameterExtractAeadParameters = new ParametersWithSBox(new KeyParameter(key.getEncoded()), gOST28147ParameterSpec.getSbox());
                        if (gOST28147ParameterSpec.getIV() != null && this.ivLength != 0) {
                            parametersWithIV = new ParametersWithIV(keyParameterExtractAeadParameters, gOST28147ParameterSpec.getIV());
                            keyParameterExtractAeadParameters = parametersWithIV;
                        }
                    } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                        RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                        keyParameterExtractAeadParameters = new RC2Parameters(key.getEncoded(), rC2ParameterSpec.getEffectiveKeyBits());
                        if (rC2ParameterSpec.getIV() != null && this.ivLength != 0) {
                            parametersWithIV = new ParametersWithIV(keyParameterExtractAeadParameters, rC2ParameterSpec.getIV());
                            keyParameterExtractAeadParameters = parametersWithIV;
                        }
                    } else if (algorithmParameterSpec instanceof RC5ParameterSpec) {
                        RC5ParameterSpec rC5ParameterSpec = (RC5ParameterSpec) algorithmParameterSpec;
                        keyParameterExtractAeadParameters = new RC5Parameters(key.getEncoded(), rC5ParameterSpec.getRounds());
                        if (!this.baseEngine.getAlgorithmName().startsWith("RC5")) {
                            throw new InvalidAlgorithmParameterException("RC5 parameters passed to a cipher that is not RC5.");
                        }
                        if (this.baseEngine.getAlgorithmName().equals("RC5-32")) {
                            if (rC5ParameterSpec.getWordSize() != 32) {
                                throw new InvalidAlgorithmParameterException("RC5 already set up for a word size of 32 not " + rC5ParameterSpec.getWordSize() + onVideoError.onExtraCallbackWithResult);
                            }
                        } else if (this.baseEngine.getAlgorithmName().equals("RC5-64") && rC5ParameterSpec.getWordSize() != 64) {
                            throw new InvalidAlgorithmParameterException("RC5 already set up for a word size of 64 not " + rC5ParameterSpec.getWordSize() + onVideoError.onExtraCallbackWithResult);
                        }
                        if (rC5ParameterSpec.getIV() != null && this.ivLength != 0) {
                            parametersWithIV = new ParametersWithIV(keyParameterExtractAeadParameters, rC5ParameterSpec.getIV());
                            keyParameterExtractAeadParameters = parametersWithIV;
                        }
                    } else if (algorithmParameterSpec instanceof FPEParameterSpec) {
                        FPEParameterSpec fPEParameterSpec = (FPEParameterSpec) algorithmParameterSpec;
                        keyParameterExtractAeadParameters = new FPEParameters(keyParameterExtractAeadParameters, fPEParameterSpec.getRadix(), fPEParameterSpec.getTweak(), fPEParameterSpec.isUsingInverseFunction());
                    } else {
                        Class cls = gcmSpecClass;
                        if (cls == null || !cls.isInstance(algorithmParameterSpec)) {
                            if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                                throw new InvalidAlgorithmParameterException("unknown parameter type.");
                            }
                        } else {
                            if (!isAEADModeName(this.modeName) && !(this.cipher instanceof AEADGenericBlockCipher)) {
                                throw new InvalidAlgorithmParameterException("GCMParameterSpec can only be used with AEAD modes.");
                            }
                            keyParameterExtractAeadParameters = GcmSpecUtil.extractAeadParameters(keyParameterExtractAeadParameters instanceof ParametersWithIV ? (KeyParameter) ((ParametersWithIV) keyParameterExtractAeadParameters).getParameters() : keyParameterExtractAeadParameters, algorithmParameterSpec);
                        }
                    }
                    this.ivParam = keyParameterExtractAeadParameters;
                } else if (this.ivLength != 0) {
                    IvParameterSpec ivParameterSpec = (IvParameterSpec) algorithmParameterSpec;
                    if (ivParameterSpec.getIV().length != this.ivLength && !(this.cipher instanceof AEADGenericBlockCipher) && this.fixedIv) {
                        throw new InvalidAlgorithmParameterException("IV must be " + this.ivLength + " bytes long.");
                    }
                    keyParameterExtractAeadParameters = keyParameterExtractAeadParameters instanceof ParametersWithIV ? new ParametersWithIV(((ParametersWithIV) keyParameterExtractAeadParameters).getParameters(), ivParameterSpec.getIV()) : new ParametersWithIV(keyParameterExtractAeadParameters, ivParameterSpec.getIV());
                    this.ivParam = keyParameterExtractAeadParameters;
                } else {
                    String str = this.modeName;
                    if (str != null && str.equals("ECB")) {
                        throw new InvalidAlgorithmParameterException("ECB mode does not use an IV");
                    }
                }
                parametersWithRandom = keyParameterExtractAeadParameters;
                if (this.ivLength != 0) {
                    boolean z6 = keyParameterExtractAeadParameters instanceof ParametersWithIV;
                    parametersWithRandom = keyParameterExtractAeadParameters;
                    if (!z6) {
                        boolean z7 = keyParameterExtractAeadParameters instanceof AEADParameters;
                        parametersWithRandom = keyParameterExtractAeadParameters;
                        if (!z7) {
                            SecureRandom secureRandom2 = secureRandom == null ? CryptoServicesRegistrar.getSecureRandom() : secureRandom;
                            if (i == 1 || i == 3) {
                                byte[] bArr = new byte[this.ivLength];
                                secureRandom2.nextBytes(bArr);
                                ?? parametersWithIV2 = new ParametersWithIV(keyParameterExtractAeadParameters, bArr);
                                this.ivParam = parametersWithIV2;
                                parametersWithRandom = parametersWithIV2;
                            } else {
                                parametersWithRandom = keyParameterExtractAeadParameters;
                                if (this.cipher.getUnderlyingCipher().getAlgorithmName().indexOf("PGPCFB") < 0) {
                                    throw new InvalidAlgorithmParameterException("no IV set when one expected");
                                }
                            }
                        }
                    }
                }
                if (secureRandom != null && this.padded) {
                    parametersWithRandom = new ParametersWithRandom(parametersWithRandom, secureRandom);
                }
                if (i == 1) {
                    this.cipher.init(true, parametersWithRandom);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new InvalidParameterException("unknown opmode " + i + " passed");
                            }
                        }
                        this.cipher.init(true, parametersWithRandom);
                    }
                    this.cipher.init(false, parametersWithRandom);
                }
                genericBlockCipher = this.cipher;
                if ((genericBlockCipher instanceof AEADGenericBlockCipher) || this.aeadParams != null) {
                    return;
                }
                this.aeadParams = new AEADParameters((KeyParameter) this.ivParam.getParameters(), ((AEADGenericBlockCipher) genericBlockCipher).cipher.getMac().length << 3, this.ivParam.getIV());
                return;
            }
            if (!isAEADModeName(this.modeName) && !(this.cipher instanceof AEADGenericBlockCipher)) {
                throw new InvalidAlgorithmParameterException("AEADParameterSpec can only be used with AEAD modes.");
            }
            AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
            keyParameterExtractAeadParameters = new AEADParameters(keyParameterExtractAeadParameters instanceof ParametersWithIV ? (KeyParameter) ((ParametersWithIV) keyParameterExtractAeadParameters).getParameters() : keyParameterExtractAeadParameters, aEADParameterSpec.getMacSizeInBits(), aEADParameterSpec.getNonce(), aEADParameterSpec.getAssociatedData());
            if (i == 1) {
            }
            genericBlockCipher = this.cipher;
            if (genericBlockCipher instanceof AEADGenericBlockCipher) {
                return;
            } else {
                return;
            }
        } catch (IllegalArgumentException e) {
            throw new InvalidAlgorithmParameterException(e.getMessage(), e);
        } catch (Exception e2) {
            throw new BaseWrapCipher.InvalidKeyOrParametersException(e2.getMessage(), e2);
        }
        this.aeadParams = keyParameterExtractAeadParameters;
        parametersWithRandom = keyParameterExtractAeadParameters;
        if (this.ivLength != 0) {
        }
        if (secureRandom != null) {
            parametersWithRandom = new ParametersWithRandom(parametersWithRandom, secureRandom);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetMode(String str) throws NoSuchAlgorithmException, NumberFormatException {
        if (this.baseEngine == null) {
            throw new NoSuchAlgorithmException("no mode supported for this algorithm");
        }
        String upperCase = Strings.toUpperCase(str);
        this.modeName = upperCase;
        if (upperCase.equals("ECB")) {
            this.ivLength = 0;
            this.cipher = new BufferedGenericBlockCipher(this.baseEngine);
            return;
        }
        if (this.modeName.equals("CBC")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher((BlockCipher) new CBCBlockCipher(this.baseEngine));
            return;
        }
        if (this.modeName.startsWith("OFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            if (this.modeName.length() != 3) {
                this.cipher = new BufferedGenericBlockCipher(new OFBBlockCipher(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                return;
            } else {
                BlockCipher blockCipher = this.baseEngine;
                this.cipher = new BufferedGenericBlockCipher(new OFBBlockCipher(blockCipher, blockCipher.getBlockSize() << 3));
                return;
            }
        }
        if (this.modeName.startsWith("CFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            if (this.modeName.length() != 3) {
                this.cipher = new BufferedGenericBlockCipher(new CFBBlockCipher(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                return;
            } else {
                BlockCipher blockCipher2 = this.baseEngine;
                this.cipher = new BufferedGenericBlockCipher(new CFBBlockCipher(blockCipher2, blockCipher2.getBlockSize() << 3));
                return;
            }
        }
        if (this.modeName.startsWith("PGPCFB")) {
            boolean zEquals = this.modeName.equals("PGPCFBWITHIV");
            if (zEquals || this.modeName.length() == 6) {
                this.ivLength = this.baseEngine.getBlockSize();
                this.cipher = new BufferedGenericBlockCipher(new PGPCFBBlockCipher(this.baseEngine, zEquals));
                return;
            } else {
                throw new NoSuchAlgorithmException("no mode support for " + this.modeName);
            }
        }
        if (this.modeName.equals("OPENPGPCFB")) {
            this.ivLength = 0;
            this.cipher = new BufferedGenericBlockCipher(new OpenPGPCFBBlockCipher(this.baseEngine));
            return;
        }
        if (this.modeName.equals("FF1")) {
            this.ivLength = 0;
            this.cipher = new BufferedFPEBlockCipher(new FPEFF1Engine(this.baseEngine));
            return;
        }
        if (this.modeName.equals("FF3-1")) {
            this.ivLength = 0;
            this.cipher = new BufferedFPEBlockCipher(new FPEFF3_1Engine(this.baseEngine));
            return;
        }
        if (this.modeName.equals("SIC")) {
            int blockSize = this.baseEngine.getBlockSize();
            this.ivLength = blockSize;
            if (blockSize < 16) {
                throw new IllegalArgumentException("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
            }
            this.fixedIv = false;
            this.cipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(new SICBlockCipher(this.baseEngine)));
            return;
        }
        if (this.modeName.equals("CTR")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.fixedIv = false;
            BlockCipher blockCipher3 = this.baseEngine;
            if (blockCipher3 instanceof DSTU7624Engine) {
                this.cipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(new KCTRBlockCipher(blockCipher3)));
                return;
            } else {
                this.cipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(new SICBlockCipher(blockCipher3)));
                return;
            }
        }
        if (this.modeName.equals("GOFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(new GOFBBlockCipher(this.baseEngine)));
            return;
        }
        if (this.modeName.equals("GCFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(new GCFBBlockCipher(this.baseEngine)));
            return;
        }
        if (this.modeName.equals("CTS")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new CTSBlockCipher(new CBCBlockCipher(this.baseEngine)));
            return;
        }
        if (this.modeName.equals("CCM")) {
            this.ivLength = 12;
            if (this.baseEngine instanceof DSTU7624Engine) {
                this.cipher = new AEADGenericBlockCipher(new KCCMBlockCipher(this.baseEngine));
                return;
            } else {
                this.cipher = new AEADGenericBlockCipher(new CCMBlockCipher(this.baseEngine));
                return;
            }
        }
        if (this.modeName.equals("OCB")) {
            if (this.engineProvider != null) {
                this.ivLength = 15;
                this.cipher = new AEADGenericBlockCipher(new OCBBlockCipher(this.baseEngine, this.engineProvider.get()));
                return;
            } else {
                throw new NoSuchAlgorithmException("can't support mode " + str);
            }
        }
        if (this.modeName.equals("EAX")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new AEADGenericBlockCipher(new EAXBlockCipher(this.baseEngine));
            return;
        }
        if (this.modeName.equals("GCM-SIV")) {
            this.ivLength = 12;
            this.cipher = new AEADGenericBlockCipher(new GCMSIVBlockCipher(this.baseEngine));
            return;
        }
        if (!this.modeName.equals("GCM")) {
            throw new NoSuchAlgorithmException("can't support mode " + str);
        }
        BlockCipher blockCipher4 = this.baseEngine;
        if (blockCipher4 instanceof DSTU7624Engine) {
            this.ivLength = blockCipher4.getBlockSize();
            this.cipher = new AEADGenericBlockCipher(new KGCMBlockCipher(this.baseEngine));
        } else {
            this.ivLength = 12;
            this.cipher = new AEADGenericBlockCipher(new GCMBlockCipher(this.baseEngine));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetPadding(String str) throws NoSuchPaddingException {
        BufferedGenericBlockCipher bufferedGenericBlockCipher;
        if (this.baseEngine == null) {
            throw new NoSuchPaddingException("no padding supported for this algorithm");
        }
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("NOPADDING")) {
            if (!this.cipher.wrapOnNoPadding()) {
                return;
            } else {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(this.cipher.getUnderlyingCipher()));
            }
        } else if (upperCase.equals("WITHCTS") || upperCase.equals("CTSPADDING") || upperCase.equals("CS3PADDING")) {
            bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new CTSBlockCipher(this.cipher.getUnderlyingCipher()));
        } else {
            this.padded = true;
            if (isAEADModeName(this.modeName)) {
                throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
            }
            if (upperCase.equals("PKCS5PADDING") || upperCase.equals("PKCS7PADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher());
            } else if (upperCase.equals("ZEROBYTEPADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ZeroBytePadding());
            } else if (upperCase.equals("ISO10126PADDING") || upperCase.equals("ISO10126-2PADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ISO10126d2Padding());
            } else if (upperCase.equals("X9.23PADDING") || upperCase.equals("X923PADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new X923Padding());
            } else if (upperCase.equals("ISO7816-4PADDING") || upperCase.equals("ISO9797-1PADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ISO7816d4Padding());
            } else {
                if (!upperCase.equals("TBCPADDING")) {
                    throw new NoSuchPaddingException("Padding " + str + " unknown.");
                }
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new TBCPadding());
            }
        }
        this.cipher = bufferedGenericBlockCipher;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (this.cipher.getUpdateOutputSize(i2) + i3 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        try {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        } catch (DataLengthException e) {
            throw new IllegalStateException(e.toString());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) throws DataLengthException {
        int updateOutputSize = this.cipher.getUpdateOutputSize(i2);
        if (updateOutputSize <= 0) {
            this.cipher.processBytes(bArr, i, i2, null, 0);
            return null;
        }
        byte[] bArr2 = new byte[updateOutputSize];
        int iProcessBytes = this.cipher.processBytes(bArr, i, i2, bArr2, 0);
        if (iProcessBytes == 0) {
            return null;
        }
        if (iProcessBytes == updateOutputSize) {
            return bArr2;
        }
        byte[] bArr3 = new byte[iProcessBytes];
        System.arraycopy(bArr2, 0, bArr3, 0, iProcessBytes);
        return bArr3;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining <= 0) {
            return;
        }
        if (byteBuffer.hasArray()) {
            engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), iRemaining);
            byteBuffer.position(byteBuffer.limit());
            return;
        }
        if (iRemaining <= 512) {
            byte[] bArr = new byte[iRemaining];
            byteBuffer.get(bArr);
            engineUpdateAAD(bArr, 0, iRemaining);
            Arrays.fill(bArr, (byte) 0);
            return;
        }
        byte[] bArr2 = new byte[512];
        do {
            int iMin = Math.min(512, iRemaining);
            byteBuffer.get(bArr2, 0, iMin);
            engineUpdateAAD(bArr2, 0, iMin);
            iRemaining -= iMin;
        } while (iRemaining > 0);
        Arrays.fill(bArr2, (byte) 0);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(byte[] bArr, int i, int i2) {
        this.cipher.updateAAD(bArr, i, i2);
    }
}
