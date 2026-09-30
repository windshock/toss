package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosThreadBuilder implements getUnreadableElfFilesList<Double> {
    private final double IAuthTabCallback;
    private final double onExtraCallback;

    public boolean IAuthTabCallback(double d, double d2) {
        return d <= d2;
    }

    public TombstoneProtosThreadBuilder(double d, double d2) {
        this.onExtraCallback = d;
        this.IAuthTabCallback = d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getUnreadableElfFilesList
    public /* bridge */ /* synthetic */ boolean IAuthTabCallback(Comparable comparable, Comparable comparable2) {
        return IAuthTabCallback(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getUnreadableElfFilesList, o.getUnreadableElfFilesCount, o.access4700
    public /* synthetic */ boolean contains(Comparable comparable) {
        return onWarmupCompleted(((Number) comparable).doubleValue());
    }

    @Override // o.getUnreadableElfFilesCount, o.access4700
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public Double getStart() {
        return Double.valueOf(this.onExtraCallback);
    }

    @Override // o.getUnreadableElfFilesCount
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public Double getEndInclusive() {
        return Double.valueOf(this.IAuthTabCallback);
    }

    public boolean onWarmupCompleted(double d) {
        return d >= this.onExtraCallback && d <= this.IAuthTabCallback;
    }

    @Override // o.getUnreadableElfFilesList, o.getUnreadableElfFilesCount
    public boolean isEmpty() {
        return this.onExtraCallback > this.IAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof TombstoneProtosThreadBuilder)) {
            return false;
        }
        if (isEmpty() && ((TombstoneProtosThreadBuilder) obj).isEmpty()) {
            return true;
        }
        TombstoneProtosThreadBuilder tombstoneProtosThreadBuilder = (TombstoneProtosThreadBuilder) obj;
        return this.onExtraCallback == tombstoneProtosThreadBuilder.onExtraCallback && this.IAuthTabCallback == tombstoneProtosThreadBuilder.IAuthTabCallback;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.onExtraCallback) * 31) + Double.hashCode(this.IAuthTabCallback);
    }

    public String toString() {
        return this.onExtraCallback + ".." + this.IAuthTabCallback;
    }
}
