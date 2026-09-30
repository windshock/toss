package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class extractEmotion {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ extractEmotion[] $VALUES;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    public static final extractEmotion IS = new extractEmotion("IS", 0);
    public static final extractEmotion IS_NOT = new extractEmotion("IS_NOT", 1);
    public static final extractEmotion IS_SET = new extractEmotion("IS_SET", 2);
    public static final extractEmotion IS_NOT_SET = new extractEmotion("IS_NOT_SET", 3);
    public static final extractEmotion IS_GREATER_THAN = new extractEmotion("IS_GREATER_THAN", 4);
    public static final extractEmotion IS_LOWER_THAN = new extractEmotion("IS_LOWER_THAN", 5);
    public static final extractEmotion IS_AT_LEAST = new extractEmotion("IS_AT_LEAST", 6);
    public static final extractEmotion IS_AT_MOST = new extractEmotion("IS_AT_MOST", 7);
    public static final extractEmotion CONTAINS = new extractEmotion("CONTAINS", 8);
    public static final extractEmotion NOT_CONTAINS = new extractEmotion("NOT_CONTAINS", 9);
    public static final extractEmotion IS_IN_LIST = new extractEmotion("IS_IN_LIST", 10);
    public static final extractEmotion IS_NOT_IN_LIST = new extractEmotion("IS_NOT_IN_LIST", 11);

    private static final /* synthetic */ extractEmotion[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 37;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        extractEmotion[] extractemotionArr = {IS, IS_NOT, IS_SET, IS_NOT_SET, IS_GREATER_THAN, IS_LOWER_THAN, IS_AT_LEAST, IS_AT_MOST, CONTAINS, NOT_CONTAINS, IS_IN_LIST, IS_NOT_IN_LIST};
        int i5 = i2 + 111;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 0;
        }
        return extractemotionArr;
    }

    public static EnumEntries<extractEmotion> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        EnumEntries<extractEmotion> enumEntries = $ENTRIES;
        int i5 = i3 + 69;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static extractEmotion valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        extractEmotion extractemotion = (extractEmotion) Enum.valueOf(extractEmotion.class, str);
        int i4 = onExtraCallback + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return extractemotion;
    }

    public static extractEmotion[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        extractEmotion[] extractemotionArr = (extractEmotion[]) $VALUES.clone();
        int i4 = onNavigationEvent + 61;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return extractemotionArr;
    }

    private extractEmotion(String str, int i) {
    }

    static {
        extractEmotion[] extractemotionArr$values = $values();
        $VALUES = extractemotionArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(extractemotionArr$values);
        int i = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 40 / 0;
        }
    }
}
