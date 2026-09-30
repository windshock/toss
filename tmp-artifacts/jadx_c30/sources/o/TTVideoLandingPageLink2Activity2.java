package o;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTVideoLandingPageLink2Activity2 implements Closeable {
    private final Queue<onExtraCallback> IAuthTabCallback = new ConcurrentLinkedQueue();
    private final AtomicBoolean onExtraCallback = new AtomicBoolean();
    private onExtraCallbackWithResult onExtraCallbackWithResult;
    private final TTVideoLandingPageLink2Activity12 onNavigationEvent;
    private final PAGInterstitialAdInteractionCallback onWarmupCompleted;

    static class onExtraCallback {
        final long IAuthTabCallback;
        final long onExtraCallbackWithResult;
        final long onNavigationEvent;
        final dj10 onWarmupCompleted;

        public onExtraCallback(dj10 dj10Var, long j, long j2, long j3) {
            this.onWarmupCompleted = dj10Var;
            this.IAuthTabCallback = j;
            this.onNavigationEvent = j2;
            this.onExtraCallbackWithResult = j3;
        }
    }

    public static class onExtraCallbackWithResult implements Closeable {
        private final InputStream IAuthTabCallback;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            InputStream inputStream = this.IAuthTabCallback;
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    public TTVideoLandingPageLink2Activity2(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback, TTVideoLandingPageLink2Activity12 tTVideoLandingPageLink2Activity12) {
        this.onWarmupCompleted = pAGInterstitialAdInteractionCallback;
        this.onNavigationEvent = tTVideoLandingPageLink2Activity12;
    }

    public void onExtraCallback(dj10 dj10Var) throws IOException {
        InputStream inputStreamOnExtraCallback = dj10Var.onExtraCallback();
        try {
            this.onNavigationEvent.onExtraCallbackWithResult(inputStreamOnExtraCallback, dj10Var.onExtraCallbackWithResult());
            if (inputStreamOnExtraCallback != null) {
                inputStreamOnExtraCallback.close();
            }
            this.IAuthTabCallback.add(new onExtraCallback(dj10Var, this.onNavigationEvent.onExtraCallbackWithResult(), this.onNavigationEvent.IAuthTabCallback(), this.onNavigationEvent.onExtraCallback()));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStreamOnExtraCallback != null) {
                    try {
                        inputStreamOnExtraCallback.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.onExtraCallback.compareAndSet(false, true)) {
            try {
                onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallbackWithResult;
                if (onextracallbackwithresult != null) {
                    onextracallbackwithresult.close();
                }
                this.onWarmupCompleted.close();
            } finally {
                this.onNavigationEvent.close();
            }
        }
    }
}
