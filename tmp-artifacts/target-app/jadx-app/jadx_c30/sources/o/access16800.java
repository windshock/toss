package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class access16800 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ access16800[] $VALUES;
    public static final access16800 CONTINUE = new access16800("CONTINUE", 0);
    public static final access16800 SKIP_SUBTREE = new access16800("SKIP_SUBTREE", 1);
    public static final access16800 TERMINATE = new access16800("TERMINATE", 2);

    private static final /* synthetic */ access16800[] $values() {
        return new access16800[]{CONTINUE, SKIP_SUBTREE, TERMINATE};
    }

    public static EnumEntries<access16800> getEntries() {
        return $ENTRIES;
    }

    public static access16800 valueOf(String str) {
        return (access16800) Enum.valueOf(access16800.class, str);
    }

    public static access16800[] values() {
        return (access16800[]) $VALUES.clone();
    }

    private access16800(String str, int i) {
    }

    static {
        access16800[] access16800VarArr$values = $values();
        $VALUES = access16800VarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(access16800VarArr$values);
    }
}
