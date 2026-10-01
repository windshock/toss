package kotlinx.serialization.json;

import kotlinx.serialization.KSerializer;
import o.IDefaultEncrypt;
import o.liq;

@liq(onNavigationEvent = IDefaultEncrypt.class)
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class JsonNull extends JsonPrimitive {
    public static final JsonNull INSTANCE = new JsonNull();
    private static final String content = "null";

    @Override // kotlinx.serialization.json.JsonPrimitive
    public boolean onExtraCallbackWithResult() {
        return false;
    }

    public final KSerializer<JsonNull> serializer() {
        return IDefaultEncrypt.onNavigationEvent;
    }

    private JsonNull() {
        super(null);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String onWarmupCompleted() {
        return content;
    }
}
