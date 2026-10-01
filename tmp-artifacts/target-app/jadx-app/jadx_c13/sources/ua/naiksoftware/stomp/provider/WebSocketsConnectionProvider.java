package ua.naiksoftware.stomp.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.URI;
import java.nio.channels.NotYetConnectedException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import javax.net.ssl.SSLContext;
import o.dw;
import o.fdq;
import o.gjv;
import o.gxx;
import o.kdr;
import o.ln;
import org.java_websocket.client.WebSocketClient;
import ua.naiksoftware.stomp.dto.LifecycleEvent;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class WebSocketsConnectionProvider extends AbstractConnectionProvider {
    private static final String TAG = "WebSocketsConnectionProvider";
    private boolean haveConnection;
    private final Map<String, String> mConnectHttpHeaders;
    private TreeMap<String, String> mServerHandshakeHeaders;
    private final String mUri;
    private WebSocketClient mWebSocketClient;

    public WebSocketsConnectionProvider(String str, @Nullable Map<String, String> map) {
        this.mUri = str;
        this.mConnectHttpHeaders = map == null ? new HashMap<>() : map;
    }

    @Override // ua.naiksoftware.stomp.provider.AbstractConnectionProvider
    public void rawDisconnect() {
        try {
            this.mWebSocketClient.closeBlocking();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // ua.naiksoftware.stomp.provider.AbstractConnectionProvider
    protected void createWebSocketConnection() throws NoSuchAlgorithmException, KeyManagementException {
        if (this.haveConnection) {
            throw new IllegalStateException("Already have connection to web socket");
        }
        this.mWebSocketClient = new WebSocketClient(URI.create(this.mUri), new fdq(), this.mConnectHttpHeaders, 0) { // from class: ua.naiksoftware.stomp.provider.WebSocketsConnectionProvider.1
            @Override // org.java_websocket.WebSocketAdapter, o.eu
            public void onWebsocketHandshakeReceivedAsClient(dw dwVar, kdr kdrVar, @NonNull ln lnVar) throws gjv {
                WebSocketsConnectionProvider.this.mServerHandshakeHeaders = new TreeMap();
                Iterator<String> itOnExtraCallbackWithResult = lnVar.onExtraCallbackWithResult();
                while (itOnExtraCallbackWithResult.hasNext()) {
                    String next = itOnExtraCallbackWithResult.next();
                    WebSocketsConnectionProvider.this.mServerHandshakeHeaders.put(next, lnVar.onExtraCallback(next));
                }
            }

            @Override // org.java_websocket.client.WebSocketClient
            public void onOpen(@NonNull ln lnVar) {
                LifecycleEvent lifecycleEvent = new LifecycleEvent(LifecycleEvent.Type.OPENED);
                lifecycleEvent.setHandshakeResponseHeaders(WebSocketsConnectionProvider.this.mServerHandshakeHeaders);
                WebSocketsConnectionProvider.this.emitLifecycleEvent(lifecycleEvent);
            }

            @Override // org.java_websocket.client.WebSocketClient
            public void onMessage(String str) {
                WebSocketsConnectionProvider.this.emitMessage(str);
            }

            @Override // org.java_websocket.client.WebSocketClient
            public void onClose(int i, String str, boolean z) {
                WebSocketsConnectionProvider.this.haveConnection = false;
                WebSocketsConnectionProvider.this.emitLifecycleEvent(new LifecycleEvent(LifecycleEvent.Type.CLOSED));
                WebSocketsConnectionProvider.this.disconnect();
            }

            @Override // org.java_websocket.client.WebSocketClient
            public void onError(Exception exc) {
                WebSocketsConnectionProvider.this.emitLifecycleEvent(new LifecycleEvent(LifecycleEvent.Type.ERROR, exc));
            }
        };
        if (this.mUri.startsWith("wss")) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, null);
                this.mWebSocketClient.setSocket(sSLContext.getSocketFactory().createSocket());
            } catch (Exception unused) {
            }
        }
        this.mWebSocketClient.connect();
        this.haveConnection = true;
    }

    @Override // ua.naiksoftware.stomp.provider.AbstractConnectionProvider
    protected void rawSend(String str) throws NotYetConnectedException, gxx {
        this.mWebSocketClient.send(str);
    }

    @Override // ua.naiksoftware.stomp.provider.AbstractConnectionProvider
    protected Object getSocket() {
        return this.mWebSocketClient;
    }
}
