package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.clickEvent;
import o.qt;
import o.ufy;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clickEvent implements KSerializer<JsonElement> {
    public static final clickEvent onExtraCallback = new clickEvent();
    private static final SerialDescriptor onExtraCallbackWithResult = ujb.onExtraCallback("kotlinx.serialization.json.JsonElement", ufy.onWarmupCompleted.onNavigationEvent, new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return clickEvent.onWarmupCompleted((qt) obj);
        }
    });

    private clickEvent() {
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return onExtraCallbackWithResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor asBinder() {
        return decryptType4.onExtraCallback.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(qt qtVar) {
        Intrinsics.checkNotNullParameter(qtVar, "");
        qt.onExtraCallback(qtVar, "JsonPrimitive", getCurrentVideoState.IAuthTabCallback((Function0<? extends SerialDescriptor>) new Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return clickEvent.asBinder();
            }
        }), null, false, 12, null);
        qt.onExtraCallback(qtVar, "JsonNull", getCurrentVideoState.IAuthTabCallback((Function0<? extends SerialDescriptor>) new Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return clickEvent.IAuthTabCallbackStub();
            }
        }), null, false, 12, null);
        qt.onExtraCallback(qtVar, "JsonLiteral", getCurrentVideoState.IAuthTabCallback((Function0<? extends SerialDescriptor>) new Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return clickEvent.onTransact();
            }
        }), null, false, 12, null);
        qt.onExtraCallback(qtVar, "JsonObject", getCurrentVideoState.IAuthTabCallback((Function0<? extends SerialDescriptor>) new Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return clickEvent.IAuthTabCallbackDefault();
            }
        }), null, false, 12, null);
        qt.onExtraCallback(qtVar, "JsonArray", getCurrentVideoState.IAuthTabCallback((Function0<? extends SerialDescriptor>) new Function0() { // from class: kotlinx.serialization.json.JsonElementSerializer$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return clickEvent.asInterface();
            }
        }), null, false, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor IAuthTabCallbackStub() {
        return IDefaultEncrypt.onNavigationEvent.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor onTransact() {
        return PangleEncryptConstantCryptDataScene.IAuthTabCallback.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor IAuthTabCallbackDefault() {
        return encryptType4.IAuthTabCallback.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor asInterface() {
        return setAnimationDuration.onExtraCallback.getDescriptor();
    }

    @Override // o.py
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        getCurrentVideoState.onNavigationEvent(encoder);
        if (jsonElement instanceof JsonPrimitive) {
            encoder.onExtraCallbackWithResult(decryptType4.onExtraCallback, jsonElement);
        } else if (jsonElement instanceof JsonObject) {
            encoder.onExtraCallbackWithResult(encryptType4.IAuthTabCallback, jsonElement);
        } else {
            if (!(jsonElement instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.onExtraCallbackWithResult(setAnimationDuration.onExtraCallback, jsonElement);
        }
    }

    @Override // o.jp
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public JsonElement deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return getCurrentVideoState.onExtraCallback(decoder).onWarmupCompleted();
    }
}
