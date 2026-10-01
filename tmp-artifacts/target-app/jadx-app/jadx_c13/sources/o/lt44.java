package o;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class lt44 implements AutoCloseable {
    private final Duration IAuthTabCallback;
    private final SelectionKey onExtraCallbackWithResult;
    private final long onNavigationEvent = System.nanoTime();

    lt44(Duration duration) throws Throwable {
        Selector selectorOpen;
        this.IAuthTabCallback = duration;
        SocketChannel socketChannelOpen = SocketChannel.open();
        try {
            selectorOpen = Selector.open();
        } catch (Throwable th) {
            th = th;
            selectorOpen = null;
        }
        try {
            socketChannelOpen.configureBlocking(false);
            this.onExtraCallbackWithResult = socketChannelOpen.register(selectorOpen, 1);
        } catch (Throwable th2) {
            th = th2;
            if (selectorOpen != null) {
                selectorOpen.close();
            }
            socketChannelOpen.close();
            throw th;
        }
    }

    void onExtraCallbackWithResult(SocketAddress socketAddress) throws IOException {
        ((SocketChannel) this.onExtraCallbackWithResult.channel()).socket().bind(socketAddress);
    }

    void onWarmupCompleted(SocketAddress socketAddress) throws IOException {
        SocketChannel socketChannel = (SocketChannel) this.onExtraCallbackWithResult.channel();
        if (socketChannel.connect(socketAddress)) {
            return;
        }
        this.onExtraCallbackWithResult.interestOps(8);
        while (true) {
            try {
                if (socketChannel.finishConnect()) {
                    break;
                } else if (!this.onExtraCallbackWithResult.isConnectable()) {
                    onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                }
            } finally {
                if (this.onExtraCallbackWithResult.isValid()) {
                    this.onExtraCallbackWithResult.interestOps(0);
                }
            }
        }
    }

    void onWarmupCompleted(byte[] bArr) throws IOException {
        SocketChannel socketChannel = (SocketChannel) this.onExtraCallbackWithResult.channel();
        fby71.onExtraCallback("TCP write", socketChannel.socket().getLocalSocketAddress(), socketChannel.socket().getRemoteSocketAddress(), bArr);
        ByteBuffer[] byteBufferArr = {ByteBuffer.wrap(new byte[]{(byte) (bArr.length >>> 8), (byte) bArr.length}), ByteBuffer.wrap(bArr)};
        this.onExtraCallbackWithResult.interestOps(4);
        int i = 0;
        while (i < bArr.length + 2) {
            try {
                if (this.onExtraCallbackWithResult.isWritable()) {
                    long jWrite = socketChannel.write(byteBufferArr);
                    if (jWrite < 0) {
                        throw new EOFException();
                    }
                    i += (int) jWrite;
                    if (i < bArr.length + 2 && System.nanoTime() - this.onNavigationEvent >= this.IAuthTabCallback.toNanos()) {
                        throw new SocketTimeoutException();
                    }
                } else {
                    onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                }
            } finally {
                if (this.onExtraCallbackWithResult.isValid()) {
                    this.onExtraCallbackWithResult.interestOps(0);
                }
            }
        }
    }

    private byte[] onExtraCallback(int i) throws IOException {
        SocketChannel socketChannel = (SocketChannel) this.onExtraCallbackWithResult.channel();
        byte[] bArr = new byte[i];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.onExtraCallbackWithResult.interestOps(1);
        int i2 = 0;
        while (i2 < i) {
            try {
                if (this.onExtraCallbackWithResult.isReadable()) {
                    long j = socketChannel.read(byteBufferWrap);
                    if (j < 0) {
                        throw new EOFException();
                    }
                    i2 += (int) j;
                    if (i2 < i && System.nanoTime() - this.onNavigationEvent >= this.IAuthTabCallback.toNanos()) {
                        throw new SocketTimeoutException();
                    }
                } else {
                    onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                }
            } finally {
                if (this.onExtraCallbackWithResult.isValid()) {
                    this.onExtraCallbackWithResult.interestOps(0);
                }
            }
        }
        return bArr;
    }

    private void onExtraCallbackWithResult(SelectionKey selectionKey) throws IOException {
        int iSelectNow;
        long millis = this.IAuthTabCallback.minus(System.nanoTime() - this.onNavigationEvent, ChronoUnit.NANOS).toMillis();
        if (millis > 0) {
            iSelectNow = selectionKey.selector().select(millis);
        } else {
            if (millis == 0) {
                iSelectNow = selectionKey.selector().selectNow();
            }
            throw new SocketTimeoutException();
        }
        if (iSelectNow != 0) {
            return;
        }
        throw new SocketTimeoutException();
    }

    @Override // java.lang.AutoCloseable
    public void close() throws IOException {
        this.onExtraCallbackWithResult.selector().close();
        this.onExtraCallbackWithResult.channel().close();
    }

    byte[] onWarmupCompleted() throws IOException {
        byte[] bArrOnExtraCallback = onExtraCallback(2);
        byte[] bArrOnExtraCallback2 = onExtraCallback(((bArrOnExtraCallback[0] & 255) << 8) + (bArrOnExtraCallback[1] & 255));
        SocketChannel socketChannel = (SocketChannel) this.onExtraCallbackWithResult.channel();
        fby71.onExtraCallback("TCP read", socketChannel.socket().getLocalSocketAddress(), socketChannel.socket().getRemoteSocketAddress(), bArrOnExtraCallback2);
        return bArrOnExtraCallback2;
    }
}
