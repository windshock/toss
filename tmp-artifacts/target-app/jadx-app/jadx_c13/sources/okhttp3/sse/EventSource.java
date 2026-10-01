package okhttp3.sse;

import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface EventSource {

    public interface Factory {
        EventSource newEventSource(@NotNull Request request, @NotNull EventSourceListener eventSourceListener);
    }

    void cancel();

    Request request();
}
