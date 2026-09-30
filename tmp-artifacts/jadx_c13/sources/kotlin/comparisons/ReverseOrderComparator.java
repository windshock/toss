package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import o.getSenderPid;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReverseOrderComparator implements Comparator<Comparable<? super Object>> {
    public static final ReverseOrderComparator onWarmupCompleted = new ReverseOrderComparator();

    private ReverseOrderComparator() {
    }

    @Override // java.util.Comparator
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull Comparable<Object> comparable, @NotNull Comparable<Object> comparable2) {
        Intrinsics.checkNotNullParameter(comparable, "");
        Intrinsics.checkNotNullParameter(comparable2, "");
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return getSenderPid.onWarmupCompleted;
    }
}
