package o;

import java.util.Comparator;
import kotlin.comparisons.ReverseOrderComparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSenderPid implements Comparator<Comparable<? super Object>> {
    public static final getSenderPid onWarmupCompleted = new getSenderPid();

    private getSenderPid() {
    }

    @Override // java.util.Comparator
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull Comparable<Object> comparable, @NotNull Comparable<Object> comparable2) {
        Intrinsics.checkNotNullParameter(comparable, "");
        Intrinsics.checkNotNullParameter(comparable2, "");
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return ReverseOrderComparator.onWarmupCompleted;
    }
}
