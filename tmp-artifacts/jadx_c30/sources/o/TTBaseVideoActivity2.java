package o;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import okio.RealBufferedSink;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTBaseVideoActivity2 implements TTHistoryActivity41 {
    private final TTBaseVideoActivity4 IAuthTabCallback;
    private final CRC32 onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final RealBufferedSink onNavigationEvent;
    private final Deflater onWarmupCompleted;

    public TTBaseVideoActivity2(@NotNull TTHistoryActivity41 tTHistoryActivity41) {
        Intrinsics.checkNotNullParameter(tTHistoryActivity41, BuildConfig.FLAVOR);
        RealBufferedSink realBufferedSink = new RealBufferedSink(tTHistoryActivity41);
        this.onNavigationEvent = realBufferedSink;
        Deflater deflater = new Deflater(TTHistoryLandingPageActivity8.IAuthTabCallback(), true);
        this.onWarmupCompleted = deflater;
        this.IAuthTabCallback = new TTBaseVideoActivity4(realBufferedSink, deflater);
        this.onExtraCallback = new CRC32();
        TTBaseActivity tTBaseActivity = realBufferedSink.IAuthTabCallback;
        tTBaseActivity.onTransact(8075);
        tTBaseActivity.onWarmupCompleted(8);
        tTBaseActivity.onWarmupCompleted(0);
        tTBaseActivity.onExtraCallback(0);
        tTBaseActivity.onWarmupCompleted(0);
        tTBaseActivity.onWarmupCompleted(0);
    }

    public void write(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, BuildConfig.FLAVOR);
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (j == 0) {
            return;
        }
        onNavigationEvent(tTBaseActivity, j);
        this.IAuthTabCallback.write(tTBaseActivity, j);
    }

    public void flush() throws IOException {
        this.IAuthTabCallback.flush();
    }

    public Timeout timeout() {
        return this.onNavigationEvent.timeout();
    }

    public void close() throws Throwable {
        if (this.onExtraCallbackWithResult) {
            return;
        }
        try {
            this.IAuthTabCallback.onWarmupCompleted();
            onExtraCallbackWithResult();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.onWarmupCompleted.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.onNavigationEvent.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.onExtraCallbackWithResult = true;
        if (th != null) {
            throw th;
        }
    }

    private final void onExtraCallbackWithResult() {
        this.onNavigationEvent.IAuthTabCallbackStub((int) this.onExtraCallback.getValue());
        this.onNavigationEvent.IAuthTabCallbackStub((int) this.onWarmupCompleted.getBytesRead());
    }

    private final void onNavigationEvent(TTBaseActivity tTBaseActivity, long j) {
        TTHistoryActivity2 tTHistoryActivity2 = tTBaseActivity.head;
        Intrinsics.checkNotNull(tTHistoryActivity2);
        while (j > 0) {
            int iMin = (int) Math.min(j, tTHistoryActivity2.limit - tTHistoryActivity2.pos);
            this.onExtraCallback.update(tTHistoryActivity2.data, tTHistoryActivity2.pos, iMin);
            j -= iMin;
            tTHistoryActivity2 = tTHistoryActivity2.next;
            Intrinsics.checkNotNull(tTHistoryActivity2);
        }
    }
}
