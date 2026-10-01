package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_charset {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ deprecated_charset[] $VALUES;
    private static int IAuthTabCallback = 1;
    public static final deprecated_charset Medium = new deprecated_charset("Medium", 0, 1.5f);
    public static final deprecated_charset Small = new deprecated_charset("Small", 1, 1.35f);
    public static final deprecated_charset XSmall = new deprecated_charset("XSmall", 2, 1.252f);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final float multiplier;

    private static final /* synthetic */ deprecated_charset[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        deprecated_charset[] deprecated_charsetVarArr = {Medium, Small, XSmall};
        int i5 = i3 + 125;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return deprecated_charsetVarArr;
        }
        throw null;
    }

    public static EnumEntries<deprecated_charset> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static deprecated_charset valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        deprecated_charset deprecated_charsetVar = (deprecated_charset) Enum.valueOf(deprecated_charset.class, str);
        int i4 = onExtraCallback + 69;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return deprecated_charsetVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static deprecated_charset[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        deprecated_charset[] deprecated_charsetVarArr = $VALUES;
        if (i3 != 0) {
            return (deprecated_charset[]) deprecated_charsetVarArr.clone();
        }
        int i4 = 64 / 0;
        return (deprecated_charset[]) deprecated_charsetVarArr.clone();
    }

    private deprecated_charset(String str, int i, float f) {
        this.multiplier = f;
    }

    public final float getMultiplier() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        float f = this.multiplier;
        int i5 = i3 + 23;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    static {
        deprecated_charset[] deprecated_charsetVarArr$values = $values();
        $VALUES = deprecated_charsetVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(deprecated_charsetVarArr$values);
        int i = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
