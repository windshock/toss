package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class encryptType4WithoutBase64<T> implements KSerializer<T> {
    private final KSerializer<T> onExtraCallbackWithResult;

    protected JsonElement onNavigationEvent(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        return jsonElement;
    }

    protected JsonElement onWarmupCompleted(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        return jsonElement;
    }

    public encryptType4WithoutBase64(@NotNull KSerializer<T> kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "");
        this.onExtraCallbackWithResult = kSerializer;
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return this.onExtraCallbackWithResult.getDescriptor();
    }

    @Override // o.py
    public final void serialize(@NotNull Encoder encoder, T t) {
        Intrinsics.checkNotNullParameter(encoder, "");
        skipVideo skipvideoIAuthTabCallback = getCurrentVideoState.IAuthTabCallback(encoder);
        skipvideoIAuthTabCallback.onExtraCallbackWithResult(onWarmupCompleted(djsya.onNavigationEvent(skipvideoIAuthTabCallback.onExtraCallback(), t, this.onExtraCallbackWithResult)));
    }

    @Override // o.jp
    public final T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        setAnimationType setanimationtypeOnExtraCallback = getCurrentVideoState.onExtraCallback(decoder);
        return (T) setanimationtypeOnExtraCallback.access000().onExtraCallbackWithResult(this.onExtraCallbackWithResult, onNavigationEvent(setanimationtypeOnExtraCallback.onWarmupCompleted()));
    }
}
