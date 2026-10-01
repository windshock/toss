package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableNebulaServiceInitOpt {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ enableNebulaServiceInitOpt[] $VALUES;
    public static final enableNebulaServiceInitOpt KCB = new enableNebulaServiceInitOpt("KCB", 0);
    public static final enableNebulaServiceInitOpt NICE = new enableNebulaServiceInitOpt("NICE", 1);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    private static final /* synthetic */ enableNebulaServiceInitOpt[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        enableNebulaServiceInitOpt enablenebulaserviceinitopt = KCB;
        if (i3 == 0) {
            return new enableNebulaServiceInitOpt[]{enablenebulaserviceinitopt, NICE};
        }
        enableNebulaServiceInitOpt enablenebulaserviceinitopt2 = NICE;
        enableNebulaServiceInitOpt[] enablenebulaserviceinitoptArr = new enableNebulaServiceInitOpt[3];
        enablenebulaserviceinitoptArr[0] = enablenebulaserviceinitopt;
        enablenebulaserviceinitoptArr[1] = enablenebulaserviceinitopt2;
        return enablenebulaserviceinitoptArr;
    }

    public static EnumEntries<enableNebulaServiceInitOpt> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<enableNebulaServiceInitOpt> enumEntries = $ENTRIES;
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return enumEntries;
    }

    public static enableNebulaServiceInitOpt valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        enableNebulaServiceInitOpt enablenebulaserviceinitopt = (enableNebulaServiceInitOpt) Enum.valueOf(enableNebulaServiceInitOpt.class, str);
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        return enablenebulaserviceinitopt;
    }

    public static enableNebulaServiceInitOpt[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        enableNebulaServiceInitOpt[] enablenebulaserviceinitoptArr = (enableNebulaServiceInitOpt[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return enablenebulaserviceinitoptArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private enableNebulaServiceInitOpt(String str, int i) {
    }

    static {
        enableNebulaServiceInitOpt[] enablenebulaserviceinitoptArr$values = $values();
        $VALUES = enablenebulaserviceinitoptArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(enablenebulaserviceinitoptArr$values);
        int i = onExtraCallback + 51;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
