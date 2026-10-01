package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryLandingPageActivity10 implements TTHistoryActivity5 {
    private final Socket IAuthTabCallback;
    private final TTHistoryActivity41 onExtraCallback;
    private final TTHistoryActivity42 onExtraCallbackWithResult;
    private AtomicInteger onWarmupCompleted;

    public TTHistoryLandingPageActivity10(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "");
        this.IAuthTabCallback = socket;
        this.onWarmupCompleted = new AtomicInteger();
        this.onExtraCallbackWithResult = new IAuthTabCallback();
        this.onExtraCallback = new onNavigationEvent();
    }

    public final Socket onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    @Override // o.TTHistoryActivity5
    public TTHistoryActivity42 getSource() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.TTHistoryActivity5
    public TTHistoryActivity41 getSink() {
        return this.onExtraCallback;
    }

    @Override // o.TTHistoryActivity5
    public void cancel() throws IOException {
        this.IAuthTabCallback.close();
    }

    public String toString() {
        String string = this.IAuthTabCallback.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final class onNavigationEvent implements TTHistoryActivity41 {
        private final TTHistoryLandingPageActivity12 onExtraCallback;
        private final OutputStream onNavigationEvent;

        public onNavigationEvent() {
            this.onNavigationEvent = TTHistoryLandingPageActivity10.this.onExtraCallbackWithResult().getOutputStream();
            this.onExtraCallback = new TTHistoryLandingPageActivity12(TTHistoryLandingPageActivity10.this.onExtraCallbackWithResult());
        }

        @Override // o.TTHistoryActivity41
        public void write(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
            TTAppOpenAdActivity6.onExtraCallbackWithResult(tTBaseActivity.ICustomTabsCallbackDefault(), 0L, j);
            while (j > 0) {
                this.onExtraCallback.throwIfReached();
                TTHistoryActivity2 tTHistoryActivity2 = tTBaseActivity.head;
                Intrinsics.checkNotNull(tTHistoryActivity2);
                int iMin = (int) Math.min(j, tTHistoryActivity2.limit - tTHistoryActivity2.pos);
                TTHistoryLandingPageActivity12 tTHistoryLandingPageActivity12 = this.onExtraCallback;
                tTHistoryLandingPageActivity12.enter();
                try {
                    this.onNavigationEvent.write(tTHistoryActivity2.data, tTHistoryActivity2.pos, iMin);
                    Unit unit = Unit.INSTANCE;
                    if (!tTHistoryLandingPageActivity12.exit()) {
                        tTHistoryActivity2.pos += iMin;
                        long j2 = iMin;
                        j -= j2;
                        tTBaseActivity.asInterface(tTBaseActivity.ICustomTabsCallbackDefault() - j2);
                        if (tTHistoryActivity2.pos == tTHistoryActivity2.limit) {
                            tTBaseActivity.head = tTHistoryActivity2.onExtraCallback();
                            TTHistoryActivity.onExtraCallback(tTHistoryActivity2);
                        }
                    } else {
                        throw tTHistoryLandingPageActivity12.access$newTimeoutException(null);
                    }
                } catch (IOException e) {
                    if (!tTHistoryLandingPageActivity12.exit()) {
                        throw e;
                    }
                    throw tTHistoryLandingPageActivity12.access$newTimeoutException(e);
                } finally {
                    tTHistoryLandingPageActivity12.exit();
                }
            }
        }

        @Override // o.TTHistoryActivity41, java.io.Flushable
        public void flush() throws IOException {
            TTHistoryLandingPageActivity12 tTHistoryLandingPageActivity12 = this.onExtraCallback;
            tTHistoryLandingPageActivity12.enter();
            try {
                this.onNavigationEvent.flush();
                Unit unit = Unit.INSTANCE;
                if (tTHistoryLandingPageActivity12.exit()) {
                    throw tTHistoryLandingPageActivity12.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!tTHistoryLandingPageActivity12.exit()) {
                    throw e;
                }
                throw tTHistoryLandingPageActivity12.access$newTimeoutException(e);
            } finally {
                tTHistoryLandingPageActivity12.exit();
            }
        }

        @Override // o.TTHistoryActivity41, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
            TTHistoryLandingPageActivity12 tTHistoryLandingPageActivity12 = this.onExtraCallback;
            TTHistoryLandingPageActivity10 tTHistoryLandingPageActivity10 = TTHistoryLandingPageActivity10.this;
            tTHistoryLandingPageActivity12.enter();
            try {
                int iIAuthTabCallback = TTHistoryLandingPageActivity6.IAuthTabCallback(tTHistoryLandingPageActivity10.onWarmupCompleted, 1);
                if (iIAuthTabCallback != 0) {
                    if (iIAuthTabCallback != 3) {
                        if (!tTHistoryLandingPageActivity10.onExtraCallbackWithResult().isClosed() && !tTHistoryLandingPageActivity10.onExtraCallbackWithResult().isOutputShutdown()) {
                            this.onNavigationEvent.flush();
                            try {
                                tTHistoryLandingPageActivity10.onExtraCallbackWithResult().shutdownOutput();
                            } catch (UnsupportedOperationException unused) {
                                this.onNavigationEvent.close();
                            }
                        }
                        return;
                    }
                    tTHistoryLandingPageActivity10.onExtraCallbackWithResult().close();
                    Unit unit = Unit.INSTANCE;
                    if (tTHistoryLandingPageActivity12.exit()) {
                        throw tTHistoryLandingPageActivity12.access$newTimeoutException(null);
                    }
                }
            } catch (IOException e) {
                if (!tTHistoryLandingPageActivity12.exit()) {
                    throw e;
                }
                throw tTHistoryLandingPageActivity12.access$newTimeoutException(e);
            } finally {
                tTHistoryLandingPageActivity12.exit();
            }
        }

        @Override // o.TTHistoryActivity41
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public TTHistoryLandingPageActivity12 timeout() {
            return this.onExtraCallback;
        }

        public String toString() {
            return "sink(" + TTHistoryLandingPageActivity10.this.onExtraCallbackWithResult() + ')';
        }
    }

    public final class IAuthTabCallback implements TTHistoryActivity42 {
        private final TTHistoryLandingPageActivity12 onNavigationEvent;
        private final InputStream onWarmupCompleted;

        public IAuthTabCallback() {
            this.onWarmupCompleted = TTHistoryLandingPageActivity10.this.onExtraCallbackWithResult().getInputStream();
            this.onNavigationEvent = new TTHistoryLandingPageActivity12(TTHistoryLandingPageActivity10.this.onExtraCallbackWithResult());
        }

        @Override // o.TTHistoryActivity42
        public long read(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
            if (j == 0) {
                return 0L;
            }
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            this.onNavigationEvent.throwIfReached();
            TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent = tTBaseActivity.onNavigationEvent(1);
            int iMin = (int) Math.min(j, 8192 - tTHistoryActivity2OnNavigationEvent.limit);
            try {
                TTHistoryLandingPageActivity12 tTHistoryLandingPageActivity12 = this.onNavigationEvent;
                tTHistoryLandingPageActivity12.enter();
                try {
                    int i = this.onWarmupCompleted.read(tTHistoryActivity2OnNavigationEvent.data, tTHistoryActivity2OnNavigationEvent.limit, iMin);
                    if (tTHistoryLandingPageActivity12.exit()) {
                        throw tTHistoryLandingPageActivity12.access$newTimeoutException(null);
                    }
                    if (i == -1) {
                        if (tTHistoryActivity2OnNavigationEvent.pos != tTHistoryActivity2OnNavigationEvent.limit) {
                            return -1L;
                        }
                        tTBaseActivity.head = tTHistoryActivity2OnNavigationEvent.onExtraCallback();
                        TTHistoryActivity.onExtraCallback(tTHistoryActivity2OnNavigationEvent);
                        return -1L;
                    }
                    tTHistoryActivity2OnNavigationEvent.limit += i;
                    long j2 = i;
                    tTBaseActivity.asInterface(tTBaseActivity.ICustomTabsCallbackDefault() + j2);
                    return j2;
                } catch (IOException e) {
                    if (tTHistoryLandingPageActivity12.exit()) {
                        throw tTHistoryLandingPageActivity12.access$newTimeoutException(e);
                    }
                    throw e;
                } finally {
                    tTHistoryLandingPageActivity12.exit();
                }
            } catch (AssertionError e2) {
                if (TTHistoryLandingPageActivity5.onNavigationEvent(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            }
        }

        @Override // o.TTHistoryActivity42, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.TTHistoryActivity41
        public void close() throws IOException {
            TTHistoryLandingPageActivity12 tTHistoryLandingPageActivity12 = this.onNavigationEvent;
            TTHistoryLandingPageActivity10 tTHistoryLandingPageActivity10 = TTHistoryLandingPageActivity10.this;
            tTHistoryLandingPageActivity12.enter();
            try {
                int iIAuthTabCallback = TTHistoryLandingPageActivity6.IAuthTabCallback(tTHistoryLandingPageActivity10.onWarmupCompleted, 2);
                if (iIAuthTabCallback != 0) {
                    if (iIAuthTabCallback == 3) {
                        tTHistoryLandingPageActivity10.onExtraCallbackWithResult().close();
                    } else {
                        if (tTHistoryLandingPageActivity10.onExtraCallbackWithResult().isClosed() || tTHistoryLandingPageActivity10.onExtraCallbackWithResult().isInputShutdown()) {
                            return;
                        }
                        try {
                            tTHistoryLandingPageActivity10.onExtraCallbackWithResult().shutdownInput();
                        } catch (UnsupportedOperationException unused) {
                            this.onWarmupCompleted.close();
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    if (tTHistoryLandingPageActivity12.exit()) {
                        throw tTHistoryLandingPageActivity12.access$newTimeoutException(null);
                    }
                }
            } catch (IOException e) {
                if (!tTHistoryLandingPageActivity12.exit()) {
                    throw e;
                }
                throw tTHistoryLandingPageActivity12.access$newTimeoutException(e);
            } finally {
                tTHistoryLandingPageActivity12.exit();
            }
        }

        @Override // o.TTHistoryActivity42, o.TTHistoryActivity41
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public TTHistoryLandingPageActivity12 timeout() {
            return this.onNavigationEvent;
        }

        public String toString() {
            return "source(" + TTHistoryLandingPageActivity10.this.onExtraCallbackWithResult() + ')';
        }
    }
}
