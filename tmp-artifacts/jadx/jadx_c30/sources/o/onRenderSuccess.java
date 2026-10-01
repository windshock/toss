package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class onRenderSuccess extends PAGLoadCallback implements Comparable {
    private final String onWarmupCompleted;

    public onRenderSuccess(String str) {
        this.onWarmupCompleted = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.onWarmupCompleted.compareTo(((onRenderSuccess) obj).onWarmupCompleted);
    }

    public String IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public String toString() {
        return this.onWarmupCompleted;
    }
}
