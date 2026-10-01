package o;

import j$.time.DayOfWeek;
import j$.time.Month;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleGetMinWidthJNI {
    public static final jni_YGNodeStyleSetFlexJNI IAuthTabCallback(@NotNull Month month) {
        Intrinsics.checkNotNullParameter(month, "");
        return jni_YGNodeStyleSetFlexJNI.getEntries().get(month.getValue() - 1);
    }

    public static final jni_YGNodeStyleGetOverflowJNI IAuthTabCallback(@NotNull DayOfWeek dayOfWeek) {
        Intrinsics.checkNotNullParameter(dayOfWeek, "");
        return jni_YGNodeStyleGetOverflowJNI.getEntries().get(dayOfWeek.getValue() - 1);
    }
}
