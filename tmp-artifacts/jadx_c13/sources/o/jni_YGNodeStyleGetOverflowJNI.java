package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleGetOverflowJNI {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ jni_YGNodeStyleGetOverflowJNI[] $VALUES;
    public static final jni_YGNodeStyleGetOverflowJNI MONDAY = new jni_YGNodeStyleGetOverflowJNI("MONDAY", 0);
    public static final jni_YGNodeStyleGetOverflowJNI TUESDAY = new jni_YGNodeStyleGetOverflowJNI("TUESDAY", 1);
    public static final jni_YGNodeStyleGetOverflowJNI WEDNESDAY = new jni_YGNodeStyleGetOverflowJNI("WEDNESDAY", 2);
    public static final jni_YGNodeStyleGetOverflowJNI THURSDAY = new jni_YGNodeStyleGetOverflowJNI("THURSDAY", 3);
    public static final jni_YGNodeStyleGetOverflowJNI FRIDAY = new jni_YGNodeStyleGetOverflowJNI("FRIDAY", 4);
    public static final jni_YGNodeStyleGetOverflowJNI SATURDAY = new jni_YGNodeStyleGetOverflowJNI("SATURDAY", 5);
    public static final jni_YGNodeStyleGetOverflowJNI SUNDAY = new jni_YGNodeStyleGetOverflowJNI("SUNDAY", 6);

    private static final /* synthetic */ jni_YGNodeStyleGetOverflowJNI[] $values() {
        return new jni_YGNodeStyleGetOverflowJNI[]{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
    }

    public static EnumEntries<jni_YGNodeStyleGetOverflowJNI> getEntries() {
        return $ENTRIES;
    }

    private jni_YGNodeStyleGetOverflowJNI(String str, int i) {
    }

    static {
        jni_YGNodeStyleGetOverflowJNI[] jni_ygnodestylegetoverflowjniArr$values = $values();
        $VALUES = jni_ygnodestylegetoverflowjniArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(jni_ygnodestylegetoverflowjniArr$values);
    }

    public static jni_YGNodeStyleGetOverflowJNI valueOf(String str) {
        return (jni_YGNodeStyleGetOverflowJNI) Enum.valueOf(jni_YGNodeStyleGetOverflowJNI.class, str);
    }

    public static jni_YGNodeStyleGetOverflowJNI[] values() {
        return (jni_YGNodeStyleGetOverflowJNI[]) $VALUES.clone();
    }
}
