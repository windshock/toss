package o;

import j$.time.LocalDateTime;
import j$.time.format.DateTimeParseException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class jni_YGNodeStyleSetFlexBasisJNI$onNavigationEvent {
    public /* synthetic */ jni_YGNodeStyleSetFlexBasisJNI$onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private jni_YGNodeStyleSetFlexBasisJNI$onNavigationEvent() {
    }

    public final KSerializer<jni_YGNodeStyleSetFlexBasisJNI> serializer() {
        return bh.onExtraCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.jni_YGNodeStyleGetMaxHeightJNI */
    public final jni_YGNodeStyleSetFlexBasisJNI onNavigationEvent(@NotNull CharSequence charSequence, @NotNull jni_YGNodeSwapChildJNI<jni_YGNodeStyleSetFlexBasisJNI> jni_ygnodeswapchildjni) throws jni_YGNodeStyleGetMaxHeightJNI {
        Intrinsics.checkNotNullParameter(charSequence, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(jni_ygnodeswapchildjni, BuildConfig.FLAVOR);
        if (jni_ygnodeswapchildjni == jni_YGNodeStyleSetFlexBasisJNI$onExtraCallbackWithResult.onExtraCallbackWithResult.onNavigationEvent()) {
            try {
                return new jni_YGNodeStyleSetFlexBasisJNI(LocalDateTime.parse(jw10.onWarmupCompleted(charSequence.toString())));
            } catch (DateTimeParseException e) {
                throw new jni_YGNodeStyleGetMaxHeightJNI(e);
            }
        }
        return (jni_YGNodeStyleSetFlexBasisJNI) jni_ygnodeswapchildjni.onExtraCallback(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jni_YGNodeStyleSetFlexBasisJNI IAuthTabCallback(jni_YGNodeStyleSetFlexBasisJNI$onNavigationEvent jni_ygnodestylesetflexbasisjni_onnavigationevent, CharSequence charSequence, jni_YGNodeSwapChildJNI jni_ygnodeswapchildjni, int i, Object obj) {
        if ((i & 2) != 0) {
            jni_ygnodeswapchildjni = jni_YGNodeStyleSetBoxSizingJNI.onExtraCallbackWithResult();
        }
        return jni_ygnodestylesetflexbasisjni_onnavigationevent.onNavigationEvent(charSequence, jni_ygnodeswapchildjni);
    }
}
