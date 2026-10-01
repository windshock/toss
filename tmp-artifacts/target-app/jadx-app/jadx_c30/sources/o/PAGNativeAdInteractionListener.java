package o;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PAGNativeAdInteractionListener extends OutputStream implements WritableByteChannel {
    private final ByteBuffer IAuthTabCallback;
    private final WritableByteChannel onExtraCallback;
    private final AtomicBoolean onExtraCallbackWithResult;
    private final int onWarmupCompleted;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        if (this.onExtraCallbackWithResult.compareAndSet(false, true)) {
            try {
                IAuthTabCallback();
            } finally {
                this.onExtraCallback.close();
            }
        }
    }

    public void IAuthTabCallback() throws IOException {
        if (this.IAuthTabCallback.position() != 0) {
            onExtraCallback();
            onWarmupCompleted();
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        if (!this.onExtraCallback.isOpen()) {
            this.onExtraCallbackWithResult.set(true);
        }
        return !this.onExtraCallbackWithResult.get();
    }

    private void onExtraCallbackWithResult() throws IOException {
        if (this.IAuthTabCallback.hasRemaining()) {
            return;
        }
        onWarmupCompleted();
    }

    private void onExtraCallback() {
        this.IAuthTabCallback.order(ByteOrder.nativeOrder());
        int iRemaining = this.IAuthTabCallback.remaining();
        if (iRemaining > 8) {
            int iPosition = this.IAuthTabCallback.position() & 7;
            if (iPosition != 0) {
                int i = 8 - iPosition;
                for (int i2 = 0; i2 < i; i2++) {
                    this.IAuthTabCallback.put((byte) 0);
                }
                iRemaining -= i;
            }
            while (iRemaining >= 8) {
                this.IAuthTabCallback.putLong(0L);
                iRemaining -= 8;
            }
        }
        while (this.IAuthTabCallback.hasRemaining()) {
            this.IAuthTabCallback.put((byte) 0);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!isOpen()) {
            throw new ClosedChannelException();
        }
        while (i2 > 0) {
            int iMin = Math.min(i2, this.IAuthTabCallback.remaining());
            this.IAuthTabCallback.put(bArr, i, iMin);
            onExtraCallbackWithResult();
            i2 -= iMin;
            i += iMin;
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        int i;
        if (!isOpen()) {
            throw new ClosedChannelException();
        }
        int iRemaining = byteBuffer.remaining();
        if (iRemaining < this.IAuthTabCallback.remaining()) {
            this.IAuthTabCallback.put(byteBuffer);
            return iRemaining;
        }
        int iLimit = byteBuffer.limit();
        if (this.IAuthTabCallback.position() != 0) {
            int iRemaining2 = this.IAuthTabCallback.remaining();
            byteBuffer.limit(byteBuffer.position() + iRemaining2);
            this.IAuthTabCallback.put(byteBuffer);
            onWarmupCompleted();
            i = iRemaining - iRemaining2;
        } else {
            i = iRemaining;
        }
        while (i >= this.onWarmupCompleted) {
            byteBuffer.limit(byteBuffer.position() + this.onWarmupCompleted);
            this.onExtraCallback.write(byteBuffer);
            i -= this.onWarmupCompleted;
        }
        byteBuffer.limit(iLimit);
        this.IAuthTabCallback.put(byteBuffer);
        return iRemaining;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (!isOpen()) {
            throw new ClosedChannelException();
        }
        this.IAuthTabCallback.put((byte) i);
        onExtraCallbackWithResult();
    }

    private void onWarmupCompleted() throws IOException {
        this.IAuthTabCallback.flip();
        int iWrite = this.onExtraCallback.write(this.IAuthTabCallback);
        boolean zHasRemaining = this.IAuthTabCallback.hasRemaining();
        int i = this.onWarmupCompleted;
        if (iWrite != i || zHasRemaining) {
            throw new IOException(String.format("Failed to write %,d bytes atomically. Only wrote  %,d", Integer.valueOf(i), Integer.valueOf(iWrite)));
        }
        this.IAuthTabCallback.clear();
    }
}
