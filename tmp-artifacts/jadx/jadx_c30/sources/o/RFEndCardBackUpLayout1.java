package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RFEndCardBackUpLayout1 extends jc2 implements Comparable<RFEndCardBackUpLayout1> {
    public static final RFEndCardBackUpLayout1 IAuthTabCallback = new RFEndCardBackUpLayout1(true);
    public static final RFEndCardBackUpLayout1 onWarmupCompleted = new RFEndCardBackUpLayout1(false);
    private final boolean onExtraCallbackWithResult;

    public static RFEndCardBackUpLayout1 IAuthTabCallback(boolean z) {
        return z ? IAuthTabCallback : onWarmupCompleted;
    }

    public RFEndCardBackUpLayout1(boolean z) {
        this.onExtraCallbackWithResult = z;
    }

    @Override // java.lang.Comparable
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public int compareTo(RFEndCardBackUpLayout1 rFEndCardBackUpLayout1) {
        return Boolean.valueOf(this.onExtraCallbackWithResult).compareTo(Boolean.valueOf(rFEndCardBackUpLayout1.onExtraCallbackWithResult));
    }

    @Override // o.jc2
    public t_ IAuthTabCallback() {
        return t_.BOOLEAN;
    }

    public boolean onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && RFEndCardBackUpLayout1.class == obj.getClass() && this.onExtraCallbackWithResult == ((RFEndCardBackUpLayout1) obj).onExtraCallbackWithResult;
    }

    public int hashCode() {
        return this.onExtraCallbackWithResult ? 1 : 0;
    }

    public String toString() {
        return "BsonBoolean{value=" + this.onExtraCallbackWithResult + '}';
    }
}
