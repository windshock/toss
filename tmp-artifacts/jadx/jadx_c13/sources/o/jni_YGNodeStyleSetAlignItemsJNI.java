package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class jni_YGNodeStyleSetAlignItemsJNI {
    public static final int onNavigationEvent(@NotNull jni_YGNodeStyleGetOverflowJNI jni_ygnodestylegetoverflowjni) {
        Intrinsics.checkNotNullParameter(jni_ygnodestylegetoverflowjni, "");
        return jni_ygnodestylegetoverflowjni.ordinal() + 1;
    }

    public static final jni_YGNodeStyleGetOverflowJNI onExtraCallback(int i) {
        if (i <= 0 || i >= 8) {
            throw new IllegalArgumentException(("Expected ISO day-of-week number in 1..7, got " + i).toString());
        }
        return jni_YGNodeStyleGetOverflowJNI.getEntries().get(i - 1);
    }
}
