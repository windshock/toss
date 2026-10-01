package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getFillColor {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getFillColor[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final getFillColor AVAILABLE = new getFillColor("AVAILABLE", 0);
    public static final getFillColor DISABLED_BY_PRIVACY_RIGHTS = new getFillColor("DISABLED_BY_PRIVACY_RIGHTS", 1);
    public static final getFillColor STATUS_UNAVAILABLE = new getFillColor("STATUS_UNAVAILABLE", 2);
    public static final getFillColor PRIVACY_CONSENT_NOT_READY = new getFillColor("PRIVACY_CONSENT_NOT_READY", 3);

    private static final /* synthetic */ getFillColor[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return new getFillColor[]{AVAILABLE, DISABLED_BY_PRIVACY_RIGHTS, STATUS_UNAVAILABLE, PRIVACY_CONSENT_NOT_READY};
        }
        getFillColor getfillcolor = AVAILABLE;
        getFillColor getfillcolor2 = DISABLED_BY_PRIVACY_RIGHTS;
        getFillColor getfillcolor3 = STATUS_UNAVAILABLE;
        getFillColor getfillcolor4 = PRIVACY_CONSENT_NOT_READY;
        getFillColor[] getfillcolorArr = new getFillColor[5];
        getfillcolorArr[0] = getfillcolor;
        getfillcolorArr[0] = getfillcolor2;
        getfillcolorArr[2] = getfillcolor3;
        getfillcolorArr[5] = getfillcolor4;
        return getfillcolorArr;
    }

    public static EnumEntries<getFillColor> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        EnumEntries<getFillColor> enumEntries = $ENTRIES;
        int i5 = i3 + 25;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static getFillColor valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getFillColor getfillcolor = (getFillColor) Enum.valueOf(getFillColor.class, str);
        if (i3 != 0) {
            return getfillcolor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getFillColor[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getFillColor[] getfillcolorArr = (getFillColor[]) $VALUES.clone();
        int i4 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return getfillcolorArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getFillColor(String str, int i) {
    }

    static {
        getFillColor[] getfillcolorArr$values = $values();
        $VALUES = getfillcolorArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getfillcolorArr$values);
        int i = onExtraCallback + 103;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 45 / 0;
        }
    }
}
