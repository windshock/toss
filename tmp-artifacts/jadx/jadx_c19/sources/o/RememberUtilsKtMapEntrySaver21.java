package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RememberUtilsKtMapEntrySaver21<T> {
    private final Exception onNavigationEvent;
    private final T onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public RememberUtilsKtMapEntrySaver21() {
        Exception exc = null;
        this(exc, exc, 3, exc);
    }

    public RememberUtilsKtMapEntrySaver21(@Nullable T t, @Nullable Exception exc) {
        this.onWarmupCompleted = t;
        this.onNavigationEvent = exc;
    }

    public /* synthetic */ RememberUtilsKtMapEntrySaver21(Object obj, Exception exc, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : obj, (i2 & 2) != 0 ? null : exc);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RememberUtilsKtMapEntrySaver21)) {
            return false;
        }
        RememberUtilsKtMapEntrySaver21 rememberUtilsKtMapEntrySaver21 = (RememberUtilsKtMapEntrySaver21) obj;
        return Intrinsics.areEqual(this.onWarmupCompleted, rememberUtilsKtMapEntrySaver21.onWarmupCompleted) && Intrinsics.areEqual(this.onNavigationEvent, rememberUtilsKtMapEntrySaver21.onNavigationEvent);
    }

    public int hashCode() {
        T t = this.onWarmupCompleted;
        int iHashCode = t == null ? 0 : t.hashCode();
        Exception exc = this.onNavigationEvent;
        return (iHashCode * 31) + (exc != null ? exc.hashCode() : 0);
    }

    public final T onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public final T onNavigationEvent() throws Exception {
        Exception exc = this.onNavigationEvent;
        if (exc != null) {
            throw exc;
        }
        T t = this.onWarmupCompleted;
        if (t != null) {
            return t;
        }
        throw new UnknownError();
    }

    public final Exception onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public String toString() {
        return "ServiceProcessResult(result=" + this.onWarmupCompleted + ", error=" + this.onNavigationEvent + ')';
    }
}
