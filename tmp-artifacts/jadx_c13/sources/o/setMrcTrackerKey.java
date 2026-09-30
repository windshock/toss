package o;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setMrcTrackerKey extends InputStream {
    private long IAuthTabCallback;
    private final InputStream onWarmupCompleted;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public setMrcTrackerKey(InputStream inputStream, long j) {
        this.onWarmupCompleted = inputStream;
        this.IAuthTabCallback = j;
    }

    public long onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j = this.IAuthTabCallback;
        if (j <= 0) {
            return -1;
        }
        this.IAuthTabCallback = j - 1;
        return this.onWarmupCompleted.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.IAuthTabCallback;
        if (j == 0) {
            return -1;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        int i3 = this.onWarmupCompleted.read(bArr, i, i2);
        if (i3 >= 0) {
            this.IAuthTabCallback -= i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long jSkip = this.onWarmupCompleted.skip(Math.min(this.IAuthTabCallback, j));
        this.IAuthTabCallback -= jSkip;
        return jSkip;
    }
}
