package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setYRound implements KSerializer {
    public static final setYRound onWarmupCompleted = new setYRound();
    private static final SerialDescriptor onNavigationEvent = ea11.onExtraCallbackWithResult;

    private setYRound() {
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return onNavigationEvent;
    }

    @Override // o.py
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull Void r3) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(r3, "");
        throw new qn("'kotlin.Nothing' cannot be serialized");
    }

    @Override // o.jp
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public Void deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        throw new qn("'kotlin.Nothing' does not have instances");
    }
}
