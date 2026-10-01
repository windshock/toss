package kotlin.collections;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class IndexedValue<T> {
    private final T onExtraCallback;
    private final int onNavigationEvent;

    public final T IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.onNavigationEvent == indexedValue.onNavigationEvent && Intrinsics.areEqual(this.onExtraCallback, indexedValue.onExtraCallback);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.onNavigationEvent);
        T t = this.onExtraCallback;
        return (iHashCode * 31) + (t == null ? 0 : t.hashCode());
    }

    public final int onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public String toString() {
        return "IndexedValue(index=" + this.onNavigationEvent + ", value=" + this.onExtraCallback + ')';
    }

    public IndexedValue(int i, T t) {
        this.onNavigationEvent = i;
        this.onExtraCallback = t;
    }

    public final T onExtraCallback() {
        return this.onExtraCallback;
    }

    public final int onNavigationEvent() {
        return this.onNavigationEvent;
    }
}
