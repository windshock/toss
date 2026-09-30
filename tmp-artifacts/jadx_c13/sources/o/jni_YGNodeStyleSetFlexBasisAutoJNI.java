package o;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.jni_YGNodeStyleGetPositionTypeJNI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleSetFlexBasisAutoJNI {
    private static final long onExtraCallback = LocalDate.MIN.toEpochDay();
    private static final long IAuthTabCallback = LocalDate.MAX.toEpochDay();

    public static final jni_YGNodeStyleSetAspectRatioJNI onWarmupCompleted(@NotNull jni_YGNodeStyleSetAspectRatioJNI jni_ygnodestylesetaspectratiojni, long j, @NotNull jni_YGNodeStyleGetPositionTypeJNI.onExtraCallback onextracallback) throws Exception {
        LocalDate localDatePlusMonths;
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetaspectratiojni, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        try {
            if (onextracallback instanceof jni_YGNodeStyleGetPositionTypeJNI.onNavigationEvent) {
                localDatePlusMonths = onExtraCallback(jw12.onWarmupCompleted(jni_ygnodestylesetaspectratiojni.onExtraCallbackWithResult().toEpochDay(), jw12.onNavigationEvent(j, ((jni_YGNodeStyleGetPositionTypeJNI.onNavigationEvent) onextracallback).IAuthTabCallback())));
            } else {
                if (!(onextracallback instanceof jni_YGNodeStyleGetPositionTypeJNI.onWarmupCompleted)) {
                    throw new NoWhenBranchMatchedException();
                }
                localDatePlusMonths = jni_ygnodestylesetaspectratiojni.onExtraCallbackWithResult().plusMonths(jw12.onNavigationEvent(j, ((jni_YGNodeStyleGetPositionTypeJNI.onWarmupCompleted) onextracallback).onWarmupCompleted()));
            }
            return new jni_YGNodeStyleSetAspectRatioJNI(localDatePlusMonths);
        } catch (Exception e) {
            if (!(e instanceof DateTimeException) && !(e instanceof ArithmeticException)) {
                throw e;
            }
            throw new jni_YGNodeStyleGetMarginJNI("The result of adding " + j + " of " + onextracallback + " to " + jni_ygnodestylesetaspectratiojni + " is out of LocalDate range.", e);
        }
    }

    private static final LocalDate onExtraCallback(long j) {
        long j2 = onExtraCallback;
        if (j > IAuthTabCallback || j2 > j) {
            throw new DateTimeException("The resulting day " + j + " is out of supported LocalDate range.");
        }
        LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(j);
        Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay, "");
        return localDateOfEpochDay;
    }
}
