package okhttp3.internal.connection;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.reflect.Method;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TTBaseActivity;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.FlowControlListener;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.url._UrlKt;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection, ExchangeCodec.Carrier, Lockable {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static long IAuthTabCallback = 0;
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private int allocationLimit;
    private final List<Reference<RealCall>> calls;
    private final ConnectionListener connectionListener;
    private final RealConnectionPool connectionPool;
    private final Handshake handshake;
    private Http2Connection http2Connection;
    private long idleAtNs;
    private final Socket javaNetSocket;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private final int pingIntervalMillis;
    private final Protocol protocol;
    private final Socket rawSocket;
    private int refusedStreamCount;
    private final Route route;
    private int routeFailureCount;
    private final BufferedSocket socket;
    private int successCount;
    private final TaskRunner taskRunner;

    static {
        onExtraCallbackWithResult();
        Companion = new Companion(null);
        int i = onExtraCallbackWithResult + 87;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public RealConnection(@NotNull TaskRunner taskRunner, @NotNull RealConnectionPool realConnectionPool, @NotNull Route route, @NotNull Socket socket, @NotNull Socket socket2, @Nullable Handshake handshake, @NotNull Protocol protocol, @NotNull BufferedSocket bufferedSocket, int i, @NotNull ConnectionListener connectionListener) {
        Intrinsics.checkNotNullParameter(taskRunner, "");
        Intrinsics.checkNotNullParameter(realConnectionPool, "");
        Intrinsics.checkNotNullParameter(route, "");
        Intrinsics.checkNotNullParameter(socket, "");
        Intrinsics.checkNotNullParameter(socket2, "");
        Intrinsics.checkNotNullParameter(protocol, "");
        Intrinsics.checkNotNullParameter(bufferedSocket, "");
        Intrinsics.checkNotNullParameter(connectionListener, "");
        this.taskRunner = taskRunner;
        this.connectionPool = realConnectionPool;
        this.route = route;
        this.rawSocket = socket;
        this.javaNetSocket = socket2;
        this.handshake = handshake;
        this.protocol = protocol;
        this.socket = bufferedSocket;
        this.pingIntervalMillis = i;
        this.connectionListener = connectionListener;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = LongCompanionObject.MAX_VALUE;
    }

    public final TaskRunner getTaskRunner() {
        TaskRunner taskRunner;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 55;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            taskRunner = this.taskRunner;
            int i4 = 85 / 0;
        } else {
            taskRunner = this.taskRunner;
        }
        int i5 = i2 + 119;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return taskRunner;
    }

    public final RealConnectionPool getConnectionPool() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        RealConnectionPool realConnectionPool = this.connectionPool;
        int i5 = i3 + 91;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return realConnectionPool;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public Route getRoute() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Route route = this.route;
        int i5 = i2 + 111;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return route;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $10 + 43;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24, 19627 - Gravity.getAbsoluteGravity(0, 0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                try {
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 'k' - AndroidCharacter.getMirror('0'), AndroidCharacter.getMirror('0') + 6335, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            try {
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE), (KeyEvent.getMaxKeyCode() >> 16) + 59, (ViewConfiguration.getLongPressTimeout() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        String str = new String(cArr2);
        int i6 = $10 + 107;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    public final ConnectionListener getConnectionListener$okhttp() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        ConnectionListener connectionListener = this.connectionListener;
        int i4 = i3 + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return connectionListener;
    }

    public final boolean getNoNewExchanges() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        boolean z = this.noNewExchanges;
        int i5 = i3 + 39;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final void setNoNewExchanges(boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 51;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.noNewExchanges = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 13;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final int getRouteFailureCount$okhttp() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = this.routeFailureCount;
        int i6 = i3 + 67;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setRouteFailureCount$okhttp(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 103;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.routeFailureCount = i;
        int i6 = i4 + 53;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getAllocationLimit$okhttp() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = this.allocationLimit;
        int i6 = i3 + 21;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final List<Reference<RealCall>> getCalls() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        List<Reference<RealCall>> list = this.calls;
        int i5 = i2 + 11;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final long getIdleAtNs() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.idleAtNs;
        }
        int i3 = 44 / 0;
        return this.idleAtNs;
    }

    public final void setIdleAtNs(long j) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.idleAtNs = j;
        if (i3 == 0) {
            throw null;
        }
    }

    public final boolean isMultiplexed$okhttp() {
        int i = 2 % 2;
        if (this.http2Connection == null) {
            return false;
        }
        int i2 = onNavigationEvent;
        int i3 = i2 + 55;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 105;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final void start() throws IOException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            this.idleAtNs = System.nanoTime();
            Protocol protocol = this.protocol;
            if (protocol != Protocol.HTTP_2) {
                int i3 = onNavigationEvent + 59;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (protocol != Protocol.H2_PRIOR_KNOWLEDGE) {
                    return;
                }
            }
            startHttp2();
            int i5 = onWarmupCompleted + 83;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        this.idleAtNs = System.nanoTime();
        Protocol protocol2 = Protocol.HTTP_2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void startHttp2() throws IOException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.javaNetSocket.setSoTimeout(0);
        Object obj = this.connectionListener;
        FlowControlListener flowControlListener = obj instanceof FlowControlListener ? (FlowControlListener) obj : null;
        if (flowControlListener == null) {
            int i4 = onWarmupCompleted + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            flowControlListener = FlowControlListener.None.INSTANCE;
            int i6 = onNavigationEvent + 41;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        Http2Connection http2ConnectionBuild = new Http2Connection.Builder(true, this.taskRunner).socket(this.socket, getRoute().address().url().host()).listener(this).pingIntervalMillis(this.pingIntervalMillis).flowControlListener(flowControlListener).build();
        this.http2Connection = http2ConnectionBuild;
        this.allocationLimit = Http2Connection.Companion.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        Http2Connection.start$default(http2ConnectionBuild, false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isEligible$okhttp(@NotNull Address address, @Nullable List<Route> list) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(address, "");
            int i3 = 74 / 0;
            if (_UtilJvmKt.assertionsEnabled) {
                if (!Thread.holdsLock(this)) {
                    throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(address, "");
            if (_UtilJvmKt.assertionsEnabled) {
            }
        }
        if (this.calls.size() < this.allocationLimit) {
            int i4 = onWarmupCompleted + 57;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 33 / 0;
                if (!this.noNewExchanges) {
                    if (!getRoute().address().equalsNonHost$okhttp(address)) {
                        int i6 = onNavigationEvent + 107;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        return false;
                    }
                    if (Intrinsics.areEqual(address.url().host(), route().address().url().host())) {
                        return true;
                    }
                    if (this.http2Connection != null && list != null && routeMatchesAny(list)) {
                        int i8 = onNavigationEvent + 97;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 != 0) {
                            address.hostnameVerifier();
                            OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.INSTANCE;
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (address.hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
                            return false;
                        }
                        try {
                            CertificatePinner certificatePinner = address.certificatePinner();
                            Intrinsics.checkNotNull(certificatePinner);
                            String strHost = address.url().host();
                            Handshake handshake = handshake();
                            Intrinsics.checkNotNull(handshake);
                            certificatePinner.check(strHost, handshake.peerCertificates());
                            return true;
                        } catch (SSLPeerUnverifiedException unused) {
                        }
                    }
                }
            } else if (!this.noNewExchanges) {
            }
        }
        return false;
    }

    private final boolean routeMatchesAny(List<Route> list) {
        int i = 2 % 2;
        List<Route> list2 = list;
        if (!(!(list2 instanceof Collection))) {
            int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (list2.isEmpty()) {
                return false;
            }
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int i4 = onWarmupCompleted + 77;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                ((Route) it.next()).proxy().type();
                Proxy.Type type = Proxy.Type.DIRECT;
                throw null;
            }
            Route route = (Route) it.next();
            Proxy.Type type2 = route.proxy().type();
            Proxy.Type type3 = Proxy.Type.DIRECT;
            if (type2 == type3 && getRoute().proxy().type() == type3 && Intrinsics.areEqual(getRoute().socketAddress(), route.socketAddress())) {
                return true;
            }
        }
        int i5 = onNavigationEvent + 37;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private final boolean supportsUrl(HttpUrl httpUrl) {
        int i = 2 % 2;
        if (!_UtilJvmKt.assertionsEnabled || Thread.holdsLock(this)) {
            HttpUrl httpUrlUrl = getRoute().address().url();
            if (httpUrl.port() == httpUrlUrl.port()) {
                if (Intrinsics.areEqual(httpUrl.host(), httpUrlUrl.host())) {
                    return true;
                }
                if (!this.noCoalescedConnections) {
                    int i2 = onWarmupCompleted + 77;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    Handshake handshake = this.handshake;
                    if (handshake != null && certificateSupportHost(httpUrl, handshake)) {
                        int i4 = onWarmupCompleted;
                        int i5 = i4 + 103;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        int i7 = i4 + 17;
                        onNavigationEvent = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 45 / 0;
                        }
                        return true;
                    }
                }
                return false;
            }
            int i9 = onWarmupCompleted;
            int i10 = i9 + 53;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 89;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 != 0) {
                return false;
            }
            throw null;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    private final boolean certificateSupportHost(HttpUrl httpUrl, Handshake handshake) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            List<Certificate> listPeerCertificates = handshake.peerCertificates();
            if (!listPeerCertificates.isEmpty()) {
                OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.INSTANCE;
                String strHost = httpUrl.host();
                Certificate certificate = listPeerCertificates.get(0);
                Intrinsics.checkNotNull(certificate, "");
                if (okHostnameVerifier.verify(strHost, (X509Certificate) certificate)) {
                    int i3 = onWarmupCompleted + 51;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return true;
                }
            }
            return false;
        }
        handshake.peerCertificates().isEmpty();
        throw null;
    }

    public final ExchangeCodec newCodec$okhttp(@NotNull OkHttpClient okHttpClient, @NotNull RealInterceptorChain realInterceptorChain) throws SocketException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        Intrinsics.checkNotNullParameter(realInterceptorChain, "");
        BufferedSocket bufferedSocket = this.socket;
        Http2Connection http2Connection = this.http2Connection;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, http2Connection);
        }
        this.javaNetSocket.setSoTimeout(realInterceptorChain.readTimeoutMillis());
        Timeout timeout = bufferedSocket.getSource().timeout();
        long readTimeoutMillis$okhttp = realInterceptorChain.getReadTimeoutMillis$okhttp();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(readTimeoutMillis$okhttp, timeUnit);
        bufferedSocket.getSink().timeout().timeout(realInterceptorChain.getWriteTimeoutMillis$okhttp(), timeUnit);
        Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(okHttpClient, this, bufferedSocket);
        int i4 = onWarmupCompleted + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return http1ExchangeCodec;
        }
        throw null;
    }

    public final void useAsSocket$okhttp() throws SocketException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.javaNetSocket.setSoTimeout(0);
        noNewExchanges();
        int i4 = onWarmupCompleted + 15;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // okhttp3.Connection
    public Route route() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Route route = getRoute();
        int i4 = onWarmupCompleted + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return route;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    /* renamed from: cancel */
    public void mo308cancel() throws IOException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        _UtilJvmKt.closeQuietly(this.rawSocket);
        int i4 = onNavigationEvent + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // okhttp3.Connection
    public Socket socket() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Socket socket = this.javaNetSocket;
        int i5 = i2 + 65;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return socket;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(@NotNull Http2Stream http2Stream) throws IOException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(http2Stream, "");
        http2Stream.close(ErrorCode.REFUSED_STREAM, null);
        int i4 = onWarmupCompleted + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // okhttp3.Connection
    public Handshake handshake() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 97;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Handshake handshake = this.handshake;
        int i4 = i2 + 61;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return handshake;
    }

    public final void connectFailed$okhttp(@NotNull OkHttpClient okHttpClient, @NotNull Route route, @NotNull IOException iOException) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(okHttpClient, "");
            Intrinsics.checkNotNullParameter(route, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            route.proxy().type();
            Proxy.Type type = Proxy.Type.DIRECT;
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        Intrinsics.checkNotNullParameter(route, "");
        Intrinsics.checkNotNullParameter(iOException, "");
        if (route.proxy().type() != Proxy.Type.DIRECT) {
            Address address = route.address();
            address.proxySelector().connectFailed(address.url().uri(), route.proxy().address(), iOException);
            int i3 = onWarmupCompleted + 111;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
        okHttpClient.getRouteDatabase$okhttp().failed(route);
    }

    @Override // okhttp3.Connection
    public Protocol protocol() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Protocol protocol = this.protocol;
        int i5 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return protocol;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() throws Throwable {
        Object objIntern;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(getRoute().address().url().host());
        sb.append(':');
        sb.append(getRoute().address().url().port());
        sb.append(", proxy=");
        sb.append(getRoute().proxy());
        sb.append(" hostAddress=");
        sb.append(getRoute().socketAddress());
        sb.append(" cipherSuite=");
        Handshake handshake = this.handshake;
        if (handshake != null) {
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            objIntern = handshake.cipherSuite();
            if (objIntern == null) {
                Object[] objArr = new Object[1];
                a(new char[]{50929, 1729, 18067, 34409}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 49201, objArr);
                objIntern = ((String) objArr[0]).intern();
                int i4 = onNavigationEvent + 1;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 % 5;
                }
            }
        }
        sb.append(objIntern);
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RealConnection newTestConnection(@NotNull TaskRunner taskRunner, @NotNull RealConnectionPool realConnectionPool, @NotNull Route route, @NotNull Socket socket, long j) {
            Intrinsics.checkNotNullParameter(taskRunner, "");
            Intrinsics.checkNotNullParameter(realConnectionPool, "");
            Intrinsics.checkNotNullParameter(route, "");
            Intrinsics.checkNotNullParameter(socket, "");
            RealConnection realConnection = new RealConnection(taskRunner, realConnectionPool, route, new Socket(), socket, null, Protocol.HTTP_2, new BufferedSocket() { // from class: okhttp3.internal.connection.RealConnection$Companion$newTestConnection$bufferedSocket$1
                private final TTBaseActivity sink = new TTBaseActivity();
                private final TTBaseActivity source = new TTBaseActivity();

                @Override // o.TTHistoryActivity5
                public void cancel() {
                }

                @Override // o.TTHistoryActivity5
                public TTBaseActivity getSink() {
                    return this.sink;
                }

                @Override // o.TTHistoryActivity5
                public TTBaseActivity getSource() {
                    return this.source;
                }
            }, 0, ConnectionListener.Companion.getNONE());
            realConnection.setIdleAtNs(j);
            return realConnection;
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void noNewExchanges() {
        synchronized (this) {
            this.noNewExchanges = true;
            Unit unit = Unit.INSTANCE;
        }
        this.connectionListener.noNewExchanges(this);
    }

    public final void noCoalescedConnections$okhttp() {
        synchronized (this) {
            this.noCoalescedConnections = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void incrementSuccessCount$okhttp() {
        synchronized (this) {
            this.successCount++;
        }
    }

    public final boolean isHealthy(boolean z) {
        long j;
        if (!_UtilJvmKt.assertionsEnabled || !Thread.holdsLock(this)) {
            long jNanoTime = System.nanoTime();
            if (this.rawSocket.isClosed() || this.javaNetSocket.isClosed() || this.javaNetSocket.isInputShutdown() || this.javaNetSocket.isOutputShutdown()) {
                return false;
            }
            Http2Connection http2Connection = this.http2Connection;
            if (http2Connection != null) {
                return http2Connection.isHealthy(jNanoTime);
            }
            synchronized (this) {
                j = this.idleAtNs;
            }
            if (jNanoTime - j < IDLE_CONNECTION_HEALTHY_NS || !z) {
                return true;
            }
            return _UtilJvmKt.isHealthy(this.javaNetSocket, this.socket.getSource());
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onSettings(@NotNull Http2Connection http2Connection, @NotNull Settings settings) {
        Intrinsics.checkNotNullParameter(http2Connection, "");
        Intrinsics.checkNotNullParameter(settings, "");
        synchronized (this) {
            this.allocationLimit = settings.getMaxConcurrentStreams();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void trackFailure(@NotNull RealCall realCall, @Nullable IOException iOException) {
        boolean z;
        Intrinsics.checkNotNullParameter(realCall, "");
        synchronized (this) {
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i = this.refusedStreamCount + 1;
                    this.refusedStreamCount = i;
                    if (i > 1) {
                        z = !this.noNewExchanges;
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    } else {
                        z = false;
                    }
                    Unit unit = Unit.INSTANCE;
                } else {
                    if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !realCall.isCanceled()) {
                        z = !this.noNewExchanges;
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
            } else {
                if (!isMultiplexed$okhttp() || (iOException instanceof ConnectionShutdownException)) {
                    boolean z2 = this.noNewExchanges;
                    this.noNewExchanges = true;
                    if (this.successCount == 0) {
                        if (iOException != null) {
                            connectFailed$okhttp(realCall.getClient(), getRoute(), iOException);
                        }
                        this.routeFailureCount++;
                    }
                    z = !z2;
                }
                Unit unit22 = Unit.INSTANCE;
            }
        }
        if (z) {
            this.connectionListener.noNewExchanges(this);
        }
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = -4827065542494436440L;
    }
}
