package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.m;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class c implements ChronoLocalDate, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public abstract ChronoLocalDate C(long j);

    public abstract ChronoLocalDate I(long j);

    public abstract ChronoLocalDate O(long j);

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public /* bridge */ /* synthetic */ Temporal a(long j, TemporalField temporalField) {
        return a(j, temporalField);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public /* bridge */ /* synthetic */ Temporal c(long j, TemporalUnit temporalUnit) {
        return c(j, temporalUnit);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* renamed from: e */
    public /* synthetic */ Temporal i(LocalDate localDate) {
        return i(localDate);
    }

    public static ChronoLocalDate o(Chronology chronology, Temporal temporal) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) temporal;
        if (chronology.equals(chronoLocalDate.getChronology())) {
            return chronoLocalDate;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + chronology.getId() + ", actual: " + chronoLocalDate.getChronology().getId());
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public ChronoLocalDate b(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return super.b(j, temporalUnit);
        }
        switch (b.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return C(j);
            case 2:
                return C(Math.multiplyExact(j, 7));
            case 3:
                return I(j);
            case 4:
                return O(j);
            case 5:
                return O(Math.multiplyExact(j, 10));
            case 6:
                return O(Math.multiplyExact(j, 100));
            case 7:
                return O(Math.multiplyExact(j, 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return a(Math.addExact(j(chronoField), j), (TemporalField) chronoField);
            default:
                throw new m("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDate chronoLocalDateD = getChronology().D(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.between(this, chronoLocalDateD);
        }
        switch (b.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return chronoLocalDateD.toEpochDay() - toEpochDay();
            case 2:
                return (chronoLocalDateD.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return w(chronoLocalDateD);
            case 4:
                return w(chronoLocalDateD) / 12;
            case 5:
                return w(chronoLocalDateD) / 120;
            case 6:
                return w(chronoLocalDateD) / 1200;
            case 7:
                return w(chronoLocalDateD) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return chronoLocalDateD.j(chronoField) - j(chronoField);
            default:
                throw new m("Unsupported unit: " + temporalUnit);
        }
    }

    public final long w(ChronoLocalDate chronoLocalDate) {
        if (getChronology().u(ChronoField.MONTH_OF_YEAR).d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        long j = j(chronoField);
        return (((chronoLocalDate.j(chronoField) * 32) + chronoLocalDate.g(r3)) - ((j * 32) + g(ChronoField.DAY_OF_MONTH))) / 32;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && compareTo((ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return ((int) (epochDay ^ (epochDay >>> 32))) ^ getChronology().hashCode();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final String toString() {
        long j = j(ChronoField.YEAR_OF_ERA);
        long j2 = j(ChronoField.MONTH_OF_YEAR);
        long j3 = j(ChronoField.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(H());
        sb.append(" ");
        sb.append(j);
        sb.append(j2 < 10 ? "-0" : "-");
        sb.append(j2);
        sb.append(j3 >= 10 ? "-" : "-0");
        sb.append(j3);
        return sb.toString();
    }
}
