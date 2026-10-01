package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getJSArgumentsNeeded {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getJSArgumentsNeeded[] $VALUES;

    @SerializedName("99")
    public static final getJSArgumentsNeeded ETC;

    @SerializedName("04")
    public static final getJSArgumentsNeeded PUBLIC_OFFICER;
    private final String code;
    private final String displayName;
    private final boolean infoRequired;

    @SerializedName("01")
    public static final getJSArgumentsNeeded WAGE_EARNER = new getJSArgumentsNeeded("WAGE_EARNER", 0, "01", "직장인", true);

    @SerializedName("02")
    public static final getJSArgumentsNeeded PROFESSIONAL = new getJSArgumentsNeeded("PROFESSIONAL", 1, "02", "전문직", false, 4, null);

    @SerializedName("03")
    public static final getJSArgumentsNeeded SELF_EMPLOYED = new getJSArgumentsNeeded("SELF_EMPLOYED", 2, "03", "개인사업자", false, 4, null);

    @SerializedName("05")
    public static final getJSArgumentsNeeded PENSION_EARNER = new getJSArgumentsNeeded("PENSION_EARNER", 4, "05", "연금소득자", false, 4, null);

    private static final /* synthetic */ getJSArgumentsNeeded[] $values() {
        return new getJSArgumentsNeeded[]{WAGE_EARNER, PROFESSIONAL, SELF_EMPLOYED, PUBLIC_OFFICER, PENSION_EARNER, ETC};
    }

    public static EnumEntries<getJSArgumentsNeeded> getEntries() {
        return $ENTRIES;
    }

    public static getJSArgumentsNeeded valueOf(String str) {
        return (getJSArgumentsNeeded) Enum.valueOf(getJSArgumentsNeeded.class, str);
    }

    public static getJSArgumentsNeeded[] values() {
        return (getJSArgumentsNeeded[]) $VALUES.clone();
    }

    private getJSArgumentsNeeded(String str, int i, String str2, String str3, boolean z) {
        this.code = str2;
        this.displayName = str3;
        this.infoRequired = z;
    }

    /* synthetic */ getJSArgumentsNeeded(String str, int i, String str2, String str3, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, (i2 & 4) != 0 ? false : z);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final boolean getInfoRequired() {
        return this.infoRequired;
    }

    static {
        boolean z = false;
        int i = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        PUBLIC_OFFICER = new getJSArgumentsNeeded("PUBLIC_OFFICER", 3, "04", "공무원", z, i, defaultConstructorMarker);
        ETC = new getJSArgumentsNeeded("ETC", 5, "99", "기타", z, i, defaultConstructorMarker);
        getJSArgumentsNeeded[] getjsargumentsneededArr$values = $values();
        $VALUES = getjsargumentsneededArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getjsargumentsneededArr$values);
    }
}
