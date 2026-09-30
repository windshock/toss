package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getCausesCount<T> {
    private final long IAuthTabCallback;
    private final T onExtraCallback;

    public /* synthetic */ getCausesCount(Object obj, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j);
    }

    public final T IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCausesCount)) {
            return false;
        }
        getCausesCount getcausescount = (getCausesCount) obj;
        return Intrinsics.areEqual(this.onExtraCallback, getcausescount.onExtraCallback) && setLogBuffers.IAuthTabCallback(this.IAuthTabCallback, getcausescount.IAuthTabCallback);
    }

    public int hashCode() {
        T t = this.onExtraCallback;
        return ((t == null ? 0 : t.hashCode()) * 31) + setLogBuffers.extraCallback(this.IAuthTabCallback);
    }

    public final long onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public String toString() {
        return "TimedValue(value=" + this.onExtraCallback + ", duration=" + ((Object) setLogBuffers.onPostMessage(this.IAuthTabCallback)) + ')';
    }

    private getCausesCount(T t, long j) {
        this.onExtraCallback = t;
        this.IAuthTabCallback = j;
    }

    public final T onExtraCallback() {
        return this.onExtraCallback;
    }

    public final long onWarmupCompleted() {
        return this.IAuthTabCallback;
    }
}
