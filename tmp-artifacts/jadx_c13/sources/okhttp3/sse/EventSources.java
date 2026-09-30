package okhttp3.sse;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.a1ExternalSyntheticLambda0;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.sse.EventSource;
import okhttp3.sse.internal.RealEventSource;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class EventSources {
    public static final EventSources INSTANCE = new EventSources();

    private EventSources() {
    }

    @Deprecated
    @JvmStatic
    public static final /* synthetic */ EventSource.Factory createFactory(OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        return a1ExternalSyntheticLambda0.onExtraCallbackWithResult(createFactory((Call.Factory) okHttpClient));
    }

    @JvmStatic
    public static final EventSource.Factory createFactory(@NotNull final Call.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "");
        return new EventSource.Factory() { // from class: okhttp3.sse.EventSources$$ExternalSyntheticLambda0
            @Override // okhttp3.sse.EventSource.Factory
            public final EventSource newEventSource(Request request, EventSourceListener eventSourceListener) {
                return EventSources.createFactory$lambda$0(factory, request, eventSourceListener);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventSource createFactory$lambda$0(Call.Factory factory, Request request, EventSourceListener eventSourceListener) {
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(eventSourceListener, "");
        if (request.header("Accept") == null) {
            request = request.newBuilder().addHeader("Accept", "text/event-stream").build();
        }
        RealEventSource realEventSource = new RealEventSource(request, eventSourceListener);
        realEventSource.connect(factory);
        return realEventSource;
    }

    @JvmStatic
    public static final void processResponse(@NotNull Response response, @NotNull EventSourceListener eventSourceListener) throws IOException {
        Intrinsics.checkNotNullParameter(response, "");
        Intrinsics.checkNotNullParameter(eventSourceListener, "");
        new RealEventSource(response.request(), eventSourceListener).processResponse(response);
    }
}
