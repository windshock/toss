package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.jni_YGNodeStyleSetWidthJNI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class dwi$onNavigationEvent {
    public /* synthetic */ dwi$onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private dwi$onNavigationEvent() {
    }

    public final dwi onWarmupCompleted(@NotNull Function1<? super jni_YGNodeStyleSetWidthJNI.onWarmupCompleted, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
        dwi$IAuthTabCallback dwi_iauthtabcallback = new dwi$IAuthTabCallback(new jw3());
        function1.invoke(dwi_iauthtabcallback);
        return new dwi(dwi_iauthtabcallback.onNavigationEvent());
    }
}
