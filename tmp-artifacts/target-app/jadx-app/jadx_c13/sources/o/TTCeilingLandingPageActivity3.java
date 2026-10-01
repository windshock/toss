package o;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTCeilingLandingPageActivity3 extends TTBaseVideoActivity3 {
    private final RandomAccessFile onExtraCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTCeilingLandingPageActivity3(boolean z, @NotNull RandomAccessFile randomAccessFile) {
        super(z);
        Intrinsics.checkNotNullParameter(randomAccessFile, "");
        this.onExtraCallback = randomAccessFile;
    }

    @Override // o.TTBaseVideoActivity3
    protected long IAuthTabCallback() {
        long length;
        synchronized (this) {
            length = this.onExtraCallback.length();
        }
        return length;
    }

    @Override // o.TTBaseVideoActivity3
    protected int onExtraCallback(long j, @NotNull byte[] bArr, int i, int i2) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(bArr, "");
            this.onExtraCallback.seek(j);
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                int i4 = this.onExtraCallback.read(bArr, i, i2 - i3);
                if (i4 != -1) {
                    i3 += i4;
                } else if (i3 == 0) {
                    return -1;
                }
            }
            return i3;
        }
    }

    @Override // o.TTBaseVideoActivity3
    protected void onExtraCallback() {
        synchronized (this) {
            this.onExtraCallback.close();
        }
    }
}
