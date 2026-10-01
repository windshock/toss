package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import o.TTBaseActivity;
import o.TTCeilingLandingPageActivity4;
import o.TTHistoryActivity42;
import okhttp3.internal.http2.Settings;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class MessageInflater implements Closeable {
    private final TTBaseActivity deflatedBytes = new TTBaseActivity();
    private Inflater inflater;
    private TTCeilingLandingPageActivity4 inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
    }

    public final void inflate(@NotNull TTBaseActivity tTBaseActivity) throws DataFormatException, IOException {
        Intrinsics.checkNotNullParameter(tTBaseActivity, "");
        if (this.deflatedBytes.ICustomTabsCallbackDefault() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Inflater inflater = this.inflater;
        if (inflater == null) {
            inflater = new Inflater(true);
            this.inflater = inflater;
        }
        TTCeilingLandingPageActivity4 tTCeilingLandingPageActivity4 = this.inflaterSource;
        if (tTCeilingLandingPageActivity4 == null) {
            tTCeilingLandingPageActivity4 = new TTCeilingLandingPageActivity4((TTHistoryActivity42) this.deflatedBytes, inflater);
            this.inflaterSource = tTCeilingLandingPageActivity4;
        }
        if (this.noContextTakeover) {
            inflater.reset();
        }
        this.deflatedBytes.onExtraCallbackWithResult(tTBaseActivity);
        this.deflatedBytes.asBinder(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        long bytesRead = inflater.getBytesRead() + this.deflatedBytes.ICustomTabsCallbackDefault();
        do {
            tTCeilingLandingPageActivity4.onExtraCallbackWithResult(tTBaseActivity, LongCompanionObject.MAX_VALUE);
            if (inflater.getBytesRead() >= bytesRead) {
                break;
            }
        } while (!inflater.finished());
        if (inflater.getBytesRead() < bytesRead) {
            this.deflatedBytes.onWarmupCompleted();
            tTCeilingLandingPageActivity4.close();
            this.inflaterSource = null;
            this.inflater = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        TTCeilingLandingPageActivity4 tTCeilingLandingPageActivity4 = this.inflaterSource;
        if (tTCeilingLandingPageActivity4 != null) {
            tTCeilingLandingPageActivity4.close();
        }
        this.inflaterSource = null;
        this.inflater = null;
    }
}
