package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class accessgetValueMapcp {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ accessgetValueMapcp[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String logName;

    @nc(IAuthTabCallback = "ADDITIONAL_OB")
    public static final accessgetValueMapcp ADDITIONAL_OPEN_BANKING = new accessgetValueMapcp("ADDITIONAL_OPEN_BANKING", 0, "open_banking");

    @nc(IAuthTabCallback = "ADDITIONAL_FB")
    public static final accessgetValueMapcp ADDITIONAL_FIRM_BANKING = new accessgetValueMapcp("ADDITIONAL_FIRM_BANKING", 1, "firm_banking");

    private static final /* synthetic */ accessgetValueMapcp[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        accessgetValueMapcp[] accessgetvaluemapcpArr = {ADDITIONAL_OPEN_BANKING, ADDITIONAL_FIRM_BANKING};
        int i5 = i3 + 27;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return accessgetvaluemapcpArr;
        }
        throw null;
    }

    public static EnumEntries<accessgetValueMapcp> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static accessgetValueMapcp valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        accessgetValueMapcp accessgetvaluemapcp = (accessgetValueMapcp) Enum.valueOf(accessgetValueMapcp.class, str);
        int i4 = IAuthTabCallback + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return accessgetvaluemapcp;
        }
        throw null;
    }

    public static accessgetValueMapcp[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        accessgetValueMapcp[] accessgetvaluemapcpArr = (accessgetValueMapcp[]) $VALUES.clone();
        int i3 = IAuthTabCallback + 47;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 84 / 0;
        }
        return accessgetvaluemapcpArr;
    }

    private accessgetValueMapcp(String str, int i, String str2) {
        this.logName = str2;
    }

    public final String getLogName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.logName;
        int i5 = i3 + 83;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        accessgetValueMapcp[] accessgetvaluemapcpArr$values = $values();
        $VALUES = accessgetvaluemapcpArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(accessgetvaluemapcpArr$values);
        int i = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
