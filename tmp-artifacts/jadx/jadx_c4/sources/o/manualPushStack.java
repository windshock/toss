package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class manualPushStack {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ manualPushStack[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final manualPushStack LIGHT = new manualPushStack("LIGHT", 0);
    public static final manualPushStack DARK = new manualPushStack("DARK", 1);
    public static final manualPushStack NONE = new manualPushStack("NONE", 2);

    private static final /* synthetic */ manualPushStack[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        manualPushStack[] manualpushstackArr = {LIGHT, DARK, NONE};
        int i5 = i3 + 25;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return manualpushstackArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<manualPushStack> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        EnumEntries<manualPushStack> enumEntries = $ENTRIES;
        int i4 = i3 + 21;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static manualPushStack valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        manualPushStack manualpushstack = (manualPushStack) Enum.valueOf(manualPushStack.class, str);
        int i4 = onNavigationEvent + 65;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return manualpushstack;
    }

    public static manualPushStack[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        manualPushStack[] manualpushstackArr = $VALUES;
        if (i3 != 0) {
            return (manualPushStack[]) manualpushstackArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private manualPushStack(String str, int i) {
    }

    static {
        manualPushStack[] manualpushstackArr$values = $values();
        $VALUES = manualpushstackArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(manualpushstackArr$values);
        int i = onExtraCallbackWithResult + 103;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
