package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class CheckRequestBodyModelProcessorParams {
    public static final CheckRequestBodyModelLocalChannel onWarmupCompleted() {
        return new RequestFutureTarget(Thread.currentThread());
    }
}
