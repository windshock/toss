package okhttp3.internal.http;

import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RequestLine {
    public static final RequestLine INSTANCE = new RequestLine();

    private RequestLine() {
    }

    public final String get(@NotNull Request request, @NotNull Proxy.Type type) {
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(type, "");
        StringBuilder sb = new StringBuilder();
        sb.append(request.method());
        sb.append(' ');
        RequestLine requestLine = INSTANCE;
        if (requestLine.includeAuthorityInRequestLine(request, type)) {
            sb.append(request.url());
        } else {
            sb.append(requestLine.requestPath(request.url()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    private final boolean includeAuthorityInRequestLine(Request request, Proxy.Type type) {
        return !request.isHttps() && type == Proxy.Type.HTTP;
    }

    public final String requestPath(@NotNull HttpUrl httpUrl) {
        Intrinsics.checkNotNullParameter(httpUrl, "");
        String strEncodedPath = httpUrl.encodedPath();
        String strEncodedQuery = httpUrl.encodedQuery();
        if (strEncodedQuery == null) {
            return strEncodedPath;
        }
        return strEncodedPath + '?' + strEncodedQuery;
    }
}
