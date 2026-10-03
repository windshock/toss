package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class isConstructed {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ isConstructed[] $VALUES;

    @SerializedName("ALL")
    public static final isConstructed ALL = new isConstructed("ALL", 0);

    @SerializedName("REFUND")
    public static final isConstructed REFUND = new isConstructed("REFUND", 1);

    @SerializedName("CHARGE")
    public static final isConstructed CHARGE = new isConstructed("CHARGE", 2);

    @SerializedName("USE")
    public static final isConstructed USE = new isConstructed("USE", 3);

    @SerializedName("PAY")
    public static final isConstructed PAY = new isConstructed("PAY", 4);

    @SerializedName("TRANSFER")
    public static final isConstructed TRANSFER = new isConstructed("TRANSFER", 5);

    private static final /* synthetic */ isConstructed[] $values() {
        return new isConstructed[]{ALL, REFUND, CHARGE, USE, PAY, TRANSFER};
    }

    public static EnumEntries<isConstructed> getEntries() {
        return $ENTRIES;
    }

    public static isConstructed valueOf(String str) {
        return (isConstructed) Enum.valueOf(isConstructed.class, str);
    }

    public static isConstructed[] values() {
        return (isConstructed[]) $VALUES.clone();
    }

    private isConstructed(String str, int i) {
    }

    static {
        isConstructed[] isconstructedArr$values = $values();
        $VALUES = isconstructedArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(isconstructedArr$values);
    }
}
