package okhttp3;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.observability.networkusage.NetworkUsageEventListenerFactory;
import im.toss.observability.networkusage.NetworkUsageInterceptor;
import j$.time.Duration;
import java.lang.reflect.Method;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.a1ExternalSyntheticLambda1;
import o.a1b;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.WebSocket;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.RealWebSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class OkHttpClient implements Call.Factory, WebSocket.Factory {
    private final Authenticator authenticator;
    private final Cache cache;
    private final int callTimeoutMillis;
    private final CertificateChainCleaner certificateChainCleaner;
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    private final ConnectionPool connectionPool;
    private final List<ConnectionSpec> connectionSpecs;
    private final CookieJar cookieJar;
    private final Dispatcher dispatcher;
    private final Dns dns;
    private final EventListener.Factory eventListenerFactory;
    private final boolean fastFallback;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    private final HostnameVerifier hostnameVerifier;
    private final List<Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final RouteDatabase routeDatabase;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final TaskRunner taskRunner;
    private final int webSocketCloseTimeout;
    private final int writeTimeoutMillis;
    private final X509TrustManager x509TrustManager;
    public static final Companion Companion = new Companion(null);
    private static final List<Protocol> DEFAULT_PROTOCOLS = _UtilJvmKt.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);
    private static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = _UtilJvmKt.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);

    public static final class Builder {
        private Authenticator authenticator;
        private Cache cache;
        private int callTimeout;
        private CertificateChainCleaner certificateChainCleaner;
        private CertificatePinner certificatePinner;
        private int connectTimeout;
        private ConnectionPool connectionPool;
        private List<ConnectionSpec> connectionSpecs;
        private CookieJar cookieJar;
        private Dispatcher dispatcher;
        private Dns dns;
        private EventListener.Factory eventListenerFactory;
        private boolean fastFallback;
        private boolean followRedirects;
        private boolean followSslRedirects;
        private HostnameVerifier hostnameVerifier;
        private final List<Interceptor> interceptors;
        private long minWebSocketMessageToCompress;
        private final List<Interceptor> networkInterceptors;
        private int pingInterval;
        private List<? extends Protocol> protocols;
        private Proxy proxy;
        private Authenticator proxyAuthenticator;
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        private RouteDatabase routeDatabase;
        private SocketFactory socketFactory;
        private SSLSocketFactory sslSocketFactoryOrNull;
        private TaskRunner taskRunner;
        private int webSocketCloseTimeout;
        private int writeTimeout;
        private X509TrustManager x509TrustManagerOrNull;
        private static final byte[] $$a = {13, 38, -109, 117};
        private static final int $$b = 116;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int IAuthTabCallback = 1;
        private static char[] onNavigationEvent = {60832, 48842, 19287, 6100, 41063, 19698, 6506};
        private static long onWarmupCompleted = -7036309517222822237L;

        private static String $$c(int i, byte b, int i2) {
            int i3 = (b * 4) + 4;
            int i4 = i * 2;
            int i5 = (i2 * 2) + 97;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[1 - i4];
            int i6 = 0 - i4;
            int i7 = -1;
            if (bArr == null) {
                i3++;
                i5 = i3 + (-i5);
            }
            while (true) {
                int i8 = i5;
                int i9 = i3;
                i7++;
                bArr2[i7] = (byte) i8;
                if (i7 == i6) {
                    return new String(bArr2, 0);
                }
                i3 = i9 + 1;
                i5 = i8 + (-bArr[i9]);
            }
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 59697), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 17, TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46135 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 31, 20220 - ExpandableListView.getPackedPositionGroup(0L), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 49123), 45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i5 = $10 + 77;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getTouchSlop() >> 8) + 44, 1495 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i7 = $11 + 85;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            }
            objArr[0] = new String(cArr);
        }

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = _UtilJvmKt.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            this.fastFallback = true;
            Authenticator authenticator = Authenticator.NONE;
            this.authenticator = authenticator;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "");
            this.socketFactory = socketFactory;
            Companion companion = OkHttpClient.Companion;
            this.connectionSpecs = companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = companion.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.webSocketCloseTimeout = 60000;
            this.minWebSocketMessageToCompress = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }

        public final Dispatcher getDispatcher$okhttp() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            Dispatcher dispatcher = this.dispatcher;
            int i4 = i3 + 25;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return dispatcher;
            }
            throw null;
        }

        public final void setDispatcher$okhttp(@NotNull Dispatcher dispatcher) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(dispatcher, "");
                this.dispatcher = dispatcher;
                int i3 = 23 / 0;
            } else {
                Intrinsics.checkNotNullParameter(dispatcher, "");
                this.dispatcher = dispatcher;
            }
            int i4 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public final ConnectionPool getConnectionPool$okhttp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            ConnectionPool connectionPool = this.connectionPool;
            int i5 = i3 + 27;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return connectionPool;
        }

        public final void setConnectionPool$okhttp(@Nullable ConnectionPool connectionPool) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.connectionPool = connectionPool;
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final List<Interceptor> getInterceptors$okhttp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            List<Interceptor> list = this.interceptors;
            if (i3 != 0) {
                int i4 = 76 / 0;
            }
            return list;
        }

        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            List<Interceptor> list;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                list = this.networkInterceptors;
                int i4 = 84 / 0;
            } else {
                list = this.networkInterceptors;
            }
            int i5 = i3 + 79;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final EventListener.Factory getEventListenerFactory$okhttp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 43;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            EventListener.Factory factory = this.eventListenerFactory;
            int i5 = i2 + 111;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return factory;
        }

        public final void setEventListenerFactory$okhttp(@NotNull EventListener.Factory factory) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(factory, "");
                this.eventListenerFactory = factory;
            } else {
                Intrinsics.checkNotNullParameter(factory, "");
                this.eventListenerFactory = factory;
                int i3 = 93 / 0;
            }
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            boolean z = this.retryOnConnectionFailure;
            int i4 = i3 + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return z;
            }
            throw null;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            this.retryOnConnectionFailure = z;
            int i5 = i3 + 35;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean getFastFallback$okhttp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            boolean z = this.fastFallback;
            int i5 = i3 + 27;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final void setFastFallback$okhttp(boolean z) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.fastFallback = z;
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Authenticator getAuthenticator$okhttp() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Authenticator authenticator = this.authenticator;
            int i5 = i3 + 105;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return authenticator;
        }

        public final void setAuthenticator$okhttp(@NotNull Authenticator authenticator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(authenticator, "");
            this.authenticator = authenticator;
            int i4 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        public final boolean getFollowRedirects$okhttp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 123;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z = this.followRedirects;
            int i4 = i2 + 77;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        public final void setFollowRedirects$okhttp(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 45;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            this.followRedirects = z;
            int i5 = i2 + 83;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public final boolean getFollowSslRedirects$okhttp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.followSslRedirects;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setFollowSslRedirects$okhttp(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 115;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            this.followSslRedirects = z;
            int i5 = i2 + 87;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public final CookieJar getCookieJar$okhttp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            CookieJar cookieJar = this.cookieJar;
            int i5 = i3 + 109;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return cookieJar;
        }

        public final void setCookieJar$okhttp(@NotNull CookieJar cookieJar) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(cookieJar, "");
                this.cookieJar = cookieJar;
            } else {
                Intrinsics.checkNotNullParameter(cookieJar, "");
                this.cookieJar = cookieJar;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public final Cache getCache$okhttp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.cache;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setCache$okhttp(@Nullable Cache cache) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            this.cache = cache;
            if (i4 == 0) {
                int i5 = 65 / 0;
            }
            int i6 = i3 + 61;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }

        public final Dns getDns$okhttp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Dns dns = this.dns;
            int i4 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return dns;
        }

        public final void setDns$okhttp(@NotNull Dns dns) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dns, "");
            this.dns = dns;
            int i4 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Proxy getProxy$okhttp() {
            Proxy proxy;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 55;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                proxy = this.proxy;
                int i4 = 16 / 0;
            } else {
                proxy = this.proxy;
            }
            int i5 = i2 + 33;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 77 / 0;
            }
            return proxy;
        }

        public final void setProxy$okhttp(@Nullable Proxy proxy) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            this.proxy = proxy;
            int i5 = i2 + 79;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public final ProxySelector getProxySelector$okhttp() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            ProxySelector proxySelector = this.proxySelector;
            int i5 = i3 + 83;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return proxySelector;
        }

        public final void setProxySelector$okhttp(@Nullable ProxySelector proxySelector) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            this.proxySelector = proxySelector;
            int i5 = i3 + 13;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }

        public final Authenticator getProxyAuthenticator$okhttp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 13;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Authenticator authenticator = this.proxyAuthenticator;
            int i5 = i2 + 107;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return authenticator;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setProxyAuthenticator$okhttp(@NotNull Authenticator authenticator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(authenticator, "");
            this.proxyAuthenticator = authenticator;
            int i4 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 80 / 0;
            }
        }

        public final SocketFactory getSocketFactory$okhttp() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            SocketFactory socketFactory = this.socketFactory;
            int i5 = i3 + 87;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return socketFactory;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setSocketFactory$okhttp(@NotNull SocketFactory socketFactory) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(socketFactory, "");
                this.socketFactory = socketFactory;
            } else {
                Intrinsics.checkNotNullParameter(socketFactory, "");
                this.socketFactory = socketFactory;
                int i3 = 33 / 0;
            }
        }

        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
            int i5 = i3 + 51;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return sSLSocketFactory;
            }
            throw null;
        }

        public final void setSslSocketFactoryOrNull$okhttp(@Nullable SSLSocketFactory sSLSocketFactory) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            this.sslSocketFactoryOrNull = sSLSocketFactory;
            int i5 = i3 + 5;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 59 / 0;
            }
        }

        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 103;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
            int i4 = i2 + 9;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return x509TrustManager;
        }

        public final void setX509TrustManagerOrNull$okhttp(@Nullable X509TrustManager x509TrustManager) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 23;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            this.x509TrustManagerOrNull = x509TrustManager;
            int i5 = i2 + 33;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }

        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            List<ConnectionSpec> list = this.connectionSpecs;
            int i4 = i3 + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return list;
        }

        public final void setConnectionSpecs$okhttp(@NotNull List<ConnectionSpec> list) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(list, "");
                this.connectionSpecs = list;
                throw null;
            }
            Intrinsics.checkNotNullParameter(list, "");
            this.connectionSpecs = list;
            int i3 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 37 / 0;
            }
        }

        public final List<Protocol> getProtocols$okhttp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 105;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            List list = this.protocols;
            int i5 = i2 + 91;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 14 / 0;
            }
            return list;
        }

        public final void setProtocols$okhttp(@NotNull List<? extends Protocol> list) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            this.protocols = list;
            int i4 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final HostnameVerifier getHostnameVerifier$okhttp() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            HostnameVerifier hostnameVerifier = this.hostnameVerifier;
            int i5 = i3 + 17;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return hostnameVerifier;
        }

        public final void setHostnameVerifier$okhttp(@NotNull HostnameVerifier hostnameVerifier) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(hostnameVerifier, "");
                this.hostnameVerifier = hostnameVerifier;
                int i3 = 27 / 0;
            } else {
                Intrinsics.checkNotNullParameter(hostnameVerifier, "");
                this.hostnameVerifier = hostnameVerifier;
            }
            int i4 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public final CertificatePinner getCertificatePinner$okhttp() {
            CertificatePinner certificatePinner;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 91;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                certificatePinner = this.certificatePinner;
                int i4 = 49 / 0;
            } else {
                certificatePinner = this.certificatePinner;
            }
            int i5 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return certificatePinner;
        }

        public final void setCertificatePinner$okhttp(@NotNull CertificatePinner certificatePinner) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(certificatePinner, "");
            this.certificatePinner = certificatePinner;
            int i4 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
            int i5 = i3 + 107;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 29 / 0;
            }
            return certificateChainCleaner;
        }

        public final void setCertificateChainCleaner$okhttp(@Nullable CertificateChainCleaner certificateChainCleaner) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.certificateChainCleaner = certificateChainCleaner;
            if (i3 != 0) {
                int i4 = 34 / 0;
            }
        }

        public final int getCallTimeout$okhttp() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.callTimeout;
            }
            throw null;
        }

        public final void setCallTimeout$okhttp(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 31;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            this.callTimeout = i;
            int i6 = i4 + 59;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }

        public final int getConnectTimeout$okhttp() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.connectTimeout;
            }
            throw null;
        }

        public final void setConnectTimeout$okhttp(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 65;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            this.connectTimeout = i;
            if (i5 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = i3 + 61;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }

        public final int getReadTimeout$okhttp() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = this.readTimeout;
            int i6 = i3 + 51;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final void setReadTimeout$okhttp(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            this.readTimeout = i;
            int i6 = i3 + 17;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }

        public final int getWriteTimeout$okhttp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = this.writeTimeout;
            int i6 = i3 + 101;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final void setWriteTimeout$okhttp(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 73;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            this.writeTimeout = i;
            int i6 = i3 + 75;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 0 / 0;
            }
        }

        public final int getPingInterval$okhttp() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 49;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.pingInterval;
            int i6 = i2 + 29;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final void setPingInterval$okhttp(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 91;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            this.pingInterval = i;
            int i6 = i4 + 103;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }

        public final int getWebSocketCloseTimeout$okhttp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 101;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.webSocketCloseTimeout;
            int i6 = i2 + 27;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            throw null;
        }

        public final void setWebSocketCloseTimeout$okhttp(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            this.webSocketCloseTimeout = i;
            if (i5 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = i3 + 97;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 63 / 0;
            }
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            long j = this.minWebSocketMessageToCompress;
            int i5 = i3 + 69;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return j;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            this.minWebSocketMessageToCompress = j;
            int i5 = i3 + 5;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public final RouteDatabase getRouteDatabase$okhttp() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 87;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            RouteDatabase routeDatabase = this.routeDatabase;
            int i5 = i2 + 49;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 56 / 0;
            }
            return routeDatabase;
        }

        public final void setRouteDatabase$okhttp(@Nullable RouteDatabase routeDatabase) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            this.routeDatabase = routeDatabase;
            int i5 = i3 + 101;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        public final TaskRunner getTaskRunner$okhttp() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            TaskRunner taskRunner = this.taskRunner;
            int i5 = i3 + 51;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return taskRunner;
            }
            throw null;
        }

        public final void setTaskRunner$okhttp(@Nullable TaskRunner taskRunner) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            this.taskRunner = taskRunner;
            int i5 = i3 + 67;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull OkHttpClient okHttpClient) {
            this();
            Intrinsics.checkNotNullParameter(okHttpClient, "");
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            CollectionsKt__MutableCollectionsKt.addAll(this.interceptors, okHttpClient.interceptors());
            CollectionsKt__MutableCollectionsKt.addAll(this.networkInterceptors, okHttpClient.networkInterceptors());
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.fastFallback = okHttpClient.fastFallback();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.x509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.certificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.webSocketCloseTimeout = okHttpClient.webSocketCloseTimeout();
            this.minWebSocketMessageToCompress = okHttpClient.minWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase$okhttp();
            this.taskRunner = okHttpClient.getTaskRunner$okhttp();
        }

        public final Builder dispatcher(@NotNull Dispatcher dispatcher) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dispatcher, "");
            this.dispatcher = dispatcher;
            int i4 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 98 / 0;
            }
            return this;
        }

        public final Builder connectionPool(@NotNull ConnectionPool connectionPool) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(connectionPool, "");
                this.connectionPool = connectionPool;
                throw null;
            }
            Intrinsics.checkNotNullParameter(connectionPool, "");
            this.connectionPool = connectionPool;
            int i3 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return this;
            }
            obj.hashCode();
            throw null;
        }

        public final List<Interceptor> interceptors() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.interceptors;
            }
            throw null;
        }

        public final Builder addInterceptor(@NotNull Interceptor interceptor) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(interceptor, "");
            this.interceptors.add(interceptor);
            int i4 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: -addInterceptor, reason: not valid java name */
        public final Builder m275addInterceptor(@NotNull final Function1<? super Interceptor.Chain, Response> function1) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            Builder builderAddInterceptor = addInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addInterceptor$2
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    Intrinsics.checkNotNullParameter(chain, "");
                    return function1.invoke(chain);
                }
            });
            int i2 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return builderAddInterceptor;
        }

        public final List<Interceptor> networkInterceptors() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 51;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            List<Interceptor> list = this.networkInterceptors;
            int i5 = i2 + 3;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final Builder addNetworkInterceptor(@NotNull Interceptor interceptor) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(interceptor, "");
                this.networkInterceptors.add(interceptor);
                throw null;
            }
            Intrinsics.checkNotNullParameter(interceptor, "");
            this.networkInterceptors.add(interceptor);
            int i3 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        /* renamed from: -addNetworkInterceptor, reason: not valid java name */
        public final Builder m276addNetworkInterceptor(@NotNull final Function1<? super Interceptor.Chain, Response> function1) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            Builder builderAddNetworkInterceptor = addNetworkInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    Intrinsics.checkNotNullParameter(chain, "");
                    return function1.invoke(chain);
                }
            });
            int i2 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return builderAddNetworkInterceptor;
            }
            throw null;
        }

        public final Builder eventListener(@NotNull EventListener eventListener) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(eventListener, "");
            this.eventListenerFactory = _UtilJvmKt.asFactory(eventListener);
            int i4 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder eventListenerFactory(@NotNull EventListener.Factory factory) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(factory, "");
            this.eventListenerFactory = factory;
            int i4 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final Builder retryOnConnectionFailure(boolean z) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            this.retryOnConnectionFailure = z;
            if (i4 != 0) {
                int i5 = 78 / 0;
            }
            int i6 = i3 + 53;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder fastFallback(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.fastFallback = z;
            if (i3 == 0) {
                int i4 = 7 / 0;
            }
            return this;
        }

        public final Builder authenticator(@NotNull Authenticator authenticator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(authenticator, "");
                this.authenticator = authenticator;
                return this;
            }
            Intrinsics.checkNotNullParameter(authenticator, "");
            this.authenticator = authenticator;
            throw null;
        }

        public final Builder followRedirects(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 19;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            this.followRedirects = z;
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i2 + 87;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final Builder followSslRedirects(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 111;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            this.followSslRedirects = z;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i2 + 119;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 82 / 0;
            }
            return this;
        }

        public final Builder cookieJar(@NotNull CookieJar cookieJar) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(cookieJar, "");
                this.cookieJar = cookieJar;
                int i3 = 60 / 0;
            } else {
                Intrinsics.checkNotNullParameter(cookieJar, "");
                this.cookieJar = cookieJar;
            }
            int i4 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final Builder cache(@Nullable Cache cache) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            this.cache = cache;
            int i5 = i3 + 45;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 6 / 0;
            }
            return this;
        }

        public final Builder taskRunner$okhttp(@NotNull TaskRunner taskRunner) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(taskRunner, "");
                this.taskRunner = taskRunner;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(taskRunner, "");
            this.taskRunner = taskRunner;
            int i3 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final Builder dns(@NotNull Dns dns) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dns, "");
            if (!Intrinsics.areEqual(dns, this.dns)) {
                int i4 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i4 % 128;
                Object obj = null;
                if (i4 % 2 == 0) {
                    this.routeDatabase = null;
                    obj.hashCode();
                    throw null;
                }
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        public final Builder proxy(@Nullable Proxy proxy) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!Intrinsics.areEqual(proxy, this.proxy)) {
                int i4 = onExtraCallbackWithResult + 7;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            int i6 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final Builder proxySelector(@NotNull ProxySelector proxySelector) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(proxySelector, "");
            if (!Intrinsics.areEqual(proxySelector, this.proxySelector)) {
                int i4 = IAuthTabCallback + 3;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector;
            int i6 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder proxyAuthenticator(@NotNull Authenticator authenticator) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(authenticator, "");
            if (!Intrinsics.areEqual(authenticator, this.proxyAuthenticator)) {
                this.routeDatabase = null;
                int i2 = IAuthTabCallback + 21;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
            }
            this.proxyAuthenticator = authenticator;
            int i4 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final Builder socketFactory(@NotNull SocketFactory socketFactory) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(socketFactory, "");
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            Object obj = null;
            if (!Intrinsics.areEqual(socketFactory, this.socketFactory)) {
                this.routeDatabase = null;
            }
            this.socketFactory = socketFactory;
            int i4 = onExtraCallbackWithResult + 43;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            obj.hashCode();
            throw null;
        }

        @Deprecated
        public final Builder sslSocketFactory(@NotNull SSLSocketFactory sSLSocketFactory) throws ClassNotFoundException {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(sSLSocketFactory, "");
            Object obj = null;
            if (!Intrinsics.areEqual(sSLSocketFactory, this.sslSocketFactoryOrNull)) {
                int i2 = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    this.routeDatabase = null;
                    int i3 = 76 / 0;
                } else {
                    this.routeDatabase = null;
                }
            }
            this.sslSocketFactoryOrNull = sSLSocketFactory;
            Platform.Companion companion = Platform.Companion;
            X509TrustManager x509TrustManagerTrustManager = companion.get().trustManager(sSLSocketFactory);
            if (x509TrustManagerTrustManager == null) {
                throw new IllegalStateException("Unable to extract the trust manager on " + companion.get() + ", sslSocketFactory is " + sSLSocketFactory.getClass());
            }
            int i4 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            this.x509TrustManagerOrNull = x509TrustManagerTrustManager;
            Platform platform = companion.get();
            X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
            Intrinsics.checkNotNull(x509TrustManager);
            this.certificateChainCleaner = platform.buildCertificateChainCleaner(x509TrustManager);
            int i6 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return this;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Builder sslSocketFactory(@NotNull SSLSocketFactory sSLSocketFactory, @NotNull X509TrustManager x509TrustManager) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(sSLSocketFactory, "");
            Intrinsics.checkNotNullParameter(x509TrustManager, "");
            Object obj = null;
            if (!Intrinsics.areEqual(sSLSocketFactory, this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            } else {
                int i2 = onExtraCallbackWithResult + 101;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.areEqual(x509TrustManager, this.x509TrustManagerOrNull);
                    obj.hashCode();
                    throw null;
                }
                if (!Intrinsics.areEqual(x509TrustManager, this.x509TrustManagerOrNull)) {
                }
            }
            this.sslSocketFactoryOrNull = sSLSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.Companion.get(x509TrustManager);
            this.x509TrustManagerOrNull = x509TrustManager;
            int i3 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final Builder connectionSpecs(@NotNull List<ConnectionSpec> list) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            if (!Intrinsics.areEqual(list, this.connectionSpecs)) {
                int i4 = IAuthTabCallback + 93;
                onExtraCallbackWithResult = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    this.routeDatabase = null;
                    obj.hashCode();
                    throw null;
                }
                this.routeDatabase = null;
            }
            this.connectionSpecs = _UtilJvmKt.toImmutableList(list);
            return this;
        }

        public final Builder protocols(@NotNull List<? extends Protocol> list) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(list, "");
                CollectionsKt___CollectionsKt.toMutableList((Collection) list).contains(Protocol.H2_PRIOR_KNOWLEDGE);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(list, "");
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!mutableList.contains(protocol) && !mutableList.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + mutableList).toString());
            }
            if (mutableList.contains(protocol) && mutableList.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + mutableList).toString());
            }
            if (mutableList.contains(Protocol.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + mutableList).toString());
            }
            Intrinsics.checkNotNull(mutableList, "");
            if (mutableList.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            mutableList.remove(Protocol.SPDY_3);
            if (!Intrinsics.areEqual(mutableList, this.protocols)) {
                int i3 = onExtraCallbackWithResult + 65;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    this.routeDatabase = null;
                    obj.hashCode();
                    throw null;
                }
                this.routeDatabase = null;
            }
            List<? extends Protocol> listUnmodifiableList = Collections.unmodifiableList(mutableList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "");
            this.protocols = listUnmodifiableList;
            return this;
        }

        public final Builder hostnameVerifier(@NotNull HostnameVerifier hostnameVerifier) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(hostnameVerifier, "");
            if (!Intrinsics.areEqual(hostnameVerifier, this.hostnameVerifier)) {
                int i2 = onExtraCallbackWithResult + 17;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                this.routeDatabase = null;
                int i5 = i3 + 53;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        public final Builder certificatePinner(@NotNull CertificatePinner certificatePinner) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(certificatePinner, "");
                Intrinsics.areEqual(certificatePinner, this.certificatePinner);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(certificatePinner, "");
            if (!Intrinsics.areEqual(certificatePinner, this.certificatePinner)) {
                int i3 = IAuthTabCallback + 89;
                int i4 = i3 % 128;
                onExtraCallbackWithResult = i4;
                if (i3 % 2 != 0) {
                    this.routeDatabase = null;
                    obj.hashCode();
                    throw null;
                }
                this.routeDatabase = null;
                int i5 = i4 + 75;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        public final Builder callTimeout(long j, @NotNull TimeUnit timeUnit) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(timeUnit, "");
            Object[] objArr = new Object[1];
            a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6, (char) ((-1) - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0')), objArr);
            this.callTimeout = _UtilJvmKt.checkDuration(((String) objArr[0]).intern(), j, timeUnit);
            int i4 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final Builder callTimeout(@NotNull Duration duration) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(duration, "");
            callTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            int i4 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        /* renamed from: callTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m277callTimeoutLRDsOJo(long j) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.callTimeout = _UtilJvmKt.m307checkDurationHG0u8IE("duration", j);
            int i4 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final Builder connectTimeout(long j, @NotNull TimeUnit timeUnit) throws Throwable {
            Object obj;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(timeUnit, "");
                Object[] objArr = new Object[1];
                a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 13 / (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) View.MeasureSpec.makeMeasureSpec(1, 1), objArr);
                obj = objArr[0];
            } else {
                Intrinsics.checkNotNullParameter(timeUnit, "");
                Object[] objArr2 = new Object[1];
                a(1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 8 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
                obj = objArr2[0];
            }
            this.connectTimeout = _UtilJvmKt.checkDuration(((String) obj).intern(), j, timeUnit);
            return this;
        }

        public final Builder connectTimeout(@NotNull Duration duration) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(duration, "");
            connectTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            int i4 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 93 / 0;
            }
            return this;
        }

        /* renamed from: connectTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m278connectTimeoutLRDsOJo(long j) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            this.connectTimeout = _UtilJvmKt.m307checkDurationHG0u8IE("duration", j);
            if (i3 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            obj.hashCode();
            throw null;
        }

        public final Builder readTimeout(long j, @NotNull TimeUnit timeUnit) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(timeUnit, "");
            Object[] objArr = new Object[1];
            a(ViewConfiguration.getMaximumFlingVelocity() >> 16, 7 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((-1) - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET)), objArr);
            this.readTimeout = _UtilJvmKt.checkDuration(((String) objArr[0]).intern(), j, timeUnit);
            int i4 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final Builder readTimeout(@NotNull Duration duration) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(duration, "");
                readTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
                throw null;
            }
            Intrinsics.checkNotNullParameter(duration, "");
            readTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            int i3 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return this;
            }
            obj.hashCode();
            throw null;
        }

        /* renamed from: readTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m280readTimeoutLRDsOJo(long j) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.readTimeout = _UtilJvmKt.m307checkDurationHG0u8IE("duration", j);
            if (i3 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder writeTimeout(long j, @NotNull TimeUnit timeUnit) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(timeUnit, "");
            Object[] objArr = new Object[1];
            a(ViewConfiguration.getScrollDefaultDelay() >> 16, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 7, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
            this.writeTimeout = _UtilJvmKt.checkDuration(((String) objArr[0]).intern(), j, timeUnit);
            int i4 = onExtraCallbackWithResult + 85;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 8 / 0;
            }
            return this;
        }

        public final Builder writeTimeout(@NotNull Duration duration) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(duration, "");
            writeTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            int i4 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* renamed from: writeTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m282writeTimeoutLRDsOJo(long j) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.writeTimeout = _UtilJvmKt.m307checkDurationHG0u8IE("duration", j);
            if (i3 != 0) {
                int i4 = 86 / 0;
            }
            return this;
        }

        public final Builder pingInterval(long j, @NotNull TimeUnit timeUnit) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(timeUnit, "");
                this.pingInterval = _UtilJvmKt.checkDuration("interval", j, timeUnit);
                return this;
            }
            Intrinsics.checkNotNullParameter(timeUnit, "");
            this.pingInterval = _UtilJvmKt.checkDuration("interval", j, timeUnit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder pingInterval(@NotNull Duration duration) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(duration, "");
            pingInterval(duration.toMillis(), TimeUnit.MILLISECONDS);
            int i4 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* renamed from: pingInterval-LRDsOJo, reason: not valid java name */
        public final Builder m279pingIntervalLRDsOJo(long j) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.pingInterval = _UtilJvmKt.m307checkDurationHG0u8IE("duration", j);
            int i4 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final Builder webSocketCloseTimeout(long j, @NotNull TimeUnit timeUnit) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(timeUnit, "");
                this.webSocketCloseTimeout = _UtilJvmKt.checkDuration("webSocketCloseTimeout", j, timeUnit);
                return this;
            }
            Intrinsics.checkNotNullParameter(timeUnit, "");
            this.webSocketCloseTimeout = _UtilJvmKt.checkDuration("webSocketCloseTimeout", j, timeUnit);
            throw null;
        }

        public final Builder webSocketCloseTimeout(@NotNull Duration duration) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(duration, "");
                webSocketCloseTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
                int i3 = 64 / 0;
            } else {
                Intrinsics.checkNotNullParameter(duration, "");
                webSocketCloseTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            }
            int i4 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        /* renamed from: webSocketCloseTimeout-LRDsOJo, reason: not valid java name */
        public final Builder m281webSocketCloseTimeoutLRDsOJo(long j) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.webSocketCloseTimeout = _UtilJvmKt.m307checkDurationHG0u8IE("duration", j);
            int i4 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final Builder minWebSocketMessageToCompress(long j) {
            int i = 2 % 2;
            if (j >= 0) {
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 47;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    this.minWebSocketMessageToCompress = j;
                    int i4 = 32 / 0;
                } else {
                    this.minWebSocketMessageToCompress = j;
                }
                int i5 = i2 + 85;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return this;
            }
            throw new IllegalArgumentException(("minWebSocketMessageToCompress must be positive: " + j).toString());
        }

        public final OkHttpClient build() {
            int i = 2 % 2;
            OkHttpClient okHttpClient = new OkHttpClient(this);
            int i2 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return okHttpClient;
            }
            throw null;
        }
    }

    public OkHttpClient(@NotNull Builder builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector$okhttp;
        Intrinsics.checkNotNullParameter(builder, "");
        builder.eventListenerFactory(NetworkUsageEventListenerFactory.wrapIfNeeded(builder.getEventListenerFactory$okhttp()));
        NetworkUsageInterceptor.addIfNeeded(builder);
        this.dispatcher = builder.getDispatcher$okhttp();
        this.interceptors = _UtilJvmKt.toImmutableList(builder.getInterceptors$okhttp());
        this.networkInterceptors = _UtilJvmKt.toImmutableList(builder.getNetworkInterceptors$okhttp());
        this.eventListenerFactory = builder.getEventListenerFactory$okhttp();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure$okhttp();
        this.fastFallback = builder.getFastFallback$okhttp();
        this.authenticator = builder.getAuthenticator$okhttp();
        this.followRedirects = builder.getFollowRedirects$okhttp();
        this.followSslRedirects = builder.getFollowSslRedirects$okhttp();
        this.cookieJar = builder.getCookieJar$okhttp();
        this.cache = builder.getCache$okhttp();
        this.dns = builder.getDns$okhttp();
        this.proxy = builder.getProxy$okhttp();
        if (builder.getProxy$okhttp() != null) {
            proxySelector$okhttp = NullProxySelector.INSTANCE;
        } else {
            proxySelector$okhttp = builder.getProxySelector$okhttp();
            if (proxySelector$okhttp == null && (proxySelector$okhttp = ProxySelector.getDefault()) == null) {
                proxySelector$okhttp = NullProxySelector.INSTANCE;
            }
        }
        this.proxySelector = proxySelector$okhttp;
        this.proxyAuthenticator = builder.getProxyAuthenticator$okhttp();
        this.socketFactory = builder.getSocketFactory$okhttp();
        List<ConnectionSpec> connectionSpecs$okhttp = builder.getConnectionSpecs$okhttp();
        this.connectionSpecs = connectionSpecs$okhttp;
        this.protocols = builder.getProtocols$okhttp();
        this.hostnameVerifier = builder.getHostnameVerifier$okhttp();
        this.callTimeoutMillis = builder.getCallTimeout$okhttp();
        this.connectTimeoutMillis = builder.getConnectTimeout$okhttp();
        this.readTimeoutMillis = builder.getReadTimeout$okhttp();
        this.writeTimeoutMillis = builder.getWriteTimeout$okhttp();
        this.pingIntervalMillis = builder.getPingInterval$okhttp();
        this.webSocketCloseTimeout = builder.getWebSocketCloseTimeout$okhttp();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress$okhttp();
        RouteDatabase routeDatabase$okhttp = builder.getRouteDatabase$okhttp();
        this.routeDatabase = routeDatabase$okhttp == null ? new RouteDatabase() : routeDatabase$okhttp;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp == null ? TaskRunner.INSTANCE : taskRunner$okhttp;
        ConnectionPool connectionPool$okhttp = builder.getConnectionPool$okhttp();
        if (connectionPool$okhttp == null) {
            connectionPool$okhttp = new ConnectionPool();
            builder.setConnectionPool$okhttp(connectionPool$okhttp);
        }
        this.connectionPool = connectionPool$okhttp;
        List<ConnectionSpec> list = connectionSpecs$okhttp;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).isTls()) {
                    if (builder.getSslSocketFactoryOrNull$okhttp() != null) {
                        this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull$okhttp();
                        CertificateChainCleaner certificateChainCleaner$okhttp = builder.getCertificateChainCleaner$okhttp();
                        Intrinsics.checkNotNull(certificateChainCleaner$okhttp);
                        this.certificateChainCleaner = certificateChainCleaner$okhttp;
                        X509TrustManager x509TrustManagerOrNull$okhttp = builder.getX509TrustManagerOrNull$okhttp();
                        Intrinsics.checkNotNull(x509TrustManagerOrNull$okhttp);
                        this.x509TrustManager = x509TrustManagerOrNull$okhttp;
                        this.certificatePinner = builder.getCertificatePinner$okhttp().withCertificateChainCleaner$okhttp(certificateChainCleaner$okhttp);
                    } else {
                        Platform.Companion companion = Platform.Companion;
                        X509TrustManager x509TrustManagerPlatformTrustManager = companion.get().platformTrustManager();
                        this.x509TrustManager = x509TrustManagerPlatformTrustManager;
                        this.sslSocketFactoryOrNull = companion.get().newSslSocketFactory(x509TrustManagerPlatformTrustManager);
                        CertificateChainCleaner certificateChainCleaner = CertificateChainCleaner.Companion.get(x509TrustManagerPlatformTrustManager);
                        this.certificateChainCleaner = certificateChainCleaner;
                        this.certificatePinner = builder.getCertificatePinner$okhttp().withCertificateChainCleaner$okhttp(certificateChainCleaner);
                    }
                }
            }
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
        }
        verifyClientState();
    }

    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    public final boolean fastFallback() {
        return this.fastFallback;
    }

    public final Authenticator authenticator() {
        return this.authenticator;
    }

    public final boolean followRedirects() {
        return this.followRedirects;
    }

    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    public final Cache cache() {
        return this.cache;
    }

    public final Dns dns() {
        return this.dns;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final X509TrustManager x509TrustManager() {
        return this.x509TrustManager;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public final CertificateChainCleaner certificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public final int webSocketCloseTimeout() {
        return this.webSocketCloseTimeout;
    }

    public final long minWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    public final RouteDatabase getRouteDatabase$okhttp() {
        return this.routeDatabase;
    }

    public final TaskRunner getTaskRunner$okhttp() {
        return this.taskRunner;
    }

    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    public OkHttpClient() {
        this(new Builder());
    }

    public final Address address(@NotNull HttpUrl httpUrl) {
        SSLSocketFactory sslSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        Intrinsics.checkNotNullParameter(httpUrl, "");
        if (httpUrl.isHttps()) {
            sslSocketFactory = sslSocketFactory();
            hostnameVerifier = this.hostnameVerifier;
            certificatePinner = this.certificatePinner;
        } else {
            sslSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.dns, this.socketFactory, sslSocketFactory, hostnameVerifier, certificatePinner, this.proxyAuthenticator, this.proxy, this.protocols, this.connectionSpecs, this.proxySelector);
    }

    private final void verifyClientState() {
        List<Interceptor> list = this.interceptors;
        Intrinsics.checkNotNull(list, "");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.interceptors).toString());
        }
        List<Interceptor> list2 = this.networkInterceptors;
        Intrinsics.checkNotNull(list2, "");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.networkInterceptors).toString());
        }
        List<ConnectionSpec> list3 = this.connectionSpecs;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).isTls()) {
                    if (this.sslSocketFactoryOrNull == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.certificateChainCleaner == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.sslSocketFactoryOrNull != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.certificateChainCleaner != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.areEqual(this.certificatePinner, CertificatePinner.DEFAULT)) {
            throw new IllegalStateException("Check failed.");
        }
        Unit unit = Unit.INSTANCE;
    }

    @Override // okhttp3.Call.Factory
    public Call newCall(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "");
        return new RealCall(this, request, false);
    }

    @Override // okhttp3.WebSocket.Factory
    public WebSocket newWebSocket(@NotNull Request request, @NotNull WebSocketListener webSocketListener) {
        WebSocketListener webSocketListenerOnExtraCallbackWithResult = a1ExternalSyntheticLambda1.onExtraCallbackWithResult(webSocketListener);
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(webSocketListenerOnExtraCallbackWithResult, "");
        RealWebSocket realWebSocket = new RealWebSocket(this.taskRunner, request, webSocketListenerOnExtraCallbackWithResult, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress, this.webSocketCloseTimeout);
        realWebSocket.connect(this);
        return a1b.IAuthTabCallback(realWebSocket);
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    @Deprecated
    /* renamed from: -deprecated_dispatcher, reason: not valid java name */
    public final Dispatcher m257deprecated_dispatcher() {
        return this.dispatcher;
    }

    @Deprecated
    /* renamed from: -deprecated_connectionPool, reason: not valid java name */
    public final ConnectionPool m254deprecated_connectionPool() {
        return this.connectionPool;
    }

    @Deprecated
    /* renamed from: -deprecated_interceptors, reason: not valid java name */
    public final List<Interceptor> m263deprecated_interceptors() {
        return this.interceptors;
    }

    @Deprecated
    /* renamed from: -deprecated_networkInterceptors, reason: not valid java name */
    public final List<Interceptor> m264deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    @Deprecated
    /* renamed from: -deprecated_eventListenerFactory, reason: not valid java name */
    public final EventListener.Factory m259deprecated_eventListenerFactory() {
        return this.eventListenerFactory;
    }

    @Deprecated
    /* renamed from: -deprecated_retryOnConnectionFailure, reason: not valid java name */
    public final boolean m271deprecated_retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @Deprecated
    /* renamed from: -deprecated_authenticator, reason: not valid java name */
    public final Authenticator m249deprecated_authenticator() {
        return this.authenticator;
    }

    @Deprecated
    /* renamed from: -deprecated_followRedirects, reason: not valid java name */
    public final boolean m260deprecated_followRedirects() {
        return this.followRedirects;
    }

    @Deprecated
    /* renamed from: -deprecated_followSslRedirects, reason: not valid java name */
    public final boolean m261deprecated_followSslRedirects() {
        return this.followSslRedirects;
    }

    @Deprecated
    /* renamed from: -deprecated_cookieJar, reason: not valid java name */
    public final CookieJar m256deprecated_cookieJar() {
        return this.cookieJar;
    }

    @Deprecated
    /* renamed from: -deprecated_cache, reason: not valid java name */
    public final Cache m250deprecated_cache() {
        return this.cache;
    }

    @Deprecated
    /* renamed from: -deprecated_dns, reason: not valid java name */
    public final Dns m258deprecated_dns() {
        return this.dns;
    }

    @Deprecated
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m267deprecated_proxy() {
        return this.proxy;
    }

    @Deprecated
    /* renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m269deprecated_proxySelector() {
        return this.proxySelector;
    }

    @Deprecated
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final Authenticator m268deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @Deprecated
    /* renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m272deprecated_socketFactory() {
        return this.socketFactory;
    }

    @Deprecated
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m273deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    @Deprecated
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m255deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @Deprecated
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m266deprecated_protocols() {
        return this.protocols;
    }

    @Deprecated
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m262deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @Deprecated
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final CertificatePinner m252deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @Deprecated
    /* renamed from: -deprecated_callTimeoutMillis, reason: not valid java name */
    public final int m251deprecated_callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @Deprecated
    /* renamed from: -deprecated_connectTimeoutMillis, reason: not valid java name */
    public final int m253deprecated_connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Deprecated
    /* renamed from: -deprecated_readTimeoutMillis, reason: not valid java name */
    public final int m270deprecated_readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Deprecated
    /* renamed from: -deprecated_writeTimeoutMillis, reason: not valid java name */
    public final int m274deprecated_writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @Deprecated
    /* renamed from: -deprecated_pingIntervalMillis, reason: not valid java name */
    public final int m265deprecated_pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.DEFAULT_PROTOCOLS;
        }

        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.DEFAULT_CONNECTION_SPECS;
        }
    }
}
