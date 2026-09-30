package kotlin.text;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.access15300;
import o.removeMemoryMappings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RegexOption implements removeMemoryMappings {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RegexOption[] $VALUES;
    public static final RegexOption CANON_EQ;
    public static final RegexOption COMMENTS;
    public static final RegexOption DOT_MATCHES_ALL;
    public static final RegexOption IGNORE_CASE;
    public static final RegexOption LITERAL;
    public static final RegexOption MULTILINE;
    public static final RegexOption UNIX_LINES;
    private final int mask;
    private final int value;

    private static final /* synthetic */ RegexOption[] $values() {
        return new RegexOption[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    public static EnumEntries<RegexOption> getEntries() {
        return $ENTRIES;
    }

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) $VALUES.clone();
    }

    private RegexOption(String str, int i, int i2, int i3) {
        this.value = i2;
        this.mask = i3;
    }

    /* synthetic */ RegexOption(String str, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i4 & 2) != 0 ? i2 : i3);
    }

    @Override // o.removeMemoryMappings
    public int getMask() {
        return this.mask;
    }

    @Override // o.removeMemoryMappings
    public int getValue() {
        return this.value;
    }

    static {
        int i = 2;
        IGNORE_CASE = new RegexOption("IGNORE_CASE", 0, i, 0, 2, null);
        int i2 = 0;
        int i3 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        MULTILINE = new RegexOption("MULTILINE", 1, 8, i2, i3, defaultConstructorMarker);
        int i4 = 0;
        int i5 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        LITERAL = new RegexOption("LITERAL", i, 16, i4, i5, defaultConstructorMarker2);
        UNIX_LINES = new RegexOption("UNIX_LINES", 3, 1, i2, i3, defaultConstructorMarker);
        COMMENTS = new RegexOption("COMMENTS", 4, 4, i4, i5, defaultConstructorMarker2);
        DOT_MATCHES_ALL = new RegexOption("DOT_MATCHES_ALL", 5, 32, i2, i3, defaultConstructorMarker);
        CANON_EQ = new RegexOption("CANON_EQ", 6, 128, i4, i5, defaultConstructorMarker2);
        RegexOption[] regexOptionArr$values = $values();
        $VALUES = regexOptionArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(regexOptionArr$values);
    }
}
