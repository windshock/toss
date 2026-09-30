package okhttp3.internal.ws;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TTBaseLandingPageActivity;
import o.TTHistoryActivity41;
import o.TTHistoryActivity42;
import o.TTHistoryActivity5;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.BufferedSocket;
import okhttp3.internal.connection.BufferedSocketKt;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback, Lockable {
    public static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final Companion Companion;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static byte[] IAuthTabCallback = null;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final List<Protocol> ONLY_HTTP1;
    private static int asInterface;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static short[] onWarmupCompleted;
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    private WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<TTBaseLandingPageActivity> pongQueue;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private TTHistoryActivity5 socket;
    private TaskQueue taskQueue;
    private final long webSocketCloseTimeout;
    private WebSocketWriter writer;
    private Task writerTask;
    private static final byte[] $$a = {111, -53, -88, 102};
    private static final int $$b = 12;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, short s2) {
        int i2;
        byte[] bArr = $$a;
        int i3 = s * 4;
        int i4 = (s2 * 4) + 4;
        int i5 = 115 - (i * 4);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i5 += -i4;
            i4 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i9 = i2 + 1;
            i7 = i4;
            i4 = bArr[i4];
            i8 = i9;
            i5 += -i4;
            i4 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    /* renamed from: $r8$lambda$0T3qT4Eg5PnlD3bX-T9nHdqY_Jw, reason: not valid java name */
    public static /* synthetic */ Unit m318$r8$lambda$0T3qT4Eg5PnlD3bXT9nHdqY_Jw(WebSocketWriter webSocketWriter) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return finishReader$lambda$0$0(webSocketWriter);
        }
        finishReader$lambda$0$0(webSocketWriter);
        throw null;
    }

    public static /* synthetic */ Unit $r8$lambda$3UeTKdScoteZtprq_bJvU_Ppjpc(RealWebSocket realWebSocket) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            writeOneFrame$lambda$0$0(realWebSocket);
            throw null;
        }
        Unit unitWriteOneFrame$lambda$0$0 = writeOneFrame$lambda$0$0(realWebSocket);
        int i3 = IAuthTabCallbackDefault + 19;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return unitWriteOneFrame$lambda$0$0;
        }
        throw null;
    }

    public static /* synthetic */ Unit $r8$lambda$CoyTb8PMxSv5bSlhxaYuHDtmnaQ(Ref.ObjectRef objectRef) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return failWebSocket$lambda$0$0(objectRef);
        }
        failWebSocket$lambda$0$0(objectRef);
        throw null;
    }

    public static /* synthetic */ long $r8$lambda$M3uLbVxgXTEj1BhnKpRA6a_aJpc(RealWebSocket realWebSocket, long j) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            initReaderAndWriter$lambda$0$0(realWebSocket, j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long jInitReaderAndWriter$lambda$0$0 = initReaderAndWriter$lambda$0$0(realWebSocket, j);
        int i3 = IAuthTabCallbackDefault + 11;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return jInitReaderAndWriter$lambda$0$0;
    }

    public RealWebSocket(@NotNull TaskRunner taskRunner, @NotNull Request request, @NotNull WebSocketListener webSocketListener, @NotNull Random random, long j, @Nullable WebSocketExtensions webSocketExtensions, long j2, long j3) throws Throwable {
        Intrinsics.checkNotNullParameter(taskRunner, "");
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(webSocketListener, "");
        Intrinsics.checkNotNullParameter(random, "");
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random;
        this.pingIntervalMillis = j;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j2;
        this.webSocketCloseTimeout = j3;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getTouchSlop() >> 8), (byte) ((-47) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 1578629132 + (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-384581319) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), objArr);
        if (!Intrinsics.areEqual(((String) objArr[0]).intern(), request.method())) {
            throw new IllegalArgumentException(("Request must be GET: " + request.method()).toString());
        }
        TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback = TTBaseLandingPageActivity.Companion;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.INSTANCE;
        this.key = TTBaseLandingPageActivity.IAuthTabCallback.onExtraCallback(iAuthTabCallback, bArr, 0, 0, 3, null).IAuthTabCallback();
        int i = IAuthTabCallbackDefault + 77;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ ArrayDeque access$getMessageAndCloseQueue$p(RealWebSocket realWebSocket) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 109;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        ArrayDeque<Object> arrayDeque = realWebSocket.messageAndCloseQueue;
        int i5 = i2 + 83;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return arrayDeque;
        }
        throw null;
    }

    public static final /* synthetic */ String access$getName$p(RealWebSocket realWebSocket) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        String str = realWebSocket.name;
        int i5 = i3 + 47;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean access$isValid(RealWebSocket realWebSocket, WebSocketExtensions webSocketExtensions) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            realWebSocket.isValid(webSocketExtensions);
            throw null;
        }
        boolean zIsValid = realWebSocket.isValid(webSocketExtensions);
        int i3 = IAuthTabCallbackDefault + 59;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return zIsValid;
    }

    public static final /* synthetic */ void access$setExtensions$p(RealWebSocket realWebSocket, WebSocketExtensions webSocketExtensions) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        realWebSocket.extensions = webSocketExtensions;
        if (i4 != 0) {
            int i5 = 67 / 0;
        }
        int i6 = i3 + 9;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final WebSocketListener getListener$okhttp() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        WebSocketListener webSocketListener = this.listener;
        int i5 = i3 + 83;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return webSocketListener;
    }

    public final Call getCall$okhttp() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Call call = this.call;
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return call;
    }

    public final void setCall$okhttp(@Nullable Call call) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        this.call = call;
        int i5 = i3 + 59;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // okhttp3.WebSocket
    public Request request() {
        Request request;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 101;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            request = this.originalRequest;
            int i4 = 84 / 0;
        } else {
            request = this.originalRequest;
        }
        int i5 = i2 + 63;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return request;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // okhttp3.WebSocket
    public long queueSize() {
        long j;
        synchronized (this) {
            j = this.queueSize;
        }
        return j;
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Call call = this.call;
        Intrinsics.checkNotNull(call);
        call.cancel();
        int i4 = IAuthTabCallbackDefault + 19;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
    }

    public final void connect(@NotNull OkHttpClient okHttpClient) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(okHttpClient, "");
            this.originalRequest.header("Sec-WebSocket-Extensions");
            throw null;
        }
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket$default(this, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, false, 6, null);
            int i3 = IAuthTabCallbackDefault + 73;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        OkHttpClient okHttpClientBuild = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request requestBuild = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall = new RealCall(okHttpClientBuild, requestBuild, true);
        this.call = realCall;
        Intrinsics.checkNotNull(realCall);
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket.connect.1
            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                TTHistoryActivity42 source;
                TTHistoryActivity41 sink;
                Intrinsics.checkNotNullParameter(call, "");
                Intrinsics.checkNotNullParameter(response, "");
                try {
                    TTHistoryActivity5 tTHistoryActivity5CheckUpgradeSuccess$okhttp = RealWebSocket.this.checkUpgradeSuccess$okhttp(response);
                    WebSocketExtensions webSocketExtensions = WebSocketExtensions.Companion.parse(response.headers());
                    RealWebSocket.access$setExtensions$p(RealWebSocket.this, webSocketExtensions);
                    if (!RealWebSocket.access$isValid(RealWebSocket.this, webSocketExtensions)) {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        synchronized (realWebSocket) {
                            RealWebSocket.access$getMessageAndCloseQueue$p(realWebSocket).clear();
                            realWebSocket.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    RealWebSocket.this.initReaderAndWriter(_UtilJvmKt.okHttpName + " WebSocket " + requestBuild.url().redact(), BufferedSocketKt.asBufferedSocket(tTHistoryActivity5CheckUpgradeSuccess$okhttp), true);
                    RealWebSocket.this.loopReader(response);
                } catch (IOException e) {
                    RealWebSocket.failWebSocket$default(RealWebSocket.this, e, response, false, 4, null);
                    _UtilCommonKt.closeQuietly(response);
                    TTHistoryActivity5 tTHistoryActivity5Socket = response.socket();
                    if (tTHistoryActivity5Socket != null && (sink = tTHistoryActivity5Socket.getSink()) != null) {
                        _UtilCommonKt.closeQuietly(sink);
                    }
                    TTHistoryActivity5 tTHistoryActivity5Socket2 = response.socket();
                    if (tTHistoryActivity5Socket2 == null || (source = tTHistoryActivity5Socket2.getSource()) == null) {
                        return;
                    }
                    _UtilCommonKt.closeQuietly(source);
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) throws IOException {
                Intrinsics.checkNotNullParameter(call, "");
                Intrinsics.checkNotNullParameter(iOException, "");
                RealWebSocket.failWebSocket$default(RealWebSocket.this, iOException, null, false, 6, null);
            }
        });
    }

    private final boolean isValid(WebSocketExtensions webSocketExtensions) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (!webSocketExtensions.unknownValues) {
            if (webSocketExtensions.clientMaxWindowBits != null) {
                return false;
            }
            Integer num = webSocketExtensions.serverMaxWindowBits;
            if (num == null) {
                return true;
            }
            int iIntValue = num.intValue();
            return 8 <= iIntValue && iIntValue < 16;
        }
        int i4 = IAuthTabCallbackStub + 61;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public final TTHistoryActivity5 checkUpgradeSuccess$okhttp(@NotNull Response response) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(response, "");
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
        Object obj = null;
        String strHeader$default = Response.header$default(response, "Connection", null, 2, null);
        if (!StringsKt__StringsJVMKt.equals("Upgrade", strHeader$default, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strHeader$default + '\'');
        }
        String strHeader$default2 = Response.header$default(response, "Upgrade", null, 2, null);
        if (!StringsKt__StringsJVMKt.equals("websocket", strHeader$default2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strHeader$default2 + '\'');
        }
        String strHeader$default3 = Response.header$default(response, "Sec-WebSocket-Accept", null, 2, null);
        String strIAuthTabCallback = TTBaseLandingPageActivity.Companion.IAuthTabCallback(this.key + WebSocketProtocol.ACCEPT_MAGIC).IAuthTabCallbackDefault().IAuthTabCallback();
        if (!Intrinsics.areEqual(strIAuthTabCallback, strHeader$default3)) {
            throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strIAuthTabCallback + "' but was '" + strHeader$default3 + '\'');
        }
        int i4 = IAuthTabCallbackStub + 113;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        TTHistoryActivity5 tTHistoryActivity5Socket = response.socket();
        if (tTHistoryActivity5Socket == null) {
            throw new ProtocolException("Web Socket socket missing: bad interceptor?");
        }
        int i6 = IAuthTabCallbackStub + 19;
        int i7 = i6 % 128;
        IAuthTabCallbackDefault = i7;
        if (i6 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i8 = i7 + 5;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 == 0) {
            return tTHistoryActivity5Socket;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0087 A[PHI: r4
      0x0087: PHI (r4v9 byte[] A[IMMUTABLE_TYPE]) = (r4v8 byte[]), (r4v20 byte[]) binds: [B:18:0x0085, B:15:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        byte[] bArr;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j = 0;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43424), ExpandableListView.getPackedPositionGroup(0L) + 42, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                int i6 = $11 + 85;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    bArr = IAuthTabCallback;
                    int i7 = 72 / 0;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i8 = 0;
                        while (i8 < length) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 12843), ExpandableListView.getPackedPositionType(j) + 55, 2167 - View.resolveSizeAndState(0, 0, 0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                                i8++;
                                j = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr = bArr2;
                    }
                    if (bArr == null) {
                        byte[] bArr3 = IAuthTabCallback;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 43424), 42 - Color.red(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    } else {
                        iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    }
                } else {
                    bArr = IAuthTabCallback;
                    if (bArr != null) {
                    }
                    if (bArr == null) {
                    }
                }
            }
            if (iIntValue > 0) {
                int i9 = $10 + 105;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ (-4629411779493505016L))) + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 86, 9567 - View.getDefaultSize(0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = IAuthTabCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i11 = 0;
                    while (i11 < length2) {
                        bArr5[i11] = (byte) (bArr4[i11] ^ (-4629411779493505016L));
                        i11++;
                        int i12 = $11 + 81;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i14 = $10 + 115;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public final void initReaderAndWriter(@NotNull String str, @NotNull BufferedSocket bufferedSocket, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bufferedSocket, "");
        WebSocketExtensions webSocketExtensions = this.extensions;
        Intrinsics.checkNotNull(webSocketExtensions);
        synchronized (this) {
            this.name = str;
            this.socket = bufferedSocket;
            this.writer = new WebSocketWriter(z, bufferedSocket.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(z), this.minimumDeflateSize);
            this.writerTask = new WriterTask();
            long j = this.pingIntervalMillis;
            if (j != 0) {
                final long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                this.taskQueue.schedule(str + " ping", nanos, new Function0() { // from class: okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Long.valueOf(RealWebSocket.$r8$lambda$M3uLbVxgXTEj1BhnKpRA6a_aJpc(this.f$0, nanos));
                    }
                });
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
            Unit unit = Unit.INSTANCE;
        }
        this.reader = new WebSocketReader(z, bufferedSocket.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!z));
    }

    private static final long initReaderAndWriter$lambda$0$0(RealWebSocket realWebSocket, long j) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        realWebSocket.writePingFrame$okhttp();
        int i4 = IAuthTabCallbackStub + 67;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final void loopReader(@NotNull Response response) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(response, "");
        try {
            try {
                this.listener.onOpen(this, response);
                while (this.receivedCloseCode == -1) {
                    int i2 = IAuthTabCallbackStub + 27;
                    IAuthTabCallbackDefault = i2 % 128;
                    int i3 = i2 % 2;
                    WebSocketReader webSocketReader = this.reader;
                    Intrinsics.checkNotNull(webSocketReader);
                    webSocketReader.processNextFrame();
                }
            } catch (Exception e) {
                failWebSocket$default(this, e, null, false, 6, null);
                finishReader();
                int i4 = IAuthTabCallbackStub + 9;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } finally {
            finishReader();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean processNextFrame() throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        IAuthTabCallbackStub = i2 % 128;
        boolean z = false;
        try {
            if (i2 % 2 != 0) {
                WebSocketReader webSocketReader = this.reader;
                Intrinsics.checkNotNull(webSocketReader);
                webSocketReader.processNextFrame();
                int i3 = 41 / 0;
                if (this.receivedCloseCode == -1) {
                    int i4 = IAuthTabCallbackDefault + 57;
                    IAuthTabCallbackStub = i4 % 128;
                    if (i4 % 2 == 0) {
                        z = true;
                    }
                }
            } else {
                WebSocketReader webSocketReader2 = this.reader;
                Intrinsics.checkNotNull(webSocketReader2);
                webSocketReader2.processNextFrame();
                if (this.receivedCloseCode == -1) {
                }
            }
            return z;
        } catch (Exception e) {
            failWebSocket$default(this, e, null, false, 6, null);
            return z;
        }
    }

    public final void finishReader() throws IOException {
        int i;
        String str;
        WebSocketReader webSocketReader;
        boolean z;
        synchronized (this) {
            i = this.receivedCloseCode;
            str = this.receivedCloseReason;
            webSocketReader = this.reader;
            this.reader = null;
            if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                final WebSocketWriter webSocketWriter = this.writer;
                if (webSocketWriter != null) {
                    this.writer = null;
                    TaskQueue.execute$default(this.taskQueue, this.name + " writer close", 0L, false, new Function0() { // from class: okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RealWebSocket.m318$r8$lambda$0T3qT4Eg5PnlD3bXT9nHdqY_Jw(webSocketWriter);
                        }
                    }, 2, null);
                }
                this.taskQueue.shutdown();
            }
            z = (this.failed || this.writer != null || this.receivedCloseCode == -1) ? false : true;
            Unit unit = Unit.INSTANCE;
        }
        if (z) {
            WebSocketListener webSocketListener = this.listener;
            Intrinsics.checkNotNull(str);
            webSocketListener.onClosed(this, i, str);
        }
        if (webSocketReader != null) {
            _UtilCommonKt.closeQuietly(webSocketReader);
        }
    }

    private static final Unit finishReader$lambda$0$0(WebSocketWriter webSocketWriter) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        _UtilCommonKt.closeQuietly(webSocketWriter);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 45;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void tearDown() throws InterruptedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            this.taskQueue.shutdown();
            this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
            int i3 = 88 / 0;
        } else {
            this.taskQueue.shutdown();
            this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
        }
        int i4 = IAuthTabCallbackDefault + 45;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final int sentPingCount() {
        int i;
        synchronized (this) {
            i = this.sentPingCount;
        }
        return i;
    }

    public final int receivedPingCount() {
        int i;
        synchronized (this) {
            i = this.receivedPingCount;
        }
        return i;
    }

    public final int receivedPongCount() {
        int i;
        synchronized (this) {
            i = this.receivedPongCount;
        }
        return i;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@NotNull String str) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.listener.onMessage(this, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.listener.onMessage(this, str);
        int i3 = IAuthTabCallbackStub + 5;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
            this.listener.onMessage(this, tTBaseLandingPageActivity);
        } else {
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
            this.listener.onMessage(this, tTBaseLandingPageActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadPing(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(tTBaseLandingPageActivity);
                runWriter();
                this.receivedPingCount++;
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadPong(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
            this.receivedPongCount++;
            this.awaitingPong = false;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                throw new IllegalStateException("already closed");
            }
            this.receivedCloseCode = i;
            this.receivedCloseReason = str;
            Unit unit = Unit.INSTANCE;
        }
        this.listener.onClosing(this, i, str);
    }

    @Override // okhttp3.WebSocket
    public boolean send(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        boolean zSend = send(TTBaseLandingPageActivity.Companion.IAuthTabCallback(str), 1);
        int i4 = IAuthTabCallbackDefault + 31;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zSend;
    }

    @Override // okhttp3.WebSocket
    public boolean send(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        boolean zSend;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
            zSend = send(tTBaseLandingPageActivity, 5);
        } else {
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
            zSend = send(tTBaseLandingPageActivity, 2);
        }
        int i3 = IAuthTabCallbackDefault + 45;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return zSend;
        }
        throw null;
    }

    private final boolean send(TTBaseLandingPageActivity tTBaseLandingPageActivity, int i) {
        synchronized (this) {
            if (!this.failed && !this.enqueuedClose) {
                if (this.queueSize + tTBaseLandingPageActivity.access100() > MAX_QUEUE_SIZE) {
                    close(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, null);
                    return false;
                }
                this.queueSize += tTBaseLandingPageActivity.access100();
                this.messageAndCloseQueue.add(new Message(i, tTBaseLandingPageActivity));
                runWriter();
                return true;
            }
            return false;
        }
    }

    public final boolean pong(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(tTBaseLandingPageActivity);
                runWriter();
                return true;
            }
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i, @Nullable String str) {
        boolean zClose;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 19;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            zClose = close(i, str, this.webSocketCloseTimeout);
            int i4 = 81 / 0;
        } else {
            zClose = close(i, str, this.webSocketCloseTimeout);
        }
        int i5 = IAuthTabCallbackStub + 105;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return zClose;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean close(int i, @Nullable String str, long j) {
        TTBaseLandingPageActivity tTBaseLandingPageActivityIAuthTabCallback;
        synchronized (this) {
            WebSocketProtocol.INSTANCE.validateCloseCode(i);
            if (str != null) {
                tTBaseLandingPageActivityIAuthTabCallback = TTBaseLandingPageActivity.Companion.IAuthTabCallback(str);
                if (tTBaseLandingPageActivityIAuthTabCallback.access100() > 123) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
                }
            } else {
                tTBaseLandingPageActivityIAuthTabCallback = null;
            }
            if (!this.failed && !this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(i, tTBaseLandingPageActivityIAuthTabCallback, j));
                runWriter();
                return true;
            }
            return false;
        }
    }

    private final void runWriter() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (!(!_UtilJvmKt.assertionsEnabled)) {
            int i4 = IAuthTabCallbackDefault + 13;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            if (!Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
        }
        Task task = this.writerTask;
        if (task != null) {
            TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public final boolean writeOneFrame$okhttp() throws IOException {
        WebSocketWriter webSocketWriter;
        String str;
        synchronized (this) {
            boolean z = false;
            if (this.failed) {
                return false;
            }
            WebSocketWriter webSocketWriter2 = this.writer;
            TTBaseLandingPageActivity tTBaseLandingPageActivityPoll = this.pongQueue.poll();
            int i = -1;
            Message message = 0;
            if (tTBaseLandingPageActivityPoll == null) {
                Object objPoll = this.messageAndCloseQueue.poll();
                if (objPoll instanceof Close) {
                    int i2 = this.receivedCloseCode;
                    str = this.receivedCloseReason;
                    if (i2 != -1) {
                        WebSocketWriter webSocketWriter3 = this.writer;
                        this.writer = null;
                        if (webSocketWriter3 != null && this.reader == null) {
                            z = true;
                        }
                        this.taskQueue.shutdown();
                        message = objPoll;
                        webSocketWriter = webSocketWriter3;
                        i = i2;
                    } else {
                        long cancelAfterCloseMillis = ((Close) objPoll).getCancelAfterCloseMillis();
                        TaskQueue.execute$default(this.taskQueue, this.name + " cancel", TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis), false, new Function0() { // from class: okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RealWebSocket.$r8$lambda$3UeTKdScoteZtprq_bJvU_Ppjpc(this.f$0);
                            }
                        }, 4, null);
                        i = i2;
                        webSocketWriter = null;
                        message = objPoll;
                    }
                } else {
                    if (objPoll == null) {
                        return false;
                    }
                    str = null;
                    message = objPoll;
                    webSocketWriter = null;
                }
            } else {
                webSocketWriter = null;
                str = null;
            }
            Unit unit = Unit.INSTANCE;
            try {
                if (tTBaseLandingPageActivityPoll != null) {
                    Intrinsics.checkNotNull(webSocketWriter2);
                    webSocketWriter2.writePong(tTBaseLandingPageActivityPoll);
                } else if (message instanceof Message) {
                    Intrinsics.checkNotNull(webSocketWriter2);
                    webSocketWriter2.writeMessageFrame(message.getFormatOpcode(), message.getData());
                    synchronized (this) {
                        this.queueSize -= message.getData().access100();
                    }
                } else {
                    if (!(message instanceof Close)) {
                        throw new AssertionError();
                    }
                    Intrinsics.checkNotNull(webSocketWriter2);
                    webSocketWriter2.writeClose(message.getCode(), ((Close) message).getReason());
                    if (z) {
                        WebSocketListener webSocketListener = this.listener;
                        Intrinsics.checkNotNull(str);
                        webSocketListener.onClosed(this, i, str);
                    }
                }
                return true;
            } finally {
                if (webSocketWriter != null) {
                    _UtilCommonKt.closeQuietly(webSocketWriter);
                }
            }
        }
    }

    private static final Unit writeOneFrame$lambda$0$0(RealWebSocket realWebSocket) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            realWebSocket.cancel();
            return Unit.INSTANCE;
        }
        realWebSocket.cancel();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public final void writePingFrame$okhttp() throws IOException {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            WebSocketWriter webSocketWriter = this.writer;
            if (webSocketWriter == null) {
                return;
            }
            int i = this.awaitingPong ? this.sentPingCount : -1;
            this.sentPingCount++;
            this.awaitingPong = true;
            Unit unit = Unit.INSTANCE;
            if (i == -1) {
                try {
                    webSocketWriter.writePing(TTBaseLandingPageActivity.EMPTY);
                    return;
                } catch (IOException e) {
                    failWebSocket$default(this, e, null, true, 2, null);
                    return;
                }
            }
            failWebSocket$default(this, new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i - 1) + " successful ping/pongs)"), null, true, 2, null);
        }
    }

    public static /* synthetic */ void failWebSocket$default(RealWebSocket realWebSocket, Exception exc, Response response, boolean z, int i, Object obj) throws IOException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 15;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 3) != 0) {
            response = null;
        }
        if ((i & 4) != 0) {
            int i5 = i4 + 99;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        realWebSocket.failWebSocket(exc, response, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, okhttp3.internal.ws.WebSocketWriter] */
    public final void failWebSocket(@NotNull Exception exc, @Nullable Response response, boolean z) throws IOException {
        WebSocketWriter webSocketWriter;
        Intrinsics.checkNotNullParameter(exc, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            TTHistoryActivity5 tTHistoryActivity5 = this.socket;
            ?? r2 = this.writer;
            objectRef.element = r2;
            this.writer = null;
            if (!z && r2 != 0) {
                TaskQueue.execute$default(this.taskQueue, this.name + " writer close", 0L, false, new Function0() { // from class: okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RealWebSocket.$r8$lambda$CoyTb8PMxSv5bSlhxaYuHDtmnaQ(objectRef);
                    }
                }, 2, null);
            }
            this.taskQueue.shutdown();
            Unit unit = Unit.INSTANCE;
            try {
                this.listener.onFailure(this, exc, response);
            } finally {
                if (tTHistoryActivity5 != null) {
                    tTHistoryActivity5.cancel();
                }
                if (z && (webSocketWriter = (WebSocketWriter) objectRef.element) != null) {
                    _UtilCommonKt.closeQuietly(webSocketWriter);
                }
            }
        }
    }

    private static final Unit failWebSocket$lambda$0$0(Ref.ObjectRef objectRef) throws IOException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        _UtilCommonKt.closeQuietly((Closeable) objectRef.element);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 65;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class Message {
        private final TTBaseLandingPageActivity data;
        private final int formatOpcode;

        public Message(int i, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) {
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
            this.formatOpcode = i;
            this.data = tTBaseLandingPageActivity;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }

        public final TTBaseLandingPageActivity getData() {
            return this.data;
        }
    }

    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final TTBaseLandingPageActivity reason;

        public Close(int i, @Nullable TTBaseLandingPageActivity tTBaseLandingPageActivity, long j) {
            this.code = i;
            this.reason = tTBaseLandingPageActivity;
            this.cancelAfterCloseMillis = j;
        }

        public final int getCode() {
            return this.code;
        }

        public final TTBaseLandingPageActivity getReason() {
            return this.reason;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }
    }

    final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.access$getName$p(RealWebSocket.this) + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() throws IOException {
            try {
                return RealWebSocket.this.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e) {
                RealWebSocket.failWebSocket$default(RealWebSocket.this, e, null, true, 2, null);
                return -1L;
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        asInterface = 1;
        onExtraCallbackWithResult();
        Companion = new Companion(null);
        ONLY_HTTP1 = CollectionsKt__CollectionsJVMKt.listOf(Protocol.HTTP_1_1);
        int i = asBinder + 55;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = 95412219;
        onExtraCallbackWithResult = -1538795512;
        onExtraCallback = -1297357049;
        IAuthTabCallback = new byte[]{-42, 39, 8};
    }
}
