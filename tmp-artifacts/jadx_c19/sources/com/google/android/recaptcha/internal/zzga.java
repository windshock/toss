package com.google.android.recaptcha.internal;

import java.math.RoundingMode;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzga {
    public static int zzb(int i2, RoundingMode roundingMode) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        }
        switch (zzfz.zza[roundingMode.ordinal()]) {
            case 1:
                zzgc.zzb(((i2 + (-1)) & i2) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i2 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
                return (31 - iNumberOfLeadingZeros) + ((((-1257966797) >>> iNumberOfLeadingZeros) - i2) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i2);
    }

    public static int zza(int i2, int i3, RoundingMode roundingMode) {
        if (i3 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i4 = i2 / i3;
        int i5 = i2 - (i3 * i4);
        if (i5 == 0) {
            return i4;
        }
        int i6 = ((i2 ^ i3) >> 31) | 1;
        switch (zzfz.zza[roundingMode.ordinal()]) {
            case 1:
                zzgc.zzb(false);
                return i4;
            case 2:
                return i4;
            case 3:
                if (i6 >= 0) {
                    return i4;
                }
                break;
            case 4:
                break;
            case 5:
                if (i6 <= 0) {
                    return i4;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i5);
                int iAbs2 = iAbs - (Math.abs(i3) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if ((i4 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                            return i4;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i4;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i4 + i6;
    }
}
