package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class t extends s {
    public static final Map i = new ConcurrentHashMap();
    public final TextStyle e;
    public final boolean f;
    public final Map g;
    public final Map h;

    public t(TextStyle textStyle, boolean z) {
        super(j$.time.temporal.l.e, "ZoneText(" + textStyle + ")");
        this.g = new HashMap();
        this.h = new HashMap();
        Objects.requireNonNull(textStyle, "textStyle");
        this.e = textStyle;
        this.f = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6 A[PHI: r6
      0x00a6: PHI (r6v2 java.util.concurrent.ConcurrentHashMap) = 
      (r6v9 java.util.concurrent.ConcurrentHashMap)
      (r6v10 java.util.concurrent.ConcurrentHashMap)
      (r6v11 java.util.concurrent.ConcurrentHashMap)
     binds: [B:27:0x0093, B:29:0x009c, B:31:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.Map] */
    @Override // j$.time.format.s, j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(w wVar, StringBuilder sb) {
        StringBuilder sb2;
        ?? F;
        TextStyle textStyle;
        TextStyle textStyle2;
        ZoneId zoneId = (ZoneId) wVar.b(j$.time.temporal.l.a);
        if (zoneId == null) {
            return false;
        }
        String id = zoneId.getId();
        if (!(zoneId instanceof ZoneOffset)) {
            TemporalAccessor temporalAccessor = wVar.a;
            String str = null;
            ConcurrentHashMap concurrentHashMap = null;
            if (this.f) {
                F = 2;
                Locale locale = wVar.b.b;
                textStyle = TextStyle.NARROW;
                textStyle2 = this.e;
                if (textStyle2 != textStyle) {
                    ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) i;
                    SoftReference softReference = (SoftReference) concurrentHashMap2.get(id);
                    if (softReference != null) {
                        ?? r6 = (Map) softReference.get();
                        concurrentHashMap = r6;
                        if (r6 != 0) {
                            String[] strArr = (String[]) r6.get(locale);
                            concurrentHashMap = r6;
                            if (strArr == null) {
                                ConcurrentHashMap concurrentHashMap3 = concurrentHashMap;
                                TimeZone timeZone = TimeZone.getTimeZone(id);
                                strArr = new String[]{id, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), id, id};
                                if (concurrentHashMap3 == null) {
                                    concurrentHashMap3 = new ConcurrentHashMap();
                                }
                                concurrentHashMap3.put(locale, strArr);
                                concurrentHashMap2.put(id, new SoftReference(concurrentHashMap3));
                            }
                            if (F == 0) {
                                str = strArr[textStyle2.a + 1];
                            } else if (F == 1) {
                                str = strArr[textStyle2.a + 3];
                            } else {
                                str = strArr[textStyle2.a + 5];
                            }
                        }
                    }
                }
                if (str == null) {
                    sb2 = sb;
                    id = str;
                } else {
                    sb2 = sb;
                }
            } else {
                if (temporalAccessor.h(ChronoField.INSTANT_SECONDS)) {
                    F = zoneId.getRules().f(Instant.from(temporalAccessor));
                } else {
                    ChronoField chronoField = ChronoField.EPOCH_DAY;
                    if (temporalAccessor.h(chronoField)) {
                        ChronoField chronoField2 = ChronoField.NANO_OF_DAY;
                        if (temporalAccessor.h(chronoField2)) {
                            LocalDateTime localDateTimeE = LocalDate.ofEpochDay(temporalAccessor.j(chronoField)).E(LocalTime.ofNanoOfDay(temporalAccessor.j(chronoField2)));
                            Object objD = zoneId.getRules().d(localDateTimeE);
                            if ((objD instanceof j$.time.zone.b ? (j$.time.zone.b) objD : null) == null) {
                                F = zoneId.getRules().f(localDateTimeE.B(zoneId).toInstant());
                            }
                        }
                    }
                }
                Locale locale2 = wVar.b.b;
                textStyle = TextStyle.NARROW;
                textStyle2 = this.e;
                if (textStyle2 != textStyle) {
                }
                if (str == null) {
                }
            }
        }
        sb2.append(id);
        return true;
    }

    @Override // j$.time.format.s
    public final m a(u uVar) {
        m mVar;
        if (this.e == TextStyle.NARROW) {
            return super.a(uVar);
        }
        Locale locale = uVar.a.b;
        boolean z = uVar.b;
        Set set = j$.time.zone.h.d;
        int size = set.size();
        Map map = z ? this.g : this.h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (mVar = (m) ((SoftReference) entry.getValue()).get()) != null) {
            return mVar;
        }
        m mVar2 = uVar.b ? new m(_UrlKt.FRAGMENT_ENCODE_SET, null, null) : new l(_UrlKt.FRAGMENT_ENCODE_SET, null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                mVar2.a(str, str);
                HashMap map2 = (HashMap) c0.d;
                String str2 = (String) map2.get(str);
                if (str2 == null) {
                    HashMap map3 = (HashMap) c0.g;
                    if (map3.containsKey(str)) {
                        str = (String) map3.get(str);
                        str2 = (String) map2.get(str);
                    }
                }
                if (str2 != null) {
                    Map map4 = (Map) ((HashMap) c0.f).get(str2);
                    str = (map4 == null || !map4.containsKey(locale.getCountry())) ? (String) ((HashMap) c0.e).get(str2) : (String) map4.get(locale.getCountry());
                }
                HashMap map5 = (HashMap) c0.g;
                if (map5.containsKey(str)) {
                    str = (String) map5.get(str);
                }
                for (int i2 = this.e == TextStyle.FULL ? 1 : 2; i2 < strArr.length; i2 += 2) {
                    mVar2.a(strArr[i2], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(mVar2)));
        return mVar2;
    }
}
