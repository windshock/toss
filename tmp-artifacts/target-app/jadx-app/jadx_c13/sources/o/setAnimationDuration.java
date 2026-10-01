package o;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setAnimationDuration implements KSerializer<JsonArray> {
    public static final setAnimationDuration onExtraCallback = new setAnimationDuration();
    private static final SerialDescriptor onNavigationEvent = onNavigationEvent.onWarmupCompleted;

    private setAnimationDuration() {
    }

    static final class onNavigationEvent implements SerialDescriptor {
        private final /* synthetic */ SerialDescriptor onNavigationEvent = sp.onExtraCallback(clickEvent.onExtraCallback).getDescriptor();
        public static final onNavigationEvent onWarmupCompleted = new onNavigationEvent();
        private static final String onExtraCallbackWithResult = "kotlinx.serialization.json.JsonArray";

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

        private onNavigationEvent() {
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String onExtraCallbackWithResult() {
            return onExtraCallbackWithResult;
        }
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return onNavigationEvent;
    }

    @Override // o.py
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull JsonArray jsonArray) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(jsonArray, "");
        getCurrentVideoState.onNavigationEvent(encoder);
        sp.onExtraCallback(clickEvent.onExtraCallback).serialize(encoder, jsonArray);
    }

    @Override // o.jp
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public JsonArray deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        getCurrentVideoState.onWarmupCompleted(decoder);
        return new JsonArray((List) sp.onExtraCallback(clickEvent.onExtraCallback).deserialize(decoder));
    }
}
