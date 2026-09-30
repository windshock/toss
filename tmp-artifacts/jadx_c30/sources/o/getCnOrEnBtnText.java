package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class getCnOrEnBtnText extends jc2 implements Comparable<getCnOrEnBtnText> {
    private final long onWarmupCompleted;

    public getCnOrEnBtnText(long j) {
        this.onWarmupCompleted = j;
    }

    @Override // java.lang.Comparable
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public int compareTo(getCnOrEnBtnText getcnorenbtntext) {
        return Long.valueOf(this.onWarmupCompleted).compareTo(Long.valueOf(getcnorenbtntext.onWarmupCompleted));
    }

    @Override // o.jc2
    public t_ IAuthTabCallback() {
        return t_.DATE_TIME;
    }

    public long onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.onWarmupCompleted == ((getCnOrEnBtnText) obj).onWarmupCompleted;
    }

    public int hashCode() {
        long j = this.onWarmupCompleted;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "BsonDateTime{value=" + this.onWarmupCompleted + '}';
    }
}
