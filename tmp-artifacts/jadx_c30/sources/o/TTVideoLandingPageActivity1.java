package o;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TTVideoLandingPageActivity1 implements Closeable {
    private boolean IAuthTabCallback;
    private final Map<String, List<InputStream>> onNavigationEvent;
    private final SeekableByteChannel onWarmupCompleted;

    final class onNavigationEvent extends PAGErrorModel {
        private long IAuthTabCallback;
        private int onExtraCallback;
        private final SeekableByteChannel onExtraCallbackWithResult;
        private final TTRewardVideoActivity7 onNavigationEvent;

        onNavigationEvent(TTRewardVideoActivity7 tTRewardVideoActivity7, SeekableByteChannel seekableByteChannel) throws IOException {
            super(tTRewardVideoActivity7.IAuthTabCallback(), tTRewardVideoActivity7.onWarmupCompleted());
            if (seekableByteChannel.size() - tTRewardVideoActivity7.onNavigationEvent() < tTRewardVideoActivity7.IAuthTabCallback()) {
                throw new IOException("entry size exceeds archive size");
            }
            this.onNavigationEvent = tTRewardVideoActivity7;
            this.onExtraCallbackWithResult = seekableByteChannel;
        }

        @Override // o.PAGErrorModel
        public int onExtraCallbackWithResult(long j, ByteBuffer byteBuffer) throws IOException {
            int iOnWarmupCompleted;
            if (this.IAuthTabCallback >= this.onNavigationEvent.onWarmupCompleted()) {
                return -1;
            }
            if (this.onNavigationEvent.ICustomTabsCallback()) {
                iOnWarmupCompleted = onExtraCallbackWithResult(this.IAuthTabCallback, byteBuffer, byteBuffer.limit());
            } else {
                iOnWarmupCompleted = onWarmupCompleted(j, byteBuffer);
            }
            if (iOnWarmupCompleted == -1) {
                if (byteBuffer.array().length > 0) {
                    throw new IOException("Truncated TAR archive");
                }
                TTVideoLandingPageActivity1.this.onWarmupCompleted(true);
                return iOnWarmupCompleted;
            }
            this.IAuthTabCallback += iOnWarmupCompleted;
            byteBuffer.flip();
            return iOnWarmupCompleted;
        }

        private int onWarmupCompleted(long j, ByteBuffer byteBuffer) throws IOException {
            this.onExtraCallbackWithResult.position(j);
            return this.onExtraCallbackWithResult.read(byteBuffer);
        }

        private int onExtraCallbackWithResult(long j, ByteBuffer byteBuffer, int i) throws IOException {
            List list = (List) TTVideoLandingPageActivity1.this.onNavigationEvent.get(this.onNavigationEvent.onExtraCallback());
            if (list == null || list.isEmpty()) {
                return onWarmupCompleted(this.onNavigationEvent.IAuthTabCallback() + j, byteBuffer);
            }
            if (this.onExtraCallback >= list.size()) {
                return -1;
            }
            byte[] bArr = new byte[i];
            int i2 = ((InputStream) list.get(this.onExtraCallback)).read(bArr);
            if (i2 != -1) {
                byteBuffer.put(bArr, 0, i2);
            }
            if (this.onExtraCallback == list.size() - 1) {
                return i2;
            }
            if (i2 == -1) {
                this.onExtraCallback++;
                return onExtraCallbackWithResult(j, byteBuffer, i);
            }
            if (i2 >= i) {
                return i2;
            }
            this.onExtraCallback++;
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(j + i2, byteBuffer, i - i2);
            return iOnExtraCallbackWithResult == -1 ? i2 : i2 + iOnExtraCallbackWithResult;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.onWarmupCompleted.close();
    }

    public InputStream onWarmupCompleted(TTRewardVideoActivity7 tTRewardVideoActivity7) throws IOException {
        try {
            return new onNavigationEvent(tTRewardVideoActivity7, this.onWarmupCompleted);
        } catch (RuntimeException e) {
            throw new IOException("Corrupted TAR archive. Can't read entry", e);
        }
    }

    protected final void onWarmupCompleted(boolean z) {
        this.IAuthTabCallback = z;
    }
}
