package j$.time;

import j$.time.chrono.Chronology;
import j$.time.chrono.p;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.n;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import net.sf.scuba.smartcards.BuildConfig;
import o.setGlobalLegacyVisibilityHandlingEnabled;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class m implements TemporalAccessor, TemporalAdjuster, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        int i = this.a - mVar.a;
        return i == 0 ? this.b - mVar.b : i;
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.d("--");
        dateTimeFormatterBuilder.appendValue(ChronoField.MONTH_OF_YEAR, 2).appendLiteral('-').appendValue(ChronoField.DAY_OF_MONTH, 2).toFormatter();
    }

    public m(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean h(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.DAY_OF_MONTH : temporalField != null && temporalField.o(this);
    }

    public final n k(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.range();
        }
        if (temporalField != ChronoField.DAY_OF_MONTH) {
            return super.k(temporalField);
        }
        Month monthOf = Month.of(this.a);
        monthOf.getClass();
        int i = k.a[monthOf.ordinal()];
        return n.g(1L, i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : 28, Month.of(this.a).C());
    }

    public final int g(TemporalField temporalField) {
        return k(temporalField).a(j(temporalField), temporalField);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: j$.time.temporal.m */
    public final long j(TemporalField temporalField) throws j$.time.temporal.m {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.I(this);
        }
        int i2 = l.a[((ChronoField) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.m(b.a("Unsupported field: ", temporalField));
            }
            i = this.a;
        }
        return i;
    }

    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.l.b) {
            return p.d;
        }
        return super.d(temporalQuery);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: j$.time.DateTimeException */
    public final Temporal f(Temporal temporal) throws DateTimeException {
        if (!Chronology.n(temporal).equals(p.d)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        Temporal temporalA = temporal.a(this.a, ChronoField.MONTH_OF_YEAR);
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return temporalA.a(Math.min(temporalA.k(chronoField).d, this.b), chronoField);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && this.b == mVar.b;
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.a < 10 ? setGlobalLegacyVisibilityHandlingEnabled.CERTIFY_CVC : BuildConfig.FLAVOR);
        sb.append(this.a);
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
