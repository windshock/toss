package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.spv;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class oty1 implements KSerializer<Long> {
    public static final oty1 onExtraCallback = new oty1();
    private static final SerialDescriptor onWarmupCompleted = new setLottieAppNameMaxLength("kotlin.Long", spv.asInterface.onWarmupCompleted);

    private oty1() {
    }

    @Override // o.py
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        onExtraCallbackWithResult(encoder, ((Number) obj).longValue());
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return onWarmupCompleted;
    }

    public void onExtraCallbackWithResult(@NotNull Encoder encoder, long j) {
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.onExtraCallbackWithResult(j);
    }

    @Override // o.jp
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public Long deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return Long.valueOf(decoder.access100());
    }
}
