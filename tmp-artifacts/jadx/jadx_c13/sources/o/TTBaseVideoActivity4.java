package o;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTBaseVideoActivity4 implements TTHistoryActivity41 {
    private final Deflater IAuthTabCallback;
    private boolean onNavigationEvent;
    private final TTAppOpenAdActivity9 onWarmupCompleted;

    public TTBaseVideoActivity4(@NotNull TTAppOpenAdActivity9 tTAppOpenAdActivity9, @NotNull Deflater deflater) {
        Intrinsics.checkNotNullParameter(tTAppOpenAdActivity9, "");
        Intrinsics.checkNotNullParameter(deflater, "");
        this.onWarmupCompleted = tTAppOpenAdActivity9;
        this.IAuthTabCallback = deflater;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TTBaseVideoActivity4(@NotNull TTHistoryActivity41 tTHistoryActivity41, @NotNull Deflater deflater) {
        this(TTCeilingLandingPageActivity5.onExtraCallbackWithResult(tTHistoryActivity41), deflater);
        Intrinsics.checkNotNullParameter(tTHistoryActivity41, "");
        Intrinsics.checkNotNullParameter(deflater, "");
    }

    @Override // o.TTHistoryActivity41
    public void write(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        TTAppOpenAdActivity6.onExtraCallbackWithResult(tTBaseActivity.ICustomTabsCallbackDefault(), 0L, j);
        while (j > 0) {
            TTHistoryActivity2 tTHistoryActivity2 = tTBaseActivity.head;
            Intrinsics.checkNotNull(tTHistoryActivity2);
            int iMin = (int) Math.min(j, tTHistoryActivity2.limit - tTHistoryActivity2.pos);
            this.IAuthTabCallback.setInput(tTHistoryActivity2.data, tTHistoryActivity2.pos, iMin);
            IAuthTabCallback(false);
            long j2 = iMin;
            tTBaseActivity.asInterface(tTBaseActivity.ICustomTabsCallbackDefault() - j2);
            int i = tTHistoryActivity2.pos + iMin;
            tTHistoryActivity2.pos = i;
            if (i == tTHistoryActivity2.limit) {
                tTBaseActivity.head = tTHistoryActivity2.onExtraCallback();
                TTHistoryActivity.onExtraCallback(tTHistoryActivity2);
            }
            j -= j2;
        }
        this.IAuthTabCallback.setInput(TTHistoryLandingPageActivity8.onExtraCallback(), 0, 0);
    }

    private final void IAuthTabCallback(boolean z) throws IOException {
        TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent;
        int iDeflate;
        TTBaseActivity tTBaseActivityAccess100 = this.onWarmupCompleted.access100();
        while (true) {
            tTHistoryActivity2OnNavigationEvent = tTBaseActivityAccess100.onNavigationEvent(1);
            if (z) {
                try {
                    Deflater deflater = this.IAuthTabCallback;
                    byte[] bArr = tTHistoryActivity2OnNavigationEvent.data;
                    int i = tTHistoryActivity2OnNavigationEvent.limit;
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                Deflater deflater2 = this.IAuthTabCallback;
                byte[] bArr2 = tTHistoryActivity2OnNavigationEvent.data;
                int i2 = tTHistoryActivity2OnNavigationEvent.limit;
                iDeflate = deflater2.deflate(bArr2, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                tTHistoryActivity2OnNavigationEvent.limit += iDeflate;
                tTBaseActivityAccess100.asInterface(tTBaseActivityAccess100.ICustomTabsCallbackDefault() + iDeflate);
                this.onWarmupCompleted.asInterface();
            } else if (this.IAuthTabCallback.needsInput()) {
                break;
            }
        }
        if (tTHistoryActivity2OnNavigationEvent.pos == tTHistoryActivity2OnNavigationEvent.limit) {
            tTBaseActivityAccess100.head = tTHistoryActivity2OnNavigationEvent.onExtraCallback();
            TTHistoryActivity.onExtraCallback(tTHistoryActivity2OnNavigationEvent);
        }
    }

    @Override // o.TTHistoryActivity41, java.io.Flushable
    public void flush() throws IOException {
        IAuthTabCallback(true);
        this.onWarmupCompleted.flush();
    }

    public final void onWarmupCompleted() throws IOException {
        this.IAuthTabCallback.finish();
        IAuthTabCallback(false);
    }

    @Override // o.TTHistoryActivity41, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws Throwable {
        if (this.onNavigationEvent) {
            return;
        }
        try {
            onWarmupCompleted();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.IAuthTabCallback.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.onWarmupCompleted.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.onNavigationEvent = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // o.TTHistoryActivity41
    public Timeout timeout() {
        return this.onWarmupCompleted.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.onWarmupCompleted + ')';
    }
}
