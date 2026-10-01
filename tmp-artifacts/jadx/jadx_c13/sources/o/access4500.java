package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.LongCompanionObject;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access4500 extends access4100 implements getUnreadableElfFilesCount<Long>, access4700<Long> {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final access4500 IAuthTabCallback = new access4500(1, 0);

    public access4500(long j, long j2) {
        super(j, j2, 1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getUnreadableElfFilesCount, o.access4700
    public /* synthetic */ boolean contains(Comparable comparable) {
        return onExtraCallback(((Number) comparable).longValue());
    }

    @Override // o.getUnreadableElfFilesCount, o.access4700
    /* renamed from: asBinder, reason: merged with bridge method [inline-methods] */
    public Long getStart() {
        return Long.valueOf(onNavigationEvent());
    }

    @Override // o.getUnreadableElfFilesCount
    /* renamed from: onTransact, reason: merged with bridge method [inline-methods] */
    public Long getEndInclusive() {
        return Long.valueOf(IAuthTabCallback());
    }

    @Override // o.access4700
    /* renamed from: asInterface, reason: merged with bridge method [inline-methods] */
    public Long getEndExclusive() {
        if (IAuthTabCallback() == LongCompanionObject.MAX_VALUE) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
        }
        return Long.valueOf(IAuthTabCallback() + 1);
    }

    public boolean onExtraCallback(long j) {
        return onNavigationEvent() <= j && j <= IAuthTabCallback();
    }

    @Override // o.access4100, o.getUnreadableElfFilesCount
    public boolean isEmpty() {
        return onNavigationEvent() > IAuthTabCallback();
    }

    @Override // o.access4100
    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof access4500)) {
            return false;
        }
        if (isEmpty() && ((access4500) obj).isEmpty()) {
            return true;
        }
        access4500 access4500Var = (access4500) obj;
        return onNavigationEvent() == access4500Var.onNavigationEvent() && IAuthTabCallback() == access4500Var.IAuthTabCallback();
    }

    @Override // o.access4100
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) (((onNavigationEvent() ^ (onNavigationEvent() >>> 32)) * 31) + (IAuthTabCallback() ^ (IAuthTabCallback() >>> 32)));
    }

    @Override // o.access4100
    public String toString() {
        return onNavigationEvent() + ".." + IAuthTabCallback();
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final access4500 onNavigationEvent() {
            return access4500.IAuthTabCallback;
        }
    }
}
