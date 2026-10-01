package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isShowing {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ isShowing[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public static final isShowing IGNORED = new isShowing("IGNORED", 0);
    public static final isShowing VISITED = new isShowing("VISITED", 1);
    public static final isShowing ALL_ITEMS_VISITED = new isShowing("ALL_ITEMS_VISITED", 2);

    private static final /* synthetic */ isShowing[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        isShowing[] isshowingArr = {IGNORED, VISITED, ALL_ITEMS_VISITED};
        int i5 = i3 + 85;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return isshowingArr;
        }
        throw null;
    }

    public static EnumEntries<isShowing> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static isShowing valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        isShowing isshowing = (isShowing) Enum.valueOf(isShowing.class, str);
        int i4 = onWarmupCompleted + 83;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return isshowing;
    }

    public static isShowing[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        isShowing[] isshowingArr = (isShowing[]) $VALUES.clone();
        int i3 = onExtraCallback + 37;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return isshowingArr;
    }

    private isShowing(String str, int i) {
    }

    static {
        isShowing[] isshowingArr$values = $values();
        $VALUES = isshowingArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(isshowingArr$values);
        int i = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
