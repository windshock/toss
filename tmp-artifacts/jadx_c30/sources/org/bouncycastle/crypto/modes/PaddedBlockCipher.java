package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PaddedBlockCipher extends BufferedBlockCipher {
    public PaddedBlockCipher(BlockCipher blockCipher) {
        ((BufferedBlockCipher) this).cipher = blockCipher;
        ((BufferedBlockCipher) this).buf = new byte[blockCipher.getBlockSize()];
        ((BufferedBlockCipher) this).bufOff = 0;
    }

    public int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        int iProcessBlock;
        int iProcessBlock2;
        int blockSize = ((BufferedBlockCipher) this).cipher.getBlockSize();
        if (((BufferedBlockCipher) this).forEncryption) {
            if (((BufferedBlockCipher) this).bufOff != blockSize) {
                iProcessBlock2 = 0;
            } else {
                if ((blockSize << 1) + i > bArr.length) {
                    throw new OutputLengthException("output buffer too short");
                }
                iProcessBlock2 = ((BufferedBlockCipher) this).cipher.processBlock(((BufferedBlockCipher) this).buf, 0, bArr, i);
                ((BufferedBlockCipher) this).bufOff = 0;
            }
            byte b = (byte) (blockSize - ((BufferedBlockCipher) this).bufOff);
            while (true) {
                int i2 = ((BufferedBlockCipher) this).bufOff;
                if (i2 >= blockSize) {
                    break;
                }
                ((BufferedBlockCipher) this).buf[i2] = b;
                ((BufferedBlockCipher) this).bufOff = i2 + 1;
            }
            iProcessBlock = iProcessBlock2 + ((BufferedBlockCipher) this).cipher.processBlock(((BufferedBlockCipher) this).buf, 0, bArr, i + iProcessBlock2);
        } else {
            if (((BufferedBlockCipher) this).bufOff != blockSize) {
                throw new DataLengthException("last block incomplete in decryption");
            }
            BlockCipher blockCipher = ((BufferedBlockCipher) this).cipher;
            byte[] bArr2 = ((BufferedBlockCipher) this).buf;
            int iProcessBlock3 = blockCipher.processBlock(bArr2, 0, bArr2, 0);
            ((BufferedBlockCipher) this).bufOff = 0;
            byte[] bArr3 = ((BufferedBlockCipher) this).buf;
            int i3 = bArr3[blockSize - 1] & 255;
            if (i3 > blockSize) {
                throw new InvalidCipherTextException("pad block corrupted");
            }
            iProcessBlock = iProcessBlock3 - i3;
            System.arraycopy(bArr3, 0, bArr, i, iProcessBlock);
        }
        reset();
        return iProcessBlock;
    }

    public int getOutputSize(int i) {
        int i2 = i + ((BufferedBlockCipher) this).bufOff;
        byte[] bArr = ((BufferedBlockCipher) this).buf;
        int length = i2 % bArr.length;
        if (length != 0) {
            i2 -= length;
        } else if (!((BufferedBlockCipher) this).forEncryption) {
            return i2;
        }
        return i2 + bArr.length;
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
            ((BufferedBlockCipher) this).bufOff = 0;
            i3 = iProcessBlock;
        }
        byte[] bArr3 = ((BufferedBlockCipher) this).buf;
        int i4 = ((BufferedBlockCipher) this).bufOff;
        ((BufferedBlockCipher) this).bufOff = i4 + 1;
        bArr3[i4] = b;
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
        int iProcessBlock = 0;
        if (i2 > i5) {
            System.arraycopy(bArr, i, bArr3, i4, i5);
            int iProcessBlock2 = ((BufferedBlockCipher) this).cipher.processBlock(((BufferedBlockCipher) this).buf, 0, bArr2, i3);
            ((BufferedBlockCipher) this).bufOff = 0;
            i2 -= i5;
            i += i5;
            iProcessBlock = iProcessBlock2;
            while (i2 > ((BufferedBlockCipher) this).buf.length) {
                iProcessBlock += ((BufferedBlockCipher) this).cipher.processBlock(bArr, i, bArr2, i3 + iProcessBlock);
                i2 -= blockSize;
                i += blockSize;
            }
        }
        System.arraycopy(bArr, i, ((BufferedBlockCipher) this).buf, ((BufferedBlockCipher) this).bufOff, i2);
        ((BufferedBlockCipher) this).bufOff += i2;
        return iProcessBlock;
    }
}
