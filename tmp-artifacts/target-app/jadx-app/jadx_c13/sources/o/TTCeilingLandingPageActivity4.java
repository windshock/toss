package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTCeilingLandingPageActivity4 implements TTHistoryActivity42 {
    private boolean IAuthTabCallback;
    private final TTAppOpenAdTransActivity onExtraCallback;
    private int onExtraCallbackWithResult;
    private final Inflater onNavigationEvent;

    public TTCeilingLandingPageActivity4(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, @NotNull Inflater inflater) {
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        Intrinsics.checkNotNullParameter(inflater, "");
        this.onExtraCallback = tTAppOpenAdTransActivity;
        this.onNavigationEvent = inflater;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TTCeilingLandingPageActivity4(@NotNull TTHistoryActivity42 tTHistoryActivity42, @NotNull Inflater inflater) {
        this(TTCeilingLandingPageActivity5.onExtraCallback(tTHistoryActivity42), inflater);
        Intrinsics.checkNotNullParameter(tTHistoryActivity42, "");
        Intrinsics.checkNotNullParameter(inflater, "");
    }

    @Override // o.TTHistoryActivity42
    public long read(@NotNull TTBaseActivity tTBaseActivity, long j) throws DataFormatException, IOException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        do {
            long jOnExtraCallbackWithResult = onExtraCallbackWithResult(tTBaseActivity, j);
            if (jOnExtraCallbackWithResult > 0) {
                return jOnExtraCallbackWithResult;
            }
            if (this.onNavigationEvent.finished() || this.onNavigationEvent.needsDictionary()) {
                return -1L;
            }
        } while (!this.onExtraCallback.IAuthTabCallback_Parcel());
        throw new EOFException("source exhausted prematurely");
    }

    public final long onExtraCallbackWithResult(@NotNull TTBaseActivity tTBaseActivity, long j) throws DataFormatException, IOException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.IAuthTabCallback) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        try {
            TTHistoryActivity2 tTHistoryActivity2OnNavigationEvent = tTBaseActivity.onNavigationEvent(1);
            int iMin = (int) Math.min(j, 8192 - tTHistoryActivity2OnNavigationEvent.limit);
            IAuthTabCallback();
            int iInflate = this.onNavigationEvent.inflate(tTHistoryActivity2OnNavigationEvent.data, tTHistoryActivity2OnNavigationEvent.limit, iMin);
            onExtraCallbackWithResult();
            if (iInflate > 0) {
                tTHistoryActivity2OnNavigationEvent.limit += iInflate;
                long j2 = iInflate;
                tTBaseActivity.asInterface(tTBaseActivity.ICustomTabsCallbackDefault() + j2);
                return j2;
            }
            if (tTHistoryActivity2OnNavigationEvent.pos == tTHistoryActivity2OnNavigationEvent.limit) {
                tTBaseActivity.head = tTHistoryActivity2OnNavigationEvent.onExtraCallback();
                TTHistoryActivity.onExtraCallback(tTHistoryActivity2OnNavigationEvent);
            }
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    public final boolean IAuthTabCallback() throws IOException {
        if (!this.onNavigationEvent.needsInput()) {
            return false;
        }
        if (this.onExtraCallback.IAuthTabCallback_Parcel()) {
            return true;
        }
        TTHistoryActivity2 tTHistoryActivity2 = this.onExtraCallback.access100().head;
        Intrinsics.checkNotNull(tTHistoryActivity2);
        int i = tTHistoryActivity2.limit;
        int i2 = tTHistoryActivity2.pos;
        int i3 = i - i2;
        this.onExtraCallbackWithResult = i3;
        this.onNavigationEvent.setInput(tTHistoryActivity2.data, i2, i3);
        return false;
    }

    private final void onExtraCallbackWithResult() throws IOException {
        int i = this.onExtraCallbackWithResult;
        if (i == 0) {
            return;
        }
        int remaining = i - this.onNavigationEvent.getRemaining();
        this.onExtraCallbackWithResult -= remaining;
        this.onExtraCallback.IAuthTabCallbackDefault(remaining);
    }

    @Override // o.TTHistoryActivity42, o.TTHistoryActivity41
    public Timeout timeout() {
        return this.onExtraCallback.timeout();
    }

    @Override // o.TTHistoryActivity42, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.TTHistoryActivity41
    public void close() throws IOException {
        if (this.IAuthTabCallback) {
            return;
        }
        this.onNavigationEvent.end();
        this.IAuthTabCallback = true;
        this.onExtraCallback.close();
    }
}
