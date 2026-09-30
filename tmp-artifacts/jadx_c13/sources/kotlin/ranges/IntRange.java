package kotlin.ranges;

import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.access4700;
import o.getUnreadableElfFilesCount;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class IntRange extends IntProgression implements getUnreadableElfFilesCount<Integer>, access4700<Integer> {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final IntRange EMPTY = new IntRange(1, 0);

    @Deprecated
    public static /* synthetic */ void getEndExclusive$annotations() {
    }

    public IntRange(int i, int i2) {
        super(i, i2, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getUnreadableElfFilesCount, o.access4700
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).intValue());
    }

    @Override // o.getUnreadableElfFilesCount, o.access4700
    public Integer getStart() {
        return Integer.valueOf(getFirst());
    }

    @Override // o.getUnreadableElfFilesCount
    public Integer getEndInclusive() {
        return Integer.valueOf(getLast());
    }

    @Override // o.access4700
    public Integer getEndExclusive() {
        if (getLast() == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
        }
        return Integer.valueOf(getLast() + 1);
    }

    public boolean contains(int i) {
        return getFirst() <= i && i <= getLast();
    }

    @Override // kotlin.ranges.IntProgression, o.getUnreadableElfFilesCount
    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // kotlin.ranges.IntProgression
    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) obj).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) obj;
        return getFirst() == intRange.getFirst() && getLast() == intRange.getLast();
    }

    @Override // kotlin.ranges.IntProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    @Override // kotlin.ranges.IntProgression
    public String toString() {
        return getFirst() + ".." + getLast();
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final IntRange IAuthTabCallback() {
            return IntRange.EMPTY;
        }
    }
}
