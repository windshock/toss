package j$.time;

import j$.time.chrono.Chronology;
import j$.time.chrono.p;
import j$.time.format.DateTimeParseException;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.l;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Period implements TemporalAmount, Serializable {
    public static final Period d = new Period(0, 0, 0);
    public static final Pattern e = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    private static final long serialVersionUID = -3587258372562876L;
    public final int a;
    public final int b;
    public final int c;

    static {
        d.c(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public static Period of(int i, int i2, int i3) {
        return a(i, i2, i3);
    }

    public static Period parse(CharSequence charSequence) {
        Objects.requireNonNull(charSequence, "text");
        Matcher matcher = e.matcher(charSequence);
        if (matcher.matches()) {
            int i = 1;
            int iStart = matcher.start(1);
            int iEnd = matcher.end(1);
            if (iStart >= 0 && iEnd == iStart + 1 && charSequence.charAt(iStart) == '-') {
                i = -1;
            }
            int iStart2 = matcher.start(2);
            int iEnd2 = matcher.end(2);
            int iStart3 = matcher.start(3);
            int iEnd3 = matcher.end(3);
            int iStart4 = matcher.start(4);
            int iEnd4 = matcher.end(4);
            int iStart5 = matcher.start(5);
            int iEnd5 = matcher.end(5);
            if (iStart2 >= 0 || iStart3 >= 0 || iStart4 >= 0 || iStart5 >= 0) {
                try {
                    return a(b(charSequence, iStart2, iEnd2, i), b(charSequence, iStart3, iEnd3, i), Math.addExact(b(charSequence, iStart5, iEnd5, i), Math.multiplyExact(b(charSequence, iStart4, iEnd4, i), 7)));
                } catch (NumberFormatException e2) {
                    throw new DateTimeParseException("Text cannot be parsed to a Period", charSequence, e2);
                }
            }
        }
        throw new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0);
    }

    public static int b(CharSequence charSequence, int i, int i2, int i3) {
        if (i < 0 || i2 < 0) {
            return 0;
        }
        if (charSequence.charAt(i) == '+') {
            i++;
        }
        try {
            return Math.multiplyExact(Integer.parseInt(charSequence.subSequence(i, i2).toString(), 10), i3);
        } catch (ArithmeticException e2) {
            throw new DateTimeParseException("Text cannot be parsed to a Period", charSequence, e2);
        }
    }

    public static Period a(int i, int i2, int i3) {
        if ((i | i2 | i3) == 0) {
            return d;
        }
        return new Period(i, i2, i3);
    }

    public Period(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public int getYears() {
        return this.a;
    }

    public int getMonths() {
        return this.b;
    }

    public int getDays() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal o(Temporal temporal) {
        c(temporal);
        int i = this.b;
        if (i != 0) {
            long j = (this.a * 12) + i;
            if (j != 0) {
                temporal = temporal.b(j, ChronoUnit.MONTHS);
            }
        } else {
            int i2 = this.a;
            if (i2 != 0) {
                temporal = temporal.b(i2, ChronoUnit.YEARS);
            }
        }
        int i3 = this.c;
        return i3 != 0 ? temporal.b(i3, ChronoUnit.DAYS) : temporal;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal w(Instant instant) {
        Temporal temporalC;
        c(instant);
        int i = this.b;
        if (i != 0) {
            long j = (this.a * 12) + i;
            temporalC = instant;
            if (j != 0) {
                temporalC = instant.c(j, ChronoUnit.MONTHS);
            }
        } else {
            int i2 = this.a;
            temporalC = instant;
            if (i2 != 0) {
                temporalC = instant.c(i2, ChronoUnit.YEARS);
            }
        }
        int i3 = this.c;
        if (i3 == 0) {
            return temporalC;
        }
        return ((Instant) temporalC).c(i3, ChronoUnit.DAYS);
    }

    public static void c(TemporalAccessor temporalAccessor) {
        Chronology chronology = (Chronology) temporalAccessor.d(l.b);
        if (chronology == null || p.d.equals(chronology)) {
            return;
        }
        throw new DateTimeException("Chronology mismatch, expected: ISO, actual: " + chronology.getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        return this.a == period.a && this.b == period.b && this.c == period.c;
    }

    public final int hashCode() {
        int i = this.a;
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + i;
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
