package org.bouncycastle.crypto.generators;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.SecureRandom;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410ValidationParameters;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class GOST3410ParametersGenerator {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 0;
    private static final BigInteger ONE;
    private static final BigInteger TWO;
    private static int asBinder = 1;
    private static char onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;
    private SecureRandom init_random;
    private int size;
    private int typeproc;

    static {
        onExtraCallbackWithResult();
        ONE = BigInteger.valueOf(1L);
        TWO = BigInteger.valueOf(2L);
        int i = onNavigationEvent + 111;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01a7, code lost:
    
        r10 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a9, code lost:
    
        if (r10 < 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b9, code lost:
    
        r21[0] = r8[0];
        r21[1] = r8[1];
        r1 = r2[0];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int procedure_A(int i, int i2, BigInteger[] bigIntegerArr, int i3) throws Throwable {
        int i4;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        int i5;
        int i6;
        int i7 = 2;
        int i8 = 2 % 2;
        int iNextInt = i;
        while (true) {
            if (iNextInt >= 0) {
                int i9 = asBinder + 23;
                IAuthTabCallbackStub = i9 % 128;
                i4 = 0;
                if (i9 % i7 == 0) {
                    if (iNextInt <= 65536) {
                        break;
                    }
                } else {
                    int i10 = 32 / 0;
                    if (iNextInt <= 65536) {
                        break;
                    }
                }
            }
            iNextInt = this.init_random.nextInt() / 32768;
            int i11 = asBinder + 23;
            IAuthTabCallbackStub = i11 % 128;
            int i12 = i11 % 2;
            i7 = 2;
        }
        int iNextInt2 = i2;
        while (true) {
            if (iNextInt2 >= 0 && iNextInt2 <= 65536 && iNextInt2 / 2 != 0) {
                break;
            }
            iNextInt2 = (this.init_random.nextInt() / 32768) + 1;
            i4 = i4;
            i7 = 2;
        }
        BigInteger bigInteger4 = new BigInteger(Integer.toString(iNextInt2));
        BigInteger bigInteger5 = new BigInteger("19381");
        BigInteger[] bigIntegerArr2 = {new BigInteger(Integer.toString(iNextInt))};
        int[] iArr = {i3};
        int i13 = i4;
        int i14 = i13;
        while (iArr[i13] >= 17) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, i4, iArr2, i4, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, i4, iArr, i4, length);
            i14 = i13 + 1;
            iArr[i14] = iArr[i13] / i7;
            i13 = i14;
        }
        BigInteger[] bigIntegerArr3 = new BigInteger[i14 + 1];
        int i15 = 16;
        bigIntegerArr3[i14] = new BigInteger("8003", 16);
        int i16 = i14 - 1;
        int i17 = i4;
        while (true) {
            if (i17 >= i14) {
                bigInteger = bigIntegerArr2[i4];
                break;
            }
            int i18 = iArr[i16] / i15;
            while (true) {
                int length2 = bigIntegerArr2.length;
                BigInteger[] bigIntegerArr4 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr2, i4, bigIntegerArr4, i4, bigIntegerArr2.length);
                bigIntegerArr2 = new BigInteger[i18 + 1];
                System.arraycopy(bigIntegerArr4, i4, bigIntegerArr2, i4, length2);
                int i19 = i4;
                while (i19 < i18) {
                    int i20 = IAuthTabCallbackStub + 25;
                    asBinder = i20 % 128;
                    int i21 = i20 % i7;
                    int i22 = i19 + 1;
                    bigIntegerArr2[i22] = bigIntegerArr2[i19].multiply(bigInteger5).add(bigInteger4).mod(TWO.pow(i15));
                    i19 = i22;
                }
                char[] cArr = new char[i7];
                // fill-array-data instruction
                cArr[0] = 31924;
                cArr[1] = 34511;
                Object[] objArr = new Object[1];
                a(cArr, (ViewConfiguration.getTapTimeout() >> i15) + 1, objArr);
                BigInteger bigInteger6 = new BigInteger(((String) objArr[i4]).intern());
                for (int i23 = i4; i23 < i18; i23++) {
                    bigInteger6 = bigInteger6.add(bigIntegerArr2[i23].multiply(TWO.pow(i23 << 4)));
                }
                bigIntegerArr2[i4] = bigIntegerArr2[i18];
                BigInteger bigInteger7 = TWO;
                int i24 = i16 + 1;
                BigInteger bigIntegerAdd = bigInteger7.pow(iArr[i16] - 1).divide(bigIntegerArr3[i24]).add(bigInteger7.pow(iArr[i16] - 1).multiply(bigInteger6).divide(bigIntegerArr3[i24].multiply(bigInteger7.pow(i18 << 4))));
                BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger7);
                BigInteger bigInteger8 = ONE;
                if (bigIntegerMod.compareTo(bigInteger8) == 0) {
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger8);
                }
                int i25 = 0;
                while (true) {
                    bigInteger2 = bigInteger4;
                    bigInteger3 = bigInteger5;
                    long j = i25;
                    i5 = i14;
                    BigInteger bigIntegerMultiply = bigIntegerArr3[i24].multiply(bigIntegerAdd.add(BigInteger.valueOf(j)));
                    BigInteger bigInteger9 = ONE;
                    BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger9);
                    bigIntegerArr3[i16] = bigIntegerAdd2;
                    BigInteger bigInteger10 = TWO;
                    i6 = i18;
                    if (bigIntegerAdd2.compareTo(bigInteger10.pow(iArr[i16])) != 1) {
                        int i26 = IAuthTabCallbackStub + 73;
                        asBinder = i26 % 128;
                        if (i26 % 2 == 0) {
                            bigInteger10.modPow(bigIntegerArr3[i24].multiply(bigIntegerAdd.add(BigInteger.valueOf(j))), bigIntegerArr3[i16]).compareTo(bigInteger9);
                            throw null;
                        }
                        if (bigInteger10.modPow(bigIntegerArr3[i24].multiply(bigIntegerAdd.add(BigInteger.valueOf(j))), bigIntegerArr3[i16]).compareTo(bigInteger9) == 0) {
                            int i27 = IAuthTabCallbackStub + 93;
                            asBinder = i27 % 128;
                            if (i27 % 2 == 0) {
                                bigInteger10.modPow(bigIntegerAdd.add(BigInteger.valueOf(j)), bigIntegerArr3[i16]).compareTo(bigInteger9);
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            if (bigInteger10.modPow(bigIntegerAdd.add(BigInteger.valueOf(j)), bigIntegerArr3[i16]).compareTo(bigInteger9) != 0) {
                                break;
                            }
                        }
                        i25 += 2;
                        i14 = i5;
                        bigInteger5 = bigInteger3;
                        bigInteger4 = bigInteger2;
                        i18 = i6;
                    }
                }
                i14 = i5;
                bigInteger5 = bigInteger3;
                bigInteger4 = bigInteger2;
                i18 = i6;
                i7 = 2;
                i4 = 0;
                i15 = 16;
            }
            i17++;
            i14 = i5;
            bigInteger5 = bigInteger3;
            bigInteger4 = bigInteger2;
            i7 = 2;
            i4 = 0;
            i15 = 16;
        }
        return bigInteger.intValue();
    }

    private long procedure_Aa(long j, long j2, BigInteger[] bigIntegerArr, int i) throws Throwable {
        int i2;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        long jNextInt = j;
        while (true) {
            i2 = 1;
            if (jNextInt >= 0 && jNextInt <= 4294967296L) {
                break;
            }
            jNextInt = this.init_random.nextInt() << 1;
            i4 = i4;
        }
        long jNextInt2 = j2;
        while (true) {
            if (jNextInt2 >= 0) {
                int i6 = asBinder + 119;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % i4;
                if (jNextInt2 <= 4294967296L && jNextInt2 / 2 != 0) {
                    break;
                }
            }
            jNextInt2 = (this.init_random.nextInt() << 1) + 1;
            i4 = i4;
            i2 = 1;
        }
        BigInteger bigInteger4 = new BigInteger(Long.toString(jNextInt2));
        BigInteger bigInteger5 = new BigInteger("97781173");
        BigInteger[] bigIntegerArr2 = {new BigInteger(Long.toString(jNextInt))};
        int[] iArr = {i};
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (iArr[i9] >= 33) {
            int i11 = asBinder + 3;
            IAuthTabCallbackStub = i11 % 128;
            int i12 = i11 % i4;
            int length = iArr.length + i2;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i10 = i9 + 1;
            iArr[i10] = iArr[i9] / i4;
            i9 = i10;
        }
        BigInteger[] bigIntegerArr3 = new BigInteger[i10 + 1];
        bigIntegerArr3[i10] = new BigInteger("8000000B", 16);
        int i13 = i10 - 1;
        int i14 = 0;
        while (i14 < i10) {
            int i15 = IAuthTabCallbackStub + 115;
            asBinder = i15 % 128;
            int i16 = 32;
            int i17 = i15 % i4 == 0 ? iArr[i13] + 57 : iArr[i13] / 32;
            while (true) {
                int length2 = bigIntegerArr2.length;
                BigInteger[] bigIntegerArr4 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr2, i8, bigIntegerArr4, i8, bigIntegerArr2.length);
                bigIntegerArr2 = new BigInteger[i17 + 1];
                System.arraycopy(bigIntegerArr4, i8, bigIntegerArr2, i8, length2);
                int i18 = i8;
                while (i18 < i17) {
                    int i19 = asBinder + 5;
                    IAuthTabCallbackStub = i19 % 128;
                    int i20 = i19 % i4;
                    int i21 = i18 + 1;
                    bigIntegerArr2[i21] = bigIntegerArr2[i18].multiply(bigInteger5).add(bigInteger4).mod(TWO.pow(i16));
                    i18 = i21;
                }
                char[] cArr = new char[i4];
                // fill-array-data instruction
                cArr[0] = 31924;
                cArr[1] = 34511;
                Object[] objArr = new Object[1];
                a(cArr, 1 - KeyEvent.normalizeMetaState(i8), objArr);
                BigInteger bigInteger6 = new BigInteger(((String) objArr[i8]).intern());
                for (int i22 = i8; i22 < i17; i22++) {
                    bigInteger6 = bigInteger6.add(bigIntegerArr2[i22].multiply(TWO.pow(i22 << 5)));
                }
                bigIntegerArr2[i8] = bigIntegerArr2[i17];
                BigInteger bigInteger7 = TWO;
                int i23 = i13 + 1;
                BigInteger bigIntegerAdd = bigInteger7.pow(iArr[i13] - 1).divide(bigIntegerArr3[i23]).add(bigInteger7.pow(iArr[i13] - 1).multiply(bigInteger6).divide(bigIntegerArr3[i23].multiply(bigInteger7.pow(i17 << 5))));
                BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger7);
                BigInteger bigInteger8 = ONE;
                if (bigIntegerMod.compareTo(bigInteger8) == 0) {
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger8);
                }
                int i24 = 0;
                while (true) {
                    long j3 = i24;
                    bigInteger2 = bigInteger4;
                    BigInteger bigIntegerMultiply = bigIntegerArr3[i23].multiply(bigIntegerAdd.add(BigInteger.valueOf(j3)));
                    BigInteger bigInteger9 = ONE;
                    BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger9);
                    bigIntegerArr3[i13] = bigIntegerAdd2;
                    bigInteger3 = bigInteger5;
                    BigInteger bigInteger10 = TWO;
                    i3 = i10;
                    if (bigIntegerAdd2.compareTo(bigInteger10.pow(iArr[i13])) != 1) {
                        if (bigInteger10.modPow(bigIntegerArr3[i23].multiply(bigIntegerAdd.add(BigInteger.valueOf(j3))), bigIntegerArr3[i13]).compareTo(bigInteger9) == 0 && bigInteger10.modPow(bigIntegerAdd.add(BigInteger.valueOf(j3)), bigIntegerArr3[i13]).compareTo(bigInteger9) != 0) {
                            break;
                        }
                        i24 += 2;
                        bigInteger4 = bigInteger2;
                        i10 = i3;
                        bigInteger5 = bigInteger3;
                    }
                }
                bigInteger4 = bigInteger2;
                bigInteger5 = bigInteger3;
                i4 = 2;
                i8 = 0;
                i16 = 32;
                i10 = i3;
            }
            int i25 = asBinder + 91;
            int i26 = i25 % 128;
            IAuthTabCallbackStub = i26;
            if (i25 % 2 == 0) {
                i13--;
                if (i13 < 0) {
                    bigIntegerArr[0] = bigIntegerArr3[0];
                    bigIntegerArr[1] = bigIntegerArr3[1];
                    bigInteger = bigIntegerArr2[0];
                    break;
                }
                int i27 = i26 + 125;
                asBinder = i27 % 128;
                int i28 = i27 % 2;
                i14++;
                bigInteger4 = bigInteger2;
                i10 = i3;
                i4 = 2;
                bigInteger5 = bigInteger3;
                i8 = 0;
            } else {
                i13 += 73;
                if (i13 < 0) {
                    bigIntegerArr[0] = bigIntegerArr3[0];
                    bigIntegerArr[1] = bigIntegerArr3[1];
                    bigInteger = bigIntegerArr2[0];
                    break;
                }
                int i272 = i26 + 125;
                asBinder = i272 % 128;
                int i282 = i272 % 2;
                i14++;
                bigInteger4 = bigInteger2;
                i10 = i3;
                i4 = 2;
                bigInteger5 = bigInteger3;
                i8 = 0;
            }
        }
        bigInteger = bigIntegerArr2[i8];
        return bigInteger.longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void procedure_B(int i, int i2, BigInteger[] bigIntegerArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        int iNextInt = i;
        while (true) {
            if (iNextInt >= 0 && iNextInt <= 65536) {
                break;
            }
            iNextInt = this.init_random.nextInt() / 32768;
            i3 = i3;
        }
        int iNextInt2 = i2;
        while (true) {
            if (iNextInt2 >= 0 && iNextInt2 <= 65536 && iNextInt2 / 2 != 0) {
                break;
            }
            iNextInt2 = (this.init_random.nextInt() / 32768) + 1;
            i3 = i3;
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[i3];
        BigInteger bigInteger = new BigInteger(Integer.toString(iNextInt2));
        BigInteger bigInteger2 = new BigInteger("19381");
        int iProcedure_A = procedure_A(iNextInt, iNextInt2, bigIntegerArr2, 256);
        int i5 = 0;
        BigInteger bigInteger3 = bigIntegerArr2[0];
        int iProcedure_A2 = procedure_A(iProcedure_A, iNextInt2, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[65];
        bigIntegerArr3[0] = new BigInteger(Integer.toString(iProcedure_A2));
        while (true) {
            int i6 = i5;
            while (i6 < 64) {
                int i7 = i6 + 1;
                bigIntegerArr3[i7] = bigIntegerArr3[i6].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(16));
                i6 = i7;
            }
            char[] cArr = new char[i3];
            // fill-array-data instruction
            cArr[0] = 31924;
            cArr[1] = 34511;
            Object[] objArr = new Object[1];
            a(cArr, (-16777215) - Color.rgb(i5, i5, i5), objArr);
            BigInteger bigInteger5 = new BigInteger(((String) objArr[i5]).intern());
            for (int i8 = i5; i8 < 64; i8++) {
                int i9 = IAuthTabCallbackStub + 31;
                asBinder = i9 % 128;
                int i10 = i9 % i3;
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i8].multiply(TWO.pow(i8 << 4)));
            }
            bigIntegerArr3[i5] = bigIntegerArr3[64];
            BigInteger bigInteger6 = TWO;
            int i11 = 1024;
            BigInteger bigIntegerAdd = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (bigIntegerMod.compareTo(bigInteger7) == 0) {
                bigIntegerAdd = bigIntegerAdd.add(bigInteger7);
            }
            int i12 = IAuthTabCallbackStub + 17;
            asBinder = i12 % 128;
            if (i12 % i3 == 0) {
                int i13 = 4 / 3;
            }
            int i14 = i5;
            while (true) {
                long j = i14;
                BigInteger bigIntegerMultiply = bigInteger3.multiply(bigInteger4).multiply(bigIntegerAdd.add(BigInteger.valueOf(j)));
                BigInteger bigInteger8 = ONE;
                BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger8);
                BigInteger bigInteger9 = TWO;
                if (bigIntegerAdd2.compareTo(bigInteger9.pow(i11)) != 1) {
                    int i15 = IAuthTabCallbackStub + 79;
                    asBinder = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 95 / 0;
                        if (bigInteger9.modPow(bigInteger3.multiply(bigInteger4).multiply(bigIntegerAdd.add(BigInteger.valueOf(j))), bigIntegerAdd2).compareTo(bigInteger8) != 0) {
                            continue;
                        } else if (bigInteger9.modPow(bigInteger3.multiply(bigIntegerAdd.add(BigInteger.valueOf(j))), bigIntegerAdd2).compareTo(bigInteger8) != 0) {
                            int i17 = IAuthTabCallbackStub + 7;
                            asBinder = i17 % 128;
                            int i18 = i17 % 2;
                            bigIntegerArr[0] = bigIntegerAdd2;
                            bigIntegerArr[1] = bigInteger3;
                            return;
                        }
                    } else if (bigInteger9.modPow(bigInteger3.multiply(bigInteger4).multiply(bigIntegerAdd.add(BigInteger.valueOf(j))), bigIntegerAdd2).compareTo(bigInteger8) != 0) {
                        continue;
                    }
                    i14 += 2;
                    i11 = 1024;
                }
            }
            i3 = 2;
            i5 = 0;
        }
    }

    private void procedure_Bb(long j, long j2, BigInteger[] bigIntegerArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        long jNextInt = j;
        while (true) {
            if (jNextInt >= 0) {
                int i3 = asBinder + 61;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % i;
                if (jNextInt <= 4294967296L) {
                    break;
                }
            }
            int i5 = asBinder + 13;
            int i6 = i5 % 128;
            IAuthTabCallbackStub = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 105;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            i = 2;
            jNextInt = this.init_random.nextInt() << 1;
        }
        long jNextInt2 = j2;
        while (true) {
            if (jNextInt2 >= 0 && jNextInt2 <= 4294967296L && jNextInt2 / 2 != 0) {
                break;
            }
            jNextInt2 = (this.init_random.nextInt() << 1) + 1;
            i = 2;
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[i];
        BigInteger bigInteger = new BigInteger(Long.toString(jNextInt2));
        BigInteger bigInteger2 = new BigInteger("97781173");
        long j3 = jNextInt2;
        long jProcedure_Aa = procedure_Aa(jNextInt, j3, bigIntegerArr2, 256);
        int i10 = 0;
        BigInteger bigInteger3 = bigIntegerArr2[0];
        long jProcedure_Aa2 = procedure_Aa(jProcedure_Aa, j3, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[33];
        bigIntegerArr3[0] = new BigInteger(Long.toString(jProcedure_Aa2));
        while (true) {
            int i11 = i10;
            while (i11 < 32) {
                int i12 = i11 + 1;
                bigIntegerArr3[i12] = bigIntegerArr3[i11].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(32));
                int i13 = asBinder + 105;
                IAuthTabCallbackStub = i13 % 128;
                int i14 = i13 % i;
                i11 = i12;
            }
            char[] cArr = new char[i];
            // fill-array-data instruction
            cArr[0] = 31924;
            cArr[1] = 34511;
            Object[] objArr = new Object[1];
            a(cArr, -Process.getGidForName(BuildConfig.FLAVOR), objArr);
            BigInteger bigInteger5 = new BigInteger(((String) objArr[i10]).intern());
            for (int i15 = i10; i15 < 32; i15++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i15].multiply(TWO.pow(i15 << 5)));
            }
            bigIntegerArr3[i10] = bigIntegerArr3[32];
            BigInteger bigInteger6 = TWO;
            int i16 = 1024;
            BigInteger bigIntegerAdd = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (bigIntegerMod.compareTo(bigInteger7) == 0) {
                int i17 = IAuthTabCallbackStub + 125;
                asBinder = i17 % 128;
                if (i17 % i == 0) {
                    bigIntegerAdd.add(bigInteger7);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                bigIntegerAdd = bigIntegerAdd.add(bigInteger7);
            }
            int i18 = i10;
            while (true) {
                long j4 = i18;
                BigInteger bigIntegerMultiply = bigInteger3.multiply(bigInteger4).multiply(bigIntegerAdd.add(BigInteger.valueOf(j4)));
                BigInteger bigInteger8 = ONE;
                BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger8);
                BigInteger bigInteger9 = TWO;
                if (bigIntegerAdd2.compareTo(bigInteger9.pow(i16)) != 1) {
                    if (bigInteger9.modPow(bigInteger3.multiply(bigInteger4).multiply(bigIntegerAdd.add(BigInteger.valueOf(j4))), bigIntegerAdd2).compareTo(bigInteger8) == 0 && bigInteger9.modPow(bigInteger3.multiply(bigIntegerAdd.add(BigInteger.valueOf(j4))), bigIntegerAdd2).compareTo(bigInteger8) != 0) {
                        int i19 = IAuthTabCallbackStub + 75;
                        asBinder = i19 % 128;
                        int i20 = i19 % 2;
                        bigIntegerArr[0] = bigIntegerAdd2;
                        bigIntegerArr[1] = bigInteger3;
                        return;
                    }
                    i18 += 2;
                    i16 = 1024;
                }
            }
            i = 2;
            i10 = 0;
        }
    }

    private BigInteger procedure_C(BigInteger bigInteger, BigInteger bigInteger2) {
        int i = 2 % 2;
        BigInteger bigIntegerSubtract = bigInteger.subtract(ONE);
        BigInteger bigIntegerDivide = bigIntegerSubtract.divide(bigInteger2);
        int iBitLength = bigInteger.bitLength();
        while (true) {
            BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(iBitLength, this.init_random);
            BigInteger bigInteger3 = ONE;
            if (bigIntegerCreateRandomBigInteger.compareTo(bigInteger3) > 0 && bigIntegerCreateRandomBigInteger.compareTo(bigIntegerSubtract) < 0) {
                int i2 = IAuthTabCallbackStub + 69;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                BigInteger bigIntegerModPow = bigIntegerCreateRandomBigInteger.modPow(bigIntegerDivide, bigInteger);
                if (bigIntegerModPow.compareTo(bigInteger3) != 0) {
                    int i4 = IAuthTabCallbackStub + 13;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                    return bigIntegerModPow;
                }
            }
        }
    }

    public GOST3410Parameters generateParameters() throws Throwable {
        int i = 2 % 2;
        BigInteger[] bigIntegerArr = new BigInteger[2];
        if (this.typeproc == 1) {
            int iNextInt = this.init_random.nextInt();
            int iNextInt2 = this.init_random.nextInt();
            int i2 = this.size;
            if (i2 != 512) {
                int i3 = IAuthTabCallbackStub + 65;
                asBinder = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1024 : i2 != 10912) {
                    throw new IllegalArgumentException("Ooops! key size 512 or 1024 bit.");
                }
                procedure_B(iNextInt, iNextInt2, bigIntegerArr);
            } else {
                procedure_A(iNextInt, iNextInt2, bigIntegerArr, 512);
            }
            BigInteger bigInteger = bigIntegerArr[0];
            BigInteger bigInteger2 = bigIntegerArr[1];
            return new GOST3410Parameters(bigInteger, bigInteger2, procedure_C(bigInteger, bigInteger2), new GOST3410ValidationParameters(iNextInt, iNextInt2));
        }
        long jNextLong = this.init_random.nextLong();
        long jNextLong2 = this.init_random.nextLong();
        int i4 = this.size;
        if (i4 == 512) {
            procedure_Aa(jNextLong, jNextLong2, bigIntegerArr, 512);
        } else {
            if (i4 != 1024) {
                throw new IllegalStateException("Ooops! key size 512 or 1024 bit.");
            }
            procedure_Bb(jNextLong, jNextLong2, bigIntegerArr);
            int i5 = IAuthTabCallbackStub + 7;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
        BigInteger bigInteger3 = bigIntegerArr[0];
        BigInteger bigInteger4 = bigIntegerArr[1];
        GOST3410Parameters gOST3410Parameters = new GOST3410Parameters(bigInteger3, bigInteger4, procedure_C(bigInteger3, bigInteger4), new GOST3410ValidationParameters(jNextLong, jNextLong2));
        int i7 = asBinder + 115;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 96 / 0;
        }
        return gOST3410Parameters;
    }

    public void init(int i, int i2, SecureRandom secureRandom) {
        int i3 = 2 % 2;
        int i4 = asBinder;
        int i5 = i4 + 101;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        this.size = i;
        this.typeproc = i2;
        this.init_random = secureRandom;
        int i7 = i4 + 73;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 9;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 125;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int iMyPid = 10 - (Process.myPid() >> 22);
                        int i12 = 12435 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(jumpTapTimeout, iMyPid, i12, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i13 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 9 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i13 + 1;
                    cArr3 = cArr4;
                    i3 = 0;
                    c = 1;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 16015), 14 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = (char) 32848;
        onExtraCallback = (char) 50297;
        IAuthTabCallback = (char) 49650;
        onExtraCallbackWithResult = (char) 9122;
    }
}
