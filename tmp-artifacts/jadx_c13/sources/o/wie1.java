package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class wie1 implements KSerializer<getU64> {
    public static final wie1 onNavigationEvent = new wie1();
    private static final SerialDescriptor IAuthTabCallback = getBeginInvisibleAndShow.onExtraCallbackWithResult("kotlin.UShort", sp.onNavigationEvent(ShortCompanionObject.INSTANCE));

    private wie1() {
    }

    @Override // o.jp
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return getU64.onExtraCallback(onExtraCallbackWithResult(decoder));
    }

    @Override // o.py
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        onExtraCallbackWithResult(encoder, ((getU64) obj).onExtraCallbackWithResult());
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return IAuthTabCallback;
    }

    public void onExtraCallbackWithResult(@NotNull Encoder encoder, short s) {
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.onWarmupCompleted(getDescriptor()).onExtraCallbackWithResult(s);
    }

    public short onExtraCallbackWithResult(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return getU64.onNavigationEvent(decoder.onExtraCallback(getDescriptor()).IAuthTabCallbackStubProxy());
    }
}
