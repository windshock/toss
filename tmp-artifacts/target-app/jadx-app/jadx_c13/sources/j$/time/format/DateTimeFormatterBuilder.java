package j$.time.format;

import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class DateTimeFormatterBuilder {
    public static final j$.time.f h = new j$.time.f(8);
    public static final Map i;
    public DateTimeFormatterBuilder a;
    public final DateTimeFormatterBuilder b;
    public final List c;
    public final boolean d;
    public int e;
    public char f;
    public int g;

    static {
        HashMap map = new HashMap();
        i = map;
        map.put('G', ChronoField.ERA);
        map.put('y', ChronoField.YEAR_OF_ERA);
        map.put('u', ChronoField.YEAR);
        j$.time.temporal.f fVar = j$.time.temporal.h.a;
        map.put('Q', fVar);
        map.put('q', fVar);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        map.put('M', chronoField);
        map.put('L', chronoField);
        map.put('D', ChronoField.DAY_OF_YEAR);
        map.put('d', ChronoField.DAY_OF_MONTH);
        map.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        map.put('E', chronoField2);
        map.put('c', chronoField2);
        map.put('e', chronoField2);
        map.put('a', ChronoField.AMPM_OF_DAY);
        map.put('H', ChronoField.HOUR_OF_DAY);
        map.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        map.put('K', ChronoField.HOUR_OF_AMPM);
        map.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        map.put('m', ChronoField.MINUTE_OF_HOUR);
        map.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        map.put('S', chronoField3);
        map.put('A', ChronoField.MILLI_OF_DAY);
        map.put('n', chronoField3);
        map.put('N', ChronoField.NANO_OF_DAY);
        map.put('g', j$.time.temporal.j.a);
    }

    public static String getLocalizedDateTimePattern(FormatStyle formatStyle, FormatStyle formatStyle2, Chronology chronology, Locale locale) {
        DateFormat dateTimeInstance;
        Objects.requireNonNull(locale, "locale");
        Objects.requireNonNull(chronology, "chrono");
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        if (formatStyle2 == null) {
            dateTimeInstance = DateFormat.getDateInstance(formatStyle.ordinal(), locale);
        } else if (formatStyle == null) {
            dateTimeInstance = DateFormat.getTimeInstance(formatStyle2.ordinal(), locale);
        } else {
            dateTimeInstance = DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        }
        if (dateTimeInstance instanceof SimpleDateFormat) {
            String pattern = ((SimpleDateFormat) dateTimeInstance).toPattern();
            if (pattern == null) {
                return null;
            }
            int i2 = 0;
            boolean z = pattern.indexOf(66) != -1;
            boolean z2 = pattern.indexOf(98) != -1;
            if (!z && !z2) {
                return pattern;
            }
            StringBuilder sb = new StringBuilder(pattern.length());
            char c = ' ';
            while (i2 < pattern.length()) {
                char cCharAt = pattern.charAt(i2);
                if (cCharAt != ' ') {
                    if (cCharAt != 'B' && cCharAt != 'b') {
                        sb.append(cCharAt);
                    }
                } else if (i2 == 0 || (c != 'B' && c != 'b')) {
                    sb.append(cCharAt);
                }
                i2++;
                c = cCharAt;
            }
            int length = sb.length() - 1;
            if (length >= 0 && sb.charAt(length) == ' ') {
                sb.deleteCharAt(length);
            }
            return sb.toString();
        }
        throw new UnsupportedOperationException("Can't determine pattern from " + dateTimeInstance);
    }

    public DateTimeFormatterBuilder() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    public DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = dateTimeFormatterBuilder;
        this.d = true;
    }

    public DateTimeFormatterBuilder parseCaseInsensitive() {
        c(p.INSENSITIVE);
        return this;
    }

    public final void j(TemporalField temporalField) {
        i(new i(temporalField, 1, 19, SignStyle.NORMAL));
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i2) {
        Objects.requireNonNull(temporalField, "field");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
        }
        i(new i(temporalField, i2, i2, SignStyle.NOT_NEGATIVE));
        return this;
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i2, int i3, SignStyle signStyle) {
        if (i2 == i3 && signStyle == SignStyle.NOT_NEGATIVE) {
            return appendValue(temporalField, i3);
        }
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(signStyle, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        }
        if (i3 < i2) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
        }
        i(new i(temporalField, i2, i3, signStyle));
        return this;
    }

    public final void i(i iVar) {
        i iVarD;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.g;
        if (i2 < 0) {
            dateTimeFormatterBuilder.g = c(iVar);
            return;
        }
        i iVar2 = (i) ((ArrayList) dateTimeFormatterBuilder.c).get(i2);
        int i3 = iVar.b;
        int i4 = iVar.c;
        if (i3 == i4 && iVar.d == SignStyle.NOT_NEGATIVE) {
            iVarD = iVar2.e(i4);
            c(iVar.d());
            this.a.g = i2;
        } else {
            iVarD = iVar2.d();
            this.a.g = c(iVar);
        }
        ((ArrayList) this.a.c).set(i2, iVarD);
    }

    public final void b(ChronoField chronoField, int i2, int i3, boolean z) {
        if (i2 == i3 && !z) {
            i(new f(chronoField, i2, i3, z));
        } else {
            c(new f(chronoField, i2, i3, z));
        }
    }

    public final void h(TemporalField temporalField, TextStyle textStyle) {
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        c(new q(temporalField, textStyle, z.c));
    }

    public final void g(ChronoField chronoField, Map map) {
        Objects.requireNonNull(chronoField, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        c(new q(chronoField, textStyle, new a(new y(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public DateTimeFormatterBuilder appendOffsetId() {
        c(j.e);
        return this;
    }

    public DateTimeFormatterBuilder appendOffset(String str, String str2) {
        c(new j(str, str2));
        return this;
    }

    public final void e(TextStyle textStyle) {
        Objects.requireNonNull(textStyle, "style");
        if (textStyle != TextStyle.FULL && textStyle != TextStyle.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        c(new h(textStyle, 0));
    }

    public DateTimeFormatterBuilder appendLiteral(char c) {
        c(new c(c));
        return this;
    }

    public final void d(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        int i2 = 1;
        if (str.length() == 1) {
            c(new c(str.charAt(0)));
        } else {
            c(new h(str, i2));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d dVar = dateTimeFormatter.a;
        if (dVar.b) {
            dVar = new d(dVar.a, false);
        }
        c(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x046e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(String str) {
        int i2;
        int i3;
        t tVar;
        boolean z;
        Objects.requireNonNull(str, "pattern");
        int i4 = 0;
        while (i4 < str.length()) {
            char cCharAt = str.charAt(i4);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i5 = i4 + 1;
                while (i5 < str.length() && str.charAt(i5) == cCharAt) {
                    i5++;
                }
                int i6 = i5 - i4;
                if (cCharAt == 'p') {
                    if (i5 >= str.length() || (((cCharAt = str.charAt(i5)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i2 = i5;
                        i3 = i6;
                        i6 = 0;
                    } else {
                        i2 = i5 + 1;
                        while (i2 < str.length() && str.charAt(i2) == cCharAt) {
                            i2++;
                        }
                        i3 = i2 - i5;
                    }
                    if (i6 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i6 < 1) {
                        throw new IllegalArgumentException("The pad width must be at least one but was " + i6);
                    }
                    DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
                    dateTimeFormatterBuilder.e = i6;
                    dateTimeFormatterBuilder.f = ' ';
                    dateTimeFormatterBuilder.g = -1;
                } else {
                    i2 = i5;
                    i3 = i6;
                }
                TemporalField temporalField = (TemporalField) ((HashMap) i).get(Character.valueOf(cCharAt));
                if (temporalField != null) {
                    if (cCharAt == 'A') {
                        appendValue(temporalField, i3, 19, SignStyle.NOT_NEGATIVE);
                    } else if (cCharAt == 'Q') {
                        z = false;
                        if (i3 != 1 || i3 == 2) {
                            if (cCharAt != 'e') {
                                i(new r(cCharAt, i3, i3, i3, 0));
                            } else if (cCharAt == 'E') {
                                h(temporalField, TextStyle.SHORT);
                            } else if (i3 == 1) {
                                j(temporalField);
                            } else {
                                appendValue(temporalField, 2);
                            }
                        } else if (i3 == 3) {
                            h(temporalField, z ? TextStyle.SHORT_STANDALONE : TextStyle.SHORT);
                        } else if (i3 == 4) {
                            h(temporalField, z ? TextStyle.FULL_STANDALONE : TextStyle.FULL);
                        } else {
                            if (i3 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            h(temporalField, z ? TextStyle.NARROW_STANDALONE : TextStyle.NARROW);
                        }
                    } else if (cCharAt == 'S') {
                        b(ChronoField.NANO_OF_SECOND, i3, i3, false);
                    } else if (cCharAt != 'a') {
                        if (cCharAt != 'k') {
                            if (cCharAt != 'q') {
                                if (cCharAt != 's') {
                                    if (cCharAt == 'u' || cCharAt == 'y') {
                                        if (i3 == 2) {
                                            LocalDate localDate = o.h;
                                            Objects.requireNonNull(localDate, "baseDate");
                                            i(new o(temporalField, 2, 2, localDate, 0));
                                        } else if (i3 < 4) {
                                            appendValue(temporalField, i3, 19, SignStyle.NORMAL);
                                        } else {
                                            appendValue(temporalField, i3, 19, SignStyle.EXCEEDS_PAD);
                                        }
                                    } else if (cCharAt == 'g') {
                                        appendValue(temporalField, i3, 19, SignStyle.NORMAL);
                                    } else if (cCharAt != 'h' && cCharAt != 'm') {
                                        if (cCharAt != 'n') {
                                            switch (cCharAt) {
                                                case Imgproc.COLOR_BGR2HLS_FULL /* 68 */:
                                                    if (i3 == 1) {
                                                        j(temporalField);
                                                        break;
                                                    } else {
                                                        if (i3 != 2 && i3 != 3) {
                                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                        }
                                                        appendValue(temporalField, i3, 3, SignStyle.NOT_NEGATIVE);
                                                        break;
                                                    }
                                                case Imgproc.COLOR_RGB2HLS_FULL /* 69 */:
                                                    break;
                                                case Imgproc.COLOR_HSV2BGR_FULL /* 70 */:
                                                    if (i3 != 1) {
                                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                    }
                                                    j(temporalField);
                                                    break;
                                                case Imgproc.COLOR_HSV2RGB_FULL /* 71 */:
                                                    if (i3 != 1 && i3 != 2 && i3 != 3) {
                                                        if (i3 == 4) {
                                                            h(temporalField, TextStyle.FULL);
                                                            break;
                                                        } else {
                                                            if (i3 != 5) {
                                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                            }
                                                            h(temporalField, TextStyle.NARROW);
                                                            break;
                                                        }
                                                    } else {
                                                        h(temporalField, TextStyle.SHORT);
                                                        break;
                                                    }
                                                case Imgproc.COLOR_HLS2BGR_FULL /* 72 */:
                                                    break;
                                                default:
                                                    switch (cCharAt) {
                                                        case Imgproc.COLOR_LRGB2Lab /* 75 */:
                                                            break;
                                                        case Imgproc.COLOR_LBGR2Luv /* 76 */:
                                                            break;
                                                        case Imgproc.COLOR_LRGB2Luv /* 77 */:
                                                            break;
                                                        case Imgproc.COLOR_Lab2LBGR /* 78 */:
                                                            break;
                                                        default:
                                                            switch (cCharAt) {
                                                                case 'c':
                                                                    if (i3 == 1) {
                                                                        i(new r(cCharAt, i3, i3, i3, 0));
                                                                        break;
                                                                    } else if (i3 == 2) {
                                                                        throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                                    }
                                                                    break;
                                                                case 'd':
                                                                    break;
                                                                case 'e':
                                                                    break;
                                                                default:
                                                                    if (i3 != 1) {
                                                                        appendValue(temporalField, i3);
                                                                        break;
                                                                    } else {
                                                                        j(temporalField);
                                                                        break;
                                                                    }
                                                            }
                                                    }
                                            }
                                        }
                                    }
                                }
                            }
                            z = true;
                            if (i3 != 1) {
                                if (cCharAt != 'e') {
                                }
                            }
                        } else if (i3 == 1) {
                            j(temporalField);
                        } else {
                            if (i3 != 2) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            appendValue(temporalField, i3);
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        h(temporalField, TextStyle.SHORT);
                    }
                } else if (cCharAt == 'z') {
                    if (i3 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                    }
                    c(i3 == 4 ? new t(TextStyle.FULL, false) : new t(TextStyle.SHORT, false));
                } else if (cCharAt == 'V') {
                    if (i3 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + cCharAt);
                    }
                    c(new s(j$.time.temporal.l.a, "ZoneId()"));
                } else if (cCharAt == 'v') {
                    if (i3 == 1) {
                        tVar = new t(TextStyle.SHORT, true);
                    } else {
                        if (i3 != 4) {
                            throw new IllegalArgumentException("Wrong number of  pattern letters: " + cCharAt);
                        }
                        tVar = new t(TextStyle.FULL, true);
                    }
                    c(tVar);
                } else {
                    String str2 = "+0000";
                    if (cCharAt == 'Z') {
                        if (i3 < 4) {
                            appendOffset("+HHMM", "+0000");
                        } else if (i3 == 4) {
                            e(TextStyle.FULL);
                        } else {
                            if (i3 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            appendOffset("+HH:MM:ss", "Z");
                        }
                    } else if (cCharAt == 'O') {
                        if (i3 == 1) {
                            e(TextStyle.SHORT);
                        } else {
                            if (i3 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + cCharAt);
                            }
                            e(TextStyle.FULL);
                        }
                    } else if (cCharAt == 'X') {
                        if (i3 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        appendOffset(j.d[i3 + (i3 == 1 ? 0 : 1)], "Z");
                    } else if (cCharAt == 'x') {
                        if (i3 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        if (i3 == 1) {
                            str2 = "+00";
                        } else if (i3 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        appendOffset(j.d[i3 + (i3 == 1 ? 0 : 1)], str2);
                    } else if (cCharAt == 'W') {
                        if (i3 > 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        i(new r(cCharAt, i3, i3, i3, 0));
                    } else if (cCharAt == 'w') {
                        if (i3 > 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        i(new r(cCharAt, i3, i3, 2, 0));
                    } else {
                        if (cCharAt != 'Y') {
                            throw new IllegalArgumentException("Unknown pattern letter: " + cCharAt);
                        }
                        if (i3 == 2) {
                            i(new r(cCharAt, i3, i3, 2, 0));
                        } else {
                            i(new r(cCharAt, i3, i3, 19, 0));
                        }
                    }
                }
                i4 = i2 - 1;
            } else if (cCharAt == '\'') {
                int i7 = i4 + 1;
                int i8 = i7;
                while (i8 < str.length()) {
                    if (str.charAt(i8) == '\'') {
                        int i9 = i8 + 1;
                        if (i9 < str.length() && str.charAt(i9) == '\'') {
                            i8 = i9;
                        } else {
                            if (i8 < str.length()) {
                                throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                            }
                            String strSubstring = str.substring(i7, i8);
                            if (strSubstring.isEmpty()) {
                                appendLiteral('\'');
                            } else {
                                d(strSubstring.replace("''", "'"));
                            }
                            i4 = i8;
                        }
                    }
                    i8++;
                }
                if (i8 < str.length()) {
                }
            } else if (cCharAt == '[') {
                l();
            } else if (cCharAt == ']') {
                if (this.a.b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                k();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                appendLiteral(cCharAt);
            }
            i4++;
        }
    }

    public final void l() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        dateTimeFormatterBuilder.g = -1;
        this.a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
    }

    public final void k() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        if (dateTimeFormatterBuilder.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) dateTimeFormatterBuilder.c).size() > 0) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
            d dVar = new d(dateTimeFormatterBuilder2.c, dateTimeFormatterBuilder2.d);
            this.a = this.a.b;
            c(dVar);
            return;
        }
        this.a = this.a.b;
    }

    public final int c(e eVar) {
        Objects.requireNonNull(eVar, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.e;
        if (i2 > 0) {
            k kVar = new k(eVar, i2, dateTimeFormatterBuilder.f);
            dateTimeFormatterBuilder.e = 0;
            dateTimeFormatterBuilder.f = (char) 0;
            eVar = kVar;
        }
        ((ArrayList) dateTimeFormatterBuilder.c).add(eVar);
        this.a.g = -1;
        return ((ArrayList) r5.c).size() - 1;
    }

    public DateTimeFormatter toFormatter() {
        return n(Locale.getDefault(), b0.SMART, null);
    }

    public final DateTimeFormatter m(b0 b0Var, Chronology chronology) {
        return n(Locale.getDefault(), b0Var, chronology);
    }

    public final DateTimeFormatter n(Locale locale, b0 b0Var, Chronology chronology) {
        Objects.requireNonNull(locale, "locale");
        while (this.a.b != null) {
            k();
        }
        return new DateTimeFormatter(new d(this.c, false), locale, DecimalStyle.d, b0Var, chronology, null);
    }
}
