package o;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ul4 extends dj18 {
    private InputStream IAuthTabCallback;
    private final byte[] onExtraCallbackWithResult;
    private long onNavigationEvent;
    private djlud onWarmupCompleted;

    ul4(djlud djludVar) {
        this.onExtraCallbackWithResult = new byte[1];
        this.onWarmupCompleted = djludVar;
    }

    public ul4(InputStream inputStream) {
        this(new djlud(inputStream));
        this.IAuthTabCallback = inputStream;
    }

    public int available() throws IOException {
        djlud djludVar = this.onWarmupCompleted;
        if (djludVar != null) {
            return djludVar.onWarmupCompleted();
        }
        return 0;
    }

    public void close() throws IOException {
        try {
            onWarmupCompleted();
            InputStream inputStream = this.IAuthTabCallback;
            if (inputStream != null) {
                inputStream.close();
                this.IAuthTabCallback = null;
            }
        } catch (Throwable th) {
            if (this.IAuthTabCallback != null) {
                this.IAuthTabCallback.close();
                this.IAuthTabCallback = null;
            }
            throw th;
        }
    }

    private void onWarmupCompleted() {
        PAGNativeAdLoadListener.onNavigationEvent(this.onWarmupCompleted);
        this.onWarmupCompleted = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int read() throws IOException {
        int i;
        do {
            i = read(this.onExtraCallbackWithResult);
            if (i == -1) {
                return -1;
            }
        } while (i == 0);
        if (i == 1) {
            return this.onExtraCallbackWithResult[0] & 255;
        }
        throw new IllegalStateException("Invalid return value from read: " + i);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        djlud djludVar = this.onWarmupCompleted;
        if (djludVar == null) {
            return -1;
        }
        try {
            int iOnExtraCallback = djludVar.onExtraCallback(bArr, i, i2);
            this.onNavigationEvent = this.onWarmupCompleted.onExtraCallback();
            onExtraCallbackWithResult(iOnExtraCallback);
            if (iOnExtraCallback == -1) {
                onWarmupCompleted();
            }
            return iOnExtraCallback;
        } catch (RuntimeException e) {
            throw new IOException("Invalid Deflate64 input", e);
        }
    }
}
