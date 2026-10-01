package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RC6Engine implements BlockCipher {
    private static final int LGW = 5;
    private static final int P32 = -1209970333;
    private static final int Q32 = -1640531527;
    private static final int _noRounds = 20;
    private static final int bytesPerWord = 4;
    private static final int wordSize = 32;
    private int[] _S = null;
    private boolean forEncryption;

    private int bytesToWord(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 3; i3 >= 0; i3--) {
            i2 = (i2 << 8) + (bArr[i3 + i] & 255);
        }
        return i2;
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iBytesToWord = bytesToWord(bArr, i);
        int iBytesToWord2 = bytesToWord(bArr, i + 4);
        int iBytesToWord3 = bytesToWord(bArr, i + 8);
        int iBytesToWord4 = bytesToWord(bArr, i + 12);
        int[] iArr = this._S;
        int i3 = iBytesToWord3 - iArr[43];
        int i4 = iBytesToWord - iArr[42];
        int i5 = iBytesToWord4;
        int i6 = i3;
        int i7 = iBytesToWord2;
        int i8 = i4;
        int i9 = 20;
        while (i9 > 0) {
            int iRotateLeft = rotateLeft(((i8 << 1) + 1) * i8, 5);
            int iRotateLeft2 = rotateLeft(((i6 << 1) + 1) * i6, 5);
            int i10 = i9 << 1;
            int iRotateRight = rotateRight(i7 - this._S[i10 + 1], iRotateLeft);
            i9--;
            int iRotateRight2 = rotateRight(i5 - this._S[i10], iRotateLeft2) ^ iRotateLeft;
            i5 = i6;
            i6 = iRotateRight ^ iRotateLeft2;
            i7 = i8;
            i8 = iRotateRight2;
        }
        int[] iArr2 = this._S;
        int i11 = iArr2[1];
        int i12 = iArr2[0];
        wordToBytes(i8, bArr2, i2);
        wordToBytes(i7 - i12, bArr2, i2 + 4);
        wordToBytes(i6, bArr2, i2 + 8);
        wordToBytes(i5 - i11, bArr2, i2 + 12);
        return 16;
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iBytesToWord = bytesToWord(bArr, i);
        int iBytesToWord2 = bytesToWord(bArr, i + 4);
        int iBytesToWord3 = bytesToWord(bArr, i + 8);
        int iBytesToWord4 = bytesToWord(bArr, i + 12);
        int[] iArr = this._S;
        int i3 = iBytesToWord2 + iArr[0];
        int i4 = iBytesToWord4 + iArr[1];
        int i5 = 1;
        while (i5 <= 20) {
            int iRotateLeft = rotateLeft(((i3 << 1) + 1) * i3, 5);
            int iRotateLeft2 = rotateLeft(((i4 << 1) + 1) * i4, 5);
            int iRotateLeft3 = rotateLeft(iBytesToWord ^ iRotateLeft, iRotateLeft2);
            int i6 = i5 << 1;
            int i7 = this._S[i6];
            i5++;
            int iRotateLeft4 = rotateLeft(iBytesToWord3 ^ iRotateLeft2, iRotateLeft) + this._S[i6 + 1];
            iBytesToWord3 = i4;
            i4 = iRotateLeft3 + i7;
            iBytesToWord = i3;
            i3 = iRotateLeft4;
        }
        int[] iArr2 = this._S;
        int i8 = iArr2[42];
        int i9 = iArr2[43];
        wordToBytes(iBytesToWord + i8, bArr2, i2);
        wordToBytes(i3, bArr2, i2 + 4);
        wordToBytes(iBytesToWord3 + i9, bArr2, i2 + 8);
        wordToBytes(i4, bArr2, i2 + 12);
        return 16;
    }

    private int rotateLeft(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    private int rotateRight(int i, int i2) {
        return (i >>> i2) | (i << (-i2));
    }

    private void setKey(byte[] bArr) {
        int[] iArr;
        int length = bArr.length;
        int length2 = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length2];
        for (int length3 = bArr.length - 1; length3 >= 0; length3--) {
            int i = length3 / 4;
            iArr2[i] = (iArr2[i] << 8) + (bArr[length3] & 255);
        }
        int[] iArr3 = new int[44];
        this._S = iArr3;
        iArr3[0] = P32;
        int i2 = 1;
        while (true) {
            iArr = this._S;
            if (i2 >= iArr.length) {
                break;
            }
            iArr[i2] = iArr[i2 - 1] - 1640531527;
            i2++;
        }
        int length4 = length2 > iArr.length ? length2 * 3 : iArr.length * 3;
        int length5 = 0;
        int iRotateLeft = 0;
        int iRotateLeft2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length4; i4++) {
            int[] iArr4 = this._S;
            iRotateLeft = rotateLeft(iArr4[length5] + iRotateLeft + iRotateLeft2, 3);
            iArr4[length5] = iRotateLeft;
            iRotateLeft2 = rotateLeft(iArr2[i3] + iRotateLeft + iRotateLeft2, iRotateLeft2 + iRotateLeft);
            iArr2[i3] = iRotateLeft2;
            length5 = (length5 + 1) % this._S.length;
            i3 = (i3 + 1) % length2;
        }
    }

    private void wordToBytes(int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i3 + i2] = (byte) i;
            i >>>= 8;
        }
    }

    public String getAlgorithmName() {
        return "RC6";
    }

    public int getBlockSize() {
        return 16;
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.forEncryption = z;
            setKey(((KeyParameter) cipherParameters).getKey());
        } else {
            throw new IllegalArgumentException("invalid parameter passed to RC6 init - " + cipherParameters.getClass().getName());
        }
    }

    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int blockSize = getBlockSize();
        if (this._S == null) {
            throw new IllegalStateException("RC6 engine not initialised");
        }
        if (i + blockSize > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (blockSize + i2 <= bArr2.length) {
            return this.forEncryption ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
        }
        throw new OutputLengthException("output buffer too short");
    }

    public void reset() {
    }
}
