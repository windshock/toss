package o;

import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class pmi2 implements KSerializer<UByte> {
    public static final pmi2 IAuthTabCallback = new pmi2();
    private static final SerialDescriptor onExtraCallbackWithResult = getBeginInvisibleAndShow.onExtraCallbackWithResult("kotlin.UByte", sp.onExtraCallback(ByteCompanionObject.INSTANCE));

    private pmi2() {
    }

    @Override // o.jp
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return UByte.m33boximpl(onExtraCallback(decoder));
    }

    @Override // o.py
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        IAuthTabCallback(encoder, ((UByte) obj).onWarmupCompleted());
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return onExtraCallbackWithResult;
    }

    public void IAuthTabCallback(@NotNull Encoder encoder, byte b) {
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.onWarmupCompleted(getDescriptor()).onExtraCallbackWithResult(b);
    }

    public byte onExtraCallback(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return UByte.m34constructorimpl(decoder.onExtraCallback(getDescriptor()).IAuthTabCallbackStub());
    }
}
