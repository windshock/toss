package org.bouncycastle.math.ec.tools;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeSet;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class DiscoverEndomorphisms {
    private static final int radix = 16;
    private static final byte[] $$a = {4, ISO7816.INS_READ_BINARY, 45, 109};
    private static final int $$b = 188;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallbackWithResult = 1;
    private static long onWarmupCompleted = 7798559133331975163L;
    private static int IAuthTabCallback = -1776194565;
    private static char onExtraCallback = 4189;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, short s) {
        int i2;
        int i3 = 110 - i;
        byte[] bArr = $$a;
        int i4 = (b * 4) + 1;
        int i5 = s + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i3;
            i3 = i4;
            i2 = 0;
            i3 += i6;
            bArr2[i2] = (byte) i3;
            i2++;
            i5++;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i5];
            i3 += i6;
            bArr2[i2] = (byte) i3;
            i2++;
            i5++;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i2++;
            i5++;
            if (i2 == i4) {
            }
        }
    }

    private static boolean areRelativelyPrime(BigInteger bigInteger, BigInteger bigInteger2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        BigInteger bigIntegerGcd = bigInteger.gcd(bigInteger2);
        BigInteger bigInteger3 = ECConstants.ONE;
        if (i3 == 0) {
            return bigIntegerGcd.equals(bigInteger3);
        }
        bigIntegerGcd.equals(bigInteger3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static BigInteger[] calculateRange(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        BigInteger[] bigIntegerArrOrder = order(bigInteger.subtract(bigInteger2).divide(bigInteger3), bigInteger.add(bigInteger2).divide(bigInteger3));
        int i4 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return bigIntegerArrOrder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r3 = org.bouncycastle.math.ec.tools.DiscoverEndomorphisms.onExtraCallbackWithResult + 9;
        org.bouncycastle.math.ec.tools.DiscoverEndomorphisms.onNavigationEvent = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if ((r3 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r3 = null;
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if ((!isShorter(r3, r4)) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (isShorter(r3, r4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static BigInteger[] chooseShortest(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 55 / 0;
        }
    }

    private static void discoverEndomorphisms(String str) throws Throwable {
        int i = 2 % 2;
        X9ECParameters byName = CustomNamedCurves.getByName(str);
        if (byName == null) {
            int i2 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                ECNamedCurveTable.getByName(str);
                throw null;
            }
            byName = ECNamedCurveTable.getByName(str);
            if (byName == null) {
                System.err.println("Unknown curve: " + str);
                int i3 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        discoverEndomorphisms(byName, str);
    }

    public static void discoverEndomorphisms(X9ECParameters x9ECParameters) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (x9ECParameters == null) {
            throw new NullPointerException("x9");
        }
        discoverEndomorphisms(x9ECParameters, "<UNKNOWN>");
        int i4 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void discoverEndomorphisms(X9ECParameters x9ECParameters, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ECCurve curve = x9ECParameters.getCurve();
        if (!(!ECAlgorithms.isFpCurve(curve))) {
            int i4 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            BigInteger characteristic = curve.getField().getCharacteristic();
            if (curve.getB().isZero()) {
                int i6 = onExtraCallbackWithResult + 1;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    characteristic.mod(ECConstants.FOUR).equals(ECConstants.ONE);
                    throw null;
                }
                if (characteristic.mod(ECConstants.FOUR).equals(ECConstants.ONE)) {
                    System.out.println("Curve '" + str + "' has a 'GLV Type A' endomorphism with these parameters:");
                    printGLVTypeAParameters(x9ECParameters);
                }
            }
            if (curve.getA().isZero() && characteristic.mod(ECConstants.THREE).equals(ECConstants.ONE)) {
                System.out.println("Curve '" + str + "' has a 'GLV Type B' endomorphism with these parameters:");
                printGLVTypeBParameters(x9ECParameters);
            }
        }
        int i7 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
    }

    private static ArrayList enumToList(Enumeration enumeration) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        while (!(!enumeration.hasMoreElements())) {
            arrayList.add(enumeration.nextElement());
            int i2 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return arrayList;
    }

    private static BigInteger[] extEuclidBezout(BigInteger[] bigIntegerArr) {
        boolean z;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (bigIntegerArr[0].compareTo(bigIntegerArr[1]) < 0) {
            int i4 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            swap(bigIntegerArr);
        }
        BigInteger bigInteger = bigIntegerArr[0];
        BigInteger bigInteger2 = bigIntegerArr[1];
        BigInteger bigInteger3 = ECConstants.ONE;
        BigInteger bigInteger4 = ECConstants.ZERO;
        BigInteger bigInteger5 = bigInteger3;
        BigInteger bigInteger6 = bigInteger4;
        BigInteger bigInteger7 = bigInteger2;
        BigInteger bigInteger8 = bigInteger;
        while (bigInteger7.compareTo(ECConstants.ONE) > 0) {
            BigInteger[] bigIntegerArrDivideAndRemainder = bigInteger8.divideAndRemainder(bigInteger7);
            BigInteger bigInteger9 = bigIntegerArrDivideAndRemainder[0];
            BigInteger bigInteger10 = bigIntegerArrDivideAndRemainder[1];
            BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9.multiply(bigInteger4));
            BigInteger bigIntegerSubtract2 = bigInteger6.subtract(bigInteger9.multiply(bigInteger5));
            int i6 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            BigInteger bigInteger11 = bigInteger7;
            bigInteger7 = bigInteger10;
            bigInteger8 = bigInteger11;
            BigInteger bigInteger12 = bigInteger4;
            bigInteger4 = bigIntegerSubtract;
            bigInteger3 = bigInteger12;
            bigInteger6 = bigInteger5;
            bigInteger5 = bigIntegerSubtract2;
        }
        Object obj = null;
        if (bigInteger7.signum() <= 0) {
            int i8 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        BigInteger[] bigIntegerArr2 = {bigInteger4, bigInteger5};
        if (z) {
            int i9 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            swap(bigIntegerArr2);
            if (i10 != 0) {
                throw null;
            }
        }
        return bigIntegerArr2;
    }

    private static BigInteger[] extEuclidGLV(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3;
        BigInteger bigIntegerSubtract;
        int i = 2 % 2;
        BigInteger bigInteger4 = bigInteger;
        BigInteger bigInteger5 = bigInteger2;
        BigInteger bigInteger6 = ECConstants.ZERO;
        BigInteger bigInteger7 = ECConstants.ONE;
        while (true) {
            BigInteger[] bigIntegerArrDivideAndRemainder = bigInteger4.divideAndRemainder(bigInteger5);
            BigInteger bigInteger8 = bigIntegerArrDivideAndRemainder[0];
            bigInteger3 = bigIntegerArrDivideAndRemainder[1];
            bigIntegerSubtract = bigInteger6.subtract(bigInteger8.multiply(bigInteger7));
            if (isLessThanSqrt(bigInteger5, bigInteger)) {
                break;
            }
            int i2 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            bigInteger4 = bigInteger5;
            bigInteger6 = bigInteger7;
            bigInteger7 = bigIntegerSubtract;
            bigInteger5 = bigInteger3;
        }
        int i4 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return new BigInteger[]{bigInteger4, bigInteger6, bigInteger5, bigInteger7, bigInteger3, bigIntegerSubtract};
        }
        BigInteger[] bigIntegerArr = new BigInteger[109];
        bigIntegerArr[0] = bigInteger4;
        bigIntegerArr[1] = bigInteger6;
        bigIntegerArr[4] = bigInteger5;
        bigIntegerArr[2] = bigInteger7;
        bigIntegerArr[5] = bigInteger3;
        bigIntegerArr[4] = bigIntegerSubtract;
        return bigIntegerArr;
    }

    private static ECFieldElement[] findNonTrivialOrder3FieldElements(ECCurve eCCurve) {
        BigInteger bigIntegerModPow;
        ECFieldElement[] eCFieldElementArr;
        int i = 2 % 2;
        BigInteger characteristic = eCCurve.getField().getCharacteristic();
        BigInteger bigIntegerDivide = characteristic.divide(ECConstants.THREE);
        SecureRandom secureRandom = new SecureRandom();
        do {
            BigInteger bigInteger = ECConstants.TWO;
            bigIntegerModPow = BigIntegers.createRandomInRange(bigInteger, characteristic.subtract(bigInteger), secureRandom).modPow(bigIntegerDivide, characteristic);
        } while (bigIntegerModPow.equals(ECConstants.ONE));
        int i2 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ECFieldElement eCFieldElementFromBigInteger = eCCurve.fromBigInteger(bigIntegerModPow);
        if (i3 == 0) {
            ECFieldElement eCFieldElementSquare = eCFieldElementFromBigInteger.square();
            eCFieldElementArr = new ECFieldElement[4];
            eCFieldElementArr[0] = eCFieldElementFromBigInteger;
            eCFieldElementArr[0] = eCFieldElementSquare;
        } else {
            eCFieldElementArr = new ECFieldElement[]{eCFieldElementFromBigInteger, eCFieldElementFromBigInteger.square()};
        }
        int i4 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return eCFieldElementArr;
    }

    private static ECFieldElement[] findNonTrivialOrder4FieldElements(ECCurve eCCurve) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            eCCurve.fromBigInteger(ECConstants.ONE).negate().sqrt();
            throw null;
        }
        ECFieldElement eCFieldElementSqrt = eCCurve.fromBigInteger(ECConstants.ONE).negate().sqrt();
        if (eCFieldElementSqrt == null) {
            throw new IllegalStateException("Calculation of non-trivial order-4  field elements failed unexpectedly");
        }
        ECFieldElement[] eCFieldElementArr = {eCFieldElementSqrt, eCFieldElementSqrt.negate()};
        int i3 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 87 / 0;
        }
        return eCFieldElementArr;
    }

    private static BigInteger firstNonResidue(BigInteger bigInteger, BigInteger bigInteger2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2 != 0 ? 4 : 2;
        int i5 = i3 + 53;
        onExtraCallbackWithResult = i5 % 128;
        while (true) {
            int i6 = i5 % 2;
            if (i4 >= 1000) {
                throw new IllegalStateException();
            }
            int i7 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            BigInteger bigIntegerValueOf = BigInteger.valueOf(i4);
            if (!bigIntegerValueOf.modPow(bigInteger2, bigInteger).equals(ECConstants.ONE)) {
                return bigIntegerValueOf;
            }
            i4++;
            i5 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i5 % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if ((r5 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        r5 = 13 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        return new java.math.BigInteger[]{r1, r5};
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r1.compareTo(r5) > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r1.compareTo(r5) > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        r5 = org.bouncycastle.math.ec.tools.DiscoverEndomorphisms.onNavigationEvent + 119;
        org.bouncycastle.math.ec.tools.DiscoverEndomorphisms.onExtraCallbackWithResult = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static BigInteger[] intersect(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        BigInteger bigIntegerMax;
        BigInteger bigIntegerMin;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            bigIntegerMax = bigIntegerArr[0].max(bigIntegerArr2[0]);
            bigIntegerMin = bigIntegerArr[1].min(bigIntegerArr2[1]);
        } else {
            bigIntegerMax = bigIntegerArr[0].max(bigIntegerArr2[0]);
            bigIntegerMin = bigIntegerArr[1].min(bigIntegerArr2[1]);
        }
    }

    private static boolean isLessThanSqrt(BigInteger bigInteger, BigInteger bigInteger2) {
        int iBitLength;
        int iBitLength2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        if (i3 != 0) {
            iBitLength = bigIntegerAbs2.bitLength();
            iBitLength2 = bigIntegerAbs.bitLength();
            if ((iBitLength2 >>> 1) > iBitLength) {
                return false;
            }
        } else {
            iBitLength = bigIntegerAbs2.bitLength();
            iBitLength2 = bigIntegerAbs.bitLength() << 1;
            if (iBitLength2 - 1 > iBitLength) {
                return false;
            }
        }
        if (iBitLength2 >= iBitLength && bigIntegerAbs.multiply(bigIntegerAbs).compareTo(bigIntegerAbs2) >= 0) {
            return false;
        }
        int i4 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f A[PHI: r1 r4 r8 r9
      0x004f: PHI (r1v8 java.math.BigInteger) = (r1v5 java.math.BigInteger), (r1v10 java.math.BigInteger) binds: [B:8:0x004b, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r4v4 java.math.BigInteger) = (r4v1 java.math.BigInteger), (r4v6 java.math.BigInteger) binds: [B:8:0x004b, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r8v8 java.math.BigInteger) = (r8v2 java.math.BigInteger), (r8v10 java.math.BigInteger) binds: [B:8:0x004b, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r9v7 java.math.BigInteger) = (r9v2 java.math.BigInteger), (r9v9 java.math.BigInteger) binds: [B:8:0x004b, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d A[PHI: r1 r4 r8 r9
      0x004d: PHI (r1v6 java.math.BigInteger) = (r1v5 java.math.BigInteger), (r1v10 java.math.BigInteger) binds: [B:8:0x004b, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x004d: PHI (r4v2 java.math.BigInteger) = (r4v1 java.math.BigInteger), (r4v6 java.math.BigInteger) binds: [B:8:0x004b, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x004d: PHI (r8v3 java.math.BigInteger) = (r8v2 java.math.BigInteger), (r8v10 java.math.BigInteger) binds: [B:8:0x004b, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x004d: PHI (r9v3 java.math.BigInteger) = (r9v2 java.math.BigInteger), (r9v9 java.math.BigInteger) binds: [B:8:0x004b, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean isShorter(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        BigInteger bigIntegerAbs;
        BigInteger bigIntegerAbs2;
        BigInteger bigIntegerAbs3;
        BigInteger bigIntegerAbs4;
        boolean z;
        boolean z2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            bigIntegerAbs = bigIntegerArr[1].abs();
            bigIntegerAbs2 = bigIntegerArr[0].abs();
            bigIntegerAbs3 = bigIntegerArr2[0].abs();
            bigIntegerAbs4 = bigIntegerArr2[0].abs();
            z = bigIntegerAbs.compareTo(bigIntegerAbs3) < 0;
        } else {
            bigIntegerAbs = bigIntegerArr[0].abs();
            bigIntegerAbs2 = bigIntegerArr[1].abs();
            bigIntegerAbs3 = bigIntegerArr2[0].abs();
            bigIntegerAbs4 = bigIntegerArr2[1].abs();
            if (bigIntegerAbs.compareTo(bigIntegerAbs3) < 0) {
            }
        }
        if (bigIntegerAbs2.compareTo(bigIntegerAbs4) < 0) {
            int i3 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        return z == z2 ? z : bigIntegerAbs.multiply(bigIntegerAbs).add(bigIntegerAbs2.multiply(bigIntegerAbs2)).compareTo(bigIntegerAbs3.multiply(bigIntegerAbs3).add(bigIntegerAbs4.multiply(bigIntegerAbs4))) < 0;
    }

    private static boolean isVectorBoundedBySqrt(BigInteger[] bigIntegerArr, BigInteger bigInteger) {
        BigInteger bigIntegerAbs;
        BigInteger bigIntegerAbs2;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            bigIntegerAbs = bigIntegerArr[0].abs();
            bigIntegerAbs2 = bigIntegerArr[0].abs();
        } else {
            bigIntegerAbs = bigIntegerArr[0].abs();
            bigIntegerAbs2 = bigIntegerArr[1].abs();
        }
        boolean zIsLessThanSqrt = isLessThanSqrt(bigIntegerAbs.max(bigIntegerAbs2), bigInteger);
        int i3 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return zIsLessThanSqrt;
    }

    private static BigInteger isqrt(BigInteger bigInteger) {
        BigInteger bigIntegerShiftRight;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        BigInteger bigIntegerShiftRight2 = bigInteger.shiftRight(bigInteger.bitLength() / 2);
        while (true) {
            bigIntegerShiftRight = bigIntegerShiftRight2.add(bigInteger.divide(bigIntegerShiftRight2)).shiftRight(1);
            if (bigIntegerShiftRight.equals(bigIntegerShiftRight2)) {
                break;
            }
            bigIntegerShiftRight2 = bigIntegerShiftRight;
        }
        int i4 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return bigIntegerShiftRight;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void main(String[] strArr) throws Throwable {
        int i = 2 % 2;
        if (strArr.length > 0) {
            int i2 = 0;
            while (i2 < strArr.length) {
                discoverEndomorphisms(strArr[i2]);
                i2++;
                int i3 = onNavigationEvent + 57;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
            }
            return;
        }
        TreeSet treeSet = new TreeSet(enumToList(ECNamedCurveTable.getNames()));
        treeSet.addAll(enumToList(CustomNamedCurves.getNames()));
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int i5 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                discoverEndomorphisms((String) it.next());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            discoverEndomorphisms((String) it.next());
        }
    }

    private static BigInteger modSqrt(BigInteger bigInteger, BigInteger bigInteger2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0 ? !bigInteger2.testBit(0) : !bigInteger2.testBit(1)) {
            throw new IllegalStateException();
        }
        BigInteger bigInteger3 = ECConstants.ONE;
        BigInteger bigIntegerShiftRight = bigInteger2.subtract(bigInteger3).shiftRight(1);
        Object obj = null;
        if (!bigInteger.modPow(bigIntegerShiftRight, bigInteger2).equals(bigInteger3)) {
            int i3 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }
        BigInteger bigIntegerShiftRight2 = bigIntegerShiftRight;
        while (!bigIntegerShiftRight2.testBit(0)) {
            bigIntegerShiftRight2 = bigIntegerShiftRight2.shiftRight(1);
            if (!bigInteger.modPow(bigIntegerShiftRight2, bigInteger2).equals(ECConstants.ONE)) {
                int i4 = onExtraCallbackWithResult + 105;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return modSqrtComplex(bigInteger, bigIntegerShiftRight2, bigInteger2, bigIntegerShiftRight);
                }
                modSqrtComplex(bigInteger, bigIntegerShiftRight2, bigInteger2, bigIntegerShiftRight);
                obj.hashCode();
                throw null;
            }
        }
        return bigInteger.modPow(bigIntegerShiftRight2.add(ECConstants.ONE).shiftRight(1), bigInteger2);
    }

    private static BigInteger modSqrtComplex(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            firstNonResidue(bigInteger3, bigInteger4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BigInteger bigIntegerFirstNonResidue = firstNonResidue(bigInteger3, bigInteger4);
        BigInteger bigIntegerShiftRight = bigInteger4;
        while (!bigInteger2.testBit(0)) {
            bigInteger2 = bigInteger2.shiftRight(1);
            bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(1);
            if (!bigInteger.modPow(bigInteger2, bigInteger3).equals(bigIntegerFirstNonResidue.modPow(bigIntegerShiftRight, bigInteger3))) {
                int i3 = onExtraCallbackWithResult + 123;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                bigIntegerShiftRight = bigIntegerShiftRight.add(bigInteger4);
                int i5 = onExtraCallbackWithResult + 81;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        return bigInteger.modInverse(bigInteger3).modPow(bigInteger2.subtract(ECConstants.ONE).shiftRight(1), bigInteger3).multiply(bigIntegerFirstNonResidue.modPow(bigIntegerShiftRight.shiftRight(1), bigInteger3)).mod(bigInteger3);
    }

    private static BigInteger[] order(BigInteger bigInteger, BigInteger bigInteger2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (bigInteger.compareTo(bigInteger2) > 0) {
            return new BigInteger[]{bigInteger2, bigInteger};
        }
        int i4 = onNavigationEvent + 43;
        int i5 = i4 % 128;
        onExtraCallbackWithResult = i5;
        int i6 = i4 % 2;
        BigInteger[] bigIntegerArr = {bigInteger, bigInteger2};
        int i7 = i5 + 23;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return bigIntegerArr;
        }
        throw null;
    }

    private static void printGLVTypeAParameters(X9ECParameters x9ECParameters) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        BigInteger n = x9ECParameters.getN();
        BigInteger bigInteger = ECConstants.ONE;
        BigInteger[] bigIntegerArrSolveQuadraticEquation = solveQuadraticEquation(n, bigInteger, ECConstants.ZERO, bigInteger);
        ECFieldElement[] eCFieldElementArrFindNonTrivialOrder4FieldElements = findNonTrivialOrder4FieldElements(x9ECParameters.getCurve());
        printGLVTypeAParameters(x9ECParameters, bigIntegerArrSolveQuadraticEquation[0], eCFieldElementArrFindNonTrivialOrder4FieldElements);
        System.out.println("OR");
        printGLVTypeAParameters(x9ECParameters, bigIntegerArrSolveQuadraticEquation[1], eCFieldElementArrFindNonTrivialOrder4FieldElements);
        int i4 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void printGLVTypeAParameters(X9ECParameters x9ECParameters, BigInteger bigInteger, ECFieldElement[] eCFieldElementArr) throws Throwable {
        ECFieldElement eCFieldElement;
        int i = 2 % 2;
        ECPoint eCPointNormalize = x9ECParameters.getG().normalize();
        ECPoint eCPointNormalize2 = eCPointNormalize.multiply(bigInteger).normalize();
        if (!eCPointNormalize.getXCoord().negate().equals(eCPointNormalize2.getXCoord())) {
            throw new IllegalStateException("Derivation of GLV Type A parameters failed unexpectedly");
        }
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            eCFieldElement = eCFieldElementArr[0];
            if (!eCPointNormalize.getYCoord().multiply(eCFieldElement).equals(eCPointNormalize2.getYCoord())) {
                eCFieldElement = eCFieldElementArr[1];
                if (!eCPointNormalize.getYCoord().multiply(eCFieldElement).equals(eCPointNormalize2.getYCoord())) {
                    throw new IllegalStateException("Derivation of GLV Type A parameters failed unexpectedly");
                }
            }
        } else {
            eCFieldElement = eCFieldElementArr[0];
            if (!eCPointNormalize.getYCoord().multiply(eCFieldElement).equals(eCPointNormalize2.getYCoord())) {
            }
        }
        printProperty("Point map", "lambda * (x, y) = (-x, i * y)");
        printProperty("i", eCFieldElement.toBigInteger().toString(16));
        printProperty("lambda", bigInteger.toString(16));
        printScalarDecompositionParameters(x9ECParameters.getN(), bigInteger);
        int i3 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void printGLVTypeBParameters(X9ECParameters x9ECParameters) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        BigInteger n = x9ECParameters.getN();
        BigInteger bigInteger = ECConstants.ONE;
        BigInteger[] bigIntegerArrSolveQuadraticEquation = solveQuadraticEquation(n, bigInteger, bigInteger, bigInteger);
        ECFieldElement[] eCFieldElementArrFindNonTrivialOrder3FieldElements = findNonTrivialOrder3FieldElements(x9ECParameters.getCurve());
        printGLVTypeBParameters(x9ECParameters, bigIntegerArrSolveQuadraticEquation[0], eCFieldElementArrFindNonTrivialOrder3FieldElements);
        System.out.println("OR");
        printGLVTypeBParameters(x9ECParameters, bigIntegerArrSolveQuadraticEquation[1], eCFieldElementArrFindNonTrivialOrder3FieldElements);
        int i4 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v8 org.bouncycastle.math.ec.ECFieldElement, still in use, count: 2, list:
          (r3v8 org.bouncycastle.math.ec.ECFieldElement) from 0x006a: INVOKE 
          (wrap:org.bouncycastle.math.ec.ECFieldElement:0x0066: INVOKE (r1v5 org.bouncycastle.math.ec.ECPoint) VIRTUAL call: org.bouncycastle.math.ec.ECPoint.getXCoord():org.bouncycastle.math.ec.ECFieldElement A[WRAPPED])
          (r3v8 org.bouncycastle.math.ec.ECFieldElement)
         VIRTUAL call: org.bouncycastle.math.ec.ECFieldElement.multiply(org.bouncycastle.math.ec.ECFieldElement):org.bouncycastle.math.ec.ECFieldElement A[WRAPPED]
          (r3v8 org.bouncycastle.math.ec.ECFieldElement) from 0x007f: PHI (r3v4 org.bouncycastle.math.ec.ECFieldElement) = 
          (r3v3 org.bouncycastle.math.ec.ECFieldElement)
          (r3v8 org.bouncycastle.math.ec.ECFieldElement)
          (r3v9 org.bouncycastle.math.ec.ECFieldElement)
         binds: [B:7:0x0041, B:14:0x0076, B:11:0x0061] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private static void printGLVTypeBParameters(org.bouncycastle.asn1.x9.X9ECParameters r7, java.math.BigInteger r8, org.bouncycastle.math.ec.ECFieldElement[] r9) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = org.bouncycastle.math.ec.tools.DiscoverEndomorphisms.onExtraCallbackWithResult
            int r1 = r1 + 69
            int r2 = r1 % 128
            org.bouncycastle.math.ec.tools.DiscoverEndomorphisms.onNavigationEvent = r2
            int r1 = r1 % r0
            if (r1 != 0) goto Lb5
            org.bouncycastle.math.ec.ECPoint r1 = r7.getG()
            org.bouncycastle.math.ec.ECPoint r1 = r1.normalize()
            org.bouncycastle.math.ec.ECPoint r2 = r1.multiply(r8)
            org.bouncycastle.math.ec.ECPoint r2 = r2.normalize()
            org.bouncycastle.math.ec.ECFieldElement r3 = r1.getYCoord()
            org.bouncycastle.math.ec.ECFieldElement r4 = r2.getYCoord()
            boolean r3 = r3.equals(r4)
            java.lang.String r4 = "Derivation of GLV Type B parameters failed unexpectedly"
            if (r3 == 0) goto Laf
            r3 = 0
            r3 = r9[r3]
            org.bouncycastle.math.ec.ECFieldElement r5 = r1.getXCoord()
            org.bouncycastle.math.ec.ECFieldElement r5 = r5.multiply(r3)
            org.bouncycastle.math.ec.ECFieldElement r6 = r2.getXCoord()
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L7f
            int r3 = org.bouncycastle.math.ec.tools.DiscoverEndomorphisms.onNavigationEvent
            int r3 = r3 + 115
            int r5 = r3 % 128
            org.bouncycastle.math.ec.tools.DiscoverEndomorphisms.onExtraCallbackWithResult = r5
            int r3 = r3 % r0
            r5 = 1
            if (r3 != 0) goto L64
            r3 = r9[r5]
            org.bouncycastle.math.ec.ECFieldElement r9 = r1.getXCoord()
            org.bouncycastle.math.ec.ECFieldElement r9 = r9.multiply(r3)
            org.bouncycastle.math.ec.ECFieldElement r1 = r2.getXCoord()
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L79
            goto L7f
        L64:
            r3 = r9[r5]
            org.bouncycastle.math.ec.ECFieldElement r9 = r1.getXCoord()
            org.bouncycastle.math.ec.ECFieldElement r9 = r9.multiply(r3)
            org.bouncycastle.math.ec.ECFieldElement r1 = r2.getXCoord()
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L79
            goto L7f
        L79:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r4)
            throw r7
        L7f:
            java.lang.String r9 = "Point map"
            java.lang.String r1 = "lambda * (x, y) = (beta * x, y)"
            printProperty(r9, r1)
            java.math.BigInteger r9 = r3.toBigInteger()
            r1 = 16
            java.lang.String r9 = r9.toString(r1)
            java.lang.String r2 = "beta"
            printProperty(r2, r9)
            java.lang.String r9 = "lambda"
            java.lang.String r1 = r8.toString(r1)
            printProperty(r9, r1)
            java.math.BigInteger r7 = r7.getN()
            printScalarDecompositionParameters(r7, r8)
            int r7 = org.bouncycastle.math.ec.tools.DiscoverEndomorphisms.onExtraCallbackWithResult
            int r7 = r7 + 77
            int r8 = r7 % 128
            org.bouncycastle.math.ec.tools.DiscoverEndomorphisms.onNavigationEvent = r8
            int r7 = r7 % r0
            return
        Laf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r4)
            throw r7
        Lb5:
            org.bouncycastle.math.ec.ECPoint r7 = r7.getG()
            org.bouncycastle.math.ec.ECPoint r7 = r7.normalize()
            org.bouncycastle.math.ec.ECPoint r8 = r7.multiply(r8)
            org.bouncycastle.math.ec.ECPoint r8 = r8.normalize()
            org.bouncycastle.math.ec.ECFieldElement r7 = r7.getYCoord()
            org.bouncycastle.math.ec.ECFieldElement r8 = r8.getYCoord()
            r7.equals(r8)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.math.ec.tools.DiscoverEndomorphisms.printGLVTypeBParameters(org.bouncycastle.asn1.x9.X9ECParameters, java.math.BigInteger, org.bouncycastle.math.ec.ECFieldElement[]):void");
    }

    private static void printProperty(String str, Object obj) {
        int i = 2 % 2;
        StringBuffer stringBuffer = new StringBuffer("  ");
        stringBuffer.append(str);
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        while (stringBuffer.length() < 20) {
            int i4 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i4 % 128;
            stringBuffer.append(i4 % 2 != 0 ? 's' : ' ');
        }
        stringBuffer.append(": ");
        stringBuffer.append(obj.toString());
        System.out.println(stringBuffer.toString());
    }

    private static void printScalarDecompositionParameters(BigInteger bigInteger, BigInteger bigInteger2) throws Throwable {
        int i = 2 % 2;
        BigInteger[] bigIntegerArrExtEuclidGLV = extEuclidGLV(bigInteger, bigInteger2);
        BigInteger[] bigIntegerArr = {bigIntegerArrExtEuclidGLV[2], bigIntegerArrExtEuclidGLV[3].negate()};
        BigInteger[] bigIntegerArrChooseShortest = chooseShortest(new BigInteger[]{bigIntegerArrExtEuclidGLV[0], bigIntegerArrExtEuclidGLV[1].negate()}, new BigInteger[]{bigIntegerArrExtEuclidGLV[4], bigIntegerArrExtEuclidGLV[5].negate()});
        if (!isVectorBoundedBySqrt(bigIntegerArrChooseShortest, bigInteger) && areRelativelyPrime(bigIntegerArr[0], bigIntegerArr[1])) {
            int i2 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            BigInteger bigInteger3 = bigIntegerArr[0];
            BigInteger bigInteger4 = bigIntegerArr[1];
            BigInteger bigIntegerDivide = bigInteger3.add(bigInteger4.multiply(bigInteger2)).divide(bigInteger);
            BigInteger[] bigIntegerArrExtEuclidBezout = extEuclidBezout(new BigInteger[]{bigIntegerDivide.abs(), bigInteger4.abs()});
            if (bigIntegerArrExtEuclidBezout != null) {
                int i4 = onExtraCallbackWithResult + 13;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                BigInteger bigIntegerNegate = bigIntegerArrExtEuclidBezout[0];
                BigInteger bigIntegerNegate2 = bigIntegerArrExtEuclidBezout[1];
                if (bigIntegerDivide.signum() < 0) {
                    bigIntegerNegate = bigIntegerNegate.negate();
                }
                if (bigInteger4.signum() > 0) {
                    bigIntegerNegate2 = bigIntegerNegate2.negate();
                }
                BigInteger bigIntegerSubtract = bigIntegerDivide.multiply(bigIntegerNegate).subtract(bigInteger4.multiply(bigIntegerNegate2));
                BigInteger bigInteger5 = ECConstants.ONE;
                if (!bigIntegerSubtract.equals(bigInteger5)) {
                    throw new IllegalStateException();
                }
                int i6 = onExtraCallbackWithResult + 11;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                BigInteger bigIntegerSubtract2 = bigIntegerNegate2.multiply(bigInteger).subtract(bigIntegerNegate.multiply(bigInteger2));
                BigInteger bigIntegerNegate3 = bigIntegerNegate.negate();
                BigInteger bigIntegerNegate4 = bigIntegerSubtract2.negate();
                BigInteger bigIntegerAdd = isqrt(bigInteger.subtract(bigInteger5)).add(bigInteger5);
                BigInteger[] bigIntegerArrIntersect = intersect(calculateRange(bigIntegerNegate3, bigIntegerAdd, bigInteger4), calculateRange(bigIntegerNegate4, bigIntegerAdd, bigInteger3));
                if (bigIntegerArrIntersect != null) {
                    for (BigInteger bigIntegerAdd2 = bigIntegerArrIntersect[0]; bigIntegerAdd2.compareTo(bigIntegerArrIntersect[1]) <= 0; bigIntegerAdd2 = bigIntegerAdd2.add(ECConstants.ONE)) {
                        BigInteger[] bigIntegerArr2 = {bigIntegerSubtract2.add(bigIntegerAdd2.multiply(bigInteger3)), bigIntegerNegate.add(bigIntegerAdd2.multiply(bigInteger4))};
                        if (isShorter(bigIntegerArr2, bigIntegerArrChooseShortest)) {
                            bigIntegerArrChooseShortest = bigIntegerArr2;
                        }
                    }
                }
            }
        }
        BigInteger bigIntegerSubtract3 = bigIntegerArr[0].multiply(bigIntegerArrChooseShortest[1]).subtract(bigIntegerArr[1].multiply(bigIntegerArrChooseShortest[0]));
        int iBitLength = (bigInteger.bitLength() + 16) - (bigInteger.bitLength() & 7);
        BigInteger bigIntegerRoundQuotient = roundQuotient(bigIntegerArrChooseShortest[1].shiftLeft(iBitLength), bigIntegerSubtract3);
        BigInteger bigIntegerNegate5 = roundQuotient(bigIntegerArr[1].shiftLeft(iBitLength), bigIntegerSubtract3).negate();
        printProperty("v1", "{ " + bigIntegerArr[0].toString(16) + ", " + bigIntegerArr[1].toString(16) + " }");
        Object[] objArr = new Object[1];
        a((char) (8239 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0)), ViewConfiguration.getFadingEdgeLength() >> 16, new char[]{26080, 58377}, new char[]{0, 0, 0, 0}, new char[]{49049, 63372, 12224, 64288}, objArr);
        printProperty(((String) objArr[0]).intern(), "{ " + bigIntegerArrChooseShortest[0].toString(16) + ", " + bigIntegerArrChooseShortest[1].toString(16) + " }");
        printProperty("d", bigIntegerSubtract3.toString(16));
        printProperty("(OPT) g1", bigIntegerRoundQuotient.toString(16));
        printProperty("(OPT) g2", bigIntegerNegate5.toString(16));
        printProperty("(OPT) bits", Integer.toString(iBitLength));
    }

    private static BigInteger roundQuotient(BigInteger bigInteger, BigInteger bigInteger2) {
        boolean z;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            bigInteger.signum();
            bigInteger2.signum();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (bigInteger.signum() != bigInteger2.signum()) {
            int i3 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        BigInteger bigIntegerDivide = bigIntegerAbs.add(bigIntegerAbs2.shiftRight(1)).divide(bigIntegerAbs2);
        if (!z) {
            return bigIntegerDivide;
        }
        int i5 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return bigIntegerDivide.negate();
    }

    private static BigInteger[] solveQuadraticEquation(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        BigInteger bigIntegerModSqrt = modSqrt(bigInteger3.multiply(bigInteger3).subtract(bigInteger2.multiply(bigInteger4).shiftLeft(2)).mod(bigInteger), bigInteger);
        if (bigIntegerModSqrt == null) {
            throw new IllegalStateException("Solving quadratic equation failed unexpectedly");
        }
        int i4 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        BigInteger bigIntegerModInverse = bigInteger2.shiftLeft(1).modInverse(bigInteger);
        return new BigInteger[]{bigIntegerModSqrt.subtract(bigInteger3).multiply(bigIntegerModInverse).mod(bigInteger), bigIntegerModSqrt.negate().subtract(bigInteger3).multiply(bigIntegerModInverse).mod(bigInteger)};
    }

    private static void swap(BigInteger[] bigIntegerArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        BigInteger bigInteger = bigIntegerArr[0];
        bigIntegerArr[0] = bigIntegerArr[1];
        bigIntegerArr[1] = bigInteger;
        int i5 = i3 + 79;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 35;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), 42 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 1;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 49123), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1493, 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49, 22939 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45847 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0)), 30 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 12577 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 91;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }
}
