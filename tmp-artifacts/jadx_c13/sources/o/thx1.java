package o;

import kotlin.UInt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class thx1 implements KSerializer<UInt> {
    public static final thx1 IAuthTabCallback = new thx1();
    private static final SerialDescriptor onWarmupCompleted = getBeginInvisibleAndShow.onExtraCallbackWithResult("kotlin.UInt", sp.IAuthTabCallback(IntCompanionObject.INSTANCE));

    private thx1() {
    }

    @Override // o.jp
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return UInt.onNavigationEvent(onExtraCallback(decoder));
    }

    @Override // o.py
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        onNavigationEvent(encoder, ((UInt) obj).IAuthTabCallback());
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return onWarmupCompleted;
    }

    public void onNavigationEvent(@NotNull Encoder encoder, int i) {
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.onWarmupCompleted(getDescriptor()).onWarmupCompleted(i);
    }

    public int onExtraCallback(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return UInt.m35constructorimpl(decoder.onExtraCallback(getDescriptor()).asInterface());
    }
}
