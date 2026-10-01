package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.spv;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getWriggleProgressIv implements KSerializer<Short> {
    public static final getWriggleProgressIv onWarmupCompleted = new getWriggleProgressIv();
    private static final SerialDescriptor onExtraCallbackWithResult = new setLottieAppNameMaxLength("kotlin.Short", spv.IAuthTabCallbackDefault.onExtraCallback);

    private getWriggleProgressIv() {
    }

    @Override // o.py
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        onExtraCallback(encoder, ((Number) obj).shortValue());
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return onExtraCallbackWithResult;
    }

    public void onExtraCallback(@NotNull Encoder encoder, short s) {
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.onExtraCallbackWithResult(s);
    }

    @Override // o.jp
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public Short deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return Short.valueOf(decoder.IAuthTabCallbackStubProxy());
    }
}
