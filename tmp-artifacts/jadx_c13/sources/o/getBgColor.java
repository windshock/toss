package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.spv;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getBgColor implements KSerializer<Boolean> {
    public static final getBgColor IAuthTabCallback = new getBgColor();
    private static final SerialDescriptor onNavigationEvent = new setLottieAppNameMaxLength("kotlin.Boolean", spv.onNavigationEvent.IAuthTabCallback);

    private getBgColor() {
    }

    @Override // o.py
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        onExtraCallback(encoder, ((Boolean) obj).booleanValue());
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return onNavigationEvent;
    }

    public void onExtraCallback(@NotNull Encoder encoder, boolean z) {
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.onWarmupCompleted(z);
    }

    @Override // o.jp
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return Boolean.valueOf(decoder.onExtraCallbackWithResult());
    }
}
