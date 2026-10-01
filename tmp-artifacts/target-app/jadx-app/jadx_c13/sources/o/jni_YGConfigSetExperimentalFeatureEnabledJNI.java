package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGConfigSetExperimentalFeatureEnabledJNI {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ jni_YGConfigSetExperimentalFeatureEnabledJNI[] $VALUES;
    public static final jni_YGConfigSetExperimentalFeatureEnabledJNI FIRST = new jni_YGConfigSetExperimentalFeatureEnabledJNI("FIRST", 0, "awaitFirst");
    public static final jni_YGConfigSetExperimentalFeatureEnabledJNI FIRST_OR_DEFAULT = new jni_YGConfigSetExperimentalFeatureEnabledJNI("FIRST_OR_DEFAULT", 1, "awaitFirstOrDefault");
    public static final jni_YGConfigSetExperimentalFeatureEnabledJNI LAST = new jni_YGConfigSetExperimentalFeatureEnabledJNI("LAST", 2, "awaitLast");
    public static final jni_YGConfigSetExperimentalFeatureEnabledJNI SINGLE = new jni_YGConfigSetExperimentalFeatureEnabledJNI("SINGLE", 3, "awaitSingle");
    private final String s;

    private static final /* synthetic */ jni_YGConfigSetExperimentalFeatureEnabledJNI[] $values() {
        return new jni_YGConfigSetExperimentalFeatureEnabledJNI[]{FIRST, FIRST_OR_DEFAULT, LAST, SINGLE};
    }

    public static EnumEntries<jni_YGConfigSetExperimentalFeatureEnabledJNI> getEntries() {
        return $ENTRIES;
    }

    private jni_YGConfigSetExperimentalFeatureEnabledJNI(String str, int i, String str2) {
        this.s = str2;
    }

    public final String getS() {
        return this.s;
    }

    static {
        jni_YGConfigSetExperimentalFeatureEnabledJNI[] jni_ygconfigsetexperimentalfeatureenabledjniArr$values = $values();
        $VALUES = jni_ygconfigsetexperimentalfeatureenabledjniArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(jni_ygconfigsetexperimentalfeatureenabledjniArr$values);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.s;
    }

    public static jni_YGConfigSetExperimentalFeatureEnabledJNI valueOf(String str) {
        return (jni_YGConfigSetExperimentalFeatureEnabledJNI) Enum.valueOf(jni_YGConfigSetExperimentalFeatureEnabledJNI.class, str);
    }

    public static jni_YGConfigSetExperimentalFeatureEnabledJNI[] values() {
        return (jni_YGConfigSetExperimentalFeatureEnabledJNI[]) $VALUES.clone();
    }
}
