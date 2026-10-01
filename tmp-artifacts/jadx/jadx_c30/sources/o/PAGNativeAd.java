package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PAGNativeAd extends PAGErrorModel {
    private final SeekableByteChannel onExtraCallbackWithResult;

    public PAGNativeAd(long j, long j2, SeekableByteChannel seekableByteChannel) {
        super(j, j2);
        this.onExtraCallbackWithResult = seekableByteChannel;
    }

    @Override // o.PAGErrorModel
    protected int onExtraCallbackWithResult(long j, ByteBuffer byteBuffer) throws IOException {
        int i;
        synchronized (this.onExtraCallbackWithResult) {
            this.onExtraCallbackWithResult.position(j);
            i = this.onExtraCallbackWithResult.read(byteBuffer);
        }
        byteBuffer.flip();
        return i;
    }
}
