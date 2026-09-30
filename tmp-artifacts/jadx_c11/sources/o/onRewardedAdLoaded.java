package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onRewardedAdLoaded {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ onRewardedAdLoaded[] $VALUES;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final onRewardedAdLoaded NotCreated = new onRewardedAdLoaded("NotCreated", 0);
    public static final onRewardedAdLoaded Created = new onRewardedAdLoaded("Created", 1);
    public static final onRewardedAdLoaded Hidden = new onRewardedAdLoaded("Hidden", 2);
    public static final onRewardedAdLoaded Shown = new onRewardedAdLoaded("Shown", 3);
    public static final onRewardedAdLoaded Removed = new onRewardedAdLoaded("Removed", 4);
    public static final onRewardedAdLoaded Destroyed = new onRewardedAdLoaded("Destroyed", 5);

    private static final /* synthetic */ onRewardedAdLoaded[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        onRewardedAdLoaded[] onrewardedadloadedArr = {NotCreated, Created, Hidden, Shown, Removed, Destroyed};
        int i5 = i3 + 83;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return onrewardedadloadedArr;
    }

    public static EnumEntries<onRewardedAdLoaded> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static onRewardedAdLoaded valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onRewardedAdLoaded onrewardedadloaded = (onRewardedAdLoaded) Enum.valueOf(onRewardedAdLoaded.class, str);
        int i4 = onNavigationEvent + 21;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return onrewardedadloaded;
        }
        throw null;
    }

    public static onRewardedAdLoaded[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onRewardedAdLoaded[] onrewardedadloadedArr = (onRewardedAdLoaded[]) $VALUES.clone();
        int i4 = onNavigationEvent + 99;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return onrewardedadloadedArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private onRewardedAdLoaded(String str, int i) {
    }

    static {
        onRewardedAdLoaded[] onrewardedadloadedArr$values = $values();
        $VALUES = onrewardedadloadedArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(onrewardedadloadedArr$values);
        int i = onExtraCallback + 21;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
