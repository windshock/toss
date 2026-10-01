package o;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.jni_YGNodeStyleSetWidthJNI;
import o.kgy;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class kgy {
    private static final Lazy onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: kotlinx.datetime.format.LocalDateTimeFormatKt$$ExternalSyntheticLambda0
        public final Object invoke() {
            return kgy.onWarmupCompleted();
        }
    });
    private static final removeViewsInLayout onNavigationEvent = new removeViewsInLayout(null, null, 3, null);

    public static final duz onNavigationEvent() {
        return (duz) onExtraCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final duz onWarmupCompleted() {
        return duz.Companion.onExtraCallback(new Function1() { // from class: kotlinx.datetime.format.LocalDateTimeFormatKt$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return kgy.onWarmupCompleted((jni_YGNodeStyleSetWidthJNI.onNavigationEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(jni_YGNodeStyleSetWidthJNI.onNavigationEvent onnavigationevent) {
        Intrinsics.checkNotNullParameter(onnavigationevent, BuildConfig.FLAVOR);
        onnavigationevent.IAuthTabCallback(mp.onExtraCallback());
        YogaNodeJNIBase.onExtraCallback(onnavigationevent, new Function1[]{new Function1() { // from class: kotlinx.datetime.format.LocalDateTimeFormatKt$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return kgy.onExtraCallback((jni_YGNodeStyleSetWidthJNI.onNavigationEvent) obj);
            }
        }}, new Function1() { // from class: kotlinx.datetime.format.LocalDateTimeFormatKt$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return kgy.asBinder((jni_YGNodeStyleSetWidthJNI.onNavigationEvent) obj);
            }
        });
        onnavigationevent.onWarmupCompleted(ifb.onNavigationEvent());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit asBinder(jni_YGNodeStyleSetWidthJNI.onNavigationEvent onnavigationevent) {
        Intrinsics.checkNotNullParameter(onnavigationevent, BuildConfig.FLAVOR);
        YogaNodeJNIBase.onWarmupCompleted(onnavigationevent, 'T');
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(jni_YGNodeStyleSetWidthJNI.onNavigationEvent onnavigationevent) {
        Intrinsics.checkNotNullParameter(onnavigationevent, BuildConfig.FLAVOR);
        YogaNodeJNIBase.onWarmupCompleted(onnavigationevent, 't');
        return Unit.INSTANCE;
    }
}
