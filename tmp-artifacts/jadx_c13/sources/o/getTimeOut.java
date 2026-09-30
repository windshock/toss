package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.spv;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getTimeOut implements KSerializer<Character> {
    public static final getTimeOut onExtraCallbackWithResult = new getTimeOut();
    private static final SerialDescriptor onWarmupCompleted = new setLottieAppNameMaxLength("kotlin.Char", spv.onWarmupCompleted.onWarmupCompleted);

    private getTimeOut() {
    }

    @Override // o.py
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        onExtraCallback(encoder, ((Character) obj).charValue());
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return onWarmupCompleted;
    }

    public void onExtraCallback(@NotNull Encoder encoder, char c) {
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.IAuthTabCallback(c);
    }

    @Override // o.jp
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public Character deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return Character.valueOf(decoder.onTransact());
    }
}
