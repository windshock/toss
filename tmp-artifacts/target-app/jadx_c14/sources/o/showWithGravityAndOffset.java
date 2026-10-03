package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class showWithGravityAndOffset {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ showWithGravityAndOffset[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final showWithGravityAndOffset POSITIVE = new showWithGravityAndOffset("POSITIVE", 0);
    public static final showWithGravityAndOffset NEGATIVE = new showWithGravityAndOffset("NEGATIVE", 1);
    public static final showWithGravityAndOffset DEFAULT = new showWithGravityAndOffset("DEFAULT", 2);
    public static final showWithGravityAndOffset CLOSE = new showWithGravityAndOffset("CLOSE", 3);
    public static final showWithGravityAndOffset UNDEFINED = new showWithGravityAndOffset("UNDEFINED", 4);
    public static final showWithGravityAndOffset NONE = new showWithGravityAndOffset("NONE", 5);

    private static final /* synthetic */ showWithGravityAndOffset[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 25;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        showWithGravityAndOffset[] showwithgravityandoffsetArr = {POSITIVE, NEGATIVE, DEFAULT, CLOSE, UNDEFINED, NONE};
        int i5 = i2 + 71;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return showwithgravityandoffsetArr;
    }

    public static EnumEntries<showWithGravityAndOffset> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 97;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<showWithGravityAndOffset> enumEntries = $ENTRIES;
        int i5 = i2 + 69;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static showWithGravityAndOffset valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        showWithGravityAndOffset showwithgravityandoffset = (showWithGravityAndOffset) Enum.valueOf(showWithGravityAndOffset.class, str);
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return showwithgravityandoffset;
    }

    public static showWithGravityAndOffset[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        showWithGravityAndOffset[] showwithgravityandoffsetArr = (showWithGravityAndOffset[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return showwithgravityandoffsetArr;
    }

    private showWithGravityAndOffset(String str, int i) {
    }

    static {
        showWithGravityAndOffset[] showwithgravityandoffsetArr$values = $values();
        $VALUES = showwithgravityandoffsetArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(showwithgravityandoffsetArr$values);
        int i = onNavigationEvent + 73;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 84 / 0;
        }
    }
}
