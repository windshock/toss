package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class CTSBlockCipher extends BufferedBlockCipher {
    private int blockSize;

    public CTSBlockCipher(BlockCipher blockCipher) {
        if (blockCipher instanceof StreamBlockCipher) {
            throw new IllegalArgumentException("CTSBlockCipher can only accept ECB, or CBC ciphers");
        }
        ((BufferedBlockCipher) this).cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        ((BufferedBlockCipher) this).buf = new byte[blockSize << 1];
        ((BufferedBlockCipher) this).bufOff = 0;
    }

    public int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        if (((BufferedBlockCipher) this).bufOff + i > bArr.length) {
            throw new OutputLengthException("output buffer to small in doFinal");
        }
        int blockSize = ((BufferedBlockCipher) this).cipher.getBlockSize();
        int i2 = ((BufferedBlockCipher) this).bufOff;
        int i3 = i2 - blockSize;
        byte[] bArr2 = new byte[blockSize];
        if (((BufferedBlockCipher) this).forEncryption) {
            if (i2 < blockSize) {
                throw new DataLengthException("need at least one block of input for CTS");
            }
            ((BufferedBlockCipher) this).cipher.processBlock(((BufferedBlockCipher) this).buf, 0, bArr2, 0);
            int i4 = ((BufferedBlockCipher) this).bufOff;
            if (i4 > blockSize) {
                while (true) {
                    byte[] bArr3 = ((BufferedBlockCipher) this).buf;
                    if (i4 == bArr3.length) {
                        break;
                    }
                    bArr3[i4] = bArr2[i4 - blockSize];
                    i4++;
                }
                for (int i5 = blockSize; i5 != ((BufferedBlockCipher) this).bufOff; i5++) {
                    byte[] bArr4 = ((BufferedBlockCipher) this).buf;
                    bArr4[i5] = (byte) (bArr4[i5] ^ bArr2[i5 - blockSize]);
                }
                CBCBlockCipher cBCBlockCipher = ((BufferedBlockCipher) this).cipher;
                if (cBCBlockCipher instanceof CBCBlockCipher) {
                    cBCBlockCipher.getUnderlyingCipher().processBlock(((BufferedBlockCipher) this).buf, blockSize, bArr, i);
                } else {
                    cBCBlockCipher.processBlock(((BufferedBlockCipher) this).buf, blockSize, bArr, i);
                }
                System.arraycopy(bArr2, 0, bArr, i + blockSize, i3);
            } else {
                System.arraycopy(bArr2, 0, bArr, i, blockSize);
            }
        } else {
            if (i2 < blockSize) {
                throw new DataLengthException("need at least one block of input for CTS");
            }
            byte[] bArr5 = new byte[blockSize];
            if (i2 > blockSize) {
                CBCBlockCipher cBCBlockCipher2 = ((BufferedBlockCipher) this).cipher;
                if (cBCBlockCipher2 instanceof CBCBlockCipher) {
                    cBCBlockCipher2.getUnderlyingCipher().processBlock(((BufferedBlockCipher) this).buf, 0, bArr2, 0);
                } else {
                    cBCBlockCipher2.processBlock(((BufferedBlockCipher) this).buf, 0, bArr2, 0);
                }
                for (int i6 = blockSize; i6 != ((BufferedBlockCipher) this).bufOff; i6++) {
                    int i7 = i6 - blockSize;
                    bArr5[i7] = (byte) (bArr2[i7] ^ ((BufferedBlockCipher) this).buf[i6]);
                }
                System.arraycopy(((BufferedBlockCipher) this).buf, blockSize, bArr2, 0, i3);
                ((BufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr, i);
                System.arraycopy(bArr5, 0, bArr, i + blockSize, i3);
            } else {
                ((BufferedBlockCipher) this).cipher.processBlock(((BufferedBlockCipher) this).buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i, blockSize);
            }
        }
        int i8 = ((BufferedBlockCipher) this).bufOff;
        reset();
        return i8;
    }

    public int getOutputSize(int i) {
        return i + ((BufferedBlockCipher) this).bufOff;
    }

    public int getUpdateOutputSize(int i) {
        int i2 = i + ((BufferedBlockCipher) this).bufOff;
        byte[] bArr = ((BufferedBlockCipher) this).buf;
        int length = i2 % bArr.length;
        return length == 0 ? i2 - bArr.length : i2 - length;
    }

    public int processByte(byte b, byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        int i2 = ((BufferedBlockCipher) this).bufOff;
        byte[] bArr2 = ((BufferedBlockCipher) this).buf;
        int i3 = 0;
        if (i2 == bArr2.length) {
            int iProcessBlock = ((BufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr, i);
            byte[] bArr3 = ((BufferedBlockCipher) this).buf;
            int i4 = this.blockSize;
            System.arraycopy(bArr3, i4, bArr3, 0, i4);
            ((BufferedBlockCipher) this).bufOff = this.blockSize;
            i3 = iProcessBlock;
        }
        byte[] bArr4 = ((BufferedBlockCipher) this).buf;
        int i5 = ((BufferedBlockCipher) this).bufOff;
        ((BufferedBlockCipher) this).bufOff = i5 + 1;
        bArr4[i5] = b;
        return i3;
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, DataLengthException {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i2);
        if (updateOutputSize > 0 && updateOutputSize + i3 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        byte[] bArr3 = ((BufferedBlockCipher) this).buf;
        int length = bArr3.length;
        int i4 = ((BufferedBlockCipher) this).bufOff;
        int i5 = length - i4;
        int i6 = 0;
        if (i2 > i5) {
            System.arraycopy(bArr, i, bArr3, i4, i5);
            int iProcessBlock = ((BufferedBlockCipher) this).cipher.processBlock(((BufferedBlockCipher) this).buf, 0, bArr2, i3);
            byte[] bArr4 = ((BufferedBlockCipher) this).buf;
            System.arraycopy(bArr4, blockSize, bArr4, 0, blockSize);
            ((BufferedBlockCipher) this).bufOff = blockSize;
            i2 -= i5;
            i += i5;
            while (i2 > blockSize) {
                System.arraycopy(bArr, i, ((BufferedBlockCipher) this).buf, ((BufferedBlockCipher) this).bufOff, blockSize);
                iProcessBlock += ((BufferedBlockCipher) this).cipher.processBlock(((BufferedBlockCipher) this).buf, 0, bArr2, i3 + iProcessBlock);
                byte[] bArr5 = ((BufferedBlockCipher) this).buf;
                System.arraycopy(bArr5, blockSize, bArr5, 0, blockSize);
                i2 -= blockSize;
                i += blockSize;
            }
            i6 = iProcessBlock;
        }
        System.arraycopy(bArr, i, ((BufferedBlockCipher) this).buf, ((BufferedBlockCipher) this).bufOff, i2);
        ((BufferedBlockCipher) this).bufOff += i2;
        return i6;
    }
}
