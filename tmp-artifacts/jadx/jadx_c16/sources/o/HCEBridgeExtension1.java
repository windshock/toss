package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class HCEBridgeExtension1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HCEBridgeExtension1[] $VALUES;
    public static final onExtraCallback Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final HCEBridgeExtension1 VIMP = new HCEBridgeExtension1("VIMP", 0);
    public static final HCEBridgeExtension1 IMP_1PX = new HCEBridgeExtension1("IMP_1PX", 1);
    public static final HCEBridgeExtension1 IMP_100P = new HCEBridgeExtension1("IMP_100P", 2);
    public static final HCEBridgeExtension1 CLICK_EXPAND = new HCEBridgeExtension1("CLICK_EXPAND", 3);
    public static final HCEBridgeExtension1 CLICK_OUTLANDING = new HCEBridgeExtension1("CLICK_OUTLANDING", 4);
    public static final HCEBridgeExtension1 VIEW = new HCEBridgeExtension1("VIEW", 5);
    public static final HCEBridgeExtension1 VIEW_25P = new HCEBridgeExtension1("VIEW_25P", 6);
    public static final HCEBridgeExtension1 VIEW_50P = new HCEBridgeExtension1("VIEW_50P", 7);
    public static final HCEBridgeExtension1 VIEW_75P = new HCEBridgeExtension1("VIEW_75P", 8);
    public static final HCEBridgeExtension1 VIEW_COMPLETE = new HCEBridgeExtension1("VIEW_COMPLETE", 9);
    public static final HCEBridgeExtension1 VIEW_3S = new HCEBridgeExtension1("VIEW_3S", 10);

    private static final /* synthetic */ HCEBridgeExtension1[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 17;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        HCEBridgeExtension1[] hCEBridgeExtension1Arr = {VIMP, IMP_1PX, IMP_100P, CLICK_EXPAND, CLICK_OUTLANDING, VIEW, VIEW_25P, VIEW_50P, VIEW_75P, VIEW_COMPLETE, VIEW_3S};
        int i5 = i2 + 83;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
        return hCEBridgeExtension1Arr;
    }

    public static EnumEntries<HCEBridgeExtension1> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<HCEBridgeExtension1> enumEntries = $ENTRIES;
        int i5 = i3 + 59;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }

    public static HCEBridgeExtension1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        HCEBridgeExtension1 hCEBridgeExtension1 = (HCEBridgeExtension1) Enum.valueOf(HCEBridgeExtension1.class, str);
        int i4 = onNavigationEvent + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return hCEBridgeExtension1;
    }

    public static HCEBridgeExtension1[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        HCEBridgeExtension1[] hCEBridgeExtension1Arr = $VALUES;
        if (i3 == 0) {
            return (HCEBridgeExtension1[]) hCEBridgeExtension1Arr.clone();
        }
        throw null;
    }

    private HCEBridgeExtension1(String str, int i) {
    }

    static {
        HCEBridgeExtension1[] hCEBridgeExtension1Arr$values = $values();
        $VALUES = hCEBridgeExtension1Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(hCEBridgeExtension1Arr$values);
        Companion = new onExtraCallback((DefaultConstructorMarker) null);
        int i = onWarmupCompleted + 57;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getApiEventType() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 16 / 0;
            switch (IAuthTabCallback.IAuthTabCallback[ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return "IMP";
                case 4:
                case 5:
                    return "CLK";
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    int i4 = onNavigationEvent + 41;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        return "PLAY";
                    }
                    throw null;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        switch (IAuthTabCallback.IAuthTabCallback[ordinal()]) {
            case 1:
            case 2:
            case 3:
                return "IMP";
            case 4:
            case 5:
                return "CLK";
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final String getApiEventIdentifier() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        switch (IAuthTabCallback.IAuthTabCallback[ordinal()]) {
            case 1:
                return "VIMP";
            case 2:
                return "IMP_1PX";
            case 3:
                return "IMP_100P";
            case 4:
                return "CLICK_EXPAND";
            case 5:
                return "CLICK_OUTLANDING";
            case 6:
                return "VIEW";
            case 7:
                int i4 = onNavigationEvent + 123;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return "VIEW_25P";
                }
                throw null;
            case 8:
                return "VIEW_50P";
            case 9:
                return "VIEW_75P";
            case 10:
                return "VIEW_COMPLETE";
            case 11:
                return "VIEW_3S";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Integer getVideoPlayPercent() {
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 87;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0 ? (i = IAuthTabCallback.IAuthTabCallback[ordinal()]) == 7 : (i = IAuthTabCallback.IAuthTabCallback[ordinal()]) == 121) {
            return 25;
        }
        if (i != 8) {
            return i != 9 ? null : 75;
        }
        int i4 = onNavigationEvent + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return 50;
    }
}
