package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_httpOnly {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ deprecated_httpOnly[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final deprecated_httpOnly RECT = new deprecated_httpOnly("RECT", 0);
    public static final deprecated_httpOnly ROUND_RECT = new deprecated_httpOnly("ROUND_RECT", 1);
    public static final deprecated_httpOnly CIRCLE = new deprecated_httpOnly("CIRCLE", 2);

    private static final /* synthetic */ deprecated_httpOnly[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 39;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        deprecated_httpOnly[] deprecated_httponlyArr = {RECT, ROUND_RECT, CIRCLE};
        int i5 = i2 + 73;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return deprecated_httponlyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<deprecated_httpOnly> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        EnumEntries<deprecated_httpOnly> enumEntries = $ENTRIES;
        int i4 = i3 + 73;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static deprecated_httpOnly valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        deprecated_httpOnly deprecated_httponly = (deprecated_httpOnly) Enum.valueOf(deprecated_httpOnly.class, str);
        if (i3 == 0) {
            return deprecated_httponly;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static deprecated_httpOnly[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        deprecated_httpOnly[] deprecated_httponlyArr = $VALUES;
        if (i3 != 0) {
            return (deprecated_httpOnly[]) deprecated_httponlyArr.clone();
        }
        int i4 = 45 / 0;
        return (deprecated_httpOnly[]) deprecated_httponlyArr.clone();
    }

    private deprecated_httpOnly(String str, int i) {
    }

    static {
        deprecated_httpOnly[] deprecated_httponlyArr$values = $values();
        $VALUES = deprecated_httponlyArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(deprecated_httponlyArr$values);
        int i = onNavigationEvent + 103;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
