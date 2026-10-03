package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import viva.republica.toss.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class buildArgumentExtractors {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ buildArgumentExtractors[] $VALUES;

    @SerializedName("APPLY_CANCELED")
    public static final buildArgumentExtractors APPLY_CANCELED;

    @SerializedName("REACH_FAILED")
    public static final buildArgumentExtractors REACH_FAILED;
    private final int labelResId;

    @SerializedName("NORMAL")
    public static final buildArgumentExtractors NORMAL = new buildArgumentExtractors("NORMAL", 0, R.string.app_plcc_status_normal);

    @SerializedName("DIRECT_ISSUE")
    public static final buildArgumentExtractors DIRECT_ISSUE = new buildArgumentExtractors("DIRECT_ISSUE", 1, R.string.app_plcc_status_direct_issue);

    @SerializedName("PRE_ORDER")
    public static final buildArgumentExtractors PRE_ORDER = new buildArgumentExtractors("PRE_ORDER", 2, R.string.app_plcc_status_pre_order);

    @SerializedName("APPLYING")
    public static final buildArgumentExtractors APPLYING = new buildArgumentExtractors("APPLYING", 3, R.string.app_plcc_status_applying);

    @SerializedName("UNDER_AUDIT")
    public static final buildArgumentExtractors UNDER_AUDIT = new buildArgumentExtractors("UNDER_AUDIT", 4, R.string.app_plcc_status_under_audit);

    @SerializedName("SHIPPING")
    public static final buildArgumentExtractors SHIPPING = new buildArgumentExtractors("SHIPPING", 5, R.string.app_plcc_status_shipping);

    @SerializedName("RETURN")
    public static final buildArgumentExtractors RETURN = new buildArgumentExtractors("RETURN", 6, R.string.app_plcc_status_return);

    @SerializedName("RESEND_APPLY")
    public static final buildArgumentExtractors RESEND_APPLY = new buildArgumentExtractors("RESEND_APPLY", 7, R.string.app_plcc_status_resend_apply);

    @SerializedName("PAUSE")
    public static final buildArgumentExtractors PAUSE = new buildArgumentExtractors("PAUSE", 8, R.string.app_plcc_status_pause);

    @SerializedName("LOST")
    public static final buildArgumentExtractors LOST = new buildArgumentExtractors("LOST", 9, R.string.app_plcc_status_lost);

    @SerializedName("REFUSE")
    public static final buildArgumentExtractors REFUSE = new buildArgumentExtractors("REFUSE", 10, R.string.app_plcc_status_refuse);

    @SerializedName("EXIT")
    public static final buildArgumentExtractors EXIT = new buildArgumentExtractors("EXIT", 11, R.string.app_plcc_status_exit);

    private static final /* synthetic */ buildArgumentExtractors[] $values() {
        return new buildArgumentExtractors[]{NORMAL, DIRECT_ISSUE, PRE_ORDER, APPLYING, UNDER_AUDIT, SHIPPING, RETURN, RESEND_APPLY, PAUSE, LOST, REFUSE, EXIT, APPLY_CANCELED, REACH_FAILED};
    }

    public static EnumEntries<buildArgumentExtractors> getEntries() {
        return $ENTRIES;
    }

    public static buildArgumentExtractors valueOf(String str) {
        return (buildArgumentExtractors) Enum.valueOf(buildArgumentExtractors.class, str);
    }

    public static buildArgumentExtractors[] values() {
        return (buildArgumentExtractors[]) $VALUES.clone();
    }

    private buildArgumentExtractors(String str, int i, int i2) {
        this.labelResId = i2;
    }

    public final int getLabelResId() {
        return this.labelResId;
    }

    static {
        int i = R.string.app_plcc_status_apply_canceled;
        APPLY_CANCELED = new buildArgumentExtractors("APPLY_CANCELED", 12, i);
        REACH_FAILED = new buildArgumentExtractors("REACH_FAILED", 13, i);
        buildArgumentExtractors[] buildargumentextractorsArr$values = $values();
        $VALUES = buildargumentextractorsArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(buildargumentextractorsArr$values);
    }
}
