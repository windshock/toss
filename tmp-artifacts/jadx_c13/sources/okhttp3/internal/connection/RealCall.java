package okhttp3.internal.connection;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.clearRegisters;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Tags;
import okhttp3.internal.TagsKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.url._UrlKt;
import okio.AsyncTimeout;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RealCall implements Call, Cloneable, Lockable {
    private static short[] onNavigationEvent;
    private Object callStackTrace;
    private volatile boolean canceled;
    private final OkHttpClient client;
    private RealConnection connection;
    private final RealConnectionPool connectionPool;
    private final EventListener eventListener;
    private volatile Exchange exchange;
    private ExchangeFinder exchangeFinder;
    private final AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;
    private Exchange interceptorScopedExchange;
    private final Request originalRequest;
    private final CopyOnWriteArrayList<RoutePlanner.Plan> plansToCancel;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    private boolean socketSinkOpen;
    private boolean socketSourceOpen;
    private final AtomicReference<Tags> tags;
    private final AnonymousClass1 timeout;
    private boolean timeoutEarlyExit;
    private static final byte[] $$a = {121, -58, 81, 67};
    private static final int $$b = 211;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onWarmupCompleted = 2106985336;
    private static int onExtraCallbackWithResult = -1538795429;
    private static int onExtraCallback = -1752475243;
    private static byte[] IAuthTabCallback = {-68, 115, -118, -122, 116, -120, 121};

    private static String $$c(byte b, short s, short s2) {
        byte[] bArr = $$a;
        int i = 115 - (s2 * 3);
        int i2 = b * 4;
        int i3 = s + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i = i3 + (-i2);
            i3 = i3;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i2) {
                return new String(bArr2, 0);
            }
            int i5 = i3 + 1;
            i += -bArr[i5];
            i3 = i5;
        }
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [okhttp3.internal.connection.RealCall$timeout$1, okio.Timeout] */
    public RealCall(@NotNull OkHttpClient okHttpClient, @NotNull Request request, boolean z) {
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        Intrinsics.checkNotNullParameter(request, "");
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
        this.connectionPool = okHttpClient.connectionPool().getDelegate$okhttp();
        this.eventListener = okHttpClient.eventListenerFactory().create(this);
        ?? r5 = new AsyncTimeout() { // from class: okhttp3.internal.connection.RealCall.timeout.1
            @Override // okio.AsyncTimeout
            public void timedOut() {
                RealCall.this.cancel();
            }
        };
        r5.timeout(okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = r5;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
        this.plansToCancel = new CopyOnWriteArrayList<>();
        this.tags = new AtomicReference<>(request.getTags$okhttp());
    }

    public static final /* synthetic */ AnonymousClass1 access$getTimeout$p(RealCall realCall) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        AnonymousClass1 anonymousClass1 = realCall.timeout;
        int i5 = i3 + 89;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return anonymousClass1;
    }

    public static final /* synthetic */ String access$toLoggableString(RealCall realCall) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String loggableString = realCall.toLoggableString();
        int i4 = IAuthTabCallbackStub + 105;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return loggableString;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Call callMo311clone = mo311clone();
        int i4 = IAuthTabCallbackStub + 23;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return callMo311clone;
        }
        throw null;
    }

    public final OkHttpClient getClient() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.client;
        }
        throw null;
    }

    public final Request getOriginalRequest() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        Request request = this.originalRequest;
        int i5 = i3 + 25;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return request;
    }

    public final boolean getForWebSocket() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 87;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.forWebSocket;
        int i5 = i2 + 79;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final EventListener getEventListener$okhttp() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        EventListener eventListener = this.eventListener;
        int i5 = i3 + 31;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return eventListener;
    }

    public final RealConnection getConnection() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 89;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        RealConnection realConnection = this.connection;
        int i5 = i2 + 5;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return realConnection;
    }

    public final Exchange getInterceptorScopedExchange$okhttp() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 3;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Exchange exchange = this.interceptorScopedExchange;
        int i4 = i2 + 99;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return exchange;
    }

    public final CopyOnWriteArrayList<RoutePlanner.Plan> getPlansToCancel$okhttp() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        CopyOnWriteArrayList<RoutePlanner.Plan> copyOnWriteArrayList = this.plansToCancel;
        int i4 = i3 + 29;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return copyOnWriteArrayList;
        }
        throw null;
    }

    @Override // okhttp3.Call
    public Timeout timeout() {
        AnonymousClass1 anonymousClass1;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 103;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            anonymousClass1 = this.timeout;
            int i4 = 75 / 0;
        } else {
            anonymousClass1 = this.timeout;
        }
        int i5 = i2 + 39;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return anonymousClass1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // okhttp3.Call
    public <T> T tag(@NotNull KClass<T> kClass) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(kClass, "");
        T t = (T) clearRegisters.onNavigationEvent(kClass).cast(this.tags.get().get(kClass));
        int i4 = IAuthTabCallbackDefault + 57;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return t;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // okhttp3.Call
    public <T> T tag(@NotNull Class<? extends T> cls) {
        T t;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(cls, "");
            t = (T) tag(clearRegisters.IAuthTabCallback(cls));
            int i3 = 69 / 0;
        } else {
            Intrinsics.checkNotNullParameter(cls, "");
            t = (T) tag(clearRegisters.IAuthTabCallback(cls));
        }
        int i4 = IAuthTabCallbackStub + 89;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return t;
    }

    @Override // okhttp3.Call
    public <T> T tag(@NotNull KClass<T> kClass, @NotNull Function0<? extends T> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(function0, "");
        T t = (T) TagsKt.computeIfAbsent(this.tags, kClass, function0);
        int i4 = IAuthTabCallbackStub + 109;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return t;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // okhttp3.Call
    public <T> T tag(@NotNull Class<T> cls, @NotNull Function0<? extends T> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(function0, "");
        T t = (T) TagsKt.computeIfAbsent(this.tags, clearRegisters.IAuthTabCallback(cls), function0);
        int i4 = IAuthTabCallbackStub + 63;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return t;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // okhttp3.Call
    /* renamed from: clone, reason: collision with other method in class */
    public Call mo311clone() {
        int i = 2 % 2;
        RealCall realCall = new RealCall(this.client, this.originalRequest, this.forWebSocket);
        int i2 = IAuthTabCallbackStub + 1;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 82 / 0;
        }
        return realCall;
    }

    @Override // okhttp3.Call
    public Request request() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Request request = this.originalRequest;
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        return request;
    }

    @Override // okhttp3.Call
    public void cancel() {
        int i = 2 % 2;
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            exchange.cancel();
        }
        Iterator<RoutePlanner.Plan> it = this.plansToCancel.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        int i2 = IAuthTabCallbackDefault + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            it.next().mo308cancel();
        }
        this.eventListener.canceled(this);
        int i4 = IAuthTabCallbackStub + 79;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // okhttp3.Call
    public boolean isCanceled() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.canceled;
        int i4 = IAuthTabCallbackStub + 99;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // okhttp3.Call
    public Response execute() {
        int i = 2 % 2;
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        int i2 = IAuthTabCallbackDefault + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        enter();
        callStart();
        try {
            this.client.dispatcher().executed$okhttp(this);
            Response responseWithInterceptorChain$okhttp = getResponseWithInterceptorChain$okhttp();
            this.client.dispatcher().finished$okhttp(this);
            int i4 = IAuthTabCallbackDefault + 17;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 88 / 0;
            }
            return responseWithInterceptorChain$okhttp;
        } catch (Throwable th) {
            this.client.dispatcher().finished$okhttp(this);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        throw new java.lang.IllegalStateException("Already Executed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r4.executed.compareAndSet(false, false) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r4.executed.compareAndSet(false, true) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        callStart();
        r4.client.dispatcher().enqueue$okhttp(new okhttp3.internal.connection.RealCall.AsyncCall(r4, r5));
        r5 = okhttp3.internal.connection.RealCall.IAuthTabCallbackStub + 9;
        okhttp3.internal.connection.RealCall.IAuthTabCallbackDefault = r5 % 128;
        r5 = r5 % 2;
     */
    @Override // okhttp3.Call
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void enqueue(@NotNull Callback callback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(callback, "");
        } else {
            Intrinsics.checkNotNullParameter(callback, "");
        }
    }

    @Override // okhttp3.Call
    public boolean isExecuted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.executed.get();
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return z;
    }

    private final void callStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            this.callStackTrace = Platform.Companion.get().getStackTraceForCloseable("response.body().close()");
            this.eventListener.callStart(this);
            int i3 = IAuthTabCallbackStub + 79;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 87 / 0;
                return;
            }
            return;
        }
        this.callStackTrace = Platform.Companion.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 43424), KeyEvent.getDeadChar(0, 0) + 42, Color.red(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                int i6 = $11 + 7;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                byte[] bArr = IAuthTabCallback;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0)), MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 56, 2167 - View.resolveSize(0, 0), -299036574, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 43425), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 42, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ j)) + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), Color.blue(0) + 86, 9567 - View.MeasureSpec.makeMeasureSpec(0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = IAuthTabCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i9 = 0; i9 < length2; i9++) {
                        bArr5[i9] = (byte) (bArr4[i9] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i10 = $10 + 119;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i12 = $10 + 37;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    if (z) {
                        byte[] bArr6 = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r4] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r4] ^ (-4629411779493505016L))) + s)) ^ b));
                        int i14 = $10 + 53;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final Response getResponseWithInterceptorChain$okhttp() throws IOException {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, this.client.interceptors());
        arrayList.add(new RetryAndFollowUpInterceptor(this.client));
        arrayList.add(new BridgeInterceptor(this.client.cookieJar()));
        arrayList.add(new CacheInterceptor(this.client.cache()));
        arrayList.add(ConnectInterceptor.INSTANCE);
        Object obj = null;
        if (!this.forWebSocket) {
            int i2 = IAuthTabCallbackStub + 53;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, this.client.networkInterceptors());
                obj.hashCode();
                throw null;
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, this.client.networkInterceptors());
        }
        arrayList.add(CallServerInterceptor.INSTANCE);
        boolean z = false;
        try {
            try {
                Response responseProceed = new RealInterceptorChain(this, arrayList, 0, null, this.originalRequest, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis()).proceed(this.originalRequest);
                if (isCanceled()) {
                    _UtilCommonKt.closeQuietly(responseProceed);
                    throw new IOException("Canceled");
                }
                noMoreExchanges$okhttp(null);
                return responseProceed;
            } catch (IOException e) {
                z = true;
                IOException iOExceptionNoMoreExchanges$okhttp = noMoreExchanges$okhttp(e);
                Intrinsics.checkNotNull(iOExceptionNoMoreExchanges$okhttp, "");
                throw iOExceptionNoMoreExchanges$okhttp;
            }
        } catch (Throwable th) {
            if (!z) {
                noMoreExchanges$okhttp(null);
                int i3 = IAuthTabCallbackStub + 19;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
            }
            throw th;
        }
    }

    public final void enterNetworkInterceptorExchange(@NotNull Request request, boolean z, @NotNull RealInterceptorChain realInterceptorChain) {
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(realInterceptorChain, "");
        if (this.interceptorScopedExchange != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.responseBodyOpen) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.requestBodyOpen || this.socketSourceOpen || this.socketSinkOpen) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z) {
            RealRoutePlanner realRoutePlanner = new RealRoutePlanner(this.client.getTaskRunner$okhttp(), this.connectionPool, this.client.readTimeoutMillis(), this.client.writeTimeoutMillis(), realInterceptorChain.getConnectTimeoutMillis$okhttp(), realInterceptorChain.getReadTimeoutMillis$okhttp(), this.client.pingIntervalMillis(), this.client.retryOnConnectionFailure(), this.client.fastFallback(), this.client.address(request.url()), this.client.getRouteDatabase$okhttp(), this, request);
            this.exchangeFinder = this.client.fastFallback() ? new FastFallbackExchangeFinder(realRoutePlanner, this.client.getTaskRunner$okhttp()) : new SequentialExchangeFinder(realRoutePlanner);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void acquireConnectionNoEvents(@NotNull RealConnection realConnection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(realConnection, "");
            int i3 = 75 / 0;
            if (_UtilJvmKt.assertionsEnabled) {
                if (!Thread.holdsLock(realConnection)) {
                    throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(realConnection, "");
            if (_UtilJvmKt.assertionsEnabled) {
            }
        }
        if (this.connection != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.connection = realConnection;
        realConnection.getCalls().add(new CallReference(this, this.callStackTrace));
        int i4 = IAuthTabCallbackDefault + 111;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ IOException messageDone$okhttp$default(RealCall realCall, Exchange exchange, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException, int i, Object obj) {
        boolean z5;
        boolean z6;
        int i2 = 2 % 2;
        boolean z7 = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            int i3 = IAuthTabCallbackDefault + 87;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i & 8) != 0) {
            int i5 = IAuthTabCallbackStub + 109;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            z6 = false;
        } else {
            z6 = z3;
        }
        return realCall.messageDone$okhttp(exchange, z7, z5, z6, (i & 16) != 0 ? false : z4, iOException);
    }

    public final IOException messageDone$okhttp(@NotNull Exchange exchange, boolean z, boolean z2, boolean z3, boolean z4, @Nullable IOException iOException) {
        boolean z5;
        boolean z6;
        Intrinsics.checkNotNullParameter(exchange, "");
        if (Intrinsics.areEqual(exchange, this.exchange)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.requestBodyOpen) {
                            if ((z2 || !this.responseBodyOpen) && ((!z4 || !this.socketSinkOpen) && (!z3 || !this.socketSourceOpen))) {
                                z6 = false;
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                        if (z) {
                            this.requestBodyOpen = false;
                        }
                        if (z2) {
                            this.responseBodyOpen = false;
                        }
                        if (z4) {
                            this.socketSinkOpen = false;
                        }
                        if (z3) {
                            this.socketSourceOpen = false;
                        }
                        boolean z7 = (this.requestBodyOpen || this.responseBodyOpen || this.socketSinkOpen || this.socketSourceOpen) ? false : true;
                        if (z7 && !this.expectMoreExchanges) {
                            z5 = true;
                        }
                        boolean z8 = z7;
                        z6 = z5;
                        z5 = z8;
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (z2) {
                    z6 = false;
                    Unit unit22 = Unit.INSTANCE;
                } else {
                    z6 = false;
                    Unit unit222 = Unit.INSTANCE;
                }
            }
            if (z5) {
                this.exchange = null;
                RealConnection realConnection = this.connection;
                if (realConnection != null) {
                    realConnection.incrementSuccessCount$okhttp();
                }
            }
            if (z6) {
                return callDone(iOException);
            }
        }
        return iOException;
    }

    public final Socket releaseConnectionNoEvents$okhttp() {
        int i = 2 % 2;
        RealConnection realConnection = this.connection;
        Intrinsics.checkNotNull(realConnection);
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List<Reference<RealCall>> calls = realConnection.getCalls();
        Iterator<Reference<RealCall>> it = calls.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (Intrinsics.areEqual(it.next().get(), this)) {
                break;
            }
            int i3 = IAuthTabCallbackDefault + 125;
            IAuthTabCallbackStub = i3 % 128;
            i2 = i3 % 2 != 0 ? i2 + 94 : i2 + 1;
        }
        if (i2 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        int i4 = IAuthTabCallbackStub + 1;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        calls.remove(i2);
        this.connection = null;
        if (calls.isEmpty()) {
            int i6 = IAuthTabCallbackStub + 17;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            realConnection.setIdleAtNs(System.nanoTime());
            if (!(!this.connectionPool.connectionBecameIdle(realConnection))) {
                return realConnection.socket();
            }
        }
        return null;
    }

    private final IOException timeoutExit(IOException iOException) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 89;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            if (!this.timeoutEarlyExit) {
                int i4 = i2 + 101;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    if (exit()) {
                        Object[] objArr = new Object[1];
                        a((short) View.MeasureSpec.getMode(0), (byte) ((Process.myPid() >> 22) - 124), 640560271 - ImageFormat.getBitsPerPixel(0), (-869040425) + (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 84, objArr);
                        InterruptedIOException interruptedIOException = new InterruptedIOException(((String) objArr[0]).intern());
                        if (iOException != null) {
                            int i5 = IAuthTabCallbackDefault + 105;
                            IAuthTabCallbackStub = i5 % 128;
                            if (i5 % 2 != 0) {
                                interruptedIOException.initCause(iOException);
                                obj.hashCode();
                                throw null;
                            }
                            interruptedIOException.initCause(iOException);
                        }
                        return interruptedIOException;
                    }
                } else {
                    exit();
                    throw null;
                }
            }
            return iOException;
        }
        throw null;
    }

    public final void timeoutEarlyExit() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.timeoutEarlyExit) {
            throw new IllegalStateException("Check failed.");
        }
        int i4 = i3 + 25;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        this.timeoutEarlyExit = true;
        exit();
    }

    public final void upgradeToSocket() {
        timeoutEarlyExit();
        synchronized (this) {
            if (this.exchange == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.socketSinkOpen || this.socketSourceOpen) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            if (!this.responseBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            this.responseBodyOpen = false;
            this.socketSinkOpen = true;
            this.socketSourceOpen = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean retryAfterFailure() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Exchange exchange = this.exchange;
        if (exchange == null || !exchange.getHasFailure$okhttp()) {
            return false;
        }
        int i4 = IAuthTabCallbackDefault + 119;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        Intrinsics.checkNotNull(exchangeFinder);
        RoutePlanner routePlanner = exchangeFinder.getRoutePlanner();
        Exchange exchange2 = this.exchange;
        return !(routePlanner.hasNext(exchange2 != null ? exchange2.getConnection$okhttp() : null) ^ true);
    }

    private final String toLoggableString() {
        String str;
        String str2;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        if (!isCanceled()) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            int i2 = IAuthTabCallbackStub + 31;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            str = "canceled ";
        }
        sb.append(str);
        if (this.forWebSocket) {
            int i4 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(redactedUrl$okhttp());
        return sb.toString();
    }

    public final String redactedUrl$okhttp() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String strRedact = this.originalRequest.url().redact();
        int i4 = IAuthTabCallbackStub + 49;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return strRedact;
    }

    public final class AsyncCall implements Runnable {
        private volatile AtomicInteger callsPerHost;
        private final Callback responseCallback;
        final /* synthetic */ RealCall this$0;

        public AsyncCall(@NotNull RealCall realCall, Callback callback) {
            Intrinsics.checkNotNullParameter(callback, "");
            this.this$0 = realCall;
            this.responseCallback = callback;
            this.callsPerHost = new AtomicInteger(0);
        }

        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final void reuseCallsPerHostFrom(@NotNull AsyncCall asyncCall) {
            Intrinsics.checkNotNullParameter(asyncCall, "");
            this.callsPerHost = asyncCall.callsPerHost;
        }

        public final String getHost() {
            return this.this$0.getOriginalRequest().url().host();
        }

        public final Request getRequest() {
            return this.this$0.getOriginalRequest();
        }

        public final RealCall getCall() {
            return this.this$0;
        }

        public final void executeOn(@NotNull ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "");
            _UtilJvmKt.assertLockNotHeld(this.this$0.getClient().dispatcher());
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    failRejected$okhttp(e);
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                }
            } catch (Throwable th) {
                this.this$0.getClient().dispatcher().finished$okhttp(this);
                throw th;
            }
        }

        public static /* synthetic */ void failRejected$okhttp$default(AsyncCall asyncCall, RejectedExecutionException rejectedExecutionException, int i, Object obj) {
            if ((i & 1) != 0) {
                rejectedExecutionException = null;
            }
            asyncCall.failRejected$okhttp(rejectedExecutionException);
        }

        public final void failRejected$okhttp(@Nullable RejectedExecutionException rejectedExecutionException) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
            interruptedIOException.initCause(rejectedExecutionException);
            this.this$0.noMoreExchanges$okhttp(interruptedIOException);
            this.responseCallback.onFailure(this.this$0, interruptedIOException);
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "OkHttp " + this.this$0.redactedUrl$okhttp();
            RealCall realCall = this.this$0;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                RealCall.access$getTimeout$p(realCall).enter();
                boolean z = false;
                try {
                    try {
                    } catch (Throwable th) {
                        realCall.getClient().dispatcher().finished$okhttp(this);
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    this.responseCallback.onResponse(realCall, realCall.getResponseWithInterceptorChain$okhttp());
                } catch (IOException e2) {
                    e = e2;
                    z = true;
                    if (z) {
                        Platform.Companion.get().log("Callback failure for " + RealCall.access$toLoggableString(realCall), 4, e);
                    } else {
                        this.responseCallback.onFailure(realCall, e);
                    }
                    realCall.getClient().dispatcher().finished$okhttp(this);
                } catch (Throwable th3) {
                    th = th3;
                    z = true;
                    realCall.cancel();
                    if (!z) {
                        IOException iOException = new IOException("canceled due to " + th);
                        iOException.initCause(th);
                        this.responseCallback.onFailure(realCall, iOException);
                    }
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                        realCall.getClient().dispatcher().finished$okhttp(this);
                    }
                    throw th;
                }
                realCall.getClient().dispatcher().finished$okhttp(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    public static final class CallReference extends WeakReference<RealCall> {
        private final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(@NotNull RealCall realCall, @Nullable Object obj) {
            super(realCall);
            Intrinsics.checkNotNullParameter(realCall, "");
            this.callStackTrace = obj;
        }

        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    public final Exchange initExchange$okhttp(@NotNull RealInterceptorChain realInterceptorChain) throws IOException {
        Intrinsics.checkNotNullParameter(realInterceptorChain, "");
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            if (this.responseBodyOpen || this.requestBodyOpen || this.socketSourceOpen || this.socketSinkOpen) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.INSTANCE;
        }
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        Intrinsics.checkNotNull(exchangeFinder);
        Exchange exchange = new Exchange(this, this.eventListener, exchangeFinder, exchangeFinder.find().newCodec$okhttp(this.client, realInterceptorChain));
        this.interceptorScopedExchange = exchange;
        this.exchange = exchange;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (this.canceled) {
            throw new IOException("Canceled");
        }
        return exchange;
    }

    public final IOException noMoreExchanges$okhttp(@Nullable IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.expectMoreExchanges) {
                this.expectMoreExchanges = false;
                if (!this.requestBodyOpen && !this.responseBodyOpen && !this.socketSinkOpen && !this.socketSourceOpen) {
                    z = true;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        return z ? callDone(iOException) : iOException;
    }

    private final IOException callDone(IOException iOException) throws Throwable {
        Socket socketReleaseConnectionNoEvents$okhttp;
        boolean z = _UtilJvmKt.assertionsEnabled;
        if (!z || !Thread.holdsLock(this)) {
            RealConnection realConnection = this.connection;
            if (realConnection != null) {
                if (z && Thread.holdsLock(realConnection)) {
                    throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + realConnection);
                }
                synchronized (realConnection) {
                    socketReleaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
                }
                if (this.connection == null) {
                    if (socketReleaseConnectionNoEvents$okhttp != null) {
                        _UtilJvmKt.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
                    }
                    this.eventListener.connectionReleased(this, realConnection);
                    realConnection.getConnectionListener$okhttp().connectionReleased(realConnection, this);
                    if (socketReleaseConnectionNoEvents$okhttp != null) {
                        realConnection.getConnectionListener$okhttp().connectionClosed(realConnection);
                    }
                } else if (socketReleaseConnectionNoEvents$okhttp != null) {
                    throw new IllegalStateException("Check failed.");
                }
            }
            IOException iOExceptionTimeoutExit = timeoutExit(iOException);
            if (iOException != null) {
                EventListener eventListener = this.eventListener;
                Intrinsics.checkNotNull(iOExceptionTimeoutExit);
                eventListener.callFailed(this, iOExceptionTimeoutExit);
                return iOExceptionTimeoutExit;
            }
            this.eventListener.callEnd(this);
            return iOExceptionTimeoutExit;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean z) {
        Exchange exchange;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z && (exchange = this.exchange) != null) {
            exchange.detachWithViolence();
        }
        this.interceptorScopedExchange = null;
    }
}
