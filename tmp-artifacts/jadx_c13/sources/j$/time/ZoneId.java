package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.l;
import j$.time.zone.ZoneRules;
import j$.util.TimeZoneRetargetClass;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ZoneId implements Serializable {
    public static final Map a;
    private static final long serialVersionUID = 8352817235686L;

    public abstract void O(DataOutput dataOutput);

    public abstract String getId();

    public abstract ZoneRules getRules();

    public static Set<String> getAvailableZoneIds() {
        return new HashSet(j$.time.zone.h.d);
    }

    static {
        Map.Entry[] entryArr = {new AbstractMap.SimpleImmutableEntry("ACT", "Australia/Darwin"), new AbstractMap.SimpleImmutableEntry("AET", "Australia/Sydney"), new AbstractMap.SimpleImmutableEntry("AGT", "America/Argentina/Buenos_Aires"), new AbstractMap.SimpleImmutableEntry("ART", "Africa/Cairo"), new AbstractMap.SimpleImmutableEntry("AST", "America/Anchorage"), new AbstractMap.SimpleImmutableEntry("BET", "America/Sao_Paulo"), new AbstractMap.SimpleImmutableEntry("BST", "Asia/Dhaka"), new AbstractMap.SimpleImmutableEntry("CAT", "Africa/Harare"), new AbstractMap.SimpleImmutableEntry("CNT", "America/St_Johns"), new AbstractMap.SimpleImmutableEntry("CST", "America/Chicago"), new AbstractMap.SimpleImmutableEntry("CTT", "Asia/Shanghai"), new AbstractMap.SimpleImmutableEntry("EAT", "Africa/Addis_Ababa"), new AbstractMap.SimpleImmutableEntry("ECT", "Europe/Paris"), new AbstractMap.SimpleImmutableEntry("IET", "America/Indiana/Indianapolis"), new AbstractMap.SimpleImmutableEntry("IST", "Asia/Kolkata"), new AbstractMap.SimpleImmutableEntry("JST", "Asia/Tokyo"), new AbstractMap.SimpleImmutableEntry("MIT", "Pacific/Apia"), new AbstractMap.SimpleImmutableEntry("NET", "Asia/Yerevan"), new AbstractMap.SimpleImmutableEntry("NST", "Pacific/Auckland"), new AbstractMap.SimpleImmutableEntry("PLT", "Asia/Karachi"), new AbstractMap.SimpleImmutableEntry("PNT", "America/Phoenix"), new AbstractMap.SimpleImmutableEntry("PRT", "America/Puerto_Rico"), new AbstractMap.SimpleImmutableEntry("PST", "America/Los_Angeles"), new AbstractMap.SimpleImmutableEntry("SST", "Pacific/Guadalcanal"), new AbstractMap.SimpleImmutableEntry("VST", "Asia/Ho_Chi_Minh"), new AbstractMap.SimpleImmutableEntry("EST", "-05:00"), new AbstractMap.SimpleImmutableEntry("MST", "-07:00"), new AbstractMap.SimpleImmutableEntry("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        a = Collections.unmodifiableMap(map);
    }

    public static ZoneId systemDefault() {
        return TimeZoneRetargetClass.toZoneId(TimeZone.getDefault());
    }

    public static ZoneId of(String str) {
        return w(str, true);
    }

    public static ZoneId C(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.getTotalSeconds() != 0) {
            str = str.concat(zoneOffset.c);
        }
        return new t(str, new ZoneRules(zoneOffset));
    }

    public static ZoneId w(String str, boolean z) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.of(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return I(str, 3, z);
        }
        if (str.startsWith("UT")) {
            return I(str, 2, z);
        }
        return t.Q(str, z);
    }

    public static ZoneId I(String str, int i, boolean z) {
        String strSubstring = str.substring(0, i);
        if (str.length() == i) {
            return C(strSubstring, ZoneOffset.UTC);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return t.Q(str, z);
        }
        try {
            ZoneOffset zoneOffsetOf = ZoneOffset.of(str.substring(i));
            if (zoneOffsetOf == ZoneOffset.UTC) {
                return C(strSubstring, zoneOffsetOf);
            }
            return C(strSubstring, zoneOffsetOf);
        } catch (DateTimeException e) {
            throw new DateTimeException("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    public static ZoneId o(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.d(l.e);
        if (zoneId != null) {
            return zoneId;
        }
        throw new DateTimeException("Unable to obtain ZoneId from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != t.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public ZoneId normalized() {
        try {
            ZoneRules rules = getRules();
            if (rules.isFixedOffset()) {
                return rules.getOffset(Instant.c);
            }
        } catch (j$.time.zone.f unused) {
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return getId().equals(((ZoneId) obj).getId());
        }
        return false;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return getId();
    }

    private Object writeReplace() {
        return new p((byte) 7, this);
    }
}
