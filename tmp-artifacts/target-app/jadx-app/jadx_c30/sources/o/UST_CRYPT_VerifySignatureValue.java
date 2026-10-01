package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UST_CRYPT_VerifySignatureValue {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UST_CRYPT_VerifySignatureValue[] $VALUES;
    public static final UST_CRYPT_VerifySignatureValue YEAR = new UST_CRYPT_VerifySignatureValue("YEAR", 0);
    public static final UST_CRYPT_VerifySignatureValue YEAR_MONTH = new UST_CRYPT_VerifySignatureValue("YEAR_MONTH", 1);
    public static final UST_CRYPT_VerifySignatureValue YEAR_MONTH_DAY = new UST_CRYPT_VerifySignatureValue("YEAR_MONTH_DAY", 2);

    private static final /* synthetic */ UST_CRYPT_VerifySignatureValue[] $values() {
        return new UST_CRYPT_VerifySignatureValue[]{YEAR, YEAR_MONTH, YEAR_MONTH_DAY};
    }

    public static EnumEntries<UST_CRYPT_VerifySignatureValue> getEntries() {
        return $ENTRIES;
    }

    public static UST_CRYPT_VerifySignatureValue valueOf(String str) {
        return (UST_CRYPT_VerifySignatureValue) Enum.valueOf(UST_CRYPT_VerifySignatureValue.class, str);
    }

    public static UST_CRYPT_VerifySignatureValue[] values() {
        return (UST_CRYPT_VerifySignatureValue[]) $VALUES.clone();
    }

    private UST_CRYPT_VerifySignatureValue(String str, int i) {
    }

    static {
        UST_CRYPT_VerifySignatureValue[] uST_CRYPT_VerifySignatureValueArr$values = $values();
        $VALUES = uST_CRYPT_VerifySignatureValueArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(uST_CRYPT_VerifySignatureValueArr$values);
    }
}
