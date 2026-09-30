package o;

import kotlin.jvm.internal.Intrinsics;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryActivity3 implements TTHistoryActivity42 {
    private final TTBaseActivity IAuthTabCallback;
    private final TTAppOpenAdTransActivity asBinder;
    private boolean onExtraCallback;
    private int onExtraCallbackWithResult;
    private long onNavigationEvent;
    private TTHistoryActivity2 onWarmupCompleted;

    public TTHistoryActivity3(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity) {
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        this.asBinder = tTAppOpenAdTransActivity;
        TTBaseActivity tTBaseActivityAccess100 = tTAppOpenAdTransActivity.access100();
        this.IAuthTabCallback = tTBaseActivityAccess100;
        TTHistoryActivity2 tTHistoryActivity2 = tTBaseActivityAccess100.head;
        this.onWarmupCompleted = tTHistoryActivity2;
        this.onExtraCallbackWithResult = tTHistoryActivity2 != null ? tTHistoryActivity2.pos : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r4.pos) goto L15;
     */
    @Override // o.TTHistoryActivity42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long read(@NotNull TTBaseActivity tTBaseActivity, long j) {
        TTHistoryActivity2 tTHistoryActivity2;
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.onExtraCallback) {
            throw new IllegalStateException("closed");
        }
        TTHistoryActivity2 tTHistoryActivity22 = this.onWarmupCompleted;
        if (tTHistoryActivity22 != null) {
            TTHistoryActivity2 tTHistoryActivity23 = this.IAuthTabCallback.head;
            if (tTHistoryActivity22 == tTHistoryActivity23) {
                int i = this.onExtraCallbackWithResult;
                Intrinsics.checkNotNull(tTHistoryActivity23);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.asBinder.asBinder(this.onNavigationEvent + 1)) {
            return -1L;
        }
        if (this.onWarmupCompleted == null && (tTHistoryActivity2 = this.IAuthTabCallback.head) != null) {
            this.onWarmupCompleted = tTHistoryActivity2;
            Intrinsics.checkNotNull(tTHistoryActivity2);
            this.onExtraCallbackWithResult = tTHistoryActivity2.pos;
        }
        long jMin = Math.min(j, this.IAuthTabCallback.ICustomTabsCallbackDefault() - this.onNavigationEvent);
        this.IAuthTabCallback.IAuthTabCallback(tTBaseActivity, this.onNavigationEvent, jMin);
        this.onNavigationEvent += jMin;
        return jMin;
    }

    @Override // o.TTHistoryActivity42, o.TTHistoryActivity41
    public Timeout timeout() {
        return this.asBinder.timeout();
    }

    @Override // o.TTHistoryActivity42, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.TTHistoryActivity41
    public void close() {
        this.onExtraCallback = true;
    }
}
