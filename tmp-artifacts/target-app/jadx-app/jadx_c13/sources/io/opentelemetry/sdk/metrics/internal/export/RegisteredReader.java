package io.opentelemetry.sdk.metrics.internal.export;

import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import o.getCachedPower;
import o.pausedSession;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RegisteredReader {
    private static final AtomicInteger onWarmupCompleted = new AtomicInteger(1);
    private final getCachedPower IAuthTabCallback;
    private final int onExtraCallback = onWarmupCompleted.incrementAndGet();
    private final pausedSession onExtraCallbackWithResult;
    private volatile long onNavigationEvent;

    public static RegisteredReader onWarmupCompleted(pausedSession pausedsession, getCachedPower getcachedpower) {
        return new RegisteredReader(pausedsession, getcachedpower);
    }

    private RegisteredReader(pausedSession pausedsession, getCachedPower getcachedpower) {
        this.onExtraCallbackWithResult = pausedsession;
        this.IAuthTabCallback = getcachedpower;
    }

    public pausedSession IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public void onExtraCallback(long j) {
        this.onNavigationEvent = j;
    }

    public long onExtraCallback() {
        return this.onNavigationEvent;
    }

    public getCachedPower onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public int hashCode() {
        return this.onExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RegisteredReader) && this.onExtraCallback == ((RegisteredReader) obj).onExtraCallback;
    }

    public String toString() {
        return "RegisteredReader{" + this.onExtraCallback + "}";
    }
}
