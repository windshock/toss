package o;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTCeilingLandingPageActivityycx extends TTBaseVideoActivity3 {
    private final FileChannel onExtraCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTCeilingLandingPageActivityycx(boolean z, @NotNull FileChannel fileChannel) {
        super(z);
        Intrinsics.checkNotNullParameter(fileChannel, BuildConfig.FLAVOR);
        this.onExtraCallback = fileChannel;
    }

    protected long IAuthTabCallback() {
        long size;
        synchronized (this) {
            size = this.onExtraCallback.size();
        }
        return size;
    }

    protected int onExtraCallback(long j, @NotNull byte[] bArr, int i, int i2) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(bArr, BuildConfig.FLAVOR);
            this.onExtraCallback.position(j);
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                int i4 = this.onExtraCallback.read(byteBufferWrap);
                if (i4 != -1) {
                    i3 += i4;
                } else if (i3 == 0) {
                    return -1;
                }
            }
            return i3;
        }
    }

    protected void onExtraCallback() {
        synchronized (this) {
            this.onExtraCallback.close();
        }
    }
}
