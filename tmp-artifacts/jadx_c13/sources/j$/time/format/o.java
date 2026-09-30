package j$.time.format;

import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.function.Consumer;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class o extends i {
    public static final LocalDate h = LocalDate.of(2000, 1, 1);
    public final ChronoLocalDate g;

    @Override // j$.time.format.i
    public final boolean b(u uVar) {
        if (uVar.c) {
            return super.b(uVar);
        }
        return false;
    }

    public o(TemporalField temporalField, int i, int i2, ChronoLocalDate chronoLocalDate, int i3) {
        super(temporalField, i, i2, SignStyle.NOT_NEGATIVE, i3);
        this.g = chronoLocalDate;
    }

    @Override // j$.time.format.i
    public final long a(w wVar, long j) {
        long jAbs = Math.abs(j);
        ChronoLocalDate chronoLocalDate = this.g;
        long jG = chronoLocalDate != null ? Chronology.n(wVar.a).D(chronoLocalDate).g(this.a) : 0;
        long[] jArr = i.f;
        if (j >= jG) {
            long j2 = jArr[this.b];
            if (j < jG + j2) {
                return jAbs % j2;
            }
        }
        return jAbs % jArr[this.c];
    }

    @Override // j$.time.format.i
    public final int c(final u uVar, final long j, final int i, final int i2) {
        int iG;
        ChronoLocalDate chronoLocalDate = this.g;
        if (chronoLocalDate != null) {
            Chronology chronology = uVar.c().c;
            if (chronology == null && (chronology = uVar.a.e) == null) {
                chronology = j$.time.chrono.p.d;
            }
            iG = chronology.D(chronoLocalDate).g(this.a);
            Consumer consumer = new Consumer() { // from class: j$.time.format.n
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.a.c(uVar, j, i, i2);
                }
            };
            if (uVar.e == null) {
                uVar.e = new ArrayList();
            }
            uVar.e.add(consumer);
        } else {
            iG = 0;
        }
        int i3 = this.b;
        if (i2 - i == i3 && j >= 0) {
            long j2 = i.f[i3];
            long j3 = iG;
            long j4 = j3 - (j3 % j2);
            j = iG > 0 ? j4 + j : j4 - j;
            if (j < j3) {
                j += j2;
            }
        }
        return uVar.f(this.a, j, i, i2);
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.e == -1) {
            return this;
        }
        return new o(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i) {
        return new o(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.i
    public final String toString() {
        Object obj = this.g;
        return "ReducedValue(" + this.a + "," + this.b + "," + this.c + "," + (obj != null ? obj : 0) + ")";
    }
}
