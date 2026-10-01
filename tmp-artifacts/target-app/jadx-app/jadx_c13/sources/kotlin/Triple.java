package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Triple<A, B, C> implements Serializable {
    private final A first;
    private final B second;
    private final C third;

    public final C IAuthTabCallback() {
        return this.third;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return Intrinsics.areEqual(this.first, triple.first) && Intrinsics.areEqual(this.second, triple.second) && Intrinsics.areEqual(this.third, triple.third);
    }

    public int hashCode() {
        A a = this.first;
        int iHashCode = a == null ? 0 : a.hashCode();
        B b = this.second;
        int iHashCode2 = b == null ? 0 : b.hashCode();
        C c = this.third;
        return (((iHashCode * 31) + iHashCode2) * 31) + (c != null ? c.hashCode() : 0);
    }

    public final B onExtraCallback() {
        return this.second;
    }

    public final A onExtraCallbackWithResult() {
        return this.first;
    }

    public Triple(A a, B b, C c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public final C getThird() {
        return this.third;
    }

    public String toString() {
        return '(' + this.first + ", " + this.second + ", " + this.third + ')';
    }
}
