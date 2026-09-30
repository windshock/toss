package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import o.spv;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class decryptType4 implements KSerializer<JsonPrimitive> {
    public static final decryptType4 onExtraCallback = new decryptType4();
    private static final SerialDescriptor onNavigationEvent = ujb.IAuthTabCallback("kotlinx.serialization.json.JsonPrimitive", spv.IAuthTabCallbackStub.onExtraCallback, new SerialDescriptor[0], null, 8, null);

    private decryptType4() {
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return onNavigationEvent;
    }

    @Override // o.py
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        getCurrentVideoState.onNavigationEvent(encoder);
        if (jsonPrimitive instanceof JsonNull) {
            encoder.onExtraCallbackWithResult(IDefaultEncrypt.onNavigationEvent, JsonNull.INSTANCE);
        } else {
            encoder.onExtraCallbackWithResult(PangleEncryptConstantCryptDataScene.IAuthTabCallback, (muteVideo) jsonPrimitive);
        }
    }

    @Override // o.jp
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public JsonPrimitive deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        JsonElement jsonElementOnWarmupCompleted = getCurrentVideoState.onExtraCallback(decoder).onWarmupCompleted();
        if (!(jsonElementOnWarmupCompleted instanceof JsonPrimitive)) {
            throw setTouchStateListener.onExtraCallbackWithResult(-1, "Unexpected JSON element, expected JsonPrimitive, had " + Reflection.getOrCreateKotlinClass(jsonElementOnWarmupCompleted.getClass()), jsonElementOnWarmupCompleted.toString());
        }
        return (JsonPrimitive) jsonElementOnWarmupCompleted;
    }
}
