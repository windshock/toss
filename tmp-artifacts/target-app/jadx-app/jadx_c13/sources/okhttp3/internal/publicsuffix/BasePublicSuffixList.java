package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdTransActivity;
import o.TTBaseLandingPageActivity;
import o.TTCeilingLandingPageActivity5;
import o.TTHistoryActivity42;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class BasePublicSuffixList implements PublicSuffixList {
    public TTBaseLandingPageActivity bytes;
    public TTBaseLandingPageActivity exceptionBytes;
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);
    private IOException readFailure;

    public abstract Object getPath();

    public abstract TTHistoryActivity42 listSource();

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public TTBaseLandingPageActivity getBytes() {
        TTBaseLandingPageActivity tTBaseLandingPageActivity = this.bytes;
        if (tTBaseLandingPageActivity != null) {
            return tTBaseLandingPageActivity;
        }
        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        return null;
    }

    public void setBytes(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        this.bytes = tTBaseLandingPageActivity;
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public TTBaseLandingPageActivity getExceptionBytes() {
        TTBaseLandingPageActivity tTBaseLandingPageActivity = this.exceptionBytes;
        if (tTBaseLandingPageActivity != null) {
            return tTBaseLandingPageActivity;
        }
        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        return null;
    }

    public void setExceptionBytes(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        this.exceptionBytes = tTBaseLandingPageActivity;
    }

    private final void readTheList() throws IOException {
        try {
            TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(listSource());
            try {
                TTBaseLandingPageActivity tTBaseLandingPageActivityOnNavigationEvent = tTAppOpenAdTransActivityOnExtraCallback.onNavigationEvent(tTAppOpenAdTransActivityOnExtraCallback.onPostMessage());
                TTBaseLandingPageActivity tTBaseLandingPageActivityOnNavigationEvent2 = tTAppOpenAdTransActivityOnExtraCallback.onNavigationEvent(tTAppOpenAdTransActivityOnExtraCallback.onPostMessage());
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, null);
                synchronized (this) {
                    Intrinsics.checkNotNull(tTBaseLandingPageActivityOnNavigationEvent);
                    setBytes(tTBaseLandingPageActivityOnNavigationEvent);
                    Intrinsics.checkNotNull(tTBaseLandingPageActivityOnNavigationEvent2);
                    setExceptionBytes(tTBaseLandingPageActivityOnNavigationEvent2);
                }
            } finally {
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public void ensureLoaded() throws InterruptedException {
        if (!this.listRead.get() && this.listRead.compareAndSet(false, true)) {
            readTheListUninterruptibly();
        } else {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.bytes != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + getPath() + " resource.");
        illegalStateException.initCause(this.readFailure);
        throw illegalStateException;
    }

    private final void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    this.readFailure = e;
                    if (!z) {
                        return;
                    }
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (!z) {
            return;
        }
        Thread.currentThread().interrupt();
    }
}
