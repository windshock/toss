package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class onRenderFail extends PAGLoadCallback implements Comparable {
    private final PAGErrorCode onExtraCallback;
    private final onRenderSuccess onNavigationEvent;

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof onRenderFail)) {
            return 0;
        }
        onRenderFail onrenderfail = (onRenderFail) obj;
        int iCompareTo = this.onExtraCallback.compareTo(onrenderfail.onExtraCallback);
        return iCompareTo == 0 ? this.onNavigationEvent.compareTo(onrenderfail.onNavigationEvent) : iCompareTo;
    }

    public String IAuthTabCallback() {
        return this.onNavigationEvent.IAuthTabCallback();
    }

    public String toString() {
        return this.onNavigationEvent + ":" + this.onExtraCallback;
    }
}
