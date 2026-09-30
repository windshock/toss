package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isEncode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ isEncode[] $VALUES;
    public static final isEncode BLUR = new isEncode("BLUR", 0);
    public static final isEncode FAKE = new isEncode("FAKE", 1);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    private static final /* synthetic */ isEncode[] $values() {
        isEncode[] isencodeArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 15;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            isEncode isencode = BLUR;
            isEncode isencode2 = FAKE;
            isencodeArr = new isEncode[3];
            isencodeArr[1] = isencode;
            isencodeArr[0] = isencode2;
        } else {
            isencodeArr = new isEncode[]{BLUR, FAKE};
        }
        int i4 = i2 + 63;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return isencodeArr;
    }

    public static EnumEntries<isEncode> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static isEncode valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        isEncode isencode = (isEncode) Enum.valueOf(isEncode.class, str);
        int i4 = onWarmupCompleted + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return isencode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static isEncode[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        isEncode[] isencodeArr = (isEncode[]) $VALUES.clone();
        int i3 = onNavigationEvent + 97;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 77 / 0;
        }
        return isencodeArr;
    }

    private isEncode(String str, int i) {
    }

    static {
        isEncode[] isencodeArr$values = $values();
        $VALUES = isencodeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(isencodeArr$values);
        int i = onExtraCallbackWithResult + 79;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
