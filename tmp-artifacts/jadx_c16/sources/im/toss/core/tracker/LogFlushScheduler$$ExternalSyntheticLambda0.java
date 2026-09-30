package im.toss.core.tracker;

import o.ComputeLandmarkConfidence;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LogFlushScheduler$$ExternalSyntheticLambda0 implements Runnable {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ ComputeLandmarkConfidence f$0;
    public final /* synthetic */ LogFlushScheduler f$1;

    public /* synthetic */ LogFlushScheduler$$ExternalSyntheticLambda0(ComputeLandmarkConfidence computeLandmarkConfidence, LogFlushScheduler logFlushScheduler) {
        this.f$0 = computeLandmarkConfidence;
        this.f$1 = logFlushScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        LogFlushScheduler.onExtraCallbackWithResult(this.f$0, this.f$1);
        int i4 = onWarmupCompleted + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
