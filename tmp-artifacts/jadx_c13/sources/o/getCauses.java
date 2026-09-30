package o;

import kotlin.time.TimeMark;
import o.getBuildFingerprint;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getCauses implements getBuildFingerprint.onExtraCallback {
    public static final getCauses onNavigationEvent = new getCauses();
    private static final long IAuthTabCallback = System.nanoTime();

    private getCauses() {
    }

    @Override // o.getBuildFingerprint.onExtraCallback
    public /* bridge */ /* synthetic */ setMemoryMappings IAuthTabCallback() {
        return getBuildFingerprint.onWarmupCompleted.C0031onWarmupCompleted.IAuthTabCallback(onNavigationEvent());
    }

    @Override // o.getBuildFingerprint
    public /* synthetic */ TimeMark onExtraCallbackWithResult() {
        return getBuildFingerprint.onWarmupCompleted.C0031onWarmupCompleted.IAuthTabCallback(onNavigationEvent());
    }

    private final long onWarmupCompleted() {
        return System.nanoTime() - IAuthTabCallback;
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    public long onNavigationEvent() {
        return getBuildFingerprint.onWarmupCompleted.C0031onWarmupCompleted.onExtraCallbackWithResult(onWarmupCompleted());
    }

    public final long onExtraCallbackWithResult(long j) {
        return getArch.onExtraCallbackWithResult(onWarmupCompleted(), j, setRevision.NANOSECONDS);
    }

    public final long onNavigationEvent(long j, long j2) {
        return getArch.onNavigationEvent(j, j2, setRevision.NANOSECONDS);
    }

    public final long onWarmupCompleted(long j, long j2) {
        return getBuildFingerprint.onWarmupCompleted.C0031onWarmupCompleted.onExtraCallbackWithResult(getArch.onWarmupCompleted(j, setRevision.NANOSECONDS, j2));
    }
}
