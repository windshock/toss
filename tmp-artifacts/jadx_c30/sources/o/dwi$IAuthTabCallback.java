package o;

import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class dwi$IAuthTabCallback implements jni_YGNodeStyleSetMaxWidthJNI<yi, dwi$IAuthTabCallback>, jni_YGNodeStyleSetOverflowJNI {
    private final jw3<yi> onNavigationEvent;

    public dwi$IAuthTabCallback(@NotNull jw3<yi> jw3Var) {
        Intrinsics.checkNotNullParameter(jw3Var, BuildConfig.FLAVOR);
        this.onNavigationEvent = jw3Var;
    }

    public jw3<yi> IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public void a_(@NotNull getPlayDelayedELExpressTimeS<? super yi> getplaydelayedelexpresstimes) {
        Intrinsics.checkNotNullParameter(getplaydelayedelexpresstimes, BuildConfig.FLAVOR);
        IAuthTabCallback().onExtraCallbackWithResult(getplaydelayedelexpresstimes);
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public dwi$IAuthTabCallback onExtraCallback() {
        return new dwi$IAuthTabCallback(new jw3());
    }
}
