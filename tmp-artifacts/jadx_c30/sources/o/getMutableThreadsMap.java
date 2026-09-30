package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import o.getMutableThreadsMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getMutableThreadsMap {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getMutableThreadsMap[] $VALUES;
    public static final onWarmupCompleted Companion;
    private static final Lazy<Map<Integer, getMutableThreadsMap>> directionalityMap$delegate;
    private final int value;
    public static final getMutableThreadsMap UNDEFINED = new getMutableThreadsMap(getUniqueNativeAdCount.UNDEFINED, 0, -1);
    public static final getMutableThreadsMap LEFT_TO_RIGHT = new getMutableThreadsMap("LEFT_TO_RIGHT", 1, 0);
    public static final getMutableThreadsMap RIGHT_TO_LEFT = new getMutableThreadsMap("RIGHT_TO_LEFT", 2, 1);
    public static final getMutableThreadsMap RIGHT_TO_LEFT_ARABIC = new getMutableThreadsMap("RIGHT_TO_LEFT_ARABIC", 3, 2);
    public static final getMutableThreadsMap EUROPEAN_NUMBER = new getMutableThreadsMap("EUROPEAN_NUMBER", 4, 3);
    public static final getMutableThreadsMap EUROPEAN_NUMBER_SEPARATOR = new getMutableThreadsMap("EUROPEAN_NUMBER_SEPARATOR", 5, 4);
    public static final getMutableThreadsMap EUROPEAN_NUMBER_TERMINATOR = new getMutableThreadsMap("EUROPEAN_NUMBER_TERMINATOR", 6, 5);
    public static final getMutableThreadsMap ARABIC_NUMBER = new getMutableThreadsMap("ARABIC_NUMBER", 7, 6);
    public static final getMutableThreadsMap COMMON_NUMBER_SEPARATOR = new getMutableThreadsMap("COMMON_NUMBER_SEPARATOR", 8, 7);
    public static final getMutableThreadsMap NONSPACING_MARK = new getMutableThreadsMap("NONSPACING_MARK", 9, 8);
    public static final getMutableThreadsMap BOUNDARY_NEUTRAL = new getMutableThreadsMap("BOUNDARY_NEUTRAL", 10, 9);
    public static final getMutableThreadsMap PARAGRAPH_SEPARATOR = new getMutableThreadsMap("PARAGRAPH_SEPARATOR", 11, 10);
    public static final getMutableThreadsMap SEGMENT_SEPARATOR = new getMutableThreadsMap("SEGMENT_SEPARATOR", 12, 11);
    public static final getMutableThreadsMap WHITESPACE = new getMutableThreadsMap("WHITESPACE", 13, 12);
    public static final getMutableThreadsMap OTHER_NEUTRALS = new getMutableThreadsMap("OTHER_NEUTRALS", 14, 13);
    public static final getMutableThreadsMap LEFT_TO_RIGHT_EMBEDDING = new getMutableThreadsMap("LEFT_TO_RIGHT_EMBEDDING", 15, 14);
    public static final getMutableThreadsMap LEFT_TO_RIGHT_OVERRIDE = new getMutableThreadsMap("LEFT_TO_RIGHT_OVERRIDE", 16, 15);
    public static final getMutableThreadsMap RIGHT_TO_LEFT_EMBEDDING = new getMutableThreadsMap("RIGHT_TO_LEFT_EMBEDDING", 17, 16);
    public static final getMutableThreadsMap RIGHT_TO_LEFT_OVERRIDE = new getMutableThreadsMap("RIGHT_TO_LEFT_OVERRIDE", 18, 17);
    public static final getMutableThreadsMap POP_DIRECTIONAL_FORMAT = new getMutableThreadsMap("POP_DIRECTIONAL_FORMAT", 19, 18);

    private static final /* synthetic */ getMutableThreadsMap[] $values() {
        return new getMutableThreadsMap[]{UNDEFINED, LEFT_TO_RIGHT, RIGHT_TO_LEFT, RIGHT_TO_LEFT_ARABIC, EUROPEAN_NUMBER, EUROPEAN_NUMBER_SEPARATOR, EUROPEAN_NUMBER_TERMINATOR, ARABIC_NUMBER, COMMON_NUMBER_SEPARATOR, NONSPACING_MARK, BOUNDARY_NEUTRAL, PARAGRAPH_SEPARATOR, SEGMENT_SEPARATOR, WHITESPACE, OTHER_NEUTRALS, LEFT_TO_RIGHT_EMBEDDING, LEFT_TO_RIGHT_OVERRIDE, RIGHT_TO_LEFT_EMBEDDING, RIGHT_TO_LEFT_OVERRIDE, POP_DIRECTIONAL_FORMAT};
    }

    public static EnumEntries<getMutableThreadsMap> getEntries() {
        return $ENTRIES;
    }

    public static getMutableThreadsMap valueOf(String str) {
        return (getMutableThreadsMap) Enum.valueOf(getMutableThreadsMap.class, str);
    }

    public static getMutableThreadsMap[] values() {
        return (getMutableThreadsMap[]) $VALUES.clone();
    }

    private getMutableThreadsMap(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        getMutableThreadsMap[] getmutablethreadsmapArr$values = $values();
        $VALUES = getmutablethreadsmapArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getmutablethreadsmapArr$values);
        Companion = new onWarmupCompleted(null);
        directionalityMap$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: kotlin.text.CharDirectionality$$ExternalSyntheticLambda0
            public final Object invoke() {
                return getMutableThreadsMap.directionalityMap_delegate$lambda$0();
            }
        });
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map directionalityMap_delegate$lambda$0() {
        EnumEntries<getMutableThreadsMap> entries = getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(Integer.valueOf(((getMutableThreadsMap) obj).value), obj);
        }
        return linkedHashMap;
    }
}
