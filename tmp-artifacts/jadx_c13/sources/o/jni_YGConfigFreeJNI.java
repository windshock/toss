package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
final class jni_YGConfigFreeJNI {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ jni_YGConfigFreeJNI[] $VALUES;
    public static final jni_YGConfigFreeJNI FIRST = new jni_YGConfigFreeJNI("FIRST", 0, "awaitFirst");
    public static final jni_YGConfigFreeJNI FIRST_OR_DEFAULT = new jni_YGConfigFreeJNI("FIRST_OR_DEFAULT", 1, "awaitFirstOrDefault");
    public static final jni_YGConfigFreeJNI LAST = new jni_YGConfigFreeJNI("LAST", 2, "awaitLast");
    public static final jni_YGConfigFreeJNI SINGLE = new jni_YGConfigFreeJNI("SINGLE", 3, "awaitSingle");
    public static final jni_YGConfigFreeJNI SINGLE_OR_DEFAULT = new jni_YGConfigFreeJNI("SINGLE_OR_DEFAULT", 4, "awaitSingleOrDefault");
    private final String s;

    private static final /* synthetic */ jni_YGConfigFreeJNI[] $values() {
        return new jni_YGConfigFreeJNI[]{FIRST, FIRST_OR_DEFAULT, LAST, SINGLE, SINGLE_OR_DEFAULT};
    }

    public static EnumEntries<jni_YGConfigFreeJNI> getEntries() {
        return $ENTRIES;
    }

    private jni_YGConfigFreeJNI(String str, int i, String str2) {
        this.s = str2;
    }

    public final String getS() {
        return this.s;
    }

    static {
        jni_YGConfigFreeJNI[] jni_ygconfigfreejniArr$values = $values();
        $VALUES = jni_ygconfigfreejniArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(jni_ygconfigfreejniArr$values);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.s;
    }

    public static jni_YGConfigFreeJNI valueOf(String str) {
        return (jni_YGConfigFreeJNI) Enum.valueOf(jni_YGConfigFreeJNI.class, str);
    }

    public static jni_YGConfigFreeJNI[] values() {
        return (jni_YGConfigFreeJNI[]) $VALUES.clone();
    }
}
