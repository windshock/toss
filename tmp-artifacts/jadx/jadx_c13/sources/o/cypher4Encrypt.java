package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class cypher4Encrypt {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ cypher4Encrypt[] $VALUES;
    public final char begin;
    public final char end;
    public static final cypher4Encrypt OBJ = new cypher4Encrypt("OBJ", 0, '{', '}');
    public static final cypher4Encrypt LIST = new cypher4Encrypt("LIST", 1, '[', ']');
    public static final cypher4Encrypt MAP = new cypher4Encrypt("MAP", 2, '{', '}');
    public static final cypher4Encrypt POLY_OBJ = new cypher4Encrypt("POLY_OBJ", 3, '[', ']');

    private static final /* synthetic */ cypher4Encrypt[] $values() {
        return new cypher4Encrypt[]{OBJ, LIST, MAP, POLY_OBJ};
    }

    public static EnumEntries<cypher4Encrypt> getEntries() {
        return $ENTRIES;
    }

    private cypher4Encrypt(String str, int i, char c, char c2) {
        this.begin = c;
        this.end = c2;
    }

    static {
        cypher4Encrypt[] cypher4encryptArr$values = $values();
        $VALUES = cypher4encryptArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(cypher4encryptArr$values);
    }

    public static cypher4Encrypt valueOf(String str) {
        return (cypher4Encrypt) Enum.valueOf(cypher4Encrypt.class, str);
    }

    public static cypher4Encrypt[] values() {
        return (cypher4Encrypt[]) $VALUES.clone();
    }
}
