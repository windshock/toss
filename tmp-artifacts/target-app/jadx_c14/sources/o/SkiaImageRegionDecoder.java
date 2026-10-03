package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SkiaImageRegionDecoder {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SkiaImageRegionDecoder[] $VALUES;
    public static final SkiaImageRegionDecoder HEALTH_CHECK = new SkiaImageRegionDecoder("HEALTH_CHECK", 0);
    public static final SkiaImageRegionDecoder PARKING_MODE = new SkiaImageRegionDecoder("PARKING_MODE", 1);
    public static final SkiaImageRegionDecoder NETWORK = new SkiaImageRegionDecoder("NETWORK", 2);

    private static final /* synthetic */ SkiaImageRegionDecoder[] $values() {
        return new SkiaImageRegionDecoder[]{HEALTH_CHECK, PARKING_MODE, NETWORK};
    }

    public static EnumEntries<SkiaImageRegionDecoder> getEntries() {
        return $ENTRIES;
    }

    public static SkiaImageRegionDecoder valueOf(String str) {
        return (SkiaImageRegionDecoder) Enum.valueOf(SkiaImageRegionDecoder.class, str);
    }

    public static SkiaImageRegionDecoder[] values() {
        return (SkiaImageRegionDecoder[]) $VALUES.clone();
    }

    private SkiaImageRegionDecoder(String str, int i) {
    }

    static {
        SkiaImageRegionDecoder[] skiaImageRegionDecoderArr$values = $values();
        $VALUES = skiaImageRegionDecoderArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(skiaImageRegionDecoderArr$values);
    }
}
