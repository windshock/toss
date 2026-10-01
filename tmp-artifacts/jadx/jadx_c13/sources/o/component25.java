package o;

import io.opentelemetry.sdk.internal.RateLimiter;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class component25 {
    private static final TimeUnit onExtraCallbackWithResult = TimeUnit.MINUTES;
    private final AtomicBoolean IAuthTabCallback;
    private final RateLimiter onExtraCallback;
    private final RateLimiter onNavigationEvent;
    private final Logger onWarmupCompleted;

    public component25(Logger logger) {
        this(logger, extractTombstoneLogBuffers.onExtraCallbackWithResult());
    }

    component25(Logger logger, extractTombstoneLogBuffers extracttombstonelogbuffers) {
        this.IAuthTabCallback = new AtomicBoolean(false);
        this.onWarmupCompleted = logger;
        TimeUnit timeUnit = onExtraCallbackWithResult;
        this.onExtraCallback = new RateLimiter(5.0d / timeUnit.toSeconds(1L), 5.0d, extracttombstonelogbuffers);
        this.onNavigationEvent = new RateLimiter(1.0d / timeUnit.toSeconds(1L), 1.0d, extracttombstonelogbuffers);
    }

    public void onExtraCallback(Level level, String str) {
        onWarmupCompleted(level, str, null);
    }

    public void onWarmupCompleted(Level level, String str, @Nullable Throwable th) {
        if (onWarmupCompleted(level)) {
            if (this.IAuthTabCallback.get()) {
                if (this.onNavigationEvent.onNavigationEvent(1.0d)) {
                    onExtraCallbackWithResult(level, str, th);
                }
            } else if (this.onExtraCallback.onNavigationEvent(1.0d)) {
                onExtraCallbackWithResult(level, str, th);
            } else if (this.IAuthTabCallback.compareAndSet(false, true)) {
                this.onNavigationEvent.onNavigationEvent(1.0d);
                this.onWarmupCompleted.log(level, "Too many log messages detected. Will only log once per minute from now on.");
                onExtraCallbackWithResult(level, str, th);
            }
        }
    }

    private void onExtraCallbackWithResult(Level level, String str, @Nullable Throwable th) {
        if (th != null) {
            this.onWarmupCompleted.log(level, str, th);
        } else {
            this.onWarmupCompleted.log(level, str);
        }
    }

    public boolean onWarmupCompleted(Level level) {
        return this.onWarmupCompleted.isLoggable(level);
    }
}
