package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class accessgetARGUMENT_EXTRACTOR_CALLBACKcp {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ accessgetARGUMENT_EXTRACTOR_CALLBACKcp[] $VALUES;

    @SerializedName("002")
    public static final accessgetARGUMENT_EXTRACTOR_CALLBACKcp HOME = new accessgetARGUMENT_EXTRACTOR_CALLBACKcp("HOME", 0);

    @SerializedName("001")
    public static final accessgetARGUMENT_EXTRACTOR_CALLBACKcp OFFICE = new accessgetARGUMENT_EXTRACTOR_CALLBACKcp("OFFICE", 1);

    private static final /* synthetic */ accessgetARGUMENT_EXTRACTOR_CALLBACKcp[] $values() {
        return new accessgetARGUMENT_EXTRACTOR_CALLBACKcp[]{HOME, OFFICE};
    }

    public static EnumEntries<accessgetARGUMENT_EXTRACTOR_CALLBACKcp> getEntries() {
        return $ENTRIES;
    }

    public static accessgetARGUMENT_EXTRACTOR_CALLBACKcp valueOf(String str) {
        return (accessgetARGUMENT_EXTRACTOR_CALLBACKcp) Enum.valueOf(accessgetARGUMENT_EXTRACTOR_CALLBACKcp.class, str);
    }

    public static accessgetARGUMENT_EXTRACTOR_CALLBACKcp[] values() {
        return (accessgetARGUMENT_EXTRACTOR_CALLBACKcp[]) $VALUES.clone();
    }

    private accessgetARGUMENT_EXTRACTOR_CALLBACKcp(String str, int i) {
    }

    static {
        accessgetARGUMENT_EXTRACTOR_CALLBACKcp[] accessgetargument_extractor_callbackcpArr$values = $values();
        $VALUES = accessgetargument_extractor_callbackcpArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(accessgetargument_extractor_callbackcpArr$values);
    }
}
