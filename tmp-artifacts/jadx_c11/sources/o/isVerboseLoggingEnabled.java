package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class isVerboseLoggingEnabled {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ isVerboseLoggingEnabled[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final isVerboseLoggingEnabled SERIAL = new isVerboseLoggingEnabled("SERIAL", 0);
    public static final isVerboseLoggingEnabled PARALLEL = new isVerboseLoggingEnabled("PARALLEL", 1);
    public static final isVerboseLoggingEnabled OVERRIDE = new isVerboseLoggingEnabled("OVERRIDE", 2);

    private static final /* synthetic */ isVerboseLoggingEnabled[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        isVerboseLoggingEnabled[] isverboseloggingenabledArr = {SERIAL, PARALLEL, OVERRIDE};
        int i5 = i2 + 17;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return isverboseloggingenabledArr;
        }
        throw null;
    }

    public static EnumEntries<isVerboseLoggingEnabled> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<isVerboseLoggingEnabled> enumEntries = $ENTRIES;
        int i4 = i3 + 69;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static isVerboseLoggingEnabled valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        isVerboseLoggingEnabled isverboseloggingenabled = (isVerboseLoggingEnabled) Enum.valueOf(isVerboseLoggingEnabled.class, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return isverboseloggingenabled;
        }
        obj.hashCode();
        throw null;
    }

    public static isVerboseLoggingEnabled[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        isVerboseLoggingEnabled[] isverboseloggingenabledArr = (isVerboseLoggingEnabled[]) $VALUES.clone();
        int i3 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return isverboseloggingenabledArr;
        }
        obj.hashCode();
        throw null;
    }

    private isVerboseLoggingEnabled(String str, int i) {
    }

    static {
        isVerboseLoggingEnabled[] isverboseloggingenabledArr$values = $values();
        $VALUES = isverboseloggingenabledArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(isverboseloggingenabledArr$values);
        int i = onWarmupCompleted + 67;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 90 / 0;
        }
    }
}
