package o;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldDecoratorModifierNodeExternalSyntheticLambda24 {
    private final ThreadLocal<Long> IAuthTabCallback = new ThreadLocal<>();
    private long onExtraCallback;
    private long onNavigationEvent;
    private long onWarmupCompleted;

    public TextFieldDecoratorModifierNodeExternalSyntheticLambda24(long j) {
        IAuthTabCallbackDefault(j);
    }

    public void onExtraCallbackWithResult(boolean z, long j, long j2) throws InterruptedException, TimeoutException {
        synchronized (this) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent == 9223372036854775806L);
            if (onExtraCallback()) {
                return;
            }
            if (z) {
                this.IAuthTabCallback.set(Long.valueOf(j));
            } else {
                long jElapsedRealtime = 0;
                long j3 = j2;
                while (!onExtraCallback()) {
                    if (j2 == 0) {
                        wait();
                    } else {
                        RecordingInputConnection_androidKt.onExtraCallbackWithResult(j3 > 0);
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        wait(j3);
                        jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j2 && !onExtraCallback()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j2 + " milliseconds");
                        }
                        j3 = j2 - jElapsedRealtime;
                    }
                }
            }
        }
    }

    public long IAuthTabCallback() {
        long j;
        synchronized (this) {
            j = this.onNavigationEvent;
            if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
                j = -9223372036854775807L;
            }
        }
        return j;
    }

    public long onWarmupCompleted() {
        long jIAuthTabCallback;
        synchronized (this) {
            long j = this.onExtraCallback;
            if (j != -9223372036854775807L) {
                jIAuthTabCallback = j + this.onWarmupCompleted;
            } else {
                jIAuthTabCallback = IAuthTabCallback();
            }
        }
        return jIAuthTabCallback;
    }

    public long onExtraCallbackWithResult() {
        long j;
        synchronized (this) {
            j = this.onWarmupCompleted;
        }
        return j;
    }

    public void IAuthTabCallbackDefault(long j) {
        synchronized (this) {
            this.onNavigationEvent = j;
            this.onWarmupCompleted = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
            this.onExtraCallback = -9223372036854775807L;
        }
    }

    public long IAuthTabCallback(long j) {
        synchronized (this) {
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            long j2 = this.onExtraCallback;
            if (j2 != -9223372036854775807L) {
                long jOnExtraCallbackWithResult = onExtraCallbackWithResult(j2);
                long j3 = (4294967296L + jOnExtraCallbackWithResult) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                j += j3 * 8589934592L;
                if (Math.abs(j4 - jOnExtraCallbackWithResult) < Math.abs(j - jOnExtraCallbackWithResult)) {
                    j = j4;
                }
            }
            return onExtraCallback(onNavigationEvent(j));
        }
    }

    public long asInterface(long j) {
        synchronized (this) {
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            long j2 = this.onExtraCallback;
            if (j2 != -9223372036854775807L) {
                long jOnExtraCallbackWithResult = onExtraCallbackWithResult(j2);
                long j3 = jOnExtraCallbackWithResult / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j += (j3 + 1) * 8589934592L;
                if (j4 >= jOnExtraCallbackWithResult) {
                    j = j4;
                }
            }
            return onExtraCallback(onNavigationEvent(j));
        }
    }

    public long onExtraCallback(long j) {
        synchronized (this) {
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            if (!onExtraCallback()) {
                long jLongValue = this.onNavigationEvent;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback.get())).longValue();
                }
                this.onWarmupCompleted = jLongValue - j;
                notifyAll();
            }
            this.onExtraCallback = j;
            return j + this.onWarmupCompleted;
        }
    }

    public boolean onExtraCallback() {
        boolean z;
        synchronized (this) {
            z = this.onWarmupCompleted != -9223372036854775807L;
        }
        return z;
    }

    public static long onNavigationEvent(long j) {
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(j, 1000000L, 90000L);
    }

    public static long onWarmupCompleted(long j) {
        return onExtraCallbackWithResult(j) % 8589934592L;
    }

    public static long onExtraCallbackWithResult(long j) {
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(j, 90000L, 1000000L);
    }
}
