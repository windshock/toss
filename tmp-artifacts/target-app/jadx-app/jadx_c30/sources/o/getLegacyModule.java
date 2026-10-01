package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getLegacyModule {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getLegacyModule[] $VALUES;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final getLegacyModule DEFAULT = new getLegacyModule("DEFAULT", 0);
    public static final getLegacyModule CIRCLE = new getLegacyModule("CIRCLE", 1);

    private static final /* synthetic */ getLegacyModule[] $values() {
        getLegacyModule[] getlegacymoduleArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 51;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            getlegacymoduleArr = new getLegacyModule[]{CIRCLE, DEFAULT};
        } else {
            getlegacymoduleArr = new getLegacyModule[]{DEFAULT, CIRCLE};
        }
        int i4 = i2 + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return getlegacymoduleArr;
    }

    public static EnumEntries<getLegacyModule> getEntries() {
        EnumEntries<getLegacyModule> enumEntries;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 40 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i2 + 11;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getLegacyModule valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getLegacyModule getlegacymodule = (getLegacyModule) Enum.valueOf(getLegacyModule.class, str);
        int i4 = onWarmupCompleted + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return getlegacymodule;
    }

    public static getLegacyModule[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getLegacyModule[] getlegacymoduleArr = (getLegacyModule[]) $VALUES.clone();
        int i3 = onWarmupCompleted + 105;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return getlegacymoduleArr;
    }

    private getLegacyModule(String str, int i) {
    }

    static {
        getLegacyModule[] getlegacymoduleArr$values = $values();
        $VALUES = getlegacymoduleArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getlegacymoduleArr$values);
        int i = onExtraCallback + 21;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
