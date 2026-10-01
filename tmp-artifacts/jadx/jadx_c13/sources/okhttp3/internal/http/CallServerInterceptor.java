package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import o.TTAppOpenAdActivity9;
import o.TTAppOpenAdTransActivity;
import o.TTCeilingLandingPageActivity5;
import o.setExecute;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.TrailersSource;
import okhttp3.internal.UnreadableResponseBody;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class CallServerInterceptor implements Interceptor {
    public static final CallServerInterceptor INSTANCE = new CallServerInterceptor();

    private final boolean shouldIgnoreAndWaitForRealResponse(int i) {
        if (i == 100) {
            return true;
        }
        return 102 <= i && i < 200;
    }

    private CallServerInterceptor() {
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd A[Catch: IOException -> 0x0201, TryCatch #2 {IOException -> 0x0201, blocks: (B:52:0x00f7, B:54:0x00fd, B:56:0x0106, B:57:0x0109, B:58:0x0130, B:63:0x013c, B:66:0x0147, B:67:0x014e, B:70:0x0152, B:76:0x0164, B:78:0x01a7, B:80:0x01b6, B:87:0x01cb, B:90:0x01da, B:91:0x0200, B:82:0x01c0, B:77:0x018e), top: B:108:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018e A[Catch: IOException -> 0x0201, TryCatch #2 {IOException -> 0x0201, blocks: (B:52:0x00f7, B:54:0x00fd, B:56:0x0106, B:57:0x0109, B:58:0x0130, B:63:0x013c, B:66:0x0147, B:67:0x014e, B:70:0x0152, B:76:0x0164, B:78:0x01a7, B:80:0x01b6, B:87:0x01cb, B:90:0x01da, B:91:0x0200, B:82:0x01c0, B:77:0x018e), top: B:108:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c0 A[Catch: IOException -> 0x0201, TryCatch #2 {IOException -> 0x0201, blocks: (B:52:0x00f7, B:54:0x00fd, B:56:0x0106, B:57:0x0109, B:58:0x0130, B:63:0x013c, B:66:0x0147, B:67:0x014e, B:70:0x0152, B:76:0x0164, B:78:0x01a7, B:80:0x01b6, B:87:0x01cb, B:90:0x01da, B:91:0x0200, B:82:0x01c0, B:77:0x018e), top: B:108:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020c  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        boolean z;
        Response.Builder responseHeaders;
        IOException iOException;
        Response.Builder responseHeaders2;
        Response responseBuild;
        int iCode;
        boolean z2;
        Response responseBuild2;
        Intrinsics.checkNotNullParameter(chain, "");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        final Exchange exchange$okhttp = realInterceptorChain.getExchange$okhttp();
        Intrinsics.checkNotNull(exchange$okhttp);
        Request request$okhttp = realInterceptorChain.getRequest$okhttp();
        RequestBody requestBodyBody = request$okhttp.body();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z3 = false;
        boolean z4 = HttpMethod.permitsRequestBody(request$okhttp.method()) && requestBodyBody != null;
        boolean zEquals = StringsKt__StringsJVMKt.equals("upgrade", request$okhttp.header("Connection"), true);
        try {
            exchange$okhttp.writeRequestHeaders(request$okhttp);
            if (z4) {
                if (StringsKt__StringsJVMKt.equals("100-continue", request$okhttp.header("Expect"), true)) {
                    exchange$okhttp.flushRequest();
                    responseHeaders = exchange$okhttp.readResponseHeaders(true);
                    try {
                        exchange$okhttp.responseHeadersStart();
                        z = false;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (e instanceof ConnectionShutdownException) {
                        }
                    }
                } else {
                    z = true;
                    responseHeaders = null;
                }
                if (responseHeaders == null) {
                    try {
                        if (requestBodyBody.isDuplex()) {
                            exchange$okhttp.flushRequest();
                            requestBodyBody.writeTo(TTCeilingLandingPageActivity5.onExtraCallbackWithResult(exchange$okhttp.createRequestBody(request$okhttp, true)));
                        } else {
                            TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(exchange$okhttp.createRequestBody(request$okhttp, false));
                            requestBodyBody.writeTo(tTAppOpenAdActivity9OnExtraCallbackWithResult);
                            tTAppOpenAdActivity9OnExtraCallbackWithResult.close();
                        }
                    } catch (IOException e2) {
                        e = e2;
                        if (e instanceof ConnectionShutdownException) {
                        }
                    }
                } else {
                    try {
                        exchange$okhttp.noRequestBody();
                        if (!exchange$okhttp.getConnection$okhttp().isMultiplexed$okhttp()) {
                            exchange$okhttp.noNewExchangesOnConnection();
                        }
                        z = false;
                    } catch (IOException e3) {
                        e = e3;
                        z = false;
                        if (e instanceof ConnectionShutdownException) {
                            throw e;
                        }
                        if (!exchange$okhttp.getHasFailure$okhttp()) {
                            throw e;
                        }
                        Response.Builder builder = responseHeaders;
                        iOException = e;
                        responseHeaders2 = builder;
                        if (responseHeaders2 == null) {
                        }
                        responseBuild = responseHeaders2.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                        iCode = responseBuild.code();
                        while (shouldIgnoreAndWaitForRealResponse(iCode)) {
                            try {
                            } catch (IOException e4) {
                                e = e4;
                                if (iOException == null) {
                                }
                            }
                        }
                        exchange$okhttp.responseHeadersEnd(responseBuild);
                        if (iCode != 101) {
                        }
                        if (z2) {
                            throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                        }
                        if (z2) {
                        }
                        if (!zEquals) {
                            final ResponseBody responseBodyOpenResponseBody = exchange$okhttp.openResponseBody(responseBuild);
                            responseBuild2 = responseBuild.newBuilder().body(responseBodyOpenResponseBody).trailers(new TrailersSource() { // from class: okhttp3.internal.http.CallServerInterceptor.intercept.1
                                @Override // okhttp3.TrailersSource
                                public Headers peek() {
                                    return exchange$okhttp.peekTrailers();
                                }

                                @Override // okhttp3.TrailersSource
                                public Headers get() throws IOException {
                                    TTAppOpenAdTransActivity tTAppOpenAdTransActivitySource = responseBodyOpenResponseBody.source();
                                    if (tTAppOpenAdTransActivitySource.isOpen()) {
                                        _UtilJvmKt.skipAll(tTAppOpenAdTransActivitySource);
                                    }
                                    Headers headersPeek = peek();
                                    if (headersPeek != null) {
                                        return headersPeek;
                                    }
                                    throw new IllegalStateException("null trailers after exhausting response body?!");
                                }
                            }).build();
                        }
                        if (!StringsKt__StringsJVMKt.equals("close", responseBuild2.request().header("Connection"), true)) {
                            exchange$okhttp.noNewExchangesOnConnection();
                        }
                        if (iCode == 204) {
                            throw new ProtocolException("HTTP " + iCode + " had non-zero Content-Length: " + responseBuild2.body().contentLength());
                        }
                        throw new ProtocolException("HTTP " + iCode + " had non-zero Content-Length: " + responseBuild2.body().contentLength());
                        return responseBuild2;
                    }
                }
            } else {
                exchange$okhttp.noRequestBody();
                z = true;
                responseHeaders = null;
            }
            if (requestBodyBody == null || !requestBodyBody.isDuplex()) {
                exchange$okhttp.finishRequest();
            }
            responseHeaders2 = responseHeaders;
            iOException = null;
        } catch (IOException e5) {
            e = e5;
            z = true;
            responseHeaders = null;
        }
        if (responseHeaders2 == null) {
            try {
                responseHeaders2 = exchange$okhttp.readResponseHeaders(false);
                Intrinsics.checkNotNull(responseHeaders2);
                if (z) {
                    exchange$okhttp.responseHeadersStart();
                    z = false;
                }
            } catch (IOException e6) {
                e = e6;
                if (iOException == null) {
                    setExecute.onNavigationEvent(iOException, e);
                    throw iOException;
                }
                throw e;
            }
        }
        responseBuild = responseHeaders2.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        iCode = responseBuild.code();
        while (shouldIgnoreAndWaitForRealResponse(iCode)) {
            Response.Builder responseHeaders3 = exchange$okhttp.readResponseHeaders(z3);
            Intrinsics.checkNotNull(responseHeaders3);
            if (z) {
                exchange$okhttp.responseHeadersStart();
            }
            responseBuild = responseHeaders3.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            iCode = responseBuild.code();
            z3 = false;
        }
        exchange$okhttp.responseHeadersEnd(responseBuild);
        z2 = iCode != 101;
        if (z2 && exchange$okhttp.getConnection$okhttp().isMultiplexed$okhttp()) {
            throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
        }
        boolean z5 = !z2 && StringsKt__StringsJVMKt.equals("upgrade", Response.header$default(responseBuild, "Connection", null, 2, null), true);
        if (!zEquals && z5) {
            responseBuild2 = responseBuild.newBuilder().body(new UnreadableResponseBody(responseBuild.body().contentType(), responseBuild.body().contentLength())).socket(exchange$okhttp.upgradeToSocket()).build();
        } else {
            final ResponseBody responseBodyOpenResponseBody2 = exchange$okhttp.openResponseBody(responseBuild);
            responseBuild2 = responseBuild.newBuilder().body(responseBodyOpenResponseBody2).trailers(new TrailersSource() { // from class: okhttp3.internal.http.CallServerInterceptor.intercept.1
                @Override // okhttp3.TrailersSource
                public Headers peek() {
                    return exchange$okhttp.peekTrailers();
                }

                @Override // okhttp3.TrailersSource
                public Headers get() throws IOException {
                    TTAppOpenAdTransActivity tTAppOpenAdTransActivitySource = responseBodyOpenResponseBody2.source();
                    if (tTAppOpenAdTransActivitySource.isOpen()) {
                        _UtilJvmKt.skipAll(tTAppOpenAdTransActivitySource);
                    }
                    Headers headersPeek = peek();
                    if (headersPeek != null) {
                        return headersPeek;
                    }
                    throw new IllegalStateException("null trailers after exhausting response body?!");
                }
            }).build();
        }
        if (!StringsKt__StringsJVMKt.equals("close", responseBuild2.request().header("Connection"), true) || StringsKt__StringsJVMKt.equals("close", Response.header$default(responseBuild2, "Connection", null, 2, null), true)) {
            exchange$okhttp.noNewExchangesOnConnection();
        }
        if ((iCode == 204 && iCode != 205) || responseBuild2.body().contentLength() <= 0) {
            return responseBuild2;
        }
        throw new ProtocolException("HTTP " + iCode + " had non-zero Content-Length: " + responseBuild2.body().contentLength());
    }
}
