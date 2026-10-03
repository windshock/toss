package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class showWithGravity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ showWithGravity[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final showWithGravity LEFT = new showWithGravity("LEFT", 0);
    public static final showWithGravity RIGHT = new showWithGravity("RIGHT", 1);
    public static final showWithGravity CENTER = new showWithGravity("CENTER", 2);
    public static final showWithGravity NONE = new showWithGravity("NONE", 3);

    private static final /* synthetic */ showWithGravity[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        showWithGravity[] showwithgravityArr = {LEFT, RIGHT, CENTER, NONE};
        int i5 = i2 + 63;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return showwithgravityArr;
    }

    public static EnumEntries<showWithGravity> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<showWithGravity> enumEntries = $ENTRIES;
        int i5 = i3 + 61;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static showWithGravity valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        showWithGravity showwithgravity = (showWithGravity) Enum.valueOf(showWithGravity.class, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return showwithgravity;
        }
        obj.hashCode();
        throw null;
    }

    public static showWithGravity[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        showWithGravity[] showwithgravityArr = (showWithGravity[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return showwithgravityArr;
        }
        throw null;
    }

    private showWithGravity(String str, int i) {
    }

    static {
        showWithGravity[] showwithgravityArr$values = $values();
        $VALUES = showwithgravityArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(showwithgravityArr$values);
        int i = onWarmupCompleted + 31;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
