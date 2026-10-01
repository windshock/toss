package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.jni_YGNodeStyleSetWidthJNI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class fby3 extends jni_YGNodeStyleSetMaxHeightPercentJNI<jni_YGNodeStyleSetHeightPercentJNI, removeViews> {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private final jw9<fby4> onNavigationEvent;

    @Override // o.jni_YGNodeStyleSetMaxHeightPercentJNI
    public jw9<fby4> IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fby3(@NotNull jw9<? super fby4> jw9Var) {
        super(null);
        Intrinsics.checkNotNullParameter(jw9Var, "");
        this.onNavigationEvent = jw9Var;
    }

    @Override // o.jni_YGNodeStyleSetMaxHeightPercentJNI
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public jni_YGNodeStyleSetHeightPercentJNI onExtraCallbackWithResult(@NotNull removeViews removeviews) {
        Intrinsics.checkNotNullParameter(removeviews, "");
        return removeviews.onNavigationEvent();
    }

    @Override // o.jni_YGNodeStyleSetMaxHeightPercentJNI
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public removeViews onNavigationEvent() {
        return jw11.onNavigationEvent;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetHeightPercentJNI> IAuthTabCallback(@NotNull Function1<? super jni_YGNodeStyleSetWidthJNI.asBinder, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            onExtraCallback onextracallback = new onExtraCallback(new jw3());
            function1.invoke(onextracallback);
            return new fby3(onextracallback.onNavigationEvent());
        }
    }

    public static final class onExtraCallback implements jni_YGNodeStyleSetMaxWidthJNI<fby4, onExtraCallback>, jni_YGNodeStyleSetPaddingJNI {
        private final jw3<fby4> IAuthTabCallback;

        public onExtraCallback(@NotNull jw3<fby4> jw3Var) {
            Intrinsics.checkNotNullParameter(jw3Var, "");
            this.IAuthTabCallback = jw3Var;
        }

        @Override // o.jni_YGNodeStyleSetMaxWidthJNI
        public jw3<fby4> IAuthTabCallback() {
            return this.IAuthTabCallback;
        }

        @Override // o.jni_YGNodeStyleSetPaddingJNI
        public void IAuthTabCallback(@NotNull getPlayDelayedELExpressTimeS<? super fby4> getplaydelayedelexpresstimes) {
            Intrinsics.checkNotNullParameter(getplaydelayedelexpresstimes, "");
            IAuthTabCallback().onExtraCallbackWithResult(getplaydelayedelexpresstimes);
        }

        @Override // o.jni_YGNodeStyleSetMaxWidthJNI
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public onExtraCallback onExtraCallback() {
            return new onExtraCallback(new jw3());
        }
    }
}
