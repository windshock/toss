package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosMemoryMappingBuilder {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TombstoneProtosMemoryMappingBuilder[] $VALUES;
    public static final TombstoneProtosMemoryMappingBuilder SYNCHRONIZED = new TombstoneProtosMemoryMappingBuilder("SYNCHRONIZED", 0);
    public static final TombstoneProtosMemoryMappingBuilder PUBLICATION = new TombstoneProtosMemoryMappingBuilder("PUBLICATION", 1);
    public static final TombstoneProtosMemoryMappingBuilder NONE = new TombstoneProtosMemoryMappingBuilder("NONE", 2);

    private static final /* synthetic */ TombstoneProtosMemoryMappingBuilder[] $values() {
        return new TombstoneProtosMemoryMappingBuilder[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    public static EnumEntries<TombstoneProtosMemoryMappingBuilder> getEntries() {
        return $ENTRIES;
    }

    public static TombstoneProtosMemoryMappingBuilder valueOf(String str) {
        return (TombstoneProtosMemoryMappingBuilder) Enum.valueOf(TombstoneProtosMemoryMappingBuilder.class, str);
    }

    public static TombstoneProtosMemoryMappingBuilder[] values() {
        return (TombstoneProtosMemoryMappingBuilder[]) $VALUES.clone();
    }

    private TombstoneProtosMemoryMappingBuilder(String str, int i) {
    }

    static {
        TombstoneProtosMemoryMappingBuilder[] tombstoneProtosMemoryMappingBuilderArr$values = $values();
        $VALUES = tombstoneProtosMemoryMappingBuilderArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(tombstoneProtosMemoryMappingBuilderArr$values);
    }
}
