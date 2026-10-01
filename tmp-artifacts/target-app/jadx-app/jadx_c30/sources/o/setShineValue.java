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
public final class setShineValue implements KSerializer<jni_YGNodeStyleGetMinHeightJNI> {
    private final /* synthetic */ setRippleValue IAuthTabCallback = setRippleValue.onExtraCallback;
    public static final setShineValue onWarmupCompleted = new setShineValue();
    private static final SerialDescriptor onExtraCallbackWithResult = ujb.onExtraCallbackWithResult("kotlinx.datetime.DatePeriod", spv.IAuthTabCallbackStub.onExtraCallback);

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull jni_YGNodeStyleGetMinHeightJNI jni_ygnodestylegetminheightjni) {
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(jni_ygnodestylegetminheightjni, BuildConfig.FLAVOR);
        this.IAuthTabCallback.serialize(encoder, jni_ygnodestylegetminheightjni);
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public jni_YGNodeStyleGetMinHeightJNI deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        return this.IAuthTabCallback.deserialize(decoder);
    }

    private setShineValue() {
    }

    public SerialDescriptor getDescriptor() {
        return onExtraCallbackWithResult;
    }
}
