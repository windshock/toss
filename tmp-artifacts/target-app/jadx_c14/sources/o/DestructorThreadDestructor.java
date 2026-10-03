package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DestructorThreadDestructor {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DestructorThreadDestructor[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String logName;
    public static final DestructorThreadDestructor DEPOSIT = new DestructorThreadDestructor("DEPOSIT", 0, "deposit");
    public static final DestructorThreadDestructor WITHDRAW = new DestructorThreadDestructor("WITHDRAW", 1, "withdraw");

    private static final /* synthetic */ DestructorThreadDestructor[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 125;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        DestructorThreadDestructor[] destructorThreadDestructorArr = {DEPOSIT, WITHDRAW};
        int i5 = i2 + 117;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return destructorThreadDestructorArr;
    }

    public static EnumEntries<DestructorThreadDestructor> getEntries() {
        EnumEntries<DestructorThreadDestructor> enumEntries;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 37;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 72 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i2 + 31;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
        return enumEntries;
    }

    public static DestructorThreadDestructor valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        DestructorThreadDestructor destructorThreadDestructor = (DestructorThreadDestructor) Enum.valueOf(DestructorThreadDestructor.class, str);
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return destructorThreadDestructor;
    }

    public static DestructorThreadDestructor[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        DestructorThreadDestructor[] destructorThreadDestructorArr = (DestructorThreadDestructor[]) $VALUES.clone();
        int i3 = onExtraCallback + 69;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return destructorThreadDestructorArr;
        }
        throw null;
    }

    private DestructorThreadDestructor(String str, int i, String str2) {
        this.logName = str2;
    }

    public final String getLogName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 25;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.logName;
        int i5 = i2 + 97;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        DestructorThreadDestructor[] destructorThreadDestructorArr$values = $values();
        $VALUES = destructorThreadDestructorArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(destructorThreadDestructorArr$values);
        int i = onNavigationEvent + 85;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 18 / 0;
        }
    }
}
