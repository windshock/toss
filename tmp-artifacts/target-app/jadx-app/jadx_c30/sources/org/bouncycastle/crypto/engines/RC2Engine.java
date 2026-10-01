package org.bouncycastle.crypto.engines;

import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;
import org.jmrtd.lds.CVCAFile;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RC2Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 8;
    private static byte[] piTable = {-39, 120, -7, -60, 25, -35, -75, -19, 40, -23, -3, 121, 74, ISOFileInfo.A0, ISO7816.INS_LOAD_KEY_FILE, -99, -58, 126, 55, ISOFileInfo.FILE_IDENTIFIER, 43, 118, 83, ISOFileInfo.CHANNEL_SECURITY, ISOFileInfo.FCP_BYTE, 76, ISOFileInfo.FMD_BYTE, -120, ISO7816.INS_REHABILITATE_CHV, ISOFileInfo.SECURITY_ATTR_EXP, -5, -94, 23, -102, 89, -11, ISOFileInfo.FCI_EXT, ISO7816.INS_READ_RECORD2, 79, 19, 97, 69, 109, ISOFileInfo.ENV_TEMP_EF, 9, ISOFileInfo.DATA_BYTES2, 125, ISO7816.INS_INCREASE, -67, -113, 64, -21, -122, -73, 123, 11, -16, -107, 33, ISO7816.INS_MSE, 92, 107, 78, -126, 84, ISO7816.INS_UPDATE_BINARY, 101, -109, -50, 96, -78, 28, 115, 86, ISO7816.INS_GET_RESPONSE, 20, -89, ISOFileInfo.SECURITY_ATTR_COMPACT, -15, ISO7816.INS_UPDATE_RECORD, 18, 117, ISO7816.INS_GET_DATA, 31, 59, -66, ISO7816.INS_DELETE_FILE, -47, CVCAFile.CAR_TAG, 61, -44, ISO7816.INS_DECREASE, -93, 60, ISO7816.INS_READ_RECORD_STAMPED, 38, ISOFileInfo.FCI_BYTE, -65, ISO7816.INS_ERASE_BINARY, ISO7816.INS_PUT_DATA, 70, 105, 7, 87, 39, -14, 29, -101, PSSSigner.TRAILER_IMPLICIT, -108, 67, 3, -8, 17, -57, -10, -112, -17, 62, -25, 6, -61, -43, 47, -56, 102, 30, -41, 8, -24, -22, -34, ISOFileInfo.DATA_BYTES1, 82, -18, -9, -124, -86, 114, -84, 53, 77, 106, ISO7816.INS_PSO, -106, 26, ISO7816.INS_WRITE_RECORD, 113, 90, 21, 73, 116, 75, -97, ISO7816.INS_WRITE_BINARY, 94, 4, 24, -92, -20, ISO7816.INS_ENVELOPE, ISO7816.INS_CREATE_FILE, 65, 110, 15, 81, -53, -52, ISO7816.INS_CHANGE_CHV, -111, -81, 80, ISOFileInfo.A1, -12, ISO7816.INS_MANAGE_CHANNEL, 57, -103, 124, 58, ISOFileInfo.PROP_INFO, 35, -72, ISO7816.INS_READ_BINARY_STAMPED, 122, -4, 2, 54, 91, 37, 85, -105, 49, 45, 93, -6, -104, -29, ISOFileInfo.LCS_BYTE, -110, -82, 5, -33, 41, ISO7816.CLA_COMMAND_CHAINING, 103, 108, -70, -55, -45, 0, -26, -49, -31, -98, -88, ISO7816.INS_UNBLOCK_CHV, 99, 22, 1, 63, 88, ISO7816.INS_APPEND_RECORD, -119, -87, 13, 56, ISO7816.INS_DECREASE_STAMPED, 27, ISOFileInfo.AB, 51, -1, ISO7816.INS_READ_BINARY, -69, 72, 12, 95, -71, ISO7816.INS_READ_BINARY2, -51, 46, -59, -13, -37, 71, -27, ISOFileInfo.A5, -100, 119, 10, -90, ISO7816.INS_VERIFY, 104, -2, Byte.MAX_VALUE, -63, -83};
    private boolean encrypting;
    private int[] workingKey;

    private void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iRotateWordLeft = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
        int iRotateWordLeft2 = ((bArr[i + 5] & 255) << 8) + (bArr[i + 4] & 255);
        int iRotateWordLeft3 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
        int iRotateWordLeft4 = ((bArr[i + 1] & 255) << 8) + (bArr[i] & 255);
        for (int i3 = 60; i3 >= 44; i3 -= 4) {
            iRotateWordLeft = rotateWordLeft(iRotateWordLeft, 11) - ((((~iRotateWordLeft2) & iRotateWordLeft4) + (iRotateWordLeft3 & iRotateWordLeft2)) + this.workingKey[i3 + 3]);
            iRotateWordLeft2 = rotateWordLeft(iRotateWordLeft2, 13) - ((((~iRotateWordLeft3) & iRotateWordLeft) + (iRotateWordLeft4 & iRotateWordLeft3)) + this.workingKey[i3 + 2]);
            iRotateWordLeft3 = rotateWordLeft(iRotateWordLeft3, 14) - ((((~iRotateWordLeft4) & iRotateWordLeft2) + (iRotateWordLeft & iRotateWordLeft4)) + this.workingKey[i3 + 1]);
            iRotateWordLeft4 = rotateWordLeft(iRotateWordLeft4, 15) - ((((~iRotateWordLeft) & iRotateWordLeft3) + (iRotateWordLeft2 & iRotateWordLeft)) + this.workingKey[i3]);
        }
        int[] iArr = this.workingKey;
        int iRotateWordLeft5 = iRotateWordLeft - iArr[iRotateWordLeft2 & 63];
        int iRotateWordLeft6 = iRotateWordLeft2 - iArr[iRotateWordLeft3 & 63];
        int iRotateWordLeft7 = iRotateWordLeft3 - iArr[iRotateWordLeft4 & 63];
        int iRotateWordLeft8 = iRotateWordLeft4 - iArr[iRotateWordLeft5 & 63];
        for (int i4 = 40; i4 >= 20; i4 -= 4) {
            iRotateWordLeft5 = rotateWordLeft(iRotateWordLeft5, 11) - ((((~iRotateWordLeft6) & iRotateWordLeft8) + (iRotateWordLeft7 & iRotateWordLeft6)) + this.workingKey[i4 + 3]);
            iRotateWordLeft6 = rotateWordLeft(iRotateWordLeft6, 13) - ((((~iRotateWordLeft7) & iRotateWordLeft5) + (iRotateWordLeft8 & iRotateWordLeft7)) + this.workingKey[i4 + 2]);
            iRotateWordLeft7 = rotateWordLeft(iRotateWordLeft7, 14) - ((((~iRotateWordLeft8) & iRotateWordLeft6) + (iRotateWordLeft5 & iRotateWordLeft8)) + this.workingKey[i4 + 1]);
            iRotateWordLeft8 = rotateWordLeft(iRotateWordLeft8, 15) - ((((~iRotateWordLeft5) & iRotateWordLeft7) + (iRotateWordLeft6 & iRotateWordLeft5)) + this.workingKey[i4]);
        }
        int[] iArr2 = this.workingKey;
        int iRotateWordLeft9 = iRotateWordLeft5 - iArr2[iRotateWordLeft6 & 63];
        int iRotateWordLeft10 = iRotateWordLeft6 - iArr2[iRotateWordLeft7 & 63];
        int iRotateWordLeft11 = iRotateWordLeft7 - iArr2[iRotateWordLeft8 & 63];
        int iRotateWordLeft12 = iRotateWordLeft8 - iArr2[iRotateWordLeft9 & 63];
        for (int i5 = 16; i5 >= 0; i5 -= 4) {
            iRotateWordLeft9 = rotateWordLeft(iRotateWordLeft9, 11) - ((((~iRotateWordLeft10) & iRotateWordLeft12) + (iRotateWordLeft11 & iRotateWordLeft10)) + this.workingKey[i5 + 3]);
            iRotateWordLeft10 = rotateWordLeft(iRotateWordLeft10, 13) - ((((~iRotateWordLeft11) & iRotateWordLeft9) + (iRotateWordLeft12 & iRotateWordLeft11)) + this.workingKey[i5 + 2]);
            iRotateWordLeft11 = rotateWordLeft(iRotateWordLeft11, 14) - ((((~iRotateWordLeft12) & iRotateWordLeft10) + (iRotateWordLeft9 & iRotateWordLeft12)) + this.workingKey[i5 + 1]);
            iRotateWordLeft12 = rotateWordLeft(iRotateWordLeft12, 15) - ((((~iRotateWordLeft9) & iRotateWordLeft11) + (iRotateWordLeft10 & iRotateWordLeft9)) + this.workingKey[i5]);
        }
        bArr2[i2] = (byte) iRotateWordLeft12;
        bArr2[i2 + 1] = (byte) (iRotateWordLeft12 >> 8);
        bArr2[i2 + 2] = (byte) iRotateWordLeft11;
        bArr2[i2 + 3] = (byte) (iRotateWordLeft11 >> 8);
        bArr2[i2 + 4] = (byte) iRotateWordLeft10;
        bArr2[i2 + 5] = (byte) (iRotateWordLeft10 >> 8);
        bArr2[i2 + 6] = (byte) iRotateWordLeft9;
        bArr2[i2 + 7] = (byte) (iRotateWordLeft9 >> 8);
    }

    private void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iRotateWordLeft = ((bArr[i + 7] & 255) << 8) + (bArr[i + 6] & 255);
        int iRotateWordLeft2 = ((bArr[i + 5] & 255) << 8) + (bArr[i + 4] & 255);
        int iRotateWordLeft3 = ((bArr[i + 3] & 255) << 8) + (bArr[i + 2] & 255);
        int iRotateWordLeft4 = ((bArr[i + 1] & 255) << 8) + (bArr[i] & 255);
        for (int i3 = 0; i3 <= 16; i3 += 4) {
            iRotateWordLeft4 = rotateWordLeft(iRotateWordLeft4 + ((~iRotateWordLeft) & iRotateWordLeft3) + (iRotateWordLeft2 & iRotateWordLeft) + this.workingKey[i3], 1);
            iRotateWordLeft3 = rotateWordLeft(iRotateWordLeft3 + ((~iRotateWordLeft4) & iRotateWordLeft2) + (iRotateWordLeft & iRotateWordLeft4) + this.workingKey[i3 + 1], 2);
            iRotateWordLeft2 = rotateWordLeft(iRotateWordLeft2 + ((~iRotateWordLeft3) & iRotateWordLeft) + (iRotateWordLeft4 & iRotateWordLeft3) + this.workingKey[i3 + 2], 3);
            iRotateWordLeft = rotateWordLeft(iRotateWordLeft + ((~iRotateWordLeft2) & iRotateWordLeft4) + (iRotateWordLeft3 & iRotateWordLeft2) + this.workingKey[i3 + 3], 5);
        }
        int[] iArr = this.workingKey;
        int iRotateWordLeft5 = iRotateWordLeft4 + iArr[iRotateWordLeft & 63];
        int iRotateWordLeft6 = iRotateWordLeft3 + iArr[iRotateWordLeft5 & 63];
        int iRotateWordLeft7 = iRotateWordLeft2 + iArr[iRotateWordLeft6 & 63];
        int iRotateWordLeft8 = iRotateWordLeft + iArr[iRotateWordLeft7 & 63];
        for (int i4 = 20; i4 <= 40; i4 += 4) {
            iRotateWordLeft5 = rotateWordLeft(iRotateWordLeft5 + ((~iRotateWordLeft8) & iRotateWordLeft6) + (iRotateWordLeft7 & iRotateWordLeft8) + this.workingKey[i4], 1);
            iRotateWordLeft6 = rotateWordLeft(iRotateWordLeft6 + ((~iRotateWordLeft5) & iRotateWordLeft7) + (iRotateWordLeft8 & iRotateWordLeft5) + this.workingKey[i4 + 1], 2);
            iRotateWordLeft7 = rotateWordLeft(iRotateWordLeft7 + ((~iRotateWordLeft6) & iRotateWordLeft8) + (iRotateWordLeft5 & iRotateWordLeft6) + this.workingKey[i4 + 2], 3);
            iRotateWordLeft8 = rotateWordLeft(iRotateWordLeft8 + ((~iRotateWordLeft7) & iRotateWordLeft5) + (iRotateWordLeft6 & iRotateWordLeft7) + this.workingKey[i4 + 3], 5);
        }
        int[] iArr2 = this.workingKey;
        int iRotateWordLeft9 = iRotateWordLeft5 + iArr2[iRotateWordLeft8 & 63];
        int iRotateWordLeft10 = iRotateWordLeft6 + iArr2[iRotateWordLeft9 & 63];
        int iRotateWordLeft11 = iRotateWordLeft7 + iArr2[iRotateWordLeft10 & 63];
        int iRotateWordLeft12 = iRotateWordLeft8 + iArr2[iRotateWordLeft11 & 63];
        for (int i5 = 44; i5 < 64; i5 += 4) {
            iRotateWordLeft9 = rotateWordLeft(iRotateWordLeft9 + ((~iRotateWordLeft12) & iRotateWordLeft10) + (iRotateWordLeft11 & iRotateWordLeft12) + this.workingKey[i5], 1);
            iRotateWordLeft10 = rotateWordLeft(iRotateWordLeft10 + ((~iRotateWordLeft9) & iRotateWordLeft11) + (iRotateWordLeft12 & iRotateWordLeft9) + this.workingKey[i5 + 1], 2);
            iRotateWordLeft11 = rotateWordLeft(iRotateWordLeft11 + ((~iRotateWordLeft10) & iRotateWordLeft12) + (iRotateWordLeft9 & iRotateWordLeft10) + this.workingKey[i5 + 2], 3);
            iRotateWordLeft12 = rotateWordLeft(iRotateWordLeft12 + ((~iRotateWordLeft11) & iRotateWordLeft9) + (iRotateWordLeft10 & iRotateWordLeft11) + this.workingKey[i5 + 3], 5);
        }
        bArr2[i2] = (byte) iRotateWordLeft9;
        bArr2[i2 + 1] = (byte) (iRotateWordLeft9 >> 8);
        bArr2[i2 + 2] = (byte) iRotateWordLeft10;
        bArr2[i2 + 3] = (byte) (iRotateWordLeft10 >> 8);
        bArr2[i2 + 4] = (byte) iRotateWordLeft11;
        bArr2[i2 + 5] = (byte) (iRotateWordLeft11 >> 8);
        bArr2[i2 + 6] = (byte) iRotateWordLeft12;
        bArr2[i2 + 7] = (byte) (iRotateWordLeft12 >> 8);
    }

    private int[] generateWorkingKey(byte[] bArr, int i) {
        int[] iArr = new int[128];
        for (int i2 = 0; i2 != bArr.length; i2++) {
            iArr[i2] = bArr[i2] & GF2Field.MASK;
        }
        int length = bArr.length;
        if (length < 128) {
            int i3 = iArr[length - 1];
            int i4 = 0;
            while (true) {
                i3 = piTable[(i3 + iArr[i4]) & GF2Field.MASK] & 255;
                int i5 = length + 1;
                iArr[length] = i3;
                if (i5 >= 128) {
                    break;
                }
                i4++;
                length = i5;
            }
        }
        int i6 = (i + 7) >> 3;
        int i7 = 128 - i6;
        int i8 = piTable[(GF2Field.MASK >> ((-i) & 7)) & iArr[i7]] & 255;
        iArr[i7] = i8;
        for (int i9 = 127 - i6; i9 >= 0; i9--) {
            i8 = piTable[i8 ^ iArr[i9 + i6]] & 255;
            iArr[i9] = i8;
        }
        int[] iArr2 = new int[64];
        for (int i10 = 0; i10 != 64; i10++) {
            int i11 = i10 << 1;
            iArr2[i10] = iArr[i11] + (iArr[i11 + 1] << 8);
        }
        return iArr2;
    }

    private int rotateWordLeft(int i, int i2) {
        int i3 = i & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        return (i3 << i2) | (i3 >> (16 - i2));
    }

    public String getAlgorithmName() {
        return "RC2";
    }

    public int getBlockSize() {
        return 8;
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        this.encrypting = z;
        if (cipherParameters instanceof RC2Parameters) {
            RC2Parameters rC2Parameters = (RC2Parameters) cipherParameters;
            this.workingKey = generateWorkingKey(rC2Parameters.getKey(), rC2Parameters.getEffectiveKeyBits());
        } else if (cipherParameters instanceof KeyParameter) {
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            this.workingKey = generateWorkingKey(key, key.length << 3);
        } else {
            throw new IllegalArgumentException("invalid parameter passed to RC2 init - " + cipherParameters.getClass().getName());
        }
    }

    public final int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.workingKey == null) {
            throw new IllegalStateException("RC2 engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypting) {
            encryptBlock(bArr, i, bArr2, i2);
            return 8;
        }
        decryptBlock(bArr, i, bArr2, i2);
        return 8;
    }

    public void reset() {
    }
}
