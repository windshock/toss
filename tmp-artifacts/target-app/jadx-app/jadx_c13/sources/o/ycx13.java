package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ycx13 implements ycx18 {
    public static String onExtraCallbackWithResult = "2.0.99";
    private final ea61 onWarmupCompleted = new syc31();
    private final ea6 IAuthTabCallback = new ycx12();
    private final getNativeVideoController onExtraCallback = new jw32();

    @Override // o.ycx18
    public ea61 IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    @Override // o.ycx18
    public String onNavigationEvent() {
        return onExtraCallbackWithResult;
    }
}
