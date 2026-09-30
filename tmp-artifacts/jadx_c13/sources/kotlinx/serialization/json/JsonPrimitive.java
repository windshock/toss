package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.decryptType4;
import o.liq;

@liq(onNavigationEvent = decryptType4.class)
/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class JsonPrimitive extends JsonElement {
    public static final Companion Companion = new Companion(null);

    public /* synthetic */ JsonPrimitive(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean onExtraCallbackWithResult();

    public abstract String onWarmupCompleted();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<JsonPrimitive> serializer() {
            return decryptType4.onExtraCallback;
        }
    }

    private JsonPrimitive() {
        super(null);
    }

    public String toString() {
        return onWarmupCompleted();
    }
}
