package okhttp3.internal.http;

import java.io.IOException;
import o.TTHistoryActivity41;
import o.TTHistoryActivity42;
import o.TTHistoryActivity5;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.connection.RealCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface ExchangeCodec {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    public interface Carrier {
        /* renamed from: cancel */
        void mo308cancel();

        Route getRoute();

        void noNewExchanges();

        void trackFailure(@NotNull RealCall realCall, @Nullable IOException iOException);
    }

    void cancel();

    TTHistoryActivity41 createRequestBody(@NotNull Request request, long j) throws IOException;

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    Carrier getCarrier();

    TTHistoryActivity5 getSocket();

    boolean isResponseComplete();

    TTHistoryActivity42 openResponseBodySource(@NotNull Response response) throws IOException;

    Headers peekTrailers() throws IOException;

    Response.Builder readResponseHeaders(boolean z) throws IOException;

    long reportedContentLength(@NotNull Response response) throws IOException;

    void writeRequestHeaders(@NotNull Request request) throws IOException;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        private Companion() {
        }
    }
}
