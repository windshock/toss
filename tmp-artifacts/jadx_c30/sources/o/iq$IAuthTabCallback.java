package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.jni_YGNodeStyleSetWidthJNI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class iq$IAuthTabCallback {
    public /* synthetic */ iq$IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private iq$IAuthTabCallback() {
    }

    public final jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetAspectRatioJNI> onNavigationEvent(@NotNull Function1<? super jni_YGNodeStyleSetWidthJNI.onExtraCallbackWithResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
        iq$onExtraCallback iq_onextracallback = new iq$onExtraCallback(new jw3());
        function1.invoke(iq_onextracallback);
        return new iq(iq_onextracallback.onNavigationEvent());
    }
}
