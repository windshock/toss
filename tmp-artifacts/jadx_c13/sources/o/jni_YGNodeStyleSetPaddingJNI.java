package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.format.ReducedYearDirective;
import o.jni_YGNodeStyleSetWidthJNI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface jni_YGNodeStyleSetPaddingJNI extends jni_YGNodeStyleSetWidthJNI.asBinder {
    void IAuthTabCallback(@NotNull getPlayDelayedELExpressTimeS<? super fby4> getplaydelayedelexpresstimes);

    @Override // o.jni_YGNodeStyleSetWidthJNI.asBinder
    default void onExtraCallback(@NotNull xz xzVar) {
        Intrinsics.checkNotNullParameter(xzVar, "");
        IAuthTabCallback(new jw5(new fby5(xzVar, false, 2, null)));
    }

    @Override // o.jni_YGNodeStyleSetWidthJNI.asBinder
    default void onWarmupCompleted(int i) {
        IAuthTabCallback(new jw5(new ReducedYearDirective(i, false, 2, null)));
    }

    @Override // o.jni_YGNodeStyleSetWidthJNI.asBinder
    default void onWarmupCompleted(@NotNull xz xzVar) {
        Intrinsics.checkNotNullParameter(xzVar, "");
        IAuthTabCallback(new jw5(new uf(xzVar)));
    }

    @Override // o.jni_YGNodeStyleSetWidthJNI.asBinder
    default void onExtraCallback(@NotNull rl rlVar) {
        Intrinsics.checkNotNullParameter(rlVar, "");
        IAuthTabCallback(new jw5(new rmy(rlVar)));
    }
}
