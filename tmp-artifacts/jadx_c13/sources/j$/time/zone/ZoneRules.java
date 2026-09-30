package j$.time.zone;

import j$.time.Clock;
import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.chrono.p;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAdjusters;
import j$.time.temporal.k;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ZoneRules implements Serializable {
    public static final long[] i = new long[0];
    public static final e[] j = new e[0];
    public static final LocalDateTime[] k = new LocalDateTime[0];
    public static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final ZoneOffset[] b;
    public final long[] c;
    public final LocalDateTime[] d;
    public final ZoneOffset[] e;
    public final e[] f;
    public final TimeZone g;
    public final transient ConcurrentMap h = new ConcurrentHashMap();

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.b;
        if (bVar.o()) {
            if (localDateTime.isBefore(localDateTime2)) {
                return bVar.c;
            }
            if (!localDateTime.isBefore(bVar.b.S(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()))) {
                return bVar.d;
            }
        } else {
            if (!localDateTime.isBefore(localDateTime2)) {
                return bVar.d;
            }
            if (localDateTime.isBefore(bVar.b.S(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()))) {
                return bVar.c;
            }
        }
        return bVar;
    }

    public ZoneRules(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                int i3 = i2 + 1;
                b bVar = new b(jArr2[i2], zoneOffsetArr2[i2], zoneOffsetArr2[i3]);
                if (bVar.o()) {
                    arrayList.add(bVar.b);
                    arrayList.add(bVar.b.S(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()));
                } else {
                    arrayList.add(bVar.b.S(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()));
                    arrayList.add(bVar.b);
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    public ZoneRules(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    public ZoneRules(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {g(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }

    public static ZoneOffset g(int i2) {
        return ZoneOffset.ofTotalSeconds(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isFixedOffset() {
        b bVar;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            if (timeZone.useDaylightTime() || this.g.getDSTSavings() != 0) {
                return false;
            }
            Instant instantNow = Instant.now();
            if (this.g != null) {
                long epochSecond = instantNow.getEpochSecond();
                if (instantNow.getNano() > 0 && epochSecond < LongCompanionObject.MAX_VALUE) {
                    epochSecond++;
                }
                int iC = c(epochSecond, getOffset(instantNow));
                b[] bVarArrB = b(iC);
                int length = bVarArrB.length - 1;
                while (true) {
                    if (length >= 0) {
                        bVar = bVarArrB[length];
                        if (epochSecond > bVar.a) {
                            break;
                        }
                        length--;
                    } else if (iC > 1800) {
                        b[] bVarArrB2 = b(iC - 1);
                        int length2 = bVarArrB2.length - 1;
                        while (true) {
                            if (length2 >= 0) {
                                bVar = bVarArrB2[length2];
                                if (epochSecond > bVar.a) {
                                    break;
                                }
                                length2--;
                            } else {
                                int offset = this.g.getOffset((epochSecond - 1) * 1000);
                                long epochDay = LocalDate.of(1800, 1, 1).toEpochDay();
                                for (long jMin = Math.min(epochSecond - 31104000, (Clock.systemUTC().a() / 1000) + 31968000); 86400 * epochDay <= jMin; jMin -= 7776000) {
                                    int offset2 = this.g.getOffset(jMin * 1000);
                                    if (offset != offset2) {
                                        int iC2 = c(jMin, g(offset2));
                                        b[] bVarArrB3 = b(iC2 + 1);
                                        int length3 = bVarArrB3.length - 1;
                                        while (true) {
                                            if (length3 < 0) {
                                                b[] bVarArrB4 = b(iC2);
                                                bVar = bVarArrB4[bVarArrB4.length - 1];
                                                break;
                                            }
                                            bVar = bVarArrB3[length3];
                                            if (epochSecond > bVar.a) {
                                                break;
                                            }
                                            length3--;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (bVar == null) {
                    return false;
                }
            } else if (this.c.length == 0) {
                bVar = null;
                if (bVar == null) {
                }
            } else {
                long epochSecond2 = instantNow.getEpochSecond();
                if (instantNow.getNano() > 0 && epochSecond2 < LongCompanionObject.MAX_VALUE) {
                    epochSecond2++;
                }
                long[] jArr = this.c;
                long j2 = jArr[jArr.length - 1];
                if (this.f.length <= 0 || epochSecond2 <= j2) {
                    int iBinarySearch = Arrays.binarySearch(this.c, epochSecond2);
                    if (iBinarySearch < 0) {
                        iBinarySearch = (-iBinarySearch) - 1;
                    }
                    if (iBinarySearch > 0) {
                        int i2 = iBinarySearch - 1;
                        long j3 = this.c[i2];
                        ZoneOffset[] zoneOffsetArr = this.e;
                        bVar = new b(j3, zoneOffsetArr[i2], zoneOffsetArr[iBinarySearch]);
                    }
                    if (bVar == null) {
                    }
                } else {
                    ZoneOffset[] zoneOffsetArr2 = this.e;
                    ZoneOffset zoneOffset = zoneOffsetArr2[zoneOffsetArr2.length - 1];
                    int iC3 = c(epochSecond2, zoneOffset);
                    b[] bVarArrB5 = b(iC3);
                    int length4 = bVarArrB5.length - 1;
                    while (true) {
                        if (length4 < 0) {
                            int i3 = iC3 - 1;
                            if (i3 > c(j2, zoneOffset)) {
                                b[] bVarArrB6 = b(i3);
                                bVar = bVarArrB6[bVarArrB6.length - 1];
                            }
                        } else {
                            b bVar2 = bVarArrB5[length4];
                            if (epochSecond2 > bVar2.a) {
                                bVar = bVar2;
                                break;
                            }
                            length4--;
                        }
                    }
                    if (bVar == null) {
                    }
                }
            }
        } else if (this.c.length != 0) {
            return false;
        }
        return true;
    }

    public ZoneOffset getOffset(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return g(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.c.length == 0) {
            return this.b[0];
        }
        long epochSecond = instant.getEpochSecond();
        if (this.f.length > 0) {
            if (epochSecond > this.c[r7.length - 1]) {
                b[] bVarArrB = b(c(epochSecond, this.e[r7.length - 1]));
                b bVar = null;
                for (int i2 = 0; i2 < bVarArrB.length; i2++) {
                    bVar = bVarArrB[i2];
                    if (epochSecond < bVar.a) {
                        return bVar.c;
                    }
                }
                return bVar.d;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.c, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.e[iBinarySearch + 1];
    }

    public final List e(LocalDateTime localDateTime) {
        Object objD = d(localDateTime);
        if (!(objD instanceof b)) {
            return Collections.singletonList((ZoneOffset) objD);
        }
        b bVar = (b) objD;
        return bVar.o() ? Collections.EMPTY_LIST : j$.time.d.c(new Object[]{bVar.c, bVar.d});
    }

    public final Object d(LocalDateTime localDateTime) {
        Object obj = null;
        int i2 = 0;
        if (this.g != null) {
            b[] bVarArrB = b(localDateTime.getYear());
            if (bVarArrB.length == 0) {
                return g(this.g.getOffset(localDateTime.toEpochSecond(this.b[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i2 < length) {
                b bVar = bVarArrB[i2];
                Object objA = a(localDateTime, bVar);
                if ((objA instanceof b) || objA.equals(bVar.c)) {
                    return objA;
                }
                i2++;
                obj = objA;
            }
            return obj;
        }
        if (this.c.length == 0) {
            return this.b[0];
        }
        if (this.f.length > 0) {
            if (localDateTime.isAfter(this.d[r0.length - 1])) {
                b[] bVarArrB2 = b(localDateTime.getYear());
                int length2 = bVarArrB2.length;
                while (i2 < length2) {
                    b bVar2 = bVarArrB2[i2];
                    Object objA2 = a(localDateTime, bVar2);
                    if ((objA2 instanceof b) || objA2.equals(bVar2.c)) {
                        return objA2;
                    }
                    i2++;
                    obj = objA2;
                }
                return obj;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.d, localDateTime);
        if (iBinarySearch == -1) {
            return this.e[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else {
            Object[] objArr = this.d;
            if (iBinarySearch < objArr.length - 1) {
                int i3 = iBinarySearch + 1;
                if (objArr[iBinarySearch].equals(objArr[i3])) {
                    iBinarySearch = i3;
                }
            }
        }
        if ((iBinarySearch & 1) == 0) {
            LocalDateTime[] localDateTimeArr = this.d;
            LocalDateTime localDateTime2 = localDateTimeArr[iBinarySearch];
            LocalDateTime localDateTime3 = localDateTimeArr[iBinarySearch + 1];
            ZoneOffset[] zoneOffsetArr = this.e;
            int i4 = iBinarySearch / 2;
            ZoneOffset zoneOffset = zoneOffsetArr[i4];
            ZoneOffset zoneOffset2 = zoneOffsetArr[i4 + 1];
            if (zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds()) {
                return new b(localDateTime2, zoneOffset, zoneOffset2);
            }
            return new b(localDateTime3, zoneOffset, zoneOffset2);
        }
        return this.e[(iBinarySearch / 2) + 1];
    }

    public final b[] b(int i2) {
        LocalDate localDateW;
        b[] bVarArr = l;
        Integer numValueOf = Integer.valueOf(i2);
        b[] bVarArr2 = (b[]) ((ConcurrentHashMap) this.h).get(numValueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j2 = 1;
        int i3 = 0;
        if (this.g != null) {
            if (i2 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.MIN;
            long epochSecond = new LocalDateTime(LocalDate.of(i2 - 1, 12, 31), LocalTime.I(0, 0)).toEpochSecond(this.b[0]);
            int offset = this.g.getOffset(epochSecond * 1000);
            long j3 = epochSecond;
            while (j3 < epochSecond + 31968000) {
                long j4 = j3 + 7776000;
                long j5 = epochSecond;
                if (offset != this.g.getOffset(j4 * 1000)) {
                    while (j4 - j3 > j2) {
                        long jFloorDiv = Math.floorDiv(j4 + j3, 2L);
                        if (this.g.getOffset(jFloorDiv * 1000) == offset) {
                            j3 = jFloorDiv;
                        } else {
                            j4 = jFloorDiv;
                        }
                        j2 = 1;
                    }
                    if (this.g.getOffset(j3 * 1000) == offset) {
                        j3 = j4;
                    }
                    ZoneOffset zoneOffsetG = g(offset);
                    int offset2 = this.g.getOffset(j3 * 1000);
                    ZoneOffset zoneOffsetG2 = g(offset2);
                    if (c(j3, zoneOffsetG2) == i2) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(j3, zoneOffsetG, zoneOffsetG2);
                    }
                    offset = offset2;
                } else {
                    j3 = j4;
                }
                epochSecond = j5;
                j2 = 1;
            }
            if (1916 <= i2 && i2 < 2100) {
                ((ConcurrentHashMap) this.h).putIfAbsent(numValueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i4 = 0;
        while (i4 < eVarArr.length) {
            e eVar = eVarArr[i4];
            byte b = eVar.b;
            if (b < 0) {
                Month month = eVar.a;
                long j6 = i2;
                int iW = month.w(p.d.P(j6)) + 1 + eVar.b;
                LocalDate localDate = LocalDate.MIN;
                ChronoField.YEAR.Q(j6);
                ChronoField.DAY_OF_MONTH.Q(iW);
                localDateW = LocalDate.w(i2, month.getValue(), iW);
                DayOfWeek dayOfWeek = eVar.c;
                if (dayOfWeek != null) {
                    localDateW = localDateW.e(TemporalAdjusters.previousOrSame(dayOfWeek));
                }
            } else {
                Month month2 = eVar.a;
                LocalDate localDate2 = LocalDate.MIN;
                ChronoField.YEAR.Q(i2);
                ChronoField.DAY_OF_MONTH.Q(b);
                localDateW = LocalDate.w(i2, month2.getValue(), b);
                DayOfWeek dayOfWeek2 = eVar.c;
                if (dayOfWeek2 != null) {
                    localDateW = localDateW.e(new k(dayOfWeek2.getValue(), i3));
                }
            }
            if (eVar.e) {
                localDateW = localDateW.plusDays(1L);
            }
            LocalDateTime localDateTimeOf = LocalDateTime.of(localDateW, eVar.d);
            d dVar = eVar.f;
            ZoneOffset zoneOffset = eVar.g;
            ZoneOffset zoneOffset2 = eVar.h;
            int i5 = c.a[dVar.ordinal()];
            if (i5 == 1) {
                localDateTimeOf = localDateTimeOf.S(zoneOffset2.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
            } else if (i5 == 2) {
                localDateTimeOf = localDateTimeOf.S(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds());
            }
            bVarArr3[i4] = new b(localDateTimeOf, eVar.h, eVar.i);
            i4++;
            i3 = 0;
        }
        if (i2 < 2100) {
            ((ConcurrentHashMap) this.h).putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean f(Instant instant) {
        ZoneOffset zoneOffsetG;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffsetG = g(timeZone.getRawOffset());
        } else if (this.c.length == 0) {
            zoneOffsetG = this.b[0];
        } else {
            int iBinarySearch = Arrays.binarySearch(this.a, instant.getEpochSecond());
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            zoneOffsetG = this.b[iBinarySearch + 1];
        }
        return !zoneOffsetG.equals(getOffset(instant));
    }

    public static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.ofEpochDay(Math.floorDiv(j2 + zoneOffset.getTotalSeconds(), 86400)).getYear();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneRules)) {
            return false;
        }
        ZoneRules zoneRules = (ZoneRules) obj;
        return Objects.equals(this.g, zoneRules.g) && Arrays.equals(this.a, zoneRules.a) && Arrays.equals(this.b, zoneRules.b) && Arrays.equals(this.c, zoneRules.c) && Arrays.equals(this.e, zoneRules.e) && Arrays.equals(this.f, zoneRules.f);
    }

    public final int hashCode() {
        int iHashCode = Objects.hashCode(this.g);
        int iHashCode2 = Arrays.hashCode(this.a);
        int iHashCode3 = Arrays.hashCode(this.b);
        int iHashCode4 = Arrays.hashCode(this.c);
        return ((((iHashCode ^ iHashCode2) ^ iHashCode3) ^ iHashCode4) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.b[r0.length - 1] + "]";
    }
}
