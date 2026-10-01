package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class allEnabledTlsVersions {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ allEnabledTlsVersions[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final int components;
    public static final allEnabledTlsVersions None = new allEnabledTlsVersions("None", 0, 0);
    public static final allEnabledTlsVersions Float = new allEnabledTlsVersions("Float", 1, 1);
    public static final allEnabledTlsVersions Float2 = new allEnabledTlsVersions("Float2", 2, 2);
    public static final allEnabledTlsVersions Float3 = new allEnabledTlsVersions("Float3", 3, 3);
    public static final allEnabledTlsVersions Float4 = new allEnabledTlsVersions("Float4", 4, 4);
    public static final allEnabledTlsVersions Mat3 = new allEnabledTlsVersions("Mat3", 5, 9);
    public static final allEnabledTlsVersions Mat4 = new allEnabledTlsVersions("Mat4", 6, 16);
    public static final allEnabledTlsVersions Int = new allEnabledTlsVersions("Int", 7, 1);
    public static final allEnabledTlsVersions Int2 = new allEnabledTlsVersions("Int2", 8, 2);
    public static final allEnabledTlsVersions Int3 = new allEnabledTlsVersions("Int3", 9, 3);
    public static final allEnabledTlsVersions Int4 = new allEnabledTlsVersions("Int4", 10, 4);
    public static final allEnabledTlsVersions Bool = new allEnabledTlsVersions("Bool", 11, 1);

    private static final /* synthetic */ allEnabledTlsVersions[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        allEnabledTlsVersions[] allenabledtlsversionsArr = {None, Float, Float2, Float3, Float4, Mat3, Mat4, Int, Int2, Int3, Int4, Bool};
        int i5 = i3 + 15;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return allenabledtlsversionsArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<allEnabledTlsVersions> getEntries() {
        EnumEntries<allEnabledTlsVersions> enumEntries;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 89;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 63 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i2 + 61;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static allEnabledTlsVersions valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        allEnabledTlsVersions allenabledtlsversions = (allEnabledTlsVersions) Enum.valueOf(allEnabledTlsVersions.class, str);
        int i4 = IAuthTabCallback + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return allenabledtlsversions;
    }

    public static allEnabledTlsVersions[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        allEnabledTlsVersions[] allenabledtlsversionsArr = (allEnabledTlsVersions[]) $VALUES.clone();
        int i4 = onNavigationEvent + 57;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return allenabledtlsversionsArr;
    }

    private allEnabledTlsVersions(String str, int i, int i2) {
        this.components = i2;
    }

    public final int getComponents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.components;
        int i5 = i3 + 93;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    static {
        allEnabledTlsVersions[] allenabledtlsversionsArr$values = $values();
        $VALUES = allenabledtlsversionsArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(allenabledtlsversionsArr$values);
        int i = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
