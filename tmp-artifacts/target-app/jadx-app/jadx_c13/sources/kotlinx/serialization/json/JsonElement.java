package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.clickEvent;
import o.liq;

@liq(onNavigationEvent = clickEvent.class)
/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class JsonElement {
    public static final Companion Companion = new Companion(null);

    public /* synthetic */ JsonElement(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<JsonElement> serializer() {
            return clickEvent.onExtraCallback;
        }
    }

    private JsonElement() {
    }
}
