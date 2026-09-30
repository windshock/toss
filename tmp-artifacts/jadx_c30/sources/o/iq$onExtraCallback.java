package o;

import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class iq$onExtraCallback implements jni_YGNodeStyleSetMaxWidthJNI<jni_YGNodeStyleSetMinWidthJNI, iq$onExtraCallback>, jni_YGNodeStyleSetMinHeightJNI {
    private final jw3<jni_YGNodeStyleSetMinWidthJNI> onExtraCallback;

    public iq$onExtraCallback(@NotNull jw3<jni_YGNodeStyleSetMinWidthJNI> jw3Var) {
        Intrinsics.checkNotNullParameter(jw3Var, BuildConfig.FLAVOR);
        this.onExtraCallback = jw3Var;
    }

    public jw3<jni_YGNodeStyleSetMinWidthJNI> IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public void onExtraCallbackWithResult(@NotNull getPlayDelayedELExpressTimeS<? super jni_YGNodeStyleSetMinWidthJNI> getplaydelayedelexpresstimes) {
        Intrinsics.checkNotNullParameter(getplaydelayedelexpresstimes, BuildConfig.FLAVOR);
        IAuthTabCallback().onExtraCallbackWithResult(getplaydelayedelexpresstimes);
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public iq$onExtraCallback onExtraCallback() {
        return new iq$onExtraCallback(new jw3());
    }
}
