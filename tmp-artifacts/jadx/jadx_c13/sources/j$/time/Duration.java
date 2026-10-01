package j$.time;

import j$.time.format.DateTimeParseException;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.m;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    public static final Duration ZERO = new Duration(0, 0);
    public static final BigInteger c = BigInteger.valueOf(1000000000);
    private static final long serialVersionUID = 3078945930695997490L;
    public final long a;
    public final int b;

    public static Duration ofHours(long j) {
        return C(Math.multiplyExact(j, 3600), 0);
    }

    public static Duration ofMinutes(long j) {
        return C(Math.multiplyExact(j, 60), 0);
    }

    public static Duration ofSeconds(long j) {
        return C(j, 0);
    }

    public static Duration ofSeconds(long j, long j2) {
        return C(Math.addExact(j, Math.floorDiv(j2, 1000000000L)), (int) Math.floorMod(j2, 1000000000L));
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return C(j2, i * 1000000);
    }

    public static Duration ofNanos(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (i + 1000000000);
            j2--;
        }
        return C(j2, i);
    }

    public static Duration of(long j, TemporalUnit temporalUnit) {
        return ZERO.R(j, temporalUnit);
    }

    public static Duration parse(CharSequence charSequence) throws NumberFormatException {
        int i;
        int i2;
        Objects.requireNonNull(charSequence, "text");
        Matcher matcher = e.a.matcher(charSequence);
        if (matcher.matches()) {
            int iStart = matcher.start(3);
            int iEnd = matcher.end(3);
            if (iStart < 0 || iEnd != iStart + 1 || charSequence.charAt(iStart) != 'T') {
                int i3 = 1;
                int iStart2 = matcher.start(1);
                boolean z = iStart2 >= 0 && matcher.end(1) == iStart2 + 1 && charSequence.charAt(iStart2) == '-';
                int iStart3 = matcher.start(2);
                int iEnd2 = matcher.end(2);
                int iStart4 = matcher.start(4);
                int iEnd3 = matcher.end(4);
                int iStart5 = matcher.start(5);
                int iEnd4 = matcher.end(5);
                int iStart6 = matcher.start(6);
                int iEnd5 = matcher.end(6);
                int iStart7 = matcher.start(7);
                int iEnd6 = matcher.end(7);
                if (iStart3 >= 0 || iStart4 >= 0 || iStart5 >= 0 || iStart6 >= 0) {
                    long jO = O(charSequence, iStart3, iEnd2, 86400, "days");
                    long jO2 = O(charSequence, iStart4, iEnd3, 3600, "hours");
                    long jO3 = O(charSequence, iStart5, iEnd4, 60, "minutes");
                    boolean z2 = z;
                    long jO4 = O(charSequence, iStart6, iEnd5, 1, "seconds");
                    if (iStart6 >= 0 && charSequence.charAt(iStart6) == '-') {
                        i3 = -1;
                    }
                    if (iStart7 < 0 || iEnd6 < 0 || (i2 = iEnd6 - iStart7) == 0) {
                        i = 0;
                    } else {
                        try {
                            int i4 = Integer.parseInt(charSequence.subSequence(iStart7, iEnd6).toString(), 10);
                            for (i2 = iEnd6 - iStart7; i2 < 9; i2++) {
                                i4 *= 10;
                            }
                            i = i4 * i3;
                        } catch (ArithmeticException | NumberFormatException e) {
                            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: fraction", charSequence, 0).initCause(e));
                        }
                    }
                    try {
                        long jAddExact = Math.addExact(jO, Math.addExact(jO2, Math.addExact(jO3, jO4)));
                        return z2 ? ofSeconds(jAddExact, i).I(-1L) : ofSeconds(jAddExact, i);
                    } catch (ArithmeticException e2) {
                        throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: overflow", charSequence, 0).initCause(e2));
                    }
                }
            }
        }
        throw new DateTimeParseException("Text cannot be parsed to a Duration", charSequence, 0);
    }

    public static long O(CharSequence charSequence, int i, int i2, int i3, String str) {
        if (i < 0 || i2 < 0) {
            return 0L;
        }
        try {
            return Math.multiplyExact(Long.parseLong(charSequence.subSequence(i, i2).toString(), 10), i3);
        } catch (ArithmeticException | NumberFormatException e) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: ".concat(str), charSequence, 0).initCause(e));
        }
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return ofNanos(temporal.until(temporal2, ChronoUnit.NANOS));
        } catch (DateTimeException | ArithmeticException unused) {
            long jUntil = temporal.until(temporal2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                ChronoField chronoField = ChronoField.NANO_OF_SECOND;
                long j2 = temporal2.j(chronoField) - temporal.j(chronoField);
                if (jUntil > 0 && j2 < 0) {
                    jUntil++;
                } else if (jUntil < 0 && j2 > 0) {
                    jUntil--;
                }
                j = j2;
            } catch (DateTimeException unused2) {
            }
            return ofSeconds(jUntil, j);
        }
    }

    public static Duration C(long j, int i) {
        if ((i | j) == 0) {
            return ZERO;
        }
        return new Duration(j, i);
    }

    public Duration(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public boolean isZero() {
        return (this.a | ((long) this.b)) == 0;
    }

    public boolean isNegative() {
        return this.a < 0;
    }

    public long getSeconds() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    public final Duration R(long j, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporalUnit, "unit");
        if (temporalUnit == ChronoUnit.DAYS) {
            return Q(Math.multiplyExact(j, 86400), 0L);
        }
        if (temporalUnit.isDurationEstimated()) {
            throw new m("Unit must not have an estimated duration");
        }
        if (j == 0) {
            return this;
        }
        if (temporalUnit instanceof ChronoUnit) {
            int i = c.a[((ChronoUnit) temporalUnit).ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? Q(Math.multiplyExact(temporalUnit.getDuration().a, j), 0L) : Q(j, 0L) : Q(j / 1000, (j % 1000) * 1000000) : Q((j / 1000000000) * 1000, 0L).Q(0L, (j % 1000000000) * 1000) : Q(0L, j);
        }
        return Q(temporalUnit.getDuration().I(j).getSeconds(), 0L).Q(0L, r11.getNano());
    }

    public final Duration Q(long j, long j2) {
        return (j | j2) == 0 ? this : ofSeconds(Math.addExact(Math.addExact(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    public Duration minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? R(LongCompanionObject.MAX_VALUE, temporalUnit).R(1L, temporalUnit) : R(-j, temporalUnit);
    }

    public final Duration I(long j) {
        if (j == 0) {
            return ZERO;
        }
        if (j == 1) {
            return this;
        }
        BigInteger bigIntegerExact = BigDecimal.valueOf(this.a).add(BigDecimal.valueOf(this.b, 9)).multiply(BigDecimal.valueOf(j)).movePointRight(9).toBigIntegerExact();
        BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(c);
        if (bigIntegerArrDivideAndRemainder[0].bitLength() > 63) {
            throw new ArithmeticException("Exceeds capacity of Duration: " + bigIntegerExact);
        }
        return ofSeconds(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
    }

    public Duration abs() {
        return isNegative() ? I(-1L) : this;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal o(Temporal temporal) {
        long j = this.a;
        if (j != 0) {
            temporal = temporal.b(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        return i != 0 ? temporal.b(i, ChronoUnit.NANOS) : temporal;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal w(Instant instant) {
        long j = this.a;
        Temporal temporalC = instant;
        if (j != 0) {
            temporalC = instant.c(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        if (i == 0) {
            return temporalC;
        }
        return ((Instant) temporalC).c(i, ChronoUnit.NANOS);
    }

    public long toDays() {
        return this.a / 86400;
    }

    public long toHours() {
        return this.a / 3600;
    }

    public long toMinutes() {
        return this.a / 60;
    }

    public long toMillis() {
        long j = this.a;
        long j2 = this.b;
        if (j < 0) {
            j++;
            j2 -= 1000000000;
        }
        return Math.addExact(Math.multiplyExact(j, 1000), j2 / 1000000);
    }

    public long toNanos() {
        long j = this.a;
        long j2 = this.b;
        if (j < 0) {
            j++;
            j2 -= 1000000000;
        }
        return Math.addExact(Math.multiplyExact(j, 1000000000L), j2);
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int iCompare = Long.compare(this.a, duration.a);
        return iCompare != 0 ? iCompare : this.b - duration.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.a == duration.a && this.b == duration.b;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.a;
        if (j < 0 && this.b > 0) {
            j++;
        }
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (this.a < 0 && this.b > 0 && i2 == 0) {
            sb.append("-0");
        } else {
            sb.append(i2);
        }
        if (this.b > 0) {
            int length = sb.length();
            if (this.a < 0) {
                sb.append(2000000000 - this.b);
            } else {
                sb.append(this.b + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
