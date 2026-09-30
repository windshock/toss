package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class xkz2 {
    private final List<JsonElement> onExtraCallback = new ArrayList();

    public final boolean onWarmupCompleted(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        this.onExtraCallback.add(jsonElement);
        return true;
    }

    public final JsonArray onNavigationEvent() {
        return new JsonArray(this.onExtraCallback);
    }
}
