package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class readAsText {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ readAsText[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final readAsText ISSUE_SUCCESS = new readAsText("ISSUE_SUCCESS", 0);
    public static final readAsText APPLY_AWAIT = new readAsText("APPLY_AWAIT", 1);
    public static final readAsText NONE = new readAsText("NONE", 2);

    private static final /* synthetic */ readAsText[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        readAsText[] readastextArr = {ISSUE_SUCCESS, APPLY_AWAIT, NONE};
        int i5 = i2 + 3;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return readastextArr;
    }

    public static EnumEntries<readAsText> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static readAsText valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        readAsText readastext = (readAsText) Enum.valueOf(readAsText.class, str);
        int i4 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return readastext;
    }

    public static readAsText[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        readAsText[] readastextArr = $VALUES;
        if (i3 != 0) {
            return (readAsText[]) readastextArr.clone();
        }
        throw null;
    }

    private readAsText(String str, int i) {
    }

    static {
        readAsText[] readastextArr$values = $values();
        $VALUES = readastextArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(readastextArr$values);
        int i = onNavigationEvent + 97;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
