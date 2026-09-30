package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.spv;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class beginShowFromInvisible implements KSerializer<Byte> {
    public static final beginShowFromInvisible IAuthTabCallback = new beginShowFromInvisible();
    private static final SerialDescriptor onWarmupCompleted = new setLottieAppNameMaxLength("kotlin.Byte", spv.IAuthTabCallback.onExtraCallbackWithResult);

    private beginShowFromInvisible() {
    }

    @Override // o.py
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        IAuthTabCallback(encoder, ((Number) obj).byteValue());
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return onWarmupCompleted;
    }

    public void IAuthTabCallback(@NotNull Encoder encoder, byte b) {
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.onExtraCallbackWithResult(b);
    }

    @Override // o.jp
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public Byte deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return Byte.valueOf(decoder.IAuthTabCallbackStub());
    }
}
