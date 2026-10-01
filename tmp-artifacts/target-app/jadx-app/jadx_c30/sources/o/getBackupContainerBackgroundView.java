package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class getBackupContainerBackgroundView extends wiesya implements Comparable<getBackupContainerBackgroundView> {
    private final double IAuthTabCallback;

    public getBackupContainerBackgroundView(double d) {
        this.IAuthTabCallback = d;
    }

    @Override // java.lang.Comparable
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public int compareTo(getBackupContainerBackgroundView getbackupcontainerbackgroundview) {
        return Double.compare(this.IAuthTabCallback, getbackupcontainerbackgroundview.IAuthTabCallback);
    }

    @Override // o.jc2
    public t_ IAuthTabCallback() {
        return t_.DOUBLE;
    }

    public double onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Double.compare(((getBackupContainerBackgroundView) obj).IAuthTabCallback, this.IAuthTabCallback) == 0;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.IAuthTabCallback);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public String toString() {
        return "BsonDouble{value=" + this.IAuthTabCallback + '}';
    }
}
