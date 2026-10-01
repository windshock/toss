package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class startRearDisplaySession {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ startRearDisplaySession[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String level;
    public static final startRearDisplaySession LOW = new startRearDisplaySession("LOW", 0, "LOW");
    public static final startRearDisplaySession HIGH = new startRearDisplaySession("HIGH", 1, "HIGH");
    public static final startRearDisplaySession MAX = new startRearDisplaySession("MAX", 2, "MAX");

    private static final /* synthetic */ startRearDisplaySession[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return new startRearDisplaySession[]{LOW, HIGH, MAX};
        }
        startRearDisplaySession startreardisplaysession = LOW;
        startRearDisplaySession startreardisplaysession2 = HIGH;
        startRearDisplaySession startreardisplaysession3 = MAX;
        startRearDisplaySession[] startreardisplaysessionArr = new startRearDisplaySession[2];
        startreardisplaysessionArr[0] = startreardisplaysession;
        startreardisplaysessionArr[0] = startreardisplaysession2;
        startreardisplaysessionArr[3] = startreardisplaysession3;
        return startreardisplaysessionArr;
    }

    public static EnumEntries<startRearDisplaySession> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<startRearDisplaySession> enumEntries = $ENTRIES;
        int i5 = i3 + 69;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
        return enumEntries;
    }

    public static startRearDisplaySession valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        startRearDisplaySession startreardisplaysession = (startRearDisplaySession) Enum.valueOf(startRearDisplaySession.class, str);
        int i4 = IAuthTabCallback + 27;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return startreardisplaysession;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static startRearDisplaySession[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        startRearDisplaySession[] startreardisplaysessionArr = $VALUES;
        if (i3 == 0) {
            return (startRearDisplaySession[]) startreardisplaysessionArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private startRearDisplaySession(String str, int i, String str2) {
        this.level = str2;
    }

    public final String getLevel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.level;
        int i5 = i3 + 89;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        startRearDisplaySession[] startreardisplaysessionArr$values = $values();
        $VALUES = startreardisplaysessionArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(startreardisplaysessionArr$values);
        int i = onNavigationEvent + 49;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
