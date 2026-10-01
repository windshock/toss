package ua.naiksoftware.stomp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import okhttp3.OkHttpClient;
import ua.naiksoftware.stomp.provider.ConnectionProvider;
import ua.naiksoftware.stomp.provider.OkHttpConnectionProvider;
import ua.naiksoftware.stomp.provider.WebSocketsConnectionProvider;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class Stomp {

    public enum ConnectionProviderType {
        OKHTTP,
        JWS
    }

    public static StompClient over(@NonNull ConnectionProviderType connectionProviderType, String str) {
        return over(connectionProviderType, str, null, null);
    }

    public static StompClient over(@NonNull ConnectionProviderType connectionProviderType, String str, Map<String, String> map) {
        return over(connectionProviderType, str, map, null);
    }

    public static StompClient over(@NonNull ConnectionProviderType connectionProviderType, String str, @Nullable Map<String, String> map, @Nullable OkHttpClient okHttpClient) {
        if (connectionProviderType == ConnectionProviderType.JWS) {
            if (okHttpClient != null) {
                throw new IllegalArgumentException("You cannot pass an OkHttpClient when using JWS. Use null instead.");
            }
            return createStompClient(new WebSocketsConnectionProvider(str, map));
        }
        if (connectionProviderType == ConnectionProviderType.OKHTTP) {
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient.Builder().build();
            }
            return createStompClient(new OkHttpConnectionProvider(str, map, okHttpClient));
        }
        throw new IllegalArgumentException("ConnectionProvider type not supported: " + connectionProviderType.toString());
    }

    private static StompClient createStompClient(ConnectionProvider connectionProvider) {
        return new StompClientImpl(connectionProvider);
    }
}
