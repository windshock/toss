package o;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.jni_YGNodeStyleSetWidthJNI;
import o.jw11;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jw11 {
    private static final removeViews onNavigationEvent = new removeViews(null, null, 3, null);
    private static final Lazy onExtraCallback = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kotlinx.datetime.format.YearMonthFormatKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return jw11.onWarmupCompleted();
        }
    });

    public static final <T> T onWarmupCompleted(@Nullable T t, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (t != null) {
            return t;
        }
        throw new jni_YGNodeStyleGetMaxHeightJNI("Can not create a " + str + " from the given input: the field " + str + " is missing");
    }

    public static final jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetHeightPercentJNI> onNavigationEvent() {
        return (jni_YGNodeSwapChildJNI) onExtraCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jni_YGNodeSwapChildJNI onWarmupCompleted() {
        return fby3.Companion.IAuthTabCallback(new Function1() { // from class: kotlinx.datetime.format.YearMonthFormatKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return jw11.onWarmupCompleted((jni_YGNodeStyleSetWidthJNI.asBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(jni_YGNodeStyleSetWidthJNI.asBinder asbinder) {
        Intrinsics.checkNotNullParameter(asbinder, "");
        jni_YGNodeStyleSetWidthJNI.asBinder.IAuthTabCallback(asbinder, null, 1, null);
        YogaNodeJNIBase.onWarmupCompleted(asbinder, '-');
        jni_YGNodeStyleSetWidthJNI.asBinder.onExtraCallbackWithResult(asbinder, null, 1, null);
        return Unit.INSTANCE;
    }
}
