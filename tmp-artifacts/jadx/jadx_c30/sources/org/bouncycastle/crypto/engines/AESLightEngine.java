package org.bouncycastle.crypto.engines;

import android.media.AudioTrack;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;
import org.bouncycastle.util.Pack;
import org.jmrtd.lds.CVCAFile;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class AESLightEngine implements BlockCipher {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int BLOCK_SIZE = 16;
    private static int IAuthTabCallback = 1;
    private static final byte[] S;
    private static final byte[] Si;
    private static final int m1 = -2139062144;
    private static final int m2 = 2139062143;
    private static final int m3 = 27;
    private static final int m4 = -1061109568;
    private static final int m5 = 1061109567;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static long onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private static final int[] rcon;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;

    static {
        onExtraCallbackWithResult();
        S = new byte[]{99, 124, 119, 123, -14, 107, ISOFileInfo.FCI_BYTE, -59, ISO7816.INS_DECREASE, 1, 103, 43, -2, -41, ISOFileInfo.AB, 118, ISO7816.INS_GET_DATA, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, ISO7816.INS_GET_RESPONSE, -73, -3, -109, 38, 54, 63, -9, -52, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.A5, -27, -15, 113, ISO7816.INS_LOAD_KEY_FILE, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, ISOFileInfo.DATA_BYTES1, ISO7816.INS_APPEND_RECORD, -21, 39, -78, 117, 9, ISOFileInfo.FILE_IDENTIFIER, ISO7816.INS_UNBLOCK_CHV, 26, 27, 110, 90, ISOFileInfo.A0, 82, 59, ISO7816.INS_UPDATE_BINARY, ISO7816.INS_READ_RECORD2, 41, -29, 47, -124, 83, -47, 0, -19, ISO7816.INS_VERIFY, -4, ISO7816.INS_READ_BINARY2, 91, 106, -53, -66, 57, 74, 76, 88, -49, ISO7816.INS_WRITE_BINARY, -17, -86, -5, 67, 77, 51, ISOFileInfo.PROP_INFO, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, ISO7816.INS_READ_RECORD_STAMPED, ISO7816.INS_PUT_DATA, 33, ISO7816.CLA_COMMAND_CHAINING, -1, -13, ISO7816.INS_WRITE_RECORD, -51, 12, 19, -20, 95, -105, ISO7816.INS_REHABILITATE_CHV, 23, -60, -89, 126, 61, ISOFileInfo.FMD_BYTE, 93, 25, 115, 96, ISOFileInfo.DATA_BYTES2, 79, ISO7816.INS_UPDATE_RECORD, ISO7816.INS_MSE, ISO7816.INS_PSO, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, ISO7816.INS_CREATE_FILE, ISO7816.INS_INCREASE, 58, 10, 73, 6, ISO7816.INS_CHANGE_CHV, 92, ISO7816.INS_ENVELOPE, -45, -84, ISOFileInfo.FCP_BYTE, -111, -107, ISO7816.INS_DELETE_FILE, 121, -25, -56, 55, 109, ISOFileInfo.ENV_TEMP_EF, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, ISO7816.INS_READ_BINARY_STAMPED, -58, -24, -35, 116, 31, 75, -67, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.LCS_BYTE, ISO7816.INS_MANAGE_CHANNEL, 62, -75, 102, 72, 3, -10, ISO7816.INS_ERASE_BINARY, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, ISOFileInfo.CHANNEL_SECURITY, -108, -101, 30, ISOFileInfo.FCI_EXT, -23, -50, 85, 40, -33, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.A1, -119, 13, -65, -26, CVCAFile.CAR_TAG, 104, 65, -103, 45, 15, ISO7816.INS_READ_BINARY, 84, -69, 22};
        Si = new byte[]{82, 9, 106, -43, ISO7816.INS_DECREASE, 54, ISOFileInfo.A5, 56, -65, 64, -93, -98, ISOFileInfo.DATA_BYTES2, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, ISOFileInfo.FCI_EXT, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.CHANNEL_SECURITY, 67, ISO7816.INS_REHABILITATE_CHV, -60, -34, -23, -53, 84, 123, -108, ISO7816.INS_INCREASE, -90, ISO7816.INS_ENVELOPE, 35, 61, -18, 76, -107, 11, CVCAFile.CAR_TAG, -6, -61, 78, 8, 46, ISOFileInfo.A1, 102, 40, -39, ISO7816.INS_CHANGE_CHV, -78, 118, 91, -94, 73, 109, ISOFileInfo.SECURITY_ATTR_EXP, -47, 37, 114, -8, -10, ISOFileInfo.FMD_BYTE, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, ISO7816.INS_READ_RECORD_STAMPED, -110, 108, ISO7816.INS_MANAGE_CHANNEL, 72, 80, -3, -19, -71, ISO7816.INS_PUT_DATA, 94, 21, 70, 87, -89, ISOFileInfo.ENV_TEMP_EF, -99, -124, -112, ISO7816.INS_LOAD_KEY_FILE, ISOFileInfo.AB, 0, ISOFileInfo.SECURITY_ATTR_COMPACT, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, ISO7816.INS_DELETE_FILE, 88, 5, -72, ISO7816.INS_READ_RECORD2, 69, 6, ISO7816.INS_WRITE_BINARY, ISO7816.INS_UNBLOCK_CHV, 30, -113, ISO7816.INS_GET_DATA, 63, 15, 2, -63, -81, -67, 3, 1, 19, ISOFileInfo.LCS_BYTE, 107, 58, -111, 17, 65, 79, 103, ISO7816.INS_UPDATE_RECORD, -22, -105, -14, -49, -50, -16, ISO7816.INS_READ_BINARY_STAMPED, -26, 115, -106, -84, 116, ISO7816.INS_MSE, -25, -83, 53, ISOFileInfo.PROP_INFO, ISO7816.INS_APPEND_RECORD, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, ISOFileInfo.FCI_BYTE, -73, ISOFileInfo.FCP_BYTE, ISO7816.INS_ERASE_BINARY, -86, 24, -66, 27, -4, 86, 62, 75, -58, ISO7816.INS_WRITE_RECORD, 121, ISO7816.INS_VERIFY, -102, -37, ISO7816.INS_GET_RESPONSE, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, ISO7816.INS_READ_BINARY2, 18, ISO7816.CLA_COMMAND_CHAINING, 89, 39, ISOFileInfo.DATA_BYTES1, -20, 95, 96, 81, Byte.MAX_VALUE, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, ISOFileInfo.A0, ISO7816.INS_CREATE_FILE, 59, 77, -82, ISO7816.INS_PSO, -11, ISO7816.INS_READ_BINARY, -56, -21, -69, 60, ISOFileInfo.FILE_IDENTIFIER, 83, -103, 97, 23, 43, 4, 126, -70, 119, ISO7816.INS_UPDATE_BINARY, 38, -31, 105, 20, 99, 85, 33, 12, 125};
        rcon = new int[]{1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, ISO7816.TAG_SM_EXPECTED_LENGTH, 53, 106, 212, 179, 125, 250, 239, 197, 145};
        int i = onExtraCallback + 119;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private static int FFmulX(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 69;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        int i6 = ((i & m2) << 1) ^ (((m1 & i) >>> 7) * 27);
        int i7 = i3 + 115;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    private static int FFmulX2(int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = i & m4;
            int i7 = i6 ^ (i6 - 1);
            i2 = i7 / 2;
            i3 = ((i & m5) >>> 3) ^ (i7 + 2);
        } else {
            int i8 = i & m4;
            int i9 = i8 ^ (i8 >>> 1);
            i2 = i9 >>> 5;
            i3 = ((i & m5) << 2) ^ (i9 >>> 2);
        }
        return i3 ^ i2;
    }

    private void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2, int[][] iArr) {
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i + 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, i + 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, i + 12);
        int i7 = this.ROUNDS;
        int[] iArr2 = iArr[i7];
        char c = 0;
        int i8 = iLittleEndianToInt ^ iArr2[0];
        int i9 = 1;
        int i10 = iLittleEndianToInt2 ^ iArr2[1];
        int i11 = iLittleEndianToInt3 ^ iArr2[2];
        int i12 = i7 - 1;
        char c2 = 3;
        int iInv_mcol = iLittleEndianToInt4 ^ iArr2[3];
        while (i12 > i9) {
            int i13 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % i3;
            byte[] bArr3 = Si;
            int iInv_mcol2 = inv_mcol((((bArr3[i8 & GF2Field.MASK] & 255) ^ ((bArr3[(iInv_mcol >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(i11 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[i10 >>> 24] << 24)) ^ iArr[i12][c];
            int iInv_mcol3 = inv_mcol((((bArr3[i10 & GF2Field.MASK] & 255) ^ ((bArr3[(i8 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(iInv_mcol >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[i11 >>> 24] << 24)) ^ iArr[i12][i9];
            int iInv_mcol4 = inv_mcol(((((bArr3[(i10 >> 8) & GF2Field.MASK] & 255) << 8) ^ (bArr3[i11 & GF2Field.MASK] & 255)) ^ ((bArr3[(i8 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[iInv_mcol >>> 24] << 24)) ^ iArr[i12][i3];
            int iInv_mcol5 = inv_mcol((((bArr3[iInv_mcol & GF2Field.MASK] & 255) ^ ((bArr3[(i11 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(i10 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[i8 >>> 24] << 24));
            int i15 = i12 - 1;
            int i16 = iInv_mcol5 ^ iArr[i12][c2];
            int iInv_mcol6 = inv_mcol((((bArr3[iInv_mcol2 & GF2Field.MASK] & 255) ^ ((bArr3[(i16 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(iInv_mcol4 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[iInv_mcol3 >>> 24] << 24));
            int i17 = iArr[i15][c];
            int iInv_mcol7 = inv_mcol(((((bArr3[(iInv_mcol2 >> 8) & GF2Field.MASK] & 255) << 8) ^ (bArr3[iInv_mcol3 & GF2Field.MASK] & 255)) ^ ((bArr3[(i16 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[iInv_mcol4 >>> 24] << 24));
            int i18 = iArr[i15][1];
            int iInv_mcol8 = inv_mcol(((((bArr3[(iInv_mcol3 >> 8) & GF2Field.MASK] & 255) << 8) ^ (bArr3[iInv_mcol4 & GF2Field.MASK] & 255)) ^ ((bArr3[(iInv_mcol2 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[i16 >>> 24] << 24));
            int i19 = iArr[i15][2];
            i12 -= 2;
            iInv_mcol = inv_mcol((((bArr3[i16 & GF2Field.MASK] & 255) ^ ((bArr3[(iInv_mcol4 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(iInv_mcol3 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[iInv_mcol2 >>> 24] << 24)) ^ iArr[i15][3];
            i8 = iInv_mcol6 ^ i17;
            i10 = iInv_mcol7 ^ i18;
            i11 = iInv_mcol8 ^ i19;
            i3 = 2;
            c = 0;
            i9 = 1;
            c2 = 3;
        }
        byte[] bArr4 = Si;
        int iInv_mcol9 = inv_mcol((((bArr4[i8 & GF2Field.MASK] & 255) ^ ((bArr4[(iInv_mcol >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(i11 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[i10 >>> 24] << 24)) ^ iArr[i12][0];
        int iInv_mcol10 = inv_mcol((((bArr4[i10 & GF2Field.MASK] & 255) ^ ((bArr4[(i8 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(iInv_mcol >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[i11 >>> 24] << 24)) ^ iArr[i12][1];
        int iInv_mcol11 = inv_mcol((((bArr4[i11 & GF2Field.MASK] & 255) ^ ((bArr4[(i10 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(i8 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[iInv_mcol >>> 24] << 24)) ^ iArr[i12][2];
        int iInv_mcol12 = inv_mcol((((bArr4[iInv_mcol & GF2Field.MASK] & 255) ^ ((bArr4[(i11 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(i10 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[i8 >>> 24] << 24)) ^ iArr[i12][3];
        byte b = bArr4[iInv_mcol9 & GF2Field.MASK];
        byte b2 = bArr4[(iInv_mcol12 >> 8) & GF2Field.MASK];
        byte b3 = bArr4[(iInv_mcol11 >> 16) & GF2Field.MASK];
        byte b4 = bArr4[iInv_mcol10 >>> 24];
        int[] iArr3 = iArr[0];
        int i20 = iArr3[0];
        byte b5 = bArr4[iInv_mcol10 & GF2Field.MASK];
        byte b6 = bArr4[(iInv_mcol9 >> 8) & GF2Field.MASK];
        byte b7 = bArr4[(iInv_mcol12 >> 16) & GF2Field.MASK];
        byte b8 = bArr4[iInv_mcol11 >>> 24];
        int i21 = iArr3[1];
        byte b9 = bArr4[iInv_mcol11 & GF2Field.MASK];
        byte b10 = bArr4[(iInv_mcol10 >> 8) & GF2Field.MASK];
        byte b11 = bArr4[(iInv_mcol9 >> 16) & GF2Field.MASK];
        byte b12 = bArr4[iInv_mcol12 >>> 24];
        int i22 = iArr3[2];
        byte b13 = bArr4[iInv_mcol12 & GF2Field.MASK];
        byte b14 = bArr4[(iInv_mcol11 >> 8) & GF2Field.MASK];
        byte b15 = bArr4[(iInv_mcol10 >> 16) & GF2Field.MASK];
        byte b16 = bArr4[iInv_mcol9 >>> 24];
        int i23 = iArr3[3];
        Pack.intToLittleEndian(((((b & 255) ^ ((b2 & 255) << 8)) ^ ((b3 & 255) << 16)) ^ (b4 << 24)) ^ i20, bArr2, i2);
        Pack.intToLittleEndian(((((b5 & 255) ^ ((b6 & 255) << 8)) ^ ((b7 & 255) << 16)) ^ (b8 << 24)) ^ i21, bArr2, i2 + 4);
        Pack.intToLittleEndian(((((b9 & 255) ^ ((b10 & 255) << 8)) ^ ((b11 & 255) << 16)) ^ (b12 << 24)) ^ i22, bArr2, i2 + 8);
        Pack.intToLittleEndian(((((b13 & 255) ^ ((b14 & 255) << 8)) ^ ((b15 & 255) << 16)) ^ (b16 << 24)) ^ i23, bArr2, i2 + 12);
    }

    private void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2, int[][] iArr) {
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i + 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, i + 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, i + 12);
        char c = 0;
        int[] iArr2 = iArr[0];
        int i7 = iLittleEndianToInt ^ iArr2[0];
        int i8 = 1;
        int i9 = iLittleEndianToInt2 ^ iArr2[1];
        int i10 = iLittleEndianToInt3 ^ iArr2[2];
        char c2 = 3;
        int iMcol = iLittleEndianToInt4 ^ iArr2[3];
        int i11 = 1;
        while (i11 < this.ROUNDS - i8) {
            int i12 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % i3;
            byte[] bArr3 = S;
            int iMcol2 = mcol((((bArr3[i7 & GF2Field.MASK] & 255) ^ ((bArr3[(i9 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(i10 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[iMcol >>> 24] << 24)) ^ iArr[i11][c];
            int iMcol3 = mcol((((bArr3[i9 & GF2Field.MASK] & 255) ^ ((bArr3[(i10 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(iMcol >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[i7 >>> 24] << 24)) ^ iArr[i11][i8];
            int iMcol4 = mcol(((((bArr3[(iMcol >> 8) & GF2Field.MASK] & 255) << 8) ^ (bArr3[i10 & GF2Field.MASK] & 255)) ^ ((bArr3[(i7 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[i9 >>> 24] << 24)) ^ iArr[i11][i3];
            int iMcol5 = mcol((((bArr3[iMcol & GF2Field.MASK] & 255) ^ ((bArr3[(i7 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(i9 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[i10 >>> 24] << 24));
            int i14 = i11 + 1;
            int i15 = iMcol5 ^ iArr[i11][c2];
            int iMcol6 = mcol((((bArr3[iMcol2 & GF2Field.MASK] & 255) ^ ((bArr3[(iMcol3 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(iMcol4 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[i15 >>> 24] << 24));
            int i16 = iArr[i14][c];
            int iMcol7 = mcol(((((bArr3[(iMcol4 >> 8) & GF2Field.MASK] & 255) << 8) ^ (bArr3[iMcol3 & GF2Field.MASK] & 255)) ^ ((bArr3[(i15 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[iMcol2 >>> 24] << 24));
            int i17 = iArr[i14][1];
            int iMcol8 = mcol(((((bArr3[(i15 >> 8) & GF2Field.MASK] & 255) << 8) ^ (bArr3[iMcol4 & GF2Field.MASK] & 255)) ^ ((bArr3[(iMcol2 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[iMcol3 >>> 24] << 24));
            int i18 = iArr[i14][2];
            i11 += 2;
            iMcol = mcol((((bArr3[i15 & GF2Field.MASK] & 255) ^ ((bArr3[(iMcol2 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr3[(iMcol3 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr3[iMcol4 >>> 24] << 24)) ^ iArr[i14][3];
            i7 = iMcol6 ^ i16;
            i9 = iMcol7 ^ i17;
            i10 = iMcol8 ^ i18;
            i3 = 2;
            c = 0;
            i8 = 1;
            c2 = 3;
        }
        byte[] bArr4 = S;
        int iMcol9 = mcol((((bArr4[i7 & GF2Field.MASK] & 255) ^ ((bArr4[(i9 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(i10 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[iMcol >>> 24] << 24)) ^ iArr[i11][0];
        int iMcol10 = mcol((((bArr4[i9 & GF2Field.MASK] & 255) ^ ((bArr4[(i10 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(iMcol >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[i7 >>> 24] << 24)) ^ iArr[i11][1];
        int iMcol11 = mcol((((bArr4[i10 & GF2Field.MASK] & 255) ^ ((bArr4[(iMcol >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(i7 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[i9 >>> 24] << 24)) ^ iArr[i11][2];
        int iMcol12 = mcol((((bArr4[iMcol & GF2Field.MASK] & 255) ^ ((bArr4[(i7 >> 8) & GF2Field.MASK] & 255) << 8)) ^ ((bArr4[(i9 >> 16) & GF2Field.MASK] & 255) << 16)) ^ (bArr4[i10 >>> 24] << 24)) ^ iArr[i11][3];
        byte b = bArr4[iMcol9 & GF2Field.MASK];
        byte b2 = bArr4[(iMcol10 >> 8) & GF2Field.MASK];
        byte b3 = bArr4[(iMcol11 >> 16) & GF2Field.MASK];
        byte b4 = bArr4[iMcol12 >>> 24];
        int[] iArr3 = iArr[i11 + 1];
        int i19 = iArr3[0];
        byte b5 = bArr4[iMcol10 & GF2Field.MASK];
        byte b6 = bArr4[(iMcol11 >> 8) & GF2Field.MASK];
        byte b7 = bArr4[(iMcol12 >> 16) & GF2Field.MASK];
        byte b8 = bArr4[iMcol9 >>> 24];
        int i20 = iArr3[1];
        byte b9 = bArr4[iMcol11 & GF2Field.MASK];
        byte b10 = bArr4[(iMcol12 >> 8) & GF2Field.MASK];
        byte b11 = bArr4[(iMcol9 >> 16) & GF2Field.MASK];
        byte b12 = bArr4[iMcol10 >>> 24];
        int i21 = iArr3[2];
        byte b13 = bArr4[iMcol12 & GF2Field.MASK];
        byte b14 = bArr4[(iMcol9 >> 8) & GF2Field.MASK];
        byte b15 = bArr4[(iMcol10 >> 16) & GF2Field.MASK];
        byte b16 = bArr4[iMcol11 >>> 24];
        int i22 = iArr3[3];
        Pack.intToLittleEndian(((((b & 255) ^ ((b2 & 255) << 8)) ^ ((b3 & 255) << 16)) ^ (b4 << 24)) ^ i19, bArr2, i2);
        Pack.intToLittleEndian(((((b5 & 255) ^ ((b6 & 255) << 8)) ^ ((b7 & 255) << 16)) ^ (b8 << 24)) ^ i20, bArr2, i2 + 4);
        Pack.intToLittleEndian(i21 ^ ((((b9 & 255) ^ ((b10 & 255) << 8)) ^ ((b11 & 255) << 16)) ^ (b12 << 24)), bArr2, i2 + 8);
        Pack.intToLittleEndian(((((b13 & 255) ^ ((b14 & 255) << 8)) ^ ((b15 & 255) << 16)) ^ (b16 << 24)) ^ i22, bArr2, i2 + 12);
        int i23 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i23 % 128;
        int i24 = i23 % 2;
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z) {
        int i = 2 % 2;
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = length >>> 2;
        this.ROUNDS = i4 + 6;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i4 + 7, 4);
        int i5 = 8;
        if (i4 == 4) {
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt2;
            int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt3;
            int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt4;
            for (int i6 = 1; i6 <= 10; i6++) {
                iLittleEndianToInt ^= subWord(shift(iLittleEndianToInt4, 8)) ^ rcon[i6 - 1];
                int[] iArr2 = iArr[i6];
                iArr2[0] = iLittleEndianToInt;
                iLittleEndianToInt2 ^= iLittleEndianToInt;
                iArr2[1] = iLittleEndianToInt2;
                iLittleEndianToInt3 ^= iLittleEndianToInt2;
                iArr2[2] = iLittleEndianToInt3;
                iLittleEndianToInt4 ^= iLittleEndianToInt3;
                iArr2[3] = iLittleEndianToInt4;
            }
        } else if (i4 == 6) {
            int iLittleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt5;
            int iLittleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt6;
            int iLittleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt7;
            int iLittleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt8;
            int iLittleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
            int iLittleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
            int i7 = 1;
            int i8 = 1;
            while (true) {
                int[] iArr3 = iArr[i8];
                iArr3[0] = iLittleEndianToInt9;
                iArr3[1] = iLittleEndianToInt10;
                int iSubWord = iLittleEndianToInt5 ^ (subWord(shift(iLittleEndianToInt10, 8)) ^ i7);
                int[] iArr4 = iArr[i8];
                iArr4[2] = iSubWord;
                int i9 = iLittleEndianToInt6 ^ iSubWord;
                iArr4[3] = i9;
                int i10 = iLittleEndianToInt7 ^ i9;
                int[] iArr5 = iArr[i8 + 1];
                iArr5[0] = i10;
                int i11 = iLittleEndianToInt8 ^ i10;
                iArr5[1] = i11;
                int i12 = iLittleEndianToInt9 ^ i11;
                iArr5[2] = i12;
                int i13 = iLittleEndianToInt10 ^ i12;
                iArr5[3] = i13;
                int i14 = i7 << 2;
                iLittleEndianToInt5 = iSubWord ^ ((i7 << 1) ^ subWord(shift(i13, 8)));
                int[] iArr6 = iArr[i8 + 2];
                iArr6[0] = iLittleEndianToInt5;
                iLittleEndianToInt6 = i9 ^ iLittleEndianToInt5;
                iArr6[1] = iLittleEndianToInt6;
                iLittleEndianToInt7 = i10 ^ iLittleEndianToInt6;
                iArr6[2] = iLittleEndianToInt7;
                iLittleEndianToInt8 = i11 ^ iLittleEndianToInt7;
                iArr6[3] = iLittleEndianToInt8;
                i8 += 3;
                if (i8 >= 13) {
                    break;
                }
                iLittleEndianToInt9 = i12 ^ iLittleEndianToInt8;
                iLittleEndianToInt10 = i13 ^ iLittleEndianToInt9;
                i7 = i14;
            }
        } else {
            if (i4 != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int i15 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i15 % 128;
            int i16 = i15 % 2;
            int iLittleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt11;
            int iLittleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt12;
            int iLittleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt13;
            int iLittleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt14;
            int iLittleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = iLittleEndianToInt15;
            int iLittleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = iLittleEndianToInt16;
            int iLittleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
            iArr[1][2] = iLittleEndianToInt17;
            int iLittleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
            iArr[1][3] = iLittleEndianToInt18;
            int i17 = 2;
            int i18 = 1;
            while (true) {
                int i19 = i18 << 1;
                iLittleEndianToInt11 ^= subWord(shift(iLittleEndianToInt18, i5)) ^ i18;
                int[] iArr7 = iArr[i17];
                iArr7[0] = iLittleEndianToInt11;
                iLittleEndianToInt12 ^= iLittleEndianToInt11;
                iArr7[1] = iLittleEndianToInt12;
                iLittleEndianToInt13 ^= iLittleEndianToInt12;
                iArr7[2] = iLittleEndianToInt13;
                iLittleEndianToInt14 ^= iLittleEndianToInt13;
                iArr7[3] = iLittleEndianToInt14;
                int i20 = i17 + 1;
                if (i20 >= 15) {
                    break;
                }
                iLittleEndianToInt15 ^= subWord(iLittleEndianToInt14);
                int[] iArr8 = iArr[i20];
                iArr8[0] = iLittleEndianToInt15;
                iLittleEndianToInt16 ^= iLittleEndianToInt15;
                iArr8[1] = iLittleEndianToInt16;
                iLittleEndianToInt17 ^= iLittleEndianToInt16;
                iArr8[2] = iLittleEndianToInt17;
                iLittleEndianToInt18 ^= iLittleEndianToInt17;
                iArr8[3] = iLittleEndianToInt18;
                i17 += 2;
                i18 = i19;
                i5 = 8;
            }
        }
        if (!z) {
            for (int i21 = 1; i21 < this.ROUNDS; i21++) {
                int i22 = 0;
                while (i22 < 4) {
                    int[] iArr9 = iArr[i21];
                    iArr9[i22] = inv_mcol(iArr9[i22]);
                    i22++;
                    int i23 = IAuthTabCallback + 107;
                    onExtraCallbackWithResult = i23 % 128;
                    int i24 = i23 % 2;
                }
            }
        }
        return iArr;
    }

    private static int inv_mcol(int i) {
        int iFFmulX;
        int iFFmulX2;
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int iShift = shift(i, 65) ^ i;
            iFFmulX = i ^ FFmulX(iShift);
            iFFmulX2 = iShift ^ FFmulX2(iFFmulX);
            i2 = 6;
        } else {
            int iShift2 = shift(i, 8) ^ i;
            iFFmulX = i ^ FFmulX(iShift2);
            iFFmulX2 = iShift2 ^ FFmulX2(iFFmulX);
            i2 = 16;
        }
        return iFFmulX ^ (iFFmulX2 ^ shift(iFFmulX2, i2));
    }

    private static int mcol(int i) {
        int iShift;
        int i2;
        int iShift2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            iShift = shift(i, 76);
            i2 = i ^ iShift;
            iShift2 = shift(i2, 39);
        } else {
            iShift = shift(i, 8);
            i2 = i ^ iShift;
            iShift2 = shift(i2, 16);
        }
        return FFmulX(i2) ^ (iShift ^ iShift2);
    }

    private static int shift(int i, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i6 % 128;
        int i7 = -i2;
        if (i6 % 2 == 0) {
            i3 = i / i7;
            i4 = i % i2;
        } else {
            i3 = i << i7;
            i4 = i >>> i2;
        }
        return i4 | i3;
    }

    private static int subWord(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 57;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArr = S;
        int i6 = (bArr[i >>> 24] << 24) | (bArr[i & GF2Field.MASK] & 255) | ((bArr[(i >> 8) & GF2Field.MASK] & 255) << 8) | ((bArr[(i >> 16) & GF2Field.MASK] & 255) << 16);
        int i7 = i3 + 53;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public String getAlgorithmName() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{57062, 30943, 22522, 27338, 56999, 41173, 59191}, 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i4 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return strIntern;
    }

    public int getBlockSize() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 7;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return 16;
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 1;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            boolean z2 = cipherParameters instanceof KeyParameter;
            throw null;
        }
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to AES init - " + cipherParameters.getClass().getName());
        }
        int i4 = i2 + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (i5 == 0) {
            this.WorkingKey = generateWorkingKey(key, z);
            this.forEncryption = z;
        } else {
            this.WorkingKey = generateWorkingKey(key, z);
            this.forEncryption = z;
            throw null;
        }
    }

    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws Throwable {
        int i3 = 2 % 2;
        int[][] iArr = this.WorkingKey;
        if (iArr == null) {
            Object[] objArr = new Object[1];
            a(new char[]{55968, 42241, 52681, 54389, 56033, 32011, 32004, 23736, 48121, 40164, 56436, 15925, 6326, 16291, 48895, 40830, 63867, 22902, 6587, 30909, 24126, 63575, 63539, 55745, 15597, 6934, 23402, 47903, 40365, 47826}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, objArr);
            throw new IllegalStateException(((String) objArr[0]).intern());
        }
        int i4 = onExtraCallbackWithResult;
        int i5 = i4 + 123;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0 ? i > bArr.length - 16 : i > bArr.length * 56) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 > bArr2.length - 16) {
            throw new OutputLengthException("output buffer too short");
        }
        int i6 = i4 + 25;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        if (this.forEncryption) {
            encryptBlock(bArr, i, bArr2, i2, iArr);
        } else {
            decryptBlock(bArr, i, bArr2, i2, iArr);
            int i7 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
        return 16;
    }

    public void reset() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 45;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 83 - Process.getGidForName(BuildConfig.FLAVOR), 21233 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName(BuildConfig.FLAVOR) + 14186), View.MeasureSpec.getMode(0) + 19, View.resolveSizeAndState(0, 0, 0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 35;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 / 4;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = -2469595630960860349L;
    }
}
