package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class putNull {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ putNull[] $VALUES;
    public static final putNull BASE = new putNull("BASE", 0);
    public static final putNull CHANGE_WITHDRAWAL_ACCOUNT = new putNull("CHANGE_WITHDRAWAL_ACCOUNT", 1);

    private static final /* synthetic */ putNull[] $values() {
        return new putNull[]{BASE, CHANGE_WITHDRAWAL_ACCOUNT};
    }

    public static EnumEntries<putNull> getEntries() {
        return $ENTRIES;
    }

    public static putNull valueOf(String str) {
        return (putNull) Enum.valueOf(putNull.class, str);
    }

    public static putNull[] values() {
        return (putNull[]) $VALUES.clone();
    }

    private putNull(String str, int i) {
    }

    static {
        putNull[] putnullArr$values = $values();
        $VALUES = putnullArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(putnullArr$values);
    }
}
