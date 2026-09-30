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
public final class setBrickNativeValue implements KSerializer<jni_YGNodeStyleGetPaddingJNI> {
    private final /* synthetic */ dj2 IAuthTabCallback = dj2.IAuthTabCallback;
    public static final setBrickNativeValue onWarmupCompleted = new setBrickNativeValue();
    private static final SerialDescriptor onNavigationEvent = ujb.onExtraCallbackWithResult("kotlinx.datetime.DateTimePeriod", spv.IAuthTabCallbackStub.onExtraCallback);

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public jni_YGNodeStyleGetPaddingJNI deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        return this.IAuthTabCallback.deserialize(decoder);
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull jni_YGNodeStyleGetPaddingJNI jni_ygnodestylegetpaddingjni) {
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(jni_ygnodestylegetpaddingjni, BuildConfig.FLAVOR);
        this.IAuthTabCallback.serialize(encoder, jni_ygnodestylegetpaddingjni);
    }

    private setBrickNativeValue() {
    }

    public SerialDescriptor getDescriptor() {
        return onNavigationEvent;
    }
}
