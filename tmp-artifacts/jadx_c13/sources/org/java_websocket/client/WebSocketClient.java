package org.java_websocket.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import o.dw;
import o.fdq;
import o.fh;
import o.fiz;
import o.ghr;
import o.gxx;
import o.hz;
import o.kfb;
import o.ko;
import o.ln;
import okhttp3.internal.url._UrlKt;
import org.java_websocket.AbstractWebSocket;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class WebSocketClient extends AbstractWebSocket implements Runnable, dw {
    private fiz IAuthTabCallback;
    private OutputStream IAuthTabCallbackDefault;
    private Map<String, String> IAuthTabCallbackStub;
    private Thread access100;
    private fh asBinder;
    private Proxy asInterface;
    private int onExtraCallback;
    private CountDownLatch onExtraCallbackWithResult;
    protected URI onNavigationEvent;
    private Socket onTransact;
    private CountDownLatch onWarmupCompleted;

    public abstract void onClose(int i, String str, boolean z);

    public void onCloseInitiated(int i, String str) {
    }

    public void onClosing(int i, String str, boolean z) {
    }

    public abstract void onError(Exception exc);

    @Deprecated
    public void onFragment(hz hzVar) {
    }

    public abstract void onMessage(String str);

    public void onMessage(ByteBuffer byteBuffer) {
    }

    public abstract void onOpen(ln lnVar);

    @Override // o.eu
    public final void onWriteDemand(dw dwVar) {
    }

    public WebSocketClient(URI uri) {
        this(uri, new fdq());
    }

    public WebSocketClient(URI uri, fiz fizVar) {
        this(uri, fizVar, null, 0);
    }

    public WebSocketClient(URI uri, fiz fizVar, Map<String, String> map, int i) {
        this.onNavigationEvent = null;
        this.asBinder = null;
        this.onTransact = null;
        this.asInterface = Proxy.NO_PROXY;
        this.onWarmupCompleted = new CountDownLatch(1);
        this.onExtraCallbackWithResult = new CountDownLatch(1);
        this.onExtraCallback = 0;
        if (uri == null) {
            throw new IllegalArgumentException();
        }
        if (fizVar == null) {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
        this.onNavigationEvent = uri;
        this.IAuthTabCallback = fizVar;
        this.IAuthTabCallbackStub = map;
        this.onExtraCallback = i;
        setTcpNoDelay(false);
        setReuseAddr(false);
        this.asBinder = new fh(this, fizVar);
    }

    public URI getURI() {
        return this.onNavigationEvent;
    }

    public fiz getDraft() {
        return this.IAuthTabCallback;
    }

    public Socket getSocket() {
        return this.onTransact;
    }

    public void connect() {
        if (this.access100 != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
        Thread thread = new Thread(this);
        this.access100 = thread;
        thread.start();
    }

    public boolean connectBlocking() throws InterruptedException {
        connect();
        this.onWarmupCompleted.await();
        return this.asBinder.getInterfaceDescriptor();
    }

    public void close() {
        if (this.access100 != null) {
            this.asBinder.onNavigationEvent(1000);
        }
    }

    public void closeBlocking() throws InterruptedException {
        close();
        this.onExtraCallbackWithResult.await();
    }

    public void send(String str) throws NotYetConnectedException, gxx {
        this.asBinder.IAuthTabCallback(str);
    }

    public void send(byte[] bArr) throws NotYetConnectedException, gxx, IllegalArgumentException {
        this.asBinder.IAuthTabCallback(bArr);
    }

    @Override // org.java_websocket.AbstractWebSocket
    public Collection<dw> connections() {
        return Collections.singletonList(this.asBinder);
    }

    public void sendPing() throws NotYetConnectedException {
        this.asBinder.IAuthTabCallbackStubProxy();
    }

    @Override // java.lang.Runnable
    public void run() throws NoSuchAlgorithmException, IOException, KeyManagementException {
        boolean z;
        int i;
        try {
            Socket socket = this.onTransact;
            if (socket == null) {
                this.onTransact = new Socket(this.asInterface);
                z = true;
            } else {
                if (socket.isClosed()) {
                    throw new IOException();
                }
                z = false;
            }
            this.onTransact.setTcpNoDelay(isTcpNoDelay());
            this.onTransact.setReuseAddress(isReuseAddr());
            if (!this.onTransact.isBound()) {
                this.onTransact.connect(new InetSocketAddress(this.onNavigationEvent.getHost(), getPort()), this.onExtraCallback);
            }
            if (z && "wss".equals(this.onNavigationEvent.getScheme())) {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, null);
                this.onTransact = sSLContext.getSocketFactory().createSocket(this.onTransact, this.onNavigationEvent.getHost(), getPort(), true);
            }
            InputStream inputStream = this.onTransact.getInputStream();
            this.IAuthTabCallbackDefault = this.onTransact.getOutputStream();
            sendHandshake();
            Thread thread = new Thread(new onExtraCallbackWithResult());
            this.access100 = thread;
            thread.start();
            byte[] bArr = new byte[fh.onExtraCallback];
            while (!isClosing() && !isClosed() && (i = inputStream.read(bArr)) != -1) {
                try {
                    this.asBinder.onNavigationEvent(ByteBuffer.wrap(bArr, 0, i));
                } catch (IOException e) {
                    handleIOException(e);
                    return;
                } catch (RuntimeException e2) {
                    onError(e2);
                    this.asBinder.onExtraCallbackWithResult(1006, e2.getMessage());
                    return;
                }
            }
            this.asBinder.onExtraCallback();
        } catch (Exception e3) {
            onWebsocketError(this.asBinder, e3);
            this.asBinder.onExtraCallbackWithResult(-1, e3.getMessage());
        }
    }

    private int getPort() {
        int port = this.onNavigationEvent.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = this.onNavigationEvent.getScheme();
        if ("wss".equals(scheme)) {
            return 443;
        }
        if ("ws".equals(scheme)) {
            return 80;
        }
        throw new IllegalArgumentException("unknown scheme: " + scheme);
    }

    private void sendHandshake() throws ghr, IllegalArgumentException {
        String rawPath = this.onNavigationEvent.getRawPath();
        String rawQuery = this.onNavigationEvent.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            rawPath = rawPath + '?' + rawQuery;
        }
        int port = getPort();
        StringBuilder sb = new StringBuilder();
        sb.append(this.onNavigationEvent.getHost());
        sb.append(port != 80 ? ":" + port : _UrlKt.FRAGMENT_ENCODE_SET);
        String string = sb.toString();
        ko koVar = new ko();
        koVar.onNavigationEvent(rawPath);
        koVar.onExtraCallback("Host", string);
        Map<String, String> map = this.IAuthTabCallbackStub;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                koVar.onExtraCallback(entry.getKey(), entry.getValue());
            }
        }
        this.asBinder.onExtraCallback(koVar);
    }

    public dw.onWarmupCompleted getReadyState() {
        return this.asBinder.onExtraCallbackWithResult();
    }

    @Override // o.eu
    public final void onWebsocketMessage(dw dwVar, String str) {
        onMessage(str);
    }

    @Override // o.eu
    public final void onWebsocketMessage(dw dwVar, ByteBuffer byteBuffer) {
        onMessage(byteBuffer);
    }

    @Override // org.java_websocket.WebSocketAdapter
    public void onWebsocketMessageFragment(dw dwVar, hz hzVar) {
        onFragment(hzVar);
    }

    @Override // o.eu
    public final void onWebsocketOpen(dw dwVar, kfb kfbVar) {
        startConnectionLostTimer();
        onOpen((ln) kfbVar);
        this.onWarmupCompleted.countDown();
    }

    @Override // o.eu
    public final void onWebsocketClose(dw dwVar, int i, String str, boolean z) {
        stopConnectionLostTimer();
        Thread thread = this.access100;
        if (thread != null) {
            thread.interrupt();
        }
        onClose(i, str, z);
        this.onWarmupCompleted.countDown();
        this.onExtraCallbackWithResult.countDown();
    }

    @Override // o.eu
    public final void onWebsocketError(dw dwVar, Exception exc) {
        onError(exc);
    }

    @Override // o.eu
    public void onWebsocketCloseInitiated(dw dwVar, int i, String str) {
        onCloseInitiated(i, str);
    }

    @Override // o.eu
    public void onWebsocketClosing(dw dwVar, int i, String str, boolean z) {
        onClosing(i, str, z);
    }

    public dw getConnection() {
        return this.asBinder;
    }

    @Override // o.eu
    public InetSocketAddress getLocalSocketAddress(dw dwVar) {
        Socket socket = this.onTransact;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    @Override // o.eu
    public InetSocketAddress getRemoteSocketAddress(dw dwVar) {
        Socket socket = this.onTransact;
        if (socket != null) {
            return (InetSocketAddress) socket.getRemoteSocketAddress();
        }
        return null;
    }

    class onExtraCallbackWithResult implements Runnable {
        private onExtraCallbackWithResult() {
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            Thread.currentThread().setName("WebsocketWriteThread");
            while (!Thread.interrupted()) {
                try {
                    try {
                        try {
                            ByteBuffer byteBufferTake = WebSocketClient.this.asBinder.IAuthTabCallbackDefault.take();
                            WebSocketClient.this.IAuthTabCallbackDefault.write(byteBufferTake.array(), 0, byteBufferTake.limit());
                            WebSocketClient.this.IAuthTabCallbackDefault.flush();
                        } catch (InterruptedException unused) {
                            for (ByteBuffer byteBuffer : WebSocketClient.this.asBinder.IAuthTabCallbackDefault) {
                                WebSocketClient.this.IAuthTabCallbackDefault.write(byteBuffer.array(), 0, byteBuffer.limit());
                                WebSocketClient.this.IAuthTabCallbackDefault.flush();
                            }
                        }
                    } catch (IOException e) {
                        WebSocketClient.this.handleIOException(e);
                    }
                } finally {
                    WebSocketClient.this.closeOutputAndSocket();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeOutputAndSocket() throws IOException {
        try {
            Socket socket = this.onTransact;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            onWebsocketError(this, e);
        }
    }

    public void setProxy(Proxy proxy) {
        if (proxy == null) {
            throw new IllegalArgumentException();
        }
        this.asInterface = proxy;
    }

    public void setSocket(Socket socket) {
        if (this.onTransact != null) {
            throw new IllegalStateException("socket has already been set");
        }
        this.onTransact = socket;
    }

    public void sendFragmentedFrame(hz.onWarmupCompleted onwarmupcompleted, ByteBuffer byteBuffer, boolean z) {
        this.asBinder.onWarmupCompleted(onwarmupcompleted, byteBuffer, z);
    }

    public boolean isOpen() {
        return this.asBinder.getInterfaceDescriptor();
    }

    public boolean isFlushAndClose() {
        return this.asBinder.access000();
    }

    public boolean isClosed() {
        return this.asBinder.IAuthTabCallbackDefault();
    }

    public boolean isClosing() {
        return this.asBinder.asInterface();
    }

    public boolean isConnecting() {
        return this.asBinder.access100();
    }

    public boolean hasBufferedData() {
        return this.asBinder.onTransact();
    }

    public void close(int i) {
        this.asBinder.onNavigationEvent();
    }

    public void close(int i, String str) {
        this.asBinder.onWarmupCompleted(i, str);
    }

    public void closeConnection(int i, String str) {
        this.asBinder.onExtraCallbackWithResult(i, str);
    }

    public void send(ByteBuffer byteBuffer) throws NotYetConnectedException, gxx, IllegalArgumentException {
        this.asBinder.onExtraCallbackWithResult(byteBuffer);
    }

    @Override // o.dw
    public void sendFrame(hz hzVar) {
        this.asBinder.sendFrame(hzVar);
    }

    public void sendFrame(Collection<hz> collection) {
        this.asBinder.onNavigationEvent(collection);
    }

    public InetSocketAddress getLocalSocketAddress() {
        return this.asBinder.IAuthTabCallback();
    }

    public InetSocketAddress getRemoteSocketAddress() {
        return this.asBinder.IAuthTabCallbackStub();
    }

    public String getResourceDescriptor() {
        return this.onNavigationEvent.getPath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleIOException(IOException iOException) {
        if (iOException instanceof SSLException) {
            onError(iOException);
        }
        this.asBinder.onExtraCallback();
    }
}
