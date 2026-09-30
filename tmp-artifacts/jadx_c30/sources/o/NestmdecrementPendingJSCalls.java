package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class NestmdecrementPendingJSCalls {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NestmdecrementPendingJSCalls[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final NestmdecrementPendingJSCalls LOCAL = new NestmdecrementPendingJSCalls("LOCAL", 0);
    public static final NestmdecrementPendingJSCalls FOREIGNER = new NestmdecrementPendingJSCalls("FOREIGNER", 1);

    private static final /* synthetic */ NestmdecrementPendingJSCalls[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        NestmdecrementPendingJSCalls[] nestmdecrementPendingJSCallsArr = {LOCAL, FOREIGNER};
        int i5 = i3 + 11;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return nestmdecrementPendingJSCallsArr;
        }
        throw null;
    }

    public static EnumEntries<NestmdecrementPendingJSCalls> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        EnumEntries<NestmdecrementPendingJSCalls> enumEntries = $ENTRIES;
        int i5 = i3 + 111;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static NestmdecrementPendingJSCalls valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NestmdecrementPendingJSCalls nestmdecrementPendingJSCalls = (NestmdecrementPendingJSCalls) Enum.valueOf(NestmdecrementPendingJSCalls.class, str);
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        return nestmdecrementPendingJSCalls;
    }

    public static NestmdecrementPendingJSCalls[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        NestmdecrementPendingJSCalls[] nestmdecrementPendingJSCallsArr = (NestmdecrementPendingJSCalls[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 11;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return nestmdecrementPendingJSCallsArr;
    }

    private NestmdecrementPendingJSCalls(String str, int i) {
    }

    static {
        NestmdecrementPendingJSCalls[] nestmdecrementPendingJSCallsArr$values = $values();
        $VALUES = nestmdecrementPendingJSCallsArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(nestmdecrementPendingJSCallsArr$values);
        int i = onExtraCallback + 53;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
