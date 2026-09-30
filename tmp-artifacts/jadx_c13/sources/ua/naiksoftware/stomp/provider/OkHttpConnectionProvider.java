package ua.naiksoftware.stomp.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import o.TTBaseLandingPageActivity;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.url._UrlKt;
import ua.naiksoftware.stomp.dto.LifecycleEvent;
import ua.naiksoftware.stomp.exception.StompSocketBrokenException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class OkHttpConnectionProvider extends AbstractConnectionProvider {
    public static final String TAG = "OkHttpConnProvider";
    private final Map<String, String> mConnectHttpHeaders;
    private final OkHttpClient mOkHttpClient;
    private final String mUri;
    private WebSocket openSocket;

    public OkHttpConnectionProvider(String str, @Nullable Map<String, String> map, OkHttpClient okHttpClient) {
        this.mUri = str;
        this.mConnectHttpHeaders = map == null ? new HashMap<>() : map;
        this.mOkHttpClient = okHttpClient;
    }

    @Override // ua.naiksoftware.stomp.provider.AbstractConnectionProvider
    public void rawDisconnect() {
        WebSocket webSocket = this.openSocket;
        if (webSocket != null) {
            webSocket.close(1000, _UrlKt.FRAGMENT_ENCODE_SET);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disconnect(int i, String str) {
        WebSocket webSocket = this.openSocket;
        if (webSocket != null) {
            webSocket.close(i, str);
        }
    }

    @Override // ua.naiksoftware.stomp.provider.AbstractConnectionProvider, ua.naiksoftware.stomp.provider.ConnectionProvider
    public void cancel() {
        WebSocket webSocket = this.openSocket;
        if (webSocket != null) {
            webSocket.cancel();
        }
    }

    @Override // ua.naiksoftware.stomp.provider.AbstractConnectionProvider
    protected void createWebSocketConnection() {
        Request.Builder builderUrl = new Request.Builder().url(this.mUri);
        addConnectionHeadersToBuilder(builderUrl, this.mConnectHttpHeaders);
        this.openSocket = this.mOkHttpClient.newWebSocket(builderUrl.build(), new WebSocketListener() { // from class: ua.naiksoftware.stomp.provider.OkHttpConnectionProvider.1
            @Override // okhttp3.WebSocketListener
            public void onOpen(@NonNull WebSocket webSocket, @NonNull Response response) {
                LifecycleEvent lifecycleEvent = new LifecycleEvent(LifecycleEvent.Type.OPENED);
                lifecycleEvent.setHandshakeResponseHeaders(OkHttpConnectionProvider.this.headersAsMap(response));
                OkHttpConnectionProvider.this.emitLifecycleEvent(lifecycleEvent);
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(@NonNull WebSocket webSocket, @NonNull String str) {
                OkHttpConnectionProvider.this.emitMessage(str);
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(@NonNull WebSocket webSocket, @NonNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
                OkHttpConnectionProvider.this.emitMessage(tTBaseLandingPageActivity.IAuthTabCallback_Parcel());
            }

            @Override // okhttp3.WebSocketListener
            public void onClosing(@NonNull WebSocket webSocket, int i, @NonNull String str) {
                OkHttpConnectionProvider.this.emitLifecycleEvent(new LifecycleEvent(LifecycleEvent.Type.CLOSING, new StompSocketBrokenException("Abnormal closing : [" + i + "] " + str)));
                OkHttpConnectionProvider.this.disconnect(i, str);
            }

            @Override // okhttp3.WebSocketListener
            public void onClosed(@NonNull WebSocket webSocket, int i, @NonNull String str) {
                LifecycleEvent lifecycleEvent;
                OkHttpConnectionProvider.this.openSocket = null;
                if (i != 1000) {
                    lifecycleEvent = new LifecycleEvent(LifecycleEvent.Type.ERROR, new StompSocketBrokenException("Abnormal closing : [" + i + "] " + str));
                } else {
                    lifecycleEvent = new LifecycleEvent(LifecycleEvent.Type.CLOSED);
                }
                lifecycleEvent.setCloseInfo(i, str);
                OkHttpConnectionProvider.this.emitLifecycleEvent(lifecycleEvent);
            }

            @Override // okhttp3.WebSocketListener
            public void onFailure(@NonNull WebSocket webSocket, @NonNull Throwable th, Response response) {
                OkHttpConnectionProvider.this.emitLifecycleEvent(new LifecycleEvent(LifecycleEvent.Type.ERROR, th));
                OkHttpConnectionProvider.this.openSocket = null;
            }
        });
    }

    @Override // ua.naiksoftware.stomp.provider.AbstractConnectionProvider
    protected void rawSend(String str) {
        this.openSocket.send(str);
    }

    @Override // ua.naiksoftware.stomp.provider.AbstractConnectionProvider
    protected Object getSocket() {
        return this.openSocket;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TreeMap<String, String> headersAsMap(@NonNull Response response) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        Headers headers = response.headers();
        for (String str : headers.names()) {
            treeMap.put(str, headers.get(str));
        }
        return treeMap;
    }

    private void addConnectionHeadersToBuilder(@NonNull Request.Builder builder, @NonNull Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null && value != null) {
                builder.addHeader(entry.getKey(), entry.getValue());
            }
        }
    }
}
