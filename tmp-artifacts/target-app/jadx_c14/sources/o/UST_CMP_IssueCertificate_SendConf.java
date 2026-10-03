package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CMP_IssueCertificate_SendConf {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UST_CMP_IssueCertificate_SendConf[] $VALUES;

    @SerializedName("BANK")
    public static final UST_CMP_IssueCertificate_SendConf BANK = new UST_CMP_IssueCertificate_SendConf("BANK", 0);

    @SerializedName("CARD")
    public static final UST_CMP_IssueCertificate_SendConf CARD = new UST_CMP_IssueCertificate_SendConf("CARD", 1);

    private static final /* synthetic */ UST_CMP_IssueCertificate_SendConf[] $values() {
        return new UST_CMP_IssueCertificate_SendConf[]{BANK, CARD};
    }

    public static EnumEntries<UST_CMP_IssueCertificate_SendConf> getEntries() {
        return $ENTRIES;
    }

    public static UST_CMP_IssueCertificate_SendConf valueOf(String str) {
        return (UST_CMP_IssueCertificate_SendConf) Enum.valueOf(UST_CMP_IssueCertificate_SendConf.class, str);
    }

    public static UST_CMP_IssueCertificate_SendConf[] values() {
        return (UST_CMP_IssueCertificate_SendConf[]) $VALUES.clone();
    }

    private UST_CMP_IssueCertificate_SendConf(String str, int i) {
    }

    static {
        UST_CMP_IssueCertificate_SendConf[] uST_CMP_IssueCertificate_SendConfArr$values = $values();
        $VALUES = uST_CMP_IssueCertificate_SendConfArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(uST_CMP_IssueCertificate_SendConfArr$values);
    }
}
