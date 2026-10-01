package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AOMPFileTinyAppUtils {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AOMPFileTinyAppUtils[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final AOMPFileTinyAppUtils REDEEMABLE = new AOMPFileTinyAppUtils("REDEEMABLE", 0);
    public static final AOMPFileTinyAppUtils EXPIRED = new AOMPFileTinyAppUtils("EXPIRED", 1);
    public static final AOMPFileTinyAppUtils ALREADY_REDEEMED = new AOMPFileTinyAppUtils("ALREADY_REDEEMED", 2);
    public static final AOMPFileTinyAppUtils CURRENTLY_SUBSCRIBED = new AOMPFileTinyAppUtils("CURRENTLY_SUBSCRIBED", 3);

    private static final /* synthetic */ AOMPFileTinyAppUtils[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        AOMPFileTinyAppUtils[] aOMPFileTinyAppUtilsArr = {REDEEMABLE, EXPIRED, ALREADY_REDEEMED, CURRENTLY_SUBSCRIBED};
        int i5 = i3 + 75;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return aOMPFileTinyAppUtilsArr;
    }

    public static EnumEntries<AOMPFileTinyAppUtils> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<AOMPFileTinyAppUtils> enumEntries = $ENTRIES;
        int i5 = i3 + 103;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static AOMPFileTinyAppUtils valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AOMPFileTinyAppUtils aOMPFileTinyAppUtils = (AOMPFileTinyAppUtils) Enum.valueOf(AOMPFileTinyAppUtils.class, str);
        if (i3 != 0) {
            return aOMPFileTinyAppUtils;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AOMPFileTinyAppUtils[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AOMPFileTinyAppUtils[] aOMPFileTinyAppUtilsArr = (AOMPFileTinyAppUtils[]) $VALUES.clone();
        int i4 = onExtraCallback + 61;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return aOMPFileTinyAppUtilsArr;
    }

    private AOMPFileTinyAppUtils(String str, int i) {
    }

    static {
        AOMPFileTinyAppUtils[] aOMPFileTinyAppUtilsArr$values = $values();
        $VALUES = aOMPFileTinyAppUtilsArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(aOMPFileTinyAppUtilsArr$values);
        int i = onExtraCallbackWithResult + 87;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 74 / 0;
        }
    }
}
