package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.spv;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class makeView implements KSerializer<getCommandLine> {
    public static final makeView onExtraCallbackWithResult = new makeView();
    private static final SerialDescriptor onExtraCallback = new setLottieAppNameMaxLength("kotlin.uuid.Uuid", spv.IAuthTabCallbackStub.onExtraCallback);

    private makeView() {
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return onExtraCallback;
    }

    @Override // o.py
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull getCommandLine getcommandline) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(getcommandline, "");
        encoder.onExtraCallbackWithResult(getcommandline.toString());
    }

    @Override // o.jp
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public getCommandLine deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return getCommandLine.Companion.onExtraCallback(decoder.IAuthTabCallback_Parcel());
    }
}
