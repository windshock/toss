package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.certificatePinner, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class EnumC0079certificatePinner {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC0079certificatePinner[] $VALUES;
    private static int IAuthTabCallback = 0;
    public static final EnumC0079certificatePinner X = new EnumC0079certificatePinner("X", 0);
    public static final EnumC0079certificatePinner Y = new EnumC0079certificatePinner("Y", 1);
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    private static final /* synthetic */ EnumC0079certificatePinner[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return new EnumC0079certificatePinner[]{X, Y};
    }

    public static EnumEntries<EnumC0079certificatePinner> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<EnumC0079certificatePinner> enumEntries = $ENTRIES;
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return enumEntries;
    }

    public static EnumC0079certificatePinner valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumC0079certificatePinner enumC0079certificatePinner = (EnumC0079certificatePinner) Enum.valueOf(EnumC0079certificatePinner.class, str);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return enumC0079certificatePinner;
    }

    public static EnumC0079certificatePinner[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        EnumC0079certificatePinner[] enumC0079certificatePinnerArr = (EnumC0079certificatePinner[]) $VALUES.clone();
        int i4 = onNavigationEvent + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return enumC0079certificatePinnerArr;
    }

    private EnumC0079certificatePinner(String str, int i) {
    }

    static {
        EnumC0079certificatePinner[] enumC0079certificatePinnerArr$values = $values();
        $VALUES = enumC0079certificatePinnerArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(enumC0079certificatePinnerArr$values);
        int i = onWarmupCompleted + 29;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
