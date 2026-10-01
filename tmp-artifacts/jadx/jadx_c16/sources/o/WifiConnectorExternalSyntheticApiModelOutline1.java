package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class WifiConnectorExternalSyntheticApiModelOutline1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WifiConnectorExternalSyntheticApiModelOutline1[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public static final WifiConnectorExternalSyntheticApiModelOutline1 CREDIT_PROTECTION = new WifiConnectorExternalSyntheticApiModelOutline1("CREDIT_PROTECTION", 0);
    public static final WifiConnectorExternalSyntheticApiModelOutline1 CHANGE = new WifiConnectorExternalSyntheticApiModelOutline1("CHANGE", 1);
    public static final WifiConnectorExternalSyntheticApiModelOutline1 SCORE = new WifiConnectorExternalSyntheticApiModelOutline1("SCORE", 2);
    public static final WifiConnectorExternalSyntheticApiModelOutline1 INQUIRY = new WifiConnectorExternalSyntheticApiModelOutline1("INQUIRY", 3);
    public static final WifiConnectorExternalSyntheticApiModelOutline1 PERSONAL_INFO_CHANGE = new WifiConnectorExternalSyntheticApiModelOutline1("PERSONAL_INFO_CHANGE", 4);
    public static final WifiConnectorExternalSyntheticApiModelOutline1 OTHER = new WifiConnectorExternalSyntheticApiModelOutline1("OTHER", 5);

    private static final /* synthetic */ WifiConnectorExternalSyntheticApiModelOutline1[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 95;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        WifiConnectorExternalSyntheticApiModelOutline1[] wifiConnectorExternalSyntheticApiModelOutline1Arr = {CREDIT_PROTECTION, CHANGE, SCORE, INQUIRY, PERSONAL_INFO_CHANGE, OTHER};
        int i5 = i2 + 57;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return wifiConnectorExternalSyntheticApiModelOutline1Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<WifiConnectorExternalSyntheticApiModelOutline1> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<WifiConnectorExternalSyntheticApiModelOutline1> enumEntries = $ENTRIES;
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        return enumEntries;
    }

    public static WifiConnectorExternalSyntheticApiModelOutline1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        WifiConnectorExternalSyntheticApiModelOutline1 wifiConnectorExternalSyntheticApiModelOutline1 = (WifiConnectorExternalSyntheticApiModelOutline1) Enum.valueOf(WifiConnectorExternalSyntheticApiModelOutline1.class, str);
        int i4 = IAuthTabCallback + 113;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return wifiConnectorExternalSyntheticApiModelOutline1;
    }

    public static WifiConnectorExternalSyntheticApiModelOutline1[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        WifiConnectorExternalSyntheticApiModelOutline1[] wifiConnectorExternalSyntheticApiModelOutline1Arr = (WifiConnectorExternalSyntheticApiModelOutline1[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return wifiConnectorExternalSyntheticApiModelOutline1Arr;
    }

    private WifiConnectorExternalSyntheticApiModelOutline1(String str, int i) {
    }

    static {
        WifiConnectorExternalSyntheticApiModelOutline1[] wifiConnectorExternalSyntheticApiModelOutline1Arr$values = $values();
        $VALUES = wifiConnectorExternalSyntheticApiModelOutline1Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(wifiConnectorExternalSyntheticApiModelOutline1Arr$values);
        int i = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
