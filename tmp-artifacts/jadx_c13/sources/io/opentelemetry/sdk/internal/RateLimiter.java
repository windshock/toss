package io.opentelemetry.sdk.internal;

import java.util.concurrent.atomic.AtomicLong;
import o.extractTombstoneLogBuffers;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RateLimiter {
    private final long IAuthTabCallback;
    private final double onExtraCallback;
    private final AtomicLong onNavigationEvent;
    private final extractTombstoneLogBuffers onWarmupCompleted;

    public RateLimiter(double d, double d2, extractTombstoneLogBuffers extracttombstonelogbuffers) {
        this.onWarmupCompleted = extracttombstonelogbuffers;
        double d3 = d / 1.0E9d;
        this.onExtraCallback = d3;
        long j = (long) (d2 / d3);
        this.IAuthTabCallback = j;
        this.onNavigationEvent = new AtomicLong(extracttombstonelogbuffers.IAuthTabCallback() - j);
    }

    public boolean onNavigationEvent(double d) {
        long j;
        long jIAuthTabCallback;
        long j2;
        long j3 = (long) (d / this.onExtraCallback);
        do {
            j = this.onNavigationEvent.get();
            jIAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback();
            long j4 = jIAuthTabCallback - j;
            long j5 = this.IAuthTabCallback;
            if (j4 > j5) {
                j4 = j5;
            }
            j2 = j4 - j3;
            if (j2 < 0) {
                return false;
            }
        } while (!this.onNavigationEvent.compareAndSet(j, jIAuthTabCallback - j2));
        return true;
    }
}
