package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.ConnectionSpec;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.url._UrlKt;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ConnectPlan implements RoutePlanner.Plan, ExchangeCodec.Carrier {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private final int attempt;
    private final RealCall call;
    private volatile boolean canceled;
    private RealConnection connection;
    private final RealConnectionPool connectionPool;
    private final int connectionSpecIndex;
    private Handshake handshake;
    private final boolean isTlsFallback;
    private Socket javaNetSocket;
    private final int pingIntervalMillis;
    private Protocol protocol;
    private Socket rawSocket;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final Route route;
    private final RealRoutePlanner routePlanner;
    private final List<Route> routes;
    private BufferedSocket socket;
    private final int socketConnectTimeoutMillis;
    private final int socketReadTimeoutMillis;
    private final TaskRunner taskRunner;
    private final Request tunnelRequest;
    private final int writeTimeoutMillis;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void noNewExchanges() {
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void trackFailure(@NotNull RealCall realCall, @Nullable IOException iOException) {
        Intrinsics.checkNotNullParameter(realCall, "");
    }

    public ConnectPlan(@NotNull TaskRunner taskRunner, @NotNull RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, int i5, boolean z, @NotNull RealCall realCall, @NotNull RealRoutePlanner realRoutePlanner, @NotNull Route route, @Nullable List<Route> list, int i6, @Nullable Request request, int i7, boolean z2) {
        Intrinsics.checkNotNullParameter(taskRunner, "");
        Intrinsics.checkNotNullParameter(realConnectionPool, "");
        Intrinsics.checkNotNullParameter(realCall, "");
        Intrinsics.checkNotNullParameter(realRoutePlanner, "");
        Intrinsics.checkNotNullParameter(route, "");
        this.taskRunner = taskRunner;
        this.connectionPool = realConnectionPool;
        this.readTimeoutMillis = i;
        this.writeTimeoutMillis = i2;
        this.socketConnectTimeoutMillis = i3;
        this.socketReadTimeoutMillis = i4;
        this.pingIntervalMillis = i5;
        this.retryOnConnectionFailure = z;
        this.call = realCall;
        this.routePlanner = realRoutePlanner;
        this.route = route;
        this.routes = list;
        this.attempt = i6;
        this.tunnelRequest = request;
        this.connectionSpecIndex = i7;
        this.isTlsFallback = z2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public Route getRoute() {
        return this.route;
    }

    public final List<Route> getRoutes$okhttp() {
        return this.routes;
    }

    public final int getConnectionSpecIndex$okhttp() {
        return this.connectionSpecIndex;
    }

    public final boolean isTlsFallback$okhttp() {
        return this.isTlsFallback;
    }

    public final Socket getJavaNetSocket$okhttp() {
        return this.javaNetSocket;
    }

    public final void setJavaNetSocket$okhttp(@Nullable Socket socket) {
        this.javaNetSocket = socket;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public boolean isReady() {
        return this.protocol != null;
    }

    static /* synthetic */ ConnectPlan copy$default(ConnectPlan connectPlan, int i, Request request, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = connectPlan.attempt;
        }
        if ((i3 & 2) != 0) {
            request = connectPlan.tunnelRequest;
        }
        if ((i3 & 4) != 0) {
            i2 = connectPlan.connectionSpecIndex;
        }
        if ((i3 & 8) != 0) {
            z = connectPlan.isTlsFallback;
        }
        return connectPlan.copy(i, request, i2, z);
    }

    private final ConnectPlan copy(int i, Request request, int i2, boolean z) {
        return new ConnectPlan(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.call, this.routePlanner, getRoute(), this.routes, i, request, i2, z);
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: connectTcp */
    public RoutePlanner.ConnectResult mo312connectTcp() throws IOException {
        Socket socket;
        Socket socket2;
        if (this.rawSocket != null) {
            throw new IllegalStateException("TCP already connected");
        }
        this.call.getPlansToCancel$okhttp().add(this);
        boolean z = false;
        try {
            try {
                this.call.getEventListener$okhttp().connectStart(this.call, getRoute().socketAddress(), getRoute().proxy());
                this.connectionPool.getConnectionListener$okhttp().connectStart(getRoute(), this.call);
                connectSocket();
                z = true;
                RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(this, null, null, 6, null);
                this.call.getPlansToCancel$okhttp().remove(this);
                return connectResult;
            } catch (IOException e) {
                if (getRoute().address().proxy() == null && getRoute().proxy().type() != Proxy.Type.DIRECT) {
                    getRoute().address().proxySelector().connectFailed(getRoute().address().url().uri(), getRoute().proxy().address(), e);
                }
                this.call.getEventListener$okhttp().connectFailed(this.call, getRoute().socketAddress(), getRoute().proxy(), null, e);
                this.connectionPool.getConnectionListener$okhttp().connectFailed(getRoute(), this.call, e);
                RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(this, null, e, 2, null);
                this.call.getPlansToCancel$okhttp().remove(this);
                if (!z && (socket = this.rawSocket) != null) {
                    _UtilJvmKt.closeQuietly(socket);
                }
                return connectResult2;
            }
        } catch (Throwable th) {
            this.call.getPlansToCancel$okhttp().remove(this);
            if (!z && (socket2 = this.rawSocket) != null) {
                _UtilJvmKt.closeQuietly(socket2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0208  */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: connectTlsEtc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RoutePlanner.ConnectResult mo313connectTlsEtc() throws Throwable {
        Socket socket;
        ConnectPlan connectPlan;
        boolean z;
        BufferedSocket bufferedSocket;
        boolean z2;
        Socket socket2 = this.rawSocket;
        if (socket2 == null) {
            throw new IllegalArgumentException("TCP not connected");
        }
        if (isReady()) {
            throw new IllegalStateException("already connected");
        }
        List<ConnectionSpec> listConnectionSpecs = getRoute().address().connectionSpecs();
        this.call.getPlansToCancel$okhttp().add(this);
        boolean z3 = false;
        try {
            try {
                if (this.tunnelRequest != null) {
                    RoutePlanner.ConnectResult connectResultConnectTunnel$okhttp = connectTunnel$okhttp();
                    if (connectResultConnectTunnel$okhttp.getNextPlan() != null || connectResultConnectTunnel$okhttp.getThrowable() != null) {
                        this.call.getPlansToCancel$okhttp().remove(this);
                        Socket socket3 = this.javaNetSocket;
                        if (socket3 != null) {
                            _UtilJvmKt.closeQuietly(socket3);
                        }
                        _UtilJvmKt.closeQuietly(socket2);
                        return connectResultConnectTunnel$okhttp;
                    }
                }
                if (getRoute().address().sslSocketFactory() != null) {
                    BufferedSocket bufferedSocket2 = this.socket;
                    if (bufferedSocket2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                        bufferedSocket2 = null;
                    }
                    if (bufferedSocket2.getSource().access100().IAuthTabCallback_Parcel()) {
                        BufferedSocket bufferedSocket3 = this.socket;
                        if (bufferedSocket3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                            bufferedSocket3 = null;
                        }
                        if (bufferedSocket3.getSink().access100().IAuthTabCallback_Parcel()) {
                            this.call.getEventListener$okhttp().secureConnectStart(this.call);
                            Socket socketCreateSocket = getRoute().address().sslSocketFactory().createSocket(socket2, getRoute().address().url().host(), getRoute().address().url().port(), true);
                            Intrinsics.checkNotNull(socketCreateSocket, "");
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            ConnectPlan connectPlanPlanWithCurrentOrInitialConnectionSpec$okhttp = planWithCurrentOrInitialConnectionSpec$okhttp(listConnectionSpecs, sSLSocket);
                            ConnectionSpec connectionSpec = listConnectionSpecs.get(connectPlanPlanWithCurrentOrInitialConnectionSpec$okhttp.connectionSpecIndex);
                            ConnectPlan connectPlanNextConnectionSpec$okhttp = connectPlanPlanWithCurrentOrInitialConnectionSpec$okhttp.nextConnectionSpec$okhttp(listConnectionSpecs, sSLSocket);
                            try {
                                connectionSpec.apply$okhttp(sSLSocket, connectPlanPlanWithCurrentOrInitialConnectionSpec$okhttp.isTlsFallback);
                                connectTls(sSLSocket, connectionSpec);
                                this.call.getEventListener$okhttp().secureConnectEnd(this.call, this.handshake);
                                connectPlan = connectPlanNextConnectionSpec$okhttp;
                            } catch (IOException e) {
                                e = e;
                                socket = socket2;
                                connectPlan = connectPlanNextConnectionSpec$okhttp;
                                try {
                                    this.call.getEventListener$okhttp().connectFailed(this.call, getRoute().socketAddress(), getRoute().proxy(), null, e);
                                    this.connectionPool.getConnectionListener$okhttp().connectFailed(getRoute(), this.call, e);
                                    RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(this, (this.retryOnConnectionFailure || !RetryTlsHandshakeKt.retryTlsHandshake(e)) ? null : connectPlan, e);
                                    this.call.getPlansToCancel$okhttp().remove(this);
                                    if (!z3) {
                                        Socket socket4 = this.javaNetSocket;
                                        if (socket4 != null) {
                                            _UtilJvmKt.closeQuietly(socket4);
                                        }
                                        _UtilJvmKt.closeQuietly(socket);
                                    }
                                    return connectResult;
                                } catch (Throwable th) {
                                    th = th;
                                    z = z3;
                                    this.call.getPlansToCancel$okhttp().remove(this);
                                    if (!z) {
                                        Socket socket5 = this.javaNetSocket;
                                        if (socket5 != null) {
                                            _UtilJvmKt.closeQuietly(socket5);
                                        }
                                        _UtilJvmKt.closeQuietly(socket);
                                    }
                                    throw th;
                                }
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.javaNetSocket = socket2;
                List<Protocol> listProtocols = getRoute().address().protocols();
                Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                if (!listProtocols.contains(protocol)) {
                    protocol = Protocol.HTTP_1_1;
                }
                this.protocol = protocol;
                connectPlan = null;
                try {
                    TaskRunner taskRunner = this.taskRunner;
                    RealConnectionPool realConnectionPool = this.connectionPool;
                    Route route = getRoute();
                    Socket socket6 = this.javaNetSocket;
                    Intrinsics.checkNotNull(socket6);
                    Handshake handshake = this.handshake;
                    Protocol protocol2 = this.protocol;
                    Intrinsics.checkNotNull(protocol2);
                    BufferedSocket bufferedSocket4 = this.socket;
                    if (bufferedSocket4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                        bufferedSocket = null;
                    } else {
                        bufferedSocket = bufferedSocket4;
                    }
                    RealConnection realConnection = new RealConnection(taskRunner, realConnectionPool, route, socket2, socket6, handshake, protocol2, bufferedSocket, this.pingIntervalMillis, this.connectionPool.getConnectionListener$okhttp());
                    this.connection = realConnection;
                    realConnection.start();
                    this.call.getEventListener$okhttp().connectEnd(this.call, getRoute().socketAddress(), getRoute().proxy(), this.protocol);
                    try {
                        z2 = true;
                        socket = socket2;
                    } catch (IOException e2) {
                        e = e2;
                        z2 = true;
                        socket = socket2;
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = true;
                        socket = socket2;
                    }
                } catch (IOException e3) {
                    e = e3;
                    socket = socket2;
                }
            } catch (IOException e4) {
                e = e4;
                socket = socket2;
                connectPlan = null;
            }
        } catch (Throwable th3) {
            th = th3;
            socket = socket2;
            z = z3;
            this.call.getPlansToCancel$okhttp().remove(this);
            if (!z) {
            }
            throw th;
        }
        try {
            RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(this, null, null, 6, null);
            this.call.getPlansToCancel$okhttp().remove(this);
            return connectResult2;
        } catch (IOException e5) {
            e = e5;
            z3 = z2;
            this.call.getEventListener$okhttp().connectFailed(this.call, getRoute().socketAddress(), getRoute().proxy(), null, e);
            this.connectionPool.getConnectionListener$okhttp().connectFailed(getRoute(), this.call, e);
            RoutePlanner.ConnectResult connectResult3 = new RoutePlanner.ConnectResult(this, (this.retryOnConnectionFailure || !RetryTlsHandshakeKt.retryTlsHandshake(e)) ? null : connectPlan, e);
            this.call.getPlansToCancel$okhttp().remove(this);
            if (!z3) {
            }
            return connectResult3;
        } catch (Throwable th4) {
            th = th4;
            z = z2;
            this.call.getPlansToCancel$okhttp().remove(this);
            if (!z) {
            }
            throw th;
        }
    }

    private final void connectSocket() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = getRoute().proxy().type();
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = getRoute().address().socketFactory().createSocket();
            Intrinsics.checkNotNull(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(getRoute().proxy());
        }
        this.rawSocket = socketCreateSocket;
        if (this.canceled) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.socketReadTimeoutMillis);
        try {
            Platform.Companion.get().connectSocket(socketCreateSocket, getRoute().socketAddress(), this.socketConnectTimeoutMillis);
            try {
                this.socket = BufferedSocketKt.asBufferedSocket(socketCreateSocket);
            } catch (NullPointerException e) {
                if (Intrinsics.areEqual(e.getMessage(), NPE_THROW_WITH_NULL)) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + getRoute().socketAddress());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final RoutePlanner.ConnectResult connectTunnel$okhttp() throws IOException {
        Request requestCreateTunnel = createTunnel();
        if (requestCreateTunnel == null) {
            return new RoutePlanner.ConnectResult(this, null, null, 6, null);
        }
        Socket socket = this.rawSocket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
        int i = this.attempt + 1;
        if (i < 21) {
            this.call.getEventListener$okhttp().connectEnd(this.call, getRoute().socketAddress(), getRoute().proxy(), null);
            return new RoutePlanner.ConnectResult(this, copy$default(this, i, requestCreateTunnel, 0, false, 12, null), null, 4, null);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        this.call.getEventListener$okhttp().connectFailed(this.call, getRoute().socketAddress(), getRoute().proxy(), null, protocolException);
        this.connectionPool.getConnectionListener$okhttp().connectFailed(getRoute(), this.call, protocolException);
        return new RoutePlanner.ConnectResult(this, null, protocolException, 2, null);
    }

    private final void connectTls(SSLSocket sSLSocket, ConnectionSpec connectionSpec) throws IOException {
        final Address address = getRoute().address();
        try {
            if (connectionSpec.supportsTlsExtensions()) {
                Platform.Companion.get().configureTlsExtensions(sSLSocket, address.url().host(), address.protocols());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            Handshake.Companion companion = Handshake.Companion;
            Intrinsics.checkNotNull(session);
            final Handshake handshake = companion.get(session);
            HostnameVerifier hostnameVerifier = address.hostnameVerifier();
            Intrinsics.checkNotNull(hostnameVerifier);
            if (hostnameVerifier.verify(address.url().host(), session)) {
                final CertificatePinner certificatePinner = address.certificatePinner();
                Intrinsics.checkNotNull(certificatePinner);
                final Handshake handshake2 = new Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new Function0() { // from class: okhttp3.internal.connection.ConnectPlan$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConnectPlan.connectTls$lambda$0(certificatePinner, handshake, address);
                    }
                });
                this.handshake = handshake2;
                certificatePinner.check$okhttp(address.url().host(), new Function0() { // from class: okhttp3.internal.connection.ConnectPlan$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConnectPlan.connectTls$lambda$1(handshake2);
                    }
                });
                String selectedProtocol = connectionSpec.supportsTlsExtensions() ? Platform.Companion.get().getSelectedProtocol(sSLSocket) : null;
                this.javaNetSocket = sSLSocket;
                this.socket = BufferedSocketKt.asBufferedSocket(sSLSocket);
                this.protocol = selectedProtocol != null ? Protocol.Companion.get(selectedProtocol) : Protocol.HTTP_1_1;
                Platform.Companion.get().afterHandshake(sSLSocket);
                return;
            }
            List<Certificate> listPeerCertificates = handshake.peerCertificates();
            if (listPeerCertificates.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified (no certificates)");
            }
            Certificate certificate = listPeerCertificates.get(0);
            Intrinsics.checkNotNull(certificate, "");
            X509Certificate x509Certificate = (X509Certificate) certificate;
            throw new SSLPeerUnverifiedException(StringsKt__IndentKt.trimMargin$default("\n            |Hostname " + address.url().host() + " not verified:\n            |    certificate: " + CertificatePinner.Companion.pin(x509Certificate) + "\n            |    DN: " + x509Certificate.getSubjectDN().getName() + "\n            |    subjectAltNames: " + OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate) + "\n            ", null, 1, null));
        } catch (Throwable th) {
            Platform.Companion.get().afterHandshake(sSLSocket);
            _UtilJvmKt.closeQuietly(sSLSocket);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List connectTls$lambda$0(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        CertificateChainCleaner certificateChainCleaner$okhttp = certificatePinner.getCertificateChainCleaner$okhttp();
        Intrinsics.checkNotNull(certificateChainCleaner$okhttp);
        return certificateChainCleaner$okhttp.clean(handshake.peerCertificates(), address.url().host());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List connectTls$lambda$1(Handshake handshake) {
        List<Certificate> listPeerCertificates = handshake.peerCertificates();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listPeerCertificates, 10));
        for (Certificate certificate : listPeerCertificates) {
            Intrinsics.checkNotNull(certificate, "");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    private final Request createTunnel() throws IOException {
        Request request = this.tunnelRequest;
        Intrinsics.checkNotNull(request);
        String str = "CONNECT " + _UtilJvmKt.toHostHeader(getRoute().address().url(), true) + " HTTP/1.1";
        while (true) {
            BufferedSocket bufferedSocket = this.socket;
            if (bufferedSocket == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                bufferedSocket = null;
            }
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, bufferedSocket);
            BufferedSocket bufferedSocket2 = this.socket;
            if (bufferedSocket2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                bufferedSocket2 = null;
            }
            Timeout timeout = bufferedSocket2.getSource().timeout();
            long j = this.readTimeoutMillis;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            timeout.timeout(j, timeUnit);
            BufferedSocket bufferedSocket3 = this.socket;
            if (bufferedSocket3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                bufferedSocket3 = null;
            }
            bufferedSocket3.getSink().timeout().timeout(this.writeTimeoutMillis, timeUnit);
            http1ExchangeCodec.writeRequest(request.headers(), str);
            http1ExchangeCodec.finishRequest();
            Response.Builder responseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            Intrinsics.checkNotNull(responseHeaders);
            Response responseBuild = responseHeaders.request(request).build();
            http1ExchangeCodec.skipConnectBody(responseBuild);
            int iCode = responseBuild.code();
            if (iCode == 200) {
                return null;
            }
            if (iCode == 407) {
                Request requestAuthenticate = getRoute().address().proxyAuthenticator().authenticate(getRoute(), responseBuild);
                if (requestAuthenticate == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if (StringsKt__StringsJVMKt.equals("close", Response.header$default(responseBuild, "Connection", null, 2, null), true)) {
                    return requestAuthenticate;
                }
                request = requestAuthenticate;
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + responseBuild.code());
            }
        }
    }

    public final ConnectPlan planWithCurrentOrInitialConnectionSpec$okhttp(@NotNull List<ConnectionSpec> list, @NotNull SSLSocket sSLSocket) throws IOException {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(sSLSocket, "");
        if (this.connectionSpecIndex != -1) {
            return this;
        }
        ConnectPlan connectPlanNextConnectionSpec$okhttp = nextConnectionSpec$okhttp(list, sSLSocket);
        if (connectPlanNextConnectionSpec$okhttp != null) {
            return connectPlanNextConnectionSpec$okhttp;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.isTlsFallback);
        sb.append(", modes=");
        sb.append(list);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        Intrinsics.checkNotNull(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(string, "");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    public final ConnectPlan nextConnectionSpec$okhttp(@NotNull List<ConnectionSpec> list, @NotNull SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(sSLSocket, "");
        int i = this.connectionSpecIndex;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            if (list.get(i2).isCompatible(sSLSocket)) {
                return copy$default(this, 0, null, i2, this.connectionSpecIndex != -1, 3, null);
            }
        }
        return null;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: handleSuccess */
    public RealConnection mo309handleSuccess() throws IOException {
        this.call.getClient().getRouteDatabase$okhttp().connected(getRoute());
        RealConnection realConnection = this.connection;
        Intrinsics.checkNotNull(realConnection);
        realConnection.getConnectionListener$okhttp().connectEnd(realConnection, getRoute(), this.call);
        ReusePlan reusePlanPlanReusePooledConnection$okhttp = this.routePlanner.planReusePooledConnection$okhttp(this, this.routes);
        if (reusePlanPlanReusePooledConnection$okhttp != null) {
            return reusePlanPlanReusePooledConnection$okhttp.getConnection();
        }
        synchronized (realConnection) {
            this.connectionPool.put(realConnection);
            this.call.acquireConnectionNoEvents(realConnection);
            Unit unit = Unit.INSTANCE;
        }
        this.call.getEventListener$okhttp().connectionAcquired(this.call, realConnection);
        realConnection.getConnectionListener$okhttp().connectionAcquired(realConnection, this.call);
        return realConnection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    /* renamed from: cancel */
    public void mo308cancel() throws IOException {
        this.canceled = true;
        Socket socket = this.rawSocket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: retry */
    public RoutePlanner.Plan mo310retry() {
        return new ConnectPlan(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.call, this.routePlanner, getRoute(), this.routes, this.attempt, this.tunnelRequest, this.connectionSpecIndex, this.isTlsFallback);
    }

    public final void closeQuietly() {
        Socket socket = this.javaNetSocket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
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
