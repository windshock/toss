package okhttp3.logging;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class LoggingEventListener extends EventListener {
    public static final Companion Companion = new Companion(null);
    private final HttpLoggingInterceptor.Logger logger;
    private long startNs;

    public /* synthetic */ LoggingEventListener(HttpLoggingInterceptor.Logger logger, DefaultConstructorMarker defaultConstructorMarker) {
        this(logger);
    }

    private LoggingEventListener(HttpLoggingInterceptor.Logger logger) {
        this.logger = logger;
    }

    public void callStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        this.startNs = System.nanoTime();
        logWithTime("callStart: " + call.request());
    }

    public void dispatcherQueueStart(@NotNull Call call, @NotNull Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(dispatcher, BuildConfig.FLAVOR);
        logWithTime("dispatcherQueueStart: " + call + " queuedCallsCount=" + dispatcher.queuedCallsCount());
    }

    public void dispatcherQueueEnd(@NotNull Call call, @NotNull Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(dispatcher, BuildConfig.FLAVOR);
        logWithTime("dispatcherQueueEnd: " + call + " queuedCallsCount=" + dispatcher.queuedCallsCount());
    }

    public void proxySelectStart(@NotNull Call call, @NotNull HttpUrl httpUrl) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(httpUrl, BuildConfig.FLAVOR);
        logWithTime("proxySelectStart: " + httpUrl);
    }

    public void proxySelectEnd(@NotNull Call call, @NotNull HttpUrl httpUrl, @NotNull List<? extends Proxy> list) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(httpUrl, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        logWithTime("proxySelectEnd: " + list);
    }

    public void dnsStart(@NotNull Call call, @NotNull String str) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        logWithTime("dnsStart: " + str);
    }

    public void dnsEnd(@NotNull Call call, @NotNull String str, @NotNull List<? extends InetAddress> list) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        logWithTime("dnsEnd: " + list);
    }

    public void connectStart(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(inetSocketAddress, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(proxy, BuildConfig.FLAVOR);
        logWithTime("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    public void secureConnectStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        logWithTime("secureConnectStart");
    }

    public void secureConnectEnd(@NotNull Call call, @Nullable Handshake handshake) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        logWithTime("secureConnectEnd: " + handshake);
    }

    public void connectEnd(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(inetSocketAddress, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(proxy, BuildConfig.FLAVOR);
        logWithTime("connectEnd: " + protocol);
    }

    public void connectFailed(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException iOException) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(inetSocketAddress, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(proxy, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(iOException, BuildConfig.FLAVOR);
        logWithTime("connectFailed: " + protocol + ' ' + iOException);
    }

    public void connectionAcquired(@NotNull Call call, @NotNull Connection connection) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(connection, BuildConfig.FLAVOR);
        logWithTime("connectionAcquired: " + connection);
    }

    public void connectionReleased(@NotNull Call call, @NotNull Connection connection) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(connection, BuildConfig.FLAVOR);
        logWithTime("connectionReleased");
    }

    public void requestHeadersStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        logWithTime("requestHeadersStart");
    }

    public void requestHeadersEnd(@NotNull Call call, @NotNull Request request) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(request, BuildConfig.FLAVOR);
        logWithTime("requestHeadersEnd");
    }

    public void requestBodyStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        logWithTime("requestBodyStart");
    }

    public void requestBodyEnd(@NotNull Call call, long j) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        logWithTime("requestBodyEnd: byteCount=" + j);
    }

    public void requestFailed(@NotNull Call call, @NotNull IOException iOException) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(iOException, BuildConfig.FLAVOR);
        logWithTime("requestFailed: " + iOException);
    }

    public void responseHeadersStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        logWithTime("responseHeadersStart");
    }

    public void responseHeadersEnd(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(response, BuildConfig.FLAVOR);
        logWithTime("responseHeadersEnd: " + response);
    }

    public void responseBodyStart(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        logWithTime("responseBodyStart");
    }

    public void responseBodyEnd(@NotNull Call call, long j) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        logWithTime("responseBodyEnd: byteCount=" + j);
    }

    public void responseFailed(@NotNull Call call, @NotNull IOException iOException) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(iOException, BuildConfig.FLAVOR);
        logWithTime("responseFailed: " + iOException);
    }

    public void callEnd(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        logWithTime("callEnd");
    }

    public void callFailed(@NotNull Call call, @NotNull IOException iOException) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(iOException, BuildConfig.FLAVOR);
        logWithTime("callFailed: " + iOException);
    }

    public void canceled(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        logWithTime("canceled");
    }

    public void satisfactionFailure(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(response, BuildConfig.FLAVOR);
        logWithTime("satisfactionFailure: " + response);
    }

    public void cacheHit(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(response, BuildConfig.FLAVOR);
        logWithTime("cacheHit: " + response);
    }

    public void cacheMiss(@NotNull Call call) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        logWithTime("cacheMiss");
    }

    public void cacheConditionalHit(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(response, BuildConfig.FLAVOR);
        logWithTime("cacheConditionalHit: " + response);
    }

    private final void logWithTime(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startNs);
        this.logger.log('[' + millis + " ms] " + str);
    }

    public static class Factory implements EventListener.Factory {
        private final HttpLoggingInterceptor.Logger logger;

        /* JADX WARN: Illegal instructions before constructor call */
        public Factory() {
            HttpLoggingInterceptor.Logger logger = null;
            this(logger, 1, logger);
        }

        public Factory(@NotNull HttpLoggingInterceptor.Logger logger) {
            Intrinsics.checkNotNullParameter(logger, BuildConfig.FLAVOR);
            this.logger = logger;
        }

        public /* synthetic */ Factory(HttpLoggingInterceptor.Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? HttpLoggingInterceptor.Logger.DEFAULT : logger);
        }

        public EventListener create(@NotNull Call call) {
            Intrinsics.checkNotNullParameter(call, BuildConfig.FLAVOR);
            return new LoggingEventListener(this.logger, null);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
