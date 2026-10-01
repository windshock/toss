package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class thx11 implements KSerializer<access13000> {
    public static final thx11 onWarmupCompleted = new thx11();
    private static final SerialDescriptor IAuthTabCallback = getBeginInvisibleAndShow.onExtraCallbackWithResult("kotlin.ULong", sp.onNavigationEvent(LongCompanionObject.INSTANCE));

    private thx11() {
    }

    @Override // o.jp
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return access13000.onNavigationEvent(onWarmupCompleted(decoder));
    }

    @Override // o.py
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        onNavigationEvent(encoder, ((access13000) obj).onExtraCallback());
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return IAuthTabCallback;
    }

    public void onNavigationEvent(@NotNull Encoder encoder, long j) {
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.onWarmupCompleted(getDescriptor()).onExtraCallbackWithResult(j);
    }

    public long onWarmupCompleted(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return access13000.onExtraCallback(decoder.onExtraCallback(getDescriptor()).access100());
    }
}
