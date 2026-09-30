package okhttp3.internal.http2;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTHistoryActivity41;
import o.TTHistoryActivity42;
import o.TTHistoryActivity5;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import okhttp3.Headers;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.http2.flowcontrol.WindowCounter;
import okhttp3.internal.url._UrlKt;
import okio.AsyncTimeout;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Http2Stream implements Lockable, TTHistoryActivity5 {
    public static final Companion Companion = new Companion(null);
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;
    private final int id;
    private final WindowCounter readBytes;
    private final StreamTimeout readTimeout;
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout;

    public Http2Stream(int i, @NotNull Http2Connection http2Connection, boolean z, boolean z2, @Nullable Headers headers) {
        Intrinsics.checkNotNullParameter(http2Connection, "");
        this.id = i;
        this.connection = http2Connection;
        this.readBytes = new WindowCounter(i);
        this.writeBytesMaximum = http2Connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(http2Connection.getOkHttpSettings().getInitialWindowSize(), z2);
        this.sink = new FramingSink(z);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers != null) {
            if (isLocallyInitiated()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(headers);
        } else if (!isLocallyInitiated()) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public final int getId() {
        return this.id;
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final WindowCounter getReadBytes() {
        return this.readBytes;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final void setWriteBytesTotal$okhttp(long j) {
        this.writeBytesTotal = j;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
        this.writeBytesMaximum = j;
    }

    @Override // o.TTHistoryActivity5
    public FramingSource getSource() {
        return this.source;
    }

    @Override // o.TTHistoryActivity5
    public FramingSink getSink() {
        return this.sink;
    }

    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final void setErrorCode$okhttp(@Nullable ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final void setErrorException$okhttp(@Nullable IOException iOException) {
        this.errorException = iOException;
    }

    public final class StreamTimeout extends AsyncTimeout {
        private static final byte[] $$a = {35, -27, ByteCompanionObject.MIN_VALUE, 50};
        private static final int $$b = 158;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 0;
        private static int IAuthTabCallbackStub = 1;
        private static long onWarmupCompleted = 7798559133331975163L;
        private static int IAuthTabCallback = -1776194565;
        private static char onExtraCallback = 41383;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i, byte b, byte b2) {
            int i2;
            int i3 = b + 109;
            int i4 = 3 - (i * 2);
            byte[] bArr = $$a;
            int i5 = b2 * 3;
            byte[] bArr2 = new byte[1 - i5];
            int i6 = 0 - i5;
            if (bArr == null) {
                int i7 = i3;
                int i8 = 0;
                int i9 = i4;
                int i10 = i4 + i7;
                i2 = i8;
                int i11 = i9;
                i3 = i10;
                i4 = i11;
                bArr2[i2] = (byte) i3;
                int i12 = i4 + 1;
                if (i2 == i6) {
                    return new String(bArr2, 0);
                }
                int i13 = i3;
                i9 = i12;
                i4 = bArr[i12];
                i8 = i2 + 1;
                i7 = i13;
                int i102 = i4 + i7;
                i2 = i8;
                int i112 = i9;
                i3 = i102;
                i4 = i112;
                bArr2[i2] = (byte) i3;
                int i122 = i4 + 1;
                if (i2 == i6) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i3;
                int i1222 = i4 + 1;
                if (i2 == i6) {
                }
            }
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            int i4 = $10 + 13;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i6 = $11 + Imgproc.COLOR_YUV2RGBA_YVYU;
                $10 = i6 % 128;
                int i7 = i6 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 43 - Gravity.getAbsoluteGravity(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 49123), View.MeasureSpec.getSize(0) + 44, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1493, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 23972), 50 - View.MeasureSpec.getSize(0), View.MeasureSpec.getSize(0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45849 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 29, 12577 - Gravity.getAbsoluteGravity(0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    int i8 = $10 + 23;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArr6);
            int i10 = $10 + 89;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            objArr[0] = str;
        }

        public StreamTimeout() {
        }

        @Override // okio.AsyncTimeout
        public void timedOut() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 13;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                Http2Stream.this.closeLater(ErrorCode.CANCEL);
                Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
                int i3 = asInterface + 41;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
            throw null;
        }

        @Override // okio.AsyncTimeout
        public IOException newTimeoutException(@Nullable IOException iOException) throws Throwable {
            int i = 2 % 2;
            Object[] objArr = new Object[1];
            a((char) (Process.myPid() >> 22), Drawable.resolveOpacity(0, 0) + 1609651040, new char[]{58104, 57583, 6640, 24066, 11997, 26700, 8694}, new char[]{0, 0, 0, 0}, new char[]{24713, 61779, 23647, 43372}, objArr);
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException(((String) objArr[0]).intern());
            if (iOException != null) {
                int i2 = IAuthTabCallbackStub + 71;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                socketTimeoutException.initCause(iOException);
                int i4 = asInterface + 67;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
            }
            return socketTimeoutException;
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 123;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            if (exit()) {
                throw newTimeoutException(null);
            }
            int i4 = asInterface + 41;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 34 / 0;
            }
        }
    }

    public final boolean isLocallyInitiated() {
        return this.connection.getClient$okhttp() == ((this.id & 1) == 1);
    }

    public static /* synthetic */ Headers takeHeaders$default(Http2Stream http2Stream, boolean z, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            z = false;
        }
        return http2Stream.takeHeaders(z);
    }

    public final Timeout readTimeout() {
        return this.readTimeout;
    }

    public final Timeout writeTimeout() {
        return this.writeTimeout;
    }

    public final void close(@NotNull ErrorCode errorCode, @Nullable IOException iOException) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode, "");
        if (closeInternal(errorCode, iOException)) {
            this.connection.writeSynReset$okhttp(this.id, errorCode);
        }
    }

    @Override // o.TTHistoryActivity5
    public void cancel() {
        closeLater(ErrorCode.CANCEL);
    }

    public final void closeLater(@NotNull ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "");
        if (closeInternal(errorCode, null)) {
            this.connection.writeSynResetLater$okhttp(this.id, errorCode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doReadTimeout() {
        return !this.connection.getClient$okhttp() || getSink().getClosed() || getSink().getFinished();
    }

    public final class FramingSource implements TTHistoryActivity42 {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private Headers trailers;
        private final TTBaseActivity receiveBuffer = new TTBaseActivity();
        private final TTBaseActivity readBuffer = new TTBaseActivity();

        public FramingSource(long j, boolean z) {
            this.maxByteCount = j;
            this.finished = z;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        public final void setFinished$okhttp(boolean z) {
            this.finished = z;
        }

        public final TTBaseActivity getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final TTBaseActivity getReadBuffer() {
            return this.readBuffer;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setTrailers(@Nullable Headers headers) {
            this.trailers = headers;
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final void setClosed$okhttp(boolean z) {
            this.closed = z;
        }

        @Override // o.TTHistoryActivity42
        public long read(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
            IOException errorException$okhttp;
            boolean z;
            long j2;
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
            long j3 = 0;
            if (j < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            }
            while (true) {
                Http2Stream http2Stream = Http2Stream.this;
                synchronized (http2Stream) {
                    boolean zDoReadTimeout = http2Stream.doReadTimeout();
                    if (zDoReadTimeout) {
                        http2Stream.getReadTimeout$okhttp().enter();
                    }
                    try {
                        if (http2Stream.getErrorCode$okhttp() == null || this.finished) {
                            errorException$okhttp = null;
                        } else {
                            errorException$okhttp = http2Stream.getErrorException$okhttp();
                            if (errorException$okhttp == null) {
                                ErrorCode errorCode$okhttp = http2Stream.getErrorCode$okhttp();
                                Intrinsics.checkNotNull(errorCode$okhttp);
                                errorException$okhttp = new StreamResetException(errorCode$okhttp);
                            }
                        }
                        if (this.closed) {
                            throw new IOException("stream closed");
                        }
                        if (this.readBuffer.ICustomTabsCallbackDefault() > j3) {
                            TTBaseActivity tTBaseActivity2 = this.readBuffer;
                            j2 = tTBaseActivity2.read(tTBaseActivity, Math.min(j, tTBaseActivity2.ICustomTabsCallbackDefault()));
                            WindowCounter.update$default(http2Stream.getReadBytes(), j2, 0L, 2, null);
                            long unacknowledged = http2Stream.getReadBytes().getUnacknowledged();
                            if (errorException$okhttp == null) {
                                if (unacknowledged >= http2Stream.getConnection().getOkHttpSettings().getInitialWindowSize() / 2) {
                                    http2Stream.getConnection().writeWindowUpdateLater$okhttp(http2Stream.getId(), unacknowledged);
                                    WindowCounter.update$default(http2Stream.getReadBytes(), 0L, unacknowledged, 1, null);
                                }
                                j2 = j2;
                            }
                            z = false;
                        } else {
                            if (this.finished || errorException$okhttp != null) {
                                z = false;
                            } else {
                                http2Stream.waitForIo$okhttp();
                                z = true;
                            }
                            j2 = -1;
                        }
                        Unit unit = Unit.INSTANCE;
                    } finally {
                        if (zDoReadTimeout) {
                            http2Stream.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                        }
                    }
                }
                Http2Stream.this.getConnection().getFlowControlListener$okhttp().receivingStreamWindowChanged(Http2Stream.this.getId(), Http2Stream.this.getReadBytes(), this.readBuffer.ICustomTabsCallbackDefault());
                if (!z) {
                    if (j2 != -1) {
                        return j2;
                    }
                    if (errorException$okhttp == null) {
                        return -1L;
                    }
                    throw errorException$okhttp;
                }
                j3 = 0;
            }
        }

        private final void updateConnectionFlowControl(long j) {
            Http2Stream http2Stream = Http2Stream.this;
            if (!_UtilJvmKt.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(j);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        public final void receive$okhttp(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
            Http2Stream http2Stream = Http2Stream.this;
            if (!_UtilJvmKt.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                long j2 = j;
                while (j2 > 0) {
                    synchronized (Http2Stream.this) {
                        z = this.finished;
                        z2 = true;
                        z3 = this.readBuffer.ICustomTabsCallbackDefault() + j2 > this.maxByteCount;
                        Unit unit = Unit.INSTANCE;
                    }
                    if (z3) {
                        tTAppOpenAdTransActivity.IAuthTabCallbackDefault(j2);
                        Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                        return;
                    }
                    if (z) {
                        tTAppOpenAdTransActivity.IAuthTabCallbackDefault(j2);
                        return;
                    }
                    long j3 = tTAppOpenAdTransActivity.read(this.receiveBuffer, j2);
                    if (j3 == -1) {
                        throw new EOFException();
                    }
                    j2 -= j3;
                    Http2Stream http2Stream2 = Http2Stream.this;
                    synchronized (http2Stream2) {
                        if (this.closed) {
                            this.receiveBuffer.onWarmupCompleted();
                        } else {
                            if (this.readBuffer.ICustomTabsCallbackDefault() != 0) {
                                z2 = false;
                            }
                            this.readBuffer.onExtraCallbackWithResult(this.receiveBuffer);
                            if (z2) {
                                Intrinsics.checkNotNull(http2Stream2, "");
                                http2Stream2.notifyAll();
                            }
                        }
                    }
                }
                updateConnectionFlowControl(j);
                Http2Stream.this.getConnection().getFlowControlListener$okhttp().receivingStreamWindowChanged(Http2Stream.this.getId(), Http2Stream.this.getReadBytes(), this.readBuffer.ICustomTabsCallbackDefault());
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        @Override // o.TTHistoryActivity42, o.TTHistoryActivity41
        public Timeout timeout() {
            return Http2Stream.this.getReadTimeout$okhttp();
        }

        @Override // o.TTHistoryActivity42, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.TTHistoryActivity41
        public void close() throws IOException {
            long jICustomTabsCallbackDefault;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.closed = true;
                jICustomTabsCallbackDefault = this.readBuffer.ICustomTabsCallbackDefault();
                this.readBuffer.onWarmupCompleted();
                Intrinsics.checkNotNull(http2Stream, "");
                http2Stream.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            if (jICustomTabsCallbackDefault > 0) {
                updateConnectionFlowControl(jICustomTabsCallbackDefault);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }
    }

    public final class FramingSink implements TTHistoryActivity41 {
        private boolean closed;
        private boolean finished;
        private final TTBaseActivity sendBuffer;
        private Headers trailers;

        public FramingSink(boolean z) {
            this.finished = z;
            this.sendBuffer = new TTBaseActivity();
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final void setFinished(boolean z) {
            this.finished = z;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setTrailers(@Nullable Headers headers) {
            this.trailers = headers;
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        @Override // o.TTHistoryActivity41
        public void write(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
            Http2Stream http2Stream = Http2Stream.this;
            if (!_UtilJvmKt.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                this.sendBuffer.write(tTBaseActivity, j);
                while (this.sendBuffer.ICustomTabsCallbackDefault() >= Http2Stream.EMIT_BUFFER_SIZE) {
                    emitFrame(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
        }

        private final void emitFrame(boolean z) throws IOException {
            long jMin;
            boolean z2;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.getWriteTimeout$okhttp().enter();
                while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !this.finished && !this.closed && http2Stream.getErrorCode$okhttp() == null) {
                    try {
                        http2Stream.waitForIo$okhttp();
                    } finally {
                        http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                    }
                }
                http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                http2Stream.checkOutNotClosed$okhttp();
                jMin = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.ICustomTabsCallbackDefault());
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + jMin);
                z2 = z && jMin == this.sendBuffer.ICustomTabsCallbackDefault();
                Unit unit = Unit.INSTANCE;
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z2, this.sendBuffer, jMin);
            } finally {
                http2Stream = Http2Stream.this;
            }
        }

        @Override // o.TTHistoryActivity41, java.io.Flushable
        public void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (!_UtilJvmKt.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                Http2Stream http2Stream2 = Http2Stream.this;
                synchronized (http2Stream2) {
                    http2Stream2.checkOutNotClosed$okhttp();
                    Unit unit = Unit.INSTANCE;
                }
                while (this.sendBuffer.ICustomTabsCallbackDefault() > 0) {
                    emitFrame(false);
                    Http2Stream.this.getConnection().flush();
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        @Override // o.TTHistoryActivity41
        public Timeout timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        @Override // o.TTHistoryActivity41, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                if (this.closed) {
                    return;
                }
                boolean z = http2Stream2.getErrorCode$okhttp() == null;
                Unit unit = Unit.INSTANCE;
                if (!Http2Stream.this.getSink().finished) {
                    boolean z2 = this.sendBuffer.ICustomTabsCallbackDefault() > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.ICustomTabsCallbackDefault() > 0) {
                            emitFrame(false);
                        }
                        Http2Connection connection = Http2Stream.this.getConnection();
                        int id = Http2Stream.this.getId();
                        Headers headers = this.trailers;
                        Intrinsics.checkNotNull(headers);
                        connection.writeHeaders$okhttp(id, z, _UtilJvmKt.toHeaderList(headers));
                    } else if (z2) {
                        while (this.sendBuffer.ICustomTabsCallbackDefault() > 0) {
                            emitFrame(true);
                        }
                    } else if (z) {
                        Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                Http2Stream http2Stream3 = Http2Stream.this;
                synchronized (http2Stream3) {
                    this.closed = true;
                    Intrinsics.checkNotNull(http2Stream3, "");
                    http2Stream3.notifyAll();
                    Unit unit2 = Unit.INSTANCE;
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
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

    public final void addBytesToWriteWindow(long j) {
        this.writeBytesMaximum += j;
        if (j > 0) {
            Intrinsics.checkNotNull(this, "");
            notifyAll();
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if (getSink().getClosed()) {
            throw new IOException("stream closed");
        }
        if (getSink().getFinished()) {
            throw new IOException("stream finished");
        }
        if (getErrorCode$okhttp() != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode$okhttp = getErrorCode$okhttp();
            Intrinsics.checkNotNull(errorCode$okhttp);
            throw new StreamResetException(errorCode$okhttp);
        }
    }

    public final ErrorCode getErrorCode$okhttp() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.errorCode;
        }
        return errorCode;
    }

    public final boolean isOpen() {
        synchronized (this) {
            if (getErrorCode$okhttp() != null) {
                return false;
            }
            if ((getSource().getFinished$okhttp() || getSource().getClosed$okhttp()) && (getSink().getFinished() || getSink().getClosed())) {
                if (this.hasResponseHeaders) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isSourceComplete() {
        boolean z;
        synchronized (this) {
            if (getSource().getFinished$okhttp()) {
                z = getSource().getReadBuffer().IAuthTabCallback_Parcel();
            }
        }
        return z;
    }

    public final Headers takeHeaders(boolean z) throws IOException {
        Headers headers;
        synchronized (this) {
            while (this.headersQueue.isEmpty() && getErrorCode$okhttp() == null) {
                boolean z2 = z || doReadTimeout();
                if (z2) {
                    this.readTimeout.enter();
                }
                try {
                    waitForIo$okhttp();
                    if (z2) {
                        this.readTimeout.exitAndThrowIfTimedOut();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        this.readTimeout.exitAndThrowIfTimedOut();
                    }
                    throw th;
                }
            }
            if (!this.headersQueue.isEmpty()) {
                Headers headersRemoveFirst = this.headersQueue.removeFirst();
                Intrinsics.checkNotNullExpressionValue(headersRemoveFirst, "");
                headers = headersRemoveFirst;
            } else {
                IOException iOException = this.errorException;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode errorCode$okhttp = getErrorCode$okhttp();
                Intrinsics.checkNotNull(errorCode$okhttp);
                throw new StreamResetException(errorCode$okhttp);
            }
        }
        return headers;
    }

    public final Headers peekTrailers() throws IOException {
        synchronized (this) {
            if (getSource().getFinished$okhttp() && getSource().getReceiveBuffer().IAuthTabCallback_Parcel() && getSource().getReadBuffer().IAuthTabCallback_Parcel()) {
                Headers trailers = getSource().getTrailers();
                if (trailers == null) {
                    trailers = Headers.EMPTY;
                }
                return trailers;
            }
            if (getErrorCode$okhttp() == null) {
                return null;
            }
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode$okhttp = getErrorCode$okhttp();
            Intrinsics.checkNotNull(errorCode$okhttp);
            throw new StreamResetException(errorCode$okhttp);
        }
    }

    public final void writeHeaders(@NotNull List<Header> list, boolean z, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(list, "");
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (z) {
                getSink().setFinished(true);
                Intrinsics.checkNotNull(this, "");
                notifyAll();
            }
            Unit unit = Unit.INSTANCE;
        }
        if (!z2) {
            synchronized (this) {
                z2 = this.connection.getWriteBytesTotal() >= this.connection.getWriteBytesMaximum();
            }
        }
        this.connection.writeHeaders$okhttp(this.id, z, list);
        if (z2) {
            this.connection.flush();
        }
    }

    public final void enqueueTrailers(@NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "");
        synchronized (this) {
            if (getSink().getFinished()) {
                throw new IllegalStateException("already finished");
            }
            if (headers.size() == 0) {
                throw new IllegalArgumentException("trailers.size() == 0");
            }
            getSink().setTrailers(headers);
            Unit unit = Unit.INSTANCE;
        }
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException iOException) {
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (getErrorCode$okhttp() != null) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = iOException;
            Intrinsics.checkNotNull(this, "");
            notifyAll();
            if (getSource().getFinished$okhttp() && getSink().getFinished()) {
                return false;
            }
            Unit unit = Unit.INSTANCE;
            this.connection.removeStream$okhttp(this.id);
            return true;
        }
    }

    public final void receiveData(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, int i) throws IOException {
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        if (!_UtilJvmKt.assertionsEnabled || !Thread.holdsLock(this)) {
            getSource().receive$okhttp(tTAppOpenAdTransActivity, i);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void receiveHeaders(@NotNull Headers headers, boolean z) {
        boolean zIsOpen;
        Intrinsics.checkNotNullParameter(headers, "");
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (!this.hasResponseHeaders || headers.get(Header.RESPONSE_STATUS_UTF8) != null || headers.get(Header.TARGET_METHOD_UTF8) != null) {
                this.hasResponseHeaders = true;
                this.headersQueue.add(headers);
            } else {
                getSource().setTrailers(headers);
            }
            if (z) {
                getSource().setFinished$okhttp(true);
            }
            zIsOpen = isOpen();
            Intrinsics.checkNotNull(this, "");
            notifyAll();
            Unit unit = Unit.INSTANCE;
        }
        if (zIsOpen) {
            return;
        }
        this.connection.removeStream$okhttp(this.id);
    }

    public final void receiveRstStream(@NotNull ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "");
        synchronized (this) {
            if (getErrorCode$okhttp() == null) {
                this.errorCode = errorCode;
                Intrinsics.checkNotNull(this, "");
                notifyAll();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean z;
        boolean zIsOpen;
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            z = !getSource().getFinished$okhttp() && getSource().getClosed$okhttp() && (getSink().getFinished() || getSink().getClosed());
            zIsOpen = isOpen();
            Unit unit = Unit.INSTANCE;
        }
        if (z) {
            close(ErrorCode.CANCEL, null);
        } else {
            if (zIsOpen) {
                return;
            }
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final void waitForIo$okhttp() throws InterruptedException, InterruptedIOException {
        try {
            Intrinsics.checkNotNull(this, "");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
