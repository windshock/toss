package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleGetDisplayJNI {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ jni_YGNodeStyleGetDisplayJNI[] $VALUES;
    public static final jni_YGNodeStyleGetDisplayJNI SUCCESSFUL = new jni_YGNodeStyleGetDisplayJNI("SUCCESSFUL", 0);
    public static final jni_YGNodeStyleGetDisplayJNI REREGISTER = new jni_YGNodeStyleGetDisplayJNI("REREGISTER", 1);
    public static final jni_YGNodeStyleGetDisplayJNI CANCELLED = new jni_YGNodeStyleGetDisplayJNI("CANCELLED", 2);
    public static final jni_YGNodeStyleGetDisplayJNI ALREADY_SELECTED = new jni_YGNodeStyleGetDisplayJNI("ALREADY_SELECTED", 3);

    private static final /* synthetic */ jni_YGNodeStyleGetDisplayJNI[] $values() {
        return new jni_YGNodeStyleGetDisplayJNI[]{SUCCESSFUL, REREGISTER, CANCELLED, ALREADY_SELECTED};
    }

    public static EnumEntries<jni_YGNodeStyleGetDisplayJNI> getEntries() {
        return $ENTRIES;
    }

    private jni_YGNodeStyleGetDisplayJNI(String str, int i) {
    }

    static {
        jni_YGNodeStyleGetDisplayJNI[] jni_ygnodestylegetdisplayjniArr$values = $values();
        $VALUES = jni_ygnodestylegetdisplayjniArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(jni_ygnodestylegetdisplayjniArr$values);
    }

    public static jni_YGNodeStyleGetDisplayJNI valueOf(String str) {
        return (jni_YGNodeStyleGetDisplayJNI) Enum.valueOf(jni_YGNodeStyleGetDisplayJNI.class, str);
    }

    public static jni_YGNodeStyleGetDisplayJNI[] values() {
        return (jni_YGNodeStyleGetDisplayJNI[]) $VALUES.clone();
    }
}
