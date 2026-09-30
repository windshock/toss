package im.toss.tds.foundation.anim.rally.effect;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RepeatType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RepeatType[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final RepeatType NORMAL = new RepeatType("NORMAL", 0);
    public static final RepeatType INFINITE = new RepeatType("INFINITE", 1);

    private static final /* synthetic */ RepeatType[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RepeatType repeatType = NORMAL;
        if (i3 != 0) {
            return new RepeatType[]{repeatType, INFINITE};
        }
        RepeatType repeatType2 = INFINITE;
        RepeatType[] repeatTypeArr = new RepeatType[5];
        repeatTypeArr[0] = repeatType;
        repeatTypeArr[1] = repeatType2;
        return repeatTypeArr;
    }

    public static EnumEntries<RepeatType> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 45;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        EnumEntries<RepeatType> enumEntries = $ENTRIES;
        int i4 = i2 + 7;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        obj.hashCode();
        throw null;
    }

    public static RepeatType valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        RepeatType repeatType = (RepeatType) Enum.valueOf(RepeatType.class, str);
        int i4 = onExtraCallback + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return repeatType;
    }

    public static RepeatType[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RepeatType[] repeatTypeArr = $VALUES;
        if (i3 != 0) {
            return (RepeatType[]) repeatTypeArr.clone();
        }
        int i4 = 69 / 0;
        return (RepeatType[]) repeatTypeArr.clone();
    }

    private RepeatType(String str, int i) {
    }

    static {
        RepeatType[] repeatTypeArr$values = $values();
        $VALUES = repeatTypeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(repeatTypeArr$values);
        int i = onNavigationEvent + 95;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
