package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class PAGErrorModel extends InputStream {
    private ByteBuffer onExtraCallback;
    private final long onNavigationEvent;
    private long onWarmupCompleted;

    protected abstract int onExtraCallbackWithResult(long j, ByteBuffer byteBuffer) throws IOException;

    public PAGErrorModel(long j, long j2) {
        long j3 = j + j2;
        this.onNavigationEvent = j3;
        if (j3 < j) {
            throw new IllegalArgumentException("Invalid length of stream at offset=" + j + ", length=" + j2);
        }
        this.onWarmupCompleted = j;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        synchronized (this) {
            if (this.onWarmupCompleted >= this.onNavigationEvent) {
                return -1;
            }
            ByteBuffer byteBuffer = this.onExtraCallback;
            if (byteBuffer == null) {
                this.onExtraCallback = ByteBuffer.allocate(1);
            } else {
                byteBuffer.rewind();
            }
            if (onExtraCallbackWithResult(this.onWarmupCompleted, this.onExtraCallback) <= 0) {
                return -1;
            }
            this.onWarmupCompleted++;
            return this.onExtraCallback.get() & 255;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        synchronized (this) {
            long j = this.onWarmupCompleted;
            long j2 = this.onNavigationEvent;
            if (j >= j2) {
                return -1;
            }
            long jMin = Math.min(i2, j2 - j);
            if (jMin <= 0) {
                return 0;
            }
            if (i < 0 || i > bArr.length || jMin > bArr.length - i) {
                throw new IndexOutOfBoundsException("offset or len are out of bounds");
            }
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onWarmupCompleted, ByteBuffer.wrap(bArr, i, (int) jMin));
            if (iOnExtraCallbackWithResult > 0) {
                this.onWarmupCompleted += iOnExtraCallbackWithResult;
            }
            return iOnExtraCallbackWithResult;
        }
    }
}
