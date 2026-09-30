package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.chrono.Chronology;
import j$.time.format.a0;
import j$.time.format.b0;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class i implements TemporalField {
    public static final i JULIAN_DAY;
    public static final i MODIFIED_JULIAN_DAY;
    public static final i RATA_DIE;
    public static final /* synthetic */ i[] d;
    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient n b;
    public final transient long c;

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) d.clone();
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        i iVar = new i("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = iVar;
        i iVar2 = new i("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = iVar2;
        i iVar3 = new i("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = iVar3;
        d = new i[]{iVar, iVar2, iVar3};
    }

    public i(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        this.a = str2;
        this.b = n.f((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    @Override // j$.time.temporal.TemporalField
    public final Temporal O(Temporal temporal, long j) {
        if (!this.b.e(j)) {
            throw new DateTimeException("Invalid value: " + this.a + " " + j);
        }
        return temporal.a(Math.subtractExact(j, this.c), ChronoField.EPOCH_DAY);
    }

    @Override // j$.time.temporal.TemporalField
    public final n range() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean o(TemporalAccessor temporalAccessor) {
        return temporalAccessor.h(ChronoField.EPOCH_DAY);
    }

    @Override // j$.time.temporal.TemporalField
    public final n w(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.h(ChronoField.EPOCH_DAY)) {
            return this.b;
        }
        throw new DateTimeException("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.TemporalField
    public final long I(TemporalAccessor temporalAccessor) {
        return temporalAccessor.j(ChronoField.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor C(Map map, a0 a0Var, b0 b0Var) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        Chronology chronologyN = Chronology.n(a0Var);
        b0 b0Var2 = b0.LENIENT;
        long j = this.c;
        if (b0Var == b0Var2) {
            return chronologyN.m(Math.subtractExact(jLongValue, j));
        }
        this.b.b(jLongValue, this);
        return chronologyN.m(jLongValue - j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
