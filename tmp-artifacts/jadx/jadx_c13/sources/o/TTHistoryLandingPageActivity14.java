package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class TTHistoryLandingPageActivity14 {
    private final long IAuthTabCallback;
    private final int onExtraCallbackWithResult;
    private final long onWarmupCompleted;

    public TTHistoryLandingPageActivity14(long j, long j2, int i) {
        this.onWarmupCompleted = j;
        this.IAuthTabCallback = j2;
        this.onExtraCallbackWithResult = i;
    }

    public final long onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public final long onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public final int onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }
}
