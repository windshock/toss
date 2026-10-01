package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTHistoryActivity5;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Response implements Closeable {
    private final ResponseBody body;
    private final Response cacheResponse;
    private final int code;
    private final Exchange exchange;
    private final Handshake handshake;
    private final Headers headers;
    private final boolean isRedirect;
    private final boolean isSuccessful;
    private CacheControl lazyCacheControl;
    private final String message;
    private final Response networkResponse;
    private final Response priorResponse;
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    private final Request request;
    private final long sentRequestAtMillis;
    private final TTHistoryActivity5 socket;
    private TrailersSource trailersSource;

    public final String header(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return header$default(this, str, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response(@NotNull Request request, @NotNull Protocol protocol, @NotNull String str, int i, @Nullable Handshake handshake, @NotNull Headers headers, @NotNull ResponseBody responseBody, @Nullable TTHistoryActivity5 tTHistoryActivity5, @Nullable Response response, @Nullable Response response2, @Nullable Response response3, long j, long j2, @Nullable Exchange exchange, @NotNull TrailersSource trailersSource) {
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(protocol, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(headers, "");
        Intrinsics.checkNotNullParameter(responseBody, "");
        Intrinsics.checkNotNullParameter(trailersSource, "");
        this.request = request;
        this.protocol = protocol;
        this.message = str;
        this.code = i;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.socket = tTHistoryActivity5;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j;
        this.receivedResponseAtMillis = j2;
        this.exchange = exchange;
        this.trailersSource = trailersSource;
        boolean z = false;
        this.isSuccessful = 200 <= i && i < 300;
        if (i == 307 || i == 308) {
            z = true;
        } else {
            switch (i) {
            }
        }
        this.isRedirect = z;
    }

    public final Request request() {
        return this.request;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final String message() {
        return this.message;
    }

    public final int code() {
        return this.code;
    }

    public final Handshake handshake() {
        return this.handshake;
    }

    public final Headers headers() {
        return this.headers;
    }

    public final ResponseBody body() {
        return this.body;
    }

    public final TTHistoryActivity5 socket() {
        return this.socket;
    }

    public final Response networkResponse() {
        return this.networkResponse;
    }

    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    public final Response priorResponse() {
        return this.priorResponse;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public final Exchange exchange() {
        return this.exchange;
    }

    public final CacheControl getLazyCacheControl$okhttp() {
        return this.lazyCacheControl;
    }

    public final void setLazyCacheControl$okhttp(@Nullable CacheControl cacheControl) {
        this.lazyCacheControl = cacheControl;
    }

    @Deprecated
    /* renamed from: -deprecated_request, reason: not valid java name */
    public final Request m299deprecated_request() {
        return this.request;
    }

    @Deprecated
    /* renamed from: -deprecated_protocol, reason: not valid java name */
    public final Protocol m297deprecated_protocol() {
        return this.protocol;
    }

    @Deprecated
    /* renamed from: -deprecated_code, reason: not valid java name */
    public final int m291deprecated_code() {
        return this.code;
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    @Deprecated
    /* renamed from: -deprecated_message, reason: not valid java name */
    public final String m294deprecated_message() {
        return this.message;
    }

    @Deprecated
    /* renamed from: -deprecated_handshake, reason: not valid java name */
    public final Handshake m292deprecated_handshake() {
        return this.handshake;
    }

    public final List<String> headers(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.headers.values(str);
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    public final String header(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        String str3 = this.headers.get(str);
        return str3 == null ? str2 : str3;
    }

    @Deprecated
    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m293deprecated_headers() {
        return this.headers;
    }

    public final Headers trailers() throws IOException {
        return this.trailersSource.get();
    }

    public final Headers peekTrailers() throws IOException {
        return this.trailersSource.peek();
    }

    public final ResponseBody peekBody(long j) throws IOException {
        TTAppOpenAdTransActivity interfaceDescriptor = this.body.source().getInterfaceDescriptor();
        TTBaseActivity tTBaseActivity = new TTBaseActivity();
        interfaceDescriptor.asBinder(j);
        tTBaseActivity.onExtraCallbackWithResult(interfaceDescriptor, Math.min(j, interfaceDescriptor.access100().ICustomTabsCallbackDefault()));
        return ResponseBody.Companion.create(tTBaseActivity, this.body.contentType(), tTBaseActivity.ICustomTabsCallbackDefault());
    }

    @Deprecated
    /* renamed from: -deprecated_body, reason: not valid java name */
    public final ResponseBody m288deprecated_body() {
        return this.body;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final boolean isRedirect() {
        return this.isRedirect;
    }

    @Deprecated
    /* renamed from: -deprecated_networkResponse, reason: not valid java name */
    public final Response m295deprecated_networkResponse() {
        return this.networkResponse;
    }

    @Deprecated
    /* renamed from: -deprecated_cacheResponse, reason: not valid java name */
    public final Response m290deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    @Deprecated
    /* renamed from: -deprecated_priorResponse, reason: not valid java name */
    public final Response m296deprecated_priorResponse() {
        return this.priorResponse;
    }

    public final List<Challenge> challenges() {
        String str;
        Headers headers = this.headers;
        int i = this.code;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i == 407) {
            str = "Proxy-Authenticate";
        } else {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return HttpHeaders.parseChallenges(headers, str);
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.Companion.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    @Deprecated
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m289deprecated_cacheControl() {
        return cacheControl();
    }

    @Deprecated
    /* renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name */
    public final long m300deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @Deprecated
    /* renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name */
    public final long m298deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.body.close();
    }

    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    public static class Builder {
        private ResponseBody body;
        private Response cacheResponse;
        private int code;
        private Exchange exchange;
        private Handshake handshake;
        private Headers.Builder headers;
        private String message;
        private Response networkResponse;
        private Response priorResponse;
        private Protocol protocol;
        private long receivedResponseAtMillis;
        private Request request;
        private long sentRequestAtMillis;
        private TTHistoryActivity5 socket;
        private TrailersSource trailersSource;

        public final Request getRequest$okhttp() {
            return this.request;
        }

        public final void setRequest$okhttp(@Nullable Request request) {
            this.request = request;
        }

        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        public final void setProtocol$okhttp(@Nullable Protocol protocol) {
            this.protocol = protocol;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        public final void setCode$okhttp(int i) {
            this.code = i;
        }

        public final String getMessage$okhttp() {
            return this.message;
        }

        public final void setMessage$okhttp(@Nullable String str) {
            this.message = str;
        }

        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        public final void setHandshake$okhttp(@Nullable Handshake handshake) {
            this.handshake = handshake;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final void setHeaders$okhttp(@NotNull Headers.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "");
            this.headers = builder;
        }

        public final ResponseBody getBody$okhttp() {
            return this.body;
        }

        public final void setBody$okhttp(@NotNull ResponseBody responseBody) {
            Intrinsics.checkNotNullParameter(responseBody, "");
            this.body = responseBody;
        }

        public final TTHistoryActivity5 getSocket$okhttp() {
            return this.socket;
        }

        public final void setSocket$okhttp(@Nullable TTHistoryActivity5 tTHistoryActivity5) {
            this.socket = tTHistoryActivity5;
        }

        public final Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        public final void setNetworkResponse$okhttp(@Nullable Response response) {
            this.networkResponse = response;
        }

        public final Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final void setCacheResponse$okhttp(@Nullable Response response) {
            this.cacheResponse = response;
        }

        public final Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        public final void setPriorResponse$okhttp(@Nullable Response response) {
            this.priorResponse = response;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        public final void setSentRequestAtMillis$okhttp(long j) {
            this.sentRequestAtMillis = j;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j) {
            this.receivedResponseAtMillis = j;
        }

        public final Exchange getExchange$okhttp() {
            return this.exchange;
        }

        public final void setExchange$okhttp(@Nullable Exchange exchange) {
            this.exchange = exchange;
        }

        public final TrailersSource getTrailersSource$okhttp() {
            return this.trailersSource;
        }

        public final void setTrailersSource$okhttp(@NotNull TrailersSource trailersSource) {
            Intrinsics.checkNotNullParameter(trailersSource, "");
            this.trailersSource = trailersSource;
        }

        public Builder() {
            this.code = -1;
            this.body = ResponseBody.EMPTY;
            this.trailersSource = TrailersSource.EMPTY;
            this.headers = new Headers.Builder();
        }

        public Builder(@NotNull Response response) {
            Intrinsics.checkNotNullParameter(response, "");
            this.code = -1;
            this.body = ResponseBody.EMPTY;
            this.trailersSource = TrailersSource.EMPTY;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.socket = response.socket();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.exchange();
            this.trailersSource = response.trailersSource;
        }

        public Builder request(@NotNull Request request) {
            Intrinsics.checkNotNullParameter(request, "");
            this.request = request;
            return this;
        }

        public Builder protocol(@NotNull Protocol protocol) {
            Intrinsics.checkNotNullParameter(protocol, "");
            this.protocol = protocol;
            return this;
        }

        public Builder code(int i) {
            this.code = i;
            return this;
        }

        public Builder message(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            return this;
        }

        public Builder handshake(@Nullable Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        public Builder header(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.headers.set(str, str2);
            return this;
        }

        public Builder addHeader(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.headers.add(str, str2);
            return this;
        }

        public Builder removeHeader(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.headers.removeAll(str);
            return this;
        }

        public Builder headers(@NotNull Headers headers) {
            Intrinsics.checkNotNullParameter(headers, "");
            this.headers = headers.newBuilder();
            return this;
        }

        public Builder body(@NotNull ResponseBody responseBody) {
            Intrinsics.checkNotNullParameter(responseBody, "");
            this.body = responseBody;
            return this;
        }

        public Builder socket(@NotNull TTHistoryActivity5 tTHistoryActivity5) {
            Intrinsics.checkNotNullParameter(tTHistoryActivity5, "");
            this.socket = tTHistoryActivity5;
            return this;
        }

        public Builder networkResponse(@Nullable Response response) {
            checkSupportResponse("networkResponse", response);
            this.networkResponse = response;
            return this;
        }

        public Builder cacheResponse(@Nullable Response response) {
            checkSupportResponse("cacheResponse", response);
            this.cacheResponse = response;
            return this;
        }

        private final void checkSupportResponse(String str, Response response) {
            if (response != null) {
                if (response.networkResponse() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (response.cacheResponse() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (response.priorResponse() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        public Builder priorResponse(@Nullable Response response) {
            this.priorResponse = response;
            return this;
        }

        public Builder trailers(@NotNull TrailersSource trailersSource) {
            Intrinsics.checkNotNullParameter(trailersSource, "");
            this.trailersSource = trailersSource;
            return this;
        }

        public Builder sentRequestAtMillis(long j) {
            this.sentRequestAtMillis = j;
            return this;
        }

        public Builder receivedResponseAtMillis(long j) {
            this.receivedResponseAtMillis = j;
            return this;
        }

        public final void initExchange$okhttp(@NotNull Exchange exchange) {
            Intrinsics.checkNotNullParameter(exchange, "");
            this.exchange = exchange;
        }

        public Response build() {
            int i = this.code;
            if (i < 0) {
                throw new IllegalStateException(("code < 0: " + this.code).toString());
            }
            Request request = this.request;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.protocol;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.message;
            if (str != null) {
                return new Response(request, protocol, str, i, this.handshake, this.headers.build(), this.body, this.socket, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange, this.trailersSource);
            }
            throw new IllegalStateException("message == null");
        }
    }
}
