package o;

import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.jni_YGNodeStyleSetHeightPercentJNI;
import o.jni_YGNodeStyleSetJustifyContentJNI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleSetJustifyContentJNI {
    private static final Lazy onExtraCallback = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kotlinx.datetime.YearMonthJvmKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return jni_YGNodeStyleSetJustifyContentJNI.onNavigationEvent();
        }
    });

    public static final long IAuthTabCallback(@NotNull jni_YGNodeStyleSetHeightPercentJNI jni_ygnodestylesetheightpercentjni) {
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetheightpercentjni, "");
        return (((jni_ygnodestylesetheightpercentjni.onWarmupCompleted() - 1970) * 12) + jni_ygnodestylesetheightpercentjni.onExtraCallbackWithResult()) - 1;
    }

    public static final jni_YGNodeStyleSetHeightPercentJNI onExtraCallback(@NotNull jni_YGNodeStyleSetHeightPercentJNI.onWarmupCompleted onwarmupcompleted, long j) {
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        long j2 = j / 12;
        if ((j ^ 12) < 0 && j2 * 12 != j) {
            j2--;
        }
        long j3 = j % 12;
        return new jni_YGNodeStyleSetHeightPercentJNI((int) (j2 + 1970), ((int) (j3 + (12 & (((j3 ^ 12) & ((-j3) | j3)) >> 63)))) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter onExtraCallback() {
        return (DateTimeFormatter) onExtraCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter onNavigationEvent() {
        return new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
    }
}
