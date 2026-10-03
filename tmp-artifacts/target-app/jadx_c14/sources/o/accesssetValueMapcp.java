package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class accesssetValueMapcp {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ accesssetValueMapcp[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final accesssetValueMapcp TRANSFER = new accesssetValueMapcp("TRANSFER", 0);
    public static final accesssetValueMapcp PERIODIC_TRANSFER = new accesssetValueMapcp("PERIODIC_TRANSFER", 1);
    public static final accesssetValueMapcp POINT_REFUND = new accesssetValueMapcp("POINT_REFUND", 2);
    public static final accesssetValueMapcp COMPACT_TRANSFER = new accesssetValueMapcp("COMPACT_TRANSFER", 3);
    public static final accesssetValueMapcp TOSS_PLCC = new accesssetValueMapcp("TOSS_PLCC", 4);

    private static final /* synthetic */ accesssetValueMapcp[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 27;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        accesssetValueMapcp[] accesssetvaluemapcpArr = {TRANSFER, PERIODIC_TRANSFER, POINT_REFUND, COMPACT_TRANSFER, TOSS_PLCC};
        int i5 = i2 + 77;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return accesssetvaluemapcpArr;
        }
        throw null;
    }

    public static EnumEntries<accesssetValueMapcp> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 65;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<accesssetValueMapcp> enumEntries = $ENTRIES;
        int i5 = i2 + 83;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
        return enumEntries;
    }

    public static accesssetValueMapcp valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        accesssetValueMapcp accesssetvaluemapcp = (accesssetValueMapcp) Enum.valueOf(accesssetValueMapcp.class, str);
        if (i3 != 0) {
            return accesssetvaluemapcp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static accesssetValueMapcp[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        accesssetValueMapcp[] accesssetvaluemapcpArr = $VALUES;
        if (i3 == 0) {
            return (accesssetValueMapcp[]) accesssetvaluemapcpArr.clone();
        }
        throw null;
    }

    private accesssetValueMapcp(String str, int i) {
    }

    static {
        accesssetValueMapcp[] accesssetvaluemapcpArr$values = $values();
        $VALUES = accesssetvaluemapcpArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(accesssetvaluemapcpArr$values);
        int i = IAuthTabCallback + 53;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
