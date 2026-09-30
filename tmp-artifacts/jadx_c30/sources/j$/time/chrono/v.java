package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class v implements j, Serializable {
    public static final v d;
    public static final v[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient LocalDate b;
    public final transient String c;

    static {
        v vVar = new v(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = vVar;
        e = new v[]{vVar, new v(0, LocalDate.of(1912, 7, 30), "Taisho"), new v(1, LocalDate.of(1926, 12, 25), "Showa"), new v(2, LocalDate.of(1989, 1, 8), "Heisei"), new v(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    public final v n() {
        if (this == e[r0.length - 1]) {
            return null;
        }
        return o(this.a + 1);
    }

    public v(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: j$.time.DateTimeException */
    public static v o(int i) throws DateTimeException {
        int i2 = i + 1;
        if (i2 >= 0) {
            v[] vVarArr = e;
            if (i2 < vVarArr.length) {
                return vVarArr[i2];
            }
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    public static v m(LocalDate localDate) {
        if (localDate.isBefore(u.d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 are not supported");
        }
        for (int length = e.length - 1; length >= 0; length--) {
            v vVar = e[length];
            if (localDate.compareTo(vVar.b) >= 0) {
                return vVar;
            }
        }
        return null;
    }

    public final int getValue() {
        return this.a;
    }

    public final j$.time.temporal.n k(TemporalField temporalField) {
        ChronoField chronoField = ChronoField.ERA;
        if (temporalField == chronoField) {
            return s.d.u(chronoField);
        }
        return super.k(temporalField);
    }

    public final String toString() {
        return this.c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new b0((byte) 5, this);
    }
}
