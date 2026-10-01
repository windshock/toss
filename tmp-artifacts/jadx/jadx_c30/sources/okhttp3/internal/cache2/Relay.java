package okhttp3.internal.cache2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.TTBaseActivity;
import o.TTBaseLandingPageActivity;
import o.TTHistoryActivity42;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.concurrent.Lockable;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class Relay implements Lockable {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final TTBaseLandingPageActivity PREFIX_CLEAN;
    public static final TTBaseLandingPageActivity PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final TTBaseActivity buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final TTBaseLandingPageActivity metadata;
    private int sourceCount;
    private TTHistoryActivity42 upstream;
    private final TTBaseActivity upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, TTHistoryActivity42 tTHistoryActivity42, long j, TTBaseLandingPageActivity tTBaseLandingPageActivity, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(randomAccessFile, tTHistoryActivity42, j, tTBaseLandingPageActivity, j2);
    }

    private Relay(RandomAccessFile randomAccessFile, TTHistoryActivity42 tTHistoryActivity42, long j, TTBaseLandingPageActivity tTBaseLandingPageActivity, long j2) {
        this.file = randomAccessFile;
        this.upstream = tTHistoryActivity42;
        this.upstreamPos = j;
        this.metadata = tTBaseLandingPageActivity;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new TTBaseActivity();
        this.complete = this.upstream == null;
        this.buffer = new TTBaseActivity();
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final void setFile(@Nullable RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final TTHistoryActivity42 getUpstream() {
        return this.upstream;
    }

    public final void setUpstream(@Nullable TTHistoryActivity42 tTHistoryActivity42) {
        this.upstream = tTHistoryActivity42;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final void setUpstreamReader(@Nullable Thread thread) {
        this.upstreamReader = thread;
    }

    public final TTBaseActivity getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final TTBaseActivity getBuffer() {
        return this.buffer;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(TTBaseLandingPageActivity tTBaseLandingPageActivity, long j, long j2) throws IOException {
        TTBaseActivity tTBaseActivity = new TTBaseActivity();
        tTBaseActivity.onWarmupCompleted(tTBaseLandingPageActivity);
        tTBaseActivity.access100(j);
        tTBaseActivity.access100(j2);
        if (tTBaseActivity.ICustomTabsCallbackDefault() != FILE_HEADER_SIZE) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        RandomAccessFile randomAccessFile = this.file;
        Intrinsics.checkNotNull(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        Intrinsics.checkNotNullExpressionValue(channel, BuildConfig.FLAVOR);
        new FileOperator(channel).write(0L, tTBaseActivity, FILE_HEADER_SIZE);
    }

    private final void writeMetadata(long j) throws IOException {
        TTBaseActivity tTBaseActivity = new TTBaseActivity();
        tTBaseActivity.onWarmupCompleted(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        Intrinsics.checkNotNull(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        Intrinsics.checkNotNullExpressionValue(channel, BuildConfig.FLAVOR);
        new FileOperator(channel).write(j + FILE_HEADER_SIZE, tTBaseActivity, this.metadata.access100());
    }

    public final void commit(long j) throws IOException {
        writeMetadata(j);
        RandomAccessFile randomAccessFile = this.file;
        Intrinsics.checkNotNull(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, this.metadata.access100());
        RandomAccessFile randomAccessFile2 = this.file;
        Intrinsics.checkNotNull(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            Unit unit = Unit.INSTANCE;
        }
        TTHistoryActivity42 tTHistoryActivity42 = this.upstream;
        if (tTHistoryActivity42 != null) {
            _UtilCommonKt.closeQuietly(tTHistoryActivity42);
        }
        this.upstream = null;
    }

    public final TTBaseLandingPageActivity metadata() {
        return this.metadata;
    }

    public final TTHistoryActivity42 newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final class RelaySource implements TTHistoryActivity42 {
        private FileOperator fileOperator;
        private long sourcePos;
        private final Timeout timeout = new Timeout();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            Intrinsics.checkNotNull(file);
            FileChannel channel = file.getChannel();
            Intrinsics.checkNotNullExpressionValue(channel, BuildConfig.FLAVOR);
            this.fileOperator = new FileOperator(channel);
        }

        public long read(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException {
            char c;
            Intrinsics.checkNotNullParameter(tTBaseActivity, BuildConfig.FLAVOR);
            if (this.fileOperator == null) {
                throw new IllegalStateException("Check failed.");
            }
            Relay relay = Relay.this;
            synchronized (relay) {
                while (true) {
                    if (this.sourcePos != relay.getUpstreamPos()) {
                        long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().ICustomTabsCallbackDefault();
                        if (this.sourcePos >= upstreamPos) {
                            long jMin = Math.min(j, relay.getUpstreamPos() - this.sourcePos);
                            relay.getBuffer().IAuthTabCallback(tTBaseActivity, this.sourcePos - upstreamPos, jMin);
                            this.sourcePos += jMin;
                            return jMin;
                        }
                        c = 2;
                    } else if (!relay.getComplete()) {
                        if (relay.getUpstreamReader() == null) {
                            relay.setUpstreamReader(Thread.currentThread());
                            c = 1;
                            break;
                        }
                        this.timeout.waitUntilNotified(relay);
                    } else {
                        return -1L;
                    }
                }
                if (c == 2) {
                    long jMin2 = Math.min(j, Relay.this.getUpstreamPos() - this.sourcePos);
                    FileOperator fileOperator = this.fileOperator;
                    Intrinsics.checkNotNull(fileOperator);
                    fileOperator.read(this.sourcePos + Relay.FILE_HEADER_SIZE, tTBaseActivity, jMin2);
                    this.sourcePos += jMin2;
                    return jMin2;
                }
                try {
                    TTHistoryActivity42 upstream = Relay.this.getUpstream();
                    Intrinsics.checkNotNull(upstream);
                    long j2 = upstream.read(Relay.this.getUpstreamBuffer(), Relay.this.getBufferMaxSize());
                    if (j2 == -1) {
                        Relay relay2 = Relay.this;
                        relay2.commit(relay2.getUpstreamPos());
                        Relay relay3 = Relay.this;
                        synchronized (relay3) {
                            relay3.setUpstreamReader(null);
                            Intrinsics.checkNotNull(relay3, BuildConfig.FLAVOR);
                            relay3.notifyAll();
                            Unit unit = Unit.INSTANCE;
                        }
                        return -1L;
                    }
                    long jMin3 = Math.min(j2, j);
                    Relay.this.getUpstreamBuffer().IAuthTabCallback(tTBaseActivity, 0L, jMin3);
                    this.sourcePos += jMin3;
                    FileOperator fileOperator2 = this.fileOperator;
                    Intrinsics.checkNotNull(fileOperator2);
                    fileOperator2.write(Relay.this.getUpstreamPos() + Relay.FILE_HEADER_SIZE, Relay.this.getUpstreamBuffer().onExtraCallback(), j2);
                    Relay relay4 = Relay.this;
                    synchronized (relay4) {
                        relay4.getBuffer().write(relay4.getUpstreamBuffer(), j2);
                        if (relay4.getBuffer().ICustomTabsCallbackDefault() > relay4.getBufferMaxSize()) {
                            relay4.getBuffer().IAuthTabCallbackDefault(relay4.getBuffer().ICustomTabsCallbackDefault() - relay4.getBufferMaxSize());
                        }
                        relay4.setUpstreamPos(relay4.getUpstreamPos() + j2);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    Relay relay5 = Relay.this;
                    synchronized (relay5) {
                        relay5.setUpstreamReader(null);
                        Intrinsics.checkNotNull(relay5, BuildConfig.FLAVOR);
                        relay5.notifyAll();
                    }
                    return jMin3;
                } catch (Throwable th) {
                    Relay relay6 = Relay.this;
                    synchronized (relay6) {
                        relay6.setUpstreamReader(null);
                        Intrinsics.checkNotNull(relay6, BuildConfig.FLAVOR);
                        relay6.notifyAll();
                        Unit unit3 = Unit.INSTANCE;
                        throw th;
                    }
                }
            }
        }

        public Timeout timeout() {
            return this.timeout;
        }

        public void close() throws IOException {
            if (this.fileOperator != null) {
                RandomAccessFile randomAccessFile = null;
                this.fileOperator = null;
                Relay relay = Relay.this;
                synchronized (relay) {
                    relay.setSourceCount(relay.getSourceCount() - 1);
                    if (relay.getSourceCount() == 0) {
                        RandomAccessFile file = relay.getFile();
                        relay.setFile(null);
                        randomAccessFile = file;
                    }
                    Unit unit = Unit.INSTANCE;
                }
                if (randomAccessFile != null) {
                    _UtilCommonKt.closeQuietly(randomAccessFile);
                }
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Relay edit(@NotNull File file, @NotNull TTHistoryActivity42 tTHistoryActivity42, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, long j) throws IOException {
            Intrinsics.checkNotNullParameter(file, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(tTHistoryActivity42, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, BuildConfig.FLAVOR);
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, tTHistoryActivity42, 0L, tTBaseLandingPageActivity, j, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(@NotNull File file) throws IOException {
            Intrinsics.checkNotNullParameter(file, BuildConfig.FLAVOR);
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            Intrinsics.checkNotNullExpressionValue(channel, BuildConfig.FLAVOR);
            FileOperator fileOperator = new FileOperator(channel);
            TTBaseActivity tTBaseActivity = new TTBaseActivity();
            fileOperator.read(0L, tTBaseActivity, Relay.FILE_HEADER_SIZE);
            if (!Intrinsics.areEqual(tTBaseActivity.onNavigationEvent(r1.access100()), Relay.PREFIX_CLEAN)) {
                throw new IOException("unreadable cache file");
            }
            long jOnMessageChannelReady = tTBaseActivity.onMessageChannelReady();
            long jOnMessageChannelReady2 = tTBaseActivity.onMessageChannelReady();
            TTBaseActivity tTBaseActivity2 = new TTBaseActivity();
            fileOperator.read(jOnMessageChannelReady + Relay.FILE_HEADER_SIZE, tTBaseActivity2, jOnMessageChannelReady2);
            return new Relay(randomAccessFile, null, jOnMessageChannelReady, tTBaseActivity2.writeTypedObject(), 0L, null);
        }
    }

    static {
        TTBaseLandingPageActivity.IAuthTabCallback iAuthTabCallback = TTBaseLandingPageActivity.Companion;
        PREFIX_CLEAN = iAuthTabCallback.IAuthTabCallback("OkHttp cache v1\n");
        PREFIX_DIRTY = iAuthTabCallback.IAuthTabCallback("OkHttp DIRTY :(\n");
    }
}
