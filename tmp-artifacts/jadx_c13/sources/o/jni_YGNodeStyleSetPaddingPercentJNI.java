package o;

import kotlin.jvm.internal.Intrinsics;
import o.jni_YGNodeStyleSetWidthJNI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleSetPaddingPercentJNI extends jni_YGNodeStyleSetMaxHeightPercentJNI<jni_YGNodeStyleSetPositionPercentJNI, jni_YGNodeStyleSetPositionAutoJNI> {
    private final jw9<jni_YGNodeStyleSetPositionAutoJNI> onNavigationEvent;

    @Override // o.jni_YGNodeStyleSetMaxHeightPercentJNI
    public jw9<jni_YGNodeStyleSetPositionAutoJNI> IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jni_YGNodeStyleSetPaddingPercentJNI(@NotNull jw9<? super jni_YGNodeStyleSetPositionAutoJNI> jw9Var) {
        super(null);
        Intrinsics.checkNotNullParameter(jw9Var, "");
        this.onNavigationEvent = jw9Var;
    }

    @Override // o.jni_YGNodeStyleSetMaxHeightPercentJNI
    public jni_YGNodeStyleSetPositionPercentJNI onExtraCallbackWithResult(@NotNull jni_YGNodeStyleSetPositionAutoJNI jni_ygnodestylesetpositionautojni) {
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetpositionautojni, "");
        return new jni_YGNodeStyleSetPositionPercentJNI(jni_ygnodestylesetpositionautojni);
    }

    @Override // o.jni_YGNodeStyleSetMaxHeightPercentJNI
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public jni_YGNodeStyleSetPositionAutoJNI onNavigationEvent() {
        return jni_YGNodeStyleSetPositionJNI.onExtraCallbackWithResult;
    }

    public static final class IAuthTabCallback implements jni_YGNodeStyleSetMaxWidthJNI<jni_YGNodeStyleSetPositionAutoJNI, IAuthTabCallback>, jni_YGNodeStyleSetMaxHeightJNI, jni_YGNodeStyleSetMaxWidthPercentJNI, jni_YGNodeStyleSetWidthJNI.onExtraCallback {
        private final jw3<jni_YGNodeStyleSetPositionAutoJNI> onExtraCallbackWithResult;

        public IAuthTabCallback(@NotNull jw3<jni_YGNodeStyleSetPositionAutoJNI> jw3Var) {
            Intrinsics.checkNotNullParameter(jw3Var, "");
            this.onExtraCallbackWithResult = jw3Var;
        }

        @Override // o.jni_YGNodeStyleSetMaxWidthJNI
        public jw3<jni_YGNodeStyleSetPositionAutoJNI> IAuthTabCallback() {
            return this.onExtraCallbackWithResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.jni_YGNodeStyleSetMaxHeightJNI
        public void onNavigationEvent(@NotNull getPlayDelayedELExpressTimeS<? super jni_YGNodeStyleSetPositionTypeJNI> getplaydelayedelexpresstimes) {
            Intrinsics.checkNotNullParameter(getplaydelayedelexpresstimes, "");
            IAuthTabCallback().onExtraCallbackWithResult(getplaydelayedelexpresstimes);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.jni_YGNodeStyleSetMaxWidthPercentJNI
        public void onWarmupCompleted(@NotNull getPlayDelayedELExpressTimeS<? super sya5> getplaydelayedelexpresstimes) {
            Intrinsics.checkNotNullParameter(getplaydelayedelexpresstimes, "");
            IAuthTabCallback().onExtraCallbackWithResult(getplaydelayedelexpresstimes);
        }

        @Override // o.jni_YGNodeStyleSetMaxWidthJNI
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public IAuthTabCallback onExtraCallback() {
            return new IAuthTabCallback(new jw3());
        }
    }
}
