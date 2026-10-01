package o;

import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class dj18 extends InputStream {
    private long IAuthTabCallback;

    public void onExtraCallbackWithResult(int i) {
        onNavigationEvent(i);
    }

    public void onNavigationEvent(long j) {
        if (j != -1) {
            this.IAuthTabCallback += j;
        }
    }

    public long onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public void onExtraCallback(long j) {
        this.IAuthTabCallback -= j;
    }
}
