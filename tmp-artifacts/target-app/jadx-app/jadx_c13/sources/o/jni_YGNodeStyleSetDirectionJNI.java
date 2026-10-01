package o;

import kotlin.jvm.internal.Intrinsics;
import o.jni_YGNodeStyleGetPositionTypeJNI;
import o.jni_YGNodeStyleSetAspectRatioJNI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleSetDirectionJNI {
    public static final jni_YGNodeStyleSetAspectRatioJNI IAuthTabCallback(@NotNull jni_YGNodeStyleSetAspectRatioJNI jni_ygnodestylesetaspectratiojni, int i, @NotNull jni_YGNodeStyleGetPositionTypeJNI.onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetaspectratiojni, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        return jni_YGNodeStyleSetFlexBasisAutoJNI.onWarmupCompleted(jni_ygnodestylesetaspectratiojni, i, onextracallback);
    }

    public static final jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetAspectRatioJNI> onExtraCallback() {
        return jni_YGNodeStyleSetAspectRatioJNI.onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult();
    }
}
