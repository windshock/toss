package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class announceForAccessibilityWithOptions {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ announceForAccessibilityWithOptions[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    public static final announceForAccessibilityWithOptions NOT_NEEDED = new announceForAccessibilityWithOptions("NOT_NEEDED", 0);
    public static final announceForAccessibilityWithOptions EXPIRED_SOON = new announceForAccessibilityWithOptions("EXPIRED_SOON", 1);
    public static final announceForAccessibilityWithOptions REQUIRED = new announceForAccessibilityWithOptions("REQUIRED", 2);

    private static final /* synthetic */ announceForAccessibilityWithOptions[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        announceForAccessibilityWithOptions[] announceforaccessibilitywithoptionsArr = {NOT_NEEDED, EXPIRED_SOON, REQUIRED};
        int i5 = i3 + 21;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return announceforaccessibilitywithoptionsArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<announceForAccessibilityWithOptions> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<announceForAccessibilityWithOptions> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
        return enumEntries;
    }

    public static announceForAccessibilityWithOptions valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        announceForAccessibilityWithOptions announceforaccessibilitywithoptions = (announceForAccessibilityWithOptions) Enum.valueOf(announceForAccessibilityWithOptions.class, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return announceforaccessibilitywithoptions;
    }

    public static announceForAccessibilityWithOptions[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        announceForAccessibilityWithOptions[] announceforaccessibilitywithoptionsArr = $VALUES;
        if (i3 != 0) {
            return (announceForAccessibilityWithOptions[]) announceforaccessibilitywithoptionsArr.clone();
        }
        throw null;
    }

    private announceForAccessibilityWithOptions(String str, int i) {
    }

    static {
        announceForAccessibilityWithOptions[] announceforaccessibilitywithoptionsArr$values = $values();
        $VALUES = announceforaccessibilitywithoptionsArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(announceforaccessibilitywithoptionsArr$values);
        int i = onWarmupCompleted + 35;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 49 / 0;
        }
    }
}
