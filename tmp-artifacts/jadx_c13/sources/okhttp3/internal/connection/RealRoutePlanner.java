package okhttp3.internal.connection;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.access6900;
import okhttp3.Address;
import okhttp3.ConnectionSpec;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RealRoutePlanner implements RoutePlanner {
    private final Address address;
    private final RealCall call;
    private final RealConnectionPool connectionPool;
    private final access6900<RoutePlanner.Plan> deferredPlans;
    private final boolean doExtensiveHealthChecks;
    private final boolean fastFallback;
    private Route nextRouteToTry;
    private final int pingIntervalMillis;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final RouteDatabase routeDatabase;
    private RouteSelector.Selection routeSelection;
    private RouteSelector routeSelector;
    private final int socketConnectTimeoutMillis;
    private final int socketReadTimeoutMillis;
    private final TaskRunner taskRunner;
    private final int writeTimeoutMillis;
    private static final byte[] $$a = {2, 77, 55, -86};
    private static final int $$b = 212;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static char[] IAuthTabCallback = {54675, 7655, 17772};
    private static long onNavigationEvent = 2588760854478202274L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, int i) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 97 - (b * 2);
        int i4 = b2 * 2;
        int i5 = 4 - (i * 4);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            i3 = i4;
            i2 = 0;
            i3 += i6;
            i5++;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i2++;
            i6 = bArr[i5];
            i3 += i6;
            i5++;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    public RealRoutePlanner(@NotNull TaskRunner taskRunner, @NotNull RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, @NotNull Address address, @NotNull RouteDatabase routeDatabase, @NotNull RealCall realCall, @NotNull Request request) throws Throwable {
        Intrinsics.checkNotNullParameter(taskRunner, "");
        Intrinsics.checkNotNullParameter(realConnectionPool, "");
        Intrinsics.checkNotNullParameter(address, "");
        Intrinsics.checkNotNullParameter(routeDatabase, "");
        Intrinsics.checkNotNullParameter(realCall, "");
        Intrinsics.checkNotNullParameter(request, "");
        this.taskRunner = taskRunner;
        this.connectionPool = realConnectionPool;
        this.readTimeoutMillis = i;
        this.writeTimeoutMillis = i2;
        this.socketConnectTimeoutMillis = i3;
        this.socketReadTimeoutMillis = i4;
        this.pingIntervalMillis = i5;
        this.retryOnConnectionFailure = z;
        this.fastFallback = z2;
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = realCall;
        String strMethod = request.method();
        a(TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 1, (ViewConfiguration.getEdgeSlop() >> 16) + 3, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14335), new Object[1]);
        this.doExtensiveHealthChecks = !Intrinsics.areEqual(strMethod, ((String) r8[0]).intern());
        this.deferredPlans = new access6900<>();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public Address getAddress() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Address address = this.address;
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        return address;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public access6900<RoutePlanner.Plan> getDeferredPlans() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 85;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        access6900<RoutePlanner.Plan> access6900Var = this.deferredPlans;
        int i5 = i2 + 91;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return access6900Var;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean isCanceled() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsCanceled = this.call.isCanceled();
        int i4 = onExtraCallback + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zIsCanceled;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public RoutePlanner.Plan plan() throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ReusePlan reusePlanPlanReuseCallConnection = planReuseCallConnection();
        if (reusePlanPlanReuseCallConnection != null) {
            return reusePlanPlanReuseCallConnection;
        }
        ReusePlan reusePlanPlanReusePooledConnection$okhttp$default = planReusePooledConnection$okhttp$default(this, null, null, 3, null);
        if (reusePlanPlanReusePooledConnection$okhttp$default != null) {
            return reusePlanPlanReusePooledConnection$okhttp$default;
        }
        if (getDeferredPlans().isEmpty()) {
            ConnectPlan connectPlanPlanConnect$okhttp = planConnect$okhttp();
            ReusePlan reusePlanPlanReusePooledConnection$okhttp = planReusePooledConnection$okhttp(connectPlanPlanConnect$okhttp, connectPlanPlanConnect$okhttp.getRoutes$okhttp());
            if (reusePlanPlanReusePooledConnection$okhttp == null) {
                return connectPlanPlanConnect$okhttp;
            }
            int i4 = onExtraCallback;
            int i5 = i4 + 113;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            int i6 = i4 + 69;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return reusePlanPlanReusePooledConnection$okhttp;
        }
        int i8 = onExtraCallback + 81;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return getDeferredPlans().removeFirst();
    }

    private final ReusePlan planReuseCallConnection() throws IOException {
        Socket socketReleaseConnectionNoEvents$okhttp;
        boolean z;
        RealConnection connection = this.call.getConnection();
        if (connection == null) {
            return null;
        }
        boolean zIsHealthy = connection.isHealthy(this.doExtensiveHealthChecks);
        synchronized (connection) {
            if (!zIsHealthy) {
                z = !connection.getNoNewExchanges();
                connection.setNoNewExchanges(true);
                socketReleaseConnectionNoEvents$okhttp = this.call.releaseConnectionNoEvents$okhttp();
            } else if (connection.getNoNewExchanges() || !sameHostAndPort(connection.route().address().url())) {
                socketReleaseConnectionNoEvents$okhttp = this.call.releaseConnectionNoEvents$okhttp();
                z = false;
            } else {
                z = false;
                socketReleaseConnectionNoEvents$okhttp = null;
            }
        }
        if (this.call.getConnection() != null) {
            if (socketReleaseConnectionNoEvents$okhttp != null) {
                throw new IllegalStateException("Check failed.");
            }
            return new ReusePlan(connection);
        }
        if (socketReleaseConnectionNoEvents$okhttp != null) {
            _UtilJvmKt.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
        }
        this.call.getEventListener$okhttp().connectionReleased(this.call, connection);
        connection.getConnectionListener$okhttp().connectionReleased(connection, this.call);
        if (socketReleaseConnectionNoEvents$okhttp != null) {
            connection.getConnectionListener$okhttp().connectionClosed(connection);
        } else if (z) {
            connection.getConnectionListener$okhttp().noNewExchanges(connection);
        }
        return null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $10 + 65;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = $11 + 81;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i >>> i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0)), ExpandableListView.getPackedPositionGroup(0L) + 17, 10972 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 46134), 31 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16826339), 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1494 - (ViewConfiguration.getTapTimeout() >> 16), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } else {
                int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr5 = {Integer.valueOf(IAuthTabCallback[i + i8])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59698 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 18, 10972 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET)), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 31, TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 20221, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback6 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 44, 1494 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i9 = $11 + 87;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Color.alpha(0)), KeyEvent.normalizeMetaState(0) + 44, 1494 - (ViewConfiguration.getLongPressTimeout() >> 16), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    public final ConnectPlan planConnect$okhttp() throws IOException {
        int i = 2 % 2;
        Route route = this.nextRouteToTry;
        if (route != null) {
            this.nextRouteToTry = null;
            return planConnectToRoute$okhttp$default(this, route, null, 2, null);
        }
        RouteSelector.Selection selection = this.routeSelection;
        if (selection != null && selection.hasNext()) {
            ConnectPlan connectPlanPlanConnectToRoute$okhttp$default = planConnectToRoute$okhttp$default(this, selection.next(), null, 2, null);
            int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 55 / 0;
            }
            return connectPlanPlanConnectToRoute$okhttp$default;
        }
        RouteSelector routeSelector = this.routeSelector;
        if (routeSelector == null) {
            RouteSelector routeSelector2 = new RouteSelector(getAddress(), this.routeDatabase, this.call, this.fastFallback);
            this.routeSelector = routeSelector2;
            routeSelector = routeSelector2;
        }
        if (!routeSelector.hasNext()) {
            throw new IOException("exhausted all routes");
        }
        int i4 = onExtraCallback + 97;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        RouteSelector.Selection next = routeSelector.next();
        this.routeSelection = next;
        if (isCanceled()) {
            throw new IOException("Canceled");
        }
        return planConnectToRoute$okhttp(next.next(), next.getRoutes());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReusePlan planReusePooledConnection$okhttp$default(RealRoutePlanner realRoutePlanner, ConnectPlan connectPlan, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 87;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 67;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            connectPlan = null;
        }
        if ((i & 2) != 0) {
            int i8 = onExtraCallback + 51;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 33 / 0;
            }
            list = null;
        }
        return realRoutePlanner.planReusePooledConnection$okhttp(connectPlan, list);
    }

    public final ReusePlan planReusePooledConnection$okhttp(@Nullable ConnectPlan connectPlan, @Nullable List<Route> list) throws IOException {
        boolean z;
        int i = 2 % 2;
        RealConnectionPool realConnectionPool = this.connectionPool;
        boolean z2 = this.doExtensiveHealthChecks;
        Address address = getAddress();
        RealCall realCall = this.call;
        if (connectPlan == null || !connectPlan.isReady()) {
            int i2 = onExtraCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        } else {
            z = true;
        }
        RealConnection realConnectionCallAcquirePooledConnection$okhttp = realConnectionPool.callAcquirePooledConnection$okhttp(z2, address, realCall, list, z);
        if (realConnectionCallAcquirePooledConnection$okhttp == null) {
            int i4 = onExtraCallbackWithResult + 57;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (connectPlan != null) {
            this.nextRouteToTry = connectPlan.getRoute();
            connectPlan.closeQuietly();
        }
        this.call.getEventListener$okhttp().connectionAcquired(this.call, realConnectionCallAcquirePooledConnection$okhttp);
        realConnectionCallAcquirePooledConnection$okhttp.getConnectionListener$okhttp().connectionAcquired(realConnectionCallAcquirePooledConnection$okhttp, this.call);
        return new ReusePlan(realConnectionCallAcquirePooledConnection$okhttp);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectPlan planConnectToRoute$okhttp$default(RealRoutePlanner realRoutePlanner, Route route, List list, int i, Object obj) throws IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0 ? (i & 2) != 0 : (i & 4) != 0) {
            int i5 = i3 + 113;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            list = null;
        }
        return realRoutePlanner.planConnectToRoute$okhttp(route, list);
    }

    public final ConnectPlan planConnectToRoute$okhttp(@NotNull Route route, @Nullable List<Route> list) throws IOException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(route, "");
        if (route.address().sslSocketFactory() == null) {
            if (!route.address().connectionSpecs().contains(ConnectionSpec.CLEARTEXT)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            int i4 = onExtraCallbackWithResult + 93;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            String strHost = route.address().url().host();
            if (!Platform.Companion.get().isCleartextTrafficPermitted(strHost)) {
                throw new UnknownServiceException("CLEARTEXT communication to " + strHost + " not permitted by network security policy");
            }
        } else if (!(!route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE))) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        return new ConnectPlan(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.call, this, route, list, 0, route.requiresTunnel() ? createTunnelRequest(route) : null, -1, false);
    }

    private final Request createTunnelRequest(Route route) throws IOException {
        int i = 2 % 2;
        Request requestBuild = new Request.Builder().url(route.address().url()).method("CONNECT", null).header("Host", _UtilJvmKt.toHostHeader(route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", _UtilCommonKt.USER_AGENT).build();
        Request requestAuthenticate = route.address().proxyAuthenticator().authenticate(route, new Response.Builder().request(requestBuild).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        if (requestAuthenticate != null) {
            return requestAuthenticate;
        }
        int i2 = onExtraCallback;
        int i3 = i2 + 97;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 19;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return requestBuild;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean hasNext(@Nullable RealConnection realConnection) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getDeferredPlans().isEmpty();
            throw null;
        }
        if (!getDeferredPlans().isEmpty()) {
            int i3 = onExtraCallbackWithResult + 77;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (this.nextRouteToTry != null) {
            int i5 = onExtraCallback + 103;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (realConnection != null) {
            int i7 = onExtraCallbackWithResult + 13;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                retryRoute(realConnection);
                obj.hashCode();
                throw null;
            }
            Route routeRetryRoute = retryRoute(realConnection);
            if (routeRetryRoute != null) {
                this.nextRouteToTry = routeRetryRoute;
                return true;
            }
        }
        RouteSelector.Selection selection = this.routeSelection;
        if (selection != null) {
            int i8 = onExtraCallbackWithResult + 95;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            if (selection.hasNext()) {
                int i10 = onExtraCallbackWithResult + 41;
                onExtraCallback = i10 % 128;
                return i10 % 2 == 0;
            }
        }
        RouteSelector routeSelector = this.routeSelector;
        if (routeSelector == null) {
            return true;
        }
        return routeSelector.hasNext();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean sameHostAndPort(@NotNull HttpUrl httpUrl) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(httpUrl, "");
            HttpUrl httpUrlUrl = getAddress().url();
            httpUrl.port();
            httpUrlUrl.port();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(httpUrl, "");
        HttpUrl httpUrlUrl2 = getAddress().url();
        if (httpUrl.port() != httpUrlUrl2.port() || !Intrinsics.areEqual(httpUrl.host(), httpUrlUrl2.host())) {
            return false;
        }
        int i3 = onExtraCallback + 109;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    private final Route retryRoute(RealConnection realConnection) {
        Route route;
        synchronized (realConnection) {
            route = (realConnection.getRouteFailureCount$okhttp() == 0 && realConnection.getNoNewExchanges() && _UtilJvmKt.canReuseConnectionFor(realConnection.route().address().url(), getAddress().url())) ? realConnection.route() : null;
        }
        return route;
    }
}
