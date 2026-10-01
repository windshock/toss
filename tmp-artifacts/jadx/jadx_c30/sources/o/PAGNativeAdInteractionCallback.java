package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PAGNativeAdInteractionCallback implements SeekableByteChannel {
    private static final Path[] onWarmupCompleted = new Path[0];
    private final List<SeekableByteChannel> onExtraCallback;
    private int onExtraCallbackWithResult;
    private long onNavigationEvent;

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Iterator<SeekableByteChannel> it = this.onExtraCallback.iterator();
        IOException iOException = null;
        while (it.hasNext()) {
            try {
                it.next().close();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                }
            }
        }
        if (iOException != null) {
            throw new IOException("failed to close wrapped channel", iOException);
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.onExtraCallback.stream().allMatch(new Predicate() { // from class: org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((SeekableByteChannel) obj).isOpen();
            }
        });
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long position() {
        return this.onNavigationEvent;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public SeekableByteChannel position(long j) throws IOException {
        synchronized (this) {
            if (j < 0) {
                throw new IllegalArgumentException("Negative position: " + j);
            }
            if (!isOpen()) {
                throw new ClosedChannelException();
            }
            this.onNavigationEvent = j;
            int i = 0;
            while (i < this.onExtraCallback.size()) {
                SeekableByteChannel seekableByteChannel = this.onExtraCallback.get(i);
                long size = seekableByteChannel.size();
                long j2 = -1;
                if (j == -1) {
                    j2 = j;
                    j = 0;
                } else if (j <= size) {
                    this.onExtraCallbackWithResult = i;
                } else {
                    j2 = j - size;
                    j = size;
                }
                seekableByteChannel.position(j);
                i++;
                j = j2;
            }
        }
        return this;
    }

    public SeekableByteChannel onNavigationEvent(long j, long j2) throws IOException {
        SeekableByteChannel seekableByteChannelPosition;
        synchronized (this) {
            if (!isOpen()) {
                throw new ClosedChannelException();
            }
            for (int i = 0; i < j; i++) {
                j2 += this.onExtraCallback.get(i).size();
            }
            seekableByteChannelPosition = position(j2);
        }
        return seekableByteChannelPosition;
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        synchronized (this) {
            if (!isOpen()) {
                throw new ClosedChannelException();
            }
            int i = 0;
            if (!byteBuffer.hasRemaining()) {
                return 0;
            }
            while (byteBuffer.hasRemaining() && this.onExtraCallbackWithResult < this.onExtraCallback.size()) {
                SeekableByteChannel seekableByteChannel = this.onExtraCallback.get(this.onExtraCallbackWithResult);
                int i2 = seekableByteChannel.read(byteBuffer);
                if (i2 == -1) {
                    this.onExtraCallbackWithResult++;
                } else {
                    if (seekableByteChannel.position() >= seekableByteChannel.size()) {
                        this.onExtraCallbackWithResult++;
                    }
                    i += i2;
                }
            }
            if (i <= 0) {
                return -1;
            }
            this.onNavigationEvent += i;
            return i;
        }
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long size() throws IOException {
        if (!isOpen()) {
            throw new ClosedChannelException();
        }
        Iterator<SeekableByteChannel> it = this.onExtraCallback.iterator();
        long size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public SeekableByteChannel truncate(long j) {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        throw new NonWritableChannelException();
    }
}
