package org.bouncycastle.crypto.modes;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class KCCMBlockCipher implements AEADBlockCipher {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int BITS_IN_BYTE = 8;
    private static final int BYTES_IN_INT = 4;
    private static char[] IAuthTabCallback = {27161, 27234};
    private static final int MAX_MAC_BIT_LENGTH = 512;
    private static final int MIN_MAC_BIT_LENGTH = 64;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private byte[] G1;
    private int Nb_;
    private ExposedByteArrayOutputStream associatedText;
    private byte[] buffer;
    private byte[] counter;
    private ExposedByteArrayOutputStream data;
    private BlockCipher engine;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private byte[] mac;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonce;
    private byte[] s;

    class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public ExposedByteArrayOutputStream() {
        }

        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public KCCMBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, 4);
    }

    public KCCMBlockCipher(BlockCipher blockCipher, int i) {
        this.associatedText = new ExposedByteArrayOutputStream();
        this.data = new ExposedByteArrayOutputStream();
        this.Nb_ = 4;
        this.engine = blockCipher;
        this.macSize = blockCipher.getBlockSize();
        this.nonce = new byte[blockCipher.getBlockSize()];
        this.initialAssociatedText = new byte[blockCipher.getBlockSize()];
        this.mac = new byte[blockCipher.getBlockSize()];
        this.macBlock = new byte[blockCipher.getBlockSize()];
        this.G1 = new byte[blockCipher.getBlockSize()];
        this.buffer = new byte[blockCipher.getBlockSize()];
        this.s = new byte[blockCipher.getBlockSize()];
        this.counter = new byte[blockCipher.getBlockSize()];
        setNb(i);
    }

    private void CalculateMac(byte[] bArr, int i, int i2) {
        int i3 = 2 % 2;
        while (i2 > 0) {
            int i4 = onNavigationEvent + 29;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (i6 < this.engine.getBlockSize()) {
                byte[] bArr2 = this.macBlock;
                bArr2[i6] = (byte) (bArr2[i6] ^ bArr[i + i6]);
                i6++;
                int i7 = onNavigationEvent + 121;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            BlockCipher blockCipher = this.engine;
            byte[] bArr3 = this.macBlock;
            blockCipher.processBlock(bArr3, 0, bArr3, 0);
            i2 -= this.engine.getBlockSize();
            i += this.engine.getBlockSize();
            int i9 = onNavigationEvent + 109;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 5 % 5;
            }
        }
    }

    private void ProcessBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 93;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2 == 0 ? 1 : 0;
        while (true) {
            byte[] bArr3 = this.counter;
            if (i6 >= bArr3.length) {
                break;
            }
            int i7 = onExtraCallback + 99;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                byte[] bArr4 = this.s;
                bArr4[i6] = (byte) (bArr4[i6] / bArr3[i6]);
                i6 += 49;
            } else {
                byte[] bArr5 = this.s;
                bArr5[i6] = (byte) (bArr5[i6] + bArr3[i6]);
                i6++;
            }
        }
        this.engine.processBlock(this.s, 0, this.buffer, 0);
        for (int i8 = 0; i8 < this.engine.getBlockSize(); i8++) {
            bArr2[i3 + i8] = (byte) (this.buffer[i8] ^ bArr[i + i8]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0096 A[LOOP:0: B:38:0x008f->B:40:0x0096, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private byte getFlag(boolean z, int i) throws Throwable {
        Object obj;
        String str;
        String binaryString;
        int i2 = 2 % 2;
        StringBuffer stringBuffer = new StringBuffer();
        if (z) {
            Object[] objArr = new Object[1];
            a(new int[]{0, 1, 125, 1}, false, new byte[]{0}, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new int[]{1, 1, 40, 0}, true, new byte[]{0}, objArr2);
            obj = objArr2[0];
        }
        stringBuffer.append(((String) obj).intern());
        if (i != 8) {
            int i3 = onNavigationEvent;
            int i4 = i3 + 59;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0 ? i == 16 : i == 45) {
                str = "011";
            } else {
                int i5 = i3 + 81;
                int i6 = i5 % 128;
                onExtraCallback = i6;
                if (i5 % 2 != 0 ? i == 32 : i == 5) {
                    str = "100";
                } else {
                    if (i != 48) {
                        int i7 = i6 + 73;
                        onNavigationEvent = i7 % 128;
                        if (i7 % 2 == 0 ? i == 64 : i == 10) {
                            str = "110";
                        }
                        binaryString = Integer.toBinaryString(this.Nb_ - 1);
                        while (binaryString.length() < 4) {
                            StringBuffer stringBuffer2 = new StringBuffer(binaryString);
                            Object[] objArr3 = new Object[1];
                            a(new int[]{1, 1, 40, 0}, true, new byte[]{0}, objArr3);
                            binaryString = stringBuffer2.insert(0, ((String) objArr3[0]).intern()).toString();
                        }
                        stringBuffer.append(binaryString);
                        return (byte) Integer.parseInt(stringBuffer.toString(), 2);
                    }
                    str = "101";
                }
            }
        } else {
            str = "010";
        }
        stringBuffer.append(str);
        binaryString = Integer.toBinaryString(this.Nb_ - 1);
        while (binaryString.length() < 4) {
        }
        stringBuffer.append(binaryString);
        return (byte) Integer.parseInt(stringBuffer.toString(), 2);
    }

    private void intToBytes(int i, byte[] bArr, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent;
        int i5 = i4 + 93;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        bArr[i2 + 3] = (byte) (i >> 24);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2] = (byte) i;
        int i7 = i4 + 123;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 65 / 0;
        }
    }

    private void processAAD(byte[] bArr, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 17;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0 ? i2 - i < this.engine.getBlockSize() : i2 - i < this.engine.getBlockSize()) {
            throw new IllegalArgumentException("authText buffer too short");
        }
        if (i2 % this.engine.getBlockSize() != 0) {
            throw new IllegalArgumentException("padding not supported");
        }
        byte[] bArr2 = this.nonce;
        System.arraycopy(bArr2, 0, this.G1, 0, (bArr2.length - this.Nb_) - 1);
        intToBytes(i3, this.buffer, 0);
        System.arraycopy(this.buffer, 0, this.G1, (this.nonce.length - this.Nb_) - 1, 4);
        byte[] bArr3 = this.G1;
        bArr3[bArr3.length - 1] = getFlag(true, this.macSize);
        this.engine.processBlock(this.G1, 0, this.macBlock, 0);
        intToBytes(i2, this.buffer, 0);
        if (i2 <= this.engine.getBlockSize() - this.Nb_) {
            for (int i6 = 0; i6 < i2; i6++) {
                byte[] bArr4 = this.buffer;
                int i7 = this.Nb_ + i6;
                bArr4[i7] = (byte) (bArr4[i7] ^ bArr[i + i6]);
            }
            for (int i8 = 0; i8 < this.engine.getBlockSize(); i8++) {
                byte[] bArr5 = this.macBlock;
                bArr5[i8] = (byte) (bArr5[i8] ^ this.buffer[i8]);
            }
            BlockCipher blockCipher = this.engine;
            byte[] bArr6 = this.macBlock;
            blockCipher.processBlock(bArr6, 0, bArr6, 0);
            return;
        }
        int i9 = 0;
        while (i9 < this.engine.getBlockSize()) {
            int i10 = onNavigationEvent + 45;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                byte[] bArr7 = this.macBlock;
                bArr7[i9] = (byte) (bArr7[i9] ^ this.buffer[i9]);
                i9 += 63;
            } else {
                byte[] bArr8 = this.macBlock;
                bArr8[i9] = (byte) (bArr8[i9] ^ this.buffer[i9]);
                i9++;
            }
        }
        BlockCipher blockCipher2 = this.engine;
        byte[] bArr9 = this.macBlock;
        blockCipher2.processBlock(bArr9, 0, bArr9, 0);
        while (i2 != 0) {
            int i11 = onExtraCallback + 1;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 0;
            while (i13 < this.engine.getBlockSize()) {
                int i14 = onNavigationEvent + 53;
                onExtraCallback = i14 % 128;
                if (i14 % 2 == 0) {
                    byte[] bArr10 = this.macBlock;
                    bArr10[i13] = (byte) (bArr10[i13] ^ bArr[i13 >> i]);
                    i13 += 91;
                } else {
                    byte[] bArr11 = this.macBlock;
                    bArr11[i13] = (byte) (bArr11[i13] ^ bArr[i13 + i]);
                    i13++;
                }
            }
            BlockCipher blockCipher3 = this.engine;
            byte[] bArr12 = this.macBlock;
            blockCipher3.processBlock(bArr12, 0, bArr12, 0);
            i += this.engine.getBlockSize();
            i2 -= this.engine.getBlockSize();
        }
    }

    private void setNb(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 83;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0 ? i != 4 : i != 2) {
            if (i != 6) {
                int i5 = i3 + 41;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0 ? i != 8 : i != 49) {
                    throw new IllegalArgumentException("Nb = 4 is recommended by DSTU7624 but can be changed to only 6 or 8 in this implementation");
                }
            }
        }
        this.Nb_ = i;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException, IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 17;
        onNavigationEvent = i3 % 128;
        int iProcessPacket = i3 % 2 != 0 ? processPacket(this.data.getBuffer(), 1, this.data.size(), bArr, i) : processPacket(this.data.getBuffer(), 0, this.data.size(), bArr, i);
        reset();
        int i4 = onExtraCallback + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iProcessPacket;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        int i = 2 % 2;
        String str = this.engine.getAlgorithmName() + "/KCCM";
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Arrays.clone(this.mac);
            obj.hashCode();
            throw null;
        }
        byte[] bArrClone = Arrays.clone(this.mac);
        int i3 = onExtraCallback + 119;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return bArrClone;
        }
        obj.hashCode();
        throw null;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 93;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.macSize;
        return i4 == 0 ? i >>> i5 : i + i5;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.engine;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 57;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return i;
        }
        throw null;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IOException, IllegalArgumentException {
        CipherParameters parameters;
        int i = 2 % 2;
        if (cipherParameters instanceof AEADParameters) {
            int i2 = onNavigationEvent + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            if (aEADParameters.getMacSize() > 512 || aEADParameters.getMacSize() < 64 || aEADParameters.getMacSize() % 8 != 0) {
                throw new IllegalArgumentException("Invalid mac size specified");
            }
            this.nonce = aEADParameters.getNonce();
            this.macSize = aEADParameters.getMacSize() / 8;
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Invalid parameters specified");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.nonce = parametersWithIV.getIV();
            this.macSize = this.engine.getBlockSize();
            this.initialAssociatedText = null;
            parameters = parametersWithIV.getParameters();
        }
        this.mac = new byte[this.macSize];
        this.forEncryption = z;
        this.engine.init(true, parameters);
        this.counter[0] = 1;
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
        int i4 = onExtraCallback + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b) throws IOException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.associatedText.write(b);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.associatedText.write(b);
        int i3 = onExtraCallback + 73;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 19;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        this.associatedText.write(bArr, i, i2);
        int i6 = onExtraCallback + 23;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b, byte[] bArr, int i) throws IllegalStateException, DataLengthException, IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.data.write(b);
        int i5 = onExtraCallback + 51;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 / 0;
        }
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, DataLengthException, IOException {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 27;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        if (bArr.length < i + i2) {
            throw new DataLengthException("input buffer too short");
        }
        this.data.write(bArr, i, i2);
        int i7 = onNavigationEvent + 97;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int processPacket(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws InvalidCipherTextException, IllegalStateException, IOException {
        int i4;
        int i5 = 2 % 2;
        if (bArr.length - i < i2) {
            throw new DataLengthException("input buffer too short");
        }
        if (bArr2.length - i3 < i2) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.associatedText.size() > 0) {
            int i6 = onNavigationEvent + 119;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 54 / 0;
                if (this.forEncryption) {
                    processAAD(this.associatedText.getBuffer(), 0, this.associatedText.size(), this.data.size());
                } else {
                    processAAD(this.associatedText.getBuffer(), 0, this.associatedText.size(), this.data.size() - this.macSize);
                }
            } else if (this.forEncryption) {
            }
        }
        if (!this.forEncryption) {
            if ((i2 - this.macSize) % this.engine.getBlockSize() != 0) {
                throw new DataLengthException("partial blocks not supported");
            }
            this.engine.processBlock(this.nonce, 0, this.s, 0);
            int blockSize = i2 / this.engine.getBlockSize();
            int blockSize2 = i;
            int blockSize3 = i3;
            for (int i8 = 0; i8 < blockSize; i8++) {
                ProcessBlock(bArr, blockSize2, i2, bArr2, blockSize3);
                blockSize2 += this.engine.getBlockSize();
                blockSize3 += this.engine.getBlockSize();
            }
            if (i2 > blockSize2) {
                int i9 = 0;
                while (true) {
                    byte[] bArr3 = this.counter;
                    if (i9 >= bArr3.length) {
                        break;
                    }
                    byte[] bArr4 = this.s;
                    bArr4[i9] = (byte) (bArr4[i9] + bArr3[i9]);
                    i9++;
                    int i10 = onNavigationEvent + 79;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                }
                this.engine.processBlock(this.s, 0, this.buffer, 0);
                int i12 = 0;
                while (true) {
                    i4 = this.macSize;
                    if (i12 >= i4) {
                        break;
                    }
                    int i13 = onExtraCallback + 37;
                    onNavigationEvent = i13 % 128;
                    if (i13 % 2 != 0) {
                        bArr2[blockSize3 * i12] = (byte) (this.buffer[i12] ^ bArr[blockSize2 * i12]);
                        i12 += 15;
                    } else {
                        bArr2[blockSize3 + i12] = (byte) (this.buffer[i12] ^ bArr[blockSize2 + i12]);
                        i12++;
                    }
                }
                blockSize3 += i4;
            }
            int i14 = 0;
            while (true) {
                byte[] bArr5 = this.counter;
                if (i14 >= bArr5.length) {
                    break;
                }
                byte[] bArr6 = this.s;
                bArr6[i14] = (byte) (bArr6[i14] + bArr5[i14]);
                i14++;
            }
            this.engine.processBlock(this.s, 0, this.buffer, 0);
            int i15 = this.macSize;
            System.arraycopy(bArr2, blockSize3 - i15, this.buffer, 0, i15);
            CalculateMac(bArr2, 0, blockSize3 - this.macSize);
            System.arraycopy(this.macBlock, 0, this.mac, 0, this.macSize);
            int i16 = this.macSize;
            byte[] bArr7 = new byte[i16];
            System.arraycopy(this.buffer, 0, bArr7, 0, i16);
            if (!Arrays.constantTimeAreEqual(this.mac, bArr7)) {
                throw new InvalidCipherTextException("mac check failed");
            }
            int i17 = onNavigationEvent + 17;
            onExtraCallback = i17 % 128;
            int i18 = i17 % 2;
            reset();
            return i18 == 0 ? i2 - this.macSize : i2 - this.macSize;
        }
        if (i2 % this.engine.getBlockSize() != 0) {
            throw new DataLengthException("partial blocks not supported");
        }
        int i19 = onNavigationEvent + 73;
        onExtraCallback = i19 % 128;
        int i20 = i19 % 2;
        CalculateMac(bArr, i, i2);
        if (i20 == 0) {
            this.engine.processBlock(this.nonce, 0, this.s, 0);
        } else {
            this.engine.processBlock(this.nonce, 0, this.s, 0);
        }
        int blockSize4 = i;
        int blockSize5 = i3;
        int blockSize6 = i2;
        while (blockSize6 > 0) {
            ProcessBlock(bArr, blockSize4, i2, bArr2, blockSize5);
            blockSize6 -= this.engine.getBlockSize();
            blockSize4 += this.engine.getBlockSize();
            blockSize5 += this.engine.getBlockSize();
        }
        int i21 = 0;
        while (true) {
            byte[] bArr8 = this.counter;
            if (i21 >= bArr8.length) {
                break;
            }
            int i22 = onNavigationEvent + 115;
            onExtraCallback = i22 % 128;
            if (i22 % 2 == 0) {
                byte[] bArr9 = this.s;
                bArr9[i21] = (byte) (bArr9[i21] << bArr8[i21]);
                i21 += 2;
            } else {
                byte[] bArr10 = this.s;
                bArr10[i21] = (byte) (bArr10[i21] + bArr8[i21]);
                i21++;
            }
        }
        this.engine.processBlock(this.s, 0, this.buffer, 0);
        int i23 = 0;
        while (true) {
            int i24 = this.macSize;
            if (i23 >= i24) {
                System.arraycopy(this.macBlock, 0, this.mac, 0, i24);
                reset();
                return this.macSize + i2;
            }
            bArr2[blockSize5 + i23] = (byte) (this.buffer[i23] ^ this.macBlock[i23]);
            i23++;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Arrays.fill(this.G1, (byte) 0);
        Arrays.fill(this.buffer, (byte) 0);
        Arrays.fill(this.counter, (byte) 0);
        Arrays.fill(this.macBlock, (byte) 0);
        this.counter[0] = 1;
        this.data.reset();
        this.associatedText.reset();
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            int i4 = onNavigationEvent + 41;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            processAADBytes(bArr, 0, bArr.length);
        }
        int i6 = onExtraCallback + 55;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 97 / 0;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char[] cArr2;
        char c;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr3 = IAuthTabCallback;
        char c2 = '0';
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 35283), 34 - TextUtils.indexOf(BuildConfig.FLAVOR, c2), 14239 - (ViewConfiguration.getFadingEdgeLength() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr4[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    c2 = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        char[] cArr5 = new char[i3];
        System.arraycopy(cArr3, i2, cArr5, 0, i3);
        if (bArr != null) {
            int i7 = $11 + 75;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr2 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 1;
            } else {
                cArr2 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                c = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i8 = $10 + 51;
                $11 = i8 % 128;
                if (i8 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 29 - View.MeasureSpec.getMode(0), 17658 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = $10 + 5;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR)), 65 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getPressedStateDuration() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr2[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0)), 71 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 12486 - (ViewConfiguration.getPressedStateDuration() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            int i13 = $10 + 111;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr5 = cArr2;
        }
        if (i5 > 0) {
            char[] cArr6 = new char[i3];
            System.arraycopy(cArr5, 0, cArr6, 0, i3);
            int i15 = i3 - i5;
            System.arraycopy(cArr6, 0, cArr5, i15, i5);
            System.arraycopy(cArr6, i5, cArr5, 0, i15);
        }
        if (z) {
            int i16 = $11 + 3;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr5[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i17 = $10 + 121;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = 3 % 5;
                }
            }
            cArr5 = cArr;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr5);
    }
}
