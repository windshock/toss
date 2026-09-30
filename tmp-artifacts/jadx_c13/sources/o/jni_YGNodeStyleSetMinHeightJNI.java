package o;

import kotlin.jvm.internal.Intrinsics;
import o.jni_YGNodeStyleSetWidthJNI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface jni_YGNodeStyleSetMinHeightJNI extends jni_YGNodeStyleSetPaddingJNI, jni_YGNodeStyleSetWidthJNI.onExtraCallbackWithResult {
    void onExtraCallbackWithResult(@NotNull getPlayDelayedELExpressTimeS<? super jni_YGNodeStyleSetMinWidthJNI> getplaydelayedelexpresstimes);

    @Override // o.jni_YGNodeStyleSetPaddingJNI
    default void IAuthTabCallback(@NotNull getPlayDelayedELExpressTimeS<? super fby4> getplaydelayedelexpresstimes) {
        Intrinsics.checkNotNullParameter(getplaydelayedelexpresstimes, "");
        onExtraCallbackWithResult(getplaydelayedelexpresstimes);
    }

    @Override // o.jni_YGNodeStyleSetWidthJNI.onExtraCallbackWithResult
    default void IAuthTabCallback(@NotNull xz xzVar) {
        Intrinsics.checkNotNullParameter(xzVar, "");
        onExtraCallbackWithResult(new jw5(new jni_YGNodeStyleSetWidthAutoJNI(xzVar)));
    }

    @Override // o.jni_YGNodeStyleSetWidthJNI.onExtraCallbackWithResult
    default void onExtraCallback(@NotNull replaceChild replacechild) {
        Intrinsics.checkNotNullParameter(replacechild, "");
        onExtraCallbackWithResult(new jw5(new baseline(replacechild)));
    }

    @Override // o.jni_YGNodeStyleSetWidthJNI.onExtraCallbackWithResult
    default void IAuthTabCallback(@NotNull jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetAspectRatioJNI> jni_ygnodeswapchildjni) {
        Intrinsics.checkNotNullParameter(jni_ygnodeswapchildjni, "");
        if (jni_ygnodeswapchildjni instanceof iq) {
            onExtraCallbackWithResult(((iq) jni_ygnodeswapchildjni).IAuthTabCallback());
        }
    }
}
