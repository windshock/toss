package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class extractFaceLandmark {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ extractFaceLandmark[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final extractFaceLandmark AND = new extractFaceLandmark("AND", 0);
    public static final extractFaceLandmark OR = new extractFaceLandmark("OR", 1);
    public static final extractFaceLandmark COMPARISON = new extractFaceLandmark("COMPARISON", 2);

    private static final /* synthetic */ extractFaceLandmark[] $values() {
        extractFaceLandmark[] extractfacelandmarkArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            extractFaceLandmark extractfacelandmark = AND;
            extractFaceLandmark extractfacelandmark2 = OR;
            extractFaceLandmark extractfacelandmark3 = COMPARISON;
            extractfacelandmarkArr = new extractFaceLandmark[4];
            extractfacelandmarkArr[0] = extractfacelandmark;
            extractfacelandmarkArr[1] = extractfacelandmark2;
            extractfacelandmarkArr[4] = extractfacelandmark3;
        } else {
            extractfacelandmarkArr = new extractFaceLandmark[]{AND, OR, COMPARISON};
        }
        int i4 = i3 + 15;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return extractfacelandmarkArr;
        }
        throw null;
    }

    public static EnumEntries<extractFaceLandmark> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<extractFaceLandmark> enumEntries = $ENTRIES;
        int i5 = i3 + 17;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static extractFaceLandmark valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        extractFaceLandmark extractfacelandmark = (extractFaceLandmark) Enum.valueOf(extractFaceLandmark.class, str);
        int i4 = onExtraCallback + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return extractfacelandmark;
    }

    public static extractFaceLandmark[] values() {
        extractFaceLandmark[] extractfacelandmarkArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            extractfacelandmarkArr = (extractFaceLandmark[]) $VALUES.clone();
            int i3 = 69 / 0;
        } else {
            extractfacelandmarkArr = (extractFaceLandmark[]) $VALUES.clone();
        }
        int i4 = onExtraCallback + 91;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return extractfacelandmarkArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private extractFaceLandmark(String str, int i) {
    }

    static {
        extractFaceLandmark[] extractfacelandmarkArr$values = $values();
        $VALUES = extractfacelandmarkArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(extractfacelandmarkArr$values);
        int i = onNavigationEvent + 7;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }
}
