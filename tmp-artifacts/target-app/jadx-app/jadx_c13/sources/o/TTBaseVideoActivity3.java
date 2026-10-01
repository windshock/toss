package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class TTBaseVideoActivity3 implements Closeable {
    private final boolean IAuthTabCallback;
    private boolean onExtraCallback;
    private int onNavigationEvent;
    private final ReentrantLock onWarmupCompleted = TTHistoryActivity6.onWarmupCompleted();

    protected abstract long IAuthTabCallback() throws IOException;

    protected abstract int onExtraCallback(long j, @NotNull byte[] bArr, int i, int i2) throws IOException;

    protected abstract void onExtraCallback() throws IOException;

    public TTBaseVideoActivity3(boolean z) {
        this.IAuthTabCallback = z;
    }

    public final ReentrantLock onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public final long onWarmupCompleted() throws IOException {
        ReentrantLock reentrantLock = this.onWarmupCompleted;
        reentrantLock.lock();
        try {
            if (this.onExtraCallback) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            return IAuthTabCallback();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final TTHistoryActivity42 onExtraCallback(long j) throws IOException {
        ReentrantLock reentrantLock = this.onWarmupCompleted;
        reentrantLock.lock();
        try {
            if (this.onExtraCallback) {
                throw new IllegalStateException("closed");
            }
            this.onNavigationEvent++;
            reentrantLock.unlock();
            return new onWarmupCompleted(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.onWarmupCompleted;
        reentrantLock.lock();
        try {
            if (this.onExtraCallback) {
                return;
            }
            this.onExtraCallback = true;
            if (this.onNavigationEvent != 0) {
                return;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            onExtraCallback();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long onExtraCallbackWithResult(long j, TTBaseActivity tTBaseActivity, long j2) throws IOException {
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j3 = j2 + j;
        long j4 = j;
        while (true) {
            if (j4 >= j3) {
                break;
            }
            TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent = tTBaseActivity.onNavigationEvent(1);
            long j5 = j4;
            int iOnExtraCallback = onExtraCallback(j5, tTHistoryActivity2OnNavigationEvent.data, tTHistoryActivity2OnNavigationEvent.limit, (int) Math.min(j3 - j4, 8192 - r7));
            if (iOnExtraCallback == -1) {
                if (tTHistoryActivity2OnNavigationEvent.pos == tTHistoryActivity2OnNavigationEvent.limit) {
                    tTBaseActivity.head = tTHistoryActivity2OnNavigationEvent.onExtraCallback();
                    TTHistoryActivity.onExtraCallback(tTHistoryActivity2OnNavigationEvent);
                }
                if (j == j4) {
                    return -1L;
                }
            } else {
                tTHistoryActivity2OnNavigationEvent.limit += iOnExtraCallback;
                long j6 = iOnExtraCallback;
                j4 += j6;
                tTBaseActivity.asInterface(tTBaseActivity.ICustomTabsCallbackDefault() + j6);
            }
        }
        return j4 - j;
    }

    static final class onWarmupCompleted implements TTHistoryActivity42 {
        private final TTBaseVideoActivity3 IAuthTabCallback;
        private long onExtraCallback;
        private boolean onNavigationEvent;

        public onWarmupCompleted(@NotNull TTBaseVideoActivity3 tTBaseVideoActivity3, long j) {
            Intrinsics.checkNotNullParameter(tTBaseVideoActivity3, "");
            this.IAuthTabCallback = tTBaseVideoActivity3;
            this.onExtraCallback = j;
        }

        @Override // o.TTHistoryActivity42
        public long read(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
            if (!this.onNavigationEvent) {
                long jOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(this.onExtraCallback, tTBaseActivity, j);
                if (jOnExtraCallbackWithResult != -1) {
                    this.onExtraCallback += jOnExtraCallbackWithResult;
                }
                return jOnExtraCallbackWithResult;
            }
            throw new IllegalStateException("closed");
        }

        @Override // o.TTHistoryActivity42, o.TTHistoryActivity41
        public Timeout timeout() {
            return Timeout.onNavigationEvent;
        }

        @Override // o.TTHistoryActivity42, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.TTHistoryActivity41
        public void close() throws IOException {
            if (this.onNavigationEvent) {
                return;
            }
            this.onNavigationEvent = true;
            ReentrantLock reentrantLockOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult();
            reentrantLockOnExtraCallbackWithResult.lock();
            try {
                this.IAuthTabCallback.onNavigationEvent--;
                if (this.IAuthTabCallback.onNavigationEvent == 0 && this.IAuthTabCallback.onExtraCallback) {
                    Unit unit = Unit.INSTANCE;
                    reentrantLockOnExtraCallbackWithResult.unlock();
                    this.IAuthTabCallback.onExtraCallback();
                }
            } finally {
                reentrantLockOnExtraCallbackWithResult.unlock();
            }
        }
    }
}
