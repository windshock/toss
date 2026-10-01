package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getVersionCode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getVersionCode[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final float value;
    public static final getVersionCode NONE = new getVersionCode("NONE", 0, 0.0f);
    public static final getVersionCode WEAK = new getVersionCode("WEAK", 1, 96.0f);
    public static final getVersionCode MEDIUM = new getVersionCode("MEDIUM", 2, 48.0f);
    public static final getVersionCode STRONG = new getVersionCode("STRONG", 3, 24.0f);
    public static final getVersionCode MAX = new getVersionCode("MAX", 4, 12.0f);

    private static final /* synthetic */ getVersionCode[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 23;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        getVersionCode[] getversioncodeArr = {NONE, WEAK, MEDIUM, STRONG, MAX};
        int i5 = i2 + 37;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return getversioncodeArr;
    }

    public static EnumEntries<getVersionCode> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<getVersionCode> enumEntries = $ENTRIES;
        int i5 = i3 + 75;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static getVersionCode valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getVersionCode getversioncode = (getVersionCode) Enum.valueOf(getVersionCode.class, str);
        int i4 = onExtraCallback + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return getversioncode;
        }
        throw null;
    }

    public static getVersionCode[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getVersionCode[] getversioncodeArr = (getVersionCode[]) $VALUES.clone();
        int i4 = onExtraCallback + 1;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return getversioncodeArr;
        }
        throw null;
    }

    private getVersionCode(String str, int i, float f) {
        this.value = f;
    }

    public final float getValue() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        float f = this.value;
        int i5 = i3 + 73;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return f;
    }

    static {
        getVersionCode[] getversioncodeArr$values = $values();
        $VALUES = getversioncodeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getversioncodeArr$values);
        int i = onExtraCallbackWithResult + 31;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
