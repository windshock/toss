package o;

import kotlin.Unit;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getAdvertisingIdWithGps {
    Object onExtraCallback(@NotNull access13800<? super JsonObject> access13800Var);

    Object onExtraCallbackWithResult(@NotNull String str, @NotNull access13800<? super JsonPrimitive> access13800Var);

    Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var);
}
