package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleSetMinHeightPercentJNI {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ jni_YGNodeStyleSetMinHeightPercentJNI[] $VALUES;
    public static final jni_YGNodeStyleSetMinHeightPercentJNI AM = new jni_YGNodeStyleSetMinHeightPercentJNI("AM", 0);
    public static final jni_YGNodeStyleSetMinHeightPercentJNI PM = new jni_YGNodeStyleSetMinHeightPercentJNI("PM", 1);

    private static final /* synthetic */ jni_YGNodeStyleSetMinHeightPercentJNI[] $values() {
        return new jni_YGNodeStyleSetMinHeightPercentJNI[]{AM, PM};
    }

    public static EnumEntries<jni_YGNodeStyleSetMinHeightPercentJNI> getEntries() {
        return $ENTRIES;
    }

    private jni_YGNodeStyleSetMinHeightPercentJNI(String str, int i) {
    }

    static {
        jni_YGNodeStyleSetMinHeightPercentJNI[] jni_ygnodestylesetminheightpercentjniArr$values = $values();
        $VALUES = jni_ygnodestylesetminheightpercentjniArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(jni_ygnodestylesetminheightpercentjniArr$values);
    }

    public static jni_YGNodeStyleSetMinHeightPercentJNI valueOf(String str) {
        return (jni_YGNodeStyleSetMinHeightPercentJNI) Enum.valueOf(jni_YGNodeStyleSetMinHeightPercentJNI.class, str);
    }

    public static jni_YGNodeStyleSetMinHeightPercentJNI[] values() {
        return (jni_YGNodeStyleSetMinHeightPercentJNI[]) $VALUES.clone();
    }
}
