package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.SntpClient;
import java.io.IOException;
import java.util.ConcurrentModificationException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SntpClient$NtpTimeCallback implements Loader.Callback<Loader.Loadable> {
    private final SntpClient.InitializationCallback callback;

    public void onLoadCanceled(Loader.Loadable loadable, long j, long j2, boolean z) {
    }

    public SntpClient$NtpTimeCallback(@Nullable SntpClient.InitializationCallback initializationCallback) {
        this.callback = initializationCallback;
    }

    public void onLoadCompleted(Loader.Loadable loadable, long j, long j2) {
        if (this.callback != null) {
            if (!SntpClient.isInitialized()) {
                this.callback.onInitializationFailed(new IOException(new ConcurrentModificationException()));
            } else {
                this.callback.onInitialized();
            }
        }
    }

    public Loader.LoadErrorAction onLoadError(Loader.Loadable loadable, long j, long j2, IOException iOException, int i2) {
        SntpClient.InitializationCallback initializationCallback = this.callback;
        if (initializationCallback != null) {
            initializationCallback.onInitializationFailed(iOException);
        }
        return Loader.DONT_RETRY;
    }
}
