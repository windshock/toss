package okhttp3.internal.http;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static final int MAX_FOLLOW_UPS = 20;
    private static int asBinder = 1;
    private static int asInterface;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;
    private final OkHttpClient client;

    static {
        IAuthTabCallback();
        Companion = new Companion(null);
        int i = asBinder + 57;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 42 / 0;
        }
    }

    public RetryAndFollowUpInterceptor(@NotNull OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        this.client = okHttpClient;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 89;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $10 + 61;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $11 + 99;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i12 = (c3 + i8) ^ ((c3 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i13 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallback);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[c] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i14 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9;
                        int iIndexOf = TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, i3) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(minimumFlingVelocity, i14, iIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    int i15 = i9;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0)), 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 12435 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9 = i15 + 1;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - ((Process.getThreadPriority(0) + 20) >> 6)), KeyEvent.getDeadChar(0, 0) + 14, KeyEvent.normalizeMetaState(0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        r9 = okhttp3.internal.http.RetryAndFollowUpInterceptor.asInterface + 45;
        okhttp3.internal.http.RetryAndFollowUpInterceptor.IAuthTabCallbackStub = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if ((r9 % 2) == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        r6 = okhttp3.internal.UnreadableResponseBodyKt.stripBody(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        okhttp3.internal.UnreadableResponseBodyKt.stripBody(r6);
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        r6 = r1.priorResponse(r6).build();
        r1 = r2.getInterceptorScopedExchange$okhttp();
        r9 = followUpRequest(r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        if (r9 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        r13 = okhttp3.internal.http.RetryAndFollowUpInterceptor.IAuthTabCallbackStub;
        r3 = r13 + 81;
        okhttp3.internal.http.RetryAndFollowUpInterceptor.asInterface = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r1 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        r13 = r13 + 21;
        okhttp3.internal.http.RetryAndFollowUpInterceptor.asInterface = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if ((r13 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        if (r1.isDuplex$okhttp() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r2.timeoutEarlyExit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        r13 = okhttp3.internal.http.RetryAndFollowUpInterceptor.asInterface + 97;
        okhttp3.internal.http.RetryAndFollowUpInterceptor.IAuthTabCallbackStub = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        if ((r13 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        r0 = 2 / 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        r1.isDuplex$okhttp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        r2.getEventListener$okhttp().followUpDecision(r2, r6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
    
        r2.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        r1 = r9.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
    
        if (r1 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        if (r1.isOneShot() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
    
        r13 = okhttp3.internal.http.RetryAndFollowUpInterceptor.IAuthTabCallbackStub + 115;
        okhttp3.internal.http.RetryAndFollowUpInterceptor.asInterface = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
    
        if ((r13 % 2) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ba, code lost:
    
        r13 = r2.getEventListener$okhttp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00be, code lost:
    
        r13.followUpDecision(r2, r6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
    
        r13 = r2.getEventListener$okhttp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
    
        r2.exitNetworkInterceptorExchange$okhttp(false);
        r13 = okhttp3.internal.http.RetryAndFollowUpInterceptor.IAuthTabCallbackStub + 85;
        okhttp3.internal.http.RetryAndFollowUpInterceptor.asInterface = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d3, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d4, code lost:
    
        okhttp3.internal._UtilCommonKt.closeQuietly(r6.body());
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
    
        if (r7 > 20) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e0, code lost:
    
        r2.getEventListener$okhttp().followUpDecision(r2, r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
    
        r2.getEventListener$okhttp().followUpDecision(r2, r6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010a, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0134, code lost:
    
        r2.exitNetworkInterceptorExchange$okhttp(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0137, code lost:
    
        throw r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        r1 = r13.proceed(r1).newBuilder().request(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (r6 == null) goto L15;
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(@NotNull Interceptor.Chain chain) throws Throwable {
        Request requestFollowUpRequest;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(chain, "");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request$okhttp = realInterceptorChain.getRequest$okhttp();
        RealCall call$okhttp = realInterceptorChain.getCall$okhttp();
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        boolean z = false;
        Object obj = null;
        int i4 = 0;
        Response responseBuild = null;
        while (true) {
            boolean z2 = true;
            while (true) {
                call$okhttp.enterNetworkInterceptorExchange(request$okhttp, z2, realInterceptorChain);
                try {
                    if (call$okhttp.isCanceled()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        break;
                    } catch (IOException e) {
                        boolean zRecover = recover(e, call$okhttp, request$okhttp);
                        call$okhttp.getEventListener$okhttp().retryDecision(call$okhttp, e, zRecover);
                        if (!zRecover) {
                            throw _UtilCommonKt.withSuppressed(e, listEmptyList);
                        }
                        listEmptyList = CollectionsKt___CollectionsKt.plus((Collection<? extends IOException>) ((Collection<? extends Object>) listEmptyList), e);
                        call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
                        z2 = false;
                    }
                } catch (Throwable th) {
                    th = th;
                    z = true;
                }
            }
            call$okhttp.exitNetworkInterceptorExchange$okhttp(true);
            request$okhttp = requestFollowUpRequest;
        }
    }

    private final boolean recover(IOException iOException, RealCall realCall, Request request) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean z = iOException instanceof ConnectionShutdownException;
        if (!this.client.retryOnConnectionFailure()) {
            int i4 = asInterface + 73;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (z || !requestIsOneShot(iOException, request)) {
            if (!isRecoverable(iOException, !z)) {
                int i6 = asInterface + 35;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (realCall.retryAfterFailure()) {
                return true;
            }
            int i8 = IAuthTabCallbackStub + 77;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = IAuthTabCallbackStub + 25;
        asInterface = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    private final boolean requestIsOneShot(IOException iOException, Request request) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            RequestBody requestBodyBody = request.body();
            if ((requestBodyBody != null && requestBodyBody.isOneShot()) || (iOException instanceof FileNotFoundException)) {
                return true;
            }
            int i3 = IAuthTabCallbackStub + 69;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                return false;
            }
            throw null;
        }
        request.body();
        obj.hashCode();
        throw null;
    }

    private final boolean isRecoverable(IOException iOException, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            int i5 = i3 + 65;
            int i6 = i5 % 128;
            asInterface = i6;
            int i7 = i5 % 2;
            if (iOException instanceof SocketTimeoutException) {
                int i8 = i6 + 17;
                IAuthTabCallbackStub = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
                if (!z) {
                    return true;
                }
            }
            return false;
        }
        if ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) {
            int i9 = IAuthTabCallbackStub + 25;
            asInterface = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            return false;
        }
        int i11 = asInterface + 59;
        IAuthTabCallbackStub = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    private final Request followUpRequest(Response response, Exchange exchange) throws IOException {
        Route route;
        RealConnection connection$okhttp;
        int i = 2 % 2;
        Object obj = null;
        if (exchange == null || (connection$okhttp = exchange.getConnection$okhttp()) == null) {
            route = null;
        } else {
            int i2 = IAuthTabCallbackStub + 77;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                connection$okhttp.route();
                obj.hashCode();
                throw null;
            }
            route = connection$okhttp.route();
        }
        int iCode = response.code();
        String strMethod = response.request().method();
        if (iCode != 307 && iCode != 308) {
            int i3 = asInterface + 19;
            int i4 = i3 % 128;
            IAuthTabCallbackStub = i4;
            int i5 = i3 % 2;
            if (iCode == 401) {
                return this.client.authenticator().authenticate(route, response);
            }
            if (iCode == 421) {
                RequestBody requestBodyBody = response.request().body();
                if (requestBodyBody != null) {
                    int i6 = IAuthTabCallbackStub + 21;
                    asInterface = i6 % 128;
                    if (i6 % 2 != 0) {
                        requestBodyBody.isOneShot();
                        obj.hashCode();
                        throw null;
                    }
                    if (requestBodyBody.isOneShot()) {
                        return null;
                    }
                }
                if (exchange == null || (!exchange.isCoalescedConnection$okhttp())) {
                    return null;
                }
                exchange.getConnection$okhttp().noCoalescedConnections$okhttp();
                return response.request();
            }
            if (iCode == 503) {
                Response responsePriorResponse = response.priorResponse();
                if ((responsePriorResponse == null || responsePriorResponse.code() != 503) && retryAfter(response, IntCompanionObject.MAX_VALUE) == 0) {
                    return response.request();
                }
                return null;
            }
            if (iCode == 407) {
                Intrinsics.checkNotNull(route);
                if (route.proxy().type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                int i7 = IAuthTabCallbackStub + 15;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                Request requestAuthenticate = this.client.proxyAuthenticator().authenticate(route, response);
                int i9 = IAuthTabCallbackStub + 97;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                return requestAuthenticate;
            }
            int i11 = i4 + 33;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
            if (iCode == 408) {
                if (!this.client.retryOnConnectionFailure()) {
                    int i13 = asInterface + 5;
                    IAuthTabCallbackStub = i13 % 128;
                    int i14 = i13 % 2;
                    return null;
                }
                RequestBody requestBodyBody2 = response.request().body();
                if (requestBodyBody2 != null && requestBodyBody2.isOneShot()) {
                    int i15 = IAuthTabCallbackStub + 95;
                    asInterface = i15 % 128;
                    if (i15 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                Response responsePriorResponse2 = response.priorResponse();
                if ((responsePriorResponse2 == null || responsePriorResponse2.code() != 408) && retryAfter(response, 0) <= 0) {
                    return response.request();
                }
                return null;
            }
            switch (iCode) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return buildRedirectRequest(response, strMethod);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Request buildRedirectRequest(Response response, String str) throws Throwable {
        boolean z;
        int i = 2 % 2;
        RequestBody requestBodyBody = null;
        if (!this.client.followRedirects()) {
            return null;
        }
        String strHeader$default = Response.header$default(response, "Location", null, 2, null);
        if (strHeader$default == null) {
            int i2 = IAuthTabCallbackStub + 73;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        HttpUrl httpUrlResolve = response.request().url().resolve(strHeader$default);
        if (httpUrlResolve == null) {
            return null;
        }
        if (!Intrinsics.areEqual(httpUrlResolve.scheme(), response.request().url().scheme()) && !this.client.followSslRedirects()) {
            int i4 = IAuthTabCallbackStub + 53;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            requestBodyBody.hashCode();
            throw null;
        }
        Request.Builder builderNewBuilder = response.request().newBuilder();
        if (HttpMethod.permitsRequestBody(str)) {
            int i5 = IAuthTabCallbackStub + 33;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            int iCode = response.code();
            HttpMethod httpMethod = HttpMethod.INSTANCE;
            if (httpMethod.redirectsWithBody(str) || iCode == 308) {
                z = true;
                if (httpMethod.redirectsToGet(str) || iCode == 308 || iCode == 307) {
                    if (z) {
                        int i7 = IAuthTabCallbackStub + 9;
                        asInterface = i7 % 128;
                        int i8 = i7 % 2;
                        requestBodyBody = response.request().body();
                    }
                    builderNewBuilder.method(str, requestBodyBody);
                } else {
                    Object[] objArr = new Object[1];
                    a(new char[]{29347, 54628, 57208, 8862}, 3 - KeyEvent.getDeadChar(0, 0), objArr);
                    builderNewBuilder.method(((String) objArr[0]).intern(), null);
                    int i9 = asInterface + 123;
                    IAuthTabCallbackStub = i9 % 128;
                    int i10 = i9 % 2;
                }
                if (!z) {
                    builderNewBuilder.removeHeader("Transfer-Encoding");
                    builderNewBuilder.removeHeader("Content-Length");
                    builderNewBuilder.removeHeader("Content-Type");
                }
            } else {
                int i11 = asInterface + 19;
                IAuthTabCallbackStub = i11 % 128;
                int i12 = i11 % 2;
                if (iCode != 307) {
                    z = false;
                }
                if (httpMethod.redirectsToGet(str)) {
                    if (z) {
                    }
                    builderNewBuilder.method(str, requestBodyBody);
                    if (!z) {
                    }
                }
            }
        }
        if (!_UtilJvmKt.canReuseConnectionFor(response.request().url(), httpUrlResolve)) {
            builderNewBuilder.removeHeader("Authorization");
        }
        return builderNewBuilder.url(httpUrlResolve).build();
    }

    private final int retryAfter(Response response, int i) throws NumberFormatException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 15;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String strHeader$default = Response.header$default(response, "Retry-After", null, 2, null);
        if (strHeader$default == null) {
            return i;
        }
        if (!new Regex("\\d+").onExtraCallbackWithResult(strHeader$default)) {
            return IntCompanionObject.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strHeader$default);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "");
        int iIntValue = numValueOf.intValue();
        int i5 = IAuthTabCallbackStub + 119;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return iIntValue;
    }

    static void IAuthTabCallback() {
        onNavigationEvent = (char) 24473;
        onWarmupCompleted = (char) 49906;
        onExtraCallbackWithResult = (char) 43980;
        onExtraCallback = (char) 55025;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
