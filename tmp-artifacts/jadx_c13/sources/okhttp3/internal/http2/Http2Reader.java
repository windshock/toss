package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import o.TTAppOpenAdTransActivity;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import o.TTHistoryActivity42;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http2.Hpack;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Http2Reader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final TTAppOpenAdTransActivity source;

    public interface Handler {
        void ackSettings();

        void alternateService(int i, @NotNull String str, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, @NotNull String str2, int i2, long j);

        void data(boolean z, int i, @NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, int i2) throws IOException;

        void goAway(int i, @NotNull ErrorCode errorCode, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity);

        void headers(boolean z, int i, int i2, @NotNull List<Header> list);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, @NotNull List<Header> list) throws IOException;

        void rstStream(int i, @NotNull ErrorCode errorCode);

        void settings(boolean z, @NotNull Settings settings);

        void windowUpdate(int i, long j);
    }

    public Http2Reader(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity, boolean z) {
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        this.source = tTAppOpenAdTransActivity;
        this.client = z;
        ContinuationSource continuationSource = new ContinuationSource(tTAppOpenAdTransActivity);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    public final void readConnectionPreface(@NotNull Handler handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "");
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        TTAppOpenAdTransActivity tTAppOpenAdTransActivity = this.source;
        TTBaseLandingPageActivity tTBaseLandingPageActivity = Http2.CONNECTION_PREFACE;
        TTBaseLandingPageActivity tTBaseLandingPageActivityOnNavigationEvent = tTAppOpenAdTransActivity.onNavigationEvent(tTBaseLandingPageActivity.access100());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(_UtilJvmKt.format("<< CONNECTION " + tTBaseLandingPageActivityOnNavigationEvent.asInterface(), new Object[0]));
        }
        if (Intrinsics.areEqual(tTBaseLandingPageActivity, tTBaseLandingPageActivityOnNavigationEvent)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + tTBaseLandingPageActivityOnNavigationEvent.IAuthTabCallback_Parcel());
    }

    public final boolean nextFrame(boolean z, @NotNull Handler handler) throws Exception {
        Intrinsics.checkNotNullParameter(handler, "");
        try {
            this.source.IAuthTabCallbackStub(9L);
            int medium = _UtilCommonKt.readMedium(this.source);
            if (medium > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + medium);
            }
            int iAnd = _UtilCommonKt.and(this.source.ICustomTabsCallback(), 255);
            int iAnd2 = _UtilCommonKt.and(this.source.ICustomTabsCallback(), 255);
            int iOnPostMessage = this.source.onPostMessage() & IntCompanionObject.MAX_VALUE;
            if (iAnd != 8) {
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Http2.INSTANCE.frameLog(true, iOnPostMessage, medium, iAnd, iAnd2));
                }
            }
            if (z && iAnd != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + Http2.INSTANCE.formattedType$okhttp(iAnd));
            }
            switch (iAnd) {
                case 0:
                    readData(handler, medium, iAnd2, iOnPostMessage);
                    return true;
                case 1:
                    readHeaders(handler, medium, iAnd2, iOnPostMessage);
                    return true;
                case 2:
                    readPriority(handler, medium, iAnd2, iOnPostMessage);
                    return true;
                case 3:
                    readRstStream(handler, medium, iAnd2, iOnPostMessage);
                    return true;
                case 4:
                    readSettings(handler, medium, iAnd2, iOnPostMessage);
                    return true;
                case 5:
                    readPushPromise(handler, medium, iAnd2, iOnPostMessage);
                    return true;
                case 6:
                    readPing(handler, medium, iAnd2, iOnPostMessage);
                    return true;
                case 7:
                    readGoAway(handler, medium, iAnd2, iOnPostMessage);
                    return true;
                case 8:
                    readWindowUpdate(handler, medium, iAnd2, iOnPostMessage);
                    return true;
                default:
                    this.source.IAuthTabCallbackDefault(medium);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    private final void readHeaders(Handler handler, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = (i2 & 1) != 0;
        int iAnd = (i2 & 8) != 0 ? _UtilCommonKt.and(this.source.ICustomTabsCallback(), 255) : 0;
        if ((i2 & 32) != 0) {
            readPriority(handler, i3);
            i -= 5;
        }
        handler.headers(z, i3, -1, readHeaderBlock(Companion.lengthWithoutPadding(i, i2, iAnd), iAnd, i2, i3));
    }

    private final List<Header> readHeaderBlock(int i, int i2, int i3, int i4) throws IOException {
        this.continuation.setLeft(i);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(i2);
        this.continuation.setFlags(i3);
        this.continuation.setStreamId(i4);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readData(Handler handler, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iAnd = (i2 & 8) != 0 ? _UtilCommonKt.and(this.source.ICustomTabsCallback(), 255) : 0;
        handler.data(z, i3, this.source, Companion.lengthWithoutPadding(i, i2, iAnd));
        this.source.IAuthTabCallbackDefault(iAnd);
    }

    private final void readPriority(Handler handler, int i, int i2, int i3) throws IOException {
        if (i == 5) {
            if (i3 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            readPriority(handler, i3);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i + " != 5");
        }
    }

    private final void readPriority(Handler handler, int i) throws IOException {
        int iOnPostMessage = this.source.onPostMessage();
        handler.priority(i, iOnPostMessage & IntCompanionObject.MAX_VALUE, _UtilCommonKt.and(this.source.ICustomTabsCallback(), 255) + 1, (Integer.MIN_VALUE & iOnPostMessage) != 0);
    }

    private final void readRstStream(Handler handler, int i, int i2, int i3) throws IOException {
        if (i != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i + " != 4");
        }
        if (i3 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int iOnPostMessage = this.source.onPostMessage();
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(iOnPostMessage);
        if (errorCodeFromHttp2 == null) {
            throw new IOException("TYPE_RST_STREAM unexpected error code: " + iOnPostMessage);
        }
        handler.rstStream(i3, errorCodeFromHttp2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void readSettings(Handler handler, int i, int i2, int i3) throws IOException {
        if (i3 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i2 & 1) != 0) {
            if (i != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.ackSettings();
            return;
        }
        if (i % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i);
        }
        Settings settings = new Settings();
        IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, i), 6);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                int iAnd = _UtilCommonKt.and(this.source.onActivityResized(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                int iOnPostMessage = this.source.onPostMessage();
                if (iAnd != 2) {
                    if (iAnd != 4) {
                        if (iAnd == 5 && (iOnPostMessage < 16384 || iOnPostMessage > 16777215)) {
                            break;
                        }
                    } else if (iOnPostMessage < 0) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                    }
                } else if (iOnPostMessage != 0 && iOnPostMessage != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings.set(iAnd, iOnPostMessage);
                if (first == last) {
                    break;
                } else {
                    first += step;
                }
            }
        }
        handler.settings(false, settings);
    }

    private final void readPushPromise(Handler handler, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iAnd = (i2 & 8) != 0 ? _UtilCommonKt.and(this.source.ICustomTabsCallback(), 255) : 0;
        handler.pushPromise(i3, Integer.MAX_VALUE & this.source.onPostMessage(), readHeaderBlock(Companion.lengthWithoutPadding(i - 4, i2, iAnd), iAnd, i2, i3));
    }

    private final void readPing(Handler handler, int i, int i2, int i3) throws IOException {
        if (i != 8) {
            throw new IOException("TYPE_PING length != 8: " + i);
        }
        if (i3 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.ping((i2 & 1) != 0, this.source.onPostMessage(), this.source.onPostMessage());
    }

    private final void readGoAway(Handler handler, int i, int i2, int i3) throws IOException {
        if (i < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i);
        }
        if (i3 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int iOnPostMessage = this.source.onPostMessage();
        int iOnPostMessage2 = this.source.onPostMessage();
        int i4 = i - 8;
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(iOnPostMessage2);
        if (errorCodeFromHttp2 == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + iOnPostMessage2);
        }
        TTBaseLandingPageActivity tTBaseLandingPageActivityOnNavigationEvent = TTBaseLandingPageActivity.EMPTY;
        if (i4 > 0) {
            tTBaseLandingPageActivityOnNavigationEvent = this.source.onNavigationEvent(i4);
        }
        handler.goAway(iOnPostMessage, errorCodeFromHttp2, tTBaseLandingPageActivityOnNavigationEvent);
    }

    private final void readWindowUpdate(Handler handler, int i, int i2, int i3) throws Exception {
        try {
            if (i != 4) {
                throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i);
            }
            long jAnd = _UtilCommonKt.and(this.source.onPostMessage(), 2147483647L);
            if (jAnd == 0) {
                throw new IOException("windowSizeIncrement was 0");
            }
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Http2.INSTANCE.frameLogWindowUpdate(true, i3, i, jAnd));
            }
            handler.windowUpdate(i3, jAnd);
        } catch (Exception e) {
            logger.fine(Http2.INSTANCE.frameLog(true, i3, i, 8, i2));
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public static final class ContinuationSource implements TTHistoryActivity42 {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final TTAppOpenAdTransActivity source;
        private int streamId;

        @Override // o.TTHistoryActivity42, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o.TTHistoryActivity41
        public void close() throws IOException {
        }

        public ContinuationSource(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity) {
            Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
            this.source = tTAppOpenAdTransActivity;
        }

        public final int getLength() {
            return this.length;
        }

        public final void setLength(int i) {
            this.length = i;
        }

        public final int getFlags() {
            return this.flags;
        }

        public final void setFlags(int i) {
            this.flags = i;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        public final void setStreamId(int i) {
            this.streamId = i;
        }

        public final int getLeft() {
            return this.left;
        }

        public final void setLeft(int i) {
            this.left = i;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final void setPadding(int i) {
            this.padding = i;
        }

        @Override // o.TTHistoryActivity42
        public long read(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
            Intrinsics.checkNotNullParameter(tTBaseActivity, "");
            while (true) {
                int i = this.left;
                if (i == 0) {
                    this.source.IAuthTabCallbackDefault(this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) != 0) {
                        return -1L;
                    }
                    readContinuationHeader();
                } else {
                    long j2 = this.source.read(tTBaseActivity, Math.min(j, i));
                    if (j2 == -1) {
                        return -1L;
                    }
                    this.left -= (int) j2;
                    return j2;
                }
            }
        }

        @Override // o.TTHistoryActivity42, o.TTHistoryActivity41
        public Timeout timeout() {
            return this.source.timeout();
        }

        private final void readContinuationHeader() throws IOException {
            int i = this.streamId;
            int medium = _UtilCommonKt.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            int iAnd = _UtilCommonKt.and(this.source.ICustomTabsCallback(), 255);
            this.flags = _UtilCommonKt.and(this.source.ICustomTabsCallback(), 255);
            Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, iAnd, this.flags));
            }
            int iOnPostMessage = this.source.onPostMessage() & IntCompanionObject.MAX_VALUE;
            this.streamId = iOnPostMessage;
            if (iAnd == 9) {
                if (iOnPostMessage != i) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iAnd + " != TYPE_CONTINUATION");
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
        }
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger2, "");
        logger = logger2;
    }
}
