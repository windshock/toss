package j$.time.format;

import j$.time.DateTimeException;
import j$.time.LocalTime;
import j$.time.Period;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_DATE_TIME;
    public static final DateTimeFormatter ISO_INSTANT;
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter ISO_LOCAL_DATE_TIME;
    public static final DateTimeFormatter ISO_OFFSET_DATE_TIME;
    public static final DateTimeFormatter ISO_ZONED_DATE_TIME;
    public static final DateTimeFormatter g;
    public static final DateTimeFormatter h;
    public final d a;
    public final Locale b;
    public final DecimalStyle c;
    public final b0 d;
    public final Chronology e;
    public final ZoneId f;

    public static DateTimeFormatter ofPattern(String str) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.f(str);
        return dateTimeFormatterBuilder.toFormatter();
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.f(str);
        return dateTimeFormatterBuilder.n(locale, b0.SMART, null);
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.YEAR;
        SignStyle signStyle = SignStyle.EXCEEDS_PAD;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral = dateTimeFormatterBuilder.appendValue(chronoField, 4, 10, signStyle).appendLiteral('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral2 = dateTimeFormatterBuilderAppendLiteral.appendValue(chronoField2, 2).appendLiteral('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue = dateTimeFormatterBuilderAppendLiteral2.appendValue(chronoField3, 2);
        b0 b0Var = b0.STRICT;
        j$.time.chrono.p pVar = j$.time.chrono.p.d;
        DateTimeFormatter dateTimeFormatterM = dateTimeFormatterBuilderAppendValue.m(b0Var, pVar);
        ISO_LOCAL_DATE = dateTimeFormatterM;
        DateTimeFormatterBuilder caseInsensitive = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive.a(dateTimeFormatterM);
        caseInsensitive.appendOffsetId().m(b0Var, pVar);
        DateTimeFormatterBuilder caseInsensitive2 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive2.a(dateTimeFormatterM);
        caseInsensitive2.l();
        caseInsensitive2.appendOffsetId().m(b0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral3 = dateTimeFormatterBuilder2.appendValue(chronoField4, 2).appendLiteral(':');
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue2 = dateTimeFormatterBuilderAppendLiteral3.appendValue(chronoField5, 2);
        dateTimeFormatterBuilderAppendValue2.l();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral4 = dateTimeFormatterBuilderAppendValue2.appendLiteral(':');
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue3 = dateTimeFormatterBuilderAppendLiteral4.appendValue(chronoField6, 2);
        dateTimeFormatterBuilderAppendValue3.l();
        dateTimeFormatterBuilderAppendValue3.b(ChronoField.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterM2 = dateTimeFormatterBuilderAppendValue3.m(b0Var, null);
        g = dateTimeFormatterM2;
        DateTimeFormatterBuilder caseInsensitive3 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive3.a(dateTimeFormatterM2);
        h = caseInsensitive3.appendOffsetId().m(b0Var, null);
        DateTimeFormatterBuilder caseInsensitive4 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive4.a(dateTimeFormatterM2);
        caseInsensitive4.l();
        caseInsensitive4.appendOffsetId().m(b0Var, null);
        DateTimeFormatterBuilder caseInsensitive5 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive5.a(dateTimeFormatterM);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral5 = caseInsensitive5.appendLiteral('T');
        dateTimeFormatterBuilderAppendLiteral5.a(dateTimeFormatterM2);
        DateTimeFormatter dateTimeFormatterM3 = dateTimeFormatterBuilderAppendLiteral5.m(b0Var, pVar);
        ISO_LOCAL_DATE_TIME = dateTimeFormatterM3;
        DateTimeFormatterBuilder caseInsensitive6 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive6.a(dateTimeFormatterM3);
        p pVar2 = p.LENIENT;
        caseInsensitive6.c(pVar2);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId = caseInsensitive6.appendOffsetId();
        p pVar3 = p.STRICT;
        dateTimeFormatterBuilderAppendOffsetId.c(pVar3);
        DateTimeFormatter dateTimeFormatterM4 = dateTimeFormatterBuilderAppendOffsetId.m(b0Var, pVar);
        ISO_OFFSET_DATE_TIME = dateTimeFormatterM4;
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.a(dateTimeFormatterM4);
        dateTimeFormatterBuilder3.l();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral6 = dateTimeFormatterBuilder3.appendLiteral('[');
        p pVar4 = p.SENSITIVE;
        dateTimeFormatterBuilderAppendLiteral6.c(pVar4);
        j$.time.f fVar = DateTimeFormatterBuilder.h;
        dateTimeFormatterBuilderAppendLiteral6.c(new s(fVar, "ZoneRegionId()"));
        ISO_ZONED_DATE_TIME = dateTimeFormatterBuilderAppendLiteral6.appendLiteral(']').m(b0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder4.a(dateTimeFormatterM3);
        dateTimeFormatterBuilder4.l();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId2 = dateTimeFormatterBuilder4.appendOffsetId();
        dateTimeFormatterBuilderAppendOffsetId2.l();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral7 = dateTimeFormatterBuilderAppendOffsetId2.appendLiteral('[');
        dateTimeFormatterBuilderAppendLiteral7.c(pVar4);
        dateTimeFormatterBuilderAppendLiteral7.c(new s(fVar, "ZoneRegionId()"));
        ISO_DATE_TIME = dateTimeFormatterBuilderAppendLiteral7.appendLiteral(']').m(b0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue4 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4, 10, signStyle).appendLiteral('-').appendValue(ChronoField.DAY_OF_YEAR, 3);
        dateTimeFormatterBuilderAppendValue4.l();
        dateTimeFormatterBuilderAppendValue4.appendOffsetId().m(b0Var, pVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue5 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(j$.time.temporal.h.c, 4, 10, signStyle);
        dateTimeFormatterBuilderAppendValue5.d("-W");
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral8 = dateTimeFormatterBuilderAppendValue5.appendValue(j$.time.temporal.h.b, 2).appendLiteral('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue6 = dateTimeFormatterBuilderAppendLiteral8.appendValue(chronoField7, 1);
        dateTimeFormatterBuilderAppendValue6.l();
        dateTimeFormatterBuilderAppendValue6.appendOffsetId().m(b0Var, pVar);
        DateTimeFormatterBuilder caseInsensitive7 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive7.getClass();
        caseInsensitive7.c(new g());
        ISO_INSTANT = caseInsensitive7.m(b0Var, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue7 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4).appendValue(chronoField2, 2).appendValue(chronoField3, 2);
        dateTimeFormatterBuilderAppendValue7.l();
        dateTimeFormatterBuilderAppendValue7.c(pVar2);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffset = dateTimeFormatterBuilderAppendValue7.appendOffset("+HHMMss", "Z");
        dateTimeFormatterBuilderAppendOffset.c(pVar3);
        dateTimeFormatterBuilderAppendOffset.m(b0Var, pVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        DateTimeFormatterBuilder caseInsensitive8 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive8.c(pVar2);
        caseInsensitive8.l();
        caseInsensitive8.g(chronoField7, map);
        caseInsensitive8.d(", ");
        caseInsensitive8.k();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral9 = caseInsensitive8.appendValue(chronoField3, 1, 2, SignStyle.NOT_NEGATIVE).appendLiteral(' ');
        dateTimeFormatterBuilderAppendLiteral9.g(chronoField2, map2);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue8 = dateTimeFormatterBuilderAppendLiteral9.appendLiteral(' ').appendValue(chronoField, 4).appendLiteral(' ').appendValue(chronoField4, 2).appendLiteral(':').appendValue(chronoField5, 2);
        dateTimeFormatterBuilderAppendValue8.l();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue9 = dateTimeFormatterBuilderAppendValue8.appendLiteral(':').appendValue(chronoField6, 2);
        dateTimeFormatterBuilderAppendValue9.k();
        dateTimeFormatterBuilderAppendValue9.appendLiteral(' ').appendOffset("+HHMM", "GMT").m(b0.SMART, pVar);
    }

    public DateTimeFormatter(d dVar, Locale locale, DecimalStyle decimalStyle, b0 b0Var, Chronology chronology, ZoneId zoneId) {
        Objects.requireNonNull(dVar, "printerParser");
        this.a = dVar;
        Objects.requireNonNull(locale, "locale");
        this.b = locale;
        Objects.requireNonNull(decimalStyle, "decimalStyle");
        this.c = decimalStyle;
        Objects.requireNonNull(b0Var, "resolverStyle");
        this.d = b0Var;
        this.e = chronology;
        this.f = zoneId;
    }

    public DateTimeFormatter withDecimalStyle(DecimalStyle decimalStyle) {
        if (this.c.equals(decimalStyle)) {
            return this;
        }
        return new DateTimeFormatter(this.a, this.b, decimalStyle, this.d, this.e, this.f);
    }

    public DateTimeFormatter withZone(ZoneId zoneId) {
        if (Objects.equals(this.f, zoneId)) {
            return this;
        }
        return new DateTimeFormatter(this.a, this.b, this.c, this.d, this.e, zoneId);
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        d dVar = this.a;
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            dVar.o(new w(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new DateTimeException(e.getMessage(), e);
        }
    }

    public TemporalAccessor parse(CharSequence charSequence) {
        Objects.requireNonNull(charSequence, "text");
        try {
            return b(charSequence);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw a(charSequence, e2);
        }
    }

    public <T> T parse(CharSequence charSequence, TemporalQuery<T> temporalQuery) {
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(temporalQuery, "query");
        try {
            return (T) b(charSequence).d(temporalQuery);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw a(charSequence, e2);
        }
    }

    public static DateTimeParseException a(CharSequence charSequence, RuntimeException runtimeException) {
        String string;
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        return new DateTimeParseException("Text '" + string + "' could not be parsed: " + runtimeException.getMessage(), charSequence, runtimeException);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a0 b(CharSequence charSequence) {
        String string;
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        u uVar = new u(this);
        int iW = this.a.w(uVar, charSequence, parsePosition.getIndex());
        if (iW < 0) {
            parsePosition.setErrorIndex(~iW);
            uVar = null;
        } else {
            parsePosition.setIndex(iW);
        }
        if (uVar != null) {
            DateTimeFormatter dateTimeFormatter = uVar.a;
            if (parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
                a0 a0VarC = uVar.c();
                Chronology chronology = uVar.c().c;
                if (chronology == null && (chronology = dateTimeFormatter.e) == null) {
                    chronology = j$.time.chrono.p.d;
                }
                a0VarC.c = chronology;
                ZoneId zoneId = a0VarC.b;
                if (zoneId == null) {
                    zoneId = dateTimeFormatter.f;
                }
                a0VarC.b = zoneId;
                a0VarC.e = this.d;
                a0VarC.n();
                a0VarC.u(a0VarC.c.L(a0VarC.a, a0VarC.e));
                a0VarC.r();
                if (((HashMap) a0VarC.a).size() > 0) {
                    loop0: while (i < 50) {
                        Iterator it = ((HashMap) a0VarC.a).entrySet().iterator();
                        while (it.hasNext()) {
                            TemporalField temporalField = (TemporalField) ((Map.Entry) it.next()).getKey();
                            TemporalAccessor temporalAccessorC = temporalField.C(a0VarC.a, a0VarC, a0VarC.e);
                            if (temporalAccessorC != null) {
                                if (temporalAccessorC instanceof ChronoZonedDateTime) {
                                    ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) temporalAccessorC;
                                    ZoneId zoneId2 = a0VarC.b;
                                    if (zoneId2 == null) {
                                        a0VarC.b = chronoZonedDateTime.getZone();
                                    } else if (!zoneId2.equals(chronoZonedDateTime.getZone())) {
                                        throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + a0VarC.b);
                                    }
                                    temporalAccessorC = chronoZonedDateTime.toLocalDateTime();
                                }
                                if (temporalAccessorC instanceof ChronoLocalDateTime) {
                                    ChronoLocalDateTime chronoLocalDateTime = (ChronoLocalDateTime) temporalAccessorC;
                                    a0VarC.s(chronoLocalDateTime.toLocalTime(), Period.d);
                                    a0VarC.u(chronoLocalDateTime.toLocalDate());
                                } else if (temporalAccessorC instanceof ChronoLocalDate) {
                                    a0VarC.u((ChronoLocalDate) temporalAccessorC);
                                } else if (temporalAccessorC instanceof LocalTime) {
                                    a0VarC.s((LocalTime) temporalAccessorC, Period.d);
                                } else {
                                    throw new DateTimeException("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                                }
                            } else if (!((HashMap) a0VarC.a).containsKey(temporalField)) {
                                break;
                            }
                            i++;
                        }
                    }
                    if (i == 50) {
                        throw new DateTimeException("One of the parsed fields has an incorrectly implemented resolve method");
                    }
                    if (i > 0) {
                        a0VarC.n();
                        a0VarC.u(a0VarC.c.L(a0VarC.a, a0VarC.e));
                        a0VarC.r();
                    }
                }
                if (a0VarC.g == null) {
                    Map map = a0VarC.a;
                    ChronoField chronoField = ChronoField.MILLI_OF_SECOND;
                    if (((HashMap) map).containsKey(chronoField)) {
                        long jLongValue = ((Long) ((HashMap) a0VarC.a).remove(chronoField)).longValue();
                        Map map2 = a0VarC.a;
                        ChronoField chronoField2 = ChronoField.MICRO_OF_SECOND;
                        if (((HashMap) map2).containsKey(chronoField2)) {
                            long jLongValue2 = (((Long) ((HashMap) a0VarC.a).get(chronoField2)).longValue() % 1000) + (jLongValue * 1000);
                            a0VarC.v(chronoField, chronoField2, Long.valueOf(jLongValue2));
                            ((HashMap) a0VarC.a).remove(chronoField2);
                            ((HashMap) a0VarC.a).put(ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                        } else {
                            ((HashMap) a0VarC.a).put(ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                        }
                    } else {
                        Map map3 = a0VarC.a;
                        ChronoField chronoField3 = ChronoField.MICRO_OF_SECOND;
                        if (((HashMap) map3).containsKey(chronoField3)) {
                            ((HashMap) a0VarC.a).put(ChronoField.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) a0VarC.a).remove(chronoField3)).longValue() * 1000));
                        }
                    }
                    Map map4 = a0VarC.a;
                    ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
                    Long l = (Long) ((HashMap) map4).get(chronoField4);
                    if (l != null) {
                        Map map5 = a0VarC.a;
                        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
                        Long l2 = (Long) ((HashMap) map5).get(chronoField5);
                        Map map6 = a0VarC.a;
                        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
                        Long l3 = (Long) ((HashMap) map6).get(chronoField6);
                        Map map7 = a0VarC.a;
                        ChronoField chronoField7 = ChronoField.NANO_OF_SECOND;
                        Long l4 = (Long) ((HashMap) map7).get(chronoField7);
                        if ((l2 != null || (l3 == null && l4 == null)) && (l2 == null || l3 != null || l4 == null)) {
                            a0VarC.q(l.longValue(), l2 != null ? l2.longValue() : 0L, l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L);
                            ((HashMap) a0VarC.a).remove(chronoField4);
                            ((HashMap) a0VarC.a).remove(chronoField5);
                            ((HashMap) a0VarC.a).remove(chronoField6);
                            ((HashMap) a0VarC.a).remove(chronoField7);
                            if (a0VarC.e != b0.LENIENT && ((HashMap) a0VarC.a).size() > 0) {
                                for (Map.Entry entry : ((HashMap) a0VarC.a).entrySet()) {
                                    TemporalField temporalField2 = (TemporalField) entry.getKey();
                                    if (temporalField2 instanceof ChronoField) {
                                        ChronoField chronoField8 = (ChronoField) temporalField2;
                                        if (chronoField8.R()) {
                                            chronoField8.Q(((Long) entry.getValue()).longValue());
                                        }
                                    }
                                }
                            }
                        }
                    } else if (a0VarC.e != b0.LENIENT) {
                        while (r2.hasNext()) {
                        }
                    }
                }
                ChronoLocalDate chronoLocalDate = a0VarC.f;
                if (chronoLocalDate != null) {
                    a0VarC.m(chronoLocalDate);
                }
                LocalTime localTime = a0VarC.g;
                if (localTime != null) {
                    a0VarC.m(localTime);
                    if (a0VarC.f != null && ((HashMap) a0VarC.a).size() > 0) {
                        a0VarC.m(a0VarC.f.E(a0VarC.g));
                    }
                }
                if (a0VarC.f != null && a0VarC.g != null) {
                    Period period = a0VarC.h;
                    period.getClass();
                    Period period2 = Period.d;
                    if (period != period2) {
                        a0VarC.f = a0VarC.f.K(a0VarC.h);
                        a0VarC.h = period2;
                    }
                }
                if (a0VarC.g == null) {
                    if (!((HashMap) a0VarC.a).containsKey(ChronoField.INSTANT_SECONDS)) {
                        if (!((HashMap) a0VarC.a).containsKey(ChronoField.SECOND_OF_DAY)) {
                            if (((HashMap) a0VarC.a).containsKey(ChronoField.SECOND_OF_MINUTE)) {
                                Map map8 = a0VarC.a;
                                ChronoField chronoField9 = ChronoField.NANO_OF_SECOND;
                                if (((HashMap) map8).containsKey(chronoField9)) {
                                    long jLongValue3 = ((Long) ((HashMap) a0VarC.a).get(chronoField9)).longValue();
                                    ((HashMap) a0VarC.a).put(ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / 1000));
                                    ((HashMap) a0VarC.a).put(ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue3 / 1000000));
                                } else {
                                    ((HashMap) a0VarC.a).put(chronoField9, 0L);
                                    ((HashMap) a0VarC.a).put(ChronoField.MICRO_OF_SECOND, 0L);
                                    ((HashMap) a0VarC.a).put(ChronoField.MILLI_OF_SECOND, 0L);
                                }
                            }
                        }
                    }
                }
                if (a0VarC.f != null && a0VarC.g != null) {
                    Long l5 = (Long) ((HashMap) a0VarC.a).get(ChronoField.OFFSET_SECONDS);
                    if (l5 != null) {
                        ((HashMap) a0VarC.a).put(ChronoField.INSTANT_SECONDS, Long.valueOf(a0VarC.f.E(a0VarC.g).B(ZoneOffset.ofTotalSeconds(l5.intValue())).toEpochSecond()));
                        return a0VarC;
                    }
                    if (a0VarC.b != null) {
                        ((HashMap) a0VarC.a).put(ChronoField.INSTANT_SECONDS, Long.valueOf(a0VarC.f.E(a0VarC.g).B(a0VarC.b).toEpochSecond()));
                    }
                }
                return a0VarC;
            }
        }
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            throw new DateTimeParseException("Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex(), charSequence, parsePosition.getErrorIndex());
        }
        throw new DateTimeParseException("Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex(), charSequence, parsePosition.getIndex());
    }

    public final String toString() {
        String string = this.a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
