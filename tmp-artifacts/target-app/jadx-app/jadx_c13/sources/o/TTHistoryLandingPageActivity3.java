package o;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.ForwardingSource;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryLandingPageActivity3 extends ForwardingSource {
    private final boolean IAuthTabCallback;
    private long onExtraCallbackWithResult;
    private final long onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTHistoryLandingPageActivity3(@NotNull TTHistoryActivity42 tTHistoryActivity42, long j, boolean z) {
        super(tTHistoryActivity42);
        Intrinsics.checkNotNullParameter(tTHistoryActivity42, "");
        this.onWarmupCompleted = j;
        this.IAuthTabCallback = z;
    }

    @Override // okio.ForwardingSource, o.TTHistoryActivity42
    public long read(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        long j2 = this.onExtraCallbackWithResult;
        long j3 = this.onWarmupCompleted;
        if (j2 > j3) {
            j = 0;
        } else if (this.IAuthTabCallback) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long j5 = super.read(tTBaseActivity, j);
        if (j5 != -1) {
            this.onExtraCallbackWithResult += j5;
        }
        long j6 = this.onExtraCallbackWithResult;
        long j7 = this.onWarmupCompleted;
        if ((j6 >= j7 || j5 != -1) && j6 <= j7) {
            return j5;
        }
        if (j5 > 0 && j6 > j7) {
            onExtraCallback(tTBaseActivity, tTBaseActivity.ICustomTabsCallbackDefault() - (this.onExtraCallbackWithResult - this.onWarmupCompleted));
        }
        throw new IOException("expected " + this.onWarmupCompleted + " bytes but got " + this.onExtraCallbackWithResult);
    }

    private final void onExtraCallback(TTBaseActivity tTBaseActivity, long j) throws IOException {
        TTBaseActivity tTBaseActivity2 = new TTBaseActivity();
        tTBaseActivity2.onExtraCallbackWithResult(tTBaseActivity);
        tTBaseActivity.write(tTBaseActivity2, j);
        tTBaseActivity2.onWarmupCompleted();
    }
}
