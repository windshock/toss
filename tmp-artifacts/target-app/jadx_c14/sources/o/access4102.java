package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class access4102 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ access4102[] $VALUES;
    public static final access4102 SKIP = new access4102("SKIP", 0);
    public static final access4102 NETWORK = new access4102("NETWORK", 1);
    public static final access4102 NO_AFFILIATE = new access4102("NO_AFFILIATE", 2);
    public static final access4102 KR_MAIN_HOME = new access4102("KR_MAIN_HOME", 3);
    public static final access4102 KR_SERVICE = new access4102("KR_SERVICE", 4);

    private static final /* synthetic */ access4102[] $values() {
        return new access4102[]{SKIP, NETWORK, NO_AFFILIATE, KR_MAIN_HOME, KR_SERVICE};
    }

    public static EnumEntries<access4102> getEntries() {
        return $ENTRIES;
    }

    public static access4102 valueOf(String str) {
        return (access4102) Enum.valueOf(access4102.class, str);
    }

    public static access4102[] values() {
        return (access4102[]) $VALUES.clone();
    }

    private access4102(String str, int i) {
    }

    static {
        access4102[] access4102VarArr$values = $values();
        $VALUES = access4102VarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(access4102VarArr$values);
    }

    public final boolean getRequiresKrAffiliateScheme() {
        return this == KR_MAIN_HOME || this == KR_SERVICE;
    }
}
