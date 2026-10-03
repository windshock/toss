package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class nativeReadByte {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ nativeReadByte[] $VALUES;
    private static int IAuthTabCallback = 0;
    public static final nativeReadByte PW_4_DIGIT_1_ALPHA = new nativeReadByte("PW_4_DIGIT_1_ALPHA", 0);
    public static final nativeReadByte PW_6_DIGIT = new nativeReadByte("PW_6_DIGIT", 1);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    private static final /* synthetic */ nativeReadByte[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        nativeReadByte[] nativereadbyteArr = {PW_4_DIGIT_1_ALPHA, PW_6_DIGIT};
        int i5 = i3 + 115;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return nativereadbyteArr;
        }
        throw null;
    }

    public static EnumEntries<nativeReadByte> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static nativeReadByte valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        nativeReadByte nativereadbyte = (nativeReadByte) Enum.valueOf(nativeReadByte.class, str);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        int i5 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return nativereadbyte;
        }
        throw null;
    }

    public static nativeReadByte[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        nativeReadByte[] nativereadbyteArr = $VALUES;
        if (i3 == 0) {
            return (nativeReadByte[]) nativereadbyteArr.clone();
        }
        int i4 = 12 / 0;
        return (nativeReadByte[]) nativereadbyteArr.clone();
    }

    private nativeReadByte(String str, int i) {
    }

    static {
        nativeReadByte[] nativereadbyteArr$values = $values();
        $VALUES = nativereadbyteArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(nativereadbyteArr$values);
        int i = onNavigationEvent + 55;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
