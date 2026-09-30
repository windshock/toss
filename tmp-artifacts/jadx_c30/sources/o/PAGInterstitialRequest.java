package o;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PAGInterstitialRequest implements Closeable {
    private static final long[] onNavigationEvent = new long[64];
    private final ByteOrder IAuthTabCallback;
    private final PAGNativeAd1 onExtraCallback;
    private long onExtraCallbackWithResult;
    private int onWarmupCompleted;

    static {
        for (int i = 1; i <= 63; i++) {
            long[] jArr = onNavigationEvent;
            jArr[i] = (jArr[i - 1] << 1) + 1;
        }
    }

    public PAGInterstitialRequest(InputStream inputStream, ByteOrder byteOrder) {
        this.onExtraCallback = new PAGNativeAd1(inputStream);
        this.IAuthTabCallback = byteOrder;
    }

    public void onExtraCallback() {
        int i = this.onWarmupCompleted % 8;
        if (i > 0) {
            onNavigationEvent(i);
        }
    }

    public long onWarmupCompleted() throws IOException {
        return this.onWarmupCompleted + (this.onExtraCallback.available() << 3);
    }

    public int onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public void onTransact() {
        this.onExtraCallbackWithResult = 0L;
        this.onWarmupCompleted = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.onExtraCallback.close();
    }

    private boolean onExtraCallback(int i) throws IOException {
        while (true) {
            int i2 = this.onWarmupCompleted;
            if (i2 >= i || i2 >= 57) {
                return false;
            }
            long j = this.onExtraCallback.read();
            if (j < 0) {
                return true;
            }
            if (this.IAuthTabCallback == ByteOrder.LITTLE_ENDIAN) {
                this.onExtraCallbackWithResult = (j << this.onWarmupCompleted) | this.onExtraCallbackWithResult;
            } else {
                this.onExtraCallbackWithResult = j | (this.onExtraCallbackWithResult << 8);
            }
            this.onWarmupCompleted += 8;
        }
    }

    public long IAuthTabCallbackStub() {
        return this.onExtraCallback.onExtraCallbackWithResult();
    }

    private long onWarmupCompleted(int i) throws IOException {
        long j;
        int i2 = i - this.onWarmupCompleted;
        int i3 = 8 - i2;
        long j2 = this.onExtraCallback.read();
        if (j2 < 0) {
            return j2;
        }
        if (this.IAuthTabCallback == ByteOrder.LITTLE_ENDIAN) {
            long[] jArr = onNavigationEvent;
            this.onExtraCallbackWithResult = ((jArr[i2] & j2) << this.onWarmupCompleted) | this.onExtraCallbackWithResult;
            j = (j2 >>> i2) & jArr[i3];
        } else {
            long j3 = this.onExtraCallbackWithResult << i2;
            long[] jArr2 = onNavigationEvent;
            this.onExtraCallbackWithResult = j3 | (jArr2[i2] & (j2 >>> i3));
            j = j2 & jArr2[i3];
        }
        long j4 = this.onExtraCallbackWithResult;
        long j5 = onNavigationEvent[i];
        this.onExtraCallbackWithResult = j;
        this.onWarmupCompleted = i3;
        return j4 & j5;
    }

    public long onExtraCallbackWithResult(int i) throws IOException {
        if (i < 0 || i > 63) {
            throw new IOException("count must not be negative or greater than 63");
        }
        if (onExtraCallback(i)) {
            return -1L;
        }
        if (this.onWarmupCompleted < i) {
            return onWarmupCompleted(i);
        }
        return onNavigationEvent(i);
    }

    private long onNavigationEvent(int i) {
        long j;
        if (this.IAuthTabCallback == ByteOrder.LITTLE_ENDIAN) {
            long j2 = this.onExtraCallbackWithResult;
            j = j2 & onNavigationEvent[i];
            this.onExtraCallbackWithResult = j2 >>> i;
        } else {
            j = (this.onExtraCallbackWithResult >> (this.onWarmupCompleted - i)) & onNavigationEvent[i];
        }
        this.onWarmupCompleted -= i;
        return j;
    }
}
