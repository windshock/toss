package org.bouncycastle.crypto.prng.drbg;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class CTRSP800DRBG implements SP80090DRBG {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int AES_MAX_BITS_REQUEST = 262144;
    private static final long AES_RESEED_MAX = 140737488355328L;
    private static char IAuthTabCallback = 0;
    private static final byte[] K_BITS;
    private static final int TDEA_MAX_BITS_REQUEST = 4096;
    private static final long TDEA_RESEED_MAX = 2147483648L;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;
    private byte[] _Key;
    private byte[] _V;
    private BlockCipher _engine;
    private EntropySource _entropySource;
    private boolean _isTDEA;
    private int _keySizeInBits;
    private long _reseedCounter = 0;
    private int _securityStrength;
    private int _seedLength;

    static {
        onWarmupCompleted();
        K_BITS = Hex.decodeStrict("000102030405060708090A0B0C0D0E0F101112131415161718191A1B1C1D1E1F");
        int i = asBinder + 101;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public CTRSP800DRBG(BlockCipher blockCipher, int i, int i2, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        this._isTDEA = false;
        this._entropySource = entropySource;
        this._engine = blockCipher;
        this._keySizeInBits = i;
        this._securityStrength = i2;
        this._seedLength = (blockCipher.getBlockSize() << 3) + i;
        this._isTDEA = isTDEA(blockCipher);
        if (i2 > 256) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (getMaxSecurityStrength(blockCipher, i) < i2) {
            throw new IllegalArgumentException("Requested security strength is not supported by block cipher and key size");
        }
        int i3 = asInterface + 3;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            entropySource.entropySize();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (entropySource.entropySize() < i2) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        CTR_DRBG_Instantiate_algorithm(getEntropy(), bArr2, bArr);
        int i4 = asInterface + 43;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
    }

    private void BCC(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i = 2 % 2;
        int blockSize = this._engine.getBlockSize();
        byte[] bArr5 = new byte[blockSize];
        int length = bArr4.length / blockSize;
        byte[] bArr6 = new byte[blockSize];
        this._engine.init(true, new KeyParameter(expandKey(bArr2)));
        this._engine.processBlock(bArr3, 0, bArr5, 0);
        int i2 = asInterface + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = asInterface + 3;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            XOR(bArr6, bArr5, bArr4, i4 * blockSize);
            this._engine.processBlock(bArr6, 0, bArr5, 0);
        }
        System.arraycopy(bArr5, 0, bArr, 0, bArr.length);
        int i7 = onTransact + 93;
        asInterface = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 8 / 0;
        }
    }

    private byte[] Block_Cipher_df(byte[] bArr, int i) {
        int i2 = 2 % 2;
        int blockSize = this._engine.getBlockSize();
        int length = bArr.length;
        int i3 = i / 8;
        byte[] bArr2 = new byte[((((length + 9) + blockSize) - 1) / blockSize) * blockSize];
        copyIntToByteArray(bArr2, length, 0);
        copyIntToByteArray(bArr2, i3, 4);
        System.arraycopy(bArr, 0, bArr2, 8, length);
        bArr2[length + 8] = ISOFileInfo.DATA_BYTES1;
        int i4 = this._keySizeInBits;
        int i5 = (i4 / 8) + blockSize;
        byte[] bArr3 = new byte[i5];
        byte[] bArr4 = new byte[blockSize];
        byte[] bArr5 = new byte[blockSize];
        int i6 = i4 / 8;
        byte[] bArr6 = new byte[i6];
        System.arraycopy(K_BITS, 0, bArr6, 0, i6);
        int i7 = 0;
        while (true) {
            int i8 = i7 * blockSize;
            if ((i8 << 3) >= this._keySizeInBits + (blockSize << 3)) {
                break;
            }
            copyIntToByteArray(bArr5, i7, 0);
            BCC(bArr4, bArr6, bArr5, bArr2);
            int i9 = i5 - i8;
            if (i9 > blockSize) {
                i9 = blockSize;
            }
            System.arraycopy(bArr4, 0, bArr3, i8, i9);
            i7++;
        }
        byte[] bArr7 = new byte[blockSize];
        System.arraycopy(bArr3, 0, bArr6, 0, i6);
        System.arraycopy(bArr3, i6, bArr7, 0, blockSize);
        byte[] bArr8 = new byte[i3];
        this._engine.init(true, new KeyParameter(expandKey(bArr6)));
        int i10 = 0;
        while (true) {
            int i11 = i10 * blockSize;
            if (i11 >= i3) {
                int i12 = asInterface + 105;
                onTransact = i12 % 128;
                int i13 = i12 % 2;
                return bArr8;
            }
            this._engine.processBlock(bArr7, 0, bArr7, 0);
            int i14 = i3 - i11;
            if (i14 > blockSize) {
                int i15 = onTransact + 13;
                asInterface = i15 % 128;
                int i16 = i15 % 2;
                i14 = blockSize;
            }
            System.arraycopy(bArr7, 0, bArr8, i11, i14);
            i10++;
        }
    }

    private void CTR_DRBG_Instantiate_algorithm(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrBlock_Cipher_df = Block_Cipher_df(Arrays.concatenate(bArr, bArr2, bArr3), this._seedLength);
        int blockSize = this._engine.getBlockSize();
        byte[] bArr4 = new byte[(this._keySizeInBits + 7) / 8];
        this._Key = bArr4;
        byte[] bArr5 = new byte[blockSize];
        this._V = bArr5;
        CTR_DRBG_Update(bArrBlock_Cipher_df, bArr4, bArr5);
        this._reseedCounter = 1L;
        int i4 = onTransact + 111;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void CTR_DRBG_Reseed_algorithm(byte[] bArr) {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        CTR_DRBG_Update(Block_Cipher_df(Arrays.concatenate(getEntropy(), bArr), this._seedLength), this._Key, this._V);
        this._reseedCounter = 1L;
        int i4 = onTransact + 75;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void CTR_DRBG_Update(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i;
        int i2 = 2 % 2;
        int length = bArr.length;
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[this._engine.getBlockSize()];
        int blockSize = this._engine.getBlockSize();
        this._engine.init(true, new KeyParameter(expandKey(bArr2)));
        int i3 = 0;
        while (true) {
            int i4 = i3 * blockSize;
            if (i4 >= bArr.length) {
                break;
            }
            int i5 = asInterface + 41;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            addOneTo(bArr3);
            if (i6 != 0) {
                this._engine.processBlock(bArr3, 1, bArr5, 1);
                i = length - i4;
                if (i > blockSize) {
                    int i7 = asInterface + 91;
                    onTransact = i7 % 128;
                    int i8 = i7 % 2;
                    i = blockSize;
                }
            } else {
                this._engine.processBlock(bArr3, 0, bArr5, 0);
                i = length - i4;
                if (i > blockSize) {
                }
            }
            System.arraycopy(bArr5, 0, bArr4, i4, i);
            i3++;
        }
        XOR(bArr4, bArr, bArr4, 0);
        System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
        System.arraycopy(bArr4, bArr2.length, bArr3, 0, bArr3.length);
        int i9 = onTransact + 63;
        asInterface = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 44 / 0;
        }
    }

    private void XOR(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        int i2 = 2 % 2;
        int i3 = 0;
        while (i3 < bArr.length) {
            bArr[i3] = (byte) (bArr2[i3] ^ bArr3[i3 + i]);
            i3++;
            int i4 = onTransact + 23;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = asInterface + 75;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private void addOneTo(byte[] bArr) {
        int i;
        int i2 = 2 % 2;
        int i3 = 1;
        for (int i4 = 1; i4 <= bArr.length; i4++) {
            int i5 = onTransact + 83;
            int i6 = i5 % 128;
            asInterface = i6;
            if (i5 % 2 != 0 ? (i = (bArr[bArr.length - i4] & 255) + i3) <= 255 : (i = (bArr[bArr.length / i4] & 9416) - i3) <= 9507) {
                int i7 = i6 + 89;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                i3 = 0;
            } else {
                int i9 = i6 + 31;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                i3 = 1;
            }
            bArr[bArr.length - i4] = (byte) i;
        }
    }

    private void copyIntToByteArray(byte[] bArr, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface;
        int i5 = i4 + 81;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
        int i7 = i4 + 77;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v9 byte[], still in use, count: 2, list:
          (r1v9 byte[]) from 0x0014: ARRAY_LENGTH (r1v9 byte[]) A[WRAPPED]
          (r1v9 byte[]) from 0x002d: PHI (r1v6 byte[]) = (r1v5 byte[]), (r1v9 byte[]) binds: [B:8:0x002b, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private byte[] getEntropy() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = org.bouncycastle.crypto.prng.drbg.CTRSP800DRBG.onTransact
            int r1 = r1 + 47
            int r2 = r1 % 128
            org.bouncycastle.crypto.prng.drbg.CTRSP800DRBG.asInterface = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1e
            org.bouncycastle.crypto.prng.EntropySource r1 = r4._entropySource
            byte[] r1 = r1.getEntropy()
            int r2 = r1.length
            int r3 = r4._securityStrength
            int r3 = r3 / 37
            int r3 = r3 + (-35)
            if (r2 < r3) goto L37
            goto L2d
        L1e:
            org.bouncycastle.crypto.prng.EntropySource r1 = r4._entropySource
            byte[] r1 = r1.getEntropy()
            int r2 = r1.length
            int r3 = r4._securityStrength
            int r3 = r3 + 7
            int r3 = r3 / 8
            if (r2 < r3) goto L37
        L2d:
            int r2 = org.bouncycastle.crypto.prng.drbg.CTRSP800DRBG.asInterface
            int r2 = r2 + 123
            int r3 = r2 % 128
            org.bouncycastle.crypto.prng.drbg.CTRSP800DRBG.onTransact = r3
            int r2 = r2 % r0
            return r1
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Insufficient entropy provided by entropy source"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.prng.drbg.CTRSP800DRBG.getEntropy():byte[]");
    }

    private int getMaxSecurityStrength(BlockCipher blockCipher, int i) throws Throwable {
        int i2 = 2 % 2;
        if (isTDEA(blockCipher) && i == 168) {
            int i3 = asInterface + 49;
            onTransact = i3 % 128;
            return i3 % 2 != 0 ? 24 : 112;
        }
        String algorithmName = blockCipher.getAlgorithmName();
        Object[] objArr = new Object[1];
        a(new char[]{874, 59046, 23553, 32865}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 3, objArr);
        if (algorithmName.equals(((String) objArr[0]).intern())) {
            return i;
        }
        int i4 = asInterface + 103;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return -1;
    }

    private boolean isTDEA(BlockCipher blockCipher) {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (!blockCipher.getAlgorithmName().equals("DESede")) {
            int i4 = asInterface + 113;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            if (!blockCipher.getAlgorithmName().equals("TDEA")) {
                int i6 = onTransact + 15;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
        }
        return true;
    }

    private void padKey(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 77;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        bArr2[i2] = (byte) (bArr[i] & 254);
        int i6 = i + 1;
        bArr2[i2 + 1] = (byte) ((bArr[i] << 7) | ((bArr[i6] & 252) >>> 1));
        byte b = bArr[i6];
        int i7 = i + 2;
        bArr2[i2 + 2] = (byte) ((b << 6) | ((bArr[i7] & 248) >>> 2));
        byte b2 = bArr[i7];
        int i8 = i + 3;
        bArr2[i2 + 3] = (byte) ((b2 << 5) | ((bArr[i8] & 240) >>> 3));
        byte b3 = bArr[i8];
        int i9 = i + 4;
        bArr2[i2 + 4] = (byte) ((b3 << 4) | ((bArr[i9] & ISO7816.INS_CREATE_FILE) >>> 4));
        byte b4 = bArr[i9];
        int i10 = i + 5;
        bArr2[i2 + 5] = (byte) ((b4 << 3) | ((bArr[i10] & ISO7816.INS_GET_RESPONSE) >>> 5));
        int i11 = i + 6;
        bArr2[i2 + 6] = (byte) ((bArr[i10] << 2) | ((bArr[i11] & ISOFileInfo.DATA_BYTES1) >>> 6));
        int i12 = i2 + 7;
        bArr2[i12] = (byte) (bArr[i11] << 1);
        while (i2 <= i12) {
            int i13 = asInterface;
            int i14 = i13 + 53;
            onTransact = i14 % 128;
            int i15 = i14 % 2;
            byte b5 = bArr2[i2];
            bArr2[i2] = (byte) ((b5 & 254) | ((((b5 >> 7) ^ ((((((b5 >> 1) ^ (b5 >> 2)) ^ (b5 >> 3)) ^ (b5 >> 4)) ^ (b5 >> 5)) ^ (b5 >> 6))) ^ 1) & 1));
            i2++;
            int i16 = i13 + 21;
            onTransact = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 3 / 3;
            }
        }
    }

    byte[] expandKey(byte[] bArr) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 123;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (!this._isTDEA) {
            return bArr;
        }
        int i5 = i2 + 123;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        byte[] bArr2 = new byte[24];
        padKey(bArr, 0, bArr2, 0);
        padKey(bArr, 7, bArr2, 8);
        padKey(bArr, 14, bArr2, 16);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z) {
        byte[] bArrBlock_Cipher_df;
        int length;
        int i = 2 % 2;
        boolean z2 = this._isTDEA;
        long j = this._reseedCounter;
        Object obj = null;
        if (z2) {
            int i2 = asInterface + 5;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (j > TDEA_RESEED_MAX) {
                return -1;
            }
            if (Utils.isTooLarge(bArr, 512)) {
                throw new IllegalArgumentException("Number of bits per request limited to 4096");
            }
        } else {
            if (j > AES_RESEED_MAX) {
                return -1;
            }
            if (Utils.isTooLarge(bArr, 32768)) {
                throw new IllegalArgumentException("Number of bits per request limited to 262144");
            }
        }
        if (z) {
            CTR_DRBG_Reseed_algorithm(bArr2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            bArrBlock_Cipher_df = Block_Cipher_df(bArr2, this._seedLength);
            CTR_DRBG_Update(bArrBlock_Cipher_df, this._Key, this._V);
        } else {
            bArrBlock_Cipher_df = new byte[this._seedLength / 8];
        }
        int length2 = this._V.length;
        byte[] bArr3 = new byte[length2];
        this._engine.init(true, new KeyParameter(expandKey(this._Key)));
        for (int i3 = 0; i3 <= bArr.length / length2; i3++) {
            int i4 = i3 * length2;
            if (bArr.length - i4 > length2) {
                length = length2;
            } else {
                length = bArr.length - (this._V.length * i3);
                int i5 = onTransact + 7;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
            }
            if (length != 0) {
                int i7 = asInterface + 79;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                addOneTo(this._V);
                this._engine.processBlock(this._V, 0, bArr3, 0);
                System.arraycopy(bArr3, 0, bArr, i4, length);
            }
        }
        CTR_DRBG_Update(bArrBlock_Cipher_df, this._Key, this._V);
        this._reseedCounter++;
        return bArr.length << 3;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        int i3 = i2 % 128;
        asInterface = i3;
        int length = i2 % 2 == 0 ? this._V.length / 4 : this._V.length << 3;
        int i4 = i3 + 49;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return length;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        CTR_DRBG_Reseed_algorithm(bArr);
        int i4 = asInterface + 67;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 11;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 61;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char size = (char) View.MeasureSpec.getSize(i3);
                        int fadingEdgeLength = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int trimmedLength = TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(size, fadingEdgeLength, trimmedLength, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 10 - View.resolveSize(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 16014), 13 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), 19901 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = (char) 64382;
        onWarmupCompleted = (char) 62713;
        onExtraCallback = (char) 10336;
        onNavigationEvent = (char) 3727;
    }
}
