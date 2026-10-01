package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalQuery;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class s implements e {
    public static volatile Map.Entry c;
    public static volatile Map.Entry d;
    public final TemporalQuery a;
    public final String b;

    public m a(u uVar) {
        Set<String> set = j$.time.zone.h.d;
        int size = set.size();
        Map.Entry simpleImmutableEntry = uVar.b ? c : d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                simpleImmutableEntry = uVar.b ? c : d;
                if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                    m mVar = uVar.b ? new m(_UrlKt.FRAGMENT_ENCODE_SET, null, null) : new l(_UrlKt.FRAGMENT_ENCODE_SET, null, null);
                    for (String str : set) {
                        mVar.a(str, str);
                    }
                    simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), mVar);
                    if (uVar.b) {
                        c = simpleImmutableEntry;
                    } else {
                        d = simpleImmutableEntry;
                    }
                }
            }
        }
        return (m) simpleImmutableEntry.getValue();
    }

    public s(TemporalQuery temporalQuery, String str) {
        this.a = temporalQuery;
        this.b = str;
    }

    @Override // j$.time.format.e
    public boolean o(w wVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) wVar.b(this.a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.getId());
        return true;
    }

    @Override // j$.time.format.e
    public final int w(u uVar, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i == length) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == '+' || cCharAt == '-') {
            return b(uVar, charSequence, i, i, j.e);
        }
        int i3 = i + 2;
        if (length >= i3) {
            char cCharAt2 = charSequence.charAt(i + 1);
            if (uVar.a(cCharAt, 'U') && uVar.a(cCharAt2, 'T')) {
                int i4 = i + 3;
                if (length >= i4 && uVar.a(charSequence.charAt(i3), 'C')) {
                    return b(uVar, charSequence, i, i4, j.f);
                }
                return b(uVar, charSequence, i, i3, j.f);
            }
            if (uVar.a(cCharAt, 'G') && length >= (i2 = i + 3) && uVar.a(cCharAt2, 'M') && uVar.a(charSequence.charAt(i3), 'T')) {
                int i5 = i + 4;
                if (length >= i5 && uVar.a(charSequence.charAt(i2), '0')) {
                    uVar.e(ZoneId.of("GMT0"));
                    return i5;
                }
                return b(uVar, charSequence, i, i2, j.f);
            }
        }
        m mVarA = a(uVar);
        ParsePosition parsePosition = new ParsePosition(i);
        String strC = mVarA.c(charSequence, parsePosition);
        if (strC == null) {
            if (!uVar.a(cCharAt, 'Z')) {
                return ~i;
            }
            uVar.e(ZoneOffset.UTC);
            return i + 1;
        }
        uVar.e(ZoneId.of(strC));
        return parsePosition.getIndex();
    }

    public static int b(u uVar, CharSequence charSequence, int i, int i2, j jVar) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            uVar.e(ZoneId.of(upperCase));
            return i2;
        }
        if (charSequence.charAt(i2) != '0' && !uVar.a(charSequence.charAt(i2), 'Z')) {
            u uVar2 = new u(uVar.a);
            uVar2.b = uVar.b;
            uVar2.c = uVar.c;
            int iW = jVar.w(uVar2, charSequence, i2);
            try {
                if (iW < 0) {
                    if (jVar == j.e) {
                        return ~i;
                    }
                    uVar.e(ZoneId.of(upperCase));
                    return i2;
                }
                uVar.e(ZoneId.C(upperCase, ZoneOffset.ofTotalSeconds((int) uVar2.d(ChronoField.OFFSET_SECONDS).longValue())));
                return iW;
            } catch (DateTimeException unused) {
                return ~i;
            }
        }
        uVar.e(ZoneId.of(upperCase));
        return i2;
    }

    public final String toString() {
        return this.b;
    }
}
