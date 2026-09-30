package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.spv;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setVideoListener implements KSerializer<Double> {
    public static final setVideoListener onWarmupCompleted = new setVideoListener();
    private static final SerialDescriptor onExtraCallbackWithResult = new setLottieAppNameMaxLength("kotlin.Double", spv.onExtraCallback.IAuthTabCallback);

    private setVideoListener() {
    }

    @Override // o.py
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        onWarmupCompleted(encoder, ((Number) obj).doubleValue());
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return onExtraCallbackWithResult;
    }

    public void onWarmupCompleted(@NotNull Encoder encoder, double d) {
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.onNavigationEvent(d);
    }

    @Override // o.jp
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public Double deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return Double.valueOf(decoder.IAuthTabCallbackDefault());
    }
}
