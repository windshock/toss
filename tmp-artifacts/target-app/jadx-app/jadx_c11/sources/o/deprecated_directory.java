package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_directory {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ deprecated_directory[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final int radius;
    public static final deprecated_directory None = new deprecated_directory("None", 0, 0);
    public static final deprecated_directory Weak = new deprecated_directory("Weak", 1, 12);
    public static final deprecated_directory Medium = new deprecated_directory("Medium", 2, 55);
    public static final deprecated_directory Strong = new deprecated_directory("Strong", 3, 80);
    public static final deprecated_directory Max = new deprecated_directory("Max", 4, 150);

    private static final /* synthetic */ deprecated_directory[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        deprecated_directory[] deprecated_directoryVarArr = {None, Weak, Medium, Strong, Max};
        int i5 = i3 + 67;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return deprecated_directoryVarArr;
    }

    public static EnumEntries<deprecated_directory> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        EnumEntries<deprecated_directory> enumEntries = $ENTRIES;
        int i5 = i3 + 79;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static deprecated_directory valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        deprecated_directory deprecated_directoryVar = (deprecated_directory) Enum.valueOf(deprecated_directory.class, str);
        if (i3 != 0) {
            return deprecated_directoryVar;
        }
        throw null;
    }

    public static deprecated_directory[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        deprecated_directory[] deprecated_directoryVarArr = (deprecated_directory[]) $VALUES.clone();
        int i4 = onNavigationEvent + 3;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return deprecated_directoryVarArr;
        }
        throw null;
    }

    private deprecated_directory(String str, int i, int i2) {
        this.radius = i2;
    }

    public final int getRadius() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.radius;
            int i5 = 26 / 0;
        } else {
            i = this.radius;
        }
        int i6 = i3 + 81;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        throw null;
    }

    static {
        deprecated_directory[] deprecated_directoryVarArr$values = $values();
        $VALUES = deprecated_directoryVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(deprecated_directoryVarArr$values);
        int i = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
