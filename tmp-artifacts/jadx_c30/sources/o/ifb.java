package o;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.ifb;
import o.jni_YGNodeStyleSetWidthJNI;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ifb {
    private static final Lazy onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: kotlinx.datetime.format.LocalTimeFormatKt$$ExternalSyntheticLambda0
        public final Object invoke() {
            return ifb.IAuthTabCallback();
        }
    });
    private static final hpv onWarmupCompleted = new hpv((Integer) null, (Integer) null, (jni_YGNodeStyleSetMinHeightPercentJNI) null, (Integer) null, (Integer) null, (Integer) null, 63, (DefaultConstructorMarker) null);

    public static final dwi onNavigationEvent() {
        return (dwi) onExtraCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dwi IAuthTabCallback() {
        return dwi.Companion.onWarmupCompleted(new Function1() { // from class: kotlinx.datetime.format.LocalTimeFormatKt$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return ifb.onExtraCallback((jni_YGNodeStyleSetWidthJNI.onWarmupCompleted) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(jni_YGNodeStyleSetWidthJNI.onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(onwarmupcompleted, BuildConfig.FLAVOR);
        jni_YGNodeStyleSetWidthJNI.onWarmupCompleted.onNavigationEvent(onwarmupcompleted, (xz) null, 1, (Object) null);
        YogaNodeJNIBase.onWarmupCompleted(onwarmupcompleted, ':');
        jni_YGNodeStyleSetWidthJNI.onWarmupCompleted.onExtraCallback(onwarmupcompleted, (xz) null, 1, (Object) null);
        YogaNodeJNIBase.onExtraCallback(onwarmupcompleted, new Function1[]{new Function1() { // from class: kotlinx.datetime.format.LocalTimeFormatKt$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return ifb.IAuthTabCallbackStub((jni_YGNodeStyleSetWidthJNI.onWarmupCompleted) obj);
            }
        }}, new Function1() { // from class: kotlinx.datetime.format.LocalTimeFormatKt$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return ifb.IAuthTabCallbackDefault((jni_YGNodeStyleSetWidthJNI.onWarmupCompleted) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackStub(jni_YGNodeStyleSetWidthJNI.onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(onwarmupcompleted, BuildConfig.FLAVOR);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackDefault(jni_YGNodeStyleSetWidthJNI.onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(onwarmupcompleted, BuildConfig.FLAVOR);
        YogaNodeJNIBase.onWarmupCompleted(onwarmupcompleted, ':');
        jni_YGNodeStyleSetWidthJNI.onWarmupCompleted.onWarmupCompleted(onwarmupcompleted, (xz) null, 1, (Object) null);
        YogaNodeJNIBase.onExtraCallbackWithResult(onwarmupcompleted, (String) null, new Function1() { // from class: kotlinx.datetime.format.LocalTimeFormatKt$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return ifb.asInterface((jni_YGNodeStyleSetWidthJNI.onWarmupCompleted) obj);
            }
        }, 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit asInterface(jni_YGNodeStyleSetWidthJNI.onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(onwarmupcompleted, BuildConfig.FLAVOR);
        YogaNodeJNIBase.onWarmupCompleted(onwarmupcompleted, '.');
        onwarmupcompleted.IAuthTabCallback(1, 9);
        return Unit.INSTANCE;
    }
}
