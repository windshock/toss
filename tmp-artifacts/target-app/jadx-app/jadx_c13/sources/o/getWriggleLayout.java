package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.spv;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getWriggleLayout implements KSerializer<String> {
    public static final getWriggleLayout onNavigationEvent = new getWriggleLayout();
    private static final SerialDescriptor onWarmupCompleted = new setLottieAppNameMaxLength("kotlin.String", spv.IAuthTabCallbackStub.onExtraCallback);

    private getWriggleLayout() {
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return onWarmupCompleted;
    }

    @Override // o.py
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull String str) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(str, "");
        encoder.onExtraCallbackWithResult(str);
    }

    @Override // o.jp
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public String deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return decoder.IAuthTabCallback_Parcel();
    }
}
