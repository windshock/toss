package o;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.jni_YGNodeStyleSetWidthJNI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface jni_YGNodeStyleSetOverflowJNI extends jni_YGNodeStyleSetWidthJNI.onWarmupCompleted {
    void a_(@NotNull getPlayDelayedELExpressTimeS<? super yi> getplaydelayedelexpresstimes);

    @Override // o.jni_YGNodeStyleSetWidthJNI.onWarmupCompleted
    default void onNavigationEvent(@NotNull xz xzVar) {
        Intrinsics.checkNotNullParameter(xzVar, "");
        a_(new jw5(new getYogaNode(xzVar)));
    }

    @Override // o.jni_YGNodeStyleSetWidthJNI.onWarmupCompleted
    default void a_(@NotNull xz xzVar) {
        Intrinsics.checkNotNullParameter(xzVar, "");
        a_(new jw5(new nji(xzVar)));
    }

    @Override // o.jni_YGNodeStyleSetWidthJNI.onWarmupCompleted
    default void b_(@NotNull xz xzVar) {
        Intrinsics.checkNotNullParameter(xzVar, "");
        a_(new jw5(new zr(xzVar)));
    }

    @Override // o.jni_YGNodeStyleSetWidthJNI.onWarmupCompleted
    default void IAuthTabCallback(int i, int i2) {
        a_(new jw5(new removeViewInLayout(i, i2, (List) null, 4, (DefaultConstructorMarker) null)));
    }

    @Override // o.jni_YGNodeStyleSetWidthJNI.onWarmupCompleted
    default void onWarmupCompleted(@NotNull jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetFlexBasisPercentJNI> jni_ygnodeswapchildjni) {
        Intrinsics.checkNotNullParameter(jni_ygnodeswapchildjni, "");
        if (jni_ygnodeswapchildjni instanceof dwi) {
            a_(((dwi) jni_ygnodeswapchildjni).IAuthTabCallback());
        }
    }
}
