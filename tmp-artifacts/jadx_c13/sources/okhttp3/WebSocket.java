package okhttp3;

import o.TTBaseLandingPageActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface WebSocket {

    public interface Factory {
        WebSocket newWebSocket(@NotNull Request request, @NotNull WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i, @Nullable String str);

    long queueSize();

    Request request();

    boolean send(@NotNull String str);

    boolean send(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity);
}
