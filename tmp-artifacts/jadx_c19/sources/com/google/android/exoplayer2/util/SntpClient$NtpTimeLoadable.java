package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SntpClient$NtpTimeLoadable implements Loader.Loadable {
    public void cancelLoad() {
    }

    private SntpClient$NtpTimeLoadable() {
    }

    public void load() throws IOException {
        synchronized (SntpClient.access$100()) {
            synchronized (SntpClient.access$200()) {
                if (SntpClient.access$300()) {
                    return;
                }
                long jAccess$400 = SntpClient.access$400();
                synchronized (SntpClient.access$200()) {
                    SntpClient.access$502(jAccess$400);
                    SntpClient.access$302(true);
                }
            }
        }
    }
}
