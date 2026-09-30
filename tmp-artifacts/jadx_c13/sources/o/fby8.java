package o;

import j$.time.Duration;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import java.util.function.Function;
import o.fby71;
import o.fby8;
import okhttp3.internal.http2.Settings;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class fby8 extends fby71 implements TRANS_V2_ExportCert {
    private static final AppSetIdAndScope1 IAuthTabCallback = ea10.onWarmupCompleted((Class<?>) fby8.class);
    private final Queue<onNavigationEvent> onExtraCallbackWithResult = new ConcurrentLinkedQueue();
    private final Map<onExtraCallbackWithResult, onNavigationEvent> onWarmupCompleted = new ConcurrentHashMap();

    fby8() {
        fby71.onNavigationEvent((Consumer<Selector>) new Consumer() { // from class: org.xbill.DNS.NioTcpClient$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) throws IOException {
                this.f$0.onWarmupCompleted((Selector) obj);
            }
        }, true);
        fby71.IAuthTabCallback(new Runnable() { // from class: org.xbill.DNS.NioTcpClient$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.onTransact();
            }
        }, true);
        fby71.onNavigationEvent(new Runnable() { // from class: org.xbill.DNS.NioTcpClient$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                this.f$0.asBinder();
            }
        }, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onWarmupCompleted(Selector selector) throws IOException {
        while (!this.onExtraCallbackWithResult.isEmpty()) {
            onNavigationEvent onnavigationeventPoll = this.onExtraCallbackWithResult.poll();
            if (onnavigationeventPoll != null) {
                try {
                    if (!onnavigationeventPoll.IAuthTabCallbackStub.isConnected()) {
                        onnavigationeventPoll.IAuthTabCallbackStub.register(selector, 8, onnavigationeventPoll);
                    } else {
                        onnavigationeventPoll.IAuthTabCallbackStub.keyFor(selector).interestOps(4);
                    }
                } catch (IOException e) {
                    onnavigationeventPoll.onExtraCallback(e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTransact() {
        Iterator<onNavigationEvent> it = this.onWarmupCompleted.values().iterator();
        while (it.hasNext()) {
            Iterator<onExtraCallback> it2 = it.next().onExtraCallbackWithResult.iterator();
            while (it2.hasNext()) {
                onExtraCallback next = it2.next();
                if (next.onExtraCallbackWithResult - System.nanoTime() < 0) {
                    next.onExtraCallback.completeExceptionally(new SocketTimeoutException("Query timed out"));
                    it2.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void asBinder() throws IOException {
        this.onExtraCallbackWithResult.clear();
        EOFException eOFException = new EOFException("Client is closing");
        for (onNavigationEvent onnavigationevent : this.onWarmupCompleted.values()) {
            onnavigationevent.onWarmupCompleted(eOFException);
            onnavigationevent.onExtraCallback(eOFException);
        }
        this.onWarmupCompleted.clear();
    }

    static final class onExtraCallback {
        private final onChildViewAdded IAuthTabCallback;
        private final byte[] asBinder;
        private final CompletableFuture<byte[]> onExtraCallback;
        private final long onExtraCallbackWithResult;
        private final SocketChannel onNavigationEvent;
        private ByteBuffer onTransact;
        long onWarmupCompleted = 0;

        public onExtraCallback(onChildViewAdded onchildviewadded, byte[] bArr, long j, SocketChannel socketChannel, CompletableFuture<byte[]> completableFuture) {
            this.IAuthTabCallback = onchildviewadded;
            this.asBinder = bArr;
            this.onExtraCallbackWithResult = j;
            this.onNavigationEvent = socketChannel;
            this.onExtraCallback = completableFuture;
        }

        boolean onWarmupCompleted() throws IOException {
            long j = this.onWarmupCompleted;
            byte[] bArr = this.asBinder;
            if (j == bArr.length + 2) {
                return true;
            }
            if (this.onTransact == null) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 2);
                this.onTransact = byteBufferAllocate;
                byteBufferAllocate.put((byte) (this.asBinder.length >>> 8));
                this.onTransact.put((byte) this.asBinder.length);
                this.onTransact.put(this.asBinder);
                this.onTransact.flip();
            }
            fby71.onNavigationEvent("TCP write: transaction id=" + this.IAuthTabCallback.IAuthTabCallback().onNavigationEvent(), this.onNavigationEvent.socket().getLocalSocketAddress(), this.onNavigationEvent.socket().getRemoteSocketAddress(), this.onTransact);
            while (this.onTransact.hasRemaining()) {
                long jWrite = this.onNavigationEvent.write(this.onTransact);
                long j2 = this.onWarmupCompleted + jWrite;
                this.onWarmupCompleted = j2;
                if (jWrite == 0) {
                    AppSetIdAndScope1 unused = fby8.IAuthTabCallback;
                    this.IAuthTabCallback.IAuthTabCallback().onNavigationEvent();
                    return false;
                }
                if (j2 < this.asBinder.length) {
                    AppSetIdAndScope1 unused2 = fby8.IAuthTabCallback;
                    new Object[]{Long.valueOf(this.onWarmupCompleted), Integer.valueOf(this.asBinder.length), Integer.valueOf(this.IAuthTabCallback.IAuthTabCallback().onNavigationEvent())};
                }
            }
            AppSetIdAndScope1 unused3 = fby8.IAuthTabCallback;
            this.IAuthTabCallback.IAuthTabCallback().onNavigationEvent();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public class onNavigationEvent implements fby71.onNavigationEvent {
        private final SocketChannel IAuthTabCallbackStub;
        final Queue<onExtraCallback> onExtraCallbackWithResult = new ConcurrentLinkedQueue();
        ByteBuffer onNavigationEvent = ByteBuffer.allocate(2);
        ByteBuffer IAuthTabCallback = ByteBuffer.allocate(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        int onExtraCallback = 0;

        public onNavigationEvent(SocketChannel socketChannel) {
            this.IAuthTabCallbackStub = socketChannel;
        }

        @Override // o.fby71.onNavigationEvent
        public void onExtraCallback(SelectionKey selectionKey) throws IOException {
            if (selectionKey.isValid()) {
                if (selectionKey.isConnectable()) {
                    onNavigationEvent(selectionKey);
                    return;
                }
                if (selectionKey.isWritable()) {
                    IAuthTabCallback(selectionKey);
                }
                if (selectionKey.isReadable()) {
                    onExtraCallbackWithResult(selectionKey);
                    return;
                }
                return;
            }
            onWarmupCompleted(new EOFException("Invalid key"));
        }

        void onWarmupCompleted(IOException iOException) {
            Iterator<onExtraCallback> it = this.onExtraCallbackWithResult.iterator();
            while (it.hasNext()) {
                it.next().onExtraCallback.completeExceptionally(iOException);
                it.remove();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onExtraCallback(IOException iOException) throws IOException {
            onWarmupCompleted(iOException);
            for (Map.Entry entry : fby8.this.onWarmupCompleted.entrySet()) {
                if (entry.getValue() == this) {
                    fby8.this.onWarmupCompleted.remove(entry.getKey());
                    try {
                        this.IAuthTabCallbackStub.close();
                        return;
                    } catch (IOException e) {
                        AppSetIdAndScope1 unused = fby8.IAuthTabCallback;
                        new Object[]{((onExtraCallbackWithResult) entry.getKey()).IAuthTabCallback, ((onExtraCallbackWithResult) entry.getKey()).onExtraCallback, e};
                        return;
                    }
                }
            }
        }

        private void onNavigationEvent(SelectionKey selectionKey) throws IOException {
            try {
                this.IAuthTabCallbackStub.finishConnect();
                selectionKey.interestOps(4);
            } catch (IOException e) {
                onExtraCallback(e);
                selectionKey.cancel();
            }
        }

        private void onExtraCallbackWithResult(SelectionKey selectionKey) throws IOException {
            try {
                if (this.onExtraCallback == 0) {
                    if (this.IAuthTabCallbackStub.read(this.onNavigationEvent) < 0) {
                        onExtraCallback(new EOFException());
                        selectionKey.cancel();
                        return;
                    } else if (this.onNavigationEvent.position() == 2) {
                        byte b = this.onNavigationEvent.get(0);
                        byte b2 = this.onNavigationEvent.get(1);
                        this.onNavigationEvent.flip();
                        this.IAuthTabCallback.limit(((b & 255) << 8) + (b2 & 255));
                        this.onExtraCallback = 1;
                    }
                }
                if (this.IAuthTabCallbackStub.read(this.IAuthTabCallback) < 0) {
                    onExtraCallback(new EOFException());
                    selectionKey.cancel();
                    return;
                }
                if (this.IAuthTabCallback.hasRemaining()) {
                    return;
                }
                this.onExtraCallback = 0;
                this.IAuthTabCallback.flip();
                int iLimit = this.IAuthTabCallback.limit();
                byte[] bArr = new byte[iLimit];
                System.arraycopy(this.IAuthTabCallback.array(), this.IAuthTabCallback.arrayOffset(), bArr, 0, this.IAuthTabCallback.limit());
                if (iLimit < 2) {
                    fby71.onExtraCallback("TCP read: response too short for a valid reply, discarding", this.IAuthTabCallbackStub.socket().getLocalSocketAddress(), this.IAuthTabCallbackStub.socket().getRemoteSocketAddress(), bArr);
                    return;
                }
                int i = ((bArr[0] & 255) << 8) + (bArr[1] & 255);
                fby71.onExtraCallback("TCP read: transaction id=" + i, this.IAuthTabCallbackStub.socket().getLocalSocketAddress(), this.IAuthTabCallbackStub.socket().getRemoteSocketAddress(), bArr);
                Iterator<onExtraCallback> it = this.onExtraCallbackWithResult.iterator();
                while (it.hasNext()) {
                    onExtraCallback next = it.next();
                    if (i == next.IAuthTabCallback.IAuthTabCallback().onNavigationEvent()) {
                        next.onExtraCallback.complete(bArr);
                        it.remove();
                        return;
                    }
                }
                AppSetIdAndScope1 unused = fby8.IAuthTabCallback;
            } catch (IOException e) {
                onExtraCallback(e);
                selectionKey.cancel();
            }
        }

        private void IAuthTabCallback(SelectionKey selectionKey) {
            Iterator<onExtraCallback> it = this.onExtraCallbackWithResult.iterator();
            while (it.hasNext()) {
                onExtraCallback next = it.next();
                try {
                } catch (IOException e) {
                    next.onExtraCallback.completeExceptionally(e);
                    it.remove();
                    selectionKey.cancel();
                }
                if (!next.onWarmupCompleted()) {
                    selectionKey.interestOps(4);
                    return;
                }
                continue;
            }
            selectionKey.interestOps(1);
        }
    }

    public static class onExtraCallbackWithResult {
        final InetSocketAddress IAuthTabCallback;
        final InetSocketAddress onExtraCallback;

        public onExtraCallbackWithResult(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
            this.IAuthTabCallback = inetSocketAddress;
            this.onExtraCallback = inetSocketAddress2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!onextracallbackwithresult.onExtraCallbackWithResult(this)) {
                return false;
            }
            InetSocketAddress inetSocketAddress = this.IAuthTabCallback;
            InetSocketAddress inetSocketAddress2 = onextracallbackwithresult.IAuthTabCallback;
            if (inetSocketAddress != null ? !inetSocketAddress.equals(inetSocketAddress2) : inetSocketAddress2 != null) {
                return false;
            }
            InetSocketAddress inetSocketAddress3 = this.onExtraCallback;
            InetSocketAddress inetSocketAddress4 = onextracallbackwithresult.onExtraCallback;
            return inetSocketAddress3 != null ? inetSocketAddress3.equals(inetSocketAddress4) : inetSocketAddress4 == null;
        }

        public int hashCode() {
            InetSocketAddress inetSocketAddress = this.IAuthTabCallback;
            int iHashCode = inetSocketAddress == null ? 43 : inetSocketAddress.hashCode();
            InetSocketAddress inetSocketAddress2 = this.onExtraCallback;
            return ((iHashCode + 59) * 59) + (inetSocketAddress2 != null ? inetSocketAddress2.hashCode() : 43);
        }

        protected boolean onExtraCallbackWithResult(Object obj) {
            return obj instanceof onExtraCallbackWithResult;
        }
    }

    @Override // o.TRANS_V2_ExportCert
    public CompletableFuture<byte[]> onWarmupCompleted(final InetSocketAddress inetSocketAddress, final InetSocketAddress inetSocketAddress2, onChildViewAdded onchildviewadded, byte[] bArr, Duration duration) {
        final CompletableFuture<byte[]> completableFuture = new CompletableFuture<>();
        try {
            Selector selectorIAuthTabCallback = fby71.IAuthTabCallback();
            long jNanoTime = System.nanoTime();
            long nanos = duration.toNanos();
            onNavigationEvent onnavigationeventComputeIfAbsent = this.onWarmupCompleted.computeIfAbsent(new onExtraCallbackWithResult(inetSocketAddress, inetSocketAddress2), new Function() { // from class: org.xbill.DNS.NioTcpClient$$ExternalSyntheticLambda3
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return fby8.onWarmupCompleted(this.f$0, inetSocketAddress, inetSocketAddress2, completableFuture, (fby8.onExtraCallbackWithResult) obj);
                }
            });
            if (onnavigationeventComputeIfAbsent != null) {
                int iOnNavigationEvent = onchildviewadded.IAuthTabCallback().onNavigationEvent();
                onchildviewadded.onNavigationEvent().access000();
                lt54.onNavigationEvent(onchildviewadded.onNavigationEvent().extraCallback());
                Integer.valueOf(iOnNavigationEvent);
                onnavigationeventComputeIfAbsent.onExtraCallbackWithResult.add(new onExtraCallback(onchildviewadded, bArr, jNanoTime + nanos, onnavigationeventComputeIfAbsent.IAuthTabCallbackStub, completableFuture));
                this.onExtraCallbackWithResult.add(onnavigationeventComputeIfAbsent);
                selectorIAuthTabCallback.wakeup();
            }
            return completableFuture;
        } catch (IOException e) {
            completableFuture.completeExceptionally(e);
            return completableFuture;
        }
    }

    public static /* synthetic */ onNavigationEvent onWarmupCompleted(fby8 fby8Var, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, CompletableFuture completableFuture, onExtraCallbackWithResult onextracallbackwithresult) throws IOException {
        SocketChannel socketChannelOpen;
        try {
            socketChannelOpen = SocketChannel.open();
        } catch (IOException e) {
            e = e;
            socketChannelOpen = null;
        }
        try {
            socketChannelOpen.configureBlocking(false);
            if (inetSocketAddress != null) {
                socketChannelOpen.bind((SocketAddress) inetSocketAddress);
            }
            socketChannelOpen.connect(inetSocketAddress2);
            return fby8Var.new onNavigationEvent(socketChannelOpen);
        } catch (IOException e2) {
            e = e2;
            if (socketChannelOpen != null) {
                try {
                    socketChannelOpen.close();
                } catch (IOException unused) {
                }
            }
            completableFuture.completeExceptionally(e);
            return null;
        }
    }
}
