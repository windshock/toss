package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class g implements e {
    @Override // j$.time.format.e
    public final boolean o(w wVar, StringBuilder sb) {
        Long lA = wVar.a(ChronoField.INSTANT_SECONDS);
        TemporalAccessor temporalAccessor = wVar.a;
        ChronoField chronoField = ChronoField.NANO_OF_SECOND;
        Long lValueOf = temporalAccessor.h(chronoField) ? Long.valueOf(temporalAccessor.j(chronoField)) : null;
        int i = 0;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int iA = chronoField.b.a(lValueOf != null ? lValueOf.longValue() : 0L, chronoField);
        if (jLongValue >= -62167219200L) {
            long j = jLongValue - 253402300800L;
            long jFloorDiv = Math.floorDiv(j, 315569520000L) + 1;
            LocalDateTime localDateTimeC = LocalDateTime.C(Math.floorMod(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jFloorDiv > 0) {
                sb.append('+');
                sb.append(jFloorDiv);
            }
            sb.append(localDateTimeC);
            if (localDateTimeC.getSecond() == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = jLongValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime localDateTimeC2 = LocalDateTime.C(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(localDateTimeC2);
            if (localDateTimeC2.getSecond() == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (localDateTimeC2.getYear() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (iA > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (iA <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = iA / i2;
                sb.append((char) (i3 + 48));
                iA -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // j$.time.format.e
    public final int w(u uVar, CharSequence charSequence, int i) {
        int i2;
        int i3;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.a(DateTimeFormatter.ISO_LOCAL_DATE);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral = dateTimeFormatterBuilder.appendLiteral('T');
        ChronoField chronoField = ChronoField.HOUR_OF_DAY;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral2 = dateTimeFormatterBuilderAppendLiteral.appendValue(chronoField, 2).appendLiteral(':');
        ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral3 = dateTimeFormatterBuilderAppendLiteral2.appendValue(chronoField2, 2).appendLiteral(':');
        ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue = dateTimeFormatterBuilderAppendLiteral3.appendValue(chronoField3, 2);
        ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
        int i4 = 0;
        dateTimeFormatterBuilderAppendValue.b(chronoField4, 0, 9, true);
        d dVar = dateTimeFormatterBuilderAppendValue.appendLiteral('Z').toFormatter().a;
        if (dVar.b) {
            dVar = new d(dVar.a, false);
        }
        u uVar2 = new u(uVar.a);
        uVar2.b = uVar.b;
        uVar2.c = uVar.c;
        int iW = dVar.w(uVar2, charSequence, i);
        if (iW < 0) {
            return iW;
        }
        long jLongValue = uVar2.d(ChronoField.YEAR).longValue();
        int iIntValue = uVar2.d(ChronoField.MONTH_OF_YEAR).intValue();
        int iIntValue2 = uVar2.d(ChronoField.DAY_OF_MONTH).intValue();
        int iIntValue3 = uVar2.d(chronoField).intValue();
        int iIntValue4 = uVar2.d(chronoField2).intValue();
        Long lD = uVar2.d(chronoField3);
        Long lD2 = uVar2.d(chronoField4);
        int iIntValue5 = lD != null ? lD.intValue() : 0;
        int iIntValue6 = lD2 != null ? lD2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            i2 = 0;
            i3 = iIntValue5;
            i4 = 1;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            uVar.c().d = true;
            i2 = iIntValue3;
            i3 = 59;
        } else {
            i2 = iIntValue3;
            i3 = iIntValue5;
        }
        try {
            return uVar.f(chronoField4, iIntValue6, i, uVar.f(ChronoField.INSTANT_SECONDS, Math.multiplyExact(jLongValue / 10000, 315569520000L) + LocalDateTime.of(((int) jLongValue) % 10000, iIntValue, iIntValue2, i2, iIntValue4, i3, 0).O(i4).toEpochSecond(ZoneOffset.UTC), i, iW));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
