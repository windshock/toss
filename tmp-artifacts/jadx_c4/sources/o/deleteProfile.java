package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class deleteProfile {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ deleteProfile[] $VALUES;
    public static final deleteProfile AUTO = new deleteProfile("AUTO", 0);
    public static final deleteProfile LIGHT = new deleteProfile("LIGHT", 1);
    public static final deleteProfile NIGHT = new deleteProfile("NIGHT", 2);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    private static final /* synthetic */ deleteProfile[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return new deleteProfile[]{AUTO, LIGHT, NIGHT};
        }
        deleteProfile deleteprofile = AUTO;
        deleteProfile deleteprofile2 = LIGHT;
        deleteProfile deleteprofile3 = NIGHT;
        deleteProfile[] deleteprofileArr = new deleteProfile[2];
        deleteprofileArr[1] = deleteprofile;
        deleteprofileArr[1] = deleteprofile2;
        deleteprofileArr[4] = deleteprofile3;
        return deleteprofileArr;
    }

    public static EnumEntries<deleteProfile> getEntries() {
        EnumEntries<deleteProfile> enumEntries;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 39 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 25;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static deleteProfile valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        deleteProfile deleteprofile = (deleteProfile) Enum.valueOf(deleteProfile.class, str);
        int i4 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return deleteprofile;
    }

    public static deleteProfile[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        deleteProfile[] deleteprofileArr = (deleteProfile[]) $VALUES.clone();
        int i3 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return deleteprofileArr;
    }

    private deleteProfile(String str, int i) {
    }

    static {
        deleteProfile[] deleteprofileArr$values = $values();
        $VALUES = deleteprofileArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(deleteprofileArr$values);
        int i = onExtraCallback + 15;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
