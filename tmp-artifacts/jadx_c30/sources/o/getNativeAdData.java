package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Checksum;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class getNativeAdData extends InputStream {
    private final InputStream IAuthTabCallback;
    private long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final Checksum onWarmupCompleted;

    public getNativeAdData(Checksum checksum, InputStream inputStream, long j, long j2) {
        this.onWarmupCompleted = checksum;
        this.IAuthTabCallback = inputStream;
        this.onExtraCallbackWithResult = j2;
        this.onExtraCallback = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.IAuthTabCallback.close();
    }

    public long onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.onExtraCallback <= 0) {
            return -1;
        }
        int i = this.IAuthTabCallback.read();
        if (i >= 0) {
            this.onWarmupCompleted.update(i);
            this.onExtraCallback--;
        }
        IAuthTabCallback();
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.IAuthTabCallback.read(bArr, i, i2);
        if (i3 >= 0) {
            this.onWarmupCompleted.update(bArr, i, i3);
            this.onExtraCallback -= i3;
        }
        IAuthTabCallback();
        return i3;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return read() >= 0 ? 1L : 0L;
    }

    private void IAuthTabCallback() throws IOException {
        if (this.onExtraCallback <= 0 && this.onExtraCallbackWithResult != this.onWarmupCompleted.getValue()) {
            throw new IOException("Checksum verification failed");
        }
    }
}
