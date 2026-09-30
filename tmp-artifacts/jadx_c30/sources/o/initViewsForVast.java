package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class initViewsForVast {
    private final int onExtraCallback;

    public initViewsForVast(int i) {
        this.onExtraCallback = i;
    }

    public initViewsForVast() {
        this(Integer.MAX_VALUE);
    }

    public int onNavigationEvent() {
        return this.onExtraCallback;
    }
}
