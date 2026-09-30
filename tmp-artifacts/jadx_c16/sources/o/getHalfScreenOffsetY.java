package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getHalfScreenOffsetY {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getHalfScreenOffsetY[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String logName;
    private final String recipientType;
    public static final getHalfScreenOffsetY TRANSFER = new getHalfScreenOffsetY("TRANSFER", 0, "T", "other_account");
    public static final getHalfScreenOffsetY DONATION = new getHalfScreenOffsetY("DONATION", 1, "D", "donation");

    private static final /* synthetic */ getHalfScreenOffsetY[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        getHalfScreenOffsetY[] gethalfscreenoffsetyArr = {TRANSFER, DONATION};
        int i5 = i2 + 121;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return gethalfscreenoffsetyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<getHalfScreenOffsetY> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 83;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<getHalfScreenOffsetY> enumEntries = $ENTRIES;
        int i5 = i2 + 77;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static getHalfScreenOffsetY valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getHalfScreenOffsetY gethalfscreenoffsety = (getHalfScreenOffsetY) Enum.valueOf(getHalfScreenOffsetY.class, str);
        int i4 = onExtraCallback + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return gethalfscreenoffsety;
    }

    public static getHalfScreenOffsetY[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getHalfScreenOffsetY[] gethalfscreenoffsetyArr = $VALUES;
        if (i3 != 0) {
            return (getHalfScreenOffsetY[]) gethalfscreenoffsetyArr.clone();
        }
        int i4 = 97 / 0;
        return (getHalfScreenOffsetY[]) gethalfscreenoffsetyArr.clone();
    }

    private getHalfScreenOffsetY(String str, int i, String str2, String str3) {
        this.recipientType = str2;
        this.logName = str3;
    }

    public final String getRecipientType() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.recipientType;
        int i5 = i2 + 95;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLogName() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.logName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        getHalfScreenOffsetY[] gethalfscreenoffsetyArr$values = $values();
        $VALUES = gethalfscreenoffsetyArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(gethalfscreenoffsetyArr$values);
        int i = onWarmupCompleted + 13;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
