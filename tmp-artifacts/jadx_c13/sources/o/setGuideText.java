package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setGuideText<T> implements KSerializer<T> {
    private final SerialDescriptor IAuthTabCallback;
    private final KSerializer<T> onNavigationEvent;

    public setGuideText(@NotNull KSerializer<T> kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "");
        this.onNavigationEvent = kSerializer;
        this.IAuthTabCallback = new getTopTextView(kSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return this.IAuthTabCallback;
    }

    @Override // o.py
    public void serialize(@NotNull Encoder encoder, @Nullable T t) {
        Intrinsics.checkNotNullParameter(encoder, "");
        if (t != null) {
            encoder.IAuthTabCallback();
            encoder.onExtraCallbackWithResult(this.onNavigationEvent, t);
        } else {
            encoder.onWarmupCompleted();
        }
    }

    @Override // o.jp
    public T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return decoder.onNavigationEvent() ? (T) decoder.onWarmupCompleted(this.onNavigationEvent) : (T) decoder.onExtraCallback();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && setGuideText.class == obj.getClass() && Intrinsics.areEqual(this.onNavigationEvent, ((setGuideText) obj).onNavigationEvent);
    }

    public int hashCode() {
        return this.onNavigationEvent.hashCode();
    }
}
