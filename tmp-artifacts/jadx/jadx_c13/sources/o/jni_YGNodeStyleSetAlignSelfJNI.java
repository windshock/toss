package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.setRevisionBytes;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class jni_YGNodeStyleSetAlignSelfJNI {
    public static final setRevisionBytes IAuthTabCallback(@NotNull setRevisionBytes.onExtraCallback onextracallback, @NotNull CharSequence charSequence, @NotNull jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetPositionPercentJNI> jni_ygnodeswapchildjni) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(jni_ygnodeswapchildjni, "");
        try {
            return jni_YGNodeStyleSetPositionPercentJNI.onWarmupCompleted(jni_ygnodeswapchildjni.onExtraCallback(charSequence), null, 1, null);
        } catch (IllegalArgumentException e) {
            throw new jni_YGNodeStyleGetMaxHeightJNI("Failed to parse an instant from '" + ((Object) charSequence) + '\'', e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(setRevisionBytes setrevisionbytes, jni_YGNodeStyleSetMarginAutoJNI jni_ygnodestylesetmarginautojni, jni_YGNodeStyleSetPositionPercentJNI jni_ygnodestylesetpositionpercentjni) {
        Intrinsics.checkNotNullParameter(jni_ygnodestylesetpositionpercentjni, "");
        jni_ygnodestylesetpositionpercentjni.onNavigationEvent(setrevisionbytes, jni_ygnodestylesetmarginautojni);
        return Unit.INSTANCE;
    }
}
