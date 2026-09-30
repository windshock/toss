package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class p_ extends jc2 implements Comparable<p_> {
    private final long onWarmupCompleted;

    public p_() {
        this.onWarmupCompleted = 0L;
    }

    public p_(long j) {
        this.onWarmupCompleted = j;
    }

    @Override // o.jc2
    public t_ IAuthTabCallback() {
        return t_.TIMESTAMP;
    }

    public long onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public int onExtraCallbackWithResult() {
        return (int) (this.onWarmupCompleted >> 32);
    }

    public int onNavigationEvent() {
        return (int) this.onWarmupCompleted;
    }

    public String toString() {
        return "Timestamp{value=" + onWarmupCompleted() + ", seconds=" + onExtraCallbackWithResult() + ", inc=" + onNavigationEvent() + '}';
    }

    @Override // java.lang.Comparable
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public int compareTo(p_ p_Var) {
        return dv8.onNavigationEvent(this.onWarmupCompleted, p_Var.onWarmupCompleted);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && p_.class == obj.getClass() && this.onWarmupCompleted == ((p_) obj).onWarmupCompleted;
    }

    public int hashCode() {
        long j = this.onWarmupCompleted;
        return (int) (j ^ (j >>> 32));
    }
}
