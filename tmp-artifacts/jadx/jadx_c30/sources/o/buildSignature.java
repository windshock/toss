package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class buildSignature {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ buildSignature[] $VALUES;

    @SerializedName("01")
    public static final buildSignature NEW = new buildSignature("NEW", 0);

    @SerializedName("03")
    public static final buildSignature EXIST = new buildSignature("EXIST", 1);

    @SerializedName("05")
    public static final buildSignature CHECK = new buildSignature("CHECK", 2);

    private static final /* synthetic */ buildSignature[] $values() {
        return new buildSignature[]{NEW, EXIST, CHECK};
    }

    public static EnumEntries<buildSignature> getEntries() {
        return $ENTRIES;
    }

    public static buildSignature valueOf(String str) {
        return (buildSignature) Enum.valueOf(buildSignature.class, str);
    }

    public static buildSignature[] values() {
        return (buildSignature[]) $VALUES.clone();
    }

    private buildSignature(String str, int i) {
    }

    static {
        buildSignature[] buildsignatureArr$values = $values();
        $VALUES = buildsignatureArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(buildsignatureArr$values);
    }
}
