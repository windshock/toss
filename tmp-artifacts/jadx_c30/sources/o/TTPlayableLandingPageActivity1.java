package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TTPlayableLandingPageActivity1 extends InputStream {
    private long IAuthTabCallback;
    private final SeekableByteChannel onExtraCallbackWithResult;
    private final ByteBuffer onNavigationEvent;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public TTPlayableLandingPageActivity1(SeekableByteChannel seekableByteChannel, long j) {
        this.onExtraCallbackWithResult = seekableByteChannel;
        this.IAuthTabCallback = j;
        if (j < 8192 && j > 0) {
            this.onNavigationEvent = ByteBuffer.allocate((int) j);
        } else {
            this.onNavigationEvent = ByteBuffer.allocate(PKIFailureInfo.certRevoked);
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j = this.IAuthTabCallback;
        if (j <= 0) {
            return -1;
        }
        this.IAuthTabCallback = j - 1;
        int iOnNavigationEvent = onNavigationEvent(1);
        return iOnNavigationEvent < 0 ? iOnNavigationEvent : this.onNavigationEvent.get() & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        ByteBuffer byteBufferAllocate;
        int iOnNavigationEvent;
        if (i2 == 0) {
            return 0;
        }
        long j = this.IAuthTabCallback;
        if (j <= 0) {
            return -1;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        if (i2 <= this.onNavigationEvent.capacity()) {
            byteBufferAllocate = this.onNavigationEvent;
            iOnNavigationEvent = onNavigationEvent(i2);
        } else {
            byteBufferAllocate = ByteBuffer.allocate(i2);
            iOnNavigationEvent = this.onExtraCallbackWithResult.read(byteBufferAllocate);
            byteBufferAllocate.flip();
        }
        if (iOnNavigationEvent >= 0) {
            byteBufferAllocate.get(bArr, i, iOnNavigationEvent);
            this.IAuthTabCallback -= iOnNavigationEvent;
        }
        return iOnNavigationEvent;
    }

    private int onNavigationEvent(int i) throws IOException {
        this.onNavigationEvent.rewind().limit(i);
        int i2 = this.onExtraCallbackWithResult.read(this.onNavigationEvent);
        this.onNavigationEvent.flip();
        return i2;
    }
}
