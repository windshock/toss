package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.spv;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setTimedown implements KSerializer<setLogBuffers> {
    public static final setTimedown IAuthTabCallback = new setTimedown();
    private static final SerialDescriptor onWarmupCompleted = new setLottieAppNameMaxLength("kotlin.time.Duration", spv.IAuthTabCallbackStub.onExtraCallback);

    private setTimedown() {
    }

    @Override // o.jp
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return setLogBuffers.onWarmupCompleted(onNavigationEvent(decoder));
    }

    @Override // o.py
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        onExtraCallback(encoder, ((setLogBuffers) obj).onExtraCallback());
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return onWarmupCompleted;
    }

    public void onExtraCallback(@NotNull Encoder encoder, long j) {
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.onExtraCallbackWithResult(setLogBuffers.onActivityResized(j));
    }

    public long onNavigationEvent(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return setLogBuffers.Companion.onNavigationEvent(decoder.IAuthTabCallback_Parcel());
    }
}
