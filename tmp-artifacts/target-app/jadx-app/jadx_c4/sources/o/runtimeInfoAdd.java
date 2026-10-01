package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class runtimeInfoAdd {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ runtimeInfoAdd[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final runtimeInfoAdd AFTER_CONFIRM = new runtimeInfoAdd("AFTER_CONFIRM", 0);
    public static final runtimeInfoAdd LATEST_RESERVATION = new runtimeInfoAdd("LATEST_RESERVATION", 1);
    public static final runtimeInfoAdd FINISHED_RESERVATION = new runtimeInfoAdd("FINISHED_RESERVATION", 2);

    private static final /* synthetic */ runtimeInfoAdd[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        runtimeInfoAdd[] runtimeinfoaddArr = {AFTER_CONFIRM, LATEST_RESERVATION, FINISHED_RESERVATION};
        int i5 = i3 + 7;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return runtimeinfoaddArr;
    }

    public static EnumEntries<runtimeInfoAdd> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 51;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<runtimeInfoAdd> enumEntries = $ENTRIES;
        int i5 = i2 + 81;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 89 / 0;
        }
        return enumEntries;
    }

    public static runtimeInfoAdd valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        runtimeInfoAdd runtimeinfoadd = (runtimeInfoAdd) Enum.valueOf(runtimeInfoAdd.class, str);
        if (i3 != 0) {
            return runtimeinfoadd;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static runtimeInfoAdd[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        runtimeInfoAdd[] runtimeinfoaddArr = (runtimeInfoAdd[]) $VALUES.clone();
        int i3 = onExtraCallbackWithResult + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return runtimeinfoaddArr;
    }

    private runtimeInfoAdd(String str, int i) {
    }

    static {
        runtimeInfoAdd[] runtimeinfoaddArr$values = $values();
        $VALUES = runtimeinfoaddArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(runtimeinfoaddArr$values);
        int i = IAuthTabCallback + 65;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
