package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class protocols {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ protocols[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final protocols None = new protocols("None", 0);
    public static final protocols Child = new protocols("Child", 1);
    public static final protocols Stack = new protocols("Stack", 2);

    private static final /* synthetic */ protocols[] $values() {
        protocols[] protocolsVarArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 123;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            protocols protocolsVar = None;
            protocolsVarArr = new protocols[]{Child, protocolsVar};
            protocolsVarArr[4] = Stack;
        } else {
            protocolsVarArr = new protocols[]{None, Child, Stack};
        }
        int i4 = i2 + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return protocolsVarArr;
        }
        throw null;
    }

    public static EnumEntries<protocols> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 95;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<protocols> enumEntries = $ENTRIES;
        int i5 = i2 + 99;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static protocols valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        protocols protocolsVar = (protocols) Enum.valueOf(protocols.class, str);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 117;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return protocolsVar;
        }
        throw null;
    }

    public static protocols[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        protocols[] protocolsVarArr = $VALUES;
        if (i3 == 0) {
            return (protocols[]) protocolsVarArr.clone();
        }
        int i4 = 53 / 0;
        return (protocols[]) protocolsVarArr.clone();
    }

    private protocols(String str, int i) {
    }

    static {
        protocols[] protocolsVarArr$values = $values();
        $VALUES = protocolsVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(protocolsVarArr$values);
        int i = onExtraCallback + 121;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
