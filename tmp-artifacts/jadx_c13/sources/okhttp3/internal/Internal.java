package okhttp3.internal;

import java.nio.charset.Charset;
import javax.net.ssl.SSLSocket;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.getWrite;
import okhttp3.Cache;
import okhttp3.CipherSuite;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.ConnectionListener;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealConnection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Internal {
    public static final Cookie parseCookie(long j, @NotNull HttpUrl httpUrl, @NotNull String str) {
        Intrinsics.checkNotNullParameter(httpUrl, "");
        Intrinsics.checkNotNullParameter(str, "");
        return Cookie.Companion.parse$okhttp(j, httpUrl, str);
    }

    public static final String cookieToString(@NotNull Cookie cookie, boolean z) {
        Intrinsics.checkNotNullParameter(cookie, "");
        return cookie.toString$okhttp(z);
    }

    public static final Headers.Builder addHeaderLenient(@NotNull Headers.Builder builder, @NotNull String str) {
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(str, "");
        return builder.addLenient$okhttp(str);
    }

    public static final Headers.Builder addHeaderLenient(@NotNull Headers.Builder builder, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return builder.addLenient$okhttp(str, str2);
    }

    public static final Response cacheGet(@NotNull Cache cache, @NotNull Request request) {
        Intrinsics.checkNotNullParameter(cache, "");
        Intrinsics.checkNotNullParameter(request, "");
        return cache.get$okhttp(request);
    }

    public static final void applyConnectionSpec(@NotNull ConnectionSpec connectionSpec, @NotNull SSLSocket sSLSocket, boolean z) {
        Intrinsics.checkNotNullParameter(connectionSpec, "");
        Intrinsics.checkNotNullParameter(sSLSocket, "");
        connectionSpec.apply$okhttp(sSLSocket, z);
    }

    public static final String[] effectiveCipherSuites(@NotNull ConnectionSpec connectionSpec, @NotNull String[] strArr) {
        Intrinsics.checkNotNullParameter(connectionSpec, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        return connectionSpec.getCipherSuitesAsString$okhttp() != null ? _UtilCommonKt.intersect(connectionSpec.getCipherSuitesAsString$okhttp(), strArr, CipherSuite.Companion.getORDER_BY_NAME$okhttp()) : strArr;
    }

    public static final Pair<Charset, MediaType> chooseCharset(@Nullable MediaType mediaType) {
        Charset charset = Charsets.UTF_8;
        if (mediaType != null) {
            Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
            if (charsetCharset$default == null) {
                mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
            } else {
                charset = charsetCharset$default;
            }
        }
        return getWrite.IAuthTabCallback(charset, mediaType);
    }

    public static final Charset charsetOrUtf8(@Nullable MediaType mediaType) {
        Charset charsetCharset$default;
        return (mediaType == null || (charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null)) == null) ? Charsets.UTF_8 : charsetCharset$default;
    }

    public static final RealConnection getConnection(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "");
        Exchange exchange = response.exchange();
        Intrinsics.checkNotNull(exchange);
        return exchange.getConnection$okhttp();
    }

    public static final OkHttpClient.Builder taskRunnerInternal(@NotNull OkHttpClient.Builder builder, @NotNull TaskRunner taskRunner) {
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(taskRunner, "");
        return builder.taskRunner$okhttp(taskRunner);
    }

    public static final ConnectionPool buildConnectionPool(@NotNull ConnectionListener connectionListener, @NotNull TaskRunner taskRunner) {
        Intrinsics.checkNotNullParameter(connectionListener, "");
        Intrinsics.checkNotNullParameter(taskRunner, "");
        return new ConnectionPool(0, 0L, null, taskRunner, connectionListener, 7, null);
    }
}
