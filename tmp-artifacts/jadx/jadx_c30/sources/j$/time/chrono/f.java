package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.d;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.l;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class f implements TemporalAmount, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final Chronology a;
    public final int b;
    public final int c;
    public final int d;

    static {
        d.c(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public f(Chronology chronology, int i, int i2, int i3) {
        this.a = chronology;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final String toString() {
        if (this.b == 0 && this.c == 0 && this.d == 0) {
            return this.a.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.toString());
        sb.append(" P");
        int i = this.b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    public final long a() {
        j$.time.temporal.n nVarU = this.a.u(ChronoField.MONTH_OF_YEAR);
        if (nVarU.a == nVarU.b && nVarU.c == nVarU.d && nVarU.d()) {
            return (nVarU.d - nVarU.a) + 1;
        }
        return -1L;
    }

    public final Temporal o(Temporal temporal) throws DateTimeException {
        b(temporal);
        if (this.c == 0) {
            int i = this.b;
            if (i != 0) {
                temporal = temporal.b(i, ChronoUnit.YEARS);
            }
        } else {
            long jA = a();
            if (jA > 0) {
                temporal = temporal.b((this.b * jA) + this.c, ChronoUnit.MONTHS);
            } else {
                int i2 = this.b;
                if (i2 != 0) {
                    temporal = temporal.b(i2, ChronoUnit.YEARS);
                }
                temporal = temporal.b(this.c, ChronoUnit.MONTHS);
            }
        }
        int i3 = this.d;
        return i3 != 0 ? temporal.b(i3, ChronoUnit.DAYS) : temporal;
    }

    public final Temporal w(Instant instant) throws DateTimeException {
        b(instant);
        if (this.c == 0) {
            int i = this.b;
            if (i != 0) {
                instant = instant.c(i, ChronoUnit.YEARS);
            }
        } else {
            long jA = a();
            if (jA > 0) {
                instant = instant.c((this.b * jA) + this.c, ChronoUnit.MONTHS);
            } else {
                int i2 = this.b;
                if (i2 != 0) {
                    instant = instant.c(i2, ChronoUnit.YEARS);
                }
                instant = instant.c(this.c, ChronoUnit.MONTHS);
            }
        }
        int i3 = this.d;
        return i3 != 0 ? instant.c(i3, ChronoUnit.DAYS) : instant;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: j$.time.DateTimeException */
    public final void b(TemporalAccessor temporalAccessor) throws DateTimeException {
        Chronology chronology = (Chronology) temporalAccessor.d(l.b);
        if (chronology == null || this.a.equals(chronology)) {
            return;
        }
        throw new DateTimeException("Chronology mismatch, expected: " + this.a.getId() + ", actual: " + chronology.getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.b == fVar.b && this.c == fVar.c && this.d == fVar.d && this.a.equals(fVar.a);
    }

    public final int hashCode() {
        int i = this.b;
        return this.a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + i));
    }

    public Object writeReplace() {
        return new b0((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
