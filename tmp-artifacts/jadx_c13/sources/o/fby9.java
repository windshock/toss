package o;

import j$.time.Duration;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import o.fby71;
import o.fby9;
import okhttp3.internal.http2.Settings;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class fby9 extends fby71 implements TRANS_IsPCconnected {
    private static final AppSetIdAndScope1 onNavigationEvent = ea10.onWarmupCompleted((Class<?>) fby9.class);
    private final SecureRandom IAuthTabCallback;
    private final int onExtraCallback;
    private final int onWarmupCompleted;
    private final Queue<onExtraCallback> asInterface = new ConcurrentLinkedQueue();
    private final Queue<onExtraCallback> onExtraCallbackWithResult = new ConcurrentLinkedQueue();

    fby9() {
        int i;
        int i2;
        if (System.getProperty("os.name").toLowerCase().contains("linux")) {
            i = 32768;
            i2 = 60999;
        } else {
            i = 49152;
            i2 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        }
        int iIntValue = Integer.getInteger("dnsjava.udp.ephemeral.start", i).intValue();
        this.onExtraCallback = iIntValue;
        this.onWarmupCompleted = Integer.getInteger("dnsjava.udp.ephemeral.end", i2).intValue() - iIntValue;
        if (Boolean.getBoolean("dnsjava.udp.ephemeral.use_ephemeral_port")) {
            this.IAuthTabCallback = null;
        } else {
            this.IAuthTabCallback = new SecureRandom();
        }
        fby71.onNavigationEvent((Consumer<Selector>) new Consumer() { // from class: org.xbill.DNS.NioUdpClient$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) throws IOException {
                this.f$0.onExtraCallbackWithResult((Selector) obj);
            }
        }, false);
        fby71.IAuthTabCallback(new Runnable() { // from class: org.xbill.DNS.NioUdpClient$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                this.f$0.onWarmupCompleted();
            }
        }, false);
        fby71.onNavigationEvent(new Runnable() { // from class: org.xbill.DNS.NioUdpClient$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.IAuthTabCallbackStub();
            }
        }, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallbackWithResult(Selector selector) throws IOException {
        while (!this.asInterface.isEmpty()) {
            onExtraCallback onextracallbackPoll = this.asInterface.poll();
            if (onextracallbackPoll != null) {
                try {
                    int unused = onextracallbackPoll.asBinder;
                    onextracallbackPoll.onWarmupCompleted.register(selector, 1, onextracallbackPoll);
                    onextracallbackPoll.onNavigationEvent();
                } catch (IOException e) {
                    onextracallbackPoll.IAuthTabCallback(e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onWarmupCompleted() throws IOException {
        Iterator<onExtraCallback> it = this.onExtraCallbackWithResult.iterator();
        while (it.hasNext()) {
            onExtraCallback next = it.next();
            if (next.onExtraCallbackWithResult - System.nanoTime() < 0) {
                next.IAuthTabCallback(new SocketTimeoutException("Query timed out"));
                it.remove();
            }
        }
    }

    public final class onExtraCallback implements fby71.onNavigationEvent {
        private final int IAuthTabCallbackStub;
        private final int asBinder;
        private final byte[] onExtraCallback;
        private final long onExtraCallbackWithResult;
        private final CompletableFuture<byte[]> onNavigationEvent;
        private final DatagramChannel onWarmupCompleted;

        public onExtraCallback(int i, byte[] bArr, int i2, long j, DatagramChannel datagramChannel, CompletableFuture<byte[]> completableFuture) {
            this.asBinder = i;
            this.onExtraCallback = bArr;
            this.IAuthTabCallbackStub = i2;
            this.onExtraCallbackWithResult = j;
            this.onWarmupCompleted = datagramChannel;
            this.onNavigationEvent = completableFuture;
        }

        void onNavigationEvent() throws IOException {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.onExtraCallback);
            fby71.onExtraCallback("UDP write: transaction id=" + this.asBinder, this.onWarmupCompleted.socket().getLocalSocketAddress(), this.onWarmupCompleted.socket().getRemoteSocketAddress(), this.onExtraCallback);
            DatagramChannel datagramChannel = this.onWarmupCompleted;
            int iSend = datagramChannel.send(byteBufferWrap, datagramChannel.socket().getRemoteSocketAddress());
            if (iSend == 0) {
                throw new EOFException("Insufficient room for the datagram in the underlying output buffer for transaction " + this.asBinder);
            }
            if (iSend >= this.onExtraCallback.length) {
                return;
            }
            throw new EOFException("Could not send all data for transaction " + this.asBinder);
        }

        @Override // o.fby71.onNavigationEvent
        public void onExtraCallback(SelectionKey selectionKey) throws IOException {
            if (!selectionKey.isValid()) {
                IAuthTabCallback(new EOFException("Key for transaction " + this.asBinder + " is invalid"));
                fby9.this.onExtraCallbackWithResult.remove(this);
                return;
            }
            if (!selectionKey.isReadable()) {
                IAuthTabCallback(new EOFException("Key for transaction " + this.asBinder + " is not readable"));
                fby9.this.onExtraCallbackWithResult.remove(this);
                selectionKey.cancel();
                return;
            }
            DatagramChannel datagramChannel = (DatagramChannel) selectionKey.channel();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.IAuthTabCallbackStub);
            try {
                int i = datagramChannel.read(byteBufferAllocate);
                if (i <= 0) {
                    throw new EOFException("Could not read expected data for transaction " + this.asBinder);
                }
                byteBufferAllocate.flip();
                byte[] bArr = new byte[i];
                System.arraycopy(byteBufferAllocate.array(), 0, bArr, 0, i);
                fby71.onExtraCallback("UDP read: transaction id=" + this.asBinder, datagramChannel.socket().getLocalSocketAddress(), datagramChannel.socket().getRemoteSocketAddress(), bArr);
                selectionKey.cancel();
                IAuthTabCallback();
                this.onNavigationEvent.complete(bArr);
                fby9.this.onExtraCallbackWithResult.remove(this);
            } catch (IOException | NotYetConnectedException e) {
                IAuthTabCallback(e);
                fby9.this.onExtraCallbackWithResult.remove(this);
                selectionKey.cancel();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void IAuthTabCallback(Exception exc) throws IOException {
            IAuthTabCallback();
            this.onNavigationEvent.completeExceptionally(exc);
        }

        private void IAuthTabCallback() throws IOException {
            try {
                this.onWarmupCompleted.disconnect();
            } catch (IOException unused) {
            } catch (Throwable th) {
                fby9.onNavigationEvent(this.onWarmupCompleted);
                throw th;
            }
            fby9.onNavigationEvent(this.onWarmupCompleted);
        }
    }

    @Override // o.TRANS_IsPCconnected
    public CompletableFuture<byte[]> onNavigationEvent(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, onChildViewAdded onchildviewadded, byte[] bArr, int i, Duration duration) throws Throwable {
        Selector selectorIAuthTabCallback;
        DatagramChannel datagramChannelOpen;
        int i2;
        long jNanoTime = System.nanoTime();
        long nanos = duration.toNanos();
        CompletableFuture<byte[]> completableFuture = new CompletableFuture<>();
        DatagramChannel datagramChannel = null;
        try {
            selectorIAuthTabCallback = fby71.IAuthTabCallback();
            datagramChannelOpen = DatagramChannel.open();
        } catch (IOException e) {
            e = e;
        } catch (Throwable th) {
            th = th;
        }
        try {
            datagramChannelOpen.configureBlocking(false);
            onExtraCallback onextracallback = new onExtraCallback(onchildviewadded.IAuthTabCallback().onNavigationEvent(), bArr, i, jNanoTime + nanos, datagramChannelOpen, completableFuture);
            if (inetSocketAddress == null || inetSocketAddress.getPort() == 0) {
                boolean zOnExtraCallbackWithResult = false;
                for (i2 = 0; i2 < 1024 && !zOnExtraCallbackWithResult; i2++) {
                    zOnExtraCallbackWithResult = onExtraCallbackWithResult(inetSocketAddress, datagramChannelOpen);
                }
                if (!zOnExtraCallbackWithResult) {
                    onextracallback.IAuthTabCallback(new IOException("No available source port found"));
                    return completableFuture;
                }
            }
            datagramChannelOpen.connect(inetSocketAddress2);
            this.onExtraCallbackWithResult.add(onextracallback);
            this.asInterface.add(onextracallback);
            selectorIAuthTabCallback.wakeup();
            return completableFuture;
        } catch (IOException e2) {
            e = e2;
            datagramChannel = datagramChannelOpen;
            onNavigationEvent(datagramChannel);
            completableFuture.completeExceptionally(e);
            return completableFuture;
        } catch (Throwable th2) {
            th = th2;
            datagramChannel = datagramChannelOpen;
            onNavigationEvent(datagramChannel);
            throw th;
        }
    }

    private boolean onExtraCallbackWithResult(InetSocketAddress inetSocketAddress, DatagramChannel datagramChannel) throws IOException {
        InetSocketAddress inetSocketAddress2;
        SecureRandom secureRandom;
        try {
            if (inetSocketAddress == null) {
                inetSocketAddress2 = this.IAuthTabCallback != null ? new InetSocketAddress(this.IAuthTabCallback.nextInt(this.onWarmupCompleted) + this.onExtraCallback) : null;
            } else {
                int port = inetSocketAddress.getPort();
                if (port == 0 && (secureRandom = this.IAuthTabCallback) != null) {
                    port = secureRandom.nextInt(this.onWarmupCompleted) + this.onExtraCallback;
                }
                inetSocketAddress2 = new InetSocketAddress(inetSocketAddress.getAddress(), port);
            }
            datagramChannel.bind((SocketAddress) inetSocketAddress2);
            return true;
        } catch (SocketException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onNavigationEvent(DatagramChannel datagramChannel) throws IOException {
        if (datagramChannel != null) {
            try {
                datagramChannel.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IAuthTabCallbackStub() {
        this.asInterface.clear();
        final EOFException eOFException = new EOFException("Client is closing");
        this.onExtraCallbackWithResult.forEach(new Consumer() { // from class: org.xbill.DNS.NioUdpClient$$ExternalSyntheticLambda3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) throws IOException {
                ((fby9.onExtraCallback) obj).IAuthTabCallback(eOFException);
            }
        });
        this.onExtraCallbackWithResult.clear();
    }
}
