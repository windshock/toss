package kotlin.comparisons;

import java.util.Comparator;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class ReversedComparator<T> implements Comparator<T> {
    private final Comparator<T> onWarmupCompleted;

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        return this.onWarmupCompleted.compare(t2, t);
    }

    @Override // java.util.Comparator
    public final Comparator<T> reversed() {
        return this.onWarmupCompleted;
    }
}
