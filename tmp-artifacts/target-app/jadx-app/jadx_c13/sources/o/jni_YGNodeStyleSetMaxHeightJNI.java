package o;

import kotlin.jvm.internal.Intrinsics;
import o.jni_YGNodeStyleSetWidthJNI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface jni_YGNodeStyleSetMaxHeightJNI extends jni_YGNodeStyleSetMinHeightJNI, jni_YGNodeStyleSetOverflowJNI, jni_YGNodeStyleSetWidthJNI.onNavigationEvent {
    void onNavigationEvent(@NotNull getPlayDelayedELExpressTimeS<? super jni_YGNodeStyleSetPositionTypeJNI> getplaydelayedelexpresstimes);

    @Override // o.jni_YGNodeStyleSetMinHeightJNI
    default void onExtraCallbackWithResult(@NotNull getPlayDelayedELExpressTimeS<? super jni_YGNodeStyleSetMinWidthJNI> getplaydelayedelexpresstimes) {
        Intrinsics.checkNotNullParameter(getplaydelayedelexpresstimes, "");
        onNavigationEvent((getPlayDelayedELExpressTimeS<? super jni_YGNodeStyleSetPositionTypeJNI>) getplaydelayedelexpresstimes);
    }

    @Override // o.jni_YGNodeStyleSetOverflowJNI
    default void a_(@NotNull getPlayDelayedELExpressTimeS<? super yi> getplaydelayedelexpresstimes) {
        Intrinsics.checkNotNullParameter(getplaydelayedelexpresstimes, "");
        onNavigationEvent((getPlayDelayedELExpressTimeS<? super jni_YGNodeStyleSetPositionTypeJNI>) getplaydelayedelexpresstimes);
    }
}
