package o;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class clearNumber extends clearFaultAddress {
    public static <T> Set<T> onNavigationEvent() {
        return access7100.onExtraCallback;
    }

    public static <T> Set<T> asBinder(@NotNull T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return ArraysKt___ArraysKt.toSet(tArr);
    }

    public static <T> Set<T> IAuthTabCallbackStub(@NotNull T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (Set) ArraysKt___ArraysKt.toCollection(tArr, new LinkedHashSet(access8200.onNavigationEvent(tArr.length)));
    }

    public static <T> HashSet<T> IAuthTabCallback(@NotNull T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (HashSet) ArraysKt___ArraysKt.toCollection(tArr, new HashSet(access8200.onNavigationEvent(tArr.length)));
    }

    public static <T> Set<T> onWarmupCompleted(@Nullable T t) {
        return t != null ? clearFaultAddress.onNavigationEvent(t) : onNavigationEvent();
    }

    public static <T> Set<T> IAuthTabCallbackDefault(@NotNull T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (Set) ArraysKt___ArraysKt.filterNotNullTo(tArr, new LinkedHashSet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> IAuthTabCallback(@NotNull Set<? extends T> set) {
        Intrinsics.checkNotNullParameter(set, "");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : clearFaultAddress.onNavigationEvent(set.iterator().next());
        }
        return onNavigationEvent();
    }
}
