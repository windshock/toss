package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdActivity9;
import o.TTBaseActivity;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.http2.Hpack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Http2Writer implements Closeable, Lockable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final TTBaseActivity hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final TTAppOpenAdActivity9 sink;

    public Http2Writer(@NotNull TTAppOpenAdActivity9 tTAppOpenAdActivity9, boolean z) {
        Intrinsics.checkNotNullParameter(tTAppOpenAdActivity9, "");
        this.sink = tTAppOpenAdActivity9;
        this.client = z;
        TTBaseActivity tTBaseActivity = new TTBaseActivity();
        this.hpackBuffer = tTBaseActivity;
        this.maxFrameSize = Http2.INITIAL_MAX_FRAME_SIZE;
        this.hpackWriter = new Hpack.Writer(0, false, tTBaseActivity, 3, null);
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final void dataFrame(int i, int i2, @Nullable TTBaseActivity tTBaseActivity, int i3) throws IOException {
        frameHeader(i, i3, 0, i2);
        if (i3 > 0) {
            TTAppOpenAdActivity9 tTAppOpenAdActivity9 = this.sink;
            Intrinsics.checkNotNull(tTBaseActivity);
            tTAppOpenAdActivity9.write(tTBaseActivity, i3);
        }
    }

    public final void frameHeader(int i, int i2, int i3, int i4) throws IOException {
        if (i3 != 8) {
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Http2.INSTANCE.frameLog(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.maxFrameSize) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i).toString());
        }
        _UtilCommonKt.writeMedium(this.sink, i2);
        this.sink.onExtraCallbackWithResult(i3 & 255);
        this.sink.onExtraCallbackWithResult(i4 & 255);
        this.sink.asBinder(i & IntCompanionObject.MAX_VALUE);
    }

    private final void writeContinuationFrames(int i, long j) throws IOException {
        while (j > 0) {
            long jMin = Math.min(this.maxFrameSize, j);
            j -= jMin;
            frameHeader(i, (int) jMin, 9, j == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, jMin);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void connectionPreface() throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (this.client) {
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(_UtilJvmKt.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.asInterface(), new Object[0]));
                }
                this.sink.onExtraCallback(Http2.CONNECTION_PREFACE);
                this.sink.flush();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void applyAndAckSettings(@NotNull Settings settings) throws IOException {
        Intrinsics.checkNotNullParameter(settings, "");
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void pushPromise(int i, int i2, @NotNull List<Header> list) throws IOException {
        Intrinsics.checkNotNullParameter(list, "");
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.hpackWriter.writeHeaders(list);
            long jICustomTabsCallbackDefault = this.hpackBuffer.ICustomTabsCallbackDefault();
            int iMin = (int) Math.min(this.maxFrameSize - 4, jICustomTabsCallbackDefault);
            long j = iMin;
            frameHeader(i, iMin + 4, 5, jICustomTabsCallbackDefault == j ? 4 : 0);
            this.sink.asBinder(i2 & IntCompanionObject.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j);
            if (jICustomTabsCallbackDefault > j) {
                writeContinuationFrames(i, jICustomTabsCallbackDefault - j);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void flush() throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.sink.flush();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void rstStream(int i, @NotNull ErrorCode errorCode) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode, "");
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            frameHeader(i, 4, 3, 0);
            this.sink.asBinder(errorCode.getHttpCode());
            this.sink.flush();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void data(boolean z, int i, @Nullable TTBaseActivity tTBaseActivity, int i2) throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            dataFrame(i, z ? 1 : 0, tTBaseActivity, i2);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void settings(@NotNull Settings settings) throws IOException {
        Intrinsics.checkNotNullParameter(settings, "");
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            frameHeader(0, settings.size() * 6, 4, 0);
            for (int i = 0; i < 10; i++) {
                if (settings.isSet(i)) {
                    this.sink.IAuthTabCallbackDefault(i);
                    this.sink.asBinder(settings.get(i));
                }
            }
            this.sink.flush();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void ping(boolean z, int i, int i2) throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            frameHeader(0, 8, 6, z ? 1 : 0);
            this.sink.asBinder(i);
            this.sink.asBinder(i2);
            this.sink.flush();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void goAway(int i, @NotNull ErrorCode errorCode, @NotNull byte[] bArr) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            frameHeader(0, bArr.length + 8, 7, 0);
            this.sink.asBinder(i);
            this.sink.asBinder(errorCode.getHttpCode());
            if (bArr.length != 0) {
                this.sink.onExtraCallback(bArr);
            }
            this.sink.flush();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void windowUpdate(int i, long j) throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Http2.INSTANCE.frameLogWindowUpdate(false, i, 4, j));
            }
            frameHeader(i, 4, 8, 0);
            this.sink.asBinder((int) j);
            this.sink.flush();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            this.closed = true;
            this.sink.close();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void headers(boolean z, int i, @NotNull List<Header> list) throws IOException {
        Intrinsics.checkNotNullParameter(list, "");
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.hpackWriter.writeHeaders(list);
            long jICustomTabsCallbackDefault = this.hpackBuffer.ICustomTabsCallbackDefault();
            long jMin = Math.min(this.maxFrameSize, jICustomTabsCallbackDefault);
            int i2 = jICustomTabsCallbackDefault == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            frameHeader(i, (int) jMin, 1, i2);
            this.sink.write(this.hpackBuffer, jMin);
            if (jICustomTabsCallbackDefault > jMin) {
                writeContinuationFrames(i, jICustomTabsCallbackDefault - jMin);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
