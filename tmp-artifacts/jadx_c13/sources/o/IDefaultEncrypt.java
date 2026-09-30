package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.internal.JsonDecodingException;
import o.vbt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class IDefaultEncrypt implements KSerializer<JsonNull> {
    public static final IDefaultEncrypt onNavigationEvent = new IDefaultEncrypt();
    private static final SerialDescriptor IAuthTabCallback = ujb.IAuthTabCallback("kotlinx.serialization.json.JsonNull", vbt.onExtraCallbackWithResult.onWarmupCompleted, new SerialDescriptor[0], null, 8, null);

    private IDefaultEncrypt() {
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return IAuthTabCallback;
    }

    @Override // o.py
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull JsonNull jsonNull) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(jsonNull, "");
        getCurrentVideoState.onNavigationEvent(encoder);
        encoder.onWarmupCompleted();
    }

    @Override // o.jp
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public JsonNull deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        getCurrentVideoState.onWarmupCompleted(decoder);
        if (decoder.onNavigationEvent()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        return JsonNull.INSTANCE;
    }
}
