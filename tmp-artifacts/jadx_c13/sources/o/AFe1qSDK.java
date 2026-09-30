package o;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import o.getAdvertisingId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface AFe1qSDK {
    <T> Object IAuthTabCallback(@NotNull getAdvertisingId.IAuthTabCallback iAuthTabCallback, @NotNull Class<T> cls, @Nullable T t, @NotNull access13800<? super T> access13800Var);

    Object IAuthTabCallback(boolean z, @NotNull access13800<? super Unit> access13800Var);

    List<Pair<String, String>> onExtraCallbackWithResult();

    Object onNavigationEvent(@NotNull getAdvertisingId.IAuthTabCallback[] iAuthTabCallbackArr, @NotNull access13800<? super Map<String, String>> access13800Var);
}
