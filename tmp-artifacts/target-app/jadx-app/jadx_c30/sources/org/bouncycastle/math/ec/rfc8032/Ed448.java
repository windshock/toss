package org.bouncycastle.math.ec.rfc8032;

import java.security.SecureRandom;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.math.ec.rfc7748.X448;
import org.bouncycastle.math.ec.rfc7748.X448Field;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class Ed448 {
    private static final int COORD_INTS = 14;
    private static final int C_d = -39081;
    private static final int L4_0 = 43969588;
    private static final int L4_1 = 30366549;
    private static final int L4_2 = 163752818;
    private static final int L4_3 = 258169998;
    private static final int L4_4 = 96434764;
    private static final int L4_5 = 227822194;
    private static final int L4_6 = 149865618;
    private static final int L4_7 = 550336261;
    private static final int L_0 = 78101261;
    private static final int L_1 = 141809365;
    private static final int L_2 = 175155932;
    private static final int L_3 = 64542499;
    private static final int L_4 = 158326419;
    private static final int L_5 = 191173276;
    private static final int L_6 = 104575268;
    private static final int L_7 = 137584065;
    private static final long M26L = 67108863;
    private static final long M28L = 268435455;
    private static final long M32L = 4294967295L;
    private static final int POINT_BYTES = 57;
    private static final int PRECOMP_BLOCKS = 5;
    private static final int PRECOMP_MASK = 15;
    private static final int PRECOMP_POINTS = 16;
    private static final int PRECOMP_SPACING = 18;
    private static final int PRECOMP_TEETH = 5;
    public static final int PREHASH_SIZE = 64;
    public static final int PUBLIC_KEY_SIZE = 57;
    private static final int SCALAR_BYTES = 57;
    private static final int SCALAR_INTS = 14;
    public static final int SECRET_KEY_SIZE = 57;
    public static final int SIGNATURE_SIZE = 114;
    private static final int WNAF_WIDTH_BASE = 7;
    private static final byte[] DOM4_PREFIX = {83, 105, 103, 69, ISOFileInfo.FMD_BYTE, ISO7816.INS_DECREASE_STAMPED, ISO7816.INS_DECREASE_STAMPED, 56};
    private static final int[] P = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    private static final int[] L = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, 1073741823};
    private static final int[] B_x = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};
    private static final int[] B_y = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};
    private static final Object precompLock = new Object();
    private static PointExt[] precompBaseTable = null;
    private static int[] precompBase = null;

    public static final class Algorithm {
        public static final int Ed448 = 0;
        public static final int Ed448ph = 1;
    }

    static class F extends X448Field {
        private F() {
        }
    }

    static class PointExt {
        int[] x;
        int[] y;
        int[] z;

        private PointExt() {
            this.x = X448Field.create();
            this.y = X448Field.create();
            this.z = X448Field.create();
        }
    }

    static class PointPrecomp {
        int[] x;
        int[] y;

        private PointPrecomp() {
            this.x = X448Field.create();
            this.y = X448Field.create();
        }
    }

    private static byte[] calculateS(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[28];
        decodeScalar(bArr, 0, iArr);
        int[] iArr2 = new int[14];
        decodeScalar(bArr2, 0, iArr2);
        int[] iArr3 = new int[14];
        decodeScalar(bArr3, 0, iArr3);
        Nat.mulAddTo(14, iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[114];
        for (int i = 0; i < 28; i++) {
            encode32(iArr[i], bArr4, i << 2);
        }
        return reduceScalar(bArr4);
    }

    private static boolean checkContextVar(byte[] bArr) {
        return bArr != null && bArr.length < 256;
    }

    private static int checkPoint(int[] iArr, int[] iArr2) {
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        int[] iArrCreate3 = X448Field.create();
        X448Field.sqr(iArr, iArrCreate2);
        X448Field.sqr(iArr2, iArrCreate3);
        X448Field.mul(iArrCreate2, iArrCreate3, iArrCreate);
        X448Field.add(iArrCreate2, iArrCreate3, iArrCreate2);
        X448Field.mul(iArrCreate, 39081, iArrCreate);
        X448Field.subOne(iArrCreate);
        X448Field.add(iArrCreate, iArrCreate2, iArrCreate);
        X448Field.normalize(iArrCreate);
        return X448Field.isZero(iArrCreate);
    }

    private static int checkPoint(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        int[] iArrCreate3 = X448Field.create();
        int[] iArrCreate4 = X448Field.create();
        X448Field.sqr(iArr, iArrCreate2);
        X448Field.sqr(iArr2, iArrCreate3);
        X448Field.sqr(iArr3, iArrCreate4);
        X448Field.mul(iArrCreate2, iArrCreate3, iArrCreate);
        X448Field.add(iArrCreate2, iArrCreate3, iArrCreate2);
        X448Field.mul(iArrCreate2, iArrCreate4, iArrCreate2);
        X448Field.sqr(iArrCreate4, iArrCreate4);
        X448Field.mul(iArrCreate, 39081, iArrCreate);
        X448Field.sub(iArrCreate, iArrCreate4, iArrCreate);
        X448Field.add(iArrCreate, iArrCreate2, iArrCreate);
        X448Field.normalize(iArrCreate);
        return X448Field.isZero(iArrCreate);
    }

    private static boolean checkPointVar(byte[] bArr) {
        if ((bArr[56] & Byte.MAX_VALUE) != 0) {
            return false;
        }
        decode32(bArr, 0, new int[14], 0, 14);
        return !Nat.gte(14, r2, P);
    }

    private static boolean checkScalarVar(byte[] bArr, int[] iArr) {
        if (bArr[56] != 0) {
            return false;
        }
        decodeScalar(bArr, 0, iArr);
        return !Nat.gte(14, iArr, L);
    }

    private static byte[] copy(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static Xof createPrehash() {
        return createXof();
    }

    private static Xof createXof() {
        return new SHAKEDigest(256);
    }

    private static int decode16(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    private static int decode24(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    private static int decode32(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static void decode32(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i2 + i4] = decode32(bArr, (i4 << 2) + i);
        }
    }

    private static boolean decodePointVar(byte[] bArr, int i, boolean z, PointExt pointExt) {
        byte[] bArrCopy = copy(bArr, i, 57);
        if (!checkPointVar(bArrCopy)) {
            return false;
        }
        byte b = bArrCopy[56];
        int i2 = (b & ISOFileInfo.DATA_BYTES1) >>> 7;
        bArrCopy[56] = (byte) (b & Byte.MAX_VALUE);
        X448Field.decode(bArrCopy, 0, pointExt.y);
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        X448Field.sqr(pointExt.y, iArrCreate);
        X448Field.mul(iArrCreate, 39081, iArrCreate2);
        X448Field.negate(iArrCreate, iArrCreate);
        X448Field.addOne(iArrCreate);
        X448Field.addOne(iArrCreate2);
        if (!X448Field.sqrtRatioVar(iArrCreate, iArrCreate2, pointExt.x)) {
            return false;
        }
        X448Field.normalize(pointExt.x);
        if (i2 == 1 && X448Field.isZeroVar(pointExt.x)) {
            return false;
        }
        int[] iArr = pointExt.x;
        if (z ^ (i2 != (iArr[0] & 1))) {
            X448Field.negate(iArr, iArr);
        }
        pointExtendXY(pointExt);
        return true;
    }

    private static void decodeScalar(byte[] bArr, int i, int[] iArr) {
        decode32(bArr, i, iArr, 0, 14);
    }

    private static void dom4(Xof xof, byte b, byte[] bArr) {
        byte[] bArr2 = DOM4_PREFIX;
        int length = bArr2.length;
        int i = length + 2;
        int length2 = bArr.length + i;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        bArr3[length] = b;
        bArr3[length + 1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr3, i, bArr.length);
        xof.update(bArr3, 0, length2);
    }

    private static void encode24(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
    }

    private static void encode32(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private static void encode56(long j, byte[] bArr, int i) {
        encode32((int) j, bArr, i);
        encode24((int) (j >>> 32), bArr, i + 4);
    }

    private static int encodePoint(PointExt pointExt, byte[] bArr, int i) {
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        X448Field.inv(pointExt.z, iArrCreate2);
        X448Field.mul(pointExt.x, iArrCreate2, iArrCreate);
        X448Field.mul(pointExt.y, iArrCreate2, iArrCreate2);
        X448Field.normalize(iArrCreate);
        X448Field.normalize(iArrCreate2);
        int iCheckPoint = checkPoint(iArrCreate, iArrCreate2);
        X448Field.encode(iArrCreate2, bArr, i);
        bArr[i + 56] = (byte) ((iArrCreate[0] & 1) << 7);
        return iCheckPoint;
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    public static void generatePublicKey(byte[] bArr, int i, byte[] bArr2, int i2) {
        Xof xofCreateXof = createXof();
        byte[] bArr3 = new byte[114];
        xofCreateXof.update(bArr, i, 57);
        xofCreateXof.doFinal(bArr3, 0, 114);
        byte[] bArr4 = new byte[57];
        pruneScalar(bArr3, 0, bArr4);
        scalarMultBaseEncoded(bArr4, bArr2, i2);
    }

    private static int getWindow4(int[] iArr, int i) {
        return (iArr[i >>> 3] >>> ((i & 7) << 2)) & 15;
    }

    private static byte[] getWnafVar(int[] iArr, int i) {
        int[] iArr2 = new int[28];
        int i2 = 14;
        int i3 = 0;
        int i4 = 28;
        int i5 = 0;
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            }
            int i6 = iArr[i2];
            iArr2[i4 - 1] = (i5 << 16) | (i6 >>> 16);
            i4 -= 2;
            iArr2[i4] = i6;
            i5 = i6;
        }
        byte[] bArr = new byte[447];
        int i7 = 32 - i;
        int i8 = 0;
        int i9 = 0;
        while (i3 < 28) {
            int i10 = iArr2[i3];
            while (i8 < 16) {
                int i11 = i10 >>> i8;
                if ((i11 & 1) == i9) {
                    i8++;
                } else {
                    int i12 = (i11 | 1) << i7;
                    bArr[(i3 << 4) + i8] = (byte) (i12 >> i7);
                    i8 += i;
                    i9 = i12 >>> 31;
                }
            }
            i3++;
            i8 -= 16;
        }
        return bArr;
    }

    private static void implSign(Xof xof, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte b, byte[] bArr5, int i2, int i3, byte[] bArr6, int i4) {
        dom4(xof, b, bArr4);
        xof.update(bArr, 57, 57);
        xof.update(bArr5, i2, i3);
        xof.doFinal(bArr, 0, bArr.length);
        byte[] bArrReduceScalar = reduceScalar(bArr);
        byte[] bArr7 = new byte[57];
        scalarMultBaseEncoded(bArrReduceScalar, bArr7, 0);
        dom4(xof, b, bArr4);
        xof.update(bArr7, 0, 57);
        xof.update(bArr3, i, 57);
        xof.update(bArr5, i2, i3);
        xof.doFinal(bArr, 0, bArr.length);
        byte[] bArrCalculateS = calculateS(bArrReduceScalar, reduceScalar(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i4, 57);
        System.arraycopy(bArrCalculateS, 0, bArr6, i4 + 57, 57);
    }

    private static void implSign(byte[] bArr, int i, byte[] bArr2, byte b, byte[] bArr3, int i2, int i3, byte[] bArr4, int i4) {
        if (!checkContextVar(bArr2)) {
            throw new IllegalArgumentException("ctx");
        }
        Xof xofCreateXof = createXof();
        byte[] bArr5 = new byte[114];
        xofCreateXof.update(bArr, i, 57);
        xofCreateXof.doFinal(bArr5, 0, 114);
        byte[] bArr6 = new byte[57];
        pruneScalar(bArr5, 0, bArr6);
        byte[] bArr7 = new byte[57];
        scalarMultBaseEncoded(bArr6, bArr7, 0);
        implSign(xofCreateXof, bArr5, bArr6, bArr7, 0, bArr2, b, bArr3, i2, i3, bArr4, i4);
    }

    private static void implSign(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        if (!checkContextVar(bArr3)) {
            throw new IllegalArgumentException("ctx");
        }
        Xof xofCreateXof = createXof();
        byte[] bArr6 = new byte[114];
        xofCreateXof.update(bArr, i, 57);
        xofCreateXof.doFinal(bArr6, 0, 114);
        byte[] bArr7 = new byte[57];
        pruneScalar(bArr6, 0, bArr7);
        implSign(xofCreateXof, bArr6, bArr7, bArr2, i2, bArr3, b, bArr4, i3, i4, bArr5, i5);
    }

    private static boolean implVerify(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b, byte[] bArr4, int i3, int i4) {
        if (!checkContextVar(bArr3)) {
            throw new IllegalArgumentException("ctx");
        }
        byte[] bArrCopy = copy(bArr, i, 57);
        byte[] bArrCopy2 = copy(bArr, i + 57, 57);
        if (!checkPointVar(bArrCopy)) {
            return false;
        }
        int[] iArr = new int[14];
        if (!checkScalarVar(bArrCopy2, iArr)) {
            return false;
        }
        PointExt pointExt = new PointExt();
        if (!decodePointVar(bArr2, i2, true, pointExt)) {
            return false;
        }
        Xof xofCreateXof = createXof();
        byte[] bArr5 = new byte[114];
        dom4(xofCreateXof, b, bArr3);
        xofCreateXof.update(bArrCopy, 0, 57);
        xofCreateXof.update(bArr2, i2, 57);
        xofCreateXof.update(bArr4, i3, i4);
        xofCreateXof.doFinal(bArr5, 0, 114);
        int[] iArr2 = new int[14];
        decodeScalar(reduceScalar(bArr5), 0, iArr2);
        PointExt pointExt2 = new PointExt();
        scalarMultStrausVar(iArr, iArr2, pointExt, pointExt2);
        byte[] bArr6 = new byte[57];
        return encodePoint(pointExt2, bArr6, 0) != 0 && Arrays.areEqual(bArr6, bArrCopy);
    }

    private static boolean isNeutralElementVar(int[] iArr, int[] iArr2, int[] iArr3) {
        return X448Field.isZeroVar(iArr) && X448Field.areEqualVar(iArr2, iArr3);
    }

    private static void pointAdd(PointExt pointExt, PointExt pointExt2) {
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        int[] iArrCreate3 = X448Field.create();
        int[] iArrCreate4 = X448Field.create();
        int[] iArrCreate5 = X448Field.create();
        int[] iArrCreate6 = X448Field.create();
        int[] iArrCreate7 = X448Field.create();
        int[] iArrCreate8 = X448Field.create();
        X448Field.mul(pointExt.z, pointExt2.z, iArrCreate);
        X448Field.sqr(iArrCreate, iArrCreate2);
        X448Field.mul(pointExt.x, pointExt2.x, iArrCreate3);
        X448Field.mul(pointExt.y, pointExt2.y, iArrCreate4);
        X448Field.mul(iArrCreate3, iArrCreate4, iArrCreate5);
        X448Field.mul(iArrCreate5, 39081, iArrCreate5);
        X448Field.add(iArrCreate2, iArrCreate5, iArrCreate6);
        X448Field.sub(iArrCreate2, iArrCreate5, iArrCreate7);
        X448Field.add(pointExt.x, pointExt.y, iArrCreate2);
        X448Field.add(pointExt2.x, pointExt2.y, iArrCreate5);
        X448Field.mul(iArrCreate2, iArrCreate5, iArrCreate8);
        X448Field.add(iArrCreate4, iArrCreate3, iArrCreate2);
        X448Field.sub(iArrCreate4, iArrCreate3, iArrCreate5);
        X448Field.carry(iArrCreate2);
        X448Field.sub(iArrCreate8, iArrCreate2, iArrCreate8);
        X448Field.mul(iArrCreate8, iArrCreate, iArrCreate8);
        X448Field.mul(iArrCreate5, iArrCreate, iArrCreate5);
        X448Field.mul(iArrCreate6, iArrCreate8, pointExt2.x);
        X448Field.mul(iArrCreate5, iArrCreate7, pointExt2.y);
        X448Field.mul(iArrCreate6, iArrCreate7, pointExt2.z);
    }

    private static void pointAddPrecomp(PointPrecomp pointPrecomp, PointExt pointExt) {
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        int[] iArrCreate3 = X448Field.create();
        int[] iArrCreate4 = X448Field.create();
        int[] iArrCreate5 = X448Field.create();
        int[] iArrCreate6 = X448Field.create();
        int[] iArrCreate7 = X448Field.create();
        X448Field.sqr(pointExt.z, iArrCreate);
        X448Field.mul(pointPrecomp.x, pointExt.x, iArrCreate2);
        X448Field.mul(pointPrecomp.y, pointExt.y, iArrCreate3);
        X448Field.mul(iArrCreate2, iArrCreate3, iArrCreate4);
        X448Field.mul(iArrCreate4, 39081, iArrCreate4);
        X448Field.add(iArrCreate, iArrCreate4, iArrCreate5);
        X448Field.sub(iArrCreate, iArrCreate4, iArrCreate6);
        X448Field.add(pointPrecomp.x, pointPrecomp.y, iArrCreate);
        X448Field.add(pointExt.x, pointExt.y, iArrCreate4);
        X448Field.mul(iArrCreate, iArrCreate4, iArrCreate7);
        X448Field.add(iArrCreate3, iArrCreate2, iArrCreate);
        X448Field.sub(iArrCreate3, iArrCreate2, iArrCreate4);
        X448Field.carry(iArrCreate);
        X448Field.sub(iArrCreate7, iArrCreate, iArrCreate7);
        X448Field.mul(iArrCreate7, pointExt.z, iArrCreate7);
        X448Field.mul(iArrCreate4, pointExt.z, iArrCreate4);
        X448Field.mul(iArrCreate5, iArrCreate7, pointExt.x);
        X448Field.mul(iArrCreate4, iArrCreate6, pointExt.y);
        X448Field.mul(iArrCreate5, iArrCreate6, pointExt.z);
    }

    private static void pointAddVar(boolean z, PointExt pointExt, PointExt pointExt2) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        int[] iArrCreate3 = X448Field.create();
        int[] iArrCreate4 = X448Field.create();
        int[] iArrCreate5 = X448Field.create();
        int[] iArrCreate6 = X448Field.create();
        int[] iArrCreate7 = X448Field.create();
        int[] iArrCreate8 = X448Field.create();
        if (z) {
            X448Field.sub(pointExt.y, pointExt.x, iArrCreate8);
            iArr2 = iArrCreate2;
            iArr = iArrCreate5;
            iArr4 = iArrCreate6;
            iArr3 = iArrCreate7;
        } else {
            X448Field.add(pointExt.y, pointExt.x, iArrCreate8);
            iArr = iArrCreate2;
            iArr2 = iArrCreate5;
            iArr3 = iArrCreate6;
            iArr4 = iArrCreate7;
        }
        X448Field.mul(pointExt.z, pointExt2.z, iArrCreate);
        X448Field.sqr(iArrCreate, iArrCreate2);
        X448Field.mul(pointExt.x, pointExt2.x, iArrCreate3);
        X448Field.mul(pointExt.y, pointExt2.y, iArrCreate4);
        X448Field.mul(iArrCreate3, iArrCreate4, iArrCreate5);
        X448Field.mul(iArrCreate5, 39081, iArrCreate5);
        X448Field.add(iArrCreate2, iArrCreate5, iArr3);
        X448Field.sub(iArrCreate2, iArrCreate5, iArr4);
        X448Field.add(pointExt2.x, pointExt2.y, iArrCreate5);
        X448Field.mul(iArrCreate8, iArrCreate5, iArrCreate8);
        X448Field.add(iArrCreate4, iArrCreate3, iArr);
        X448Field.sub(iArrCreate4, iArrCreate3, iArr2);
        X448Field.carry(iArr);
        X448Field.sub(iArrCreate8, iArrCreate2, iArrCreate8);
        X448Field.mul(iArrCreate8, iArrCreate, iArrCreate8);
        X448Field.mul(iArrCreate5, iArrCreate, iArrCreate5);
        X448Field.mul(iArrCreate6, iArrCreate8, pointExt2.x);
        X448Field.mul(iArrCreate5, iArrCreate7, pointExt2.y);
        X448Field.mul(iArrCreate6, iArrCreate7, pointExt2.z);
    }

    private static PointExt pointCopy(PointExt pointExt) {
        PointExt pointExt2 = new PointExt();
        pointCopy(pointExt, pointExt2);
        return pointExt2;
    }

    private static void pointCopy(PointExt pointExt, PointExt pointExt2) {
        X448Field.copy(pointExt.x, 0, pointExt2.x, 0);
        X448Field.copy(pointExt.y, 0, pointExt2.y, 0);
        X448Field.copy(pointExt.z, 0, pointExt2.z, 0);
    }

    private static void pointDouble(PointExt pointExt) {
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        int[] iArrCreate3 = X448Field.create();
        int[] iArrCreate4 = X448Field.create();
        int[] iArrCreate5 = X448Field.create();
        int[] iArrCreate6 = X448Field.create();
        X448Field.add(pointExt.x, pointExt.y, iArrCreate);
        X448Field.sqr(iArrCreate, iArrCreate);
        X448Field.sqr(pointExt.x, iArrCreate2);
        X448Field.sqr(pointExt.y, iArrCreate3);
        X448Field.add(iArrCreate2, iArrCreate3, iArrCreate4);
        X448Field.carry(iArrCreate4);
        X448Field.sqr(pointExt.z, iArrCreate5);
        X448Field.add(iArrCreate5, iArrCreate5, iArrCreate5);
        X448Field.carry(iArrCreate5);
        X448Field.sub(iArrCreate4, iArrCreate5, iArrCreate6);
        X448Field.sub(iArrCreate, iArrCreate4, iArrCreate);
        X448Field.sub(iArrCreate2, iArrCreate3, iArrCreate2);
        X448Field.mul(iArrCreate, iArrCreate6, pointExt.x);
        X448Field.mul(iArrCreate4, iArrCreate2, pointExt.y);
        X448Field.mul(iArrCreate4, iArrCreate6, pointExt.z);
    }

    private static void pointExtendXY(PointExt pointExt) {
        X448Field.one(pointExt.z);
    }

    private static void pointLookup(int i, int i2, PointPrecomp pointPrecomp) {
        int i3 = i << 9;
        for (int i4 = 0; i4 < 16; i4++) {
            int i5 = ((i4 ^ i2) - 1) >> 31;
            X448Field.cmov(i5, precompBase, i3, pointPrecomp.x, 0);
            X448Field.cmov(i5, precompBase, i3 + 16, pointPrecomp.y, 0);
            i3 += 32;
        }
    }

    private static void pointLookup(int[] iArr, int i, int[] iArr2, PointExt pointExt) {
        int window4 = (getWindow4(iArr, i) >>> 3) ^ 1;
        int i2 = -window4;
        int i3 = 0;
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = ((((r7 ^ i2) & 7) ^ i4) - 1) >> 31;
            X448Field.cmov(i5, iArr2, i3, pointExt.x, 0);
            X448Field.cmov(i5, iArr2, i3 + 16, pointExt.y, 0);
            X448Field.cmov(i5, iArr2, i3 + 32, pointExt.z, 0);
            i3 += 48;
        }
        X448Field.cnegate(window4, pointExt.x);
    }

    private static int[] pointPrecompute(PointExt pointExt, int i) {
        PointExt pointExtPointCopy = pointCopy(pointExt);
        PointExt pointExtPointCopy2 = pointCopy(pointExtPointCopy);
        pointDouble(pointExtPointCopy2);
        int[] iArrCreateTable = X448Field.createTable(i * 3);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            X448Field.copy(pointExtPointCopy.x, 0, iArrCreateTable, i2);
            X448Field.copy(pointExtPointCopy.y, 0, iArrCreateTable, i2 + 16);
            X448Field.copy(pointExtPointCopy.z, 0, iArrCreateTable, i2 + 32);
            i2 += 48;
            i3++;
            if (i3 == i) {
                return iArrCreateTable;
            }
            pointAdd(pointExtPointCopy2, pointExtPointCopy);
        }
    }

    private static PointExt[] pointPrecomputeVar(PointExt pointExt, int i) {
        PointExt pointExtPointCopy = pointCopy(pointExt);
        pointDouble(pointExtPointCopy);
        PointExt[] pointExtArr = new PointExt[i];
        pointExtArr[0] = pointCopy(pointExt);
        for (int i2 = 1; i2 < i; i2++) {
            PointExt pointExtPointCopy2 = pointCopy(pointExtArr[i2 - 1]);
            pointExtArr[i2] = pointExtPointCopy2;
            pointAddVar(false, pointExtPointCopy, pointExtPointCopy2);
        }
        return pointExtArr;
    }

    private static void pointSetNeutral(PointExt pointExt) {
        X448Field.zero(pointExt.x);
        X448Field.one(pointExt.y);
        X448Field.one(pointExt.z);
    }

    public static void precompute() {
        synchronized (precompLock) {
            if (precompBase == null) {
                PointExt pointExt = new PointExt();
                X448Field.copy(B_x, 0, pointExt.x, 0);
                X448Field.copy(B_y, 0, pointExt.y, 0);
                pointExtendXY(pointExt);
                precompBaseTable = pointPrecomputeVar(pointExt, 32);
                precompBase = X448Field.createTable(160);
                int i = 0;
                for (int i2 = 0; i2 < 5; i2++) {
                    PointExt[] pointExtArr = new PointExt[5];
                    PointExt pointExt2 = new PointExt();
                    pointSetNeutral(pointExt2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 5) {
                            break;
                        }
                        pointAddVar(true, pointExt, pointExt2);
                        pointDouble(pointExt);
                        pointExtArr[i3] = pointCopy(pointExt);
                        if (i2 + i3 != 8) {
                            for (int i4 = 1; i4 < 18; i4++) {
                                pointDouble(pointExt);
                            }
                        }
                        i3++;
                    }
                    PointExt[] pointExtArr2 = new PointExt[16];
                    pointExtArr2[0] = pointExt2;
                    int i5 = 1;
                    for (int i6 = 0; i6 < 4; i6++) {
                        int i7 = 1 << i6;
                        int i8 = 0;
                        while (i8 < i7) {
                            PointExt pointExtPointCopy = pointCopy(pointExtArr2[i5 - i7]);
                            pointExtArr2[i5] = pointExtPointCopy;
                            pointAddVar(false, pointExtArr[i6], pointExtPointCopy);
                            i8++;
                            i5++;
                        }
                    }
                    int[] iArrCreateTable = X448Field.createTable(16);
                    int[] iArrCreate = X448Field.create();
                    X448Field.copy(pointExtArr2[0].z, 0, iArrCreate, 0);
                    X448Field.copy(iArrCreate, 0, iArrCreateTable, 0);
                    int i9 = 0;
                    while (true) {
                        int i10 = i9 + 1;
                        if (i10 >= 16) {
                            break;
                        }
                        X448Field.mul(iArrCreate, pointExtArr2[i10].z, iArrCreate);
                        X448Field.copy(iArrCreate, 0, iArrCreateTable, i10 << 4);
                        i9 = i10;
                    }
                    X448Field.invVar(iArrCreate, iArrCreate);
                    int[] iArrCreate2 = X448Field.create();
                    while (i9 > 0) {
                        int i11 = i9 - 1;
                        X448Field.copy(iArrCreateTable, i11 << 4, iArrCreate2, 0);
                        X448Field.mul(iArrCreate2, iArrCreate, iArrCreate2);
                        X448Field.copy(iArrCreate2, 0, iArrCreateTable, i9 << 4);
                        X448Field.mul(iArrCreate, pointExtArr2[i9].z, iArrCreate);
                        i9 = i11;
                    }
                    X448Field.copy(iArrCreate, 0, iArrCreateTable, 0);
                    for (int i12 = 0; i12 < 16; i12++) {
                        PointExt pointExt3 = pointExtArr2[i12];
                        X448Field.copy(iArrCreateTable, i12 << 4, pointExt3.z, 0);
                        int[] iArr = pointExt3.x;
                        X448Field.mul(iArr, pointExt3.z, iArr);
                        int[] iArr2 = pointExt3.y;
                        X448Field.mul(iArr2, pointExt3.z, iArr2);
                        X448Field.copy(pointExt3.x, 0, precompBase, i);
                        X448Field.copy(pointExt3.y, 0, precompBase, i + 16);
                        i += 32;
                    }
                }
            }
        }
    }

    private static void pruneScalar(byte[] bArr, int i, byte[] bArr2) {
        System.arraycopy(bArr, i, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | ISOFileInfo.DATA_BYTES1);
        bArr2[56] = 0;
    }

    private static byte[] reduceScalar(byte[] bArr) {
        long jDecode32 = decode32(bArr, 0);
        long jDecode24 = decode24(bArr, 4) << 4;
        long jDecode322 = decode32(bArr, 7);
        long jDecode242 = decode24(bArr, 11) << 4;
        long jDecode323 = decode32(bArr, 14);
        long jDecode243 = decode24(bArr, 18) << 4;
        long jDecode324 = decode32(bArr, 21);
        long jDecode244 = decode24(bArr, 25) << 4;
        long jDecode325 = decode32(bArr, 28);
        long jDecode245 = decode24(bArr, 32) << 4;
        long jDecode326 = decode32(bArr, 35);
        long jDecode246 = decode24(bArr, 39) << 4;
        long jDecode327 = decode32(bArr, 42);
        long jDecode247 = decode24(bArr, 46) << 4;
        long jDecode328 = decode32(bArr, 49);
        long jDecode248 = decode24(bArr, 53) << 4;
        long jDecode329 = decode32(bArr, 56);
        long jDecode249 = decode24(bArr, 60) << 4;
        long jDecode3210 = decode32(bArr, 63);
        long jDecode2410 = decode24(bArr, 67) << 4;
        long jDecode3211 = decode32(bArr, 70);
        long jDecode2411 = decode24(bArr, 74) << 4;
        long jDecode3212 = decode32(bArr, 77);
        long jDecode2412 = decode24(bArr, 81) << 4;
        long jDecode3213 = decode32(bArr, 84);
        long jDecode2413 = decode24(bArr, 88) << 4;
        long jDecode3214 = decode32(bArr, 91);
        long jDecode2414 = decode24(bArr, 95) << 4;
        long jDecode3215 = decode32(bArr, 98);
        long jDecode2415 = decode24(bArr, 102) << 4;
        long jDecode3216 = decode32(bArr, 105);
        long jDecode16 = decode16(bArr, 112) & 4294967295L;
        long jDecode2416 = ((decode24(bArr, 109) << 4) & 4294967295L) + ((jDecode3216 & 4294967295L) >>> 28);
        long j = jDecode3216 & M28L;
        long j2 = (jDecode2415 & 4294967295L) + ((jDecode3215 & 4294967295L) >>> 28);
        long j3 = jDecode3215 & M28L;
        long j4 = (jDecode3211 & 4294967295L) + (jDecode16 * 96434764) + (jDecode2416 * 227822194) + (j * 149865618) + (j2 * 550336261);
        long j5 = (jDecode2414 & 4294967295L) + ((jDecode3214 & 4294967295L) >>> 28);
        long j6 = jDecode3214 & M28L;
        long j7 = (jDecode249 & 4294967295L) + (jDecode16 * 30366549) + (jDecode2416 * 163752818) + (j * 258169998) + (j2 * 96434764) + (j3 * 227822194) + (j5 * 149865618) + (j6 * 550336261);
        long j8 = (jDecode2413 & 4294967295L) + ((jDecode3213 & 4294967295L) >>> 28);
        long j9 = (jDecode2411 & 4294967295L) + (jDecode16 * 227822194) + (jDecode2416 * 149865618) + (j * 550336261) + (j4 >>> 28);
        long j10 = (jDecode3212 & 4294967295L) + (jDecode16 * 149865618) + (jDecode2416 * 550336261) + (j9 >>> 28);
        long j11 = (jDecode2412 & 4294967295L) + (jDecode16 * 550336261) + (j10 >>> 28);
        long j12 = j10 & M28L;
        long j13 = (jDecode3213 & M28L) + (j11 >>> 28);
        long j14 = j11 & M28L;
        long j15 = (jDecode328 & 4294967295L) + (j * 43969588) + (j2 * 30366549) + (j3 * 163752818) + (j5 * 258169998) + (j6 * 96434764) + (j8 * 227822194) + (j13 * 149865618) + (j14 * 550336261);
        long j16 = (jDecode3210 & 4294967295L) + (jDecode16 * 163752818) + (jDecode2416 * 258169998) + (j * 96434764) + (j2 * 227822194) + (j3 * 149865618) + (j5 * 550336261) + (j7 >>> 28);
        long j17 = (jDecode2410 & 4294967295L) + (jDecode16 * 258169998) + (jDecode2416 * 96434764) + (j * 227822194) + (j2 * 149865618) + (j3 * 550336261) + (j16 >>> 28);
        long j18 = (j4 & M28L) + (j17 >>> 28);
        long j19 = j17 & M28L;
        long j20 = (j9 & M28L) + (j18 >>> 28);
        long j21 = j18 & M28L;
        long j22 = (jDecode248 & 4294967295L) + (jDecode2416 * 43969588) + (j * 30366549) + (j2 * 163752818) + (j3 * 258169998) + (j5 * 96434764) + (j6 * 227822194) + (j8 * 149865618) + (j13 * 550336261) + (j15 >>> 28);
        long j23 = (jDecode329 & 4294967295L) + (jDecode16 * 43969588) + (jDecode2416 * 30366549) + (j * 163752818) + (j2 * 258169998) + (j3 * 96434764) + (j5 * 227822194) + (j6 * 149865618) + (j8 * 550336261) + (j22 >>> 28);
        long j24 = (j7 & M28L) + (j23 >>> 28);
        long j25 = (j16 & M28L) + (j24 >>> 28);
        long j26 = j24 & M28L;
        long j27 = ((j23 & M28L) << 2) + ((j22 & M28L) >>> 26) + 1;
        long j28 = (jDecode32 & 4294967295L) + (j27 * 78101261);
        long j29 = (jDecode24 & 4294967295L) + (j26 * 43969588) + (141809365 * j27) + (j28 >>> 28);
        long j30 = (jDecode322 & 4294967295L) + (j25 * 43969588) + (j26 * 30366549) + (175155932 * j27) + (j29 >>> 28);
        long j31 = (jDecode242 & 4294967295L) + (j19 * 43969588) + (j25 * 30366549) + (j26 * 163752818) + (64542499 * j27) + (j30 >>> 28);
        long j32 = (jDecode323 & 4294967295L) + (j21 * 43969588) + (j19 * 30366549) + (j25 * 163752818) + (j26 * 258169998) + (158326419 * j27) + (j31 >>> 28);
        long j33 = (jDecode243 & 4294967295L) + (j20 * 43969588) + (j21 * 30366549) + (j19 * 163752818) + (j25 * 258169998) + (j26 * 96434764) + (191173276 * j27) + (j32 >>> 28);
        long j34 = (jDecode324 & 4294967295L) + (j12 * 43969588) + (j20 * 30366549) + (j21 * 163752818) + (j19 * 258169998) + (j25 * 96434764) + (j26 * 227822194) + (104575268 * j27) + (j33 >>> 28);
        long j35 = (jDecode244 & 4294967295L) + (j14 * 43969588) + (j12 * 30366549) + (j20 * 163752818) + (j21 * 258169998) + (j19 * 96434764) + (j25 * 227822194) + (j26 * 149865618) + (j27 * 137584065) + (j34 >>> 28);
        long j36 = (jDecode325 & 4294967295L) + (j13 * 43969588) + (j14 * 30366549) + (j12 * 163752818) + (j20 * 258169998) + (j21 * 96434764) + (j19 * 227822194) + (j25 * 149865618) + (j26 * 550336261) + (j35 >>> 28);
        long j37 = (jDecode245 & 4294967295L) + (j8 * 43969588) + (j13 * 30366549) + (j14 * 163752818) + (j12 * 258169998) + (j20 * 96434764) + (j21 * 227822194) + (j19 * 149865618) + (j25 * 550336261) + (j36 >>> 28);
        long j38 = (jDecode326 & 4294967295L) + (j6 * 43969588) + (j8 * 30366549) + (j13 * 163752818) + (j14 * 258169998) + (j12 * 96434764) + (j20 * 227822194) + (j21 * 149865618) + (j19 * 550336261) + (j37 >>> 28);
        long j39 = (jDecode246 & 4294967295L) + (j5 * 43969588) + (j6 * 30366549) + (j8 * 163752818) + (j13 * 258169998) + (j14 * 96434764) + (j12 * 227822194) + (j20 * 149865618) + (j21 * 550336261) + (j38 >>> 28);
        long j40 = (jDecode327 & 4294967295L) + (j3 * 43969588) + (j5 * 30366549) + (j6 * 163752818) + (j8 * 258169998) + (j13 * 96434764) + (j14 * 227822194) + (j12 * 149865618) + (j20 * 550336261) + (j39 >>> 28);
        long j41 = (jDecode247 & 4294967295L) + (j2 * 43969588) + (j3 * 30366549) + (j5 * 163752818) + (j6 * 258169998) + (j8 * 96434764) + (j13 * 227822194) + (j14 * 149865618) + (j12 * 550336261) + (j40 >>> 28);
        long j42 = (j15 & M28L) + (j41 >>> 28);
        long j43 = (j22 & M26L) + (j42 >>> 28);
        long j44 = (j43 >>> 26) - 1;
        long j45 = (j28 & M28L) - (j44 & 78101261);
        long j46 = ((j29 & M28L) - (j44 & 141809365)) + (j45 >> 28);
        long j47 = ((j30 & M28L) - (j44 & 175155932)) + (j46 >> 28);
        long j48 = ((j31 & M28L) - (j44 & 64542499)) + (j47 >> 28);
        long j49 = ((j32 & M28L) - (j44 & 158326419)) + (j48 >> 28);
        long j50 = ((j33 & M28L) - (j44 & 191173276)) + (j49 >> 28);
        long j51 = ((j34 & M28L) - (j44 & 104575268)) + (j50 >> 28);
        long j52 = ((j35 & M28L) - (j44 & 137584065)) + (j51 >> 28);
        long j53 = (j36 & M28L) + (j52 >> 28);
        long j54 = (j37 & M28L) + (j53 >> 28);
        long j55 = (j38 & M28L) + (j54 >> 28);
        long j56 = (j39 & M28L) + (j55 >> 28);
        long j57 = (j40 & M28L) + (j56 >> 28);
        long j58 = (j41 & M28L) + (j57 >> 28);
        long j59 = (j42 & M28L) + (j58 >> 28);
        byte[] bArr2 = new byte[57];
        encode56((j45 & M28L) | ((j46 & M28L) << 28), bArr2, 0);
        encode56((j47 & M28L) | ((j48 & M28L) << 28), bArr2, 7);
        encode56(((j50 & M28L) << 28) | (j49 & M28L), bArr2, 14);
        encode56(((j52 & M28L) << 28) | (j51 & M28L), bArr2, 21);
        encode56(((j54 & M28L) << 28) | (j53 & M28L), bArr2, 28);
        encode56((j55 & M28L) | ((j56 & M28L) << 28), bArr2, 35);
        encode56((j57 & M28L) | ((j58 & M28L) << 28), bArr2, 42);
        encode56((j59 & M28L) | (((M26L & j43) + (j59 >> 28)) << 28), bArr2, 49);
        return bArr2;
    }

    private static void scalarMult(byte[] bArr, PointExt pointExt, PointExt pointExt2) {
        int[] iArr = new int[14];
        decodeScalar(bArr, 0, iArr);
        Nat.shiftDownBits(14, iArr, 2, 0);
        Nat.cadd(14, (~iArr[0]) & 1, iArr, L, iArr);
        Nat.shiftDownBit(14, iArr, 1);
        int[] iArrPointPrecompute = pointPrecompute(pointExt, 8);
        PointExt pointExt3 = new PointExt();
        pointLookup(iArr, 111, iArrPointPrecompute, pointExt2);
        for (int i = 110; i >= 0; i--) {
            for (int i2 = 0; i2 < 4; i2++) {
                pointDouble(pointExt2);
            }
            pointLookup(iArr, i, iArrPointPrecompute, pointExt3);
            pointAdd(pointExt3, pointExt2);
        }
        for (int i3 = 0; i3 < 2; i3++) {
            pointDouble(pointExt2);
        }
    }

    private static void scalarMultBase(byte[] bArr, PointExt pointExt) {
        precompute();
        int[] iArr = new int[15];
        decodeScalar(bArr, 0, iArr);
        iArr[14] = Nat.cadd(14, (~iArr[0]) & 1, iArr, L, iArr) + 4;
        Nat.shiftDownBit(15, iArr, 0);
        PointPrecomp pointPrecomp = new PointPrecomp();
        pointSetNeutral(pointExt);
        int i = 17;
        while (true) {
            int i2 = i;
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = 0;
                for (int i5 = 0; i5 < 5; i5++) {
                    i4 = (i4 & (~(1 << i5))) ^ ((iArr[i2 >>> 5] >>> (i2 & 31)) << i5);
                    i2 += 18;
                }
                int i6 = (i4 >>> 4) & 1;
                pointLookup(i3, ((-i6) ^ i4) & 15, pointPrecomp);
                X448Field.cnegate(i6, pointPrecomp.x);
                pointAddPrecomp(pointPrecomp, pointExt);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                pointDouble(pointExt);
            }
        }
    }

    private static void scalarMultBaseEncoded(byte[] bArr, byte[] bArr2, int i) {
        PointExt pointExt = new PointExt();
        scalarMultBase(bArr, pointExt);
        if (encodePoint(pointExt, bArr2, i) == 0) {
            throw new IllegalStateException();
        }
    }

    public static void scalarMultBaseXY(X448.Friend friend, byte[] bArr, int i, int[] iArr, int[] iArr2) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by X448");
        }
        byte[] bArr2 = new byte[57];
        pruneScalar(bArr, i, bArr2);
        PointExt pointExt = new PointExt();
        scalarMultBase(bArr2, pointExt);
        if (checkPoint(pointExt.x, pointExt.y, pointExt.z) == 0) {
            throw new IllegalStateException();
        }
        X448Field.copy(pointExt.x, 0, iArr, 0);
        X448Field.copy(pointExt.y, 0, iArr2, 0);
    }

    private static void scalarMultOrderVar(PointExt pointExt, PointExt pointExt2) {
        byte[] wnafVar = getWnafVar(L, 5);
        PointExt[] pointExtArrPointPrecomputeVar = pointPrecomputeVar(pointExt, 8);
        pointSetNeutral(pointExt2);
        int i = 446;
        while (true) {
            byte b = wnafVar[i];
            if (b != 0) {
                int i2 = b >> 31;
                pointAddVar(i2 != 0, pointExtArrPointPrecomputeVar[(b ^ i2) >>> 1], pointExt2);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                pointDouble(pointExt2);
            }
        }
    }

    private static void scalarMultStrausVar(int[] iArr, int[] iArr2, PointExt pointExt, PointExt pointExt2) {
        precompute();
        byte[] wnafVar = getWnafVar(iArr, 7);
        byte[] wnafVar2 = getWnafVar(iArr2, 5);
        PointExt[] pointExtArrPointPrecomputeVar = pointPrecomputeVar(pointExt, 8);
        pointSetNeutral(pointExt2);
        int i = 446;
        while (true) {
            byte b = wnafVar[i];
            if (b != 0) {
                int i2 = b >> 31;
                pointAddVar(i2 != 0, precompBaseTable[(b ^ i2) >>> 1], pointExt2);
            }
            byte b2 = wnafVar2[i];
            if (b2 != 0) {
                int i3 = b2 >> 31;
                pointAddVar(i3 != 0, pointExtArrPointPrecomputeVar[(b2 ^ i3) >>> 1], pointExt2);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                pointDouble(pointExt2);
            }
        }
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        implSign(bArr, i, bArr2, i2, bArr3, (byte) 0, bArr4, i3, i4, bArr5, i5);
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2, int i3, byte[] bArr4, int i4) {
        implSign(bArr, i, bArr2, (byte) 0, bArr3, i2, i3, bArr4, i4);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, Xof xof, byte[] bArr4, int i3) {
        byte[] bArr5 = new byte[64];
        if (64 != xof.doFinal(bArr5, 0, 64)) {
            throw new IllegalArgumentException("ph");
        }
        implSign(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr5, 0, 64, bArr4, i3);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, byte[] bArr5, int i4) {
        implSign(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, i3, 64, bArr5, i4);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, Xof xof, byte[] bArr3, int i2) {
        byte[] bArr4 = new byte[64];
        if (64 != xof.doFinal(bArr4, 0, 64)) {
            throw new IllegalArgumentException("ph");
        }
        implSign(bArr, i, bArr2, (byte) 1, bArr4, 0, 64, bArr3, i2);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2, byte[] bArr4, int i3) {
        implSign(bArr, i, bArr2, (byte) 1, bArr3, i2, 64, bArr4, i3);
    }

    public static boolean validatePublicKeyFull(byte[] bArr, int i) {
        PointExt pointExt = new PointExt();
        if (!decodePointVar(bArr, i, false, pointExt)) {
            return false;
        }
        X448Field.normalize(pointExt.x);
        X448Field.normalize(pointExt.y);
        X448Field.normalize(pointExt.z);
        if (isNeutralElementVar(pointExt.x, pointExt.y, pointExt.z)) {
            return false;
        }
        PointExt pointExt2 = new PointExt();
        scalarMultOrderVar(pointExt, pointExt2);
        X448Field.normalize(pointExt2.x);
        X448Field.normalize(pointExt2.y);
        X448Field.normalize(pointExt2.z);
        return isNeutralElementVar(pointExt2.x, pointExt2.y, pointExt2.z);
    }

    public static boolean validatePublicKeyPartial(byte[] bArr, int i) {
        return decodePointVar(bArr, i, false, new PointExt());
    }

    public static boolean verify(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4) {
        return implVerify(bArr, i, bArr2, i2, bArr3, (byte) 0, bArr4, i3, i4);
    }

    public static boolean verifyPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, Xof xof) {
        byte[] bArr4 = new byte[64];
        if (64 == xof.doFinal(bArr4, 0, 64)) {
            return implVerify(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, 0, 64);
        }
        throw new IllegalArgumentException("ph");
    }

    public static boolean verifyPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3) {
        return implVerify(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, i3, 64);
    }
}
