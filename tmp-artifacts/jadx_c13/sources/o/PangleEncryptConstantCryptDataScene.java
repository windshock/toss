package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import o.spv;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class PangleEncryptConstantCryptDataScene implements KSerializer<muteVideo> {
    public static final PangleEncryptConstantCryptDataScene IAuthTabCallback = new PangleEncryptConstantCryptDataScene();
    private static final SerialDescriptor onExtraCallback = ujb.onExtraCallbackWithResult("kotlinx.serialization.json.JsonLiteral", spv.IAuthTabCallbackStub.onExtraCallback);

    private PangleEncryptConstantCryptDataScene() {
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return onExtraCallback;
    }

    @Override // o.py
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull muteVideo mutevideo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(mutevideo, "");
        getCurrentVideoState.onNavigationEvent(encoder);
        if (mutevideo.onExtraCallbackWithResult()) {
            encoder.onExtraCallbackWithResult(mutevideo.onWarmupCompleted());
            return;
        }
        if (mutevideo.onExtraCallback() != null) {
            encoder.onWarmupCompleted(mutevideo.onExtraCallback()).onExtraCallbackWithResult(mutevideo.onWarmupCompleted());
            return;
        }
        Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(mutevideo.onWarmupCompleted());
        if (longOrNull != null) {
            encoder.onExtraCallbackWithResult(longOrNull.longValue());
            return;
        }
        access13000 access13000VarIAuthTabCallbackStub = setBuildFingerprintBytes.IAuthTabCallbackStub(mutevideo.onWarmupCompleted());
        if (access13000VarIAuthTabCallbackStub != null) {
            encoder.onWarmupCompleted(sp.onExtraCallback(access13000.Companion).getDescriptor()).onExtraCallbackWithResult(access13000VarIAuthTabCallbackStub.onExtraCallback());
            return;
        }
        Double doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(mutevideo.onWarmupCompleted());
        if (doubleOrNull != null) {
            encoder.onNavigationEvent(doubleOrNull.doubleValue());
            return;
        }
        Boolean booleanStrictOrNull = StringsKt__StringsKt.toBooleanStrictOrNull(mutevideo.onWarmupCompleted());
        if (booleanStrictOrNull != null) {
            encoder.onWarmupCompleted(booleanStrictOrNull.booleanValue());
        } else {
            encoder.onExtraCallbackWithResult(mutevideo.onWarmupCompleted());
        }
    }

    @Override // o.jp
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public muteVideo deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        JsonElement jsonElementOnWarmupCompleted = getCurrentVideoState.onExtraCallback(decoder).onWarmupCompleted();
        if (!(jsonElementOnWarmupCompleted instanceof muteVideo)) {
            throw setTouchStateListener.onExtraCallbackWithResult(-1, "Unexpected JSON element, expected JsonLiteral, had " + Reflection.getOrCreateKotlinClass(jsonElementOnWarmupCompleted.getClass()), jsonElementOnWarmupCompleted.toString());
        }
        return (muteVideo) jsonElementOnWarmupCompleted;
    }
}
