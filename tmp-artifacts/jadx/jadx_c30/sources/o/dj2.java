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
public final class dj2 implements KSerializer<jni_YGNodeStyleGetPaddingJNI> {
    public static final dj2 IAuthTabCallback = new dj2();
    private static final SerialDescriptor onExtraCallbackWithResult = ujb.onExtraCallbackWithResult("kotlinx.datetime.DateTimePeriod/ISO", spv.IAuthTabCallbackStub.onExtraCallback);

    private dj2() {
    }

    public SerialDescriptor getDescriptor() {
        return onExtraCallbackWithResult;
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public jni_YGNodeStyleGetPaddingJNI deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        return jni_YGNodeStyleGetPaddingJNI.Companion.onWarmupCompleted(decoder.IAuthTabCallback_Parcel());
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull jni_YGNodeStyleGetPaddingJNI jni_ygnodestylegetpaddingjni) {
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(jni_ygnodestylegetpaddingjni, BuildConfig.FLAVOR);
        encoder.onExtraCallbackWithResult(jni_ygnodestylegetpaddingjni.toString());
    }
}
