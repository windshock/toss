package okhttp3.internal.cache;

import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TTAppOpenAdActivity9;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTCeilingLandingPageActivity5;
import o.TTHistoryActivity41;
import o.TTHistoryActivity42;
import o.TrackGroupExternalSyntheticLambda0;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.UnreadableResponseBodyKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.url._UrlKt;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class CacheInterceptor implements Interceptor {
    public static final Companion Companion = new Companion(null);
    private final Cache cache;

    public CacheInterceptor(@Nullable Cache cache) {
        this.cache = cache;
    }

    public final Cache getCache$okhttp() {
        return this.cache;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) throws Throwable {
        EventListener eventListener$okhttp;
        Intrinsics.checkNotNullParameter(chain, "");
        Call call = chain.call();
        Cache cache = this.cache;
        Response response = cache != null ? cache.get$okhttp(CacheInterceptorKt.access$requestForCache(chain.request())) : null;
        CacheStrategy cacheStrategyCompute = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).compute();
        Request networkRequest = cacheStrategyCompute.getNetworkRequest();
        Response cacheResponse = cacheStrategyCompute.getCacheResponse();
        Cache cache2 = this.cache;
        if (cache2 != null) {
            cache2.trackResponse$okhttp(cacheStrategyCompute);
        }
        RealCall realCall = call instanceof RealCall ? (RealCall) call : null;
        if (realCall == null || (eventListener$okhttp = realCall.getEventListener$okhttp()) == null) {
            eventListener$okhttp = EventListener.NONE;
        }
        if (response != null && cacheResponse == null) {
            _UtilCommonKt.closeQuietly(response.body());
        }
        if (networkRequest == null && cacheResponse == null) {
            Response responseBuild = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
            eventListener$okhttp.satisfactionFailure(call, responseBuild);
            return responseBuild;
        }
        if (networkRequest == null) {
            Intrinsics.checkNotNull(cacheResponse);
            Response responseBuild2 = cacheResponse.newBuilder().cacheResponse(UnreadableResponseBodyKt.stripBody(cacheResponse)).build();
            eventListener$okhttp.cacheHit(call, responseBuild2);
            return responseBuild2;
        }
        if (cacheResponse != null) {
            eventListener$okhttp.cacheConditionalHit(call, cacheResponse);
        } else if (this.cache != null) {
            eventListener$okhttp.cacheMiss(call);
        }
        try {
            Response responseProceed = chain.proceed(networkRequest);
            if (responseProceed == null && response != null) {
            }
            if (cacheResponse != null) {
                if (responseProceed != null && responseProceed.code() == 304) {
                    Response responseBuild3 = cacheResponse.newBuilder().headers(Companion.access$combine(Companion, cacheResponse.headers(), responseProceed.headers())).sentRequestAtMillis(responseProceed.sentRequestAtMillis()).receivedResponseAtMillis(responseProceed.receivedResponseAtMillis()).cacheResponse(UnreadableResponseBodyKt.stripBody(cacheResponse)).networkResponse(UnreadableResponseBodyKt.stripBody(responseProceed)).build();
                    responseProceed.body().close();
                    Cache cache3 = this.cache;
                    Intrinsics.checkNotNull(cache3);
                    cache3.trackConditionalCacheHit$okhttp();
                    this.cache.update$okhttp(cacheResponse, responseBuild3);
                    eventListener$okhttp.cacheHit(call, responseBuild3);
                    return responseBuild3;
                }
                _UtilCommonKt.closeQuietly(cacheResponse.body());
            }
            Intrinsics.checkNotNull(responseProceed);
            Response responseBuild4 = responseProceed.newBuilder().cacheResponse(cacheResponse != null ? UnreadableResponseBodyKt.stripBody(cacheResponse) : null).networkResponse(UnreadableResponseBodyKt.stripBody(responseProceed)).build();
            if (this.cache != null) {
                Request requestAccess$requestForCache = CacheInterceptorKt.access$requestForCache(networkRequest);
                if (HttpHeaders.promisesBody(responseBuild4) && CacheStrategy.Companion.isCacheable(responseBuild4, requestAccess$requestForCache)) {
                    Response responseCacheWritingResponse = cacheWritingResponse(this.cache.put$okhttp(responseBuild4.newBuilder().request(requestAccess$requestForCache).build()), responseBuild4);
                    if (cacheResponse != null) {
                        eventListener$okhttp.cacheMiss(call);
                    }
                    return responseCacheWritingResponse;
                }
                if (HttpMethod.invalidatesCache(networkRequest.method())) {
                    try {
                        this.cache.remove$okhttp(networkRequest);
                    } catch (IOException unused) {
                    }
                }
            }
            return responseBuild4;
        } finally {
            if (response != null) {
                _UtilCommonKt.closeQuietly(response.body());
            }
        }
    }

    private final Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) throws IOException {
        if (cacheRequest == null) {
            return response;
        }
        TTHistoryActivity41 tTHistoryActivity41Body = cacheRequest.body();
        final TTAppOpenAdTransActivity tTAppOpenAdTransActivitySource = response.body().source();
        final TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(tTHistoryActivity41Body);
        TTHistoryActivity42 tTHistoryActivity42 = new TTHistoryActivity42() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
            private boolean cacheRequestClosed;

            @Override // o.TTHistoryActivity42
            public long read(TTBaseActivity tTBaseActivity, long j) throws IOException {
                Intrinsics.checkNotNullParameter(tTBaseActivity, "");
                try {
                    long j2 = tTAppOpenAdTransActivitySource.read(tTBaseActivity, j);
                    if (j2 == -1) {
                        if (!this.cacheRequestClosed) {
                            this.cacheRequestClosed = true;
                            tTAppOpenAdActivity9OnExtraCallbackWithResult.close();
                        }
                        return -1L;
                    }
                    tTBaseActivity.IAuthTabCallback(tTAppOpenAdActivity9OnExtraCallbackWithResult.access100(), tTBaseActivity.ICustomTabsCallbackDefault() - j2, j2);
                    tTAppOpenAdActivity9OnExtraCallbackWithResult.asInterface();
                    return j2;
                } catch (IOException e) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        cacheRequest.abort();
                    }
                    throw e;
                }
            }

            @Override // o.TTHistoryActivity42, o.TTHistoryActivity41
            public Timeout timeout() {
                return tTAppOpenAdTransActivitySource.timeout();
            }

            @Override // o.TTHistoryActivity42, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.TTHistoryActivity41
            public void close() throws IOException {
                if (!this.cacheRequestClosed && !_UtilJvmKt.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                tTAppOpenAdTransActivitySource.close();
            }
        };
        return response.newBuilder().body(new RealResponseBody(Response.header$default(response, "Content-Type", null, 2, null), response.body().contentLength(), TTCeilingLandingPageActivity5.onExtraCallback(tTHistoryActivity42))).build();
    }

    public static final class Companion {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static char[] onExtraCallbackWithResult = {27380};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int length;
            char[] cArr;
            int i;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr2 = onExtraCallbackWithResult;
            if (cArr2 != null) {
                int i7 = $11 + 65;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                    i = 1;
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                    i = 0;
                }
                while (i < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - ExpandableListView.getPackedPositionType(0L)), 36 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr[i] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i++;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr2, i3, cArr3, 0, i4);
            if (bArr != null) {
                int i8 = $11 + 61;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char[] cArr4 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 10935), 65 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 16718 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        int i12 = $10 + 65;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 49467), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 70, ((byte) KeyEvent.getModifierMetaStateMask()) + 12487, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                int i14 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr3, i14, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i14);
            }
            if (z) {
                char[] cArr6 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                int i15 = $11 + 113;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                cArr3 = cArr6;
            }
            if (i5 > 0) {
                int i17 = $10 + Imgproc.COLOR_YUV2RGBA_YVYU;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        private Companion() {
        }

        public static final /* synthetic */ Headers access$combine(Companion companion, Headers headers, Headers headers2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Headers headersCombine = companion.combine(headers, headers2);
            int i4 = IAuthTabCallback + 73;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return headersCombine;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[PHI: r5 r8
          0x003b: PHI (r5v5 java.lang.String) = (r5v4 java.lang.String), (r5v12 java.lang.String) binds: [B:10:0x0039, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x003b: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v3 java.lang.String) binds: [B:10:0x0039, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[PHI: r5 r8
          0x0055: PHI (r5v11 java.lang.String) = (r5v4 java.lang.String), (r5v5 java.lang.String), (r5v12 java.lang.String) binds: [B:10:0x0039, B:12:0x0053, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x0055: PHI (r8v2 java.lang.String) = (r8v0 java.lang.String), (r8v1 java.lang.String), (r8v3 java.lang.String) binds: [B:10:0x0039, B:12:0x0053, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final Headers combine(Headers headers, Headers headers2) throws Throwable {
            String strName;
            String strValue;
            int i = 2 % 2;
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = IAuthTabCallback + 27;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    strName = headers.name(i2);
                    strValue = headers.value(i2);
                    if (StringsKt__StringsJVMKt.equals("Warning", strName, true)) {
                        Object[] objArr = new Object[1];
                        a(new int[]{0, 1, 137, 1}, true, null, objArr);
                        if (!StringsKt__StringsJVMKt.startsWith$default(strValue, ((String) objArr[0]).intern(), false, 2, null)) {
                            if (isContentSpecificHeader(strName) || !isEndToEnd(strName) || headers2.get(strName) == null) {
                                builder.addLenient$okhttp(strName, strValue);
                            }
                        }
                    }
                } else {
                    strName = headers.name(i2);
                    strValue = headers.value(i2);
                    if (StringsKt__StringsJVMKt.equals("Warning", strName, true)) {
                    }
                }
                i2++;
                int i4 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 4 % 2;
                }
            }
            int size2 = headers2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                String strName2 = headers2.name(i6);
                if (!isContentSpecificHeader(strName2) && isEndToEnd(strName2)) {
                    int i7 = IAuthTabCallback + 23;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    builder.addLenient$okhttp(strName2, headers2.value(i6));
                }
            }
            return builder.build();
        }

        private final boolean isEndToEnd(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!StringsKt__StringsJVMKt.equals("Connection", str, true) && !StringsKt__StringsJVMKt.equals("Keep-Alive", str, true) && (!StringsKt__StringsJVMKt.equals("Proxy-Authenticate", str, true)) && !StringsKt__StringsJVMKt.equals("Proxy-Authorization", str, true) && !StringsKt__StringsJVMKt.equals("TE", str, true) && !StringsKt__StringsJVMKt.equals("Trailers", str, true)) {
                int i4 = IAuthTabCallback + 25;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                if (!StringsKt__StringsJVMKt.equals("Transfer-Encoding", str, true)) {
                    int i6 = onExtraCallback + 95;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0 ? !StringsKt__StringsJVMKt.equals("Upgrade", str, true) : !StringsKt__StringsJVMKt.equals("Upgrade", str, false)) {
                        int i7 = IAuthTabCallback + 13;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        return true;
                    }
                }
            }
            return false;
        }

        private final boolean isContentSpecificHeader(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0 ? !StringsKt__StringsJVMKt.equals("Content-Length", str, true) : !StringsKt__StringsJVMKt.equals("Content-Length", str, false)) {
                if (!StringsKt__StringsJVMKt.equals("Content-Encoding", str, true)) {
                    int i3 = IAuthTabCallback + 63;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    boolean zEquals = StringsKt__StringsJVMKt.equals("Content-Type", str, true);
                    if (i4 != 0 ? !zEquals : !zEquals) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
