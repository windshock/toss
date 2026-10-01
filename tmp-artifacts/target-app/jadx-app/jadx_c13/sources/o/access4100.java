package o;

import kotlin.collections.LongIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class access4100 implements Iterable<Long>, KMappedMarker {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private final long IAuthTabCallback;
    private final long onNavigationEvent;
    private final long onWarmupCompleted;

    public access4100(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.onNavigationEvent = j;
        this.IAuthTabCallback = access15800.onExtraCallback(j, j2, j3);
        this.onWarmupCompleted = j3;
    }

    public final long onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public final long IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public final long onExtraCallback() {
        return this.onWarmupCompleted;
    }

    @Override // java.lang.Iterable
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public LongIterator iterator() {
        return new TombstoneProtosTombstone(this.onNavigationEvent, this.IAuthTabCallback, this.onWarmupCompleted);
    }

    public boolean isEmpty() {
        long j = this.onWarmupCompleted;
        long j2 = this.onNavigationEvent;
        long j3 = this.IAuthTabCallback;
        return j > 0 ? j2 > j3 : j2 < j3;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof access4100)) {
            return false;
        }
        if (isEmpty() && ((access4100) obj).isEmpty()) {
            return true;
        }
        access4100 access4100Var = (access4100) obj;
        return this.onNavigationEvent == access4100Var.onNavigationEvent && this.IAuthTabCallback == access4100Var.IAuthTabCallback && this.onWarmupCompleted == access4100Var.onWarmupCompleted;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.onNavigationEvent;
        long j2 = this.IAuthTabCallback;
        long j3 = this.onWarmupCompleted;
        return (int) (((((j ^ (j >>> 32)) * 31) + (j2 ^ (j2 >>> 32))) * 31) + ((j3 >>> 32) ^ j3));
    }

    public String toString() {
        StringBuilder sb;
        long j;
        if (this.onWarmupCompleted > 0) {
            sb = new StringBuilder();
            sb.append(this.onNavigationEvent);
            sb.append("..");
            sb.append(this.IAuthTabCallback);
            sb.append(" step ");
            j = this.onWarmupCompleted;
        } else {
            sb = new StringBuilder();
            sb.append(this.onNavigationEvent);
            sb.append(" downTo ");
            sb.append(this.IAuthTabCallback);
            sb.append(" step ");
            j = -this.onWarmupCompleted;
        }
        sb.append(j);
        return sb.toString();
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final access4100 onNavigationEvent(long j, long j2, long j3) {
            return new access4100(j, j2, j3);
        }
    }
}
