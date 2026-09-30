package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class makeNativeArray {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ makeNativeArray[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final makeNativeArray SHOW_CHOICE = new makeNativeArray("SHOW_CHOICE", 0);
    public static final makeNativeArray SHOW_WRITE = new makeNativeArray("SHOW_WRITE", 1);
    public static final makeNativeArray JUMP_TO_SCHEME = new makeNativeArray("JUMP_TO_SCHEME", 2);

    private static final /* synthetic */ makeNativeArray[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        makeNativeArray[] makenativearrayArr = {SHOW_CHOICE, SHOW_WRITE, JUMP_TO_SCHEME};
        int i5 = i3 + 125;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return makenativearrayArr;
    }

    public static EnumEntries<makeNativeArray> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static makeNativeArray valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        makeNativeArray makenativearray = (makeNativeArray) Enum.valueOf(makeNativeArray.class, str);
        int i4 = onWarmupCompleted + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return makenativearray;
        }
        throw null;
    }

    public static makeNativeArray[] values() {
        makeNativeArray[] makenativearrayArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            makenativearrayArr = (makeNativeArray[]) $VALUES.clone();
            int i3 = 84 / 0;
        } else {
            makenativearrayArr = (makeNativeArray[]) $VALUES.clone();
        }
        int i4 = onNavigationEvent + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return makenativearrayArr;
        }
        throw null;
    }

    private makeNativeArray(String str, int i) {
    }

    static {
        makeNativeArray[] makenativearrayArr$values = $values();
        $VALUES = makenativearrayArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(makenativearrayArr$values);
        int i = IAuthTabCallback + 69;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
