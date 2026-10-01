package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.jni_YGNodeStyleSetWidthJNI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class duz extends jni_YGNodeStyleSetMaxHeightPercentJNI<jni_YGNodeStyleSetFlexBasisJNI, removeViewsInLayout> {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private final jw9<jni_YGNodeStyleSetPositionTypeJNI> onExtraCallbackWithResult;

    public jw9<jni_YGNodeStyleSetPositionTypeJNI> IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duz(@NotNull jw9<? super jni_YGNodeStyleSetPositionTypeJNI> jw9Var) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(jw9Var, BuildConfig.FLAVOR);
        this.onExtraCallbackWithResult = jw9Var;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public jni_YGNodeStyleSetFlexBasisJNI onExtraCallbackWithResult(@NotNull removeViewsInLayout removeviewsinlayout) {
        Intrinsics.checkNotNullParameter(removeviewsinlayout, BuildConfig.FLAVOR);
        return removeviewsinlayout.asInterface();
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public removeViewsInLayout onNavigationEvent() {
        return kgy.onNavigationEvent;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final duz onExtraCallback(@NotNull Function1<? super jni_YGNodeStyleSetWidthJNI.onNavigationEvent, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(new jw3());
            function1.invoke(onwarmupcompleted);
            return new duz(onwarmupcompleted.onNavigationEvent());
        }
    }

    public static final class onWarmupCompleted implements jni_YGNodeStyleSetMaxWidthJNI<jni_YGNodeStyleSetPositionTypeJNI, onWarmupCompleted>, jni_YGNodeStyleSetMaxHeightJNI {
        private final jw3<jni_YGNodeStyleSetPositionTypeJNI> onExtraCallbackWithResult;

        public onWarmupCompleted(@NotNull jw3<jni_YGNodeStyleSetPositionTypeJNI> jw3Var) {
            Intrinsics.checkNotNullParameter(jw3Var, BuildConfig.FLAVOR);
            this.onExtraCallbackWithResult = jw3Var;
        }

        public jw3<jni_YGNodeStyleSetPositionTypeJNI> IAuthTabCallback() {
            return this.onExtraCallbackWithResult;
        }

        public void onNavigationEvent(@NotNull getPlayDelayedELExpressTimeS<? super jni_YGNodeStyleSetPositionTypeJNI> getplaydelayedelexpresstimes) {
            Intrinsics.checkNotNullParameter(getplaydelayedelexpresstimes, BuildConfig.FLAVOR);
            IAuthTabCallback().onExtraCallbackWithResult(getplaydelayedelexpresstimes);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public onWarmupCompleted onExtraCallback() {
            return new onWarmupCompleted(new jw3());
        }
    }
}
