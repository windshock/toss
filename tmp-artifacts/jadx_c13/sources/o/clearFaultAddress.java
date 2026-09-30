package o;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class clearFaultAddress {
    public static <T> Set<T> onNavigationEvent(T t) {
        Set<T> setSingleton = Collections.singleton(t);
        Intrinsics.checkNotNullExpressionValue(setSingleton, "");
        return setSingleton;
    }

    public static <E> Set<E> IAuthTabCallback() {
        return new setNumber();
    }

    public static <E> Set<E> onExtraCallbackWithResult(int i) {
        return new setNumber(i);
    }

    public static <E> Set<E> onExtraCallback(@NotNull Set<E> set) {
        Intrinsics.checkNotNullParameter(set, "");
        return ((setNumber) set).onWarmupCompleted();
    }
}
