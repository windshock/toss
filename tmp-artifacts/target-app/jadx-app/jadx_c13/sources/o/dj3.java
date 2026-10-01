package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.spv;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class dj3 implements KSerializer<Float> {
    public static final dj3 onWarmupCompleted = new dj3();
    private static final SerialDescriptor IAuthTabCallback = new setLottieAppNameMaxLength("kotlin.Float", spv.onExtraCallbackWithResult.IAuthTabCallback);

    private dj3() {
    }

    @Override // o.py
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        onExtraCallback(encoder, ((Number) obj).floatValue());
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return IAuthTabCallback;
    }

    public void onExtraCallback(@NotNull Encoder encoder, float f) {
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.onExtraCallback(f);
    }

    @Override // o.jp
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public Float deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return Float.valueOf(decoder.asBinder());
    }
}
