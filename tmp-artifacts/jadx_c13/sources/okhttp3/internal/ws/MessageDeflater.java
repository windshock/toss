package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import o.TTBaseVideoActivity4;
import o.TTHistoryActivity41;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class MessageDeflater implements Closeable {
    private final TTBaseActivity deflatedBytes;
    private final Deflater deflater;
    private final TTBaseVideoActivity4 deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        TTBaseActivity tTBaseActivity = new TTBaseActivity();
        this.deflatedBytes = tTBaseActivity;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new TTBaseVideoActivity4((TTHistoryActivity41) tTBaseActivity, deflater);
    }

    public final void deflate(@NotNull TTBaseActivity tTBaseActivity) throws IOException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        if (this.deflatedBytes.ICustomTabsCallbackDefault() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(tTBaseActivity, tTBaseActivity.ICustomTabsCallbackDefault());
        this.deflaterSink.flush();
        if (endsWith(this.deflatedBytes, MessageDeflaterKt.EMPTY_DEFLATE_BLOCK)) {
            long jICustomTabsCallbackDefault = this.deflatedBytes.ICustomTabsCallbackDefault();
            TTBaseActivity.onNavigationEvent onnavigationeventOnWarmupCompleted = TTBaseActivity.onWarmupCompleted(this.deflatedBytes, (TTBaseActivity.onNavigationEvent) null, 1, (Object) null);
            try {
                onnavigationeventOnWarmupCompleted.onExtraCallback(jICustomTabsCallbackDefault - 4);
                CloseableKt.closeFinally(onnavigationeventOnWarmupCompleted, null);
            } finally {
            }
        } else {
            this.deflatedBytes.onExtraCallbackWithResult(0);
        }
        TTBaseActivity tTBaseActivity2 = this.deflatedBytes;
        tTBaseActivity.write(tTBaseActivity2, tTBaseActivity2.ICustomTabsCallbackDefault());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.deflaterSink.close();
    }

    private final boolean endsWith(TTBaseActivity tTBaseActivity, TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        return tTBaseActivity.onNavigationEvent(tTBaseActivity.ICustomTabsCallbackDefault() - tTBaseLandingPageActivity.access100(), tTBaseLandingPageActivity);
    }
}
