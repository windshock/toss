package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getResultData {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getResultData[] $VALUES;
    public static final getResultData WITHDRAW = new getResultData("WITHDRAW", 0);
    public static final getResultData WITHDRAW_OPEN_BANKING = new getResultData("WITHDRAW_OPEN_BANKING", 1);
    public static final getResultData TOSS_CERT = new getResultData("TOSS_CERT", 2);
    public static final getResultData INQUIRY_OPEN_BANKING = new getResultData("INQUIRY_OPEN_BANKING", 3);

    private static final /* synthetic */ getResultData[] $values() {
        return new getResultData[]{WITHDRAW, WITHDRAW_OPEN_BANKING, TOSS_CERT, INQUIRY_OPEN_BANKING};
    }

    public static EnumEntries<getResultData> getEntries() {
        return $ENTRIES;
    }

    public static getResultData valueOf(String str) {
        return (getResultData) Enum.valueOf(getResultData.class, str);
    }

    public static getResultData[] values() {
        return (getResultData[]) $VALUES.clone();
    }

    private getResultData(String str, int i) {
    }

    static {
        getResultData[] getresultdataArr$values = $values();
        $VALUES = getresultdataArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getresultdataArr$values);
    }
}
