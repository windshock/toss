package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setRegionDecoderFactory {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setRegionDecoderFactory[] $VALUES;
    private final boolean isMultiSelection;
    private final String logValue;
    public static final setRegionDecoderFactory NORMAL = new setRegionDecoderFactory("NORMAL", 0, false, "NORMAL");
    public static final setRegionDecoderFactory DUTCH = new setRegionDecoderFactory(formatToParts.TYPE_DUTCH, 1, true, "SELECT_DUTCH");
    public static final setRegionDecoderFactory HIDE = new setRegionDecoderFactory("HIDE", 2, true, "SELECT_HIDE");

    private static final /* synthetic */ setRegionDecoderFactory[] $values() {
        return new setRegionDecoderFactory[]{NORMAL, DUTCH, HIDE};
    }

    public static EnumEntries<setRegionDecoderFactory> getEntries() {
        return $ENTRIES;
    }

    public static setRegionDecoderFactory valueOf(String str) {
        return (setRegionDecoderFactory) Enum.valueOf(setRegionDecoderFactory.class, str);
    }

    public static setRegionDecoderFactory[] values() {
        return (setRegionDecoderFactory[]) $VALUES.clone();
    }

    private setRegionDecoderFactory(String str, int i, boolean z, String str2) {
        this.isMultiSelection = z;
        this.logValue = str2;
    }

    public final boolean isMultiSelection() {
        return this.isMultiSelection;
    }

    public final String getLogValue() {
        return this.logValue;
    }

    static {
        setRegionDecoderFactory[] setregiondecoderfactoryArr$values = $values();
        $VALUES = setregiondecoderfactoryArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setregiondecoderfactoryArr$values);
    }
}
