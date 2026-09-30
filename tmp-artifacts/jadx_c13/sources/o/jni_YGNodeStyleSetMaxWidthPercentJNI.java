package o;

import kotlin.jvm.internal.Intrinsics;
import o.jni_YGNodeStyleSetWidthJNI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface jni_YGNodeStyleSetMaxWidthPercentJNI extends jni_YGNodeStyleSetWidthJNI.IAuthTabCallback {
    void onWarmupCompleted(@NotNull getPlayDelayedELExpressTimeS<? super sya5> getplaydelayedelexpresstimes);

    @Override // o.jni_YGNodeStyleSetWidthJNI.IAuthTabCallback
    default void c_(@NotNull xz xzVar) {
        Intrinsics.checkNotNullParameter(xzVar, "");
        onWarmupCompleted(new lt7(new jw5(new pmi1(xzVar)), true));
    }

    @Override // o.jni_YGNodeStyleSetWidthJNI.IAuthTabCallback
    default void onExtraCallbackWithResult(@NotNull xz xzVar) {
        Intrinsics.checkNotNullParameter(xzVar, "");
        onWarmupCompleted(new jw5(new zbzb(xzVar)));
    }

    @Override // o.jni_YGNodeStyleSetWidthJNI.IAuthTabCallback
    default void d_(@NotNull xz xzVar) {
        Intrinsics.checkNotNullParameter(xzVar, "");
        onWarmupCompleted(new jw5(new fby1(xzVar)));
    }

    @Override // o.jni_YGNodeStyleSetWidthJNI.IAuthTabCallback
    default void onExtraCallback(@NotNull jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetMarginAutoJNI> jni_ygnodeswapchildjni) {
        Intrinsics.checkNotNullParameter(jni_ygnodeswapchildjni, "");
        if (jni_ygnodeswapchildjni instanceof jwExternalSyntheticBackportWithForwarding0) {
            onWarmupCompleted(((jwExternalSyntheticBackportWithForwarding0) jni_ygnodeswapchildjni).IAuthTabCallback());
        }
    }
}
