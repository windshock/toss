package o;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.jni_YGNodeStyleSetWidthJNI;
import o.mp;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class mp {
    private static final Lazy onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: kotlinx.datetime.format.LocalDateFormatKt$$ExternalSyntheticLambda1
        public final Object invoke() {
            return mp.asInterface();
        }
    });
    private static final Lazy onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: kotlinx.datetime.format.LocalDateFormatKt$$ExternalSyntheticLambda2
        public final Object invoke() {
            return mp.IAuthTabCallbackDefault();
        }
    });
    private static final removeAllViewsInLayout onExtraCallback = new removeAllViewsInLayout((removeViews) null, (Integer) null, (Integer) null, (Integer) null, 15, (DefaultConstructorMarker) null);

    public static final jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetAspectRatioJNI> onExtraCallback() {
        return (jni_YGNodeSwapChildJNI) onExtraCallbackWithResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jni_YGNodeSwapChildJNI asInterface() {
        return iq.Companion.onNavigationEvent(new Function1() { // from class: kotlinx.datetime.format.LocalDateFormatKt$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return mp.onExtraCallbackWithResult((jni_YGNodeStyleSetWidthJNI.onExtraCallbackWithResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(jni_YGNodeStyleSetWidthJNI.onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, BuildConfig.FLAVOR);
        jni_YGNodeStyleSetWidthJNI.asBinder.IAuthTabCallback(onextracallbackwithresult, (xz) null, 1, (Object) null);
        YogaNodeJNIBase.onWarmupCompleted(onextracallbackwithresult, '-');
        jni_YGNodeStyleSetWidthJNI.asBinder.onExtraCallbackWithResult(onextracallbackwithresult, (xz) null, 1, (Object) null);
        YogaNodeJNIBase.onWarmupCompleted(onextracallbackwithresult, '-');
        jni_YGNodeStyleSetWidthJNI.onExtraCallbackWithResult.IAuthTabCallback(onextracallbackwithresult, (xz) null, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public static final jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetAspectRatioJNI> onExtraCallbackWithResult() {
        return (jni_YGNodeSwapChildJNI) onNavigationEvent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jni_YGNodeSwapChildJNI IAuthTabCallbackDefault() {
        return iq.Companion.onNavigationEvent(new Function1() { // from class: kotlinx.datetime.format.LocalDateFormatKt$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return mp.onNavigationEvent((jni_YGNodeStyleSetWidthJNI.onExtraCallbackWithResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(jni_YGNodeStyleSetWidthJNI.onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, BuildConfig.FLAVOR);
        jni_YGNodeStyleSetWidthJNI.asBinder.IAuthTabCallback(onextracallbackwithresult, (xz) null, 1, (Object) null);
        jni_YGNodeStyleSetWidthJNI.asBinder.onExtraCallbackWithResult(onextracallbackwithresult, (xz) null, 1, (Object) null);
        jni_YGNodeStyleSetWidthJNI.onExtraCallbackWithResult.IAuthTabCallback(onextracallbackwithresult, (xz) null, 1, (Object) null);
        return Unit.INSTANCE;
    }
}
