package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getSwitchValue {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getSwitchValue[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    public static final getSwitchValue OPTIONAL = new getSwitchValue("OPTIONAL", 0);
    public static final getSwitchValue MANDATORY = new getSwitchValue("MANDATORY", 1);

    private static final /* synthetic */ getSwitchValue[] $values() {
        getSwitchValue[] getswitchvalueArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 25;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            getswitchvalueArr = new getSwitchValue[]{MANDATORY, OPTIONAL};
        } else {
            getswitchvalueArr = new getSwitchValue[]{OPTIONAL, MANDATORY};
        }
        int i4 = i2 + 87;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return getswitchvalueArr;
        }
        throw null;
    }

    public static EnumEntries<getSwitchValue> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<getSwitchValue> enumEntries = $ENTRIES;
        int i5 = i3 + 63;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return enumEntries;
    }

    public static getSwitchValue valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getSwitchValue getswitchvalue = (getSwitchValue) Enum.valueOf(getSwitchValue.class, str);
        int i4 = IAuthTabCallback + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return getswitchvalue;
    }

    public static getSwitchValue[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getSwitchValue[] getswitchvalueArr = (getSwitchValue[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return getswitchvalueArr;
    }

    private getSwitchValue(String str, int i) {
    }

    static {
        getSwitchValue[] getswitchvalueArr$values = $values();
        $VALUES = getswitchvalueArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getswitchvalueArr$values);
        int i = onExtraCallbackWithResult + 39;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 65 / 0;
        }
    }
}
