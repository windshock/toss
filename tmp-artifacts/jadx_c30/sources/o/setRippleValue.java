package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.spv;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setRippleValue implements KSerializer<jni_YGNodeStyleGetMinHeightJNI> {
    public static final setRippleValue onExtraCallback = new setRippleValue();
    private static final SerialDescriptor onNavigationEvent = ujb.onExtraCallbackWithResult("kotlinx.datetime.DatePeriod/ISO", spv.IAuthTabCallbackStub.onExtraCallback);

    private setRippleValue() {
    }

    public SerialDescriptor getDescriptor() {
        return onNavigationEvent;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.qn */
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public jni_YGNodeStyleGetMinHeightJNI deserialize(@NotNull Decoder decoder) throws Throwable {
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        jni_YGNodeStyleGetPaddingJNI jni_ygnodestylegetpaddingjniOnWarmupCompleted = jni_YGNodeStyleGetPaddingJNI.Companion.onWarmupCompleted(decoder.IAuthTabCallback_Parcel());
        if (jni_ygnodestylegetpaddingjniOnWarmupCompleted instanceof jni_YGNodeStyleGetMinHeightJNI) {
            return (jni_YGNodeStyleGetMinHeightJNI) jni_ygnodestylegetpaddingjniOnWarmupCompleted;
        }
        throw new qn(jni_ygnodestylegetpaddingjniOnWarmupCompleted + " is not a date-based period");
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull jni_YGNodeStyleGetMinHeightJNI jni_ygnodestylegetminheightjni) {
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(jni_ygnodestylegetminheightjni, BuildConfig.FLAVOR);
        encoder.onExtraCallbackWithResult(jni_ygnodestylegetminheightjni.toString());
    }
}
