package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Pair<A, B> implements Serializable {
    private final A first;
    private final B second;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pair onExtraCallbackWithResult(Pair pair, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = pair.first;
        }
        if ((i & 2) != 0) {
            obj2 = pair.second;
        }
        return pair.onWarmupCompleted(obj, obj2);
    }

    public final B IAuthTabCallback() {
        return this.second;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Intrinsics.areEqual(this.first, pair.first) && Intrinsics.areEqual(this.second, pair.second);
    }

    public int hashCode() {
        A a = this.first;
        int iHashCode = a == null ? 0 : a.hashCode();
        B b = this.second;
        return (iHashCode * 31) + (b != null ? b.hashCode() : 0);
    }

    public final A onExtraCallbackWithResult() {
        return this.first;
    }

    public final Pair<A, B> onWarmupCompleted(A a, B b) {
        return new Pair<>(a, b);
    }

    public Pair(A a, B b) {
        this.first = a;
        this.second = b;
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public String toString() {
        return '(' + this.first + ", " + this.second + ')';
    }
}
