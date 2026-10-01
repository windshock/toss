package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class isAccessibilityServiceEnabled {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ isAccessibilityServiceEnabled[] $VALUES;
    private static int IAuthTabCallback = 1;
    public static final isAccessibilityServiceEnabled NOT_NEEDED = new isAccessibilityServiceEnabled("NOT_NEEDED", 0);
    public static final isAccessibilityServiceEnabled REQUIRED = new isAccessibilityServiceEnabled("REQUIRED", 1);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    private static final /* synthetic */ isAccessibilityServiceEnabled[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        isAccessibilityServiceEnabled[] isaccessibilityserviceenabledArr = {NOT_NEEDED, REQUIRED};
        int i5 = i3 + 57;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return isaccessibilityserviceenabledArr;
    }

    public static EnumEntries<isAccessibilityServiceEnabled> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 27;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        EnumEntries<isAccessibilityServiceEnabled> enumEntries = $ENTRIES;
        int i4 = i2 + 69;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        obj.hashCode();
        throw null;
    }

    public static isAccessibilityServiceEnabled valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        isAccessibilityServiceEnabled isaccessibilityserviceenabled = (isAccessibilityServiceEnabled) Enum.valueOf(isAccessibilityServiceEnabled.class, str);
        int i4 = onExtraCallback + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return isaccessibilityserviceenabled;
        }
        throw null;
    }

    public static isAccessibilityServiceEnabled[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        isAccessibilityServiceEnabled[] isaccessibilityserviceenabledArr = (isAccessibilityServiceEnabled[]) $VALUES.clone();
        int i3 = onExtraCallback + 115;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return isaccessibilityserviceenabledArr;
        }
        obj.hashCode();
        throw null;
    }

    private isAccessibilityServiceEnabled(String str, int i) {
    }

    static {
        isAccessibilityServiceEnabled[] isaccessibilityserviceenabledArr$values = $values();
        $VALUES = isaccessibilityserviceenabledArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(isaccessibilityserviceenabledArr$values);
        int i = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
