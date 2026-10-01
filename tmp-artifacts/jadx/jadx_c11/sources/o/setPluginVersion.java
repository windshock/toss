package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setPluginVersion {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setPluginVersion[] $VALUES;
    private static int IAuthTabCallback = 0;
    public static final setPluginVersion PW_4_DIGIT_1_ALPHA = new setPluginVersion("PW_4_DIGIT_1_ALPHA", 0);
    public static final setPluginVersion PW_6_DIGIT = new setPluginVersion("PW_6_DIGIT", 1);
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    private static final /* synthetic */ setPluginVersion[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setPluginVersion setpluginversion = PW_4_DIGIT_1_ALPHA;
        if (i3 == 0) {
            return new setPluginVersion[]{setpluginversion, PW_6_DIGIT};
        }
        setPluginVersion setpluginversion2 = PW_6_DIGIT;
        setPluginVersion[] setpluginversionArr = new setPluginVersion[4];
        setpluginversionArr[0] = setpluginversion;
        setpluginversionArr[0] = setpluginversion2;
        return setpluginversionArr;
    }

    public static EnumEntries<setPluginVersion> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<setPluginVersion> enumEntries = $ENTRIES;
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return enumEntries;
    }

    public static setPluginVersion valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setPluginVersion setpluginversion = (setPluginVersion) Enum.valueOf(setPluginVersion.class, str);
        int i4 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return setpluginversion;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static setPluginVersion[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setPluginVersion[] setpluginversionArr = (setPluginVersion[]) $VALUES.clone();
        int i4 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return setpluginversionArr;
    }

    private setPluginVersion(String str, int i) {
    }

    static {
        setPluginVersion[] setpluginversionArr$values = $values();
        $VALUES = setpluginversionArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setpluginversionArr$values);
        int i = onWarmupCompleted + 59;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final setPluginVersion not() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int i4 = IAuthTabCallback.onExtraCallbackWithResult[ordinal()];
        if (i4 != 1) {
            int i5 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return PW_4_DIGIT_1_ALPHA;
        }
        return PW_6_DIGIT;
    }
}
