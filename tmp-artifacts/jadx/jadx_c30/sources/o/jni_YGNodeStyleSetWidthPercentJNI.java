package o;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.jni_YGNodeStyleSetAspectRatioJNI;
import o.jni_YGNodeStyleSetFlexBasisPercentJNI;
import o.jni_YGNodeStyleSetHeightPercentJNI;
import o.jni_YGNodeStyleSetMarginAutoJNI;
import o.jni_YGNodeStyleSetPositionPercentJNI;
import o.jni_YGNodeStyleSetWidthPercentJNI;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class jni_YGNodeStyleSetWidthPercentJNI {
    private static final Lazy onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: kotlinx.datetime.format.DateTimeFormatKt$$ExternalSyntheticLambda0
        public final Object invoke() {
            return jni_YGNodeStyleSetWidthPercentJNI.onNavigationEvent();
        }
    });

    private static final jw9<?> onNavigationEvent(jni_YGNodeSwapChildJNI<?> jni_ygnodeswapchildjni) {
        Intrinsics.checkNotNull(jni_ygnodeswapchildjni, BuildConfig.FLAVOR);
        return ((jni_YGNodeStyleSetMaxHeightPercentJNI) jni_ygnodeswapchildjni).IAuthTabCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List onNavigationEvent() {
        jni_YGNodeStyleSetPositionPercentJNI.onNavigationEvent onnavigationevent = jni_YGNodeStyleSetPositionPercentJNI.onNavigationEvent.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("dateTimeComponents(DateTimeComponents.Formats.RFC_1123)", onNavigationEvent(onnavigationevent.onWarmupCompleted()));
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("dateTimeComponents(DateTimeComponents.Formats.ISO_DATE_TIME_OFFSET)", onNavigationEvent(onnavigationevent.IAuthTabCallback()));
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("date(LocalDateTime.Formats.ISO)", onNavigationEvent(jni_YGNodeStyleSetFlexBasisJNI$onExtraCallbackWithResult.onExtraCallbackWithResult.onNavigationEvent()));
        jni_YGNodeStyleSetAspectRatioJNI.onNavigationEvent onnavigationevent2 = jni_YGNodeStyleSetAspectRatioJNI.onNavigationEvent.onNavigationEvent;
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("date(LocalDate.Formats.ISO)", onNavigationEvent(onnavigationevent2.onExtraCallbackWithResult()));
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("date(LocalDate.Formats.ISO_BASIC)", onNavigationEvent(onnavigationevent2.onExtraCallback()));
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("time(LocalTime.Formats.ISO)", onNavigationEvent(jni_YGNodeStyleSetFlexBasisPercentJNI.onWarmupCompleted.onNavigationEvent.onNavigationEvent()));
        jni_YGNodeStyleSetMarginAutoJNI.onExtraCallbackWithResult onextracallbackwithresult = jni_YGNodeStyleSetMarginAutoJNI.onExtraCallbackWithResult.IAuthTabCallback;
        return CollectionsKt.listOf(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, getWrite.IAuthTabCallback("offset(UtcOffset.Formats.ISO)", onNavigationEvent(onextracallbackwithresult.onNavigationEvent())), getWrite.IAuthTabCallback("offset(UtcOffset.Formats.ISO_BASIC)", onNavigationEvent(onextracallbackwithresult.onWarmupCompleted())), getWrite.IAuthTabCallback("offset(UtcOffset.Formats.FOUR_DIGITS)", onNavigationEvent(onextracallbackwithresult.onExtraCallback())), getWrite.IAuthTabCallback("yearMonth(YearMonth.Formats.ISO)", onNavigationEvent(jni_YGNodeStyleSetHeightPercentJNI.onNavigationEvent.onNavigationEvent.onNavigationEvent()))});
    }
}
