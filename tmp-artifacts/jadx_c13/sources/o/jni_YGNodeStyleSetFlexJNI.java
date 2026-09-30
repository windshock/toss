package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleSetFlexJNI {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ jni_YGNodeStyleSetFlexJNI[] $VALUES;
    public static final jni_YGNodeStyleSetFlexJNI JANUARY = new jni_YGNodeStyleSetFlexJNI("JANUARY", 0);
    public static final jni_YGNodeStyleSetFlexJNI FEBRUARY = new jni_YGNodeStyleSetFlexJNI("FEBRUARY", 1);
    public static final jni_YGNodeStyleSetFlexJNI MARCH = new jni_YGNodeStyleSetFlexJNI("MARCH", 2);
    public static final jni_YGNodeStyleSetFlexJNI APRIL = new jni_YGNodeStyleSetFlexJNI("APRIL", 3);
    public static final jni_YGNodeStyleSetFlexJNI MAY = new jni_YGNodeStyleSetFlexJNI("MAY", 4);
    public static final jni_YGNodeStyleSetFlexJNI JUNE = new jni_YGNodeStyleSetFlexJNI("JUNE", 5);
    public static final jni_YGNodeStyleSetFlexJNI JULY = new jni_YGNodeStyleSetFlexJNI("JULY", 6);
    public static final jni_YGNodeStyleSetFlexJNI AUGUST = new jni_YGNodeStyleSetFlexJNI("AUGUST", 7);
    public static final jni_YGNodeStyleSetFlexJNI SEPTEMBER = new jni_YGNodeStyleSetFlexJNI("SEPTEMBER", 8);
    public static final jni_YGNodeStyleSetFlexJNI OCTOBER = new jni_YGNodeStyleSetFlexJNI("OCTOBER", 9);
    public static final jni_YGNodeStyleSetFlexJNI NOVEMBER = new jni_YGNodeStyleSetFlexJNI("NOVEMBER", 10);
    public static final jni_YGNodeStyleSetFlexJNI DECEMBER = new jni_YGNodeStyleSetFlexJNI("DECEMBER", 11);

    private static final /* synthetic */ jni_YGNodeStyleSetFlexJNI[] $values() {
        return new jni_YGNodeStyleSetFlexJNI[]{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
    }

    public static EnumEntries<jni_YGNodeStyleSetFlexJNI> getEntries() {
        return $ENTRIES;
    }

    private jni_YGNodeStyleSetFlexJNI(String str, int i) {
    }

    static {
        jni_YGNodeStyleSetFlexJNI[] jni_ygnodestylesetflexjniArr$values = $values();
        $VALUES = jni_ygnodestylesetflexjniArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(jni_ygnodestylesetflexjniArr$values);
    }

    public static jni_YGNodeStyleSetFlexJNI valueOf(String str) {
        return (jni_YGNodeStyleSetFlexJNI) Enum.valueOf(jni_YGNodeStyleSetFlexJNI.class, str);
    }

    public static jni_YGNodeStyleSetFlexJNI[] values() {
        return (jni_YGNodeStyleSetFlexJNI[]) $VALUES.clone();
    }
}
