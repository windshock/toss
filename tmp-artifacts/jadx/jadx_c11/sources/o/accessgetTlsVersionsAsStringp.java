package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class accessgetTlsVersionsAsStringp {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ accessgetTlsVersionsAsStringp[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final float size;
    public static final accessgetTlsVersionsAsStringp Typography1 = new accessgetTlsVersionsAsStringp("Typography1", 0, 30.0f);
    public static final accessgetTlsVersionsAsStringp SubTypography1 = new accessgetTlsVersionsAsStringp("SubTypography1", 1, 29.0f);
    public static final accessgetTlsVersionsAsStringp SubTypography2 = new accessgetTlsVersionsAsStringp("SubTypography2", 2, 28.0f);
    public static final accessgetTlsVersionsAsStringp SubTypography3 = new accessgetTlsVersionsAsStringp("SubTypography3", 3, 27.0f);
    public static final accessgetTlsVersionsAsStringp Typography2 = new accessgetTlsVersionsAsStringp("Typography2", 4, 26.0f);
    public static final accessgetTlsVersionsAsStringp SubTypography4 = new accessgetTlsVersionsAsStringp("SubTypography4", 5, 25.0f);
    public static final accessgetTlsVersionsAsStringp SubTypography5 = new accessgetTlsVersionsAsStringp("SubTypography5", 6, 24.0f);
    public static final accessgetTlsVersionsAsStringp SubTypography6 = new accessgetTlsVersionsAsStringp("SubTypography6", 7, 23.0f);
    public static final accessgetTlsVersionsAsStringp Typography3 = new accessgetTlsVersionsAsStringp("Typography3", 8, 22.0f);
    public static final accessgetTlsVersionsAsStringp SubTypography7 = new accessgetTlsVersionsAsStringp("SubTypography7", 9, 21.0f);
    public static final accessgetTlsVersionsAsStringp Typography4 = new accessgetTlsVersionsAsStringp("Typography4", 10, 20.0f);
    public static final accessgetTlsVersionsAsStringp SubTypography8 = new accessgetTlsVersionsAsStringp("SubTypography8", 11, 19.0f);
    public static final accessgetTlsVersionsAsStringp SubTypography9 = new accessgetTlsVersionsAsStringp("SubTypography9", 12, 18.0f);
    public static final accessgetTlsVersionsAsStringp Typography5 = new accessgetTlsVersionsAsStringp("Typography5", 13, 17.0f);
    public static final accessgetTlsVersionsAsStringp SubTypography10 = new accessgetTlsVersionsAsStringp("SubTypography10", 14, 16.0f);
    public static final accessgetTlsVersionsAsStringp Typography6 = new accessgetTlsVersionsAsStringp("Typography6", 15, 15.0f);
    public static final accessgetTlsVersionsAsStringp SubTypography11 = new accessgetTlsVersionsAsStringp("SubTypography11", 16, 14.0f);
    public static final accessgetTlsVersionsAsStringp Typography7 = new accessgetTlsVersionsAsStringp("Typography7", 17, 13.0f);
    public static final accessgetTlsVersionsAsStringp SubTypography12 = new accessgetTlsVersionsAsStringp("SubTypography12", 18, 12.0f);
    public static final accessgetTlsVersionsAsStringp SubTypography13 = new accessgetTlsVersionsAsStringp("SubTypography13", 19, 11.0f);

    private static final /* synthetic */ accessgetTlsVersionsAsStringp[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        accessgetTlsVersionsAsStringp[] accessgettlsversionsasstringpArr = {Typography1, SubTypography1, SubTypography2, SubTypography3, Typography2, SubTypography4, SubTypography5, SubTypography6, Typography3, SubTypography7, Typography4, SubTypography8, SubTypography9, Typography5, SubTypography10, Typography6, SubTypography11, Typography7, SubTypography12, SubTypography13};
        int i5 = i3 + 69;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return accessgettlsversionsasstringpArr;
    }

    public static EnumEntries<accessgetTlsVersionsAsStringp> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 31;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        EnumEntries<accessgetTlsVersionsAsStringp> enumEntries = $ENTRIES;
        int i4 = i2 + 63;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        obj.hashCode();
        throw null;
    }

    public static accessgetTlsVersionsAsStringp valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = (accessgetTlsVersionsAsStringp) Enum.valueOf(accessgetTlsVersionsAsStringp.class, str);
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return accessgettlsversionsasstringp;
    }

    public static accessgetTlsVersionsAsStringp[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        accessgetTlsVersionsAsStringp[] accessgettlsversionsasstringpArr = (accessgetTlsVersionsAsStringp[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 99;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return accessgettlsversionsasstringpArr;
        }
        throw null;
    }

    private accessgetTlsVersionsAsStringp(String str, int i, float f) {
        this.size = f;
    }

    public final float getSize() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = this.size;
        int i4 = i3 + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    static {
        accessgetTlsVersionsAsStringp[] accessgettlsversionsasstringpArr$values = $values();
        $VALUES = accessgettlsversionsasstringpArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(accessgettlsversionsasstringpArr$values);
        int i = onExtraCallback + 107;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
