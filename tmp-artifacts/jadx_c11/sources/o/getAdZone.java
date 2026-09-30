package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getAdZone {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getAdZone[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    public static final getAdZone OutsideClick = new getAdZone("OutsideClick", 0);
    public static final getAdZone BackPress = new getAdZone("BackPress", 1);
    public static final getAdZone NavigationBackClick = new getAdZone("NavigationBackClick", 2);

    private static final /* synthetic */ getAdZone[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        getAdZone[] getadzoneArr = {OutsideClick, BackPress, NavigationBackClick};
        int i5 = i2 + 47;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return getadzoneArr;
    }

    public static EnumEntries<getAdZone> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        EnumEntries<getAdZone> enumEntries = $ENTRIES;
        int i5 = i3 + 11;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static getAdZone valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getAdZone getadzone = (getAdZone) Enum.valueOf(getAdZone.class, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 29;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return getadzone;
        }
        throw null;
    }

    public static getAdZone[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getAdZone[] getadzoneArr = (getAdZone[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return getadzoneArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getAdZone(String str, int i) {
    }

    static {
        getAdZone[] getadzoneArr$values = $values();
        $VALUES = getadzoneArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getadzoneArr$values);
        int i = onExtraCallbackWithResult + 121;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
