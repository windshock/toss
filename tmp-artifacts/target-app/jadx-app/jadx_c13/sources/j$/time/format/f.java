package j$.time.format;

import j$.time.temporal.TemporalField;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class f extends i {
    public final boolean g;

    @Override // j$.time.format.i
    public final boolean b(u uVar) {
        return uVar.c && this.b == this.c && !this.g;
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final int w(u uVar, CharSequence charSequence, int i) {
        boolean z = uVar.c;
        DateTimeFormatter dateTimeFormatter = uVar.a;
        int i2 = (z || b(uVar)) ? this.b : 0;
        int i3 = (uVar.c || b(uVar)) ? this.c : 9;
        int length = charSequence.length();
        if (i != length) {
            if (this.g) {
                if (charSequence.charAt(i) == dateTimeFormatter.c.c) {
                    i++;
                } else if (i2 > 0) {
                    return ~i;
                }
            }
            int i4 = i;
            int i5 = i2 + i4;
            if (i5 > length) {
                return ~i4;
            }
            int iMin = Math.min(i3 + i4, length);
            int i6 = 0;
            int i7 = i4;
            while (true) {
                if (i7 >= iMin) {
                    break;
                }
                int i8 = i7 + 1;
                int iCharAt = charSequence.charAt(i7) - dateTimeFormatter.c.a;
                if (iCharAt < 0 || iCharAt > 9) {
                    iCharAt = -1;
                }
                if (iCharAt >= 0) {
                    i6 = (i6 * 10) + iCharAt;
                    i7 = i8;
                } else if (i8 < i5) {
                    return ~i4;
                }
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i6).movePointLeft(i7 - i4);
            j$.time.temporal.n nVarRange = this.a.range();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(nVarRange.a);
            return uVar.f(this.a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(nVarRange.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i4, i7);
        }
        if (i2 > 0) {
            return ~i;
        }
        return i;
    }

    public f(TemporalField temporalField, int i, int i2, boolean z) {
        this(temporalField, i, i2, z, 0);
        Objects.requireNonNull(temporalField, "field");
        j$.time.temporal.n nVarRange = temporalField.range();
        if (nVarRange.a != nVarRange.b || nVarRange.c != nVarRange.d) {
            throw new IllegalArgumentException(j$.time.b.a("Field must have a fixed set of values: ", temporalField));
        }
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    public f(TemporalField temporalField, int i, int i2, boolean z, int i3) {
        super(temporalField, i, i2, SignStyle.NOT_NEGATIVE, i3);
        this.g = z;
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.e == -1) {
            return this;
        }
        return new f(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i) {
        return new f(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final boolean o(w wVar, StringBuilder sb) {
        TemporalField temporalField = this.a;
        Long lA = wVar.a(temporalField);
        if (lA == null) {
            return false;
        }
        DecimalStyle decimalStyle = wVar.b.c;
        long jLongValue = lA.longValue();
        j$.time.temporal.n nVarRange = temporalField.range();
        nVarRange.b(jLongValue, temporalField);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(nVarRange.a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(nVarRange.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (iScale != 0) {
            String strA = decimalStyle.a(bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2));
            if (z) {
                sb.append(decimalStyle.c);
            }
            sb.append(strA);
            return true;
        }
        if (i > 0) {
            if (z) {
                sb.append(decimalStyle.c);
            }
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(decimalStyle.a);
            }
        }
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : _UrlKt.FRAGMENT_ENCODE_SET) + ")";
    }
}
