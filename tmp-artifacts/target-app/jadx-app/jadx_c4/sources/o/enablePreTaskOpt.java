package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enablePreTaskOpt {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ enablePreTaskOpt[] $VALUES;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final enablePreTaskOpt NONE = new enablePreTaskOpt("NONE", 0);
    public static final enablePreTaskOpt GET_LOCAL_OR_REMOTE_CACHE = new enablePreTaskOpt("GET_LOCAL_OR_REMOTE_CACHE", 1);
    public static final enablePreTaskOpt GET_LOCAL_OR_REFRESH = new enablePreTaskOpt("GET_LOCAL_OR_REFRESH", 2);
    public static final enablePreTaskOpt REFRESH = new enablePreTaskOpt("REFRESH", 3);

    private static final /* synthetic */ enablePreTaskOpt[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        enablePreTaskOpt[] enablepretaskoptArr = {NONE, GET_LOCAL_OR_REMOTE_CACHE, GET_LOCAL_OR_REFRESH, REFRESH};
        int i5 = i3 + 119;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return enablepretaskoptArr;
    }

    public static EnumEntries<enablePreTaskOpt> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<enablePreTaskOpt> enumEntries = $ENTRIES;
        int i5 = i2 + 21;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return enumEntries;
    }

    public static enablePreTaskOpt valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        enablePreTaskOpt enablepretaskopt = (enablePreTaskOpt) Enum.valueOf(enablePreTaskOpt.class, str);
        int i4 = onWarmupCompleted + 81;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return enablepretaskopt;
    }

    public static enablePreTaskOpt[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        enablePreTaskOpt[] enablepretaskoptArr = (enablePreTaskOpt[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return enablepretaskoptArr;
    }

    private enablePreTaskOpt(String str, int i) {
    }

    static {
        enablePreTaskOpt[] enablepretaskoptArr$values = $values();
        $VALUES = enablepretaskoptArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(enablepretaskoptArr$values);
        int i = onExtraCallbackWithResult + 87;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
