package o;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class encryptType4 implements KSerializer<JsonObject> {
    public static final encryptType4 IAuthTabCallback = new encryptType4();
    private static final SerialDescriptor onNavigationEvent = onWarmupCompleted.onExtraCallback;

    private encryptType4() {
    }

    static final class onWarmupCompleted implements SerialDescriptor {
        public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();
        private static final String onWarmupCompleted = "kotlinx.serialization.json.JsonObject";
        private final /* synthetic */ SerialDescriptor onNavigationEvent = sp.onExtraCallback(sp.onExtraCallbackWithResult(StringCompanionObject.INSTANCE), clickEvent.onExtraCallback).getDescriptor();

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public vbt IAuthTabCallback() {
            return this.onNavigationEvent.IAuthTabCallback();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean asInterface() {
            return this.onNavigationEvent.asInterface();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int onExtraCallback() {
            return this.onNavigationEvent.onExtraCallback();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean onExtraCallback(int i) {
            return this.onNavigationEvent.onExtraCallback(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int onExtraCallbackWithResult(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return this.onNavigationEvent.onExtraCallbackWithResult(str);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List<Annotation> onExtraCallbackWithResult(int i) {
            return this.onNavigationEvent.onExtraCallbackWithResult(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List<Annotation> onNavigationEvent() {
            return this.onNavigationEvent.onNavigationEvent();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public SerialDescriptor onNavigationEvent(int i) {
            return this.onNavigationEvent.onNavigationEvent(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String onWarmupCompleted(int i) {
            return this.onNavigationEvent.onWarmupCompleted(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean onWarmupCompleted() {
            return this.onNavigationEvent.onWarmupCompleted();
        }

        private onWarmupCompleted() {
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String onExtraCallbackWithResult() {
            return onWarmupCompleted;
        }
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return onNavigationEvent;
    }

    @Override // o.py
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        getCurrentVideoState.onNavigationEvent(encoder);
        sp.onExtraCallback(sp.onExtraCallbackWithResult(StringCompanionObject.INSTANCE), clickEvent.onExtraCallback).serialize(encoder, jsonObject);
    }

    @Override // o.jp
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public JsonObject deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        getCurrentVideoState.onWarmupCompleted(decoder);
        return new JsonObject((Map) sp.onExtraCallback(sp.onExtraCallbackWithResult(StringCompanionObject.INSTANCE), clickEvent.onExtraCallback).deserialize(decoder));
    }
}
