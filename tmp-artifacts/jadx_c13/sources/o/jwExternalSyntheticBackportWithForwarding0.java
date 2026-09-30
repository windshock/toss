package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.jni_YGNodeStyleSetWidthJNI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jwExternalSyntheticBackportWithForwarding0 extends jni_YGNodeStyleSetMaxHeightPercentJNI<jni_YGNodeStyleSetMarginAutoJNI, bba> {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private final jw9<sya5> IAuthTabCallback;

    @Override // o.jni_YGNodeStyleSetMaxHeightPercentJNI
    public jw9<sya5> IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final jwExternalSyntheticBackportWithForwarding0 onExtraCallback(@NotNull Function1<? super jni_YGNodeStyleSetWidthJNI.IAuthTabCallback, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(new jw3());
            function1.invoke(onextracallbackwithresult);
            return new jwExternalSyntheticBackportWithForwarding0(onextracallbackwithresult.onNavigationEvent());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jwExternalSyntheticBackportWithForwarding0(@NotNull jw9<? super sya5> jw9Var) {
        super(null);
        Intrinsics.checkNotNullParameter(jw9Var, "");
        this.IAuthTabCallback = jw9Var;
    }

    static final class onExtraCallbackWithResult implements jni_YGNodeStyleSetMaxWidthJNI<sya5, onExtraCallbackWithResult>, jni_YGNodeStyleSetMaxWidthPercentJNI {
        private final jw3<sya5> onNavigationEvent;

        public onExtraCallbackWithResult(@NotNull jw3<sya5> jw3Var) {
            Intrinsics.checkNotNullParameter(jw3Var, "");
            this.onNavigationEvent = jw3Var;
        }

        @Override // o.jni_YGNodeStyleSetMaxWidthJNI
        public jw3<sya5> IAuthTabCallback() {
            return this.onNavigationEvent;
        }

        @Override // o.jni_YGNodeStyleSetMaxWidthPercentJNI
        public void onWarmupCompleted(@NotNull getPlayDelayedELExpressTimeS<? super sya5> getplaydelayedelexpresstimes) {
            Intrinsics.checkNotNullParameter(getplaydelayedelexpresstimes, "");
            IAuthTabCallback().onExtraCallbackWithResult(getplaydelayedelexpresstimes);
        }

        @Override // o.jni_YGNodeStyleSetMaxWidthJNI
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public onExtraCallbackWithResult onExtraCallback() {
            return new onExtraCallbackWithResult(new jw3());
        }
    }

    @Override // o.jni_YGNodeStyleSetMaxHeightPercentJNI
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public jni_YGNodeStyleSetMarginAutoJNI onExtraCallbackWithResult(@NotNull bba bbaVar) {
        Intrinsics.checkNotNullParameter(bbaVar, "");
        return bbaVar.IAuthTabCallback();
    }

    @Override // o.jni_YGNodeStyleSetMaxHeightPercentJNI
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public bba onNavigationEvent() {
        return fby2.onNavigationEvent;
    }
}
