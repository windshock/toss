package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.spv;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getDynamicHeight implements KSerializer<Integer> {
    public static final getDynamicHeight onWarmupCompleted = new getDynamicHeight();
    private static final SerialDescriptor onNavigationEvent = new setLottieAppNameMaxLength("kotlin.Int", spv.onTransact.onNavigationEvent);

    private getDynamicHeight() {
    }

    @Override // o.py
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        onExtraCallbackWithResult(encoder, ((Number) obj).intValue());
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return onNavigationEvent;
    }

    public void onExtraCallbackWithResult(@NotNull Encoder encoder, int i) {
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.onWarmupCompleted(i);
    }

    @Override // o.jp
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return Integer.valueOf(decoder.asInterface());
    }
}
