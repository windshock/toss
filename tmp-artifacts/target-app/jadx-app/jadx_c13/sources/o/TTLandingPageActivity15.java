package o;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class TTLandingPageActivity15 extends InputStream {
    private final byte[] onNavigationEvent = new byte[1];
    private long onWarmupCompleted;

    public boolean IAuthTabCallback(TTLandingPageActivity14 tTLandingPageActivity14) {
        return true;
    }

    public abstract TTLandingPageActivity14 onNavigationEvent() throws IOException;

    public void onWarmupCompleted(int i) {
        onWarmupCompleted(i);
    }

    public void onWarmupCompleted(long j) {
        if (j != -1) {
            this.onWarmupCompleted += j;
        }
    }

    public long onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public void onExtraCallback(long j) {
        this.onWarmupCompleted -= j;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.onNavigationEvent, 0, 1) == -1) {
            return -1;
        }
        return this.onNavigationEvent[0] & 255;
    }
}
