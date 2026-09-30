package j$.time.format;

import j$.time.DateTimeException;
import j$.time.temporal.TemporalField;
import java.math.BigInteger;
import okhttp3.internal.connection.RealConnection;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class i implements e {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS};
    public final TemporalField a;
    public final int b;
    public final int c;
    public final SignStyle d;
    public final int e;

    public long a(w wVar, long j) {
        return j;
    }

    public i(TemporalField temporalField, int i, int i2, SignStyle signStyle) {
        this.a = temporalField;
        this.b = i;
        this.c = i2;
        this.d = signStyle;
        this.e = 0;
    }

    public i(TemporalField temporalField, int i, int i2, SignStyle signStyle, int i3) {
        this.a = temporalField;
        this.b = i;
        this.c = i2;
        this.d = signStyle;
        this.e = i3;
    }

    public i d() {
        if (this.e == -1) {
            return this;
        }
        return new i(this.a, this.b, this.c, this.d, -1);
    }

    public i e(int i) {
        return new i(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.e
    public boolean o(w wVar, StringBuilder sb) {
        TemporalField temporalField = this.a;
        Long lA = wVar.a(temporalField);
        if (lA == null) {
            return false;
        }
        long jA = a(wVar, lA.longValue());
        DecimalStyle decimalStyle = wVar.b.c;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new DateTimeException("Field " + temporalField + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i);
        }
        String strA = decimalStyle.a(string);
        int i2 = this.b;
        SignStyle signStyle = this.d;
        if (jA >= 0) {
            int i3 = b.a[signStyle.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jA >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = b.a[signStyle.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append(decimalStyle.b);
            } else if (i4 == 4) {
                throw new DateTimeException("Field " + temporalField + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - strA.length(); i5++) {
            sb.append(decimalStyle.a);
        }
        sb.append(strA);
        return true;
    }

    public boolean b(u uVar) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == SignStyle.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x015a, code lost:
    
        if (r0 <= r9) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0184  */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int w(u uVar, CharSequence charSequence, int i) {
        int i2;
        boolean z;
        boolean z2;
        BigInteger bigIntegerAdd;
        int i3;
        BigInteger bigIntegerDivide;
        long j;
        long j2;
        DateTimeFormatter dateTimeFormatter;
        int i4;
        int i5;
        DateTimeFormatter dateTimeFormatter2 = uVar.a;
        int length = charSequence.length();
        if (i == length) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        DecimalStyle decimalStyle = dateTimeFormatter2.c;
        decimalStyle.getClass();
        int i6 = this.c;
        SignStyle signStyle = this.d;
        int i7 = this.b;
        int i8 = 0;
        if (cCharAt == '+') {
            boolean z3 = uVar.c;
            boolean z4 = i7 == i6;
            int iOrdinal = signStyle.ordinal();
            if (iOrdinal == 0 ? z3 : !(iOrdinal == 1 || iOrdinal == 4 || (!z3 && !z4))) {
                return ~i;
            }
            i2 = i + 1;
            z = false;
            z2 = true;
        } else if (cCharAt == decimalStyle.b) {
            boolean z5 = uVar.c;
            boolean z6 = i7 == i6;
            int iOrdinal2 = signStyle.ordinal();
            if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 4 && (z5 || z6)) {
                return ~i;
            }
            i2 = i + 1;
            z2 = false;
            z = true;
        } else {
            if (signStyle == SignStyle.ALWAYS && uVar.c) {
                return ~i;
            }
            i2 = i;
            z = false;
            z2 = false;
        }
        int i9 = (uVar.c || b(uVar)) ? i7 : 1;
        int i10 = i2 + i9;
        if (i10 > length) {
            return ~i2;
        }
        if (!uVar.c && !b(uVar)) {
            i6 = 9;
        }
        int i11 = this.e;
        int iMax = Math.max(i11, 0) + i6;
        while (true) {
            bigIntegerAdd = null;
            if (i8 >= 2) {
                i3 = i2;
                bigIntegerDivide = null;
                j = 0;
                break;
            }
            int iMin = Math.min(i2 + iMax, length);
            i3 = i2;
            j2 = 0;
            while (true) {
                if (i3 >= iMin) {
                    dateTimeFormatter = dateTimeFormatter2;
                    i4 = length;
                    break;
                }
                int i12 = i3 + 1;
                i4 = length;
                int iCharAt = charSequence.charAt(i3) - dateTimeFormatter2.c.a;
                dateTimeFormatter = dateTimeFormatter2;
                if (iCharAt < 0 || iCharAt > 9) {
                    iCharAt = -1;
                }
                if (iCharAt >= 0) {
                    if (i12 - i2 > 18) {
                        if (bigIntegerAdd == null) {
                            bigIntegerAdd = BigInteger.valueOf(j2);
                        }
                        i5 = iMin;
                        bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(iCharAt));
                    } else {
                        i5 = iMin;
                        j2 = (j2 * 10) + iCharAt;
                    }
                    i3 = i12;
                    dateTimeFormatter2 = dateTimeFormatter;
                    length = i4;
                    iMin = i5;
                } else if (i3 < i10) {
                    return ~i2;
                }
            }
            if (i11 <= 0 || i8 != 0) {
                break;
            }
            i8++;
            iMax = Math.max(i9, (i3 - i2) - i11);
            dateTimeFormatter2 = dateTimeFormatter;
            length = i4;
        }
        bigIntegerDivide = bigIntegerAdd;
        j = j2;
        if (z) {
            if (bigIntegerDivide == null) {
                if (j != 0 || !uVar.c) {
                    j = -j;
                    if (bigIntegerDivide == null) {
                    }
                }
                return ~(i2 - 1);
            }
            if (!bigIntegerDivide.equals(BigInteger.ZERO) || !uVar.c) {
                bigIntegerDivide = bigIntegerDivide.negate();
                if (bigIntegerDivide == null) {
                    return c(uVar, j, i2, i3);
                }
                if (bigIntegerDivide.bitLength() > 63) {
                    bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                    i3--;
                }
                return c(uVar, bigIntegerDivide.longValue(), i2, i3);
            }
            return ~(i2 - 1);
        }
        if (signStyle == SignStyle.EXCEEDS_PAD && uVar.c) {
            int i13 = i3 - i2;
            if (!z2) {
                if (i13 > i7) {
                    return ~i2;
                }
            }
        }
        if (bigIntegerDivide == null) {
        }
    }

    public int c(u uVar, long j, int i, int i2) {
        return uVar.f(this.a, j, i, i2);
    }

    public String toString() {
        int i = this.c;
        TemporalField temporalField = this.a;
        SignStyle signStyle = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && signStyle == SignStyle.NORMAL) {
            return "Value(" + temporalField + ")";
        }
        if (i2 == i && signStyle == SignStyle.NOT_NEGATIVE) {
            return "Value(" + temporalField + "," + i2 + ")";
        }
        return "Value(" + temporalField + "," + i2 + "," + i + "," + signStyle + ")";
    }
}
