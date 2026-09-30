package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class PangleEncryptManager {
    private final Map<String, JsonElement> IAuthTabCallback = new LinkedHashMap();

    public final JsonElement onExtraCallbackWithResult(@NotNull String str, @NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        return this.IAuthTabCallback.put(str, jsonElement);
    }

    public final JsonObject onExtraCallbackWithResult() {
        return new JsonObject(this.IAuthTabCallback);
    }
}
