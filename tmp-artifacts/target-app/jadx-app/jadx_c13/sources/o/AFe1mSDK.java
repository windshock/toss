package o;

import kotlin.Unit;
import kotlinx.serialization.json.JsonObject;
import o.getAdvertisingId;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface AFe1mSDK {
    <T> Object IAuthTabCallback(@NotNull String str, @NotNull Class<T> cls, @NotNull access13800<? super T> access13800Var);

    Object onExtraCallback(@NotNull access13800<? super Unit> access13800Var);

    <T> Object onExtraCallbackWithResult(@NotNull getAdvertisingId.onExtraCallbackWithResult onextracallbackwithresult, @NotNull Class<T> cls, @NotNull access13800<? super T> access13800Var);

    Object onNavigationEvent(@NotNull access13800<? super JsonObject> access13800Var);
}
