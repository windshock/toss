package o;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt3 {
    public static final <T> lt5<T> onExtraCallback(@NotNull List<? extends lt5<? super T>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list.isEmpty() ? lt8.IAuthTabCallback : list.size() == 1 ? (lt5) CollectionsKt___CollectionsKt.single((List) list) : new jwzb(list);
    }
}
