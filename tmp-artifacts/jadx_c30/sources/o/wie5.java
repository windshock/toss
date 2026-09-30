package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class wie5 extends wiesya implements Comparable<wie5> {
    private final long onNavigationEvent;

    public wie5(long j) {
        this.onNavigationEvent = j;
    }

    @Override // java.lang.Comparable
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public int compareTo(wie5 wie5Var) {
        long j = this.onNavigationEvent;
        long j2 = wie5Var.onNavigationEvent;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    @Override // o.jc2
    public t_ IAuthTabCallback() {
        return t_.INT64;
    }

    public long onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && wie5.class == obj.getClass() && this.onNavigationEvent == ((wie5) obj).onNavigationEvent;
    }

    public int hashCode() {
        long j = this.onNavigationEvent;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "BsonInt64{value=" + this.onNavigationEvent + '}';
    }
}
