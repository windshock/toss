package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ycx14 implements ycx18 {
    private final ycx15 onWarmupCompleted = new ycx15();
    private final ea6 IAuthTabCallback = new ycx12();
    private final getNativeVideoController onExtraCallbackWithResult = new jczb();

    @Override // o.ycx18
    public ea61 IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public ycx15 onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    @Override // o.ycx18
    public String onNavigationEvent() {
        throw new UnsupportedOperationException();
    }
}
