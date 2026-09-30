package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getAlgorithmHash {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getAlgorithmHash[] $VALUES;
    public static final getAlgorithmHash RETRY = new getAlgorithmHash("RETRY", 0);
    public static final getAlgorithmHash MOVE_TO_FAILURE_SCREEN = new getAlgorithmHash("MOVE_TO_FAILURE_SCREEN", 1);
    public static final getAlgorithmHash MOVE_TO_FAILURE_SCREEN_WITH_IMAGE = new getAlgorithmHash("MOVE_TO_FAILURE_SCREEN_WITH_IMAGE", 2);

    private static final /* synthetic */ getAlgorithmHash[] $values() {
        return new getAlgorithmHash[]{RETRY, MOVE_TO_FAILURE_SCREEN, MOVE_TO_FAILURE_SCREEN_WITH_IMAGE};
    }

    public static EnumEntries<getAlgorithmHash> getEntries() {
        return $ENTRIES;
    }

    public static getAlgorithmHash valueOf(String str) {
        return (getAlgorithmHash) Enum.valueOf(getAlgorithmHash.class, str);
    }

    public static getAlgorithmHash[] values() {
        return (getAlgorithmHash[]) $VALUES.clone();
    }

    private getAlgorithmHash(String str, int i) {
    }

    static {
        getAlgorithmHash[] getalgorithmhashArr$values = $values();
        $VALUES = getalgorithmhashArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getalgorithmhashArr$values);
    }
}
